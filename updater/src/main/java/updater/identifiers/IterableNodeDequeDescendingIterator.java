package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn({Node.class, IterableNodeDeque.class})
public class IterableNodeDequeDescendingIterator extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/util/Iterator")) &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Node")) == 2 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("IterableNodeDeque")) == 1 &&
                classNode.getInstanceFields().size() == 3;
    }
}
