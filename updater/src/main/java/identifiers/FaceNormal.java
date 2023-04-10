package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class FaceNormal extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 3 &&
                classNode.getInstanceFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.INT_TYPE)) &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getConstructors().size() == 1;
        //TODO .and { it.constructors.first().instructions.none { it.isField } }
    }
}
