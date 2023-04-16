package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(PlatformInfoProvider.class)
public class DesktopPlatformInfoProvider extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals(identifiedClasses.get("PlatformInfoProvider").getName()));
    }
}
