package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(Node.class)
public class MusicPatch extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(TypeUtilities.BYTE_ARRAY) == 3 &&
                classNode.getCountFieldsOfType(TypeUtilities.SHORT_ARRAY) == 1;
    }
}
