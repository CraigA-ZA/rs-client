package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class MidiFileReader extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().size() == 8 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 4;
    }
}
