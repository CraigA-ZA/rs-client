package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(PcmPlayer.class)
public class SoundSystem extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/lang/Runnable")) &&
                classNode.getInstanceFields().stream().anyMatch(fieldNode -> Type.getType(fieldNode.desc).equals(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("PcmPlayer"), 1)));
    }
}
