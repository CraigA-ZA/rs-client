package api;

import accessors.RSClient;
import com.google.inject.Inject;
import lombok.AllArgsConstructor;
import api.utility.Angle;

import java.awt.*;

@AllArgsConstructor
public class Viewport implements Projection {
    public RSClient client;

    public int getX() {
        return client.getViewportOffsetX();
    }

    public int getY() {
        return client.getViewportOffsetY();
    }

    public int getWidth() {
        return client.getViewportWidth();
    }

    public int getHeight() {
        return client.getViewportHeight();
    }

    public int getZoom() {
        return client.getViewportZoom();
    }

    public Rectangle getShape() {
        return new Rectangle(getX(), getY(), getWidth(), getHeight());
    }

    public boolean toScreen(int localX, int localY, int height, int plane, int tileHeightLocalX, int tileHeightLocalY, Point result, RSClient client) {
        if (!Position.isLoaded(tileHeightLocalX, tileHeightLocalY, plane)) {
            return false;
        }
        int x1 = localX;
        int y1 = localY;
        int z1 = Scene.getTileHeight(tileHeightLocalX, tileHeightLocalY, plane, client) - height;
        Camera camera = new Camera(client);
        x1 -= camera.getLocalX();
        y1 -= camera.getLocalY();
        z1 -= camera.getAbsoluteHeight();
        Angle cameraPitch = camera.getPitch();
        int sinY = cameraPitch.sinInternal();
        int cosY = cameraPitch.cosInternal();
        Angle cameraYaw = camera.getYaw();
        int sinX = cameraYaw.sinInternal();
        int cosX = cameraYaw.cosInternal();
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

    public int getMouseX() {
        return client.getViewportMouse_x();
    }

    public int getMouseY() {
        return client.getViewportMouse_y();
    }

    public boolean containsMouse() {
        return client.getViewportMouse_isInViewport();
    }


    public Position toGame(int x, int y) {
        int plane = client.getPlane();
        for (int xi = 0; xi < Scene.SIZE; xi++) {
            for (int yi = 0; yi < Scene.SIZE; yi++) {
                SceneTile tile = new SceneTile(xi, yi, plane, client);
                Shape bounds = tile.outline(this);
                if (bounds.contains(x, y)) {
                    return tile.getCenter();
                }
            }
        }
        return null;
    }
//
//    @Override
//    public String toString() {
//        return "Viewport(zoom=" + getZoom() + ", shape=" + getShape() + ")";
//    }
//
//
//    public boolean contains(int x, int y) {
//        return x >= getX() && y >= getY() && x <= (getX() + getWidth()) && y <= (getY() + getHeight());
//    }
//
//    public boolean contains(Point point) {
//        return contains(point.x, point.y);
//    }
//
//    public ComponentWrapper getComponent() {
//        if (client.getViewportComponent() != null) {
//            return new ComponentWrapper(client.getViewportComponent());
//        } else {
//            return null;
//        }
//    }

}
