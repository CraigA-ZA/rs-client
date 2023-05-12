package api;

import accessors.RSClient;
import api.utility.LocalValue;
import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class Position {
    private final int localX;
    private final int localY;
    private final int height;
    private final int plane;
    private final RSClient client;

    public Position(int x, int subX, int y, int subY, int height, int plane, RSClient client) {
        this(new LocalValue(x, subX).getValue(), new LocalValue(y, subY).getValue(), height, plane, client);
    }

    public Point toScreen(Projection projection) {
        return projection.toScreen(this, this.client);
    }

    public int getLocalX() {
        return localX;
    }

    public int getLocalY() {
        return localY;
    }

    public int getHeight() {
        return height;
    }

    public int getPlane() {
        return plane;
    }

    public static boolean isLoaded(int localX, int localY, int plane) {
        return SceneTile.isLoaded(new LocalValue(localX).getScene(), new LocalValue(localY).getScene(), plane);
    }

    public static Position centerOfTile(int x, int y, int height, int plane, RSClient client) {
        return new Position(x, LocalValue.MID_SUB, y, LocalValue.MID_SUB, height, plane, client);
    }
    public boolean isLoaded() {
        return Position.isLoaded(localX, localY, plane);
    }

    public SceneTile getSceneTile() {
        return new SceneTile(getX(), getY(), plane, client);
    }

    public int getX() {
        return new LocalValue(localX).getScene();
    }
    public int getY() {
        return new LocalValue(localY).getScene();
    }
//    public int getSubX() {
//        return new LocalValue(localX).getSub();
//    }
//    public int getSubY() {
//        return new LocalValue(localY).getSub();
//    }
//    public Position plusLocal(int localX, int localY, int height) {
//        return new Position(localX + this.localX, localY + this.localY, height + this.height, plane);
//    }
//    public Position plus(Position position) {
//        return new Position(position.localX + localX, position.localY + localY, position.height + height, position.plane + plane);
//    }
}
