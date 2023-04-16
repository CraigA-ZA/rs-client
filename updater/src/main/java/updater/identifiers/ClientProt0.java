package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(ClientProt.class)
public class ClientProt0 extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return identifiedClasses.get("ClientProt").getInterfaces().stream().anyMatch(s -> s.equals(classNode.getName()));
    }
}
