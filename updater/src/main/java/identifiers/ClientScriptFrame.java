package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(ClientScript.class)
public class ClientScriptFrame extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("ClientScript")) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_ARRAY) == 1;
    }
}
