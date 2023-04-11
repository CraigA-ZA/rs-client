package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(NetSocket.class)
public class AbstractSocket extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return identifiedClasses.get("NetSocket").getSuperclass().equals(classNode.getName());
    }
}
