import com.google.inject.Guice;
import com.google.inject.Injector;
import za.org.secret.Constants;
import za.org.secret.UtilFunctions;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.applet.Applet;
import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Paths;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

@Singleton
public class SpoonsClient {
    @Inject
    private ClientUI clientUI;

    private static Injector injector;

    public static void main(String[] args) {
        try {
            ClassLoader classLoader = loadClassesFromJar();

            Map<String, String> config = UtilFunctions.readConfig();

            Applet applet = loadClient(classLoader, config);

            applet.setStub(new RSAppletStub(config));

            injector = Guice.createInjector(new SpoonsClientModule(applet));

            injector.getInstance(SpoonsClient.class).start(applet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void start(Applet applet) throws Exception {
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
            File jarFile =  new File(Constants.DEOB_OUTPUT_JAR_PATH);
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
}
