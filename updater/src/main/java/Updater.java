import identifiers.*;
import org.objectweb.asm.tree.ClassNode;
import identifiers.AbstractIdentifier;
import org.reflections.Reflections;
import utility.ClassWrapper;
import utility.IdentifierSorter;
import za.org.secret.Constants;
import za.org.secret.UtilFunctions;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Updater {
    private static Map<String, ClassNode> classNodeMap;
    public static Map<String, ClassWrapper> classMap;


    static Reflections reflections = new Reflections("identifiers");
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

    public static void main(String[] args) {
        //TODO I'm pretty sure that while I'm writing this, I'm using a pack that I didn't deob. But thats fine for now


        //Load the deobbed jar
        classNodeMap = UtilFunctions.loadJarASM(Constants.DEOB_OUTPUT_JAR_PATH);

        classMap = classNodeMap.values().stream().filter(classnode -> UtilFunctions.isObfuscated(classnode.name))
                .collect(Collectors.toMap(classNode -> classNode.name, node -> new ClassWrapper(node)));

        for (AbstractIdentifier identifier : identifiers) {
            for (ClassWrapper classNode : classMap.values()) {
//                if(classNode.getName().equals("qy") && identifier.getClass().getSimpleName().equals("Bounds")) {
//                    System.out.println("Yeet");
//                }
                identifier.identify(classNode);
            }
            if (AbstractIdentifier.identifiedClasses.get(identifier.getClass().getSimpleName()) == null) {
                System.out.println("\tFUCK. " + identifier.getClass().getSimpleName() + " didn't work.");
            }
        }
        System.out.println("Ran " + identifiers.size() + " identifiers. " + AbstractIdentifier.identifiedClasses.values().stream().filter(classWrapper -> classWrapper != null).collect(Collectors.toList()).size() + " worked successfully");
    }
}
