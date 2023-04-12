package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(AbstractWorldMapIcon.class)
public class WorldMapIcon1 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("AbstractWorldMapIcon") &&
                classNode.getInstanceFields().size() == 4;
    }
}
