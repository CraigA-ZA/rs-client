package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(DualNode.class)
public class ObjType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getCountFieldsOfType(TypeUtilities.SHORT_ARRAY) == 4 &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_ARRAY) == 2;
    }
}
