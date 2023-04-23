public class DualNode extends Node {
   public long ef;
   public DualNode ej;
   public DualNode ez;

   public void removeDual() {
      if (this.ej != null) {
         this.ej.ez = this.ez;
         this.ez.ej = this.ej;
         this.ez = null;
         this.ej = null;
      }
   }
}
