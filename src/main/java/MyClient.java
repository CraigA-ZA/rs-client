import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.swing.*;
import java.applet.Applet;
import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class MyClient {

    public static void main(String[] args) {
        try {
            Map<String, String> config = readConfig();

            fetchGamepack(config.get(Constants.CODEBASE_PROPERTY) + config.get(Constants.INITIAL_JAR));

            ClassLoader classLoader = loadClassesFromJar();

            Applet applet = loadClient(classLoader, config);

            // Create our stub so we can set the AppletStub of the Applet and pass in the parsed parameters
            CovRSAppletStub appletStub = new CovRSAppletStub(config);
            // Use our setter to set the Applet in the AppletContext
            appletStub.getAppletContext().setApplet(applet);
            // Set the AppletStub of the Applet
            applet.setStub(appletStub);
            // Turn the key and start the Applet up
            applet.init();
            // Set the size, this can also be done by reading the parameters, but I was too lazy to parse the Int's
            applet.setSize(765, 503);
            // Using our setter, make it so everything knows the Applet is active
            appletStub.setActive(true);

            // Create a JFrame and add the Applet to it
            JFrame frame = new JFrame("Runescape");
            frame.setSize(800, 600);
            JPanel panel = new JPanel();
            frame.add(panel);
            panel.add(applet);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private static void startClient(Applet applet) {

    }

    private static Applet loadClient(ClassLoader classLoader, Map<String, String> config) {
        try {
            String initialClassName = config.get(Constants.INITIAL_CLASS);
            Class<?> initialClass = classLoader.loadClass(initialClassName.substring(0, initialClassName.length() - 6));
            Applet applet = (Applet) initialClass.newInstance();

//            applet.setStub(new RuneLiteRSAppletStub(config));

            return applet;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private static ClassLoader loadClassesFromJar() throws IOException {
        try {
            // Replace the path with the actual path to your Jar file
            File jarFile = new File("lib/" + Constants.OUTPUT_FILE_NAME);
            URL jarUrl = jarFile.toURI().toURL();
            URLClassLoader classLoader = URLClassLoader.newInstance(new URL[]{jarUrl});

            JarFile jar = new JarFile(jarFile);
            Enumeration<JarEntry> entries = jar.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String entryName = entry.getName();
                if (entryName.endsWith(".class")) {
                    String className = entryName.substring(0, entryName.length() - ".class".length()).replace('/', '.');
                    classLoader.loadClass(className);
                }
            }

            return classLoader;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void fetchGamepack(String gamepackUrl) throws IOException {
        InputStream bodyByteStream = fetch(gamepackUrl).body().byteStream();

        // Save the JAR file to disk
        FileOutputStream outputStream = new FileOutputStream("lib/" + Constants.OUTPUT_FILE_NAME); // Replace with your file path
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
        String rawResponse = fetch(Constants.JAV_CONFIG_URL).body().string();
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
