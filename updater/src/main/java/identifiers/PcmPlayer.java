package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(DevicePcmPlayer.class)
public class PcmPlayer extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return identifiedClasses.get("DevicePcmPlayer").getSuperclass().equals(classNode.getName());
    }
}
