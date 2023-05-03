package loader;

import accessors.RSClient;
import accessors.RSPlayer;
import com.google.inject.Guice;
import com.google.inject.Injector;
import loader.logging.Logger;
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

    @Inject
    RSClient client;

    private static Injector injector;

    public static void main(String[] args) {
        try {
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


//            System.out.println("Moving to - x:" + client.getDestinationX() + " y: " + client.getDestinationY());
//        Logger.log(String.format("Camera pitch: x: %d, y: %d, z: %d", client.getCameraX(), client.getCameraY(), client.getCameraZ()));

//            System.out.println(client.getLoginState());

        class SayHello extends TimerTask {
            public void run() {
//                RSPlayer localPlayer = client.getLocalPlayer();
                Logger.log(String.format("Camera pitch: x: %d, y: %d, z: %d", client.getCameraX(), client.getCameraY(), client.getCameraZ()));
//                if (localPlayer != null) {
//                    System.out.println("Position - X:" + localPlayer.getTileX() + " Y:" + localPlayer.getTileY());

//                        System.out.println(localPlayer.getActions());
//                    System.out.println(localPlayer.getCombatLevel());
//                    System.out.println(localPlayer.getSkillLevel());
//                }
            }
        }

        Timer timer = new Timer();
        timer.schedule(new SayHello(), 0, 300);

//            System.out.println(client.getPlayers());
//            System.out.println("Item selected: " + client.getIsItemSelected());
//            System.out.println("Spell selected: " + client.getSelectedSpellName());
//            System.out.println("Is mini menu open: " + client.getIsMiniMenuOpen());
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
}
