package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class AbstractArchive extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isAbstract() &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.getType(Object.class), 2)) == 1;
    }
}
