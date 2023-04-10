package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class ArchiveLoader extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(Type.getObjectType(identifiedClasses.get("Archive").getName())) == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 2;
    }
}
