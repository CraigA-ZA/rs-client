package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class WorldMapEvent extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceMethods().isEmpty() &&
                classNode.getInstanceFields().size() == 3 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Coord")) == 2;

    }
}
