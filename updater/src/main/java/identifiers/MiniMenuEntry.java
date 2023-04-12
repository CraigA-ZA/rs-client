package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class MiniMenuEntry extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_TYPE) == 2 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 5 &&
                classNode.getInstanceFields().size() == 7;
    }
}
