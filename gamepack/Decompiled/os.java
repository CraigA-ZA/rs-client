import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class os implements Iterator {
   static IndexedSprite al;
   int an = 0;
   int aw;
   oe af;

   os(oe var1) {
      this.aw = 1950564823 * this.af.au;
      this.af = var1;
   }

   public boolean hasNext() {
      return this.an * 1092736727 < -1960181101 * this.af.aw;
   }

   public Object next() {
      if (this.aw * -1365662605 != -874295403 * this.af.au) {
         throw new ConcurrentModificationException();
      } else if (this.an * 1092736727 < -1960181101 * this.af.aw) {
         Object var1 = this.af.af[1092736727 * this.an].af;
         this.an += 1525775591;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
