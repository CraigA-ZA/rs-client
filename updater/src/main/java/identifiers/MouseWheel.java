package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(MouseWheelHandler.class)
public class MouseWheel extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return identifiedClasses.get("MouseWheelHandler").getInterfaces().stream().anyMatch(s -> s.equals(classNode.getName()));
    }
}
