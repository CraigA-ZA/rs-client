package updater;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.val;
import org.objectweb.asm.tree.ClassNode;
import updater.model.IdClass;
import updater.model.IdClassList;
import za.org.secret.Constants;
import za.org.secret.UtilFunctions;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Updater {
    private static Map<String, ClassNode> classNodeMap;

    private static Path namesJson = Paths.get(System.getProperty("user.dir"), "gamepack", "names.json");

    private static ObjectMapper jsonMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
            .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

    public static void main(String[] args) throws IOException {
        //Load the deobbed jar
        classNodeMap = UtilFunctions.loadJarASM(Constants.DEOB_OUTPUT_JAR_PATH);

        renameClasses();

        UtilFunctions.writeJarToDiskASM(classNodeMap);
    }

    private static void renameClasses() throws IOException {
        List<IdClass> classes = jsonMapper.readValue(namesJson.toFile(), new TypeReference<>(){});
        System.out.println(classes);

        NewNameMapper newNameMapper = new NewNameMapper(classes);

        for (ClassNode classNode : classNodeMap.values()) {
//            IdClass newNames = classes.stream().filter(idClass -> idClass.name.equals(classNode.name)).findFirst().orElseThrow(() -> new RuntimeException("Class not found"));
//            NameMapper nameMapper = new NameMapper(newNames);
//            ClassNode remappedClass = new NewNameMapper().remap(classNode);
//            System.out.println(remappedClass);
            if(classNode.name.equals("ni")) {
                System.out.println("poes");
            }
            ClassNode remap = newNameMapper.remap(classNode);

            classNodeMap.put(classNode.name, remap);
        }
    }
}