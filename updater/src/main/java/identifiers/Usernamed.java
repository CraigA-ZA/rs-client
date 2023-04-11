package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class Usernamed extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isInterface() &&
                classNode.getInstanceMethods().size() == 1 &&
                Type.getReturnType(classNode.getInstanceMethods().get(0).desc).equals(TypeUtilities.getTypeOfIdentifiedClass("Username"));
    }
}