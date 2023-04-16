package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Coord.class)
public class WorldMapSection extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isInterface() &&
                classNode.getInstanceMethods().stream().anyMatch(methodNode -> Type.getReturnType(methodNode.desc).equals(TypeUtilities.getTypeOfIdentifiedClass("Coord")));
    }
}
