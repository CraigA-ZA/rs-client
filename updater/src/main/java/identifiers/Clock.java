package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

public class Clock extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                !classNode.isInterface() &&
                classNode.isAbstract() &&
                classNode.getInstanceFields().isEmpty() &&
                classNode.getInstanceMethods().stream().noneMatch(methodNode -> methodNode.exceptions.stream().anyMatch(s -> s.equals("java/io/IOException"))) &&
                classNode.getInstanceMethods().stream().anyMatch(methodNode -> Type.getReturnType(methodNode.desc).equals(Type.INT_TYPE));
    }
}
