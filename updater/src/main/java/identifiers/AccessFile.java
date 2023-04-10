package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class AccessFile extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(Type.getObjectType("java/io/RandomAccessFile")) == 1;
    }
}
