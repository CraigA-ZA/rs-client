package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn({Entity.class, SeqType.class})
public class GraphicsObject extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Entity") &&
                classNode.getInstanceMethods().size() == 2 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("SeqType")) == 1;
    }
}
