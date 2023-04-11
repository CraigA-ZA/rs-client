package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Client.class)
public class GameShell extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return identifiedClasses.get("Client").getSuperclass().equals(classNode.getName());
    }
}
