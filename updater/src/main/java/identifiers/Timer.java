package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

public class Timer extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(Type.LONG_TYPE) == 5 &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 1;
    }
}
