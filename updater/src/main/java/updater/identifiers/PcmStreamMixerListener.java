package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Node.class)
public class PcmStreamMixerListener extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.isAbstract() &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 1 &&
                classNode.getInstanceMethods().size() == 2;
    }
}
