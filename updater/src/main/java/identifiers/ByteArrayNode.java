package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(Node.class)
public class ByteArrayNode extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(TypeUtilities.BYTE_ARRAY)) &&
                classNode.isSuperClassEquals("Node");
    }
}
