package updater.identifiers;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.TypeInsnNode;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

import java.util.Arrays;

@DependsOn({UserList.class, Ignored.class})
public class IgnoreList extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("UserList") &&
                classNode.getInstanceMethods().stream().flatMap(methodNode -> Arrays.stream(methodNode.instructions.toArray())).anyMatch(abstractInsnNode -> abstractInsnNode.getOpcode() == Opcodes.NEW && Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc).equals(TypeUtilities.getTypeOfIdentifiedClass("Ignored")));
    }
}
