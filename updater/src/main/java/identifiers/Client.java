package identifiers;

import utility.ClassWrapper;

public class Client extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getName().equals("client");
    }
}
