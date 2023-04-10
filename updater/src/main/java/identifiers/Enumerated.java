package identifiers;

import utility.ClassWrapper;

public class Enumerated extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return identifiedClasses.get("StudioGame").getInterfaces().stream().anyMatch(s -> s.equals(classNode.getName()));
    }
}
