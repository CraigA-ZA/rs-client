import javassist.*;
import javassist.bytecode.*;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import za.org.secret.Constants;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;

public class Deobfuscator {
    public static void main(String[] args) throws IOException {
        //TODO: Goal is Removed : 9182/16423
        //TODO dont forget to run the findRedundantMethods a few times after removing

        Map<String, CtClass> classMapJavassist = loadJarJavassist(Constants.GAMEPACK_OUTPUT_DIR + Constants.OUTPUT_FILE_NAME);
        HashMap<String, ClassNode> classMapASM = loadJarASM(Constants.GAMEPACK_OUTPUT_DIR + Constants.OUTPUT_FILE_NAME);

        findRedundantMethodsJavassist(classMapJavassist);
        System.out.println("\n\n\n\n\n");
        findRedundantMethodsASM(classMapASM);
    }

    private static void findRedundantMethodsJavassist(Map<String, CtClass> classMap) {
        // Create a set to store used method names
        ArrayList<FoundMethod> usedMethods = new ArrayList<>();
        ArrayList<FoundMethod> allMethods = new ArrayList<>();

        //Loop over each class
//        CtClass analysedClass = classMap.get("at");
        for (CtClass analysedClass : classMap.values()) {
//            System.out.println("Scanning class: " + analysedClass.getName());
            //TODO this interfaces section is just missing the 5 <clinit> functions that get picked up in the ASM version. I assume this doesnt really matter though
//            scanInterfacesAndMarkAllMethodsAsUsed(usedMethods, analysedClass);

            //Add all constructors to the used methods
            //This is quite different from the ASM section. But I actually think this one is more accurate. It just misses all the <clinits> again, just like above. But the ASM one includes all ".init" function calls, which arent the same as <init>.
//            markAllConstructorsAsUsed(usedMethods, analysedClass);

            scanConstructorsAndMarkInvokedMethodsAsUsed(classMap, usedMethods, analysedClass);

            // Loop through each method in the class
            //TODO I think I need to loop over all constructors as well and find all methods called within them
            for (CtMethod ctMethod : analysedClass.getDeclaredMethods()) {
//                System.out.println("\t\tScanning Method: " + ctMethod.getName());
                MethodInfo methodInfo = ctMethod.getMethodInfo();

                FoundMethod foundMethod = new FoundMethod(analysedClass.getName(), methodInfo.getName(), methodInfo.getDescriptor());

//                if(!allMethods.contains(foundMethod)) {
//                    allMethods.add(foundMethod);
//                }
                /* check if its an abstract method */
                //This section works hundreds
//                if (Modifier.isAbstract(methodInfo.getAccessFlags())) {
//                    checkAndAdd(foundMethod, usedMethods); // if its an abstract method we must add it
//                }

                //TODO this section works great except it doesnt add all of the <clinit> or even <init> functions. Probably need to add all constructors to the used list as well
//                markAllInheritedMethodsAsUsed(usedMethods, analysedClass, methodInfo);


                findAllMethodCallsWithinCode(classMap, usedMethods, analysedClass, methodInfo);
            }
        }

//        ArrayList<FoundMethod> methodsToRemove = new ArrayList<>();
//        for (FoundMethod mi : allMethods) {
//            if (!usedMethods.contains(mi)) {
//                methodsToRemove.add(mi);
//            }
//        }
//        System.out.println("Removed : " + methodsToRemove.size() + "/" + allMethods.size());
        System.out.println(usedMethods.stream().sorted(Comparator.comparing(FoundMethod::getClassName).thenComparing(FoundMethod::getName).thenComparing(FoundMethod::getDesc)).collect(Collectors.toList()));
    }

    private static void scanConstructorsAndMarkInvokedMethodsAsUsed(Map<String, CtClass> classMap, ArrayList<FoundMethod> usedMethods, CtClass analysedClass) {
        for (CtConstructor ctConstructor : analysedClass.getDeclaredConstructors()) {
            findAllMethodCallsWithinCode(classMap, usedMethods, analysedClass, ctConstructor.getMethodInfo());
        }
    }

    private static void markAllConstructorsAsUsed(ArrayList<FoundMethod> usedMethods, CtClass analysedClass) {
        for (CtConstructor ctConstructor : analysedClass.getDeclaredConstructors()) {
            checkAndAdd(new FoundMethod(analysedClass.getName(), ctConstructor.getMethodInfo().getName(), ctConstructor.getMethodInfo().getDescriptor()), usedMethods);
        }
    }

