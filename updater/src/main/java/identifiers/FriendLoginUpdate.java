package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Link.class)
public class FriendLoginUpdate extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Link") &&
                classNode.getInstanceFields().size() == 3;
    }
}
