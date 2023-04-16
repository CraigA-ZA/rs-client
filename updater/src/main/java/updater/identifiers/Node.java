package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class Node extends AbstractIdentifier {

    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().size() == 3 &&
                classNode.getCountFieldsOfType(Type.LONG_TYPE) == 1 &&
                classNode.getCountFieldsOfType(Type.getObjectType(classNode.getName())) == 2 &&
                classNode.isOwnerless();
    }

    public MethodIdentifier hasNext = methodIdentifier(methodWrapper -> methodWrapper.returnTypeEquals(Type.BOOLEAN_TYPE));
}
