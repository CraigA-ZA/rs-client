package identifiers;

import utility.ClassWrapper;

public class GameShell extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return identifiedClasses.get("Client").getSuperclass().equals(classNode.getName());
    }
}
