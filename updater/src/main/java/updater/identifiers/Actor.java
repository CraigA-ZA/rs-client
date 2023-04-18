package updater.identifiers;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.IntInsnNode;
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

    public FieldInConstructorIdentifier pathX = fieldInConstructorId(1, fieldInsnNode -> fieldInsnNode.getOpcode() == Opcodes.PUTFIELD && Type.getType(fieldInsnNode.desc).equals(TypeUtilities.INT_ARRAY)
    && fieldInsnNode.getPrevious().getOpcode() == Opcodes.NEWARRAY && ((IntInsnNode) fieldInsnNode.getPrevious()).operand == 10
    && fieldInsnNode.getPrevious().getPrevious().getOpcode() == Opcodes.BIPUSH && ((IntInsnNode) fieldInsnNode.getPrevious().getPrevious()).operand == 10);

    public FieldInConstructorIdentifier pathY = fieldInConstructorId(0, fieldInsnNode -> fieldInsnNode.getOpcode() == Opcodes.PUTFIELD && Type.getType(fieldInsnNode.desc).equals(TypeUtilities.INT_ARRAY)
            && fieldInsnNode.getPrevious().getOpcode() == Opcodes.NEWARRAY && ((IntInsnNode) fieldInsnNode.getPrevious()).operand == 10
            && fieldInsnNode.getPrevious().getPrevious().getOpcode() == Opcodes.BIPUSH && ((IntInsnNode) fieldInsnNode.getPrevious().getPrevious()).operand == 10);

    public FieldInConstructorIdentifier targetIndex = fieldInConstructorId(9, fieldInsnNode -> fieldInsnNode.getOpcode() == Opcodes.PUTFIELD && Type.getType(fieldInsnNode.desc).equals(Type.INT_TYPE));

    public FieldInConstructorIdentifier movementFrame = fieldInConstructorId(16, fieldInsnNode -> fieldInsnNode.getOpcode() == Opcodes.PUTFIELD && Type.getType(fieldInsnNode.desc).equals(Type.INT_TYPE));
}
