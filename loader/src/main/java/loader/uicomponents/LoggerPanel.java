package loader.uicomponents;

import loader.util.IconUtil;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class LoggerPanel extends JPanel {
    JTextArea textArea;
    JScrollPane scrollPane;
    JPanel buttonPanel;
    JButton clearLogButton, scrollToBottomButton;
    boolean isStuckToBottom = true;

    public LoggerPanel() {
        super(new BorderLayout());
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setRows(12);
        textArea.setEnabled(false);
        scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // create the button panel and add buttons to it
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setBorder(new EmptyBorder(5, 5, 5, 3));
        clearLogButton = new JButton(IconUtil.getIcon("clearOutputs_dark"));
        scrollToBottomButton = new JButton(IconUtil.getIcon("scrollDown_dark"));
        buttonPanel.add(clearLogButton);
        buttonPanel.add(scrollToBottomButton);
        add(buttonPanel, BorderLayout.WEST);


        scrollPane.addMouseWheelListener(e -> isStuckToBottom = false);

        clearLogButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea.setText(null);
            }
        });

        scrollToBottomButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea.setCaretPosition(textArea.getDocument().getLength());
                isStuckToBottom = true;
            }
        });
    }

    public void append(String message) {
        textArea.append(message);
        if(isStuckToBottom) {
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
    }
}
