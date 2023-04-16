package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(DualNode.class)
public class DualNodeDeque extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("DualNode")) == 1;
    }
}
