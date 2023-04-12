package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(BufferedNetSocket.class)
public class AbstractSocket extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return identifiedClasses.get("BufferedNetSocket").getSuperclass().equals(classNode.getName());
    }
}
