package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(AnimBase.class)
public class AnimFrame extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("AnimBase")) == 1 &&
                classNode.getSuperclass().equals("java/lang/Object");
    }
}
