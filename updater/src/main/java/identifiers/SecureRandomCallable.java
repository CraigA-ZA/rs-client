package identifiers;

import utility.ClassWrapper;

public class SecureRandomCallable extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().size() == 1 &&
                classNode.getInterfaces().get(0).equals("java/util/concurrent/Callable") &&
                classNode.getInstanceFields().isEmpty();
    }
}
