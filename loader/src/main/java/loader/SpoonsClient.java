package loader;

import accessors.RSClient;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.checkerframework.checker.units.qual.C;
import shared.Constants;
import shared.UtilFunctions;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.applet.Applet;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
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
//            ClassLoader classLoader = loadClassesFromJar();

            Map<String, String> config = UtilFunctions.readConfig();

            Applet applet = loadClient();

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

        RSClient client = (RSClient) applet;
        while(true) {
//            System.out.println("Moving to - x:" + client.getDestinationX() + " y: " + client.getDestinationY());
//            System.out.println(String.format("Camera pitch: x: %d, y: %d, z: %d", client.getCameraX(), client.getCameraY(), client.getCameraZ()));
//            System.out.println(client.getPlayers());
            System.out.println("Item selected: " + client.getIsItemSelected());
            System.out.println("Spell selected: " + client.getSelectedSpellName());
            System.out.println("Is mini menu open: " + client.getIsMiniMenuOpen());
        }
    }

    private static Applet loadClient() {
        try {
            ClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:" + Constants.INJECTED_JAR_PATH)});
            Class<?> initialClass = classLoader.loadClass("client");
            Applet applet = (Applet) initialClass.newInstance();

            return applet;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | MalformedURLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private static ClassLoader loadClassesFromJar() throws IOException {
        try {
            // Replace the path with the actual path to your Jar file
            File jarFile = new File(Constants.INJECTED_JAR_PATH);
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
