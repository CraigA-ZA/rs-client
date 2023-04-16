package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(IterableDualNodeQueue.class)
public class IterableDualNodeQueueIterator extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/util/Iterator")) &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("IterableDualNodeQueue")) == 1;
    }
}
