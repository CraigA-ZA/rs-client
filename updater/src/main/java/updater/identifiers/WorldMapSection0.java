package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(WorldMapSection.class)
public class WorldMapSection0 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals(identifiedClasses.get("WorldMapSection").getName())) &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 14;
    }
}
