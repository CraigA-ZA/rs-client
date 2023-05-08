package loader.events;

import accessors.RSClient;
import accessors.RSMouseHandler;
import accessors.RSMouseRecorder;
import callbacks.Callbacks;
import loader.logging.Logger;
import lombok.AllArgsConstructor;
import lombok.Getter;
import wrappers.MouseWrapper;

import java.awt.*;
import java.util.List;

@Getter
@AllArgsConstructor
public class CallbacksImpl implements Callbacks {
    RSClient client;
    MouseWrapper mouseWrapper;

    @Override
    public void onTick() {
//        System.out.println(client.getLevels().toString());
//        Logger.log(String.format("Ontick: Camera pitch: x: %d, y: %d, z: %d", client.getCameraX(), client.getCameraY(), client.getCameraZ()));
//        if(client.getLocalPlayer() != null) {
//            System.out.println("Sending click: X:" + client.getLocalPlayer().getTileX() + " Y:" + client.getLocalPlayer().getTileY());
//            mouseWrapper.sendClick(client.getLocalPlayer().getTileX(), client.getLocalPlayer().getTileY(), 1);
//        }

    }

    @Override
    public void onDraw() {
//        Logger.log(String.format("Ondraw: Camera pitch: x: %d, y: %d, z: %d", client.getCameraX(), client.getCameraY(), client.getCameraZ()));
    }

    @Override
    public void repaint(Image image) {
        RSMouseHandler mouseHandler = client.getMouseHandler_instance();
        Graphics2D graphics = (Graphics2D) image.getGraphics();
        if (mouseHandler != null) {
            int mouseX = client.getMouseHandler_x();
            int mouseY = client.getMouseHandler_y();
            int lastMousePressX = client.getMouseHandler_lastPressedX();
            int lastMousePressY = client.getMouseHandler_lastPressedY();
            long lastMousePressTime = client.getMouseHandler_lastPressedTimeMillis();
            graphics.setColor(Color.GREEN);
            graphics.drawLine(mouseX - 5, mouseY - 5, mouseX + 5, mouseY + 5);
            graphics.drawLine(mouseX + 5, mouseY - 5, mouseX - 5, mouseY + 5);
            if (System.currentTimeMillis() - lastMousePressTime < 1000) {
                graphics.setColor(Color.RED);
                graphics.drawLine(lastMousePressX - 5, lastMousePressY - 5, lastMousePressX + 5, lastMousePressY + 5);
                graphics.drawLine(lastMousePressX + 5, lastMousePressY - 5, lastMousePressX - 5, lastMousePressY + 5);
            }
        }
        graphics.setColor(Color.CYAN);
        graphics.draw(Viewport.shape);
        graphics.setColor(Color.BLUE);
        List<String> strings = List.of(
                "viewportOffsetX/Y: ${CLIENT.viewportOffsetX}, ${CLIENT.viewportOffsetY}",
                "viewportWidth/Height: ${CLIENT.viewportWidth}, ${CLIENT.viewportHeight}",
                "viewportZoom: ${CLIENT.viewportZoom}",
                "viewportMouseX/Y: ${CLIENT.viewportMouse_x}, ${CLIENT.viewportMouse_y}",
                "viewportContainsMouse: ${CLIENT.viewportMouse_isInViewport}"
        );
        graphics.setFont(Fonts.PLAIN_12);
        graphics.setColor(Color.WHITE);
        int x = 20;
        int y = 40;
        for(String s: strings) {
            graphics.drawString(s, x, y);
            y += graphics.getFont().getSize() + 5;
        }
    }
}
