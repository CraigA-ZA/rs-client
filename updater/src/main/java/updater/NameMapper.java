package updater;

import kotlin.Pair;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.ClassNode;
import updater.model.ClassHierarchyBuilder;
import updater.model.IdClass;
import za.org.secret.UtilFunctions;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NameMapper {

    List<IdClass> classes;

    //Map<OriginalClass, NewClass>
    private Map<String, String> classMap;

    //Map<Pair<OriginalClass, OriginalMethodName+Descriptor>, NewMethodName>
    private Map<Pair<String, String>, String> methodMap;

    //Map<Pair<OriginalClass, OriginalFieldName>, NewFieldName>
    private Map<Pair<String, String>, String> fieldMap;

    ClassHierarchyBuilder builder;

    public NameMapper(List<IdClass> classes, ClassHierarchyBuilder builder) {
        this.classes = classes;
        this.builder = builder;

        classMap = classes.stream().collect(Collectors.toMap(IdClass::getName, IdClass::getClassName));

        methodMap = classes.stream().flatMap(idClass -> idClass.methods.stream()).toList().stream().collect(Collectors.toMap(idMethod -> new Pair(idMethod.owner, idMethod.name + idMethod.descriptor), idMethod -> idMethod.method));

        fieldMap = classes.stream().flatMap(idClass -> idClass.fields.stream()).toList().stream().collect(Collectors.toMap(idField -> new Pair(idField.owner, idField.name + idField.descriptor), idField -> idField.field));
    }

    public ClassNode remap(ClassNode classToRename) {
        ClassNode remappedClass = new ClassNode();
        ClassVisitor remapper = new ClassRemapper(remappedClass, new RSClientRemapper());
        classToRename.accept(remapper);
        return remappedClass;
    }

    class RSClientRemapper extends Remapper {

        @Override
        public String map(String typeName) {
            return classMap.getOrDefault(typeName, typeName);
        }

        @Override
        public String mapFieldName(String owner, String name, String descriptor) {
            if (!UtilFunctions.isObfuscated(owner)) {
                return name;
            }

            String newName = getNewFieldNameFromHierarchy(owner, name, descriptor, new HashSet<>());
            return newName != null ? newName : name;
        }

        private String getNewFieldNameFromHierarchy(String owner, String name, String descriptor, HashSet<String> visitedNodes) {
            if (!UtilFunctions.isObfuscated(owner)) {
                return null;
            }

            // Check if this class has a mapping in the file
            if (hasNewFieldName(owner, name, descriptor)) {
                return fieldMap.get(new Pair(owner, name + descriptor));
            }

            // Search in all parent classes
            String parentName = builder.getClassNode(owner).superName;
            while (UtilFunctions.isObfuscated(parentName) && parentName != null) {
                if (hasNewFieldName(parentName, name, descriptor)) {
                    return fieldMap.get(new Pair(parentName, name + descriptor));
                }

                //If the parent of this class actually has a field with a matching name, then we can check the children too. But otherwise we cant assume that siblings remapped names will apply to this node as well.
                ClassNode thisParentNode = builder.getClassNode(parentName);
                if(thisParentNode.fields.stream().anyMatch(fieldNode -> fieldNode.name.equals(name) && fieldNode.desc.equals(descriptor))) {

                    // Search in all child classes of the parent class
                    Set<ClassNode> children = builder.getChildClassNodes(thisParentNode);
                    for (ClassNode child : children) {
                        if (hasNewFieldName(child.name, name, descriptor)) {
                            return fieldMap.get(new Pair(child.name, name + descriptor));
                        }
                        if (!visitedNodes.contains(child.name)) {
                            visitedNodes.add(child.name);
                            String childNewName = getNewFieldNameFromHierarchy(child.name, name, descriptor, visitedNodes);
                            if (childNewName != null) {
                                return childNewName;
                            }
                        }
                    }
                }

                parentName = builder.getClassNode(parentName).superName;
            }

            // Search in all child classes
            Set<ClassNode> children = builder.getChildClassNodes(builder.getClassNode(owner));
            for (ClassNode child : children) {
                if (hasNewFieldName(child.name, name, descriptor)) {
                    return fieldMap.get(new Pair(child.name, name + descriptor));
                }
                if (!visitedNodes.contains(child.name)) {
                    visitedNodes.add(child.name);
                    String childNewName = getNewFieldNameFromHierarchy(child.name, name, descriptor, visitedNodes);
                    if (childNewName != null) {
                        return childNewName;
                    }
                }
            }

            return null;
        }

        @Override
        public String mapMethodName(String owner, String name, String descriptor) {
            if (!UtilFunctions.isObfuscated(owner)) {
                return name;
            }

            String newName = getNewMethodNameFromHierarchy(owner, name, descriptor, new HashSet<>());
            return newName != null ? newName : name;
        }

        private String getNewMethodNameFromHierarchy(String owner, String name, String descriptor, Set<String> visitedNodes) {
            if (!UtilFunctions.isObfuscated(owner)) {
                return null;
            }

            // Check if this class has a mapping in the file
            if (hasNewName(owner, name, descriptor)) {
                return methodMap.get(new Pair(owner, name + descriptor));
            }

            // Search in all parent classes
            String parentName = builder.getClassNode(owner).superName;
            while (UtilFunctions.isObfuscated(parentName) && parentName != null) {
                if (hasNewName(parentName, name, descriptor)) {
                    return methodMap.get(new Pair(parentName, name + descriptor));
                }

                //If the parent of this class actually has a field with a matching name, then we can check the children too. But otherwise we cant assume that siblings remapped names will apply to this node as well.
                ClassNode thisParentNode = builder.getClassNode(parentName);
                if(thisParentNode.methods.stream().anyMatch(methodNode -> methodNode.name.equals(name) && methodNode.desc.equals(descriptor))) {
                    // Search in all child classes of the parent class
                    Set<ClassNode> children = builder.getChildClassNodes(thisParentNode);
                    for (ClassNode child : children) {
                        if (hasNewName(child.name, name, descriptor)) {
                            return methodMap.get(new Pair(child.name, name + descriptor));
                        }
                        if (!visitedNodes.contains(child.name)) {
                            visitedNodes.add(child.name);
                            String childNewName = getNewMethodNameFromHierarchy(child.name, name, descriptor, visitedNodes);
                            if (childNewName != null) {
                                return childNewName;
                            }
                        }
                    }
                }

                parentName = builder.getClassNode(parentName).superName;
            }

            // Search in all child classes
            Set<ClassNode> children = builder.getChildClassNodes(builder.getClassNode(owner));
            for (ClassNode child : children) {
                if (hasNewName(child.name, name, descriptor)) {
                    return methodMap.get(new Pair(child.name, name + descriptor));
                }
                if (!visitedNodes.contains(child.name)) {
                    visitedNodes.add(child.name);
                    String childNewName = getNewMethodNameFromHierarchy(child.name, name, descriptor, visitedNodes);
                    if (childNewName != null) {
                        return childNewName;
                    }
                }
            }

            //If this is an interface, check all implementations of this interface
            Set<ClassNode> implementationsOfInterface = builder.getImplementationsOfInterface(builder.getClassNode(owner));
            for (ClassNode implementation : implementationsOfInterface) {
                if (hasNewName(implementation.name, name, descriptor)) {
                    return methodMap.get(new Pair(implementation.name, name + descriptor));
                }
                if (!visitedNodes.contains(implementation.name)) {
                    visitedNodes.add(implementation.name);
                    String childNewName = getNewMethodNameFromHierarchy(implementation.name, name, descriptor, visitedNodes);
                    if (childNewName != null) {
                        return childNewName;
                    }
                }
            }

            //Search all interfaces
            List<ClassNode> interfaces = builder.getClassNode(owner).interfaces.stream().filter(UtilFunctions::isObfuscated).map(s -> builder.getClassNode(s)).toList();
            for (ClassNode interfaceNode : interfaces) {
                //Check if this interface is in map
                if (hasNewName(interfaceNode.name, name, descriptor)) {
                    return methodMap.get(new Pair(interfaceNode.name, name + descriptor));
                }

                if (!visitedNodes.contains(interfaceNode.name)) {
                    visitedNodes.add(interfaceNode.name);
                    String childNewName = getNewMethodNameFromHierarchy(interfaceNode.name, name, descriptor, visitedNodes);
                    if (childNewName != null) {
                        return childNewName;
                    }
                }
            }

            return null;
        }

        private boolean hasNewName(String owner, String name, String descriptor) {
            return UtilFunctions.isObfuscated(owner) && methodMap.containsKey(new Pair(owner, name + descriptor));
        }

        private boolean hasNewFieldName(String owner, String name, String descriptor) {
            return UtilFunctions.isObfuscated(owner) && fieldMap.containsKey(new Pair(owner, name + descriptor));
        }
    }
}