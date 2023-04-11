package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class VertexNormal extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.isOwnerless() &&
                classNode.getInstanceFields().size() == 4 &&
                classNode.getInstanceFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.INT_TYPE)) &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getConstructors().size() == 2;
    }
}
