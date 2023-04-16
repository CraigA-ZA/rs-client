package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class DefaultsGroup extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getInstanceFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.INT_TYPE)) &&
                classNode.getCountStaticFieldsOfType(Type.getObjectType(classNode.getName())) == 1;
    }
}
