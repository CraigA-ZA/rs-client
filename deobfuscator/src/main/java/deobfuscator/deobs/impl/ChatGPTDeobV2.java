package deobfuscator.deobs.impl;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import javassist.*;
import javassist.bytecode.*;
import javassist.bytecode.analysis.ControlFlow;

import java.util.*;

public class ChatGPTDeobV2 extends AbstractDeob {
    private static int index;
    private static Stack<Integer> stack;
    private static List<List<Integer>> sccList;

    @Override
    public void run() {
        try {
//            CtClass ctClass = Deobfuscator.classMap.get("client");
            for (CtClass ctClass : Deobfuscator.classMap.values()) {
                for (CtMethod ctMethod : ctClass.getDeclaredMethods()) {
//            CtMethod ctMethod = ctClass.getDeclaredMethod("pr");

                    ControlFlow cf = new ControlFlow(ctMethod);
                    List<ControlFlow.Block> originalOrder = Arrays.stream(cf.basicBlocks()).toList();

//                List<ControlFlow.Block> sorted = topoSort(originalOrder);
//                System.out.println(ctMethod.getName());
//                System.out.println(printBlockOrder(originalOrder));
//                System.out.println(printBlockOrder(sorted));
                    writeNewMethod(ctClass, ctMethod, originalOrder);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void writeNewMethod(CtClass ctClass, CtMethod ctMethod, List<ControlFlow.Block> finalOrder) throws CannotCompileException, BadBytecode, NotFoundException {
        MethodInfo oldMethodInfo = ctMethod.getMethodInfo();
        CodeAttribute oldCodeAttribute = oldMethodInfo.getCodeAttribute();

        if (oldCodeAttribute == null) {
            return;
        }
        CodeIterator iterator = oldCodeAttribute.iterator();

        Bytecode newCode = new Bytecode(
                oldMethodInfo.getConstPool(),
                oldCodeAttribute.getMaxLocals(),
                oldCodeAttribute.getMaxStack());
        for (ControlFlow.Block block : finalOrder) {
            for (int i = block.position(); i < block.position() + block.length(); i++) {
                newCode.add(iterator.byteAt(i));
            }
        }

        MethodInfo newMethodInfo = new MethodInfo(oldMethodInfo.getConstPool(), ctMethod.getName(), oldMethodInfo, null);
        newMethodInfo.setCodeAttribute(newCode.toCodeAttribute());
//        newMethodInfo.setExceptionsAttribute()
        CtMethod newMethod = CtMethod.make(newMethodInfo, ctClass);
        ctMethod.setBody(newMethod, null);
//        ctClass.removeMethod(ctMethod);
//        ctClass.addMethod(newMethod);
    }

    private String printBlockOrder(List<ControlFlow.Block> originalOrder) {
        StringBuilder sb = new StringBuilder();
        for (ControlFlow.Block b : originalOrder) {
            sb.append(b.index() + " ");
        }
        return sb.toString();
    }

    public static List<ControlFlow.Block> topoSort(List<ControlFlow.Block> blocks) {
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
        List<ControlFlow.Block> sorted = new ArrayList<>();
        for (List<Integer> scc : sccList) {
            for (int i : scc) {
                sorted.add(blocks.get(i));
            }
        }
        return sorted;
    }

    private static void dfs(ControlFlow.Block block, Map<ControlFlow.Block, Integer> indices, Map<ControlFlow.Block, Integer> lowLink,
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