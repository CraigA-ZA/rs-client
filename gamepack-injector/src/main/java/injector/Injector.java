package injector;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;
import shared.Constants;
import shared.UtilFunctions;
import shared.model.IdClass;
import shared.model.IdField;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;


public class Injector {
    private static ObjectMapper jsonMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
            .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

    static Map<String, ClassNode> classNodes = UtilFunctions.loadJarASM(Constants.VANILLA_GAMEPACK_DIR);

    static List<IdClass> identifiedClasses;

    static Map<String, Number> multipliers;

    public static void main(String[] args) throws IOException {
        identifiedClasses = jsonMapper.readValue(Constants.NAMES_JSON.toFile(), new TypeReference<>() {
        });
        multipliers = jsonMapper.readValue(Constants.MULTIPLIER_JSON.toFile(), new TypeReference<>() {
        });


        for (IdClass identifiedClass : identifiedClasses) {
            //Add the interface to the classnode
            ClassNode matchingClassNode = classNodes.get(toVanilla(identifiedClass.name));
            matchingClassNode.interfaces.add(Constants.ACCESSOR_PACKAGE + "/RS" + identifiedClass.className);

            //Iterate over every non-static field identified within this identifier class and write a getter for it
            for (IdField idField : identifiedClass.fields) {
                createGetterInGamepack(idField);
            }
//            writeInterface(identifiedClass, methodSpecs); be careful using this. it will overwrite all existing files. should probably add a check to see if the file already exists
        }

        UtilFunctions.writeJarToDiskASM(classNodes, Constants.INJECTED_JAR_PATH);
    }

    private static void writeInterface(IdClass idClass, List<MethodSpec> methodSpecs) {
        TypeSpec interfaceSpec = TypeSpec.interfaceBuilder("RS" + idClass.className)
                .addModifiers(Modifier.PUBLIC)
                .addMethods(methodSpecs)
                .build();

        JavaFile javaFile = JavaFile.builder(Constants.ACCESSOR_PACKAGE, interfaceSpec)
                .build();

        try {
            javaFile.writeTo(Paths.get("client-api/src/main/java"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Generated interface " + idClass.className + ".java");
    }

    private static String toVanilla(String name) {
        return name.equals("client") ? "client" : name.replace("_renamed", "");
    }

    private static void createGetterInGamepack(IdField identifiedField) {
        String methodName = "get" + identifiedField.field.substring(0, 1).toUpperCase() + identifiedField.field.substring(1);

        ClassNode classToWriteTo = classNodes.get(toVanilla(identifiedField.owner));

        String vanillafiedDescriptor = toVanilla(identifiedField.descriptor);
        String vanillafiedFieldName = toVanilla(identifiedField.name);
        String vanillafiedFieldOwner = toVanilla(identifiedField.owner);

        String getterReturnType = identifiedClasses.stream()
                .filter(idClass -> idClass.name.equals(getObjectType(identifiedField.descriptor)))
                .findFirst()
                .map(idClass -> copyDimensions(Type.getObjectType(Constants.ACCESSOR_PACKAGE + "/RS" + idClass.getClassName()), Type.getType(identifiedField.descriptor)).toString())
                .orElse(identifiedField.descriptor);

        MethodNode getterMethod = new MethodNode(Opcodes.ACC_PUBLIC, methodName, "()" + toVanilla(getterReturnType), null, null);
        InsnList instructions = getterMethod.instructions;

        if (!java.lang.reflect.Modifier.isStatic(identifiedField.access)) {
            instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
            instructions.add(new FieldInsnNode(Opcodes.GETFIELD, vanillafiedFieldOwner, vanillafiedFieldName, vanillafiedDescriptor));
        } else {
            classToWriteTo = classNodes.get("client");
            instructions.add(new FieldInsnNode(Opcodes.GETSTATIC, vanillafiedFieldOwner, vanillafiedFieldName, vanillafiedDescriptor));
        }
        //TODO I might have to also check inheritance and stuff here as well??
        if(identifiedField.owner.equals("client") && identifiedField.name.equals("te")) {
            System.out.println("poes");
        }
        String key = identifiedField.owner + "." + identifiedField.name;
        if(multipliers.containsKey(key)) {
            instructions.add(new LdcInsnNode(multipliers.get(key)));
            if(multipliers.get(key) instanceof Integer) {
                instructions.add(new InsnNode(Opcodes.IMUL));
            } else {
                instructions.add(new InsnNode(Opcodes.LMUL));
            }

        }

        instructions.add(new InsnNode(Type.getType(vanillafiedDescriptor).getOpcode(Opcodes.IRETURN)));
        classToWriteTo.methods.add(getterMethod);
    }

    public static String getObjectType(String descriptor) {
        Type type = Type.getType(descriptor);
        while (type.getSort() == Type.ARRAY) {
            type = type.getElementType();
        }
        return type.getClassName();
    }

    public static Type copyDimensions(Type type, Type typeToCopy) {
        if (typeToCopy.getSort() != Type.ARRAY) {
            return type;
        }
        String descriptor = type.getDescriptor();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < typeToCopy.getDimensions(); i++) {
            builder.append('[');
        }
        builder.append(descriptor);
        return Type.getType(builder.toString());
    }
}