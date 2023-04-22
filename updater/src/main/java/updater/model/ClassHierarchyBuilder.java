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

    public void addClass(ClassNode classNode) {
        classes.put(classNode.name, classNode);
        subClasses.putIfAbsent(classNode.superName, new HashSet<>());
        subClasses.get(classNode.superName).add(classNode);

        classNode.interfaces.forEach(s -> {
            subClasses.putIfAbsent(s, new HashSet<>());
            subClasses.get(s).add(classNode);
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
}