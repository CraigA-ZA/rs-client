public final class DualNodeDeque {
   DualNode af = new DualNode();

   public DualNodeDeque() {
      this.af.ez = this.af;
      this.af.ej = this.af;
   }

   public void addFirst(DualNode var1) {
      if (var1.ej != null) {
         var1.removeDual();
      }

      var1.ej = this.af.ej;
      var1.ez = this.af;
      var1.ej.ez = var1;
      var1.ez.ej = var1;
   }

   public void addLast(DualNode var1) {
      if (var1.ej != null) {
         var1.removeDual();
      }

      var1.ej = this.af;
      var1.ez = this.af.ez;
      var1.ej.ez = var1;
      var1.ez.ej = var1;
   }

   public DualNode last() {
      DualNode var1 = this.af.ez;
      return var1 == this.af ? null : var1;
   }
}
