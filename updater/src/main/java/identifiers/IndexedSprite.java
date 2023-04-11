package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(Rasterizer2D.class)
public class IndexedSprite extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Rasterizer2D") &&
               classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.BYTE_TYPE, 1)) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.INT_TYPE, 1)) == 1 ;
    }
}
