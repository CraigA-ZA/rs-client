package wrappers;

import accessors.RSClient;

import java.awt.*;

public interface Projection {
    //
//    Position toGame(int x, int y);
//
//
//    default Position toGame(Point point) {
//        return toGame(point.x, point.y);
//    }
//
    boolean toScreen(int localX, int localY, int height, int plane, int tileHeightLocalX, int tileHeightLocalY, Point result, RSClient client);

    default boolean toScreen(int localX, int localY, int height, int plane, Point result, RSClient client) {
        return toScreen(localX, localY, height, plane, localX, localY, result, client);
    }

    default Point toScreen(int localX, int localY, int height, int plane, int tileHeightLocalX, int tileHeightLocalY, RSClient client) {
        Point pt = new Point();
        return toScreen(localX, localY, height, plane, tileHeightLocalX, tileHeightLocalY, pt, client) ? pt : null;
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