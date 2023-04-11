package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn({Node.class, ArchiveDisk.class})
public class ArchiveDiskAction extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("ArchiveDisk")) >= 1;
    }
}
