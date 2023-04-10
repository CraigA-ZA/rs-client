package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

//@DependsOn(Node)
public class ByteArrayNode extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(TypeUtilities.withDimensions(Type.BYTE_TYPE, 1))) &&
                classNode.getSuperclass().equals(identifiedClasses.get("Node"));
    }
}