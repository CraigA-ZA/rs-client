package loader.logging;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Logger {
    private static final LoggingHandler handler = new LoggingHandler();

    static {
        java.util.logging.Logger.getLogger("").addHandler(handler);
    }

    public static void log(String message) {
        String timestamp = new SimpleDateFormat("[HH:mm:ss] - ").format(new Date());
        java.util.logging.Logger.getLogger("").info(timestamp + message);
    }
}
