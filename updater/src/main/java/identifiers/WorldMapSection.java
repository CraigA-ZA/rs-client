package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class WorldMapSection extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isInterface() &&
                classNode.getInstanceMethods().stream().anyMatch(methodNode -> Type.getReturnType(methodNode.desc).equals(TypeUtilities.getTypeOfIdentifiedClass("Coord")));
    }
}
