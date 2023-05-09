package accessors;

import java.awt.*;
import java.awt.datatransfer.Clipboard;

public interface RSGameShell {
    public Canvas getCanvas();

    public long getCanvasSetTimeMs();

    public int getCanvasX();

    public int getCanvasY();

    public Clipboard getClipboard();

    public int getContentHeight();

    public int getContentHeight0();

    public int getContentWidth();

    public int getContentWidth0();

    public EventQueue getEventQueue();

    public Frame getFrame();

    public boolean getHasErrored();

    public boolean getIsCanvasInvalid();

    public int getMaxCanvasHeight();

    public int getMaxCanvasWidth();

    public RSMouseWheelHandler getMouseWheelHandler();
}
