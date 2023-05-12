package api.utility;

import accessors.RSClient;
import api.Scene;
import api.SceneTile;

public class Movement {
    private static final int ALL = CollisionFlag.WALK_OBJECT | CollisionFlag.WALK_GROUND;
    private static final int N = ALL | CollisionFlag.WALK_NORTH;
    private static final int E = ALL | CollisionFlag.WALK_EAST;
    private static final int S = ALL | CollisionFlag.WALK_SOUTH;
    private static final int W = ALL | CollisionFlag.WALK_WEST;
    private static final int NE = ALL | CollisionFlag.WALK_NORTH | CollisionFlag.WALK_NORTHEAST | CollisionFlag.WALK_EAST;
    private static final int SE = ALL | CollisionFlag.WALK_SOUTH | CollisionFlag.WALK_SOUTHEAST | CollisionFlag.WALK_EAST;
    private static final int SW = ALL | CollisionFlag.WALK_SOUTH | CollisionFlag.WALK_SOUTHWEST | CollisionFlag.WALK_WEST;
    private static final int NW = ALL | CollisionFlag.WALK_NORTH | CollisionFlag.WALK_NORTHWEST | CollisionFlag.WALK_WEST;

    public static boolean canMove(SceneTile source, OctantDirection direction, RSClient client) {
        return canMove(source.getX(), source.getY(), source.getPlane(), direction, client);
    }

    public static boolean canMove(int x, int y, int plane, OctantDirection direction, RSClient client) {
        int destX = x + direction.getX();
        int destY = y + direction.getY();
        if (!SceneTile.isXyLoaded(destX) || !SceneTile.isXyLoaded(destY)) return false;
        if ((Scene.getCollisionFlags(destX, destY, plane, client) & ALL) != 0) return false;
        switch (direction) {
            case NORTH:
                return (Scene.getCollisionFlags(x, y, plane, client) & N) == 0;
            case NORTHEAST:
                return (Scene.getCollisionFlags(x, y, plane, client) & NE) == 0 &&
                        (Scene.getCollisionFlags(destX, y, plane, client) & N) == 0 &&
                        (Scene.getCollisionFlags(x, destY, plane, client) & E) == 0;
            case EAST:
                return (Scene.getCollisionFlags(x, y, plane, client) & E) == 0;
            case SOUTHEAST:
                return (Scene.getCollisionFlags(x, y, plane, client) & SE) == 0 &&
                        (Scene.getCollisionFlags(destX, y, plane, client) & S) == 0 &&
                        (Scene.getCollisionFlags(x, destY, plane, client) & E) == 0;
            case SOUTH:
                return (Scene.getCollisionFlags(x, y, plane, client) & S) == 0;
            case SOUTHWEST:
                return (Scene.getCollisionFlags(x, y, plane, client) & SW) == 0 &&
                        (Scene.getCollisionFlags(destX, y, plane, client) & S) == 0 &&
                        (Scene.getCollisionFlags(x, destY, plane, client) & W) == 0;
            case WEST:
                return (Scene.getCollisionFlags(x, y, plane, client) & W) == 0;
            case NORTHWEST:
                return (Scene.getCollisionFlags(x, y, plane, client) & NW) == 0 &&
                        (Scene.getCollisionFlags(destX, y, plane, client) & N) == 0 &&
                        (Scene.getCollisionFlags(x, destY, plane, client) & W) == 0;
            default:
                return false;
        }
    }
}
