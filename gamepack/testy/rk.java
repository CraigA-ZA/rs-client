import accessors.RSDualNode;

public class rk extends rp implements RSDualNode {
   public long ef;
   public rk ez;
   public rk ej;

   public void fs() {
      if (this.ej != null) {
         this.ej.ez = this.ez;
         this.ez.ej = this.ej;
         this.ez = null;
         this.ej = null;
      }
   }

   public void fi() {
      if (this.ej != null) {
         this.ej.ez = this.ez;
         this.ez.ej = this.ej;
         this.ez = null;
         this.ej = null;
      }
   }

   public void fh() {
      if (this.ej != null) {
         this.ej.ez = this.ez;
         this.ez.ej = this.ej;
         this.ez = null;
         this.ej = null;
      }
   }

   public void fl() {
      if (this.ej != null) {
         this.ej.ez = this.ez;
         this.ez.ej = this.ej;
         this.ez = null;
         this.ej = null;
      }
   }
}
