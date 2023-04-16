package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class TilePaint extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.isOwnerless() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 6 &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 1 &&
                classNode.getInstanceFields().size() == 7;
    }
}
