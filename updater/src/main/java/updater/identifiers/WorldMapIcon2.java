package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(AbstractWorldMapIcon.class)
public class WorldMapIcon2 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("AbstractWorldMapIcon") &&
                classNode.getInstanceFields().size() == 6;
    }
}
