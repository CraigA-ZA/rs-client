package deobfuscator;

import deobfuscator.deobs.AbstractDeob;
import deobfuscator.deobs.impl.ASM.OpaquePredicates;
import deobfuscator.deobs.impl.ASM.UnusedParams;
import deobfuscator.deobs.impl.javassist.UnusedFields;
import deobfuscator.deobs.impl.javassist.UnusedMethod;
import deobfuscator.models.FoundMethod;
import javassist.*;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import za.org.secret.Constants;

import java.io.*;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.objectweb.asm.tree.ClassNode;

public final class Deobfuscator {
    public static Map<String, CtClass> classMap;
    public static Map<String, ClassNode> classMapASM;
    private static List<AbstractDeob> javassistDeobs = Stream.of(new UnusedMethod(), new UnusedFields()).collect(Collectors.toList());
    private static List<AbstractDeob> ASMDeobs = Stream.of(new OpaquePredicates(), new UnusedParams()).collect(Collectors.toList());

    public static List<FoundMethod> methodsWithOpaques = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //Load JAR using Javassist
        classMap = loadJar(Constants.GAMEPACK_OUTPUT_DIR + Constants.OUTPUT_FILE_NAME);

        //Run all javassist based Deobs
        for (AbstractDeob deob : javassistDeobs) {
            deob.run();
        }

        try {
            //Write the deobbed jar
            writeJarToDisk(classMap);
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }

        //Load the deobbed jar
        classMapASM = loadJarASM(Constants.DEOB_IN_PROGRESS_PATH);
        for (AbstractDeob deob : ASMDeobs) {
            deob.run();
        }

        writeJarToDiskASM(classMapASM);
    }

    private static void writeJarToDiskASM(Map<String, ClassNode> classMapASM) throws IOException {
        FileOutputStream fos = new FileOutputStream(Constants.DEOB_OUTPUT_JAR_PATH);
        JarOutputStream jos = new JarOutputStream(fos);

        for (ClassNode ctClass : classMapASM.values()) {
            JarEntry newEntry = new JarEntry(ctClass.name.replace(".", "/") + ".class");
            jos.putNextEntry(newEntry);

            ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            ctClass.accept(classWriter);

            byte[] bytecode = classWriter.toByteArray();
            jos.write(bytecode);
            jos.closeEntry();
        }

        jos.close();
        fos.close();
    }

    private static void writeJarToDisk(Map<String, CtClass> classMapJavassist) throws IOException, CannotCompileException {
        FileOutputStream fos = new FileOutputStream(Constants.DEOB_IN_PROGRESS_PATH);
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

    public static Map<String, ClassNode> loadJarASM(String gamepackPath) {
        File jar = new File(gamepackPath);
        Map<String, ClassNode> nodes = new HashMap<>();
        try {
            JarFile jarFile = new JarFile(jar);
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry jarEntry = entries.nextElement();
                String name = jarEntry.getName();
                if (name.endsWith(".class")) {
                    InputStream is = jarFile.getInputStream(jarEntry);
                    ClassReader reader = new ClassReader(is);
                    ClassNode node = new ClassNode();
                    reader.accept(node, 0);
                    nodes.put(node.name, node);
                }
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return nodes;
    }
}