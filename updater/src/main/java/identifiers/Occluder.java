package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;

public class Occluder extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceMethods().isEmpty() &&
                classNode.getInstanceFields().size() == 18 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 18;
    }
}
