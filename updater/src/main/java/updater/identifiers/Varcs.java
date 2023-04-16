package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class Varcs extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(TypeUtilities.BOOLEAN_ARRAY) >= 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) >= 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(TypeUtilities.STRING_TYPE, 1)) >= 1;
    }
}
