package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn({IterableDualNodeQueue.class, DualNode.class, IterableNodeHashTable.class})
public class EvictingDualNodeHashTable extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("DualNode")) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("IterableDualNodeQueue")) == 1 &&
        classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("IterableNodeHashTable")) == 1;
    }
}
