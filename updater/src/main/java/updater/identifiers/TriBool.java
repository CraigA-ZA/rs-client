package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

import java.lang.reflect.Modifier;

public class TriBool extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().isEmpty() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.isOwnerless() &&
                classNode.getCountStaticFieldsOfType(Type.getObjectType(classNode.getName())) == 3 &&
                classNode.getStaticFields().stream().filter(fieldNode -> Type.getType(fieldNode.desc).equals(Type.getObjectType(classNode.getName()))).allMatch(fieldNode -> Modifier.isPublic(fieldNode.access));
    }
}
