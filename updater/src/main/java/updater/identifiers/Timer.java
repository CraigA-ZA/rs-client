package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class Timer extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(Type.LONG_TYPE) == 5 &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 1;
    }
}
