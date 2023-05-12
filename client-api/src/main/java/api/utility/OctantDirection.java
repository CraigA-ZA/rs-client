package api.utility;

import java.util.Arrays;
import java.util.List;

public enum OctantDirection {
    NORTH(0, 1),
    NORTHEAST(1, 1),
    EAST(1, 0),
    SOUTHEAST(1, -1),
    SOUTH(0, -1),
    SOUTHWEST(-1, -1),
    WEST(-1, 0),
    NORTHWEST(-1, 1);

    private final int x;
    private final int y;

    private OctantDirection(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static final List<OctantDirection> VALUES = Arrays.asList(values());

    public static OctantDirection of(int x, int y) {
        switch (x) {
            case -1:
                switch (y) {
                    case -1:
                        return SOUTHWEST;
                    case 0:
                        return WEST;
                    case 1:
                        return NORTHWEST;
                    default:
                        throw new IllegalArgumentException();
                }
            case 0:
                switch (y) {
                    case -1:
                        return SOUTH;
                    case 1:
                        return NORTH;
                    default:
                        throw new IllegalArgumentException();
                }
            case 1:
                switch (y) {
                    case -1:
                        return SOUTHEAST;
                    case 0:
                        return EAST;
                    case 1:
                        return NORTHEAST;
                    default:
                        throw new IllegalArgumentException();
                }
            default:
                throw new IllegalArgumentException();
        }
    }
}