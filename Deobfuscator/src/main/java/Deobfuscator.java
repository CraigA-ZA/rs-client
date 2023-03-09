import javassist.*;
import javassist.bytecode.*;
import za.org.secret.Constants;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.stream.Collectors;

public class Deobfuscator {
    static ArrayList<FoundMethod> usedMethods = new ArrayList<>();
    static ArrayList<FoundMethod> allMethods = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Map<String, CtClass> classMapJavassist = loadJar(Constants.GAMEPACK_OUTPUT_DIR + Constants.OUTPUT_FILE_NAME);

        List<FoundMethod> totalRemovedMethods = new ArrayList<>();

        List<FoundMethod> methodsToRemove = findRedundantMethods(classMapJavassist);
        while (methodsToRemove.size() > 0) {
            totalRemovedMethods.addAll(methodsToRemove);
            removeMethods(methodsToRemove, classMapJavassist);
            usedMethods = new ArrayList<>();
            allMethods = new ArrayList<>();
            methodsToRemove = findRedundantMethods(classMapJavassist);
        }

//        System.out.println(totalRemovedMethods.stream().sorted(Comparator.comparing(FoundMethod::getClassName).thenComparing(FoundMethod::getName).thenComparing(FoundMethod::getDesc)).collect(Collectors.toList()));
        System.out.println("Total removed methods: " + totalRemovedMethods.size());

        try {
            writeJarToDisk(classMapJavassist);
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }

    private static void writeJarToDisk(Map<String, CtClass> classMapJavassist) throws IOException, CannotCompileException {
        FileOutputStream fos = new FileOutputStream(new File(Constants.DEOB_OUTPUT_JAR_PATH));
        JarOutputStream jos = new JarOutputStream(fos);

        for (CtClass ctClass : classMapJavassist.values()) {
            JarEntry newEntry = new JarEntry(ctClass.getName().replace(".", "/") + ".class");
            jos.putNextEntry(newEntry);
            jos.write(ctClass.toBytecode());
            jos.closeEntry();
        }

        jos.close();
        fos.close();
    }

