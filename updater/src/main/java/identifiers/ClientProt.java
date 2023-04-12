package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

public class ClientProt extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                !classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 2 &&
                classNode.getStaticFields().size() >= 20;
    }
}
