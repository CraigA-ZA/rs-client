package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(DualNode.class)
public class Message extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getInstanceFields().size() >= 6 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 3 &&
                classNode.getCountFieldsOfType(Type.getType(String.class)) == 3;
    }
}
