package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class VorbisSample extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.BYTE_TYPE, 1)) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.BYTE_TYPE, 2)) == 1;
    }
}
