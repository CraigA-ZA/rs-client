package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Rasterizer2D.class)
public class IndexedSprite extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Rasterizer2D") &&
               classNode.getCountFieldsOfType(TypeUtilities.BYTE_ARRAY) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 1 ;
    }
}
