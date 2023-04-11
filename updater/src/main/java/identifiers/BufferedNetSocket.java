package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(AbstractSocket.class)
public class BufferedNetSocket extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.isSuperClassEquals("AbstractSocket");
    }
}
