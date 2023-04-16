package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(BufferedNetSocket.class)
public class AbstractSocket extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return identifiedClasses.get("BufferedNetSocket").getSuperclass().equals(classNode.getName());
    }
}
