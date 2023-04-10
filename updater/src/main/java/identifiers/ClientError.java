package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

public class ClientError extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getSuperclass().equals("java/lang/RuntimeException") &&
                classNode.getCountFieldsOfType(Type.getType(Throwable.class)) == 1;
    }
}
