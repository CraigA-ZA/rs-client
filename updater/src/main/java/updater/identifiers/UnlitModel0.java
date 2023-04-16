package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class UnlitModel0 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().isEmpty() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getConstructors().size() == 1 &&
                classNode.getConstructors().get(0).exceptions.stream().noneMatch(s -> s.equals("java/lang/Throwable")) &&
                classNode.getStaticFields().stream().noneMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.getObjectType(classNode.getName())));
    }
}
