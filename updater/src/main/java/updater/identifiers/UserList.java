package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(User.class)
public class UserList extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().stream().anyMatch(fieldNode -> Type.getType(fieldNode.desc).equals(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("User"), 1)));
    }
}
