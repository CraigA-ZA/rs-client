public final class DemotingHashTable {
   int af;
   int an;
   kv au;
   IterableDualNodeQueue ac;
   IterableNodeHashTable aw;

   public DemotingHashTable(int var1) {
      this(var1, var1);
   }

   public DemotingHashTable(int var1, int var2) {
      this.ac = new IterableDualNodeQueue();
      this.af = var1;
      this.an = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
      }

      this.aw = new IterableNodeHashTable(var3);
   }

   public Object get(long var1) {
      Wrapper var3 = (Wrapper)this.aw.get(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.get();
         if (var4 == null) {
            var3.remove();
            var3.removeDual();
            this.an += var3.an;
            return null;
         } else {
            if (var3.isSoft()) {
               DirectWrapper var5 = new DirectWrapper(var4, var3.an);
               this.aw.put(var5, var3.hr);
               this.ac.an(var5);
               var5.ef = 0L;
               var3.remove();
               var3.removeDual();
            } else {
               this.ac.an(var3);
               var3.ef = 0L;
            }

            return var4;
         }
      }
   }

   void remove(long var1) {
      Wrapper var3 = (Wrapper)this.aw.get(var1);
      this.removeWrapper(var3);
   }

   void removeWrapper(Wrapper var1) {
      if (var1 != null) {
         var1.remove();
         var1.removeDual();
         this.an += var1.an;
      }

   }

   public void put1(Object var1, long var2) {
      this.put(var1, var2, 1);
   }

   public void put(Object var1, long var2, int var4) {
      if (var4 > this.af) {
         throw new IllegalStateException();
      } else {
         this.remove(var2);
         this.an -= var4;

         while(this.an < 0) {
            Wrapper var5 = (Wrapper)this.ac.ac();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.isSoft()) {
            }

            this.removeWrapper(var5);
            if (this.au != null) {
               this.au.af(var5.get());
            }
         }

         DirectWrapper var6 = new DirectWrapper(var1, var4);
         this.aw.put(var6, var2);
         this.ac.an(var6);
         var6.ef = 0L;
      }
   }

   public void demote(int var1) {
      for(Wrapper var2 = (Wrapper)this.ac.au(); var2 != null; var2 = (Wrapper)this.ac.aq()) {
         if (var2.isSoft()) {
            if (var2.get() == null) {
               var2.remove();
               var2.removeDual();
               this.an += var2.an;
            }
         } else if (++var2.ef > (long)var1) {
            SoftWrapper var3 = new SoftWrapper(var2.get(), var2.an);
            this.aw.put(var3, var2.hr);
            IterableDualNodeQueue.aw(var3, var2);
            var2.remove();
            var2.removeDual();
         }
      }

   }

   public void aq() {
      this.ac.af();
      this.aw.clear();
      this.an = this.af;
   }
}
