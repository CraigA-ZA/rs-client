package deobfuscator.deobs.impl.javassist;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.Bytecode;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.analysis.ControlFlow;

import java.util.*;

public class ChatGPTDeob extends AbstractDeob {
    LinkedList<ControlFlow.Block> finalOrder;
    Stack<ControlFlow.Block> stack;
    int currentDFSNum;
    Map<ControlFlow.Block, Integer> indexList;
    Map<ControlFlow.Block, Integer> lowLink;
    List<ControlFlow.Block> onStack;

    private void initializeGlobalVariables() {
        finalOrder = new LinkedList<>();
        stack = new Stack<>();
        currentDFSNum = 0;
        indexList = new HashMap<>();
        lowLink = new HashMap<>();
        onStack = new ArrayList<>();
    }

    @Override
    public void run() {
        try {
            CtClass ctClass = Deobfuscator.classMap.get("client");
//        for (CtClass ctClass : Deobfuscator.classMap.values()) {
//            for (CtMethod ctMethod : ctClass.getDeclaredMethods()) {
            CtMethod ctMethod = ctClass.getDeclaredMethod("pr");

            ControlFlow cf = new ControlFlow(ctMethod);
            ControlFlow.Block[] originalOrder = cf.basicBlocks();

            topologicalSort(originalOrder);
            System.out.println(ctClass.getName());
            System.out.println(ctMethod.getName());
            System.out.println(printBlockOrder(originalOrder));
            System.out.println(printBlockOrder(finalOrder));
            writeNewMethod(ctClass, ctMethod);

//            }
//        }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private String printBlockOrder(LinkedList<ControlFlow.Block> originalOrder) {
        StringBuilder sb = new StringBuilder();
        for (ControlFlow.Block b : originalOrder) {
            sb.append(b.index() + " ");
        }
        return sb.toString();
    }

    private String printBlockOrder(ControlFlow.Block[] originalOrder) {
        StringBuilder sb = new StringBuilder();
        for (ControlFlow.Block b : originalOrder) {
            sb.append(b.index() + " ");
        }
        return sb.toString();
    }

    public void topologicalSort(ControlFlow.Block[] originalOrder) {
        initializeGlobalVariables();

        for (ControlFlow.Block currentVertex : originalOrder) {
            if (!indexList.containsKey(currentVertex)) {
                visit(currentVertex);
            }
        }
    }

    private void writeNewMethod(CtClass ctClass, CtMethod ctMethod) throws CannotCompileException, BadBytecode {
        MethodInfo oldMethodInfo = ctMethod.getMethodInfo();
        if (oldMethodInfo.getCodeAttribute() == null) {
            return;
        }
        CodeIterator iterator = oldMethodInfo.getCodeAttribute().iterator();

        Bytecode newCode = new Bytecode(
                oldMethodInfo.getConstPool(),
                oldMethodInfo.getCodeAttribute().getMaxLocals(),
                oldMethodInfo.getCodeAttribute().getMaxStack());
        for (ControlFlow.Block block : finalOrder) {
            for (int i = block.position(); i < block.position() + block.length(); i++) {
                newCode.add(iterator.byteAt(i));
            }
        }

        MethodInfo newMethodInfo = new MethodInfo(oldMethodInfo.getConstPool(), ctMethod.getName(), oldMethodInfo, null);
        newMethodInfo.setCodeAttribute(newCode.toCodeAttribute());
        CtMethod newMethod = CtMethod.make(newMethodInfo, ctClass);
        ctMethod.setBody(newMethod, null);
    }

    private void visit(ControlFlow.Block currentVertex) {
        indexList.put(currentVertex, currentDFSNum);
        lowLink.put(currentVertex, currentDFSNum);
        currentDFSNum++;
        stack.push(currentVertex);
        onStack.add(currentVertex);

        for (int i = 0; i < currentVertex.exits(); i++) {
            ControlFlow.Block child = currentVertex.exit(i);
            if (!indexList.containsKey(child)) {
                visit(child);
                lowLink.put(currentVertex, Math.min(lowLink.get(currentVertex), lowLink.get(child)));
            } else if (onStack.contains(child)) {
                lowLink.put(currentVertex, Math.min(lowLink.get(currentVertex), indexList.get(child)));
            }
        }

        if (lowLink.get(currentVertex) == indexList.get(currentVertex)) {
            List<ControlFlow.Block> scc = new ArrayList<>();
            ControlFlow.Block popped;
            do {
                popped = stack.pop();
                scc.add(popped);
                onStack.remove(popped);
            } while (popped != currentVertex);

            //In this implementation we do a search into any SCCs found to topologically sort these as well.
            // But ChatGPT reckons we can just generate the SCCs in reverse topological order without this step. So I'm trying that
//            if (scc.size() == 1) {
//                finalOrder.addFirst(currentVertex);
//            } else {
//                scc = visit(chooseFirst(scc), scc);
//                finalOrder.addAll(0, scc);
//            }

            if (scc.size() == 1) {
                finalOrder.addFirst(currentVertex);
            } else {
                finalOrder.addAll(0, scc);
            }
        }
    }

    private ControlFlow.Block chooseFirst(List<ControlFlow.Block> scc) {
        int max = -100;
        ControlFlow.Block first = null;
        for (ControlFlow.Block block : scc) {
            if (block.incomings() > max) {
                first = block;
                max = block.incomings();
            }
        }
        return first;
    }
}