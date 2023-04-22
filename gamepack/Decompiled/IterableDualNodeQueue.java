import java.util.Iterator;

public class IterableDualNodeQueue implements Iterable {
   DualNode head;
   public DualNode sentinel = new DualNode();

   public DualNode aq() {
      DualNode var1 = this.head;
      if (var1 == this.sentinel) {
         this.head = null;
         return null;
      } else {
         this.head = var1.previousDual;
         return var1;
      }
   }

   public void af() {
      while(this.sentinel.previousDual != this.sentinel) {
         this.sentinel.previousDual.removeDual();
      }

   }

   public DualNode au() {
      return this.ab((DualNode)null);
   }

   DualNode ab(DualNode var1) {
      DualNode var2;
      if (var1 == null) {
         var2 = this.sentinel.previousDual;
      } else {
         var2 = var1;
      }

      if (var2 == this.sentinel) {
         this.head = null;
         return null;
      } else {
         this.head = var2.previousDual;
         return var2;
      }
   }

   public DualNode ac() {
      DualNode var1 = this.sentinel.previousDual;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.removeDual();
         return var1;
      }
   }

   public Iterator iterator() {
      return new IterableDualNodeQueueIterator(this);
   }

   public IterableDualNodeQueue() {
      this.sentinel.previousDual = this.sentinel;
      this.sentinel.nextDual = this.sentinel;
   }

   public void an(DualNode var1) {
      if (var1.nextDual != null) {
         var1.removeDual();
      }

      var1.nextDual = this.sentinel.nextDual;
      var1.previousDual = this.sentinel;
      var1.nextDual.previousDual = var1;
      var1.previousDual.nextDual = var1;
   }

   public static void aw(DualNode var0, DualNode var1) {
      if (var0.nextDual != null) {
         var0.removeDual();
      }

      var0.nextDual = var1;
      var0.previousDual = var1.previousDual;
      var0.nextDual.previousDual = var0;
      var0.previousDual.nextDual = var0;
   }
}
