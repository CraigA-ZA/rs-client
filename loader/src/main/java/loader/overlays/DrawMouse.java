package loader.overlays;

import accessors.RSClient;

import java.awt.*;

//public class DrawMouse implements PaintListener {
//    private final RSClient client;
//
//    public DrawMouse(RSClient client) {
//        this.client = client;
//    }
//
//    public void onRepaint(final Graphics render) {
//        Mouse mouse = client.getMouseRecorder();
//        if (mouse != null) {
//            int mouse_x = mouse.getX();
//            int mouse_y = mouse.getY();
//            int mouse_press_x = mouse.getPressX();
//            int mouse_press_y = mouse.getPressY();
//            long mouse_press_time = mouse.getPressTime();
//            render.setColor(Color.GREEN);
//            render.drawLine(mouse_x - 5, mouse_y - 5, mouse_x + 5, mouse_y + 5);
//            render.drawLine(mouse_x + 5, mouse_y - 5, mouse_x - 5, mouse_y + 5);
//            if (System.currentTimeMillis() - mouse_press_time < 1000) {
//                render.setColor(Color.RED);
//                render.drawLine(mouse_press_x - 5, mouse_press_y - 5, mouse_press_x + 5, mouse_press_y + 5);
//                render.drawLine(mouse_press_x + 5, mouse_press_y - 5, mouse_press_x - 5, mouse_press_y + 5);
//            }
//        }
//    }
//}
