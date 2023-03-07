import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import za.org.secret.Constants;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public final class RMIdentifier {
    public static void main(String[] args) throws IOException {
        HashMap<String, ClassNode> classMap = loadJar(Constants.GAMEPACK_OUTPUT_DIR + Constants.OUTPUT_FILE_NAME);

        findRedundantMethods(classMap);
    }

    public static HashMap<String, ClassNode> loadJar(String gamepackPath) {
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

    public static ArrayList<FoundMethod> findRedundantMethods(HashMap<String, ClassNode> classes) throws IOException {
        /* variables */
        ArrayList<FoundMethod> allMethods = new ArrayList<FoundMethod>();
        ArrayList<FoundMethod> usedMethods = new ArrayList<FoundMethod>();
        /* loop through each node */
        for (ClassNode classNode : classes.values()) {
            /* check if the node has interfaces */
            if (classNode.interfaces.size() > 0) {
                /* loop through all interfaces */
                Iterator interfaceIterator = classNode.interfaces.iterator();
                while (interfaceIterator.hasNext()) {
                    String interfaceName = (String) interfaceIterator.next();
                    ClassNode interfaceNode;
                    if (interfaceName.contains("java")) { // check if the super class is a JDK interface, then we have to manually load it
                        interfaceNode = new ClassNode();
                        try {
                            ClassReader cr = new ClassReader(interfaceName);
                            cr.accept(interfaceNode, 0);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else { // if its not a JDK class then we should have it in our classes
                        interfaceNode = classes.get(interfaceName);
                    }
                    /* loop over all interface methods */
                    Iterator interfaceMethodNodeIterator = interfaceNode.methods.iterator();
                    while (interfaceMethodNodeIterator.hasNext()) {
                        MethodNode interfaceMethodNode = (MethodNode) interfaceMethodNodeIterator.next();
                        /* add the interface methods to this class */
                        checkAndAdd(new FoundMethod(classNode.name, interfaceMethodNode.name, interfaceMethodNode.desc), usedMethods);
                    }
                }
            }
            /* loop through each method */
            Iterator methodNodesIterator = classNode.methods.iterator();
            while (methodNodesIterator.hasNext()) {
                MethodNode methodNode = (MethodNode) methodNodesIterator.next();
                FoundMethod FoundMethod = new FoundMethod(classNode.name, methodNode.name, methodNode.desc);
                if (!allMethods.contains(FoundMethod)) {
                    allMethods.add(FoundMethod);
                }
                /* check if this is an init method */
                if (FoundMethod.name.contains("init")) {
                    checkAndAdd(FoundMethod, usedMethods); // if its an init method add it by default
                }
                /* check if its an abstract method */
                if (Modifier.isAbstract(methodNode.access)) {
                    checkAndAdd(FoundMethod, usedMethods); // if its an abstract method we must add it
                }
                /* check if methods is overridden */
                String superClassName = classNode.superName;
                while (!superClassName.equals("java/lang/Object") && superClassName != null) {  // check ALL superclasses to make sure they don't contain this method
                    ClassNode superClassNode;
                    if (superClassName.contains("java")) { // check if the super class is a JDK class, then we have to manually load it
                        superClassNode = new ClassNode();
                        try {
                            ClassReader cr = new ClassReader(superClassName);
                            cr.accept(superClassNode, 0);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else { // if its not a JDK class then we should have it in our classes
                        superClassNode = classes.get(superClassName);
                    }
                    /* now check if the supper class has the method */
                    if (classContainsMethod(superClassNode, FoundMethod.name, FoundMethod.desc)) {
                        /* if the supper class has the method we mark both this and the super class method as used */
                        FoundMethod superFoundMethod = new FoundMethod(superClassName, FoundMethod.name, FoundMethod.desc);
                        checkAndAdd(superFoundMethod, usedMethods);
                        checkAndAdd(FoundMethod, usedMethods);
                        break;
                    }
                    /* if the supper class doesn't contain the method we check its supper class */
                    superClassName = superClassNode.superName;
                }
                /* loop through all of the instructions */
                Iterator instructionsIterator = methodNode.instructions.iterator();
                while (instructionsIterator.hasNext()) {
                    Object instructionObj = instructionsIterator.next();
                    if (instructionObj instanceof MethodInsnNode) {  // check if its a method instruction
                        MethodInsnNode methodInstruction = (MethodInsnNode) instructionObj;
                        FoundMethod instructionInfo = new FoundMethod(methodInstruction.owner, methodInstruction.name, methodInstruction.desc);
                        /* first we check that this method isn't being called from a JAVA class or its not an INIT method */
                        if (!instructionInfo.className.contains("java") && !instructionInfo.className.contains("org") && !instructionInfo.name.contains("init")) {
                            /* check if the owner actually has the method or if its inherited from a supper class */
                            if (classContainsMethod(classes.get(instructionInfo.className), instructionInfo.name, instructionInfo.desc)) {
                                /* if the class contains this method, add it as a used method */
                                checkAndAdd(instructionInfo, usedMethods);
                            } else {
                                /* if however the class does not have the method we must find which supper class does and add it */
                                String supperClassName = classes.get(instructionInfo.className).superName;
                                while (!supperClassName.contains("java")) {
                                    ClassNode clazz = classes.get(supperClassName);
                                    if (classContainsMethod(clazz, instructionInfo.name, instructionInfo.desc)) {
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
        ArrayList<FoundMethod> methodsToRemove = new ArrayList<FoundMethod>();
        for (FoundMethod mi : allMethods) {
            if (!usedMethods.contains(mi)) {
                methodsToRemove.add(mi);
            }
        }
        System.out.println("Removed : " + methodsToRemove.size() + "/" + allMethods.size());
        return methodsToRemove;
    }

    private static void checkAndAdd(FoundMethod info, ArrayList<FoundMethod> usedMethods) {
        if (!info.className.contains("java") && !usedMethods.contains(info)) {
            usedMethods.add(info);
        }
    }

    private static boolean classContainsMethod(ClassNode classNode, String methodName, String methodDesc) {
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