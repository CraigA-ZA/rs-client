package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

import java.util.List;

public class GrandExchangeEvents extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().size() == 1 &&
                classNode.getInstanceFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.getType(List.class)));
    }
}
