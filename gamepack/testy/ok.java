import accessors.RSIterableDualNodeQueueIterator;
import java.util.Iterator;

public class ok implements Iterator, RSIterableDualNodeQueueIterator {
   rk an;
   ox af;
   rk aw = null;

   public Object aq() {
      rk var1 = this.an;
      if (var1 == this.af.af) {
         var1 = null;
         this.an = null;
      } else {
         this.an = var1.ez;
      }

      this.aw = var1;
      return var1;
   }

   public Object next() {
      rk var1 = this.an;
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
         this.aw.fs();
         this.aw = null;
      }
   }

   public boolean al() {
      return this.an != this.af.af;
   }

   public Object ab() {
      rk var1 = this.an;
      if (var1 == this.af.af) {
         var1 = null;
         this.an = null;
      } else {
         this.an = var1.ez;
      }

      this.aw = var1;
      return var1;
   }

   public Object au() {
      rk var1 = this.an;
      if (var1 == this.af.af) {
         var1 = null;
         this.an = null;
      } else {
         this.an = var1.ez;
      }

      this.aw = var1;
      return var1;
   }

   public void ay() {
      if (this.aw == null) {
         throw new IllegalStateException();
      } else {
         this.aw.fs();
         this.aw = null;
      }
   }

   public boolean at() {
      return this.an != this.af.af;
   }

   public boolean aa() {
      return this.an != this.af.af;
   }

   ok(ox var1) {
      this.af = var1;
      this.an = this.af.af.ez;
      this.aw = null;
   }
}
