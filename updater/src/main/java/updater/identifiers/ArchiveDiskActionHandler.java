package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class ArchiveDiskActionHandler extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(interfaceName -> interfaceName.equals("java/lang/Runnable"))&&
                classNode.getInstanceFields().isEmpty();
    }
}
