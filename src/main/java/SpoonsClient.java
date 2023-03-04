import com.google.inject.Guice;
import com.google.inject.Injector;
import constants.Constants;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.applet.Applet;
import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

@Singleton
public class SpoonsClient {
    @Inject
    private ClientUI clientUI;

    @Inject
    private Applet applet;

    private static Injector injector;

    public static void main(String[] args) {
        try {
            Map<String, String> config = readConfig();

//            fetchGamepack(config.get(Constants.CODEBASE_PROPERTY) + config.get(Constants.INITIAL_JAR));

            ClassLoader classLoader = loadClassesFromJar();

            Applet applet = loadClient(classLoader, config);

            applet.setStub(new RuneLiteRSAppletStub(config));

            injector = Guice.createInjector(new SpoonsClientModule(applet));

            injector.getInstance(SpoonsClient.class).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void start() throws Exception {
        injector.injectMembers(applet);

        applet.setSize(Constants.GAME_FIXED_WIDTH, Constants.GAME_FIXED_HEIGHT);

        applet.init();
        applet.start();

        clientUI.init();
        clientUI.show();
    }

    private static Applet loadClient(ClassLoader classLoader, Map<String, String> config) {
        try {
            String initialClassName = config.get(Constants.INITIAL_CLASS);
            Class<?> initialClass = classLoader.loadClass(initialClassName.substring(0, initialClassName.length() - 6));
            Applet applet = (Applet) initialClass.newInstance();

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

    private static Response fetch(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        return client.newCall(request).execute();
    }
}
