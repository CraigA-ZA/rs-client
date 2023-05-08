package injector.callbacks;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;
import shared.model.IdClass;
import shared.model.IdField;

import java.util.Arrays;

import static injector.Injector.classNodes;

public class RepaintInjector extends AbstractCallbackInjector {
    @Override
    public void run() {
        IdClass rasterProvider = findClassMapping("RasterProvider");
        ClassNode rasterProviderClassNode = classNodes.get(rasterProvider.name);
        String drawFullObfName = findOriginalMethodNameFromMapping(rasterProvider, "drawFull");
        IdField imageField = findOriginalFieldNameFromMapping(rasterProvider, "image");


        for(MethodNode method: rasterProviderClassNode.methods) {
            if(method.name.equals(drawFullObfName)) {
                InsnList list = new InsnList();

                list.add(new FieldInsnNode(Opcodes.GETSTATIC, "client", "callbacks", callbacksType));
                list.add(new VarInsnNode(Opcodes.ALOAD, 0));
                list.add(new FieldInsnNode(Opcodes.GETFIELD, rasterProvider.name, imageField.name, imageField.descriptor));
                list.add(new MethodInsnNode(Opcodes.INVOKEINTERFACE, "callbacks/Callbacks", "repaint", "(" + imageField.descriptor + ")V", true));
                method.instructions.insertBefore(Arrays.stream(method.instructions.toArray()).filter(abstractInsnNode -> abstractInsnNode.getOpcode() == Opcodes.GETFIELD).findFirst().orElseThrow(() -> new RuntimeException("Instruction not found")), list);
            }
        }
    }
}
