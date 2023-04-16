package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn({IterableNodeHashTable.class, IterableDualNodeQueue.class, DualNode.class})
public class DemotingHashTable extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("IterableNodeHashTable")) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("IterableDualNodeQueue")) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("DualNode")) == 0;
    }
}
