package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

public class Link extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(Type.getObjectType(classNode.getName())) == 2 &&
                classNode.getInstanceMethods().size() == 1 &&
                classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty();
    }
}
