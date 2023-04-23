import java.util.Iterator;

public class IterableDualNodeQueue implements Iterable {
   DualNode an;
   public DualNode af = new DualNode();

   public IterableDualNodeQueue() {
      this.af.ez = this.af;
      this.af.ej = this.af;
   }

   public void af() {
      while(this.af.ez != this.af) {
         this.af.ez.removeDual();
      }

   }

   public void an(DualNode var1) {
      if (var1.ej != null) {
         var1.removeDual();
      }

      var1.ej = this.af.ej;
      var1.ez = this.af;
      var1.ej.ez = var1;
      var1.ez.ej = var1;
   }

   public static void aw(DualNode var0, DualNode var1) {
      if (var0.ej != null) {
         var0.removeDual();
      }

      var0.ej = var1;
      var0.ez = var1.ez;
      var0.ej.ez = var0;
      var0.ez.ej = var0;
   }

   public DualNode ac() {
      DualNode var1 = this.af.ez;
      if (var1 == this.af) {
         return null;
      } else {
         var1.removeDual();
         return var1;
      }
   }

   public DualNode au() {
      return this.ab((DualNode)null);
   }

   DualNode ab(DualNode var1) {
      DualNode var2;
      if (var1 == null) {
         var2 = this.af.ez;
      } else {
         var2 = var1;
      }

      if (var2 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var2.ez;
         return var2;
      }
   }

   public DualNode aq() {
      DualNode var1 = this.an;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.ez;
         return var1;
      }
   }

   public Iterator iterator() {
      return new IterableDualNodeQueueIterator(this);
   }
}
