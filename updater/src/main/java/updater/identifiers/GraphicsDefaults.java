package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class GraphicsDefaults extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().size() >= 11 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) >= 11 &&
                classNode.getInstanceMethods().size() == 1;
    }
}
