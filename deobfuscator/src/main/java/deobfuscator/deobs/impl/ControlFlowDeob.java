package deobfuscator.deobs.impl;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.Bytecode;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.analysis.ControlFlow;
import javassist.bytecode.analysis.ControlFlow.Block;
import javassist.bytecode.analysis.Frame;
import javassist.bytecode.analysis.FramePrinter;

import java.util.*;

public class ControlFlowDeob extends AbstractDeob {
    LinkedList<Block> finalOrder;
    Stack<Block> stack;
    int currentDFSNum;
    Map<Block, Integer> indexList;
    Map<Block, Integer> lowLink;
    List<Block> onStack;

    @Override
    public void run() {
//        https://en.wikipedia.org/wiki/Tarjan%27s_strongly_connected_components_algorithm
//        https://imgur.com/a/g7LTc
//        https://rs-hacking.com/forum/index.php?/topic/541-block-sorting-for-control-flow-deobfuscation/&


//        for (CtClass ctClass : Deobfuscator.classMap.values()) {

        CtClass ctClass = Deobfuscator.classMap.get("client");
        try {
            for (CtMethod ctMethod : ctClass.getDeclaredMethods()) {
                try {
                    initializeGlobalVariables();
                    ControlFlow cf = new ControlFlow(ctMethod);
                    Block[] originalOrder = cf.basicBlocks();

                    List<Block> alreadyDoneVertices = new ArrayList();

                    visit(originalOrder[0]);//, alreadyDoneVertices);

                    writeNewMethod(ctClass, ctMethod);
                    System.out.println("Is done");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void writeNewMethod(CtClass ctClass, CtMethod ctMethod) throws CannotCompileException {
        CodeIterator iterator = ctMethod.getMethodInfo().getCodeAttribute().iterator();

        Bytecode newCode = new Bytecode(ctMethod.getMethodInfo().getConstPool());
        for (Block block : finalOrder) {
            for (int i = block.position(); i < block.position() + block.length(); i++) {
                newCode.add(iterator.byteAt(i));
            }
        }

        MethodInfo methodInfo = new MethodInfo(ctMethod.getMethodInfo().getConstPool(), ctMethod.getName(), ctMethod.getMethodInfo().getDescriptor());
        methodInfo.setCodeAttribute(newCode.toCodeAttribute());

        CtMethod newMethod = CtMethod.make(methodInfo, ctClass);
        ctMethod.setBody(newMethod, null);
    }

    private void initializeGlobalVariables() {
        finalOrder = new LinkedList<>();
        stack = new Stack<>();
        currentDFSNum = 0;
        indexList = new HashMap<>();
        lowLink = new HashMap<>();
        onStack = new ArrayList<>();
    }
    private void visit(Block currentVertex) {
        indexList.put(currentVertex, currentDFSNum);
        lowLink.put(currentVertex, currentDFSNum);
        currentDFSNum++;
        stack.push(currentVertex);
        onStack.add(currentVertex);

        for (int i = 0; i < currentVertex.exits(); i++) { //TODO his line has 'where child in alreadyDoneVertices'
            Block child = currentVertex.exit(i);
            if (!indexList.containsKey(child)) {
                visit(child);
                lowLink.put(child, Math.min(lowLink.get(currentVertex), lowLink.get(child)));
            } else if (onStack.contains(child)) {
                lowLink.put(currentVertex, Math.min(lowLink.get(currentVertex), indexList.get(child)));
            }
        }

        if (lowLink.get(currentVertex) == indexList.get(currentVertex)) {
            //We found a strongly connected component
            List<Block> scc = new ArrayList<>();
            Block popped;
            do {
                popped = stack.pop();
                scc.add(popped);
                onStack.remove(popped);
//                indexList.put(popped, "Done");
            } while (popped != currentVertex);


            //TODO The following part is still questionable
            if (scc.size() == 1) {
                finalOrder.addFirst(currentVertex);
            } else {
                //TODO not 100% sure yet if I want to reset the global variables when calling this
//                List<Block> orderedSCC = visit(chooseFirst(scc), scc);
//                finalOrder.addAll(0, orderedSCC);
            }
        }
    }

    private Block chooseFirst(List<Block> scc) {
        int max = -100;
        Block first = null;
        for (Block block : scc) {
            if (block.incomings() > max) {
                first = block;
                max = block.incomings();
            }
        }
        return first;
    }

    private void printControlGraph(ControlFlow controlFlow) {
        StringBuilder sb = new StringBuilder();
        for (ControlFlow.Block b : controlFlow.basicBlocks()) {
            sb.append(printBlock(b));
        }
        System.out.println(sb.toString());
    }

    private String printBlock(ControlFlow.Block b) {
        StringBuilder sb = new StringBuilder();
        sb.append("Block ID ").append(b.index()).append("\n");

        for (int i = 0; i < b.incomings(); i++) {
            sb.append(" flows from ").append(b.incoming(i).index()).append("\n");
        }

        //Output code
//        sb.append("  ").append(i.toString()).append("\n");
//
//        CodeIterator iterator = b.getCodeAttribute().iterator();
//
//        Bytecode newCode = new Bytecode(oldMethodInfo.getConstPool());
//        for (int j = b.position(); j < b.position() + b.length(); j++) {
//            newCode.add(iterator.byteAt(j));
//        }


        for (int i = 0; i < b.exits(); i++) {
            sb.append(" flows into ").append(b.exit(i).index()).append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }
}
