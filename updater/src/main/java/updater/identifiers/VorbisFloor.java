package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class VorbisFloor extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 5;
    }
}
