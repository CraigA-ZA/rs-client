package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Rasterizer2D.class)
public class Rasterizer3D extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Rasterizer2D") &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().isEmpty() &&
                classNode.getInstanceMethods().isEmpty();
    }
}
