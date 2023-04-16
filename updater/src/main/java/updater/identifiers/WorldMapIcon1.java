package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(AbstractWorldMapIcon.class)
public class WorldMapIcon1 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("AbstractWorldMapIcon") &&
                classNode.getInstanceFields().size() == 4;
    }
}
