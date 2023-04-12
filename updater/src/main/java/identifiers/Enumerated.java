package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(StudioGame.class)
public class Enumerated extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return identifiedClasses.get("StudioGame").getInterfaces().stream().anyMatch(s -> s.equals(classNode.getName()));
    }
}
