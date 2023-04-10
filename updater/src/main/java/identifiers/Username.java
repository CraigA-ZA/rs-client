package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class Username extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(interfaceName -> interfaceName.equals("java/lang/Comparable")) &&
                classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(Type.getType(String.class)) == 2;
    }
}
