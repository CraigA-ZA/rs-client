package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class ServerProt extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 2 &&
                classNode.getStaticFields().size() >= 20;
    }
}
