package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Entity.class)
public class WallDecoration extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(Type.INT_TYPE) == 8 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Entity")) == 2;
    }
}
