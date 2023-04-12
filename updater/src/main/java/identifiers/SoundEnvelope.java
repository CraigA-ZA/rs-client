package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class SoundEnvelope extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 2 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 9 &&
                classNode.getInstanceFields().size() == 11;
    }
}
