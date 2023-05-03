package loader.logging;

public class Logger {
    private static final LoggingHandler handler = new LoggingHandler();

    static {
        java.util.logging.Logger.getLogger("").addHandler(handler);
    }

    public static void log(String message) {
        java.util.logging.Logger.getLogger("").info(message);
    }
}
