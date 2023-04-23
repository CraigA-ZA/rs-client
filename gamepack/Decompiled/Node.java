public class Node {
   public long hr;
   public Node hc;
   public Node hg;

   public void remove() {
      if (this.hg != null) {
         this.hg.hc = this.hc;
         this.hc.hg = this.hg;
         this.hc = null;
         this.hg = null;
      }
   }

   public boolean hasNext() {
      return this.hg != null;
   }
}
