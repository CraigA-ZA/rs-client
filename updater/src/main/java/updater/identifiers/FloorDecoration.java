package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn({Entity.class, Scene.class})
public class FloorDecoration extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Entity")) == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 4;
    }

    public FieldIdentifier entity = fieldIdentifier(fieldWrapper -> fieldWrapper.isOfType(TypeUtilities.getTypeOfIdentifiedClass("Entity")));

//    public FieldInMethodIdentifier x = fieldInMethodIdentifier(TypeUtilities.getTypeOfIdentifiedClass("Scene").getClassName(), TypeUtilities.getFieldOfIdentifiedClass("Scene","newFloorDecoration"));
}
