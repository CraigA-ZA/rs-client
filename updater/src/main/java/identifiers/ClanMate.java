package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Buddy.class)
public class ClanMate extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Buddy") &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 0;
    }
}