    private static void removeMethods(List<FoundMethod> methodsToRemove, Map<String, CtClass> classMap) {
        for (FoundMethod methodToRemove : methodsToRemove) {
            CtClass classToRemoveFrom = classMap.get(methodToRemove.className);
            try {
                CtMethod ctMethodToRemove = classToRemoveFrom.getMethod(methodToRemove.name, methodToRemove.desc);
                classToRemoveFrom.removeMethod(ctMethodToRemove);
            } catch (NotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private static List<FoundMethod> findRedundantMethods(Map<String, CtClass> classMap) {
        // Create a set to store used method names


        //Loop over each class
        for (CtClass analysedClass : classMap.values()) {
            //This looks at all methods that are declared in the classes interfaces, and marks them as used in this class (note that it doesnt mark them as used in the interface, just in this class)
            //This is needed because we cant remove methods from this class if theyre in the interface. Even if the method isnt actually used.
            //After removing all unused methods the first time, the method in the interface class will be removed if it was never called, in which case if the method isnt used in the child, it will get deleted the second time around.
            scanInterfacesAndMarkAllMethodsAsUsed(analysedClass);

            //These 2 methods are obviously needed and should be straight forward
            scanConstructorsAndMarkInvokedMethodsAsUsed(classMap, analysedClass);
            scanClinitAndMarkItAndItsInvokedMethodsAsUsed(classMap, analysedClass);

            // Loop through each method in the class
            for (CtMethod ctMethod : analysedClass.getDeclaredMethods()) {
                MethodInfo methodInfo = ctMethod.getMethodInfo();

                FoundMethod foundMethod = new FoundMethod(analysedClass.getName(), methodInfo.getName(), methodInfo.getDescriptor());

                if (!allMethods.contains(foundMethod)) {
                    allMethods.add(foundMethod);
                }

                //Mark all abstract methods as used.
                // I'm assuming that all abstract methods will always be used, because any concrete class that extends an abstract class is forced to implement it.
                // Therefore we wouldnt want to remove it from the base abstract class
//                if (Modifier.isAbstract(methodInfo.getAccessFlags()) && !analysedClass.isInterface()) {
//                    checkAndAdd(foundMethod, usedMethods);
//                }

                //This function looks at the current classes superclass. If the superclass contains the ctMethod that we're inspecting, then mark it as used in this class and its superclass
                markInheritedMethodsAsUsed(analysedClass, methodInfo);

                findAllMethodCallsWithinCode(classMap, methodInfo);
            }
        }

        List<FoundMethod> methodsToRemove = new ArrayList<>();
        for (FoundMethod mi : allMethods) {
            if (!usedMethods.contains(mi)) {
                methodsToRemove.add(mi);
            }
        }

        methodsToRemove = methodsToRemove.stream().filter(foundMethod -> foundMethod.className.length() <= 2 || foundMethod.className.equals("client")).collect(Collectors.toList());

        return methodsToRemove;
    }

    private static void scanClinitAndMarkItAndItsInvokedMethodsAsUsed(Map<String, CtClass> classMap, CtClass analysedClass) {
        CtConstructor classInitializer = analysedClass.getClassInitializer();
        if (classInitializer != null) {
            MethodInfo methodInfo = classInitializer.getMethodInfo();

            //Add class initializer to list of all methods
            allMethods.add(new FoundMethod(analysedClass.getName(), classInitializer.getName(), methodInfo.getDescriptor()));

            //Add this class initializer itself to the used methods. All clinits are going to be used by default. Because they are used when the class is initialized
            checkAndAdd(new FoundMethod(analysedClass.getName(), classInitializer.getName(), classInitializer.getMethodInfo().getDescriptor()));

            //Mark all invoked methods as used
            findAllMethodCallsWithinCode(classMap, methodInfo);
        }
    }

    private static void scanConstructorsAndMarkInvokedMethodsAsUsed(Map<String, CtClass> classMap, CtClass analysedClass) {
        for (CtConstructor ctConstructor : analysedClass.getDeclaredConstructors()) {
            findAllMethodCallsWithinCode(classMap, ctConstructor.getMethodInfo());
        }
    }

    private static void scanInterfacesAndMarkAllMethodsAsUsed(CtClass analysedClass) {
        try {
            //For each interface that this class implements
            for (CtClass analysedClassesInterface : analysedClass.getInterfaces()) {
                //Iterate over every method declared in the interface
                for (CtMethod interfaceMethod : analysedClassesInterface.getMethods()) {
                    checkAndAdd(new FoundMethod(analysedClass.getName(), interfaceMethod.getName(), interfaceMethod.getMethodInfo().getDescriptor()));
                }
            }
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void markInheritedMethodsAsUsed(CtClass analysedClass, MethodInfo methodInfo) {
        try {
            CtClass superClass = analysedClass.getSuperclass();
            while (superClass != null) {

                if (classContainsMethodEitherDeclaredOrInherited(superClass, methodInfo.getName(), methodInfo.getDescriptor())) {
                    checkAndAdd(new FoundMethod(analysedClass.getName(), methodInfo.getName(), methodInfo.getDescriptor()));
                    checkAndAdd(new FoundMethod(superClass.getName(), methodInfo.getName(), methodInfo.getDescriptor()));
                }
                superClass = superClass.getSuperclass();
            }
        } catch (NotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private static void findAllMethodCallsWithinCode(Map<String, CtClass> classMap, MethodInfo methodInfo) {
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

                    //Ignore method if its from a built in java package. We dont care if its being used. Its never going to be removed anyway because it isnt declared in any of our classes.
                    //We ignore all methods that contain init> because all init methods are marked as used by default
                    if (!methodClassName.contains("java") && !methodName.contains("init>")) {
                        //Save the used method
                        if (classContainsDeclaredMethod(classMap.get(methodClassName), methodName, methodDescription)) {
                            checkAndAdd(new FoundMethod(methodClassName, methodName, methodDescription));
                        } else {
                            try {
                                CtClass superClass = classMap.get(methodClassName).getSuperclass();

                                while (superClass != null && !superClass.getName().contains("java")) {
                                    if (classContainsDeclaredMethod(superClass, methodName, methodDescription)) {
                                        checkAndAdd(new FoundMethod(superClass.getName(), methodName, methodDescription));
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

    public static Map<String, CtClass> loadJar(String gamepackPath) {
        File jar = new File(gamepackPath);
        ClassPool classPool = ClassPool.getDefault();
        Map<String, CtClass> nodes = new HashMap<>();
        try {
            JarFile jarFile = new JarFile(jar);
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry jarEntry = entries.nextElement();
                String name = jarEntry.getName();
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

    private static void checkAndAdd(FoundMethod info) {
        if (!info.className.contains("java") && !usedMethods.contains(info)) {
            usedMethods.add(info);
        }
    }

    private static boolean classContainsDeclaredMethod(CtClass ctClass, String methodName, String methodDesc) {
        for (CtMethod method : ctClass.getDeclaredMethods()) {
            if (method.getName().equals(methodName) && method.getMethodInfo().getDescriptor().equals(methodDesc)) {
                return true;
            }
        }
        return false;
    }

    private static boolean classContainsMethodEitherDeclaredOrInherited(CtClass ctClass, String methodName, String methodDesc) {
        for (CtMethod method : ctClass.getMethods()) {
            if (method.getName().equals(methodName) && method.getMethodInfo().getDescriptor().equals(methodDesc)) {
                return true;
            }
        }
        return false;
    }


}