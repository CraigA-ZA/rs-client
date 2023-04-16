package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(WorldMapManager.class)
public class WorldMap extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().stream().anyMatch(fieldNode ->
                Type.getType(fieldNode.desc).equals(TypeUtilities.getTypeOfIdentifiedClass("WorldMapManager"))) &&
                classNode.getInstanceFields().stream().anyMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.BOOLEAN_TYPE));
    }
}
