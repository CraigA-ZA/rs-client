package identifiers;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.LdcInsnNode;
import utility.ClassWrapper;

import java.util.Arrays;

public class StudioGame extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return !classNode.getInterfaces().isEmpty() &&
                classNode.getClassInitializer() != null &&
                Arrays.stream(classNode.getClassInitializer().instructions.toArray()).anyMatch(abstractInsnNode -> abstractInsnNode.getOpcode() == Opcodes.LDC && ((LdcInsnNode)abstractInsnNode).cst.equals("runescape")) &&
                Arrays.stream(classNode.getClassInitializer().instructions.toArray()).anyMatch(abstractInsnNode -> abstractInsnNode.getOpcode() == Opcodes.LDC && ((LdcInsnNode)abstractInsnNode).cst.equals("RuneScape"));
    }
}
