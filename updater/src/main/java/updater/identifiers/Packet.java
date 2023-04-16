package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Node.class)
public class Packet extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().size() == 2 &&
                classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.BYTE_ARRAY) == 1;
    }
}
