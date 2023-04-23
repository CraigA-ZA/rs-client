import java.util.Iterator;

public class IterableDualNodeQueueIterator implements Iterator {
   IterableDualNodeQueue queue;
   DualNode an;
   DualNode aw = null;

   IterableDualNodeQueueIterator(IterableDualNodeQueue var1) {
      this.queue = var1;
      this.an = this.queue.sentinel.previousDual;
      this.aw = null;
   }

   public Object next() {
      DualNode var1 = this.an;
      if (var1 == this.queue.sentinel) {
         var1 = null;
         this.an = null;
      } else {
         this.an = var1.previousDual;
      }

      this.aw = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.an != this.queue.sentinel;
   }

   public void remove() {
      if (this.aw == null) {
         throw new IllegalStateException();
      } else {
         this.aw.removeDual();
         this.aw = null;
      }
   }
}
