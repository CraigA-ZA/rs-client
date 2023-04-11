package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Enumerated.class)
public class PlayerInfoType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals(identifiedClasses.get("Enumerated").getName())) &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 2;
    }
}
