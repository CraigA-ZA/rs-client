package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class WorldMap extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().stream().anyMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.getObjectType(identifiedClasses.get("WorldMapManager").getName()))) &&
                classNode.getInstanceFields().stream().anyMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.BOOLEAN_TYPE));
    }
}
