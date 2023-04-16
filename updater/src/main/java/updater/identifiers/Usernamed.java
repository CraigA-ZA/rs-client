package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Username.class)
public class Usernamed extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isInterface() &&
                classNode.getInstanceMethods().size() == 1 &&
                Type.getReturnType(classNode.getInstanceMethods().get(0).desc).equals(TypeUtilities.getTypeOfIdentifiedClass("Username"));
    }
}
