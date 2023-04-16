package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Entity.class)
public class Scenery extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceMethods().isEmpty() &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) >= 12 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Entity")) == 1;
    }
}
