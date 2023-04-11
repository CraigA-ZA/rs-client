package identifiers;

import utility.ClassWrapper;

public class WorldMapIcon2 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("AbstractWorldMapIcon") &&
                classNode.getInstanceFields().size() == 6;
    }
}
