package updater;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.objectweb.asm.tree.ClassNode;
import updater.model.ClassHierarchyBuilder;
import updater.model.IdClass;
import za.org.secret.Constants;
import za.org.secret.UtilFunctions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Updater {
    private static Map<String, ClassNode> classNodeMap;

    private static Path namesJson = Paths.get(System.getProperty("user.dir"), "gamepack", "names.json");

    private static ObjectMapper jsonMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
            .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

    private static ClassHierarchyBuilder builder;

    public static void main(String[] args) throws IOException {
        //Load the deobbed jar
        classNodeMap = UtilFunctions.loadJarASM(Constants.DEOB_OUTPUT_JAR_PATH);
        builder = new ClassHierarchyBuilder(classNodeMap.values().stream().toList());

        renameClasses();

//        ClassNode classNode = builder.getClassNode(className);
//        ClassNode parentClassNode = builder.getParentClassNode(classNode);
//        Set<ClassNode> childClassNodes = builder.getChildClassNodes(classNode);

        UtilFunctions.writeJarToDiskASM(classNodeMap);
    }

    private static void renameClasses() throws IOException {
        List<IdClass> classes = jsonMapper.readValue(namesJson.toFile(), new TypeReference<>(){});

        NameMapper nameMapper = new NameMapper(classes, builder);

        for (ClassNode classNode : classNodeMap.values()) {
            ClassNode remap = nameMapper.remap(classNode);
            classNodeMap.put(classNode.name, remap);
        }
    }
}