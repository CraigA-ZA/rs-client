import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class MouseWheelHandler implements MouseWheel, MouseWheelListener {
   int rotation = 0;

   public synchronized int useRotation() {
      int var2 = -791311769 * this.rotation;
      this.rotation = 0;
      return var2;
   }

   void removeFrom(java.awt.Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.rotation += var1.getWheelRotation() * -18484905;
   }

   void addTo(java.awt.Component var1) {
      var1.addMouseWheelListener(this);
   }

   MouseWheelHandler() {
   }
}
