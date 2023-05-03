package loader.uicomponents;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class GamePanel extends JPanel {
    public GamePanel(Applet client) {
        super();
        setLayout(new BorderLayout());
        add(client, BorderLayout.CENTER);

        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                int width = getWidth();
                int height = getHeight();
                client.setSize(width, height);
            }
        });
    }
}
