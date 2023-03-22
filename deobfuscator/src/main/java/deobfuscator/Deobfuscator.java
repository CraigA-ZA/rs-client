package deobfuscator;

import deobfuscator.deobs.AbstractDeob;
import deobfuscator.deobs.impl.UnusedParams;
import deobfuscator.deobs.impl.UnusedMethod;
import javassist.*;
import za.org.secret.Constants;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Deobfuscator {
    public static Map<String, CtClass> classMap = loadJar(Constants.GAMEPACK_OUTPUT_DIR + Constants.OUTPUT_FILE_NAME);
    private static List<AbstractDeob> activeDeobs = Stream.of(new UnusedMethod(), new UnusedParams()).collect(Collectors.toList());

    public static void main(String[] args) throws IOException {
        for(AbstractDeob deob: activeDeobs) {
            deob.run();
        }

        try {
            writeJarToDisk(classMap);
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }

    private static void writeJarToDisk(Map<String, CtClass> classMapJavassist) throws IOException, CannotCompileException {
        FileOutputStream fos = new FileOutputStream(Constants.DEOB_OUTPUT_JAR_PATH);
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
}