package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import deobfuscator.deobs.impl.Block;
import deobfuscator.deobs.impl.BlockAnalyzer;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.analysis.AnalyzerException;

import java.util.*;

public class ControlFlowFixer extends AbstractDeob {
    public void run() {
        List<ClassNode> classNodes = Deobfuscator.classMapASM.values().stream().toList();
        int blockCount = 0;
        for (ClassNode classNode : classNodes) {
            for (MethodNode methodNode : classNode.methods) {
                if (methodNode.tryCatchBlocks.isEmpty()) {
                    BlockAnalyzer analyzer = new BlockAnalyzer();
                    try {
                        analyzer.analyze(classNode.name, methodNode);
                    } catch (AnalyzerException e) {
                        throw new RuntimeException(e);
                    }
                    methodNode.instructions = buildInsnList(methodNode.instructions, analyzer.blocks);
                    blockCount += analyzer.blocks.size();
                }
            }
        }

        System.out.println("Blocks reordered: " + blockCount);
    }

    private InsnList buildInsnList(InsnList originalInstructions, List<Block> blocks) {
        InsnList instructions = new InsnList();
        if (blocks.isEmpty()) {
            return instructions;
        }
        LabelMap labelMap = new LabelMap();
        Queue<Block> stack = Collections.asLifoQueue(new ArrayDeque<>());
        stack.add(blocks.get(0));
        HashSet<Block> placed = new HashSet<>();
        while (!stack.isEmpty()) {
            Block block = stack.remove();
            if (placed.contains(block)) continue;
            placed.add(block);
            for (Block branchSuccessor : block.branchSuccessors) {
                stack.add(branchSuccessor.getImmediateOrigin());
            }
            if (block.immediateSuccessor != null) {
                stack.add(block.immediateSuccessor);
            }
            for (int i = block.instructionsStart; i < block.instructionsEnd; i++) {
                instructions.add(originalInstructions.get(i).clone(labelMap));
            }
        }
        return instructions;
    }

    private static class LabelMap extends AbstractMap<LabelNode, LabelNode> {
        private final HashMap<LabelNode, LabelNode> map = new HashMap<>();

        @Override
        public Set<Entry<LabelNode, LabelNode>> entrySet() {
            throw new IllegalStateException();
        }

        @Override
        public LabelNode get(Object key) {
            return map.computeIfAbsent((LabelNode) key, k -> new LabelNode());
        }
    }
}