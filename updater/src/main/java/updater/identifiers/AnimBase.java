package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Node.class)
public class AnimBase extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 2 &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.INT_TYPE, 2)) == 1;
    }
}
