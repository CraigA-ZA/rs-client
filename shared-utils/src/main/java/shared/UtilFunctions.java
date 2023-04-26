package shared;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;

public class UtilFunctions {
    public static Map<String, String> readConfig() throws IOException {
        Map<String, String> parsedConfig = new HashMap<>();
        String rawResponse = fetch(Constants.JAV_CONFIG_URL).body().string();
        try (Scanner scanner = new Scanner(new StringReader(rawResponse))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                line = line.replace("param=", "").replace("msg=", "");

                // Split the string on the "=" sign and limit the split to 2 in case some of the parameters use the "=" sign
                String[] splitLine = line.split("=", 2);
                // Check if the value is empty and add an empty parameter with the name
                if (splitLine.length == 1)
                    parsedConfig.put(splitLine[0], "");
                // Check there is a value and add the parameter with the value
                if (splitLine.length == 2)
                    parsedConfig.put(splitLine[0], splitLine[1]);
            }
        }
        return parsedConfig;
    }

    public static Response fetch(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public static boolean isObfuscated(String fileName) {
        return fileName.length() <= 2 || fileName.equals("client") || fileName.contains("_renamed");
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

    public static void writeJarToDisk(Map<String, CtClass> classMapJavassist) throws IOException, CannotCompileException {
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

    public static void writeJarToDiskASM(Map<String, ClassNode> classMapASM, String pathToWrite) throws IOException {
        FileOutputStream fos = new FileOutputStream(pathToWrite);
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
}
