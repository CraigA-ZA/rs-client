package updater.utility;

import lombok.Getter;
import lombok.Setter;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public abstract class AbstractIdentifier {

    public static Map<String, ClassWrapper> identifiedClasses = new HashMap<>();
    public static Map<String, FieldNode> identifiedFields = new HashMap<>();
    public static Map<String, MethodNode> identifiedMethods = new HashMap<>();

    private List<MethodIdentifier> methodIdentifiers = Arrays.stream(this.getClass().getDeclaredClasses())
            .filter(MethodIdentifier.class::isAssignableFrom)
            .map(declaredClass -> {
                try {
                    return (MethodIdentifier) declaredClass.getDeclaredConstructor(this.getClass()).newInstance(AbstractIdentifier.this);
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                         NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            })
            .toList();

    private List<FieldIdentifier> fieldIdentifiers = Arrays.stream(this.getClass().getDeclaredClasses())
            .filter(FieldIdentifier.class::isAssignableFrom)
            .map(declaredClass -> {
                try {
                    return (FieldIdentifier) declaredClass.getDeclaredConstructor(this.getClass()).newInstance(AbstractIdentifier.this);
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                         NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            })
            .toList();

//    private List<FieldInConstructorIdentifier> constructorIdentifiers = Arrays.stream(this.getClass().getDeclaredFields())
//            .filter(field -> field.getType() == FieldInConstructorIdentifier.class)
//            .map(field -> {
//                try {
//                    return (FieldInConstructorIdentifier) field.get(this);
//                } catch (IllegalAccessException e) {
//                    throw new RuntimeException(e);
//                }
//            }).toList();

    private List<FieldInConstructorIdentifier> constructorIdentifiers = Arrays.stream(this.getClass().getDeclaredClasses())
            .filter(FieldInConstructorIdentifier.class::isAssignableFrom)
            .map(declaredClass -> {
                try {
                    return (FieldInConstructorIdentifier) declaredClass.getDeclaredConstructor(this.getClass()).newInstance(AbstractIdentifier.this);
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                         NoSuchMethodException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }).toList();


    public void identify(ClassWrapper classNode) {
        //Check if class matches
        if (isMatch(classNode)) {

            //Check if its a duplicate or not
            if (identifiedClasses.containsKey(this.getClass().getSimpleName())) {
                identifiedClasses.put(this.getClass().getSimpleName(), null);
                System.out.println(this.getClass().getSimpleName() + " hit a duplicate." + classNode.getName());
            } else {
                //If not a duplicate (yet), try to identify fields and methods
                identifiedClasses.put(this.getClass().getSimpleName(), classNode);
                System.out.println("Found: " + this.getClass().getSimpleName() + " @ " + classNode.getName());

                // Iterate through each method identifier and invoke its isMatch method
                for (MethodIdentifier methodIdentifier : methodIdentifiers) {
                    for (MethodNode methodNode : classNode.getMethods()) {
                        if (methodIdentifier.isMatch(new MethodWrapper(methodNode))) {
//                            identifiedMethods.put(methodNode.getName(), methodNode);
                            System.out.println("\tFound method: " + methodIdentifier.getClass().getSimpleName() + " @ " + methodNode.name);
                        }
                    }
                }

                // Iterate through each field identifier and invoke its isMatch method
                for (FieldIdentifier fieldIdentifier : fieldIdentifiers) {
                    for (FieldNode fieldNode : classNode.getFields()) {
                        if (fieldIdentifier.isMatch(new FieldWrapper(fieldNode))) {
//                            identifiedFields.put(fieldNode.getName(), fieldNode);
                            System.out.println("\tFound field: " + fieldIdentifier.getClass().getSimpleName() + " @ " + fieldNode.name);
                        }
                    }
                }

                //Iterate through each constructor identifier
                for (FieldInConstructorIdentifier constructorIdentifier : constructorIdentifiers) {
                    MethodNode constructor = classNode.getClassNode().methods.stream().filter(methodNode -> methodNode.name.equals("<init>")).collect(Collectors.toList()).stream().findFirst().orElse(null);

                    if (constructor == null) {
                        continue;
                    }
//                    for(AbstractInsnNode instruction: constructor.instructions.toArray()) {
                    List<FieldInsnNode> matchedInstructions = Arrays.stream(constructor.instructions.toArray()).filter(abstractInsnNode -> abstractInsnNode instanceof FieldInsnNode && constructorIdentifier.isMatch((FieldInsnNode) abstractInsnNode)).map(abstractInsnNode -> (FieldInsnNode) abstractInsnNode).collect(Collectors.toList());

                    int position = constructorIdentifier.position >= 0 ? constructorIdentifier.position : matchedInstructions.size() + constructorIdentifier.position;

                    System.out.println("\tFound field: " + constructorIdentifier.getClass().getSimpleName() + " @ " + matchedInstructions.get(position).name);
                }
            }
        }
    }

    public abstract boolean isMatch(ClassWrapper classNode);

    public abstract class MethodIdentifier {
        public abstract boolean isMatch(MethodWrapper methodNode);
    }

    public abstract class FieldIdentifier {

        public abstract boolean isMatch(FieldWrapper fieldNode);
    }

    public abstract class InMethodField {

        public abstract boolean isMatch(FieldWrapper fieldNode);
    }

    @Setter
    public abstract class FieldInConstructorIdentifier {
        public int position;

        public FieldInConstructorIdentifier(int position) {
            this.position = position;
        }

        public abstract boolean isMatch(FieldInsnNode instruction);
    }

    public abstract class MethodInvokedInConstructor {
        public abstract boolean isMatch(MethodWrapper methodNode);
    }

    public static <T> boolean startsWith(List<T> list, List<T> sublist) {
        if (list == null || sublist == null || sublist.size() > list.size()) {
            return false;
        }
        for (int i = 0; i < sublist.size(); i++) {
            if (!Objects.equals(list.get(i), sublist.get(i))) {
                return false;
            }
        }
        return true;
    }

    public FieldInConstructorIdentifier fieldInConstructorId(int position, java.util.function.Function<FieldInsnNode, Boolean> isMatch) {
        return new FieldInConstructorIdentifier(position) {
            @Override
            public boolean isMatch(FieldInsnNode instruction) {
                return isMatch.apply(instruction);
            }
        };
    }
}
