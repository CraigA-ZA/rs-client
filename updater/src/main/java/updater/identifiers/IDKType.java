package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(DualNode.class)
public class IDKType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(TypeUtilities.SHORT_ARRAY) == 4 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 2 &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 1;
    }
}
