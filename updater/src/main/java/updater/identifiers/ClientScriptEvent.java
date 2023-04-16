package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn({Component.class,Node.class})
public class ClientScriptEvent extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Component")) == 2;
    }
}
