package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class ByteArrayPool extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().isEmpty() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getCountStaticFieldsOfType(TypeUtilities.withDimensions(Type.BYTE_TYPE, 2)) >= 3;
    }
}
