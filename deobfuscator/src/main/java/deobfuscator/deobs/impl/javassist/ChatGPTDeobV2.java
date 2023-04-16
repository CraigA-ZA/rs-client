package deobfuscator.deobs.impl.javassist;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import deobfuscator.deobs.impl.ASMBlock;
import javassist.*;
import javassist.bytecode.analysis.ControlFlow;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;
import za.org.secret.UtilFunctions;

import java.util.*;

public class ChatGPTDeobV2 extends AbstractDeob {
    private static int index;
    private static Stack<Integer> stack;
    private static List<List<Integer>> sccList;

    @Override
    public void run() {
        try {
            for (CtClass ctClass : Deobfuscator.classMap.values()) {

                for (CtConstructor ctConstructor : ctClass.getDeclaredConstructors()) {
//                    if (ctClass.getName().equals("ir") && ctConstructor.getName().equals("ir")) {
                    CtMethod ctMethod = ctConstructor.toMethod("<init>", ctClass);
                    ControlFlow cf = new ControlFlow(ctMethod);
                    List<ControlFlow.Block> originalOrder = Arrays.stream(cf.basicBlocks()).toList();
                    if (originalOrder.size() == 1) {
                        continue;
                    }
                    if (!UtilFunctions.isObfuscated(ctClass.getName())) {
                        continue;
                    }

                    ClassNode classNode = Deobfuscator.classMapASM.get(ctClass.getName());
                    MethodNode methodNode = classNode.methods.stream().filter(mthNode -> mthNode.name.equals(ctMethod.getName()) && mthNode.desc.equals(ctMethod.getMethodInfo().getDescriptor())).findFirst().orElseThrow();

                    List<ASMBlock> blocksToSort = splitIntoBlocksASM(methodNode);
                    if (blocksToSort.size() != originalOrder.size()) {
                        System.out.println("FUCK");
                    }
//                        List<ASMBlock> sorted = topoSort(originalOrder, blocksToSort);
//
//
//                        writeNewMethod(classNode, methodNode, sorted);
//                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static List<ASMBlock> splitIntoBlocksASM(MethodNode methodNode) {

        List<ASMBlock> blocks = new ArrayList<>();
        ASMBlock block = new ASMBlock();
        int blockNumber = 0;
        for (AbstractInsnNode insnNode : methodNode.instructions) {
            block.addInstruction(insnNode);
            if (insnNode instanceof JumpInsnNode ||
                    insnNode instanceof TableSwitchInsnNode ||
                    insnNode instanceof LookupSwitchInsnNode ||
                    insnNode instanceof InsnNode && (insnNode.getOpcode() >= Opcodes.IRETURN && insnNode.getOpcode() <= Opcodes.RETURN || insnNode.getOpcode() == Opcodes.ATHROW) ||
                    insnNode instanceof LabelNode && insnNode.getNext() == null) {
                block.index = blockNumber;
                blocks.add(block);
                block = new ASMBlock();
                blockNumber++;
            }
        }


        for (ASMBlock thisBlock : blocks) {
            AbstractInsnNode lastInstruction = thisBlock.instructions.get(thisBlock.instructions.size() - 1);
            if (lastInstruction instanceof JumpInsnNode) {
                LabelNode labelTarget = ((JumpInsnNode) lastInstruction).label;
                ASMBlock jumpTarget = blocks.stream().filter(asmBlock -> asmBlock.instructions.stream().anyMatch(abstractInsnNode -> abstractInsnNode.equals(labelTarget))).findFirst().orElseThrow();
                thisBlock.addExit(jumpTarget.index);
                jumpTarget.addIncoming(thisBlock.index);
            }
        }
        return blocks;
    }

    private void writeNewMethod(ClassNode classNode, MethodNode methodNode, List<ASMBlock> finalOrder) {
        methodNode.instructions.clear();
        for (ASMBlock block : finalOrder) {
            for (AbstractInsnNode insn : block.instructions) {
                methodNode.instructions.add(insn);
//                if(insn.getOpcode() != -1) {
//                    System.out.println(Printer.OPCODES[insn.getOpcode()]);
//                }
            }
        }
    }

    private String printBlockOrder(List<ControlFlow.Block> originalOrder) {
        StringBuilder sb = new StringBuilder();
        for (ControlFlow.Block b : originalOrder) {
            sb.append(b.index() + " ");
        }
        return sb.toString();
    }

    public static List<ASMBlock> topoSort(List<ControlFlow.Block> blocks, List<ASMBlock> blocksToSort) {
        // Initialize data structures
        index = 0;
        stack = new Stack<>();
        sccList = new ArrayList<>();
        Map<ControlFlow.Block, Integer> indices = new HashMap<>();
        Map<ControlFlow.Block, Integer> lowLink = new HashMap<>();

        for (ControlFlow.Block block : blocks) {
            indices.put(block, -1);
            lowLink.put(block, -1);
        }

        // Perform DFS with Tarjan's algorithm
        for (ControlFlow.Block block : blocks) {
            if (indices.get(block) == -1) {
                dfs(block, indices, lowLink, blocks);
            }
        }

        // Reverse the SCC list to get a topological order
        Collections.reverse(sccList);

        // Create the final sorted list
        List<ASMBlock> sorted = new ArrayList<>();
        for (List<Integer> scc : sccList) {
            for (int i : scc) {
                sorted.add(blocksToSort.get(i));
            }
        }
        return sorted;
    }

    private static void dfs(ControlFlow.Block
                                    block, Map<ControlFlow.Block, Integer> indices, Map<ControlFlow.Block, Integer> lowLink,
                            List<ControlFlow.Block> blocks) {
        // Initialize the indices and low link value for this block
        indices.put(block, index);
        lowLink.put(block, index);
        index++;

        // Add the block to the stack
        stack.push(blocks.indexOf(block));

        // Recursively process each successor of the block
        for (int i = 0; i < block.exits(); i++) {
            ControlFlow.Block successor = block.exit(i);
            int successorIndex = blocks.indexOf(successor);
            if (indices.get(successor) == -1) {
                dfs(successor, indices, lowLink, blocks);
                lowLink.put(block, Math.min(lowLink.get(block), lowLink.get(successor)));
            } else if (stack.contains(successorIndex)) {
                lowLink.put(block, Math.min(lowLink.get(block), indices.get(successor)));
            }
        }

        // Check if this block is the root of an SCC
        if (lowLink.get(block).equals(indices.get(block))) {
            List<Integer> scc = new ArrayList<>();
            int successorIndex;
            do {
                successorIndex = stack.pop();
                scc.add(successorIndex);
            } while (successorIndex != blocks.indexOf(block));
            sccList.add(scc);
        }
    }
}