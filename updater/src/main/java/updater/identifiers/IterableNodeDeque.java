package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Node.class)
public class IterableNodeDeque extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/lang/Iterable")) &&
                classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Node")) == 2;
    }
}
