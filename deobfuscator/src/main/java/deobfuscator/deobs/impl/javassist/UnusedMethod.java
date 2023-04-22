package deobfuscator.deobs.impl.javassist;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import za.org.secret.FoundMethod;
import javassist.*;
import javassist.bytecode.MethodInfo;
import javassist.expr.ExprEditor;
import javassist.expr.MethodCall;
import za.org.secret.UtilFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnusedMethod extends AbstractDeob {
    static ArrayList<FoundMethod> usedMethods = new ArrayList<>();
    static ArrayList<FoundMethod> allMethods = new ArrayList<>();


    @Override
    public void run() {
        int removedCount = 0;
        List<FoundMethod> methodsToRemove = findRedundantMethods();
        while (methodsToRemove.size() > 0) {
            removeMethods(methodsToRemove);
            usedMethods = new ArrayList<>();
            allMethods = new ArrayList<>();
            removedCount += methodsToRemove.size();
            methodsToRemove = findRedundantMethods();
        }
        System.out.println("Unused Methods: " + removedCount);
    }

    private List<FoundMethod> findRedundantMethods() {
        //Loop over each class
        for (CtClass analysedClass : Deobfuscator.classMap.values()) {
            //This looks at all methods that are declared in the classes interfaces, and marks them as used in this class (note that it doesnt mark them as used in the interface, just in this class)
            //This is needed because we cant remove methods from this class if theyre in the interface. Even if the method isnt actually used.
            //After removing all unused methods the first time, the method in the interface class will be removed if it was never called, in which case if the method isnt used in the child, it will get deleted the second time around.
            scanInterfacesAndMarkAllMethodsAsUsed(analysedClass);

            //These 2 methods are obviously needed and should be straight forward
            scanConstructorsAndMarkInvokedMethodsAsUsed(analysedClass);
            scanClinitAndMarkItAndItsInvokedMethodsAsUsed(analysedClass);

            // Loop through each method in the class
            for (CtMethod ctMethod : analysedClass.getDeclaredMethods()) {
                MethodInfo methodInfo = ctMethod.getMethodInfo();

                FoundMethod foundMethod = new FoundMethod(analysedClass.getName(), methodInfo.getName(), methodInfo.getDescriptor());

                if (!allMethods.contains(foundMethod)) {
                    allMethods.add(foundMethod);
                }

                //This function looks at the current classes superclass. If the superclass contains the ctMethod that we're inspecting, then mark it as used in this class and its superclass
                markInheritedMethodsAsUsed(analysedClass, methodInfo);

                findAllMethodCallsWithinCode(ctMethod);
            }
        }

        List<FoundMethod> methodsToRemove = new ArrayList<>();
        for (FoundMethod mi : allMethods) {
            if (!usedMethods.contains(mi)) {
                methodsToRemove.add(mi);
            }
        }

        methodsToRemove = methodsToRemove.stream().filter(foundMethod -> UtilFunctions.isObfuscated(foundMethod.className)).collect(Collectors.toList());

        return methodsToRemove;
    }

    private static void removeMethods(List<FoundMethod> methodsToRemove) {
        for (FoundMethod methodToRemove : methodsToRemove) {
            CtClass classToRemoveFrom = Deobfuscator.classMap.get(methodToRemove.className);
            try {
                CtMethod ctMethodToRemove = classToRemoveFrom.getMethod(methodToRemove.name, methodToRemove.desc);
                classToRemoveFrom.removeMethod(ctMethodToRemove);
            } catch (NotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private static void findAllMethodCallsWithinCode(CtBehavior ctMethod) {
        try {
            ctMethod.instrument(new ExprEditor() {
                public void edit(MethodCall m) {

                    if (!m.getClassName().contains("java") && !m.getMethodName().contains("init>")) {
                        //Save the used method
                        if (classContainsDeclaredMethod(Deobfuscator.classMap.get(m.getClassName()), m.getMethodName(), m.getSignature())) {
                            checkAndAdd(new FoundMethod(m.getClassName(), m.getMethodName(), m.getSignature()));
                        } else {
                            try {
                                CtClass superClass = Deobfuscator.classMap.get(m.getClassName()).getSuperclass();

                                while (superClass != null && !superClass.getName().contains("java")) {
                                    if (classContainsDeclaredMethod(superClass, m.getMethodName(), m.getSignature())) {
                                        checkAndAdd(new FoundMethod(superClass.getName(), m.getMethodName(), m.getSignature()));
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
            });
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }

    private static void scanClinitAndMarkItAndItsInvokedMethodsAsUsed(CtClass analysedClass) {
        CtConstructor classInitializer = analysedClass.getClassInitializer();
        if (classInitializer != null) {
            MethodInfo methodInfo = classInitializer.getMethodInfo();

            //Add class initializer to list of all methods
            allMethods.add(new FoundMethod(analysedClass.getName(), classInitializer.getName(), methodInfo.getDescriptor()));

            //Add this class initializer itself to the used methods. All clinits are going to be used by default. Because they are used when the class is initialized
            checkAndAdd(new FoundMethod(analysedClass.getName(), classInitializer.getName(), classInitializer.getMethodInfo().getDescriptor()));

            //Mark all invoked methods as used
            findAllMethodCallsWithinCode(classInitializer);
        }
    }

    private static void scanConstructorsAndMarkInvokedMethodsAsUsed(CtClass analysedClass) {
        for (CtConstructor ctConstructor : analysedClass.getDeclaredConstructors()) {
            findAllMethodCallsWithinCode(ctConstructor);
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
//                    checkAndAdd(new FoundMethod(superClass.getName(), methodInfo.getName(), methodInfo.getDescriptor()));
                }
                superClass = superClass.getSuperclass();
            }
        } catch (NotFoundException ex) {
            ex.printStackTrace();
        }
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
