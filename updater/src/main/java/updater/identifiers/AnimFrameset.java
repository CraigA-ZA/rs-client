package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn({DualNode.class, AnimFrame.class})
public class AnimFrameset extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getInstanceFields().stream().anyMatch(field -> Type.getObjectType(field.desc)
                        .equals(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("AnimFrame"), 1)));
    }
}