package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import deobfuscator.models.FoundMethod;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.Printer;
import za.org.secret.UtilFunctions;

import java.util.*;
import java.util.stream.Collectors;

import static org.objectweb.asm.Opcodes.ACC_ABSTRACT;
import static org.objectweb.asm.Opcodes.ACC_STATIC;

public class UnusedParams extends AbstractDeob {
    List<FoundMethod> methodsWithUnusedParam = new ArrayList<>();

    @Override
    public void run() {
        int fixed = 0;

        //Iterate over every class
        for (ClassNode classNode : Deobfuscator.classMapASM.values()) {

            //Iterate over every method
            for (MethodNode methodNode : classNode.methods) {
                boolean methodUsesLastParam = false;
                List<AbstractInsnNode> instructions = Arrays.stream(methodNode.instructions.toArray()).toList();

//                if(classNode.name.equals("ne") && methodNode.name.equals("ab")) {
//                    System.out.println("poes");
//                }

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

                //Iterate over every instruction
                for (AbstractInsnNode instruction : instructions) {

                    if (instruction instanceof VarInsnNode) {
                        if (((VarInsnNode) instruction).var == loadNum) {
                            methodUsesLastParam = true;
                            break;
                        }
                    }
                }

                //TODO the following condition currently only checks things that are actual opaques (from the opaque deobfuscator). Maybe I wanna remove that check later. but Ill keep for now
                if (!methodUsesLastParam && UtilFunctions.isObfuscated(classNode.name)) { // && Deobfuscator.methodsWithOpaques.contains(new FoundMethod(classNode.name, methodNode.name, methodNode.desc))) {
                    //Identifed method with unused param
                    removeLastParamFromMethodDeclarations(methodNode, classNode);
                    fixed++;
                }
            }
        }

        fixMethods();
//        for (FoundMethod method : methodsWithUnusedParam) {
//            System.out.println(method.toString());
//        }

        System.out.println("Methods with unused params: " + fixed + " (doesn't count all affected superclasses and interfaces)");
        System.out.println("Methods with unused params: " + methodsWithUnusedParam.size() + " (including superclasses and interfaces)");

//        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
//        ClassVisitor classVisitor = new CheckClassAdapter(classWriter, true);
//        Deobfuscator.classMapASM.get("ck").accept(classVisitor);
    }

    private void removeLastParamFromMethodDeclarations(MethodNode methodNode, ClassNode classNode) {
//        System.out.println("Method: " + classNode.name + "." + methodNode.name + " was detected as not using its last param:");
        //Fix the method signature in all superclasses
        if (methodsWithUnusedParam.stream().anyMatch(foundMethod -> new FoundMethod(classNode.name, methodNode.name, methodNode.desc).equals(new FoundMethod(foundMethod.className, foundMethod.name, buildNewDesc(foundMethod.desc))))) {
            return;
        }
        if(classNode.name.equals("ne") && methodNode.name.equals("ab")) {
            System.out.println("poes");
        }


        String parentClass = classNode.superName;
        while (parentClass != null && !parentClass.contains("java")) {
            ClassNode superNode = Deobfuscator.classMapASM.get(parentClass);
            for (MethodNode superMethodNode : superNode.methods) {
                if (superMethodNode.name.equals(methodNode.name) && superMethodNode.desc.equals(methodNode.desc)) {
                    if(superNode.name.equals("ne") && superMethodNode.name.equals("ab")) {
                        System.out.println("poes");
                    }
                    methodsWithUnusedParam.add(new FoundMethod(superNode.name, superMethodNode.name, superMethodNode.desc));
                    superMethodNode.desc = buildNewDesc(superMethodNode.desc);
                }
            }
            parentClass = superNode.superName;
        }

        //Fix the method signature in all interfaces
        List<String> interfaces = classNode.interfaces;
        for (String interfaceName : interfaces) {
            if (!interfaceName.contains("java")) {
                ClassNode interfaceNode = Deobfuscator.classMapASM.get(interfaceName);

                for (MethodNode interfaceMethod : interfaceNode.methods) {
                    if (interfaceMethod.name.equals(methodNode.name) && interfaceMethod.desc.equals(methodNode.desc)) {
                        if(interfaceNode.name.equals("ne") && interfaceMethod.name.equals("ab")) {
                            System.out.println("poes");
                        }
                        methodsWithUnusedParam.add(new FoundMethod(interfaceNode.name, interfaceMethod.name, interfaceMethod.desc));
                        interfaceMethod.desc = buildNewDesc(interfaceMethod.desc);
                    }
                }
            }
        }

        //Fix the base current method
        methodsWithUnusedParam.add(new FoundMethod(classNode.name, methodNode.name, methodNode.desc));
        methodNode.desc = buildNewDesc(methodNode.desc);
    }

    private void fixMethods() {
        System.out.println("Fixing method invocations");
        //Iterate over every class
        for (ClassNode classNode : Deobfuscator.classMapASM.values()) {

            List<MethodNode> methodList = classNode.methods;

            //Iterate over every method
            for (MethodNode methodNode : methodList) {
                if(classNode.name.equals("ph") && methodNode.name.equals("<init>")) {
                    System.out.println("Poes");
                }
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
                                    .filter(classToCheck -> classToCheck.name.equals(methodInsn.name) && classToCheck.desc.equals(buildNewDesc(methodInsn.desc)))
                                    .findFirst();
                            if (foundMethod.isPresent()) {
                                break;
                            }
                            classOfInvokedMethod = Deobfuscator.classMapASM.get(classOfInvokedMethod.superName);
                        }

                        List<ClassNode> interfacesOfInvokedMethod = Deobfuscator.classMapASM.get(methodInsn.owner).interfaces.stream().filter(s -> !s.contains("java")).map(interfaceName -> Deobfuscator.classMapASM.get(interfaceName)).collect(Collectors.toList());
                        for (ClassNode interfaceOfInvokedMethod : interfacesOfInvokedMethod) {
                            Optional<MethodNode> foundMethod = interfaceOfInvokedMethod.methods.stream()
                                    .filter(classToCheck -> classToCheck.name.equals(methodInsn.name) && classToCheck.desc.equals(methodInsn.desc))
                                    .findFirst();
                            if (foundMethod.isPresent()) {
                                classOfInvokedMethod = interfaceOfInvokedMethod;
                            }
                        }
                        if (classOfInvokedMethod == null) {
                            continue;
                        }

                        // If method that is being invoked is one who has an unused parameter
                        ClassNode finalClassOfInvokedMethod = classOfInvokedMethod;
                        Optional<FoundMethod> potentialMethod = methodsWithUnusedParam.stream().filter(method -> method.className.equals(finalClassOfInvokedMethod.name) && method.name.equals(methodInsn.name) && method.desc.equals(methodInsn.desc)).findFirst();
                        if (potentialMethod.isPresent()) {
                            //Dont load the param onto the operand stack
                            AbstractInsnNode instructionToRemove = instruction.getPrevious();
                            while(instructionToRemove.getOpcode() == -1) {
                                instructionToRemove = instructionToRemove.getPrevious();
                            }
//                            System.out.println(Printer.OPCODES[instructionToRemove.getOpcode()]);

                            methodNode.instructions.remove(instructionToRemove);

                            //Replace the method signature in the invocation
                            methodInsn.desc = buildNewDesc(methodInsn.desc);
                        }
                    }
                }
            }
        }
    }

    private static boolean isWhiteListed(ClassNode classNode, MethodNode methodNode, String allowedClass, String allowedMethod) {
        return classNode.name.equals(allowedClass) && methodNode.name.equals(allowedMethod);
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
