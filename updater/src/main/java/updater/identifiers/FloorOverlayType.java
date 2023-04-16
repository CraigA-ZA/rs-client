package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(DualNode.class)
public class FloorOverlayType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 9 &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 1;
    }
}
