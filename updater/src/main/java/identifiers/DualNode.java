package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Node.class)
public class DualNode extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getInstanceFields().size() >= 2 &&
                classNode.getCountFieldsOfType(Type.getObjectType(classNode.getName())) == 2;
    }
}
