package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Wrapper.class)
public class DirectWrapper extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Wrapper") &&
                classNode.getCountFieldsOfType(Type.getType(Object.class)) >= 1;
    }
}
