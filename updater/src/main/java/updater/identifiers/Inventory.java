package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Node.class)
public class Inventory extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 2 &&
                classNode.getInstanceFields().size() == 2;
    }
}
