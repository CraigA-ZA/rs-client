package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class MidiFileReader extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().size() == 8 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 4;
    }
}
