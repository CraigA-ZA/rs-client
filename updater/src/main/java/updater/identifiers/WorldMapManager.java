package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(IndexedSprite.class)
public class WorldMapManager extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return !classNode.getConstructors().isEmpty() &&
                TypeUtilities.getArguments(classNode.getConstructors().get(0)).stream()
                        .anyMatch(type ->
                                type.equals(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("IndexedSprite"), 1))) &&
                TypeUtilities.getArguments(classNode.getConstructors().get(0)).stream()
                        .anyMatch(type ->
                                type.equals(Type.getObjectType("java/util/HashMap")));
    }
}
