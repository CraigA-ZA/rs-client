package updater.identifiers;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

import java.util.Arrays;

@DependsOn(DualNode.class)
public class InvType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 1 &&
                !classNode.isAbstract() &&
                classNode.getInstanceMethods().stream().flatMap(methodNode -> Arrays.stream(methodNode.instructions.toArray())).anyMatch(abstractInsnNode -> abstractInsnNode.getOpcode() == Opcodes.ICONST_2);
    }
}
