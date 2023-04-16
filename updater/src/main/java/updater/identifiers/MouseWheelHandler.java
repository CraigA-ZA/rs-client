package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class MouseWheelHandler extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/awt/event/MouseWheelListener"));
    }
}
