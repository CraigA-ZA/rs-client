package identifiers;

import utility.ClassWrapper;

public class Canvas extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Canvas");
    }
}
