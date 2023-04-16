package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Node.class)
public class IterableNodeHashTable extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("Node"), 1)) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Node")) == 2 &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/lang/Iterable"));
    }
}
