package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn({Entity.class, SeqType.class})
public class DynamicObject extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Entity") &&
                classNode.getInstanceMethods().size() == 4 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("SeqType")) == 1;
    }
}
