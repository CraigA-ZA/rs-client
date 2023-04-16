package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(DualNode.class)
public class IterableDualNodeQueue extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/lang/Iterable")) &&
                classNode.getInstanceFields().size() >= 1 &&
                classNode.getInstanceFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(TypeUtilities.getTypeOfIdentifiedClass("DualNode")));
    }
}
