import java.util.Iterator;

public class IterableNodeDequeDescendingIterator implements Iterator {
   Node aw = null;
   IterableNodeDeque deque;
   Node an;

   void an() {
      this.an = this.deque != null ? this.deque.sentinel.previous : null;
      this.aw = null;
   }

   public boolean hasNext() {
      return this.an != this.deque.sentinel && this.an != null;
   }

   public void remove() {
      if (this.aw == null) {
         throw new IllegalStateException();
      } else {
         this.aw.remove();
         this.aw = null;
      }
   }

   void af(IterableNodeDeque var1) {
      this.deque = var1;
      this.an();
   }

   public Object next() {
      Node var1 = this.an;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.an = null;
      } else {
         this.an = var1.previous;
      }

      this.aw = var1;
      return var1;
   }

   IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
      this.af(var1);
   }
}
