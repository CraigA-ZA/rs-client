package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

import java.util.Map;

public class ClientPreferences extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(Type.getType(Map.class)) == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 6;
    }
}
