package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(PlatformInfo.class)
public class PlatformInfoProvider extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isInterface() &&
                classNode.getInstanceMethods().size() == 1 &&
                classNode.getInstanceMethods().stream().allMatch(methodNode -> Type.getReturnType(methodNode.desc).equals(TypeUtilities.getTypeOfIdentifiedClass("PlatformInfo")));
    }
}
