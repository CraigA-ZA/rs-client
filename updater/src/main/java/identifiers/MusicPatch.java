package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(Node.class)
public class MusicPatch extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.BYTE_TYPE, 1)) == 3 &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.SHORT_TYPE, 1)) == 1;
    }
}
