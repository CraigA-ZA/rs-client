package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class AudioFilter extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().size() == 4 &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.INT_TYPE, 3)) == 2;
    }
}
