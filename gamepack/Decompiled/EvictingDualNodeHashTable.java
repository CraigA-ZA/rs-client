public final class EvictingDualNodeHashTable {
   int capacity;
   int remainingCapacity;
   IterableDualNodeQueue deque = new IterableDualNodeQueue();
   DualNode af = new DualNode();
   IterableNodeHashTable hashTable;

   public EvictingDualNodeHashTable(int var1) {
      this.capacity = var1;
      this.remainingCapacity = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.hashTable = new IterableNodeHashTable(var2);
   }

   public DualNode get(long var1) {
      DualNode var3 = (DualNode)this.hashTable.get(var1);
      if (var3 != null) {
         this.deque.an(var3);
      }

      return var3;
   }

   public void remove(long var1) {
      DualNode var3 = (DualNode)this.hashTable.get(var1);
      if (var3 != null) {
         var3.remove();
         var3.removeDual();
         ++this.remainingCapacity;
      }

   }

   public void put(DualNode var1, long var2) {
      if (this.remainingCapacity == 0) {
         DualNode var4 = this.deque.ac();
         var4.remove();
         var4.removeDual();
         if (var4 == this.af) {
            var4 = this.deque.ac();
            var4.remove();
            var4.removeDual();
         }
      } else {
         --this.remainingCapacity;
      }

      this.hashTable.put(var1, var2);
      this.deque.an(var1);
   }

   public void clear() {
      this.deque.af();
      this.hashTable.clear();
      this.af = new DualNode();
      this.remainingCapacity = this.capacity;
   }
}
