public final class NodeHashTable {
   int af;
   int au = 0;
   Node ac;
   Node aw;
   Node[] an;

   public NodeHashTable(int var1) {
      this.af = var1;
      this.an = new Node[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Node var3 = this.an[var2] = new Node();
         var3.hc = var3;
         var3.hg = var3;
      }

   }

   public Node get(long var1) {
      Node var3 = this.an[(int)(var1 & (long)(this.af - 1))];

      for(this.aw = var3.hc; this.aw != var3; this.aw = this.aw.hc) {
         if (this.aw.hr == var1) {
            Node var4 = this.aw;
            this.aw = this.aw.hc;
            return var4;
         }
      }

      this.aw = null;
      return null;
   }

   public void put(Node var1, long var2) {
      if (var1.hg != null) {
         var1.remove();
      }

      Node var4 = this.an[(int)(var2 & (long)(this.af - 1))];
      var1.hg = var4.hg;
      var1.hc = var4;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
      var1.hr = var2;
   }

   public Node first() {
      this.au = 0;
      return this.next();
   }

   public Node next() {
      Node var1;
      if (this.au > 0 && this.ac != this.an[this.au - 1]) {
         var1 = this.ac;
         this.ac = var1.hc;
         return var1;
      } else {
         do {
            if (this.au >= this.af) {
               return null;
            }

            var1 = this.an[this.au++].hc;
         } while(var1 == this.an[this.au - 1]);

         this.ac = var1.hc;
         return var1;
      }
   }
}
