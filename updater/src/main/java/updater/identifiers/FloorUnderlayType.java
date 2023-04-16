package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(DualNode.class)
public class FloorUnderlayType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getInstanceFields().size() == 5 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 5;
    }
}
