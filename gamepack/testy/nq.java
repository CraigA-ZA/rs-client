import accessors.RSIterableNodeDequeDescendingIterator;
import java.util.Iterator;

public class nq implements Iterator, RSIterableNodeDequeDescendingIterator {
   rp aw = null;
   oi af;
   rp an;

   public boolean aa() {
      return this.an != this.af.af && this.an != null;
   }

   void an() {
      this.an = this.af != null ? this.af.af.hc : null;
      this.aw = null;
   }

   void aw() {
      this.an = this.af != null ? this.af.af.hc : null;
      this.aw = null;
   }

   public Object aq() {
      rp var1 = this.an;
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
         this.aw.ga();
         this.aw = null;
      }
   }

   void af(oi var1) {
      this.af = var1;
      this.an();
   }

   void ac() {
      this.an = this.af != null ? this.af.af.hc : null;
      this.aw = null;
   }

   public Object au() {
      rp var1 = this.an;
      if (var1 == this.af.af) {
         var1 = null;
         this.an = null;
      } else {
         this.an = var1.hc;
      }

      this.aw = var1;
      return var1;
   }

   public Object ab() {
      rp var1 = this.an;
      if (var1 == this.af.af) {
         var1 = null;
         this.an = null;
      } else {
         this.an = var1.hc;
      }

      this.aw = var1;
      return var1;
   }

   public void ay() {
      if (this.aw == null) {
         throw new IllegalStateException();
      } else {
         this.aw.ga();
         this.aw = null;
      }
   }

   public boolean al() {
      return this.an != this.af.af && this.an != null;
   }

   public boolean at() {
      return this.an != this.af.af && this.an != null;
   }

   public Object next() {
      rp var1 = this.an;
      if (var1 == this.af.af) {
         var1 = null;
         this.an = null;
      } else {
         this.an = var1.hc;
      }

      this.aw = var1;
      return var1;
   }

   nq(oi var1) {
      this.af(var1);
   }
}
