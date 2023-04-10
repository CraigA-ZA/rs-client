package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class ArchiveDiskAction_broken extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getInstanceFields().stream()
                        .anyMatch(field -> Type.getObjectType(field.desc).equals(TypeUtilities.getTypeOfIdentifiedClass("ArchiveDisk")));
    }
}
