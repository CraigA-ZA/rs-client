package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Enumerated.class)
public class PlayerType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals(identifiedClasses.get("Enumerated").getName())) &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 2 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 2;
    }
}
