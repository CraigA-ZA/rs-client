package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class Strings extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountStaticFieldsOfType(TypeUtilities.STRING_TYPE) > 20;
    }
}
