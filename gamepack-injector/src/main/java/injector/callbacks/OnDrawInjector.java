package injector.callbacks;

import deobfuscator.deobs.AbstractDeob;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;
import shared.model.IdClass;

import static injector.Injector.classNodes;

public class OnDrawInjector extends AbstractCallbackInjector {
    @Override
    public void run() {
        IdClass gameShell = findClassMapping("Client");
        ClassNode gameshellClass = classNodes.get(gameShell.name);
        String onRenderObfName = findOriginalMethodNameFromMapping(gameShell, "draw");

        for(MethodNode method: gameshellClass.methods) {
            if(method.name.equals(onRenderObfName)) {
                InsnList list = new InsnList();
                list.add(new FieldInsnNode(Opcodes.GETSTATIC, "client", "callbacks", callbacksType));
                list.add(new MethodInsnNode(Opcodes.INVOKEINTERFACE, "callbacks/Callbacks", "onDraw", "()V", true));
                method.instructions.insertBefore(method.instructions.getFirst(), list);
            }
        }
    }
}
