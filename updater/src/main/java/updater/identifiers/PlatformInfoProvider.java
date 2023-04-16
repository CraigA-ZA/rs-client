package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(PlatformInfo.class)
public class PlatformInfoProvider extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isInterface() &&
                classNode.getInstanceMethods().size() == 1 &&
                classNode.getInstanceMethods().stream().allMatch(methodNode -> Type.getReturnType(methodNode.desc).equals(TypeUtilities.getTypeOfIdentifiedClass("PlatformInfo")));
    }
}
