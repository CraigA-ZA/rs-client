package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn({DualNode.class, IterableNodeHashTable.class})
public class StructType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("IterableNodeHashTable")) == 1;
    }
}
