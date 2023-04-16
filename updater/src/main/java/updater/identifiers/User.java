package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Username.class)
public class User extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Username")) == 2 &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/lang/Comparable"));
    }
}
