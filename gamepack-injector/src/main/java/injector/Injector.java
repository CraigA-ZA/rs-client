package injector;

import callbacks.Callbacks;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import injector.callbacks.AbstractCallbackInjector;
import injector.callbacks.RepaintInjector;
import injector.callbacks.OnDrawInjector;
import injector.callbacks.OnTickInjector;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;
import shared.Constants;
import shared.UtilFunctions;
import shared.model.IdClass;
import shared.model.IdField;
import shared.model.IdMethod;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;


public class Injector {
    private static ObjectMapper jsonMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
            .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

    public static Map<String, ClassNode> classNodes = UtilFunctions.loadJarASM(Constants.VANILLA_GAMEPACK_DIR);

    public static List<IdClass> identifiedClasses;

    static Map<String, Number> multipliers;

    static List<AbstractCallbackInjector> enabledInjectors = List.of(new OnTickInjector(), new OnDrawInjector(), new RepaintInjector());

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
            for(IdMethod idMethod: identifiedClass.methods) {
                processInjectionsForMethod(idMethod, identifiedClass);
            }
//            writeInterface(identifiedClass, methodSpecs); be careful using this. it will overwrite all existing files. should probably add a check to see if the file already exists
        }
        injectCallbacksField();

        UtilFunctions.writeJarToDiskASM(classNodes, Constants.INJECTED_JAR_PATH);
    }

    private static void injectCallbacksField() {
        ClassNode clientClass = classNodes.get("client");
        //Add callbacks field
        String callbacksType = Type.getObjectType(Constants.CALLBACKS_PACKAGE + "/" + Callbacks.class.getSimpleName()).getDescriptor();
        clientClass.fields.add(new FieldNode(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC, "callbacks", callbacksType, null, null));


        //Add callbacks getter
        MethodNode getterMethod = new MethodNode(Opcodes.ACC_PUBLIC, "getCallbacks", "()" + callbacksType, null, null);
        InsnList instructions = getterMethod.instructions;
        instructions.add(new FieldInsnNode(Opcodes.GETSTATIC, clientClass.name, "callbacks", callbacksType));
        instructions.add(new InsnNode(Type.getType(callbacksType).getOpcode(Opcodes.IRETURN)));
        clientClass.methods.add(getterMethod);

        //Add callbacks setter
        MethodNode setterMethod = new MethodNode(Opcodes.ACC_PUBLIC, "setCallbacks", "(" + callbacksType + ")V", null, null);
        InsnList setterInstructions = setterMethod.instructions;
        setterInstructions.add(new VarInsnNode(Type.getType(callbacksType).getOpcode(Opcodes.ILOAD), 1));
        setterInstructions.add(new FieldInsnNode(Opcodes.PUTSTATIC, clientClass.name, "callbacks", callbacksType));
        setterInstructions.add(new InsnNode(Opcodes.RETURN));
        clientClass.methods.add(setterMethod);

        injectCallbackInvokes();
    }

    private static void injectCallbackInvokes() {
        for(AbstractCallbackInjector injector: enabledInjectors) {
            injector.run();
        }
    }

    private static void processInjectionsForMethod(IdMethod idMethod, IdClass identifiedClass) {
    }

    private static void writeInterface(IdClass idClass, List<MethodSpec> methodSpecs) {
        TypeSpec interfaceSpec = TypeSpec.interfaceBuilder("RS" + idClass.className)
                .addModifiers(Modifier.PUBLIC)
                .addMethods(methodSpecs)
                .build();

        JavaFile javaFile = JavaFile.builder(Constants.ACCESSOR_PACKAGE, interfaceSpec)
                .build();

        try {
            javaFile.writeTo(Paths.get("client-accessors/src/main/java/new"));
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