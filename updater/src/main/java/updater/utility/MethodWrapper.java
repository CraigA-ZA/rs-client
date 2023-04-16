package updater.utility;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import za.org.secret.FoundMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Getter
@Setter
public class MethodWrapper {
    private final MethodNode methodNode;

    public boolean returnTypeEquals(Type type) {
        return Type.getReturnType(methodNode.desc).equals(type);
    }

    public List<Type> getArguments() {
        return Arrays.stream(Type.getArgumentTypes(methodNode.desc)).toList();
    }

    public List<FoundMethod> getInvokedMethods() {
        return Arrays.stream(methodNode.instructions.toArray()).filter(abstractInsnNode -> abstractInsnNode instanceof MethodInsnNode).map(abstractInsnNode -> {
            MethodInsnNode methodInsnNode = (MethodInsnNode) abstractInsnNode;
            return new FoundMethod(methodInsnNode.owner, methodInsnNode.name, methodNode.desc);
        }).collect(Collectors.toList());
    }
}
