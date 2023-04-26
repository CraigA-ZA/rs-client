package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import shared.model.FoundMethod;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;
import shared.UtilFunctions;

import java.util.*;

import static org.objectweb.asm.Opcodes.ACC_ABSTRACT;
import static org.objectweb.asm.Opcodes.ACC_STATIC;

public class UnusedParams extends AbstractDeob {
    List<FoundMethod> methodsWithUnusedParam = new ArrayList<>();

    @Override
    public void run() {

        //Iterate over every class
        for (ClassNode classNode : Deobfuscator.classMapASM.values()) {

            //Iterate over every method
            for (MethodNode methodNode : classNode.methods) {
                boolean methodUsesLastParam = false;

                //Get load number for the last param in the method
                Type[] types = Type.getArgumentTypes(methodNode.desc);
                int loadNum = Arrays.stream(types).mapToInt(Type::getSize).sum() - ((methodNode.access & ACC_STATIC) > 0 ? 1 : 0);

                //If method has no params, or if the method is abstract, or if the last param isnt an INT, SHORT or BYTE, we skip this method
                if (types.length == 0) {
                    continue;
                }
                if (!Set.of(Type.INT_TYPE, Type.SHORT_TYPE, Type.BYTE_TYPE).contains(types[types.length - 1])) {
                    continue;
                }
                if ((methodNode.access & ACC_ABSTRACT) != 0) {
                    continue;
                }

                List<AbstractInsnNode> instructions =  List.of(methodNode.instructions.toArray());

                //Iterate over every instruction
                for (AbstractInsnNode instruction : instructions) {

                    if (instruction instanceof VarInsnNode && ((VarInsnNode) instruction).var == loadNum) {
                            methodUsesLastParam = true;
                            break;
                    }
                }

                if (!methodUsesLastParam && UtilFunctions.isObfuscated(classNode.name)) { // && Deobfuscator.methodsWithOpaques.contains(new FoundMethod(classNode.name, methodNode.name, methodNode.desc))) {
                    //Identifed method with unused param
                    markMethod(methodNode, classNode);
                }
            }
        }

        fixInvokes();
        fixMethodSignatures();

        System.out.println("Methods with unused params: " + methodsWithUnusedParam.size());
    }

    private void fixMethodSignatures() {
        for (FoundMethod foundMethod : methodsWithUnusedParam) {
            ClassNode classNode = Deobfuscator.classMapASM.get(foundMethod.className);

            for (MethodNode methodNode : classNode.methods) {
                if (methodNode.name.equals(foundMethod.name) && methodNode.desc.equals(foundMethod.desc)) {
                    methodNode.desc = buildNewDesc(methodNode.desc);
                }
            }
        }
    }

    private void markMethod(MethodNode methodNode, ClassNode classNode) {
        //Finding and marking the method in all superclasses
        String parentClass = classNode.superName;
        while (parentClass != null && !parentClass.contains("java")) {
            ClassNode superNode = Deobfuscator.classMapASM.get(parentClass);
            for (MethodNode superMethodNode : superNode.methods) {
                if (superMethodNode.name.equals(methodNode.name) && superMethodNode.desc.equals(methodNode.desc)) {
                    methodsWithUnusedParam.add(new FoundMethod(superNode.name, superMethodNode.name, superMethodNode.desc));
                }
            }
            parentClass = superNode.superName;
        }

        //Finding and marking the method in all interfaces
        List<String> interfaces = classNode.interfaces;
        for (String interfaceName : interfaces) {
            if (!interfaceName.contains("java")) {
                ClassNode interfaceNode = Deobfuscator.classMapASM.get(interfaceName);

                for (MethodNode interfaceMethod : interfaceNode.methods) {
                    if (interfaceMethod.name.equals(methodNode.name) && interfaceMethod.desc.equals(methodNode.desc)) {
                        methodsWithUnusedParam.add(new FoundMethod(interfaceNode.name, interfaceMethod.name, interfaceMethod.desc));
                    }
                }
            }
        }

        //Marking the base method
        methodsWithUnusedParam.add(new FoundMethod(classNode.name, methodNode.name, methodNode.desc));
    }

    private void fixInvokes() {
        //Iterate over every class
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
                        Optional<FoundMethod> potentialMethod = methodsWithUnusedParam.stream().filter(method -> method.className.equals(finalClassOfInvokedMethod.name) && method.name.equals(methodInsn.name) && method.desc.equals(methodInsn.desc)).findFirst();
                        if (potentialMethod.isPresent()) {
                            //Dont load the param onto the operand stack
                            methodNode.instructions.remove(instruction.getPrevious());

                            //Replace the method signature in the invocation
                            methodInsn.desc = buildNewDesc(methodInsn.desc);
                        }
                    }
                }
            }
        }
    }

    @NotNull
    private static String buildNewDesc(String originalDesc) {
        StringBuilder newDesc = new StringBuilder("(");
        Type[] types = Type.getArgumentTypes(originalDesc);
        for (int i = 0; i < types.length - 1; i++) {
            newDesc.append(types[i].getDescriptor());
        }
        newDesc.append(")" + Type.getReturnType(originalDesc).getDescriptor());
        return newDesc.toString();
    }
}
