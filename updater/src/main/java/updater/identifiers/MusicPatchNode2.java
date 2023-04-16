package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class MusicPatchNode2 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.BYTE_ARRAY) == 2 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 7;
    }
}
