package deobfuscator.deobs.impl;

import deobfuscator.deobs.AbstractDeob;

public class UnusedParams extends AbstractDeob {
    @Override
    public void run() {
        System.out.println("Unused fields unimplemented");
    }

//    private static void findUnusedFields() {
//        for (CtClass analysedClass : classMap.values()) {
//            //This looks at all methods that are declared in the classes interfaces, and marks them as used in this class (note that it doesnt mark them as used in the interface, just in this class)
//            //This is needed because we cant remove methods from this class if theyre in the interface. Even if the method isnt actually used.
//            //After removing all unused methods the first time, the method in the interface class will be removed if it was never called, in which case if the method isnt used in the child, it will get deleted the second time around.
//            scanInterfacesAndMarkAllMethodsAsUsed(analysedClass);
//
//            //These 2 methods are obviously needed and should be straight forward
//            scanConstructorsAndMarkInvokedMethodsAsUsed(analysedClass);
//            scanClinitAndMarkItAndItsInvokedMethodsAsUsed(analysedClass);
//
//            // Loop through each method in the class
//            for (CtMethod ctMethod : analysedClass.getDeclaredMethods()) {
//                MethodInfo methodInfo = ctMethod.getMethodInfo();
//
//                FoundMethod foundMethod = new FoundMethod(analysedClass.getName(), methodInfo.getName(), methodInfo.getDescriptor());
//
//                if (!allMethods.contains(foundMethod)) {
//                    allMethods.add(foundMethod);
//                }
//
//                //Mark all abstract methods as used.
//                // I'm assuming that all abstract methods will always be used, because any concrete class that extends an abstract class is forced to implement it.
//                // Therefore we wouldnt want to remove it from the base abstract class
////                if (Modifier.isAbstract(methodInfo.getAccessFlags()) && !analysedClass.isInterface()) {
////                    checkAndAdd(foundMethod, usedMethods);
////                }
//
//                //This function looks at the current classes superclass. If the superclass contains the ctMethod that we're inspecting, then mark it as used in this class and its superclass
//                markInheritedMethodsAsUsed(analysedClass, methodInfo);
//
//                findAllMethodCallsWithinCode(ctMethod);
//            }
//        }
//
//        List<FoundMethod> methodsToRemove = new ArrayList<>();
//        for (FoundMethod mi : allMethods) {
//            if (!usedMethods.contains(mi)) {
//                methodsToRemove.add(mi);
//            }
//        }
//    }
}
