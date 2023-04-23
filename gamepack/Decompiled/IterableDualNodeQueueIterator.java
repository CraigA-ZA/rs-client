import java.util.Iterator;

public class IterableDualNodeQueueIterator implements Iterator {
   IterableDualNodeQueue af;
   DualNode an;
   DualNode aw = null;

   IterableDualNodeQueueIterator(IterableDualNodeQueue var1) {
      this.af = var1;
      this.an = this.af.af.ez;
      this.aw = null;
   }

   public Object next() {
      DualNode var1 = this.an;
      if (var1 == this.af.af) {
         var1 = null;
         this.an = null;
      } else {
         this.an = var1.ez;
      }

      this.aw = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.an != this.af.af;
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
