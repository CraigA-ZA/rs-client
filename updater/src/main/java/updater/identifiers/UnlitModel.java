package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Entity.class)
public class UnlitModel extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Entity") &&
                classNode.getCountFieldsOfType(TypeUtilities.SHORT_ARRAY) >= 5;
    }
}
