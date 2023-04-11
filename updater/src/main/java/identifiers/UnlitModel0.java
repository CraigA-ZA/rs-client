package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class UnlitModel0 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().isEmpty() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getConstructors().size() == 1 &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getStaticFields().stream().noneMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.getObjectType(classNode.getName()))) &&
                classNode.getStaticFields().stream().anyMatch(fieldNode -> Type.getType(fieldNode.desc).equals(TypeUtilities.withDimensions(Type.INT_TYPE, 2)));
    }
}
