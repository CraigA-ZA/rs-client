package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

import java.io.OutputStream;

public class BufferedSink extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/lang/Runnable")) &&
                classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(Type.getType(OutputStream.class)) == 1;
    }
}
