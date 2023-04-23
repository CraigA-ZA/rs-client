import java.util.Iterator;

public class IterableNodeHashTableIterator implements Iterator {
   int aw;
   IterableNodeHashTable af;
   Node ac = null;
   Node an;

   public IterableNodeHashTableIterator(IterableNodeHashTable var1) {
      this.af = var1;
      this.af();
   }

   void af() {
      this.an = this.af.an[0].hc;
      this.aw = 1;
      this.ac = null;
   }

   public Node an() {
      this.af();
      return (Node)this.next();
   }

   public Object next() {
      Node var1;
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
         this.ac.remove();
         this.ac = null;
      }
   }
}
