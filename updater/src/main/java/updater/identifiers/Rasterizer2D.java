package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

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
