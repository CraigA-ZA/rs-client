package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class AbstractArchive extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isAbstract() &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.getType(Object.class), 2)) == 1;
    }

}
