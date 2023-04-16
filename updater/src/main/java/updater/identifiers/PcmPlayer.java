package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(DevicePcmPlayer.class)
public class PcmPlayer extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return identifiedClasses.get("DevicePcmPlayer").getSuperclass().equals(classNode.getName());
    }
}
