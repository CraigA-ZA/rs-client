package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;

public class client extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getName().equals("client");
    }
}
