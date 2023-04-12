package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn({DualNode.class, Archive.class})
public class NetFileRequest extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Archive")) == 1;
    }
}
