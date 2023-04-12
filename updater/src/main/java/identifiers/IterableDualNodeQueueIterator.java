package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(IterableDualNodeQueue.class)
public class IterableDualNodeQueueIterator extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/util/Iterator")) &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("IterableDualNodeQueue")) == 1;
    }
}
