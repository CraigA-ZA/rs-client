package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;

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
