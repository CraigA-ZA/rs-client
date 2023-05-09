package wrappers;

import accessors.RSClient;
import wrappers.utility.LocalValue;

import java.awt.*;

public class Position {
    private final int localX;
    private final int localY;
    private final int height;
    private final int plane;

    public Position(int localX, int localY, int height, int plane) {
        this.localX = localX;
        this.localY = localY;
        this.height = height;
        this.plane = plane;
    }

    public Position(int x, int subX, int y, int subY, int height, int plane) {
        this(new LocalValue(x, subX).getValue(), new LocalValue(y, subY).getValue(), height, plane);
    }

    public Point toScreen(Projection projection, RSClient client) {
        return projection.toScreen(this, client);
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
        return SceneTileWrapper.isLoaded(new LocalValue(localX).getScene(), new LocalValue(localY).getScene(), plane); //TODO Thhis might be super scuffed
    }

    public static Position centerOfTile(int x, int y, int height, int plane) {
        return new Position(x, LocalValue.MID_SUB, y, LocalValue.MID_SUB, height, plane);    //TODO this might be dodgy, but I dont think so
    }
    //
//
//    public SceneTile getSceneTile() {
//        return new SceneTile(getX(), getY(), plane);
//    }
//
//    public boolean isLoaded() {
//        return Position.isLoaded(localX, localY, plane);
//    }
//
//
//
//
//    public int getX() {
//        return new LocalValue(localX).getScene();
//    }
//
//    public int getY() {
//        return new LocalValue(localY).getScene();
//    }
//
//    public int getSubX() {
//        return new LocalValue(localX).getSub();
//    }
//
//    public int getSubY() {
//        return new LocalValue(localY).getSub();
//    }
//
//
//    public Position plusLocal(int localX, int localY, int height) {
//        return new Position(localX + this.localX, localY + this.localY, height + this.height, plane);
//    }
//

//
//    public Position plus(Position position) {
//        return new Position(position.localX + localX, position.localY + localY, position.height + height, position.plane + plane);
//    }
//

}
