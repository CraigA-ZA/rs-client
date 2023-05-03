package loader.logging;

import loader.uicomponents.LoggerPanel;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import javax.swing.JTextArea;

public class LoggingHandler extends Handler {
    public static LoggerPanel loggerPanel = new LoggerPanel();

    @Override
    public void publish(LogRecord record) {
        String message = record.getMessage() + System.lineSeparator();
        loggerPanel.append(message);
    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}