    private static void scanInterfacesAndMarkAllMethodsAsUsed(ArrayList<FoundMethod> usedMethods, CtClass analysedClass) {
        try {
            //For each interface that this class implements
            for (CtClass analysedClassesInterface : analysedClass.getInterfaces()) {
                //Iterate over every method declared in the interface
                for (CtMethod interfaceMethod : analysedClassesInterface.getDeclaredMethods()) {
                    //Add method to used methods, with the analysedClasses name.
                    //This is done because you obviously cant remove a method from the class if it is in its interface. Even if its not used
                    checkAndAdd(new FoundMethod(analysedClass.getName(), interfaceMethod.getName(), interfaceMethod.getMethodInfo().getDescriptor()), usedMethods);
                }
            }
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void markAllInheritedMethodsAsUsed(ArrayList<FoundMethod> usedMethods, CtClass analysedClass, MethodInfo methodInfo) {
        try {
            CtClass superClass = analysedClass.getSuperclass();
            while (superClass != null && !superClass.getName().equals("java/lang/Object")) {

                if (classContainsMethodJavassist(superClass, methodInfo.getName(), methodInfo.getDescriptor())) {
                    checkAndAdd(new FoundMethod(analysedClass.getName(), methodInfo.getName(), methodInfo.getDescriptor()), usedMethods);
                    checkAndAdd(new FoundMethod(superClass.getName(), methodInfo.getName(), methodInfo.getDescriptor()), usedMethods);
                }
                superClass = superClass.getSuperclass();
            }
        } catch (NotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private static void findAllMethodCallsWithinCode(Map<String, CtClass> classMap, ArrayList<FoundMethod> usedMethods, CtClass analysedClass, MethodInfo methodInfo) {
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();

        if (codeAttribute != null) {
            CodeIterator codeIterator = codeAttribute.iterator();
            //Iterate over the bytecode of this method
            while (codeIterator.hasNext()) {
                int index = 0;
                try {
                    index = codeIterator.next();
                } catch (BadBytecode e) {
                    e.printStackTrace();
                }
                int opcode = codeIterator.byteAt(index);

                //If the opcode is a method invocation
                if (opcode == Opcode.INVOKEVIRTUAL || opcode == Opcode.INVOKESPECIAL || opcode == Opcode.INVOKESTATIC || opcode == Opcode.INVOKEINTERFACE) {
                    ConstPool constPool = methodInfo.getConstPool();
                    //The reason why we add 1 to the index is because we want to skip the byte that has the method invocation opcode (the one we used for the if statement above), and get the function that it calls instead
                    int methodInvocationIndex = codeIterator.u16bitAt(index + 1);
                    String methodClassName = constPool.getMethodrefClassName(methodInvocationIndex);
                    String methodName = constPool.getMethodrefName(methodInvocationIndex);
                    String methodDescription = constPool.getMethodrefType(methodInvocationIndex);

                    //Ignore method if its from a built in java package
                    if (!methodClassName.contains("java") && !methodName.contains("init")) {


//                                System.out.println("\t\t\t\tCalling method: " + methodName);
                        //Save the used method
                        if (classContainsMethodJavassist(classMap.get(methodClassName), methodName, methodDescription)) {
                            checkAndAdd(new FoundMethod(methodClassName, methodName, methodDescription), usedMethods);
                        } else {
//                                System.out.println("Class: " + analysedClass.getName() + " didn't contain " + methodName + methodDescription);
                            try {
                                CtClass superClass = analysedClass.getSuperclass();

                                while (superClass != null && !superClass.getName().contains("java")) {
                                    if (classContainsMethodJavassist(superClass, methodName, methodDescription)) {
//                                            System.out.println("\t\tFound in superclass: " + superClass.getName());
                                        checkAndAdd(new FoundMethod(superClass.getName(), methodName, methodDescription), usedMethods);
                                        break;
                                    }
                                    superClass = superClass.getSuperclass();
                                }
                            } catch (NotFoundException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }

    }

    public static ArrayList<FoundMethod> findRedundantMethodsASM(HashMap<String, ClassNode> classes) throws IOException {
        /* variables */
        ArrayList<FoundMethod> allMethods = new ArrayList<FoundMethod>();
        ArrayList<FoundMethod> usedMethods = new ArrayList<FoundMethod>();
        /* loop through each node */
//        ClassNode classNode = classes.get("at"); //also do hr
//        System.out.println("Scanning class: " + classNode.name);
        for (ClassNode classNode : classes.values()) {
            /* check if the node has interfaces */
//            if (classNode.interfaces.size() > 0) {
//                /* loop through all interfaces */
//                Iterator interfaceIterator = classNode.interfaces.iterator();
//                while (interfaceIterator.hasNext()) {
//                    String interfaceName = (String) interfaceIterator.next();
//                    ClassNode interfaceNode;
//                    if (interfaceName.contains("java")) { // check if the super class is a JDK interface, then we have to manually load it
//                        interfaceNode = new ClassNode();
//                        try {
//                            ClassReader cr = new ClassReader(interfaceName);
//                            cr.accept(interfaceNode, 0);
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    } else { // if its not a JDK class then we should have it in our classes
//                        interfaceNode = classes.get(interfaceName);
//                    }
//                    /* loop over all interface methods */
//                    Iterator interfaceMethodNodeIterator = interfaceNode.methods.iterator();
//                    while (interfaceMethodNodeIterator.hasNext()) {
//                        MethodNode interfaceMethodNode = (MethodNode) interfaceMethodNodeIterator.next();
//                        /* add the interface methods to this class */
//                        checkAndAdd(new FoundMethod(classNode.name, interfaceMethodNode.name, interfaceMethodNode.desc), usedMethods);
//                    }
//                }
//            }
//            /* loop through each method */
            Iterator methodNodesIterator = classNode.methods.iterator();
            while (methodNodesIterator.hasNext()) {
                MethodNode methodNode = (MethodNode) methodNodesIterator.next();
//            System.out.println("\t\tScanning Method: " + methodNode.name);
//                FoundMethod FoundMethod = new FoundMethod(classNode.name, methodNode.name, methodNode.desc);
//                if (!allMethods.contains(FoundMethod)) {
//                    allMethods.add(FoundMethod);
//                }
//                /* check if this is an init method */
//                if (FoundMethod.name.contains("init")) {
//                    checkAndAdd(FoundMethod, usedMethods); // if its an init method add it by default
//                }
//                /* check if its an abstract method */
//                if (Modifier.isAbstract(methodNode.access)) {
//                    checkAndAdd(FoundMethod, usedMethods); // if its an abstract method we must add it
//                }
//                /* check if methods is overridden */
//                String superClassName = classNode.superName;
//                while (!superClassName.equals("java/lang/Object") && superClassName != null) {  // check ALL superclasses to make sure they don't contain this method
//                    ClassNode superClassNode;
//                    if (superClassName.contains("java")) { // check if the super class is a JDK class, then we have to manually load it
//                        superClassNode = new ClassNode();
//                        try {
//                            ClassReader cr = new ClassReader(superClassName);
//                            cr.accept(superClassNode, 0);
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    } else { // if its not a JDK class then we should have it in our classes
//                        superClassNode = classes.get(superClassName);
//                        if(superClassNode == null) {
//                            System.out.println("hello");
//                        }
//                    }
//                    /* now check if the supper class has the method */
//                    if (classContainsMethodASM(superClassNode, FoundMethod.name, FoundMethod.desc)) {
//                        /* if the supper class has the method we mark both this and the super class method as used */
//                        FoundMethod superFoundMethod = new FoundMethod(superClassName, FoundMethod.name, FoundMethod.desc);
//                        checkAndAdd(superFoundMethod, usedMethods);
//                        checkAndAdd(FoundMethod, usedMethods);
//                        break;
//                    }
//                    /* if the supper class doesn't contain the method we check its supper class */
//                    superClassName = superClassNode.superName;
//                }
                /* loop through all of the instructions */
                Iterator instructionsIterator = methodNode.instructions.iterator();
                while (instructionsIterator.hasNext()) {
                    Object instructionObj = instructionsIterator.next();
                    if (instructionObj instanceof MethodInsnNode) {  // check if its a method instruction
                        MethodInsnNode methodInstruction = (MethodInsnNode) instructionObj;
                        FoundMethod instructionInfo = new FoundMethod(methodInstruction.owner, methodInstruction.name, methodInstruction.desc);
                        /* first we check that this method isn't being called from a JAVA class or its not an INIT method */
                        if (!instructionInfo.className.contains("java") && !instructionInfo.name.contains("init")) {
//                            System.out.println("\t\t\t\tCalling method: " + methodInstruction.name);
                            /* check if the owner actually has the method or if its inherited from a supper class */
                            if (classContainsMethodASM(classes.get(instructionInfo.className), instructionInfo.name, instructionInfo.desc)) {
                                /* if the class contains this method, add it as a used method */
                                checkAndAdd(instructionInfo, usedMethods);
                            } else {
//                            System.out.println("Class: " + classNode.name + " didn't contain " + methodInstruction.name + methodInstruction.desc);
                                /* if however the class does not have the method we must find which supper class does and add it */
                                String supperClassName = classes.get(instructionInfo.className).superName;
                                while (!supperClassName.contains("java")) {
                                    ClassNode clazz = classes.get(supperClassName);
                                    if (classContainsMethodASM(clazz, instructionInfo.name, instructionInfo.desc)) {
//                                    System.out.println("\t\tFound in superclass: " + clazz.name);
                                        /* if super class has this method add it */
                                        FoundMethod superMethod = new FoundMethod(clazz.name, instructionInfo.name, instructionInfo.desc);
                                        checkAndAdd(superMethod, usedMethods);
                                        break;
                                    }
                                    /* if the super class did not contain the method we check its supper class */
                                    supperClassName = clazz.superName;
                                }
                            }
                        }
                    }
                }
            }
        }
//        ArrayList<FoundMethod> methodsToRemove = new ArrayList<>();
//        for (FoundMethod mi : allMethods) {
//            if (!usedMethods.contains(mi)) {
//                methodsToRemove.add(mi);
//            }
//        }
//        System.out.println("Removed : " + methodsToRemove.size() + "/" + allMethods.size());
        System.out.println(usedMethods.stream().sorted(Comparator.comparing(FoundMethod::getClassName).thenComparing(FoundMethod::getName).thenComparing(FoundMethod::getDesc)).collect(Collectors.toList()));
        return null;
    }

    public static Map<String, CtClass> loadJarJavassist(String gamepackPath) {
        File jar = new File(gamepackPath);
        ClassPool classPool = ClassPool.getDefault();
        final Map<String, CtClass> nodes = new HashMap<>();
        try {
            final JarFile jarFile = new JarFile(jar);
            final Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                final JarEntry jarEntry = entries.nextElement();
                final String name = jarEntry.getName();
                if (name.endsWith(".class")) {
                    CtClass ctClassFromStream = classPool.makeClass(jarFile.getInputStream(jarEntry));
                    nodes.put(ctClassFromStream.getName(), ctClassFromStream);
                }
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return nodes;
    }

    public static HashMap<String, ClassNode> loadJarASM(String gamepackPath) {
        File jar = new File(gamepackPath);
        final HashMap<String, ClassNode> nodes = new HashMap<>();

        try {
            final JarFile jarFile = new JarFile(jar);
            final Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                final JarEntry jarEntry = entries.nextElement();
                final String name = jarEntry.getName();
                if (name.endsWith(".class")) {
                    final ClassReader cr = new ClassReader(jarFile.getInputStream(jarEntry));
                    final ClassNode cn = new ClassNode();
                    cr.accept(cn, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                    nodes.put(cn.name, cn);
                }
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return nodes;
    }

    private static void checkAndAdd(FoundMethod info, ArrayList<FoundMethod> usedMethods) {
        if (!info.className.contains("java") && !usedMethods.contains(info)) {
            usedMethods.add(info);
        }
    }

    private static boolean classContainsMethodJavassist(CtClass ctClass, String methodName, String methodDesc) {
        for (CtMethod method : ctClass.getDeclaredMethods()) {
            if (method.getName().equals(methodName) && method.getMethodInfo().getDescriptor().equals(methodDesc)) {
                return true;
            }
        }

        return false;
    }

    private static boolean classContainsMethodASM(ClassNode classNode, String methodName, String methodDesc) {
        /* iterate through all method */
        Iterator methodNodesIterator = classNode.methods.iterator();
        while (methodNodesIterator.hasNext()) {
            MethodNode methodNode = (MethodNode) methodNodesIterator.next();
            if (methodNode.name.equals(methodName) && methodNode.desc.equals(methodDesc)) {
                /* if we find a matching methods then this class has this method */
                return true;
            }
        }
        /* if no matching method found */
        return false;
    }
}