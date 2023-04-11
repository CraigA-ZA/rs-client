package identifiers;

import utility.ClassWrapper;

public class MouseHandler extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/awt/event/MouseListener"));
    }
}
