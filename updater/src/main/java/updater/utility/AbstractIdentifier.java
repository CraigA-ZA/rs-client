package updater.utility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;
import updater.Updater;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public abstract class AbstractIdentifier {

    public static Map<String, ClassWrapper> identifiedClasses = new HashMap<>();
    public static Map<String, FieldNode> identifiedFields = new HashMap<>();
    public static Map<String, MethodNode> identifiedMethods = new HashMap<>();

    private List<MethodIdentifier> methodIdentifiers;

    private List<FieldIdentifier> fieldIdentifiers;

    private List<FieldInConstructorIdentifier> fieldInConstructorIdentifiers;

    private List<FieldInMethodIdentifier> fieldInMethodIdentifiers;

    public void initialize() {
        methodIdentifiers = Arrays.stream(this.getClass().getDeclaredFields())
                .filter(field -> MethodIdentifier.class.isAssignableFrom(field.getType()))
                .map(field -> {
                    try {
                        MethodIdentifier methodIdentifier = (MethodIdentifier) field.get(this);
                        methodIdentifier.methodName = field.getName();
                        return methodIdentifier;
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }).toList();

        fieldIdentifiers = Arrays.stream(this.getClass().getDeclaredFields())
                .filter(field -> FieldIdentifier.class.isAssignableFrom(field.getType()))
                .map(field -> {
                    try {
                        FieldIdentifier fieldIdentifier = (FieldIdentifier) field.get(this);
                        fieldIdentifier.fieldName = field.getName();
                        return fieldIdentifier;
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }).toList();

        fieldInConstructorIdentifiers = Arrays.stream(this.getClass().getDeclaredFields())
                .filter(field -> FieldInConstructorIdentifier.class.isAssignableFrom(field.getType()))
                .map(field -> {
                    try {
                        FieldInConstructorIdentifier fieldInConstructorIdentifier = (FieldInConstructorIdentifier) field.get(this);
                        fieldInConstructorIdentifier.fieldName = field.getName();
                        return fieldInConstructorIdentifier;
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }).toList();

        fieldInMethodIdentifiers = Arrays.stream(this.getClass().getDeclaredFields())
                .filter(field -> FieldInMethodIdentifier.class.isAssignableFrom(field.getType()))
                .map(field -> {
                    try {
                        FieldInMethodIdentifier fieldInMethodIdentifier = (FieldInMethodIdentifier) field.get(this);
                        fieldInMethodIdentifier.fieldName = field.getName();
                        return fieldInMethodIdentifier;
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }).toList();
    }

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
                            System.out.println("\tFound method: " + methodIdentifier.methodName + " @ " + methodNode.name);
                        }
                    }
                }

                // Iterate through each field identifier and invoke its isMatch method
                for (FieldIdentifier fieldIdentifier : fieldIdentifiers) {
                    for (FieldNode fieldNode : classNode.getFields()) {
                        if (fieldIdentifier.isMatch(new FieldWrapper(fieldNode))) {
//                            identifiedFields.put(fieldNode.getName(), fieldNode);
                            System.out.println("\tFound field: " + fieldIdentifier.fieldName + " @ " + fieldNode.name);
                        }
                    }
                }

                //Iterate through each constructor identifier
                for (FieldInConstructorIdentifier constructorIdentifier : fieldInConstructorIdentifiers) {
                    MethodNode constructor = classNode.getClassNode().methods.stream().filter(methodNode -> methodNode.name.equals("<init>")).toList().stream().findFirst().orElse(null);

                    if (constructor == null) {
                        continue;
                    }
//                    for(AbstractInsnNode instruction: constructor.instructions.toArray()) {
                    List<FieldInsnNode> matchedInstructions = Arrays.stream(constructor.instructions.toArray()).filter(abstractInsnNode -> abstractInsnNode instanceof FieldInsnNode && constructorIdentifier.isMatch((FieldInsnNode) abstractInsnNode)).map(abstractInsnNode -> (FieldInsnNode) abstractInsnNode).collect(Collectors.toList());

                    int position = constructorIdentifier.position >= 0 ? constructorIdentifier.position : matchedInstructions.size() + constructorIdentifier.position;

                    System.out.println("\tFound field: " + constructorIdentifier.fieldName + " @ " + matchedInstructions.get(position).name);
                }

//                for (FieldInMethodIdentifier fieldInMethodIdentifier : fieldInMethodIdentifiers) {
//                    ClassNode classToSearch = Updater.classMap.values().stream().filter(classWrapper -> classWrapper.getName().equals(fieldInMethodIdentifier.className)).findFirst().orElseThrow();
//                    MethodNode method = classToSearch.methods.stream().filter(methodNode -> methodNode.name.equals(fieldInMethodIdentifier.methodName)).toList().stream().findFirst().orElse(null);
//
//                    if (method == null) {
//                        continue;
//                    }
//                    List<FieldInsnNode> matchedInstructions = Arrays.stream(method.instructions.toArray()).filter(abstractInsnNode -> abstractInsnNode instanceof FieldInsnNode && fieldInMethodIdentifier.isMatch((FieldInsnNode) abstractInsnNode)).map(abstractInsnNode -> (FieldInsnNode) abstractInsnNode).collect(Collectors.toList());
//
//                    int position = fieldInMethodIdentifier.position >= 0 ? fieldInMethodIdentifier.position : matchedInstructions.size() + fieldInMethodIdentifier.position;
//
//                    System.out.println("\tFound field: " + fieldInMethodIdentifier.fieldName + " @ " + matchedInstructions.get(position).name);
//                }
            }
        }
    }

    public abstract boolean isMatch(ClassWrapper classNode);

    @AllArgsConstructor
    public abstract class MethodIdentifier {
        public String methodName;

        public abstract boolean isMatch(MethodWrapper methodNode);
    }

    @AllArgsConstructor
    public abstract class FieldIdentifier {

        public String fieldName;

        public abstract boolean isMatch(FieldWrapper fieldNode);
    }

    public abstract class InMethodField {

        public abstract boolean isMatch(FieldWrapper fieldNode);
    }

    public abstract class MethodInvokedInConstructor {
        public abstract boolean isMatch(MethodWrapper methodNode);
    }

    @Setter
    @AllArgsConstructor
    public abstract class FieldInConstructorIdentifier {
        public int position;
        public String fieldName;

        public abstract boolean isMatch(FieldInsnNode instruction);
    }

    @Setter
    @AllArgsConstructor
    public abstract class FieldInMethodIdentifier {
        public int position;
        public String fieldName;

        public String className;
        public String methodName;

        public abstract boolean isMatch(FieldInsnNode instruction);
    }

    public MethodIdentifier methodIdentifier(java.util.function.Function<MethodWrapper, Boolean> isMatch) {
        return new MethodIdentifier("") {
            @Override
            public boolean isMatch(MethodWrapper methodWrapper) {
                return isMatch.apply(methodWrapper);
            }
        };
    }

    public FieldIdentifier fieldIdentifier(java.util.function.Function<FieldWrapper, Boolean> isMatch) {
        return new FieldIdentifier("") {
            @Override
            public boolean isMatch(FieldWrapper fieldNode) {
                return isMatch.apply(fieldNode);
            }
        };
    }

    public FieldInConstructorIdentifier fieldInConstructorId(int position, java.util.function.Function<FieldInsnNode, Boolean> isMatch) {
        return new FieldInConstructorIdentifier(position, "") {
            @Override
            public boolean isMatch(FieldInsnNode instruction) {
                return isMatch.apply(instruction);
            }
        };
    }

    public FieldInMethodIdentifier fieldInMethodIdentifier(String className, String methodName, int position, java.util.function.Function<FieldInsnNode, Boolean> isMatch) {
        return new FieldInMethodIdentifier(position, "", className, methodName) {
            @Override
            public boolean isMatch(FieldInsnNode instruction) {
                return isMatch.apply(instruction);
            }
        };
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
}
