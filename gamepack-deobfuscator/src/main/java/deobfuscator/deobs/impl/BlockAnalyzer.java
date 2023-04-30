package deobfuscator.deobs.impl;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.BasicInterpreter;
import org.objectweb.asm.tree.analysis.BasicValue;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class BlockAnalyzer extends Analyzer<BasicValue> {

    public ArrayList<Block> blocks = new ArrayList<>();

    public BlockAnalyzer() {
        super(new BasicInterpreter());
    }

    @Override
    public void init(String owner, MethodNode m) {
        var insnList = m.instructions;
        var currentBlock = new Block();
        blocks.add(currentBlock);
        for (var i = 0; i < insnList.size(); i++) {
            var insn = insnList.get(i);
            currentBlock.instructionsEnd++;
            if (insn.getNext() == null) break;
            AbstractInsnNode nextInsn = insn.getNext();
            //This condition was changed from the original source
            if (nextInsn instanceof JumpInsnNode ||
                    nextInsn instanceof TableSwitchInsnNode ||
                    nextInsn instanceof LookupSwitchInsnNode ||
//                    nextInsn instanceof InsnNode && (nextInsn.getOpcode() >= Opcodes.IRETURN && nextInsn.getOpcode() <= Opcodes.RETURN || nextInsn.getOpcode() == Opcodes.ATHROW) ||
                    nextInsn instanceof LabelNode) {
                currentBlock = new Block();
                currentBlock.instructionsStart = i + 1;
                currentBlock.instructionsEnd = i + 1;
                blocks.add(currentBlock);
            }
        }
    }

    @Override
    public void newControlFlowEdge(int insn, int successor) {
        var b1 = findBlock(insn);
        var b2 = findBlock(successor);
        if (b1 != b2) {
            if (insn + 1 == successor) {
                b1.immediateSuccessor = b2;
                b2.immediatePredecessor = b1;
            } else {
                b1.branchSuccessors.add(b2);
            }
        }
    }

    private Block findBlock(int insnIndex) {
        return blocks.stream()
                .filter(block -> insnIndex >= block.instructionsStart && insnIndex < block.instructionsEnd)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No block found for instruction index " + insnIndex));
    }
}