package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

import java.util.HashMap;
@DependsOn(AbstractArchive.class)
public class Fonts extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 3 &&
                classNode.getCountFieldsOfType(Type.getType(HashMap.class)) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("AbstractArchive")) == 2;
    }
}
