package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Entity.class)
public class Wall extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 6 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Entity")) == 2 &&
                classNode.getInstanceFields().size() == 9 &&
                classNode.getInstanceMethods().isEmpty();
    }
}
