package identifiers;

import javassist.bytecode.Opcode;
import utility.ClassWrapper;

import java.util.Arrays;

public class WorldComparator_broken extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return false;
//        return classNode.getInterfaces().stream().anyMatch(s -> s.equals("java/util/Comparator")) &&
//                classNode.getInstanceFields().isEmpty() &&
//                classNode.getInstanceMethods().stream().flatMap(methodNode -> Arrays.stream(methodNode.instructions.toArray())).anyMatch(abstractInsnNode -> abstractInsnNode.getOpcode() == Opcode.GETFIELD);
        //TODO I'm missing && abstractInsnNode.fieldId == field<GrandExchangeEvent.world>().id }
        //I couldnt do it because I havent identified GrandExchangeEvent.world
    }
}
