package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn({Entity.class, SeqType.class})
public class DynamicObject extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Entity") &&
                classNode.getCountFieldsOfType(Type.BOOLEAN_TYPE) == 0 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 8 &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("SeqType")) == 1;
    }
}
