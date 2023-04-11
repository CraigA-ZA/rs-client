package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Node.class)
public class IntegerNode extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                !classNode.isAbstract() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 1 &&
                classNode.getInstanceMethods().isEmpty();
    }
}
