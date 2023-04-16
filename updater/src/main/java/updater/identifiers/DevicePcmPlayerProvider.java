package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(PcmPlayerProvider.class)
public class DevicePcmPlayerProvider extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals(identifiedClasses.get("PcmPlayerProvider").getName()));
    }
}
