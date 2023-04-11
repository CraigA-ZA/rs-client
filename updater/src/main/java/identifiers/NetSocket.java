package identifiers;

import okio.BufferedSink;
import okio.BufferedSource;
import org.objectweb.asm.Type;
import utility.ClassWrapper;

import java.io.InputStream;
import java.net.Socket;

public class NetSocket extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(Type.getType(Socket.class)) == 1;
    }
}
