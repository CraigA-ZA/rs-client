import java.util.Iterator;

public class IterableNodeHashTableIterator implements Iterator {
   int aw;
   IterableNodeHashTable hashTable;
   Node ac = null;
   Node an;

   public IterableNodeHashTableIterator(IterableNodeHashTable var1) {
      this.hashTable = var1;
      this.af();
   }

   void af() {
      this.an = this.hashTable.buckets[0].previous;
      this.aw = 1;
      this.ac = null;
   }

   public Node an() {
      this.af();
      return (Node)this.next();
   }

   public Object next() {
      Node var1;
      if (this.an != this.hashTable.buckets[this.aw - 1]) {
         var1 = this.an;
         this.an = var1.previous;
         this.ac = var1;
         return var1;
      } else {
         do {
            if (this.aw >= this.hashTable.size) {
               return null;
            }

            var1 = this.hashTable.buckets[this.aw++].previous;
         } while(var1 == this.hashTable.buckets[this.aw - 1]);

         this.an = var1.previous;
         this.ac = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if (this.an != this.hashTable.buckets[this.aw - 1]) {
         return true;
      } else {
         while(this.aw < this.hashTable.size) {
            if (this.hashTable.buckets[this.aw++].previous != this.hashTable.buckets[this.aw - 1]) {
               this.an = this.hashTable.buckets[this.aw - 1].previous;
               return true;
            }

            this.an = this.hashTable.buckets[this.aw - 1];
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
