package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class UnusedTryCatchRemover extends AbstractDeob {
    @Override
    public void run() {
        int count = 0;
        for(ClassNode classNode: Deobfuscator.classMapASM.values()) {
            for(MethodNode methodNode: classNode.methods) {
                int size = methodNode.tryCatchBlocks.size();
                methodNode.tryCatchBlocks.removeIf(tryCatchBlockNode -> tryCatchBlockNode.type != null && tryCatchBlockNode.type.equals(Type.getInternalName(RuntimeException.class)));
                count += size - methodNode.tryCatchBlocks.size();
            }
        }
        System.out.println("Removed " + count + " try catches");
    }
}
