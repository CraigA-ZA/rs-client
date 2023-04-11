package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class Clock extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.isAbstract() &&
                classNode.getInstanceFields().isEmpty() &&
                classNode.getInstanceMethods().size() == 8 &&
                classNode.getInstanceMethods().stream().anyMatch(methodNode -> Type.getReturnType(methodNode.desc).equals(Type.INT_TYPE));
    }
}
