import java.util.Collection;
import java.util.Iterator;

public class IterableNodeDeque implements Iterable, Collection {
   Node sentinel = new Node();
   Node current;

   public IterableNodeDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   public void clear0() {
      while(this.sentinel.previous != this.sentinel) {
         this.sentinel.previous.remove();
      }

   }

   public void addFirst(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   public void addLast(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel;
      var1.previous = this.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1;
      var0.previous = var1.previous;
      var0.next.previous = var0;
      var0.previous.next = var0;
   }

   public Node last() {
      return this.previousOrLast((Node)null);
   }

   Node previousOrLast(Node var1) {
      Node var2;
      if (var1 == null) {
         var2 = this.sentinel.previous;
      } else {
         var2 = var1;
      }

      if (var2 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var2.previous;
         return var2;
      }
   }

   public Node previous() {
      Node var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   int al() {
      int var1 = 0;

      for(Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
         ++var1;
      }

      return var1;
   }

   public boolean at() {
      return this.sentinel.previous == this.sentinel;
   }

   Node[] aa() {
      Node[] var1 = new Node[this.al()];
      int var2 = 0;

      for(Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public Iterator iterator() {
      return new IterableNodeDequeDescendingIterator(this);
   }

   public int size() {
      return this.al();
   }

   public boolean isEmpty() {
      return this.at();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.aa();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   boolean ay(Node var1) {
      this.addFirst(var1);
      return true;
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.clear0();
   }

   public boolean add(Object var1) {
      return this.ay((Node)var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      return super.hashCode();
   }
}
