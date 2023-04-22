package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMethodsByLineNumber extends AbstractDeob {
    @Override
    public void run() {
        Deobfuscator.classMapASM.values().forEach(classNode -> {
            Map<MethodNode, Integer> lineNums = classNode.methods.stream().collect(Collectors.toMap(methodNode -> methodNode, methodNode -> firstLineNum(methodNode) != null ? firstLineNum(methodNode) : Integer.MAX_VALUE));
            classNode.methods.sort(Comparator.comparingInt(lineNums::get));
        });
    }

    private Integer firstLineNum(MethodNode methodNode) {
        for (int i = 0; i < methodNode.instructions.size(); i++) {
            if (methodNode.instructions.get(i) instanceof LineNumberNode) {
                return ((LineNumberNode) methodNode.instructions.get(i)).line;
            }
        }
        return null;
    }
}
