import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class os implements Iterator {
   static final int ab = 3;
   oe af;
   int aw;
   int an;
   static tc al;

   public boolean al() {
      return this.an * 1092736727 < -1960181101 * this.af.aw;
   }

   public boolean hasNext() {
      try {
         return this.an * 1092736727 < -1960181101 * this.af.aw;
      } catch (RuntimeException var1) {
         throw db.an(var1, "os.hasNext(" + ')');
      }
   }

   os(oe var1) {
      try {
         super();
         this.an = 0;
         this.aw = 1950564823 * this.af.au;
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "os.<init>(" + ')');
      }
   }

   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw db.an(var1, "os.remove(" + ')');
      }
   }

   public Object au() {
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

   public Object next() {
      try {
         if (this.aw * -1365662605 != -874295403 * this.af.au) {
            throw new ConcurrentModificationException();
         } else if (this.an * 1092736727 < -1960181101 * this.af.aw) {
            Object var1 = this.af.af[1092736727 * this.an].af;
            this.an += 1525775591;
            return var1;
         } else {
            throw new NoSuchElementException();
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "os.next(" + ')');
      }
   }

   public Object ab() {
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

   public Object aq() {
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

   public boolean at() {
      return this.an * 426526155 < -1960181101 * this.af.aw;
   }

   public boolean aa() {
      return this.an * 1092736727 < -1960181101 * this.af.aw;
   }

   public void ay() {
      throw new UnsupportedOperationException();
   }
}
