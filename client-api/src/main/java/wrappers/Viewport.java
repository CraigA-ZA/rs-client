package wrappers;

import accessors.RSClient;
import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class Viewport {
    public static final int FIXED_ZOOM_DEFAULT = 512;
    public static final int FIXED_ZOOM_MIN = 390;
    public static final int FIXED_ZOOM_MAX = 1400;
    public RSClient client;

    public int getX() {
        return client.viewportOffsetX;
    }

    public int getY() {
        return client.viewportOffsetY;
    }

    public int getWidth() {
        return client.viewportWidth;
    }

    public int getHeight() {
        return client.viewportHeight;
    }

    public int getZoom() {
        return client.viewportZoom;
    }

    public Rectangle getShape() {
        return new Rectangle(getX(), getY(), getWidth(), getHeight());
    }

    public boolean contains(int x, int y) {
        return x >= getX() && y >= getY() && x <= (getX() + getWidth()) && y <= (getY() + getHeight());
    }

    public boolean contains(Point point) {
        return contains(point.x, point.y);
    }

    public Component getComponent() {
        if (client.viewportComponent != null) {
            return new Component(client.viewportComponent);
        } else {
            return null;
        }
    }

    public boolean toScreen(int localX, int localY, int height, int plane, int tileHeightLocalX, int tileHeightLocalY, Point result) {
        if (!Position.isLoaded(tileHeightLocalX, tileHeightLocalY, plane)) {
            return false;
        }
        int x1 = localX;
        int y1 = localY;
        int z1 = Scene.getTileHeight(tileHeightLocalX, tileHeightLocalY, plane) - height;
        x1 -= Camera.localX;
        y1 -= Camera.localY;
        z1 -= Camera.absoluteHeight;
        int cameraPitch = Camera.pitch;
        int sinY = cameraPitch.sinInternal;
        int cosY = cameraPitch.cosInternal;
        int cameraYaw = Camera.yaw;
        int sinX = cameraYaw.sinInternal;
        int cosX = cameraYaw.cosInternal;
        int x2 = (y1 * sinX + x1 * cosX) >> 16;
        y1 = (y1 * cosX - sinX * x1) >> 16;
        x1 = x2;
        int z2 = (cosY * z1 - y1 * sinY) >> 16;
        y1 = (z1 * sinY + y1 * cosY) >> 16;
        z1 = z2;
        if (y1 < 50) {
            return false;
        }
        result.x = this.getWidth() / 2 + x1 * this.getZoom() / y1 + this.getX();
        result.y = this.getHeight() / 2 + z1 * this.getZoom() / y1 + this.getY();
        return true;
    }

    @Override
    public Position toGame(int x, int y) {
        // todo
        int plane = Camera.plane;
        for (int xi = 0; xi < Scene.SIZE; xi++) {
            for (int yi = 0; yi < Scene.SIZE; yi++) {
                SceneTile tile = new SceneTile(xi, yi, plane);
                Rectangle bounds = tile.outline(this);
                if (bounds.contains(x, y)) {
                    return tile.center();
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Viewport(zoom=" + getZoom() + ", shape=" + getShape() + ")";
    }
}
