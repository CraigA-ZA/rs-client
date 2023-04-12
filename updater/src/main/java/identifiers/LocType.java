package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn({DualNode.class})
public class LocType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.isSuperClassEquals("DualNode") &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_TYPE) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_ARRAY) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.SHORT_ARRAY) == 4;

    }
}
