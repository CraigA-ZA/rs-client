package identifiers;

import utility.ClassWrapper;

public class Archive extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("AbstractArchive");
    }
}
