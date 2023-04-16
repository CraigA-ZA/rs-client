package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class GrandExchangeOffer extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(Type.BYTE_TYPE) == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 5;
    }
}
