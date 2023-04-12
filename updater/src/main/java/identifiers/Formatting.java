package identifiers;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.LdcInsnNode;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

import java.util.Arrays;

public class Formatting extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().isEmpty() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getClassInitializer() != null &&
                Arrays.stream(classNode.getClassInitializer().instructions.toArray()).anyMatch(abstractInsnNode -> abstractInsnNode.getOpcode() == Opcodes.LDC && ((LdcInsnNode) abstractInsnNode).cst.equals("->"));
    }
}
