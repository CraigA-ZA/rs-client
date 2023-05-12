package api;

import accessors.RSClient;
import accessors.RSMouseHandler;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Mouse {
    RSMouseHandler mouseHandler;
    RSClient client;

    public Mouse(RSClient client) {
        this.client = client;
        this.mouseHandler = client.getMouseHandler_instance();
    }

    public synchronized void sendClick(int x, int y, int button) {
        long time = System.currentTimeMillis();
        Canvas canvas = client.getCanvas();
        canvas.dispatchEvent(new MouseEvent(canvas, MouseEvent.MOUSE_PRESSED, time, 0, x, y, 1, false, button));
        canvas.dispatchEvent(new MouseEvent(canvas, MouseEvent.MOUSE_RELEASED, time, 0, x, y, 1, false, button));
    }

    public int getX() {
        return client.getMouseHandler_x();
    }

    public int getY() {
        return client.getMouseHandler_y();
    }

    public int getLastPressedX() {
        return client.getMouseHandler_lastPressedX();
    }

    public int getLastPressedY() {
        return client.getMouseHandler_lastPressedY();
    }

    public long getLastPressedTimeMillis() {
        return client.getMouseHandler_lastPressedTimeMillis();
    }

    public Point getLocation() {
        return new Point(getX(), getY());
    }
}
