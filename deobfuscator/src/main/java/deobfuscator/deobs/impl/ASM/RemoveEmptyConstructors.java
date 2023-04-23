package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.Iterator;
import java.util.List;

public class RemoveEmptyConstructors extends AbstractDeob {
    private static final List<String> EXCEPTIONS_LIST = List.of(Type.getType(Throwable.class).getInternalName());

    @Override
    public void run() {
        int removedCount = 0;

        for (ClassNode c : Deobfuscator.classMapASM.values()) {
            Iterator<MethodNode> methods = c.methods.iterator();
            while (methods.hasNext()) {
                MethodNode m = methods.next();
                if (isErrorConstructor(m)) {
                    methods.remove();
                    removedCount++;
                }
            }
        }
        System.out.println("Removed " + removedCount + " empty constructors");
    }

    private static boolean isErrorConstructor(MethodNode m) {
        if (!m.name.equals("<init>")) return false;
        if (Type.getArgumentTypes(m.desc).length > 0) return false;
        if (!m.exceptions.equals(EXCEPTIONS_LIST)) return false;

        Iterator<AbstractInsnNode> insns = List.of(m.instructions.toArray())
                .stream().filter(n -> n.getOpcode() > 0).iterator();

        if (!insns.hasNext() || insns.next().getOpcode() != Opcodes.ALOAD) return false;
        if (!insns.hasNext() || insns.next().getOpcode() != Opcodes.INVOKESPECIAL) return false;
        if (!insns.hasNext() || insns.next().getOpcode() != Opcodes.NEW) return false;
        if (!insns.hasNext() || insns.next().getOpcode() != Opcodes.DUP) return false;
        if (!insns.hasNext() || insns.next().getOpcode() != Opcodes.INVOKESPECIAL) return false;
        if (!insns.hasNext() || insns.next().getOpcode() != Opcodes.ATHROW) return false;
        return !insns.hasNext();
    }

}
