package api;

import accessors.RSClient;
import com.google.common.base.Preconditions;
import lombok.AllArgsConstructor;
import api.utility.LocalValue;

@AllArgsConstructor
public class Scene {
    public static final int SIZE = 104;
    public static final int PLANE_SIZE = 4;
//    public static final SceneTileWrapper CENTER = new SceneTileWrapper(SIZE / 2, SIZE / 2, 0);
//    public static final SceneTileWrapper BASE = new SceneTileWrapper(0, 0, 0);

    public static boolean isLinkBelow(int x, int y, int plane, RSClient client) {
        return plane < 3 && (getRenderFlags(x, y, 1, client) & 2) != 0;
    }


    public static byte getRenderFlags(int x, int y, int plane, RSClient client) {
        return client.getTiles_renderFlags()[plane][x][y];
    }


    public static int getHeight(int x, int y, int plane, RSClient client) {
        return client.getTiles_heights()[plane][x][y];
    }


    public static int getTileHeight(int localX, int localY, int plane, RSClient client) {
        int x = new LocalValue(localX).getScene();
        int y = new LocalValue(localY).getScene();
        SceneTile sceneTile = new SceneTile(x, y, plane, client);
        Preconditions.checkArgument(sceneTile.isLoaded(), sceneTile);
        int subX = new LocalValue(localX).getSub();
        int subY = new LocalValue(localY).getSub();
        int p = isLinkBelow(x, y, plane, client) ? plane + 1 : plane;
        int o = getHeight(x, y, p, client);
        if (x == Scene.SIZE - 1 || y == Scene.SIZE - 1) {
            return o;
        }
        int ne = getHeight(1 + x, 1 + y, p, client);
        int n = getHeight(x, 1 + y, p, client);
        int e = getHeight(1 + x, y, p, client);
        return subY * (ne * subX + n * (128 - subX) >> 7) +
                (128 - subY) * (subX * e + o * (128 - subX) >> 7) >> 7;
    }

    public static int getTileHeight(Position position, RSClient client) {
        return getTileHeight(position.getLocalX(), position.getLocalY(), position.getPlane(), client);
    }
//    public static boolean isLinkBelow(SceneTileWrapper sceneTile) {
//        return isLinkBelow(sceneTile.getX(), sceneTile.getY(), sceneTile.getPlane());
//    }
//    public static final List<SceneTileWrapper> CORNERS = new ArrayList<SceneTileWrapper>() {{
//        add(BASE);
//        add(new SceneTileWrapper(SIZE - 1, 0, 0));
//        add(new SceneTileWrapper(SIZE - 1, SIZE - 1, 0));
//        add(new SceneTileWrapper(0, SIZE - 1, 0));
//    }};
    public static int getCollisionFlags(int x, int y, int plane, RSClient client) {
        return client.getCollisionMaps()[plane].getFlags()[x][y];
    }
//    public static GlobalTile getBase() {
//        return new GlobalTile(CLIENT.baseX, CLIENT.baseY, 0);
//    }
//    public static int[] getRegionIds() {
//        return CLIENT.regions != null ? CLIENT.regions : new int[0];
//    }
//    public static List<Region> getRegions() {
//        List<Region> regions = new ArrayList<>();
//        for (int regionId : getRegionIds()) {
//            regions.add(new Region(regionId));
//        }
//        return regions;
//    }
//    public static Observable<Unit> getReloads() {
//        return XScene.init.exit.map(ignore -> Unit.INSTANCE);
//    }
//    public static void reload() {
//        if (Game.getState() == GameState.LOGGED_IN) {
//            CLIENT.updateGameState(GameState.LOADING);
//        }
//    }
//    public static int getHeight(SceneTileWrapper sceneTile) {
//        if (!sceneTile.isLoaded()) {
//            throw new IllegalArgumentException(sceneTile.toString());
//        }
//        return getHeight(sceneTile.getX(), sceneTile.getY(), sceneTile.getPlane());
//    }
}
