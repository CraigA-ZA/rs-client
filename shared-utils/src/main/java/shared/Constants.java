package shared;

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
    public static final String OUTPUT_FILE_NAME = "gamepack_vanilla.jar";
    public static final String INITIAL_CLASS = "initial_class";
    public static final String GAMEPACK_OUTPUT_DIR = Paths.get(System.getProperty("user.dir"), "gamepack") + File.separator;
    public static final String DEOB_OUTPUT_JAR_PATH = GAMEPACK_OUTPUT_DIR + "gamepack_deobbed.jar";

    public static final String DEOB_IN_PROGRESS_PATH = GAMEPACK_OUTPUT_DIR + "deob_gamepack.jar.part";
    public static final String MAPPED_OUTPUT_JAR_PATH = GAMEPACK_OUTPUT_DIR + "gamepack_renamed.jar";

    public static final Path NAMES_JSON = Path.of(GAMEPACK_OUTPUT_DIR + "names.json");
    public static final String INJECTED_JAR_PATH = GAMEPACK_OUTPUT_DIR + "gamepack_injected.jar";
    public static final String VANILLA_GAMEPACK_DIR = GAMEPACK_OUTPUT_DIR + Constants.OUTPUT_FILE_NAME;
    public static final String ACCESSOR_PACKAGE = "accessors";
}
