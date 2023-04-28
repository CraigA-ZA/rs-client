package util;


import constants.ColorScheme;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

/**
 * Various Swing utilities.
 */
@Slf4j
public class SwingUtil {
    /**
     * Sets some sensible defaults for swing.
     * IMPORTANT! Needs to be called before main frame creation
     */
    public static void setupDefaults() {
        // Force heavy-weight popups/tooltips.
        // Prevents them from being obscured by the game applet.
        ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
        ToolTipManager.sharedInstance().setInitialDelay(300);
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);

        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("MenuItem.foreground", Color.WHITE);
        UIManager.put("Panel.background", ColorScheme.DARK_GRAY_COLOR);
        UIManager.put("TextField.selectionBackground", ColorScheme.BRAND_BLUE_TRANSPARENT);
        UIManager.put("TextField.selectionForeground", Color.WHITE);
        UIManager.put("FormattedTextField.selectionBackground", ColorScheme.BRAND_BLUE_TRANSPARENT);
        UIManager.put("FormattedTextField.selectionForeground", Color.WHITE);
        UIManager.put("TextArea.selectionBackground", ColorScheme.BRAND_BLUE_TRANSPARENT);
        UIManager.put("TextArea.selectionForeground", Color.WHITE);

        // Do not render shadows under popups/tooltips.
        // Fixes black boxes under popups that are above the game applet.
        System.setProperty("jgoodies.popupDropShadowEnabled", "false");

        // Do not fill in background on repaint. Reduces flickering when
        // the applet is resized.
        System.setProperty("sun.awt.noerasebackground", "true");
    }

    /**
     * Safely sets Swing theme
     *
     * @param laf the swing look and feel
     */
    public static void setTheme(@NonNull final LookAndFeel laf) {
        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException ex) {
            log.warn("Unable to set look and feel", ex);
        }
    }

    /**
     * Sets default Swing font.
     * IMPORTANT! Needs to be called before main frame creation
     *
     * @param font the new font to use
     */
    public static void setFont(@NonNull final Font font) {
        final FontUIResource f = new FontUIResource(font);
        final Enumeration keys = UIManager.getDefaults().keys();

        while (keys.hasMoreElements()) {
            final Object key = keys.nextElement();
            final Object value = UIManager.get(key);

            if (value instanceof FontUIResource) {
                UIManager.put(key, f);
            }
        }
    }

    /**
     * Create tray icon.
     *
     * @param icon  the icon
     * @param title the title
     * @param frame the frame
     * @return the tray icon
     */
    @Nullable
    public static TrayIcon createTrayIcon(@NonNull final Image icon, @NonNull final String title, @NonNull final Frame frame) {
        if (!SystemTray.isSupported()) {
            return null;
        }

        final SystemTray systemTray = SystemTray.getSystemTray();
        final TrayIcon trayIcon = new TrayIcon(icon, title);
        trayIcon.setImageAutoSize(true);

        try {
            systemTray.add(trayIcon);
        } catch (AWTException ex) {
            log.debug("Unable to add system tray icon", ex);
            return trayIcon;
        }

        // Bring to front when tray icon is clicked
        trayIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(true);
                frame.setState(Frame.NORMAL); // Restore
            }
        });

        return trayIcon;
    }
}