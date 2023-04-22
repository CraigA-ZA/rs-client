package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

import java.lang.reflect.Modifier;
import java.util.Comparator;

public class SortFieldsByModifiers extends AbstractDeob {
    @Override
    public void run() {
        for (ClassNode classNode : Deobfuscator.classMapASM.values()) {
            classNode.fields.sort(FIELD_COMPARATOR);
        }
    }

    private static final Comparator<FieldNode> FIELD_COMPARATOR = Comparator.comparing((FieldNode f) -> !Modifier.isStatic(f.access))
            .thenComparing(f -> Modifier.toString(f.access & Modifier.fieldModifiers()))
            .thenComparing(f -> Type.getType(f.desc).getClassName())
            .thenComparing(f -> f.name);
}
