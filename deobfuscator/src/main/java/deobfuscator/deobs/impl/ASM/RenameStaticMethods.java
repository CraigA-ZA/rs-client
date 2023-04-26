package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import shared.model.FoundMethod;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import shared.UtilFunctions;

import java.util.*;

import static org.objectweb.asm.Opcodes.ACC_STATIC;

public class RenameStaticMethods extends AbstractDeob {
    List<FoundMethod> methodsToRename = new ArrayList<>();
    private final String SUFFIX = "_renamed";

    @Override
    public void run() {
        //Iterate over every class
        for (ClassNode classNode : Deobfuscator.classMapASM.values()) {

            List<MethodNode> methodList = classNode.methods;

            //Iterate over every method
            for (MethodNode methodNode : methodList) {

                if ((methodNode.access & ACC_STATIC) == 0) {
                    continue;
                }
                Type[] types = Type.getArgumentTypes(methodNode.desc);

                //If method has no params, or if the method is abstract, or if the last param isnt an INT, SHORT or BYTE, we skip this method
                if (!UtilFunctions.isObfuscated(classNode.name)) {
                    continue;
                }
                if (types.length == 0) {
                    continue;
                }
                if (!Set.of(Type.INT_TYPE, Type.SHORT_TYPE, Type.BYTE_TYPE).contains(types[types.length - 1])) {
                    continue;
                }


                methodsToRename.add(new FoundMethod(classNode.name, methodNode.name, methodNode.desc));
            }
        }

        fixMethodInvocations();

        renameMethods();
    }

    private void renameMethods() {
        int count = 0;
        for (FoundMethod foundMethod : methodsToRename) {
            ClassNode classNode = Deobfuscator.classMapASM.get(foundMethod.className);

            for (MethodNode methodNode : classNode.methods) {
                if (methodNode.name.equals(foundMethod.name) && methodNode.desc.equals(foundMethod.desc)) {
                    methodNode.name = methodNode.name + SUFFIX;
                    count++;
                }
            }
        }
        System.out.println("Renamed " + count + " static methods");
    }

    private void fixMethodInvocations() {
        for (ClassNode classNode : Deobfuscator.classMapASM.values()) {

            List<MethodNode> methodList = classNode.methods;

            //Iterate over every method
            for (MethodNode methodNode : methodList) {
                List<AbstractInsnNode> instructions = Arrays.stream(methodNode.instructions.toArray()).toList();

                //Iterate over every instruction
                for (AbstractInsnNode instruction : instructions) {

                    //If instruction is invoking another method
                    if (instruction instanceof MethodInsnNode) {
                        MethodInsnNode methodInsn = (MethodInsnNode) instruction;

                        if (methodInsn.owner.contains("java")) {
                            continue;
                        }

                        ClassNode classOfInvokedMethod = Deobfuscator.classMapASM.get(methodInsn.owner);
                        while (classOfInvokedMethod != null) {
                            Optional<MethodNode> foundMethod = classOfInvokedMethod.methods.stream()
                                    .filter(classToCheck -> classToCheck.name.equals(methodInsn.name) && classToCheck.desc.equals(methodInsn.desc))
                                    .findFirst();
                            if (foundMethod.isPresent()) {
                                break;
                            }
                            classOfInvokedMethod = Deobfuscator.classMapASM.get(classOfInvokedMethod.superName);
                        }

                        if (classOfInvokedMethod == null) {
                            continue;
                        }
//
//                        // If method that is being invoked is one who has an unused parameter
                        ClassNode finalClassOfInvokedMethod = classOfInvokedMethod;
                        Optional<FoundMethod> potentialMethod = methodsToRename.stream().filter(method -> method.className.equals(finalClassOfInvokedMethod.name) && method.name.equals(methodInsn.name) && method.desc.equals(methodInsn.desc)).findFirst();
                        if (potentialMethod.isPresent()) {
                            //Replace the method signature in the invocation
                            methodInsn.name = methodInsn.name + SUFFIX;
                        }
                    }
                }
            }
        }
    }
}
