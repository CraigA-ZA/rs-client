package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class PlayerAppearance extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty() &&// &&
                classNode.getCountFieldsOfType(Type.LONG_TYPE) >= 2 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) >= 2;
    }
}
