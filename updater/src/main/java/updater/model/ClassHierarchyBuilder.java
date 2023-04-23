package updater.model;

import org.objectweb.asm.tree.ClassNode;

import java.util.*;

public class ClassHierarchyBuilder {

    public ClassHierarchyBuilder(List<ClassNode> classMap) {
        for(ClassNode classNode: classMap) {
            this.addClass(classNode);
        }
    }

    private Map<String, ClassNode> classes = new HashMap<>();

    private Map<String, Set<ClassNode>> subClasses = new HashMap<>();

    private Map<String, Set<ClassNode>> interfaceImplementations = new HashMap<>();

    public void addClass(ClassNode classNode) {
        classes.put(classNode.name, classNode);
        subClasses.putIfAbsent(classNode.superName, new HashSet<>());
        subClasses.get(classNode.superName).add(classNode);

        classNode.interfaces.forEach(s -> {
            interfaceImplementations.putIfAbsent(s, new HashSet<>());
            interfaceImplementations.get(s).add(classNode);
        });
    }

    public ClassNode getClassNode(String className) {
        return classes.get(className);
    }

    public ClassNode getParentClassNode(ClassNode classNode) {
        return classes.get(classNode.superName);
    }

    public Set<ClassNode> getChildClassNodes(ClassNode classNode) {
        return subClasses.getOrDefault(classNode.name, Collections.emptySet());
    }

    public Set<ClassNode> getImplementationsOfInterface(ClassNode classNode) {
        return interfaceImplementations.getOrDefault(classNode.name, Collections.emptySet());
    }
}