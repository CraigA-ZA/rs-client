package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

import java.io.InputStream;

public class BufferedSource extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/lang/Runnable")) &&
                classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(Type.getType(InputStream.class)) == 1;
    }
}
