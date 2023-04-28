package injector;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.javapoet.JavaFile;
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

    public static void main(String[] args) throws IOException {
        List<IdClass> classes = jsonMapper.readValue(Constants.NAMES_JSON.toFile(), new TypeReference<>() {
        });
        Map<String, ClassNode> classNodes = UtilFunctions.loadJarASM(Constants.VANILLA_GAMEPACK_DIR);

        for (IdClass idClass : classes) {
            ClassNode classNode = classNodes.values().stream().filter(it -> it.name.equals(toVanilla(idClass.name))).findFirst().orElseThrow(() -> new RuntimeException("Class not found"));

            writeInterface(idClass);
            classNode.interfaces.add(Constants.ACCESSOR_PACKAGE + "." + idClass.className);
            for (IdField idField : idClass.fields) {
                createGetter(classNode, idClass, idField);
            }
        }

        UtilFunctions.writeJarToDiskASM(classNodes, Constants.INJECTED_JAR_PATH);
    }

    private static void writeInterface(IdClass idClass) {
        TypeSpec interfaceSpec = TypeSpec.interfaceBuilder(idClass.className)
                .addModifiers(Modifier.PUBLIC)
                .build();

        JavaFile javaFile = JavaFile.builder(Constants.ACCESSOR_PACKAGE, interfaceSpec)
                .build();

        try {
            javaFile.writeTo(Paths.get("client-api/src/"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Generated interface " + idClass.className + ".java");
    }

    private static String toVanilla(String name) {
        return name.equals("Client") ? "client" : name.substring(0, 2);
    }

    private static void createGetter(ClassNode classNode, IdClass idClass, IdField idField) {

        if (!java.lang.reflect.Modifier.isStatic(idField.access)) {
            String methodName = "get" + idField.field.substring(0, 1).toUpperCase() + idField.field.substring(1);

            MethodNode getterMethod = new MethodNode(Opcodes.ACC_PUBLIC, methodName, "()" + idField.descriptor, null, null);
            InsnList instructions = getterMethod.instructions;
            instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
            instructions.add(new FieldInsnNode(Opcodes.GETFIELD, classNode.name, idField.name, idField.descriptor));
            instructions.add(new InsnNode(Type.getType(idField.descriptor).getOpcode(Opcodes.IRETURN)));
            classNode.methods.add(getterMethod);
        }
    }
}