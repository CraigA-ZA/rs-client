package identifiers;

import utility.ClassWrapper;

public class WorldMapAreaData extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("WorldMapArea");
    }
}
