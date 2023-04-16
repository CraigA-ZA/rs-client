package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn({Node.class, NodeHashTable.class})
public class MusicTrack extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(TypeUtilities.BYTE_ARRAY) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("NodeHashTable")) == 1;
    }
}
