package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;

import java.util.Arrays;
import java.util.List;

import static org.objectweb.asm.Opcodes.ACC_STATIC;

public class OpaquePredicates extends AbstractDeob {
    @Override
    public void run() {
        int fixed = 0;
        int methodCount = 0;

        //Iterate over every class
        for (ClassNode classNode : Deobfuscator.classMapASM.values()) {

            boolean flaggedMethod = false;
            List<MethodNode> methodList = classNode.methods;

            //Iterate over every method
            for (MethodNode methodNode : methodList) {
                List<AbstractInsnNode> instructions = Arrays.stream(methodNode.instructions.toArray()).toList();

                //Iterate over every instruction
                for (AbstractInsnNode instruction : instructions) {
                    int opcode = instruction.getOpcode();

                    //If instruction is an integer comparison
                    if (isCompareWithTwoOperands(opcode)) {

                        //Check if method has parameters
                        Type[] types = Type.getArgumentTypes(methodNode.desc);
                        int loadNum = (methodNode.access & ACC_STATIC) > 0 ? types.length - 1 : types.length;
                        AbstractInsnNode secondOperand = instruction.getPrevious();
                        AbstractInsnNode firstOperand = secondOperand.getPrevious();

                        if (isLoadOfLastParameter(firstOperand, loadNum) && isConstantOperand(secondOperand)) {
                            if (isIllegalStateException(instruction.getNext()) || isReturn(instruction.getNext())) {
                                removeInstructionsAndInsertJump(instruction, methodNode.instructions);
                                fixed++;
                                flaggedMethod = true;
                            }
                        } else if (isLoadOfLastParameter(secondOperand, loadNum) && isConstantOperand(firstOperand)) {
                            if (isIllegalStateException(instruction.getNext()) || isReturn(instruction.getNext())) {
                                removeInstructionsAndInsertJump(instruction, methodNode.instructions);
                                fixed++;
                                flaggedMethod = true;
                            }
                        }

                    }
                }

                if (flaggedMethod) {
                    methodCount++;
                    flaggedMethod = false;
                }
            }
        }
        System.out.println("Opaque predicates: " + fixed + " in " + methodCount + " methods");
    }


    private void removeInstructionsAndInsertJump(AbstractInsnNode instruction, InsnList instructions) {
        LabelNode destination = ((JumpInsnNode) instruction).label;


        AbstractInsnNode instructionToRemove = instruction.getPrevious().getPrevious();
        instructions.insertBefore(instructionToRemove, new JumpInsnNode(Opcodes.GOTO, destination));
        while (instructionToRemove != null) {
            AbstractInsnNode nextInstruction = instructionToRemove.getNext();
            instructions.remove(instructionToRemove);
            if (instructionToRemove.getOpcode() == Opcodes.ATHROW || instructionToRemove.getOpcode() == Opcodes.RETURN) {
                break;
            }
            instructionToRemove = nextInstruction;
        }
    }

    private boolean isReturn(AbstractInsnNode insnNode) {
        return insnNode.getOpcode() == Opcodes.RETURN || insnNode instanceof LabelNode && isReturn(insnNode.getNext());
    }

    private static boolean isCompareWithTwoOperands(int opcode) {
        return opcode >= Opcodes.IF_ICMPEQ && opcode <= Opcodes.IF_ICMPLE;
    }

    private boolean isLoadOfLastParameter(AbstractInsnNode insnNode, int lastIndex) {
        return insnNode.getOpcode() == Opcodes.ILOAD && ((VarInsnNode) insnNode).var == lastIndex;
    }

    private boolean isConstantOperand(AbstractInsnNode insnNode) {
        return insnNode.getOpcode() == Opcodes.LDC || (insnNode.getOpcode() >= Opcodes.ICONST_M1 && insnNode.getOpcode() <= Opcodes.ICONST_5) || insnNode.getOpcode() == Opcodes.SIPUSH || insnNode.getOpcode() == Opcodes.BIPUSH;
    }

    private boolean isIllegalStateException(AbstractInsnNode insnNode) {
        return insnNode.getOpcode() == Opcodes.NEW && ((TypeInsnNode) insnNode).desc.equals("java/lang/IllegalStateException") || insnNode instanceof LabelNode && isIllegalStateException(insnNode.getNext());
    }
}
