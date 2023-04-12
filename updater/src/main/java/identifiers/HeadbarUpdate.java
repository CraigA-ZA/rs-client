package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Node.class)
public class HeadbarUpdate extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getInstanceFields().size() == 4 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 4;
    }
}
