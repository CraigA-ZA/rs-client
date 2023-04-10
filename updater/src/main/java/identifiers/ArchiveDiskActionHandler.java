package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class ArchiveDiskActionHandler extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(interfaceName -> interfaceName.equals("java/lang/Runnable"))&&
                classNode.getInstanceFields().isEmpty();
    }
}
