package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(User.class)
public class Ignored extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("User") &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 1;
    }
}
