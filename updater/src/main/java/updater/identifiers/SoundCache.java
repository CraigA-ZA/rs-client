package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(NodeHashTable.class)
public class SoundCache extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().size() == 4 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("NodeHashTable")) == 2;
    }
}
