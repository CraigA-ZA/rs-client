import lombok.RequiredArgsConstructor;

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;


@RequiredArgsConstructor
public class RuneLiteRSAppletContext implements AppletContext {
    @Override
    public AudioClip getAudioClip(URL url) {
        return null;
    }

    @Override
    public Image getImage(URL url) {
        return null;
    }

    @Override
    public Applet getApplet(String name) {
        return null;
    }

    @Override
    public Enumeration<Applet> getApplets() {
        return null;
    }

    @Override
    public void showDocument(URL url) {
        //This implementation is from RuneLite
//        if (url.getPath().startsWith("/error_game_"))
//        {
//            try
//            {
//                RuntimeConfig rtc = runtimeConfigLoader.get();
//                if (rtc.showOutageMessage())
//                {
//                    return;
//                }
//            }
//            catch (Exception e)
//            {
//            }
//
//            String code = url.getPath()
//                    .replace("/", "")
//                    .replace(".ws", "");
//
//            SwingUtilities.invokeLater(() ->
//                    new FatalErrorDialog("OldSchool RuneScape has crashed with the message: " + code + "")
//                            .setTitle("Devious Client", "OldSchool RuneScape has crashed")
//                            .addHelpButtons()
//                            .open());
//        }

        //This implementation is from https://rs-hacking.com/forum/index.php?/topic/1145-basic-runescape-loader/
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(url.toURI());
            } catch (IOException | URISyntaxException e) {
                throw new RuntimeException("Unable to open document " + url.getPath());
            }
        }
    }

    @Override
    public void showDocument(URL url, String target) {
        showDocument(url);
    }

    @Override
    public void showStatus(String status) {
    }

    @Override
    public void setStream(String key, InputStream stream) throws IOException {
    }

    @Override
    public InputStream getStream(String key) {
        return null;
    }

    @Override
    public Iterator<String> getStreamKeys() {
        return null;
    }
}
