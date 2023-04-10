package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class WorldMap extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().stream().anyMatch(fieldNode ->
                Type.getType(fieldNode.desc).equals(TypeUtilities.getTypeOfIdentifiedClass("WorldMapManager"))) &&
                classNode.getInstanceFields().stream().anyMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.BOOLEAN_TYPE));
    }
}