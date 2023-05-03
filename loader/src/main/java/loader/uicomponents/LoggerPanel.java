package loader.uicomponents;

import javax.swing.*;
import java.awt.*;

public class LoggerPanel extends JPanel {
    private static final Rectangle BOTTOM_OF_WINDOW = new Rectangle(0, Integer.MAX_VALUE, 0, 0);
    private final Runnable scrollToBottom = new Runnable() {

        public void run() {
            scrollRectToVisible(BOTTOM_OF_WINDOW);
        }
    };
    JTextArea textArea;
    JScrollPane scrollPane;
    public LoggerPanel() {
        super(new BorderLayout());
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setRows(12);
        textArea.setEnabled(false);
        scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void append(String message) {
        textArea.append(message);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}
