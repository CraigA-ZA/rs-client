package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(WorldMapSection.class)
public class WorldMapSection2 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals(identifiedClasses.get("WorldMapSection").getName())) &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 6;
    }
}
