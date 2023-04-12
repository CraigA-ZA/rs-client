package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

import java.util.Queue;

public class UrlRequester extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/lang/Runnable")) &&
                classNode.getCountFieldsOfType(Type.getType(Queue.class)) == 1;
    }
}
