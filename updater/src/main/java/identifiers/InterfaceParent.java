package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Node.class)
public class InterfaceParent extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 2;
    }
}
