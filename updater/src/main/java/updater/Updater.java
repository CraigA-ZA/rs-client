package updater;

import org.objectweb.asm.tree.ClassNode;
import updater.identifiers.Node;
import updater.identifiers.Scene;
import updater.identifiers.Scenery;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.IdentifierSorter;
import updater.utility.NameMapper;
import org.reflections.Reflections;
import za.org.secret.Constants;
import za.org.secret.UtilFunctions;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

public class Updater {
    private static Map<String, ClassNode> classNodeMap;
    public static Map<String, ClassWrapper> classMap;

    static Reflections reflections = new Reflections("updater.identifiers");
    static List<Class<? extends AbstractIdentifier>> sortedIdentifierClasses = IdentifierSorter.sort(reflections.getSubTypesOf(AbstractIdentifier.class).stream().toList());

    static List<AbstractIdentifier> identifiers = sortedIdentifierClasses.stream().map(aClass -> {
        try {
            return aClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }).collect(Collectors.toList());

    public static void main(String[] args) throws IOException {
        //Load the deobbed jar
        classNodeMap = UtilFunctions.loadJarASM(Constants.DEOB_OUTPUT_JAR_PATH);

        classMap = classNodeMap.values().stream().filter(classnode -> UtilFunctions.isObfuscated(classnode.name))
                .collect(Collectors.toMap(classNode -> classNode.name, node -> new ClassWrapper(node)));

        for (AbstractIdentifier identifier : identifiers) {
            identifier.initialize();
            for (ClassWrapper classNode : classMap.values()) {
                identifier.identify(classNode);
            }
            if (AbstractIdentifier.identifiedClasses.get(identifier.getClass().getSimpleName()) == null) {
                System.out.println("\tFUCK. " + identifier.getClass().getSimpleName() + " didn't work.");
            }
        }
        System.out.println("Ran " + identifiers.size() + " identifiers. " + AbstractIdentifier.identifiedClasses.values().stream().filter(classWrapper -> classWrapper != null).collect(Collectors.toList()).size() + " worked successfully");

        List<String> duplicates = AbstractIdentifier.identifiedClasses.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.toList());

        for (String duplicate : duplicates) {
            System.out.println("Error, duplicate class match found: " + duplicate);
            System.exit(0);
        }

//        renameClasses();

//        UtilFunctions.writeJarToDiskASM(classNodeMap);
    }

    private static void renameClasses() {
        Map<String, String> classNameMap = AbstractIdentifier.identifiedClasses.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> entry.getValue().getName(),
                        Map.Entry::getKey
                ));

        NameMapper nameMapper = new NameMapper(classNameMap, new HashMap<>(), new HashMap<>());
        for (ClassNode classNode : classNodeMap.values()) {
            classNodeMap.put(classNode.name, nameMapper.mapNames(classNode));
        }
    }


}
