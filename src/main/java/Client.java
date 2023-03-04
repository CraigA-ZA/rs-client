import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.applet.Applet;
import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Client {
    private static final String JAV_CONFIG_URL = "http://oldschool.runescape.com/jav_config.ws";
    private static final String CODEBASE_PROPERTY = "codebase";
    private static final String INITIAL_JAR = "initial_jar";
    private static final String OUTPUT_FILE_NAME = "gamepack.jar";
    private static final String INITIAL_CLASS = "initial_class";

    public static void main(String[] args) {
        try {
            Map<String, String> config = readConfig();

            fetchGamepack(config.get(CODEBASE_PROPERTY) + config.get(INITIAL_JAR));

//            ClassLoader classLoader = loadClassesFromJar();
            ClassLoader classLoader = createJar

            Applet applet = loadClient(classLoader, config);

            applet.start();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private static Applet loadClient(ClassLoader classLoader, Map<String, String> config) {
        try {
            Class<?> initialClass = classLoader.loadClass(config.get(INITIAL_CLASS));
            Applet applet = (Applet) initialClass.newInstance();

            applet.setStub(new RSAppletStub(config));

            return applet;
        } catch(ClassNotFoundException | InstantiationException | IllegalAccessException  ex) {
            ex.printStackTrace();
            return null;
        }
    }

//    private static ClassLoader loadClassesFromJar() throws IOException {
//        try {
//            // Replace the path with the actual path to your Jar file
//            File jarFile = new File("lib/" + OUTPUT_FILE_NAME);
//            URL jarUrl = jarFile.toURI().toURL();
//            URLClassLoader classLoader = URLClassLoader.newInstance(new URL[]{jarUrl});
//
//            JarFile jar = new JarFile(jarFile);
//            Enumeration<JarEntry> entries = jar.entries();
//            while (entries.hasMoreElements()) {
//                JarEntry entry = entries.nextElement();
//                String entryName = entry.getName();
//                if (entryName.endsWith(".class")) {
//                    String className = entryName.substring(0, entryName.length() - ".class".length()).replace('/', '.');
//                    classLoader.loadClass(className);
//                }
//            }
//
//            return classLoader;
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    private static void fetchGamepack(String gamepackUrl) throws IOException {
        InputStream bodyByteStream = fetch(gamepackUrl).body().byteStream();

        // Save the JAR file to disk
        FileOutputStream outputStream = new FileOutputStream("lib/" + OUTPUT_FILE_NAME); // Replace with your file path
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = bodyByteStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        outputStream.close();
        bodyByteStream.close();
    }

    private static Map<String, String> readConfig() throws IOException {
        Map<String, String> parsedConfig = new HashMap<>();
        String rawResponse = fetch(JAV_CONFIG_URL).body().string();
        try (Scanner scanner = new Scanner(new StringReader(rawResponse))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split("=", 2);
                parsedConfig.put(splitLine[0], splitLine[1]);
            }
        }
        return parsedConfig;
    }

    private static Response fetch(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        return client.newCall(request).execute();
    }
}
