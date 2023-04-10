package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;

public class Client extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getName().equals("client");
    }
}
