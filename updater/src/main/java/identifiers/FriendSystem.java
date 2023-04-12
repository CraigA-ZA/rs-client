package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(LoginType.class)
public class FriendSystem extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("LoginType")) >= 1;
    }
}
