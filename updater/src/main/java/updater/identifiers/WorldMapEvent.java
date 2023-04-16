package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Coord.class)
public class WorldMapEvent extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceMethods().isEmpty() &&
                classNode.getInstanceFields().size() == 3 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Coord")) == 2;

    }
}
