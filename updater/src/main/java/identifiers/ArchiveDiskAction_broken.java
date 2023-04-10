package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class ArchiveDiskAction_broken extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getInstanceFields().stream()
                        .anyMatch(field -> Type.getObjectType(field.desc).equals(Type.getObjectType(identifiedClasses.get("ArchiveDisk").getName())));
    }
}
