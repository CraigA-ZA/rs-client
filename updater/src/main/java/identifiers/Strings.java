package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class Strings extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountStaticFieldsOfType(TypeUtilities.STRING_TYPE) > 20;
    }
}
