package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class TileModel extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.isOwnerless() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 4 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) >= 6;
    }
}
