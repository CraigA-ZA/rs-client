package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class VorbisResidue extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 6 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 1;
    }
}
