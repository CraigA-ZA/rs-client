package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn({Node.class, MusicPatch.class})
public class MusicPatchNode extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getInstanceFields().stream().anyMatch(fieldNode -> Type.getType(fieldNode.desc).equals(TypeUtilities.getTypeOfIdentifiedClass("MusicPatch")));
    }
}
