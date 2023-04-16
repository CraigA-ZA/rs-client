package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(ClientProt0.class)
public class LoginProt extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().stream().anyMatch(s -> s.equals(identifiedClasses.get("ClientProt0").getName())) &&
                classNode.getInstanceFields().size() == 1;
    }
}
