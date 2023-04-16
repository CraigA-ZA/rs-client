package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(DualNode.class)
public class Wrapper extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isAbstract() &&
                classNode.isSuperClassEquals("DualNode") &&
                classNode.getInstanceMethods().stream().anyMatch(methodNode -> Type.getReturnType(methodNode.desc).equals(Type.getType(Object.class)));
    }
}
