package deobfuscator.deobs.impl;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.analysis.ControlFlow;
import javassist.bytecode.analysis.ControlFlow.Block;

import java.util.*;

public class ControlFlowDeob extends AbstractDeob {
    LinkedList<Block> finalOrder;
    Stack<Block> stack;
    int currentDFSNum;
    Map<Block, Integer> indexList;
    Map<Block, Integer> lowLink;

    @Override
    public void run() {
        for (CtClass ctClass : Deobfuscator.classMap.values()) {
            for (CtMethod ctMethod : ctClass.getDeclaredMethods()) {
                try {
                    ControlFlow cf = new ControlFlow(ctMethod);
                    Block[] originalBlocks = cf.basicBlocks();

                    List<Block> alreadyDoneVertices = new ArrayList();

                    getOrder(originalBlocks[0], alreadyDoneVertices);

                    rebuildFromOrder(originalBlocks, finalOrder);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private void resetGlobalVariables() {
        finalOrder = new LinkedList<>();
        stack = new Stack<>();
        currentDFSNum = 0;
        indexList = new HashMap<>();
        lowLink = new HashMap<>();
    }

    private void rebuildFromOrder(Block[] originalBlocks, List<Block> finalOrder) {
        //TODO
    }

    private void visit(Block currentVertex) {
        indexList.put(currentVertex, currentDFSNum);
        lowLink.put(currentVertex, currentDFSNum);
        currentDFSNum++;

        stack.push(currentVertex);

        for(int i = 0; i < currentVertex.exits(); i++) { //TODO his line has 'where child in alreadyDoneVertices'
            Block child = currentVertex.exit(i);
            if(indexList.get(child) == "To be done") {
                visit(child);
                lowLink.put(child, Math.min(lowLink.get(currentVertex), lowLink.get(child)));
            } else if(indexList.get(child) == "Done") {
                //Do nothing
            } else {
                lowLink.put(currentVertex, Math.min(lowLink.get(currentVertex), indexList.get(child)));
            }
        }

        if(lowLink.get(currentVertex) == indexList.get(currentVertex)) {
            //We found a strongly connected component
            List<Block> scc = new ArrayList<>();
            Block popped;
            do {
                popped = stack.pop();
                scc.add(popped);
                indexList.put(popped, "Done");
            } while(popped != currentVertex);

            if(scc.size() == 1) {
                finalOrder.addFirst(currentVertex);
            } else {
                List<Block> orderedSCC = getOrder(chooseFirst(scc), scc);
                finalOrder.addAll(0, orderedSCC);
            }
        }
    }

    private List<Block> getOrder(Block firstVertex, List<Block> blocksToConsider) {
        resetGlobalVariables();
        for(Block block: blocksToConsider) {
            indexList.put(block, "To be done");
        }

        indexList.put(firstVertex, "Done");

        for(int i = 0; i < firstVertex.exits(); i++) { //TODO his line has 'where child in alreadyDoneVertices'
            Block child = firstVertex.exit(i);
            if(indexList.get(child) == "To be done") {
                visit(child);
            }
        }
        finalOrder.addFirst(firstVertex);

        //TODO there might be a few missing lines here;
        return finalOrder;
    }

    private Block chooseFirst(List<Block> scc) {
        int max = -100;
        Block first = null;
        for(Block block: scc) {
            if(block.incomings() > max) {
                first = block;
                max = block.incomings();
            }
        }
        return first;
    }
}
