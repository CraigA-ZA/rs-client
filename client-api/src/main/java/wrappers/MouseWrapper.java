package wrappers;

import accessors.RSCanvas;
import accessors.RSClient;
import accessors.RSMouseHandler;
import lombok.AllArgsConstructor;

import java.awt.*;
import java.awt.event.MouseEvent;

@AllArgsConstructor
public class MouseWrapper {
    RSMouseHandler mouseHandler;
    RSClient client;
    RSCanvas canvas;

    public synchronized void sendClick(int x, int y, int button)
    {
        long time = System.currentTimeMillis();
        Canvas canvas = client.getCanvas();
        canvas.dispatchEvent(new MouseEvent(canvas, MouseEvent.MOUSE_PRESSED, time, 0, x, y, 1, false, button));
        canvas.dispatchEvent(new MouseEvent(canvas, MouseEvent.MOUSE_RELEASED, time, 0, x, y, 1, false, button));
    }
}
