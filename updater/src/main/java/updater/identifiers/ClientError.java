package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class ClientError extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getSuperclass().equals("java/lang/RuntimeException") &&
                classNode.getCountFieldsOfType(Type.getType(Throwable.class)) == 1;
    }
}
