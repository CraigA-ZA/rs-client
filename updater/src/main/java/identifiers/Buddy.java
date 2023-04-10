package identifiers;

import utility.ClassWrapper;
public class Buddy extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("User") &&
                classNode.getInstanceFields().size() >= 3;
    }
}
