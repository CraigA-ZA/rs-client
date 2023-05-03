package loader.uicomponents;

import loader.ClientUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {
    public MainFrame() {
        super();
        setTitle("Spoons Custom Client");
        setIconImage(ClientUI.ICON);
        getLayeredPane().setCursor(Cursor.getDefaultCursor()); // Prevent substance from using a resize cursor for pointing
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                int result = JOptionPane.OK_OPTION;


                try {
                    result = JOptionPane.showConfirmDialog(
                            null,
                            "Are you sure you want to exit?", "Exit",
                            JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE);
                } catch (Exception e) {
                    e.printStackTrace();
                }


                if (result == JOptionPane.OK_OPTION) {
                    ClientUI.shutdownClient();
                }
            }
        });
    }
}
