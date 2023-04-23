public final class EvictingDualNodeHashTable {
   int an;
   int aw;
   IterableDualNodeQueue au = new IterableDualNodeQueue();
   DualNode af = new DualNode();
   IterableNodeHashTable ac;

   public EvictingDualNodeHashTable(int var1) {
      this.an = var1;
      this.aw = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.ac = new IterableNodeHashTable(var2);
   }

   public DualNode get(long var1) {
      DualNode var3 = (DualNode)this.ac.get(var1);
      if (var3 != null) {
         this.au.an(var3);
      }

      return var3;
   }

   public void remove(long var1) {
      DualNode var3 = (DualNode)this.ac.get(var1);
      if (var3 != null) {
         var3.remove();
         var3.removeDual();
         ++this.aw;
      }

   }

   public void put(DualNode var1, long var2) {
      if (this.aw == 0) {
         DualNode var4 = this.au.ac();
         var4.remove();
         var4.removeDual();
         if (var4 == this.af) {
            var4 = this.au.ac();
            var4.remove();
            var4.removeDual();
         }
      } else {
         --this.aw;
      }

      this.ac.put(var1, var2);
      this.au.an(var1);
   }

   public void clear() {
      this.au.af();
      this.ac.clear();
      this.af = new DualNode();
      this.aw = this.an;
   }
}
