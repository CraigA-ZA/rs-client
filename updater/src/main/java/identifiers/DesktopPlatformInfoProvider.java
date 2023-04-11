package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(PlatformInfoProvider.class)
public class DesktopPlatformInfoProvider extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return false;
//        return classNode.getInterfaces().stream().anyMatch(s -> s.equals(identifiedClasses.get("PlatformInfoProvider").getName()));
    }
}
