package api;

import accessors.RSClient;

import java.awt.*;

public interface Projection {

    Position toGame(int x, int y);


    /*
    Takes a Point (x,y coord) and scans over every tile in the scene to find which one
    contains the point that we passed in.
    Returns a Position which contains the center of that tile.
     */
    default Position toGame(Point point) {
        return toGame(point.x, point.y);
    }

    boolean toScreen(int localX, int localY, int height, int plane, int tileHeightLocalX, int tileHeightLocalY, Point result, RSClient client);

    default Point toScreen(int localX, int localY, int height, int plane, int tileHeightLocalX, int tileHeightLocalY, RSClient client) {
        Point pt = new Point();
        return toScreen(localX, localY, height, plane, tileHeightLocalX, tileHeightLocalY, pt, client) ? pt : null;
    }

    default boolean toScreen(int localX, int localY, int height, int plane, Point result, RSClient client) {
        return toScreen(localX, localY, height, plane, localX, localY, result, client);
    }

    default Point toScreen(Position position, RSClient client) {
        return toScreen(position, position, client);
    }

    default Point toScreen(Position position, Position tileHeight, RSClient client) {
        return toScreen(position.getLocalX(), position.getLocalY(), position.getHeight(), position.getPlane(), tileHeight.getLocalX(), tileHeight.getLocalY(), client);
    }

    default Point toScreen(int localX, int localY, int height, int plane, RSClient client) {
        return toScreen(localX, localY, height, plane, localX, localY, client);
    }
}