package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.*;

@DependsOn(Entity.class)
public class Actor extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Entity") && classNode.isAbstract();
    }

    public MethodIdentifier isVisible = methodIdentifier(methodWrapper -> methodWrapper.returnTypeEquals(Type.BOOLEAN_TYPE));

    //@DependsOn(IterableNodeDeque.class)
    public FieldIdentifier headbars = fieldIdentifier(fieldWrapper -> fieldWrapper.isOfType(TypeUtilities.getTypeOfIdentifiedClass("IterableNodeDeque")));
    public FieldIdentifier overheadText = fieldIdentifier(fieldWrapper -> fieldWrapper.isOfType(TypeUtilities.STRING_TYPE));
}
