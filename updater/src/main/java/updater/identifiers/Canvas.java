package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class Canvas extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getSuperclass().equals("java/awt/Canvas");
    }
}
