package injector.callbacks;

import callbacks.Callbacks;
import deobfuscator.deobs.AbstractDeob;
import injector.Injector;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;
import shared.Constants;
import shared.model.IdClass;

import static injector.Injector.classNodes;
import static injector.Injector.identifiedClasses;

public class OnTickInjector extends AbstractCallbackInjector {
    @Override
    public void run() {
        IdClass gameShell = findClassMapping("Client");
        ClassNode gameshellClass = classNodes.get(gameShell.name);
        String onTickObfName = findOriginalMethodNameFromMapping(gameShell, "doCycle");

        for(MethodNode method: gameshellClass.methods) {
            if(method.name.equals(onTickObfName)) {
                InsnList list = new InsnList();

                list.add(new FieldInsnNode(Opcodes.GETSTATIC, "client", "callbacks", callbacksType));
                list.add(new MethodInsnNode(Opcodes.INVOKEINTERFACE, "callbacks/Callbacks", "onTick", "()V", true));
                method.instructions.insertBefore(method.instructions.getFirst(), list);
            }
        }
    }
}
