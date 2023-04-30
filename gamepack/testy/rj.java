import accessors.RSIterableNodeHashTableIterator;
import java.util.Iterator;

public class rj implements Iterator, RSIterableNodeHashTableIterator {
   ro af;
   rp an;
   int aw;
   rp ac = null;

   void af() {
      this.an = this.af.an[0].hc;
      this.aw = 1;
      this.ac = null;
   }

   public boolean aa() {
      if (this.an != this.af.an[this.aw - 1]) {
         return true;
      } else {
         while(this.aw < this.af.af) {
            if (this.af.an[this.aw++].hc != this.af.an[this.aw - 1]) {
               this.an = this.af.an[this.aw - 1].hc;
               return true;
            }

            this.an = this.af.an[this.aw - 1];
         }

         return false;
      }
   }

   public rp an() {
      this.af();
      return (rp)this.next();
   }

   public Object next() {
      rp var1;
      if (this.an != this.af.an[this.aw - 1]) {
         var1 = this.an;
         this.an = var1.hc;
         this.ac = var1;
         return var1;
      } else {
         do {
            if (this.aw >= this.af.af) {
               return null;
            }

            var1 = this.af.an[this.aw++].hc;
         } while(var1 == this.af.an[this.aw - 1]);

         this.an = var1.hc;
         this.ac = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if (this.an != this.af.an[this.aw - 1]) {
         return true;
      } else {
         while(this.aw < this.af.af) {
            if (this.af.an[this.aw++].hc != this.af.an[this.aw - 1]) {
               this.an = this.af.an[this.aw - 1].hc;
               return true;
            }

            this.an = this.af.an[this.aw - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.ac == null) {
         throw new IllegalStateException();
      } else {
         this.ac.ga();
         this.ac = null;
      }
   }

   public rj(ro var1) {
      this.af = var1;
      this.af();
   }

   public Object ab() {
      rp var1;
      if (this.an != this.af.an[this.aw - 1]) {
         var1 = this.an;
         this.an = var1.hc;
         this.ac = var1;
         return var1;
      } else {
         do {
            if (this.aw >= this.af.af) {
               return null;
            }

            var1 = this.af.an[this.aw++].hc;
         } while(var1 == this.af.an[this.aw - 1]);

         this.an = var1.hc;
         this.ac = var1;
         return var1;
      }
   }

   public Object au() {
      rp var1;
      if (this.an != this.af.an[this.aw - 1]) {
         var1 = this.an;
         this.an = var1.hc;
         this.ac = var1;
         return var1;
      } else {
         do {
            if (this.aw >= this.af.af) {
               return null;
            }

            var1 = this.af.an[this.aw++].hc;
         } while(var1 == this.af.an[this.aw - 1]);

         this.an = var1.hc;
         this.ac = var1;
         return var1;
      }
   }

   public boolean al() {
      if (this.an != this.af.an[this.aw - 1]) {
         return true;
      } else {
         while(this.aw < this.af.af) {
            if (this.af.an[this.aw++].hc != this.af.an[this.aw - 1]) {
               this.an = this.af.an[this.aw - 1].hc;
               return true;
            }

            this.an = this.af.an[this.aw - 1];
         }

         return false;
      }
   }

   public boolean at() {
      if (this.an != this.af.an[this.aw - 1]) {
         return true;
      } else {
         while(this.aw < this.af.af) {
            if (this.af.an[this.aw++].hc != this.af.an[this.aw - 1]) {
               this.an = this.af.an[this.aw - 1].hc;
               return true;
            }

            this.an = this.af.an[this.aw - 1];
         }

         return false;
      }
   }

   public Object aq() {
      rp var1;
      if (this.an != this.af.an[this.aw - 1]) {
         var1 = this.an;
         this.an = var1.hc;
         this.ac = var1;
         return var1;
      } else {
         do {
            if (this.aw >= this.af.af) {
               return null;
            }

            var1 = this.af.an[this.aw++].hc;
         } while(var1 == this.af.an[this.aw - 1]);

         this.an = var1.hc;
         this.ac = var1;
         return var1;
      }
   }

   public void ay() {
      if (this.ac == null) {
         throw new IllegalStateException();
      } else {
         this.ac.ga();
         this.ac = null;
      }
   }

   void aw() {
      this.an = this.af.an[0].hc;
      this.aw = 1;
      this.ac = null;
   }

   public rp ac() {
      this.af();
      return (rp)this.next();
   }

   public rp ao() {
      this.af();
      return (rp)this.next();
   }
}
