import com.formdev.flatlaf.FlatDarculaLaf;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import util.ImageUtil;
import util.SwingUtil;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;


@Slf4j
@Singleton
public class ClientUI {
    @Getter
    public static JFrame frame;

    @Getter
    private TrayIcon trayIcon;

    private JPanel container;
    private Dimension lastClientSize;

    @Inject
    private Applet client;

    public static final BufferedImage ICON = ImageUtil.loadImageResource(ClientUI.class, "/openosrs.png");

    public void init() throws Exception {
        SwingUtilities.invokeAndWait(() ->
        {
            SwingUtil.setupDefaults();
            SwingUtil.setTheme(new FlatDarculaLaf());

            // Create main window
            frame = new JFrame();

            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent event) {
                    int result = JOptionPane.OK_OPTION;


                    try {
                        result = JOptionPane.showConfirmDialog(
                                frame,
                                "Are you sure you want to exit?", "Exit",
                                JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE);
                    } catch (Exception e) {
                        log.warn("Unexpected exception occurred while check for confirm required", e);
                    }


                    if (result == JOptionPane.OK_OPTION) {
                        shutdownClient();
                    }
                }
            });

            frame.setTitle("Spoons Custom Client");
            frame.setIconImage(ICON);
            frame.getLayeredPane().setCursor(Cursor.getDefaultCursor()); // Prevent substance from using a resize cursor for pointing
            frame.setLocationRelativeTo(frame.getOwner());
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            container = new JPanel();
            container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
            container.add(client);

            frame.add(container);
            frame.setUndecorated(false);
        });
    }

    private void shutdownClient() {
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
