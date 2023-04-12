package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(NodeHashTable.class)
public class SoundCache extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().size() == 4 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("NodeHashTable")) == 2;
    }
}
