package identifiers;

import utility.ClassWrapper;

public class WorldMapIcon1 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("AbstractWorldMapIcon") &&
                classNode.getInstanceFields().size() == 4;
    }
}
