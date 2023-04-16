package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class Bounds extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 4 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 4 &&
                classNode.getInstanceMethods().size() == 9 &&
                !classNode.isAbstract();
    }
}
