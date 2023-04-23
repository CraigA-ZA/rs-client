import java.util.Iterator;

public class IterableNodeDequeDescendingIterator implements Iterator {
   IterableNodeDeque af;
   Node an;
   Node aw = null;

   IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
      this.af(var1);
   }

   void af(IterableNodeDeque var1) {
      this.af = var1;
      this.an();
   }

   void an() {
      this.an = this.af != null ? this.af.af.hc : null;
      this.aw = null;
   }

   public Object next() {
      Node var1 = this.an;
      if (var1 == this.af.af) {
         var1 = null;
         this.an = null;
      } else {
         this.an = var1.hc;
      }

      this.aw = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.an != this.af.af && this.an != null;
   }

   public void remove() {
      if (this.aw == null) {
         throw new IllegalStateException();
      } else {
         this.aw.remove();
         this.aw = null;
      }
   }
}
