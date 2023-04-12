package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Node.class)
public class ObjectNode extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getCountFieldsOfType(Type.getType(Object.class)) == 1 &&
                classNode.getInstanceMethods().isEmpty();
    }
}
