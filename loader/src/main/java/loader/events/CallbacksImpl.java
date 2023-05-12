package loader.events;

import accessors.RSClient;
import api.*;
import api.actor.*;
import api.utility.Movement;
import api.utility.OctantDirection;
import api.utility.VisibilityMap;
import callbacks.Callbacks;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class CallbacksImpl implements Callbacks {
    final RSClient client;
    final Mouse mouse;
    final Viewport viewport;
    final Players players;
    final Npcs npcs;
    final Camera camera;

    List<SceneTile> tilesWithPlayersOrNpcs = new ArrayList<>();

    @Override
    public void onTick() {
//        System.out.println(client.getLevels().toString());
//        Logger.log(String.format("Ontick: Camera pitch: x: %d, y: %d, z: %d", client.getCameraX(), client.getCameraY(), client.getCameraZ()));
//        if(client.getLocalPlayer() != null) {
//            System.out.println("Sending click: X:" + client.getLocalPlayer().getTileX() + " Y:" + client.getLocalPlayer().getTileY());
//            mouseWrapper.sendClick(client.getLocalPlayer().getTileX(), client.getLocalPlayer().getTileY(), 1);
//        }
        tilesWithPlayersOrNpcs.clear();
        players.toList().stream().map(Player::getLocation).forEach(tilesWithPlayersOrNpcs::add);
        npcs.toList().stream().map(Npc::getLocation).forEach(tilesWithPlayersOrNpcs::add);
    }

    @Override
    public void onDraw() {
//        Logger.log(String.format("Ondraw: Camera pitch: x: %d, y: %d, z: %d", client.getCameraX(), client.getCameraY(), client.getCameraZ()));
    }

    @Override
    public void repaint(Image image) {
        Graphics2D graphics = (Graphics2D) image.getGraphics();

        //Mouse trail debug
        if (mouse != null) {
            int mouseX = mouse.getX();
            int mouseY = mouse.getY();
            int lastMousePressX = mouse.getLastPressedX();
            int lastMousePressY = mouse.getLastPressedY();
            long lastMousePressTime = mouse.getLastPressedTimeMillis();
            graphics.setColor(Color.GREEN);
            graphics.drawLine(mouseX - 5, mouseY - 5, mouseX + 5, mouseY + 5);
            graphics.drawLine(mouseX + 5, mouseY - 5, mouseX - 5, mouseY + 5);
            if (System.currentTimeMillis() - lastMousePressTime < 1000) {
                graphics.setColor(Color.RED);
                graphics.drawLine(lastMousePressX - 5, lastMousePressY - 5, lastMousePressX + 5, lastMousePressY + 5);
                graphics.drawLine(lastMousePressX + 5, lastMousePressY - 5, lastMousePressX - 5, lastMousePressY + 5);
            }
        }

        //Viewport stats debug
        graphics.setColor(Color.CYAN);
        graphics.draw(viewport.getShape());
        List<String> strings = List.of(
                "viewportOffsetX/Y: " + viewport.getX() + ", " + viewport.getY(),
                "viewportWidth/Height: " + viewport.getWidth() + ", " + viewport.getHeight(),
                "viewportZoom: " + viewport.getZoom(),
                "viewportMouseX/Y: " + viewport.getMouseX() + ", " + viewport.getMouseY(),
                "mouseHandlerX/Y: " + mouse.getX() + ", " + mouse.getY(),
                "viewportContainsMouse: " + viewport.containsMouse()
        );
        graphics.setColor(Color.WHITE);
        int x = 20;
        int y = 40;
        for (String s : strings) {
            graphics.drawString(s, x, y);
            y += graphics.getFont().getSize() + 5;
        }

        //Actor health debug
        graphics.setColor(Color.GREEN);

        List<Actor> actors = new ArrayList<>();
        actors.addAll(players.toList());
        actors.addAll(players.toList());
        for (Actor actor : actors) {
            SceneTile loc = actor.getLocation();
            if (!loc.isLoaded()) continue;
            Point pt = loc.getCenter().toScreen(viewport);
            if (pt == null) continue;
            Double health = actor.getHealth();
            if (health == null) continue;
            String string = health.toString();
            graphics.drawString(string, pt.x, pt.y);
        }

        //Draw square around tile under mouse
        Point mousePoint = mouse.getLocation();
        Position viewportPosition = viewport.toGame(mousePoint);
        if (viewportPosition != null && viewportPosition.isLoaded()) {
            graphics.setColor(Color.RED);
            graphics.draw(viewportPosition.getSceneTile().outline(viewport));

            Point fromViewportPoint = viewportPosition.toScreen(viewport);
            if (fromViewportPoint != null) {
                graphics.fill(shapeAt(fromViewportPoint));
            }
        }

        //Draw square under all tiles where theres an npc or player
        //This links to a block in the onTick section
        for (SceneTile t : tilesWithPlayersOrNpcs) {
            Shape o = t.outline(viewport);
            graphics.draw(o);
        }

        //Draw all tiles
        for(SceneTile tile: VisibilityMap.visibleTiles(camera, client)) {
            graphics.draw(tile.outline(viewport));
        }

        //Walk movement debug
        BasicStroke stroke = new BasicStroke(2.0f);
//        Point mousePoint = mouse.getLocation(); this is already declared above
//        Position viewportPosition = viewport.toGame(mousePoint); also already defined above
        if(viewportPosition != null) {
            graphics.setStroke(stroke);
            SceneTile mouseTile = viewportPosition.getSceneTile();
            for(OctantDirection direction: OctantDirection.values()) {
                SceneTile destinationTile = mouseTile.plus(direction);
                if(!destinationTile.isLoaded()) {
                    continue;
                }
                Shape outline = destinationTile.outline(viewport);
                if(Movement.canMove(mouseTile, direction, client)) {
                    graphics.setColor(Color.GREEN);
                } else {
                    graphics.setColor(Color.RED);
                }
                graphics.draw(outline);
            }
        }

        //Inventory debug
        int inventoryOutputX = 5;
        int inventoryOutputY = 40;

//        graphics.setColor(Color.WHITE);
        ItemContainer inventoryContainer = Inventory.getContainer(client);
//        for(Item item: inventoryContainer.stream().toList()) {
//            graphics.drawString(item.toString(), inventoryOutputX, inventoryOutputY);
//            y += graphics.getFont().getSize() + 5;
//        }
    }

    public Shape shapeAt(Point point) {
        Ellipse2D.Double circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(point, new Point(point.x + 5, point.y + 5));
        return circle;
    }
}
