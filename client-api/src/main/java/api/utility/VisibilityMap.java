package api.utility;

import accessors.RSClient;
import api.Camera;
import api.SceneTile;

import java.util.*;
import java.util.stream.IntStream;

public class VisibilityMap {

    public static boolean isVisible(SceneTile sceneTile, Camera camera, RSClient client) {
        int vpitch = (camera.getPitch().getValue() - 128) / 32;
        if (vpitch < 0 || vpitch > 7) {
            return false;
        }
        int vx = sceneTile.getX() - new LocalValue(camera.getLocalX()).getScene() + 25;
        if (vx < 0 || vx > 50) {
            return false;
        }
        int vy = sceneTile.getY() - new LocalValue(camera.getLocalY()).getScene() + 25;
        if (vy < 0 || vy > 50) {
            return false;
        }
        int vyaw = camera.getYaw().getValue() / 64;
        return client.getVisibilityMap()[vpitch][vyaw][vx][vy];
    }

    public static List<SceneTile> visibleTiles(Camera camera, RSClient client) {
        int vpitch = (camera.getPitch().getValue() - 128) / 32;
        if (vpitch < 0 || vpitch > 7) {
            return Collections.emptyList();
        }
        int vyaw = camera.getYaw().getValue() / 64;
        boolean[][] xymap = client.getVisibilityMap()[vpitch][vyaw];
        SceneTile camTile = camera.getPosition().getSceneTile();
        List<SceneTile> tiles = new ArrayList<>();
        IntStream.range(0, 50)
                .forEach(x -> IntStream.range(0, 50)
                        .filter(y -> xymap[x][y])
                        .mapToObj(y -> new SceneTile(x + camTile.getX() - 25, y + camTile.getY() - 25, camTile.getPlane(), client))
                        .forEach(tiles::add));
        return tiles;
    }
}