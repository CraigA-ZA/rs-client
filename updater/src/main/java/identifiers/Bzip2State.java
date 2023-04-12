package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class Bzip2State extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(TypeUtilities.BYTE_ARRAY) == 6;
    }
}
