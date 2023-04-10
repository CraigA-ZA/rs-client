package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class Varcs extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.BOOLEAN_TYPE, 1)) >= 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.INT_TYPE, 1)) >= 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.getType(String.class), 1)) >= 1;
    }
}
