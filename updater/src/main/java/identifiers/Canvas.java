package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;

public class Canvas extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getSuperclass().equals("java/awt/Canvas");
    }
}
