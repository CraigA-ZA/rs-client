package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Node.class)
public class ObjectNode extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getCountFieldsOfType(Type.getType(Object.class)) == 1 &&
                classNode.getInstanceMethods().isEmpty();
    }
}
