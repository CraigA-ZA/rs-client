public class NodeDeque {
   Node an;
   public Node af = new Node();

   public NodeDeque() {
      this.af.hc = this.af;
      this.af.hg = this.af;
   }

   public void af() {
      while(true) {
         Node var1 = this.af.hc;
         if (var1 == this.af) {
            this.an = null;
            return;
         }

         var1.remove();
      }
   }

   public void addFirst(Node var1) {
      if (var1.hg != null) {
         var1.remove();
      }

      var1.hg = this.af.hg;
      var1.hc = this.af;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
   }

   public void addLast(Node var1) {
      if (var1.hg != null) {
         var1.remove();
      }

      var1.hg = this.af;
      var1.hc = this.af.hc;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
   }

   public static void ac(Node var0, Node var1) {
      if (var0.hg != null) {
         var0.remove();
      }

      var0.hg = var1.hg;
      var0.hc = var1;
      var0.hg.hc = var0;
      var0.hc.hg = var0;
   }

   public Node removeLast() {
      Node var1 = this.af.hc;
      if (var1 == this.af) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   public Node removeFirst() {
      Node var1 = this.af.hg;
      if (var1 == this.af) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   public Node last() {
      Node var1 = this.af.hc;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.hc;
         return var1;
      }
   }

   public Node first() {
      Node var1 = this.af.hg;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.hg;
         return var1;
      }
   }

   public Node previous() {
      Node var1 = this.an;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.hc;
         return var1;
      }
   }

   public Node next() {
      Node var1 = this.an;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.hg;
         return var1;
      }
   }
}
