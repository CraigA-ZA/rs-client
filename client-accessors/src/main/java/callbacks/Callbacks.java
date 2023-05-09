package api;

import java.awt.*;

public interface Callbacks {
    void onTick();
    void onDraw();

    void repaint(Image image);
}
