package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class PlayerAppearance extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(Type.LONG_TYPE) == 2 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 2;
    }
}
