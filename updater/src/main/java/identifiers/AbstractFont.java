package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Rasterizer2D.class)
public class AbstractFont extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isAbstract() &&
                classNode.isSuperClassEquals("Rasterizer2D");
    }
}
