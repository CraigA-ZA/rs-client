package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

import java.net.Socket;

public class BufferedNetSocket extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(Type.getType(Socket.class)) >= 1;
    }
}
