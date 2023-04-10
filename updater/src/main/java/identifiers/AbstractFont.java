package identifiers;

import utility.ClassWrapper;

public class AbstractFont extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isAbstract() &&
                classNode.isSuperClassEquals("Rasterizer2D");
    }
}
