package api;

import accessors.RSClient;
import accessors.RSComponent;
import accessors.RSNode;
import api.enums.ComponentId;
import lombok.AllArgsConstructor;
import runestar.generated.XComponent;

import java.awt.*;

@AllArgsConstructor
public class Component {
    private final RSComponent component;
    private final RSClient client;

    public int getX() {
        return component.getX();
    }

    public int getY() {
        return component.getY();
    }

    public int getWidth() {
        return component.getWidth();
    }

    public int getPaddingX() {
        return component.getPaddingX();
    }

    public int getPaddingY() {
        return component.getPaddingY();
    }

    public Point getLocation() {
        RSComponent cur = component;
        int x = 0;
        int y = 0;
        if (cur.getId() >> 16 != client.getRootInterface())
            return null;
        if (cur.getRootIndex() == -1)
            return null;
        x += client.getRootComponentXs()[cur.getRootIndex()];
        y += client.getRootComponentYs()[cur.getRootIndex()];
        return new Point(x, y);
    }
}
