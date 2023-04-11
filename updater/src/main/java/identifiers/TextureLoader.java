package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;

public class TextureLoader extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isInterface() &&
                classNode.getInstanceMethods().size() == 4 &&
                classNode.getInstanceMethods().stream().filter(methodNode -> Type.getReturnType(methodNode.desc).equals(Type.BOOLEAN_TYPE)).count() == 2;
    }
}
