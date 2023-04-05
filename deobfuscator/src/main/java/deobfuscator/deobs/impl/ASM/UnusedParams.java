package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import deobfuscator.models.FoundMethod;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.objectweb.asm.Opcodes.ACC_STATIC;

public class UnusedParams extends AbstractDeob {
    @Override
    public void run() {
        int fixed = 0;
        List<FoundMethod> methodsWithUnusedParam = new ArrayList<>();

        //Iterate over every class
        for (ClassNode classNode : Deobfuscator.classMapASM.values()) {
            if (classNode.name.equals("client")) {

                List<MethodNode> methodList = classNode.methods;
                boolean methodUsesLastParam = false;
                //Iterate over every method
                for (MethodNode methodNode : methodList) {
                    if (methodNode.name.equals("ba")) {
                        List<AbstractInsnNode> instructions = Arrays.stream(methodNode.instructions.toArray()).toList();

                        Type[] types = Type.getArgumentTypes(methodNode.desc);
                        int loadNum = (methodNode.access & ACC_STATIC) > 0 ? types.length - 1 : types.length;
                        //Iterate over every instruction
                        for (AbstractInsnNode instruction : instructions) {

                            if (instruction instanceof VarInsnNode) {
                                if (((VarInsnNode) instruction).var == loadNum) {
                                    methodUsesLastParam = true;
                                    break;
                                }
                            }
                        }
                        if (!methodUsesLastParam) {
                            //Identify method with unused param
                            System.out.println("Identified method with unused param " + classNode.name + "." + methodNode.name);
                            methodsWithUnusedParam.add(new FoundMethod(classNode.name, methodNode.name, methodNode.desc));
                            fixed++;
                        }
                    }
                }
            }
        }
        fixMethods(methodsWithUnusedParam);

        System.out.println("Unused params: " + fixed);
    }

    private void fixMethods(List<FoundMethod> methodsWithUnusedParam) {
        int fixed = 0;
        System.out.println("Fixing methods");
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

                        //If method that is being invoked is one who has an unused parameter
                        Optional<FoundMethod> potentialMethod = methodsWithUnusedParam.stream().filter(method -> method.name.equals(methodInsn.name) && method.desc.equals(methodInsn.desc)).findFirst();
                        if (potentialMethod.isPresent()) {
                            System.out.println("Found a method calling an identified method: " + classNode.name + "." + methodNode.name + " calls " + potentialMethod.get().className + "." + potentialMethod.get().name + " so we are fixing the invocation");
                            //Dont load the param onto the operand stack
                            methodNode.instructions.remove(instruction.getPrevious());

                            //Replace the method signature in the invocation
                            methodInsn.desc = buildNewDesc(methodInsn.desc);
                        }
                    }
                }

                //If we have encountered a method declaration that matches one of the methods with an unused param
                Optional<FoundMethod> potentialMethod = methodsWithUnusedParam.stream().filter(method -> method.className.equals(classNode.name) && method.name.equals(methodNode.name) && method.desc.equals(methodNode.desc)).findFirst();
                if (potentialMethod.isPresent()) {
                    System.out.println("Found where method " + potentialMethod.get().className + "." + potentialMethod.get().name + " is declared. Fixing it");

                    //Fix the method signature in all superclasses
                    String parentClass = classNode.superName;
                    while (parentClass != null && !parentClass.contains("java")) {
                        ClassNode superNode = Deobfuscator.classMapASM.get(parentClass);
                        for (MethodNode superMethodNode : superNode.methods) {
                            if (superMethodNode.name.equals(methodNode.name) && superMethodNode.desc.equals(methodNode.desc)) {
                                System.out.println("The method was also found in the parent class: " + parentClass + " so we are fixing the signature there as well");
                                superMethodNode.desc = buildNewDesc(superMethodNode.desc);
                            }
                        }
                        parentClass = superNode.superName;
                    }

                    //Fix the method signature in all interfaces
                    List<String> interfaces = classNode.interfaces;
                    for(String interfaceName: interfaces) {
                        ClassNode interfaceNode = Deobfuscator.classMapASM.get(interfaceName);
                        for (MethodNode interfaceMethod : interfaceNode.methods) {
                            if (interfaceMethod.name.equals(methodNode.name) && interfaceMethod.desc.equals(methodNode.desc)) {
                                System.out.println("The method was also found in the interface: " + interfaceName + " so we are fixing the signature there as well");
                                interfaceMethod.desc = buildNewDesc(interfaceMethod.desc);
                            }
                        }
                    }

                    //Fix the base current method
                    System.out.println("Fixing base declaration too");
                    methodNode.desc = buildNewDesc(methodNode.desc);
                    fixed++;

                    methodsWithUnusedParam.remove(potentialMethod.get());
                }
            }
        }
        System.out.println("Fixed " + fixed + " base method declarations (ignoring superclass, etc)");
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
