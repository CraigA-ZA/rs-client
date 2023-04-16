package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Node.class)
public class InterfaceParent extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 2;
    }
}
