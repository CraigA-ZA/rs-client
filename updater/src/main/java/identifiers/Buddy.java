package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;

public class Buddy extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getSuperclass().equals(identifiedClasses.get("User")) &&
                classNode.getInstanceFields().size() >= 3;
    }
}
