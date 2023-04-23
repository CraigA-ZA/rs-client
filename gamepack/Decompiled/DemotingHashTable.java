public final class DemotingHashTable {
   int af;
   int an;
   kv au;
   IterableDualNodeQueue queue;
   IterableNodeHashTable hashTable;

   public DemotingHashTable(int var1) {
      this(var1, var1);
   }

   public DemotingHashTable(int var1, int var2) {
      this.queue = new IterableDualNodeQueue();
      this.af = var1;
      this.an = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
      }

      this.hashTable = new IterableNodeHashTable(var3);
   }

   public Object get(long var1) {
      Wrapper var3 = (Wrapper)this.hashTable.get(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.get();
         if (var4 == null) {
            var3.remove();
            var3.removeDual();
            this.an += var3.size;
            return null;
         } else {
            if (var3.isSoft()) {
               DirectWrapper var5 = new DirectWrapper(var4, var3.size);
               this.hashTable.put(var5, var3.key);
               this.queue.an(var5);
               var5.keyDual = 0L;
               var3.remove();
               var3.removeDual();
            } else {
               this.queue.an(var3);
               var3.keyDual = 0L;
            }

            return var4;
         }
      }
   }

   void remove(long var1) {
      Wrapper var3 = (Wrapper)this.hashTable.get(var1);
      this.removeWrapper(var3);
   }

   void removeWrapper(Wrapper var1) {
      if (var1 != null) {
         var1.remove();
         var1.removeDual();
         this.an += var1.size;
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
            Wrapper var5 = (Wrapper)this.queue.ac();
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
         this.hashTable.put(var6, var2);
         this.queue.an(var6);
         var6.keyDual = 0L;
      }
   }

   public void demote(int var1) {
      for(Wrapper var2 = (Wrapper)this.queue.au(); var2 != null; var2 = (Wrapper)this.queue.aq()) {
         if (var2.isSoft()) {
            if (var2.get() == null) {
               var2.remove();
               var2.removeDual();
               this.an += var2.size;
            }
         } else if (++var2.keyDual > (long)var1) {
            SoftWrapper var3 = new SoftWrapper(var2.get(), var2.size);
            this.hashTable.put(var3, var2.key);
            IterableDualNodeQueue.aw(var3, var2);
            var2.remove();
            var2.removeDual();
         }
      }

   }

   public void aq() {
      this.queue.af();
      this.hashTable.clear();
      this.an = this.af;
   }
}
