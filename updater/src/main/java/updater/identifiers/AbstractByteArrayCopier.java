package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class AbstractByteArrayCopier extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.isAbstract() &&
                !classNode.isInterface() &&
                classNode.getInstanceFields().isEmpty() &&
                classNode.getInstanceMethods().stream().anyMatch(methodNode -> TypeUtilities.returnType(methodNode).equals(TypeUtilities.BYTE_ARRAY));
                //classNode.getInstanceMethods().size() == 2; //TODO original finder checked for this, but it doesnt appear to be true
    }
}