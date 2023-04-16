package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Entity.class)
public class Obj extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Entity") &&
                classNode.getInstanceFields().size() == 3 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 3;
    }
}
