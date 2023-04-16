package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Enumerated.class)
public class WorldMapSectionType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals(identifiedClasses.get("Enumerated").getName())) &&
                classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 1 &&
                classNode.getCountFieldsOfType(Type.BYTE_TYPE) == 1;
    }
}
