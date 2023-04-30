import accessors.RSMouseWheelHandler;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class ak implements gf, MouseWheelListener, RSMouseWheelHandler {
   int af;

   void al(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized int aw(int var1) {
      try {
         int var2 = -791311769 * this.af;
         this.af = 0;
         return var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ak.aw(" + ')');
      }
   }

   void an(Component var1, int var2) {
      try {
         var1.removeMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ak.an(" + ')');
      }
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      try {
         this.af += var1.getWheelRotation() * -18484905;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ak.mouseWheelMoved(" + ')');
      }
   }

   void af(Component var1, int var2) {
      try {
         var1.addMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ak.af(" + ')');
      }
   }

   public synchronized int ao() {
      int var1 = 305504659 * this.af;
      this.af = 0;
      return var1;
   }

   void au(Component var1) {
      var1.addMouseWheelListener(this);
   }

   ak() {
      try {
         super();
         this.af = 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ak.<init>(" + ')');
      }
   }

   void aq(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   void ab(Component var1) {
      var1.addMouseWheelListener(this);
   }

   void at(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   void aa(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized int ay() {
      int var1 = -791311769 * this.af;
      this.af = 0;
      return var1;
   }

   void ac(Component var1) {
      var1.addMouseWheelListener(this);
   }
}
