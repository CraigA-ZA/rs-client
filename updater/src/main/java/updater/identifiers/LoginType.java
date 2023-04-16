package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class LoginType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_TYPE) == 1 &&
                classNode.getInstanceMethods().size() == 1;
    }
}
