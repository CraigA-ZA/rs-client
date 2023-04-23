import java.util.Collection;
import java.util.Iterator;

public class IterableNodeDeque implements Iterable, Collection {
   Node af = new Node();
   Node an;

   public IterableNodeDeque() {
      this.af.hc = this.af;
      this.af.hg = this.af;
   }

   public void clear0() {
      while(this.af.hc != this.af) {
         this.af.hc.remove();
      }

   }

   public void addFirst(Node var1) {
      if (var1.hg != null) {
         var1.remove();
      }

      var1.hg = this.af.hg;
      var1.hc = this.af;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
   }

   public void addLast(Node var1) {
      if (var1.hg != null) {
         var1.remove();
      }

      var1.hg = this.af;
      var1.hc = this.af.hc;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
   }

   public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
      if (var0.hg != null) {
         var0.remove();
      }

      var0.hg = var1;
      var0.hc = var1.hc;
      var0.hg.hc = var0;
      var0.hc.hg = var0;
   }

   public Node last() {
      return this.previousOrLast((Node)null);
   }

   Node previousOrLast(Node var1) {
      Node var2;
      if (var1 == null) {
         var2 = this.af.hc;
      } else {
         var2 = var1;
      }

      if (var2 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var2.hc;
         return var2;
      }
   }

   public Node previous() {
      Node var1 = this.an;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.hc;
         return var1;
      }
   }

   int al() {
      int var1 = 0;

      for(Node var2 = this.af.hc; var2 != this.af; var2 = var2.hc) {
         ++var1;
      }

      return var1;
   }

   public boolean at() {
      return this.af.hc == this.af;
   }

   Node[] aa() {
      Node[] var1 = new Node[this.al()];
      int var2 = 0;

      for(Node var3 = this.af.hc; var3 != this.af; var3 = var3.hc) {
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

      for(Node var3 = this.af.hc; var3 != this.af; var3 = var3.hc) {
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
