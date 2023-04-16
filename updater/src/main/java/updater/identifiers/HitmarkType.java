package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(DualNode.class)
public class HitmarkType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_TYPE) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) >= 14;
    }
}
