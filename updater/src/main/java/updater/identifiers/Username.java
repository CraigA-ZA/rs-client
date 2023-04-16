package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class Username extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(interfaceName -> interfaceName.equals("java/lang/Comparable")) &&
                classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_TYPE) == 2;
    }
}
