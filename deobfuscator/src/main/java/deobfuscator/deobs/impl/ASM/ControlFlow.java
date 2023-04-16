package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.*;

public class ControlFlow extends AbstractDeob {
    private static int index;
    private static Stack<Integer> stack;
    private static List<List<Integer>> sccList;

    @Override
    public void run() {
//        try {
//            for (ClassNode ctClass : Deobfuscator.classMapASM.values()) {
//                for (MethodNode ctMethod : ctClass.methods) {
//
//                    ControlFlow cf = new ControlFlow(ctMethod);
//                    List<ControlFlow.Block> originalOrder = Arrays.stream(cf.basicBlocks()).toList();
//
//                    List<ControlFlow.Block> sorted = topoSort(originalOrder);
//                    System.out.println(printBlockOrder(originalOrder));
//                    System.out.println(printBlockOrder(sorted));
//                }
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }

//    private String printBlockOrder(List<javassist.bytecode.analysis.ControlFlow.Block> originalOrder) {
//        StringBuilder sb = new StringBuilder();
//        for (javassist.bytecode.analysis.ControlFlow.Block b : originalOrder) {
//            sb.append(b.index() + " ");
//        }
//        return sb.toString();
//    }

//    public static List<javassist.bytecode.analysis.ControlFlow.Block> topoSort(List<javassist.bytecode.analysis.ControlFlow.Block> blocks) {
//        // Initialize data structures
//        index = 0;
//        stack = new Stack<>();
//        sccList = new ArrayList<>();
//        Map<javassist.bytecode.analysis.ControlFlow.Block, Integer> indices = new HashMap<>();
//        Map<javassist.bytecode.analysis.ControlFlow.Block, Integer> lowLink = new HashMap<>();
//
//        for (javassist.bytecode.analysis.ControlFlow.Block block : blocks) {
//            indices.put(block, -1);
//            lowLink.put(block, -1);
//        }
//
//        // Perform DFS with Tarjan's algorithm
//        for (javassist.bytecode.analysis.ControlFlow.Block block : blocks) {
//            if (indices.get(block) == -1) {
//                dfs(block, indices, lowLink, blocks);
//            }
//        }
//
//        // Reverse the SCC list to get a topological order
//        Collections.reverse(sccList);
//
//        // Create the final sorted list
//        List<javassist.bytecode.analysis.ControlFlow.Block> sorted = new ArrayList<>();
//        for (List<Integer> scc : sccList) {
//            for (int i : scc) {
//                sorted.add(blocks.get(i));
//            }
//        }
//        return sorted;
//    }

//    private static void dfs(javassist.bytecode.analysis.ControlFlow.Block block, Map<javassist.bytecode.analysis.ControlFlow.Block, Integer> indices, Map<javassist.bytecode.analysis.ControlFlow.Block, Integer> lowLink,
//                            List<javassist.bytecode.analysis.ControlFlow.Block> blocks) {
//        // Initialize the indices and low link value for this block
//        indices.put(block, index);
//        lowLink.put(block, index);
//        index++;
//
//        // Add the block to the stack
//        stack.push(blocks.indexOf(block));
//
//        // Recursively process each successor of the block
//        for (int i = 0; i < block.exits(); i++) {
//            javassist.bytecode.analysis.ControlFlow.Block successor = block.exit(i);
//            int successorIndex = blocks.indexOf(successor);
//            if (indices.get(successor) == -1) {
//                dfs(successor, indices, lowLink, blocks);
//                lowLink.put(block, Math.min(lowLink.get(block), lowLink.get(successor)));
//            } else if (stack.contains(successorIndex)) {
//                lowLink.put(block, Math.min(lowLink.get(block), indices.get(successor)));
//            }
//        }
//
//        // Check if this block is the root of an SCC
//        if (lowLink.get(block).equals(indices.get(block))) {
//            List<Integer> scc = new ArrayList<>();
//            int successorIndex;
//            do {
//                successorIndex = stack.pop();
//                scc.add(successorIndex);
//            } while (successorIndex != blocks.indexOf(block));
//            sccList.add(scc);
//        }
//    }
}