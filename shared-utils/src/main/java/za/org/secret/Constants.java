package za.org.secret;

import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Constants {
    /**
     * The original width of the game when running in fixed mode.
     */
    public static final int GAME_FIXED_WIDTH = 765;

    /**
     * The original height of the game when running in fixed mode.
     */
    public static final int GAME_FIXED_HEIGHT = 503;

    /**
     * Dimension representation of the width and height of the game in fixed mode.
     */
    public static final Dimension GAME_FIXED_SIZE = new Dimension(GAME_FIXED_WIDTH, GAME_FIXED_HEIGHT);

    public static final String JAV_CONFIG_URL = "http://oldschool.runescape.com/jav_config.ws";
    public static final String CODEBASE_PROPERTY = "codebase";
    public static final String INITIAL_JAR = "initial_jar";
    public static final String OUTPUT_FILE_NAME = "gamepack.jar";
    public static final String INITIAL_CLASS = "initial_class";
    public static final String GAMEPACK_OUTPUT_DIR = Paths.get(System.getProperty("user.dir"), "gamepack").toString();
    public static final String DEOB_OUTPUT_JAR_PATH = Paths.get(System.getProperty("user.dir"), "gamepack") + File.separator+ "deob_gamepack.jar";

    public static final String DEOB_IN_PROGRESS_PATH = Paths.get(System.getProperty("user.dir"), "gamepack") + File.separator + "deob_gamepack.jar.part";
    public static final String MAPPED_OUTPUT_JAR_PATH = Paths.get(System.getProperty("user.dir"), "gamepack") + File.separator+ "updated_gamepack.jar";;
}
