package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(DualNode.class)
public class Rasterizer2D extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getInstanceFields().isEmpty() &&
                classNode.getCountStaticFieldsOfType(TypeUtilities.INT_ARRAY) == 1 &&
                classNode.getCountStaticFieldsOfType(Type.INT_TYPE) == 6;
    }
}
