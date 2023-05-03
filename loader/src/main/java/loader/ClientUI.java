package loader;

import com.formdev.flatlaf.FlatDarculaLaf;
import loader.logging.LoggingHandler;
import loader.uicomponents.LoggerPanel;
import loader.uicomponents.MainFrame;
import loader.uicomponents.GamePanel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import loader.util.ImageUtil;
import loader.util.SwingUtil;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.image.BufferedImage;


@Slf4j
@Singleton
public class ClientUI {
    @Getter
    public static JFrame frame;
    @Getter
    public static JPanel panel;

    @Getter
    private TrayIcon trayIcon;

    @Inject
    private Applet applet;

    public static final BufferedImage ICON = ImageUtil.loadImageResource(ClientUI.class, "/openosrs.png");

    public void init() throws Exception {
        SwingUtilities.invokeAndWait(() ->
        {
            SwingUtil.setupDefaults();
            SwingUtil.setTheme(new FlatDarculaLaf());

            // Create main window
            frame = new MainFrame();

            frame.add(new GamePanel(applet), BorderLayout.CENTER); // Add GamePanel to the center
            frame.add(LoggingHandler.loggerPanel, BorderLayout.SOUTH);
            frame.setUndecorated(false);
        });
    }

    public static void shutdownClient() {
        log.debug("Shutting down client!");
        //In the original Runelite this method was a lot more involved. I believe it waits for all eventbuses to shut down first
        System.exit(0);
    }

    public void show() {
        SwingUtilities.invokeLater(() ->
        {
            // Layout frame
            frame.pack();

            // Create tray icon (needs to be created after frame is packed)
            trayIcon = SwingUtil.createTrayIcon(ICON, "Spoons client", frame);

            // Show frame
            frame.setVisible(true);
            frame.setResizable(true);
            frame.toFront();
            log.info("Showing frame {}", frame);
        });
    }
}
