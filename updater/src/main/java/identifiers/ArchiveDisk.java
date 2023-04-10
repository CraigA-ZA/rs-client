package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class ArchiveDisk extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(Type.getObjectType(identifiedClasses.get("BufferedFile").getName())) == 2;
    }
}
