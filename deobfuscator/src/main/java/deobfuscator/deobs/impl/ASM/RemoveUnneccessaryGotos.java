package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.util.Printer;
import za.org.secret.UtilFunctions;

public class RemoveUnneccessaryGotos extends AbstractDeob {
    @Override
    public void run() {
        for (ClassNode classNode : Deobfuscator.classMapASM.values()) {
            if(!UtilFunctions.isObfuscated(classNode.name)) {
                continue;
            }
            for (MethodNode methodNode : classNode.methods) {
                if(methodNode.tryCatchBlocks.size() > 0) {
                    continue;
                }
                for (AbstractInsnNode instruction : methodNode.instructions) {
                    if (instruction.getOpcode() != Opcodes.GOTO) continue;

                    LabelNode labelToJumpTo = ((JumpInsnNode) instruction).label;
                    AbstractInsnNode nextInstruction = instruction.getNext();
                    if(!(nextInstruction instanceof LabelNode)) continue;

                    LabelNode nextInstructionsLabel = (LabelNode) nextInstruction;
                    if(labelToJumpTo.equals(nextInstructionsLabel)) {
                        System.out.println("Removing: " + Printer.OPCODES[instruction.getOpcode()]);
                        methodNode.instructions.remove(instruction);
                    }
                }
            }
        }
    }
}
