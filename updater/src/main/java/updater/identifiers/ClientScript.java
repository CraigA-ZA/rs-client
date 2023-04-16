package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(DualNode.class)
public class ClientScript extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("IterableNodeHashTable"), 1)) >= 1;
    }
}
