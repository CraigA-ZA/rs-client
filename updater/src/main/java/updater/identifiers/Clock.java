package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class Clock extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                !classNode.isInterface() &&
                classNode.isAbstract() &&
                classNode.getInstanceFields().isEmpty() &&
                classNode.getInstanceMethods().size() == 2 &&
                classNode.getInstanceMethods().stream().noneMatch(methodNode -> methodNode.exceptions.stream().anyMatch(s -> s.equals("java/io/IOException"))) &&
                classNode.getInstanceMethods().stream().anyMatch(methodNode -> Type.getReturnType(methodNode.desc).equals(Type.INT_TYPE));
    }
}
