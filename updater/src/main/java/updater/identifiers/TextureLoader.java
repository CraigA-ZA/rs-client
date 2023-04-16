package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class TextureLoader extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isInterface() &&
                classNode.getInstanceMethods().size() == 4 &&
                classNode.getInstanceMethods().stream().filter(methodNode -> Type.getReturnType(methodNode.desc).equals(Type.BOOLEAN_TYPE)).count() == 2;
    }
}
