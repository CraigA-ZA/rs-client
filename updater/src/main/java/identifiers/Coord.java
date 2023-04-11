package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class Coord extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().size() == 3 &&
                classNode.getInstanceFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.INT_TYPE)) &&
                classNode.getInstanceMethods().stream().anyMatch(methodNode -> methodNode.name.equals("hashCode"));
    }
}
