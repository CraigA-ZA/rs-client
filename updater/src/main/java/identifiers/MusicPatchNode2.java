package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class MusicPatchNode2 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.BYTE_TYPE, 1)) == 2 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 7;
    }
}
