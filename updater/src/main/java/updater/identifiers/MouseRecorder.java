package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class MouseRecorder extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/lang/Runnable")) &&
                classNode.getCountFieldsOfType(TypeUtilities.INT_ARRAY) == 2;
    }
}
