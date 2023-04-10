package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

//@DependsOn(Username)
public class User extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(Type.getObjectType(identifiedClasses.get("Username").getName())) == 2 &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/lang/Comparable"));
    }
}
