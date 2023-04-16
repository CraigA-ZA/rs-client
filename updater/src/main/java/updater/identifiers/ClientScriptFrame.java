package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(ClientScript.class)
public class ClientScriptFrame extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("ClientScript")) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_ARRAY) == 1;
    }
}
