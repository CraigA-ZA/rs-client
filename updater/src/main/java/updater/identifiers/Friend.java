package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Buddy.class)
public class Friend extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Buddy") &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 2;
    }
}
