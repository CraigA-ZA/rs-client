package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class NetSocket_Broken extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(Type.getObjectType("java/net/Socket")) == 1 &&
                classNode.getCountFieldsOfType(Type.getObjectType("java/io/InputStream")) ==1;
    }
}
