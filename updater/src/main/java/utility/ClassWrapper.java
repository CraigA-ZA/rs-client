package utility;

import identifiers.AbstractIdentifier;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Getter
@Setter
public class ClassWrapper {
    private final ClassNode classNode;

    public List<FieldNode> getInstanceFields() {
        return classNode.fields.stream().filter(fieldNode -> !Modifier.isStatic(fieldNode.access)).collect(Collectors.toList());
    }

    public List<FieldNode> getStaticFields() {
        return classNode.fields.stream().filter(fieldNode -> Modifier.isStatic(fieldNode.access)).collect(Collectors.toList());
    }

    public List<MethodNode> getInstanceMethods() {
        return classNode.methods.stream().filter(methodNode -> !Modifier.isStatic(methodNode.access) && !methodNode.name.equals("<init>")).collect(Collectors.toList());
    }

    public long getCountFieldsOfType(Type type) {
        return getInstanceFields().stream().map(fieldNode -> Type.getType(fieldNode.desc)).filter(thisType -> thisType.equals(type)).count();
    }

    public long getCountStaticFieldsOfType(Type type) {
        return getStaticFields().stream().map(fieldNode -> Type.getType(fieldNode.desc)).filter(thisType -> thisType.equals(type)).count();
    }

    public String getName() {
        return classNode.name;
    }

    public boolean isOwnerless() {
        return classNode.superName.equals("java/lang/Object");
    }

    public String getSuperclass() {
        return classNode.superName;
    }

    public List<String> getInterfaces() {
        return classNode.interfaces;
    }

    public List<FieldNode> getFields() {
        return classNode.fields;
    }

    public Collection<MethodNode> getMethods() {
        return classNode.methods;
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(classNode.access);
    }

    public boolean isInterface() {
        return Modifier.isInterface(classNode.access);
    }

    public boolean isSuperClassEquals(String className) {
        return classNode.superName.equals(AbstractIdentifier.identifiedClasses.get(className).getName());
    }

    public List<MethodNode> getConstructors() {
        return classNode.methods.stream().filter(methodNode -> methodNode.name.equals("<init>")).collect(Collectors.toList());
    }
}
