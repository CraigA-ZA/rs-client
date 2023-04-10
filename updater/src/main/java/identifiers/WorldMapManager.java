package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class WorldMapManager extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return !classNode.getConstructors().isEmpty() &&
                TypeUtilities.getArguments(classNode.getConstructors().get(0)).stream()
                        .anyMatch(type ->
                                type.equals(TypeUtilities.withDimensions(Type.getObjectType(identifiedClasses.get("IndexedSprite").getName()), 1))) &&
                TypeUtilities.getArguments(classNode.getConstructors().get(0)).stream()
                        .anyMatch(type ->
                                type.equals(Type.getObjectType("java/util/HashMap")));
    }
}
