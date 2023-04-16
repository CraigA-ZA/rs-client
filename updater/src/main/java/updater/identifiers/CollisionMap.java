package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class CollisionMap extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 4 &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.INT_TYPE, 2)) == 1 &&
                classNode.getInstanceFields().size() == 5;
    }
}
