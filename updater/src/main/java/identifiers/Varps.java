package identifiers;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.IntInsnNode;
import utility.ClassWrapper;
import utility.TypeUtilities;

import java.util.Arrays;

public class Varps extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().isEmpty() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getCountStaticFieldsOfType(TypeUtilities.withDimensions(Type.INT_TYPE, 1)) >= 3 &&
                classNode.getClassInitializer() != null &&
                Arrays.stream(classNode.getClassInitializer().instructions.toArray()).anyMatch(abstractInsnNode -> abstractInsnNode.getOpcode() == Opcodes.BIPUSH && ((IntInsnNode) abstractInsnNode).operand == 32) &&
                Arrays.stream(classNode.getClassInitializer().instructions.toArray()).anyMatch(abstractInsnNode -> abstractInsnNode.getOpcode() == Opcodes.SIPUSH && ((IntInsnNode) abstractInsnNode).operand >= 2000);
    }
}
