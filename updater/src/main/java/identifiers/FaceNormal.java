package identifiers;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.FieldInsnNode;
import utility.ClassWrapper;

import java.util.Arrays;

public class FaceNormal extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().size() == 3 &&
                classNode.getInstanceFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.INT_TYPE)) &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getConstructors().size() == 1 &&
                Arrays.stream(classNode.getConstructors().get(0).instructions.toArray()).noneMatch(abstractInsnNode -> abstractInsnNode instanceof FieldInsnNode) &&
                classNode.getStaticMethods().size() == 1; //This line was mine, not from original source. But without it, I was left with 2 classes
    }
}
