package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Rasterizer2D.class)
public class AbstractFont extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isAbstract() &&
                classNode.isSuperClassEquals("Rasterizer2D");
    }
}
