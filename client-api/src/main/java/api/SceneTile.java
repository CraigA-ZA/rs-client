package api;

import lombok.AllArgsConstructor;
import api.utility.LocalValue;
import api.utility.OctantDirection;

@AllArgsConstructor
public class SceneTileWrapper {
    private final int x;
    private final int y;
    private final int plane;

    public static boolean isXyLoaded(int n) {
        return n >= 0 && n < SceneWrapper.SIZE;
    }

    public static boolean isPlaneLoaded(int plane) {
        return plane >= 0 && plane < SceneWrapper.PLANE_SIZE;
    }

    public static boolean isLoaded(int x, int y, int plane) {
        return isXyLoaded(x) && isXyLoaded(y) && isPlaneLoaded(plane);
    }

    public boolean isLoaded() {
        return isLoaded(x, y, plane);
    }

    public Position getCenter() {
        return Position.centerOfTile(x, y, 0, plane);
    }
//
//    public Position getBase() {
//        return new Position(x, 0, y, 0, 0, plane);
//    }
//

//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public int getPlane() {
//        return plane;
//    }

    //
//    public GlobalTile toGlobalTile() {
//        return new GlobalTile(x + Scene.base.x, y + Scene.base.y, plane);
//    }
//
//    public int getHeight() {
//        return Scene.getHeight(this);
//    }
//
//    public SceneTile plus(SceneTile sceneTile) {
//        return new SceneTile(x + sceneTile.x, y + sceneTile.y, plane + sceneTile.plane);
//    }
//
//    public List<Position> getCorners() {
//        return List.of(
//                new Position(x, 0, y, 0, 0, plane),
//                new Position(x, LocalValue.MAX_SUB, y, 0, 0, plane),
//                new Position(x, LocalValue.MAX_SUB, y, LocalValue.MAX_SUB, 0, plane),
//                new Position(x, 0, y, LocalValue.MAX_SUB, 0, plane)
//        );
//    }
//
//    public Shape outline(Projection projection) {
//        Point tempPoint = new Point();
//
//        Path2D.Float path = new Path2D.Float(Path2D.WIND_NON_ZERO, 6);
//
//        int xMin = new LocalValue(x, 0).value;
//        int yMin = new LocalValue(y, 0).value;
//        int xMax = new LocalValue(x, LocalValue.MAX_SUB).value;
//        int yMax = new LocalValue(y, LocalValue.MAX_SUB).value;
//
//        if (!projection.toScreen(xMin, yMin, 0, plane, tempPoint)) return path;
//        float x0 = tempPoint.x;
//        float y0 = tempPoint.y;
//        if (!projection.toScreen(xMax, yMin, 0, plane, tempPoint)) return path;
//        float x1 = tempPoint.x;
//        float y1 = tempPoint.y;
//        if (!projection.toScreen(xMax, yMax, 0, plane, tempPoint)) return path;
//        float x2 = tempPoint.x;
//        float y2 = tempPoint.y;
//        if (!projection.toScreen(xMin, yMax, 0, plane, tempPoint)) return path;
//        float x3 = tempPoint.x;
//        float y3 = tempPoint.y;
//
//        appendPolygon4(path, x0, y0, x1, y1, x2, y2, x3, y3);
//
//        return path;
//    }

//    private static void appendPolygon4(Path2D.Float path,
//                                       float x0, float y0,
//                                       float x1, float y1,
//                                       float x2, float y2,
//                                       float x3, float y3) {
//        path.moveTo(x0, y0);
//        path.lineTo(x1, y1);
//        path.lineTo(x2, y2);
//        path.lineTo(x3, y3);
//        path.lineTo(x0, y0);
//        path.closePath();
//    }
//
//    public int distanceTo(SceneTileWrapper other) {
//        return Math.max(Math.abs(x - other.x), Math.abs(y - other.y));
//    }
//
//    public SceneTileWrapper plus(OctantDirection direction) {
//        return new SceneTileWrapper(x + direction.getX(), y + direction.getY(), plane);
//    }
}