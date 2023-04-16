package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Entity.class)
public class Projectile extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Entity") &&
                classNode.getCountFieldsOfType(Type.DOUBLE_TYPE) >= 8;
    }
}
