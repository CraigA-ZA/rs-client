package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Rasterizer2D.class)
public class Rasterizer3D extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Rasterizer2D") &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) >= 6 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.BYTE_ARRAY) == 0;
    }
}
