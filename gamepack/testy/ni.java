import accessors.RSDualNodeDeque;

public final class ni implements RSDualNodeDeque {
   rk af = new rk();

   public void al(rk var1) {
      if (var1.ej != null) {
         var1.fs();
      }

      var1.ej = this.af;
      var1.ez = this.af.ez;
      var1.ej.ez = var1;
      var1.ez.ej = var1;
   }

   public void af(rk var1) {
      if (var1.ej != null) {
         var1.fs();
      }

      var1.ej = this.af.ej;
      var1.ez = this.af;
      var1.ej.ez = var1;
      var1.ez.ej = var1;
   }

   public void ab(rk var1) {
      if (var1.ej != null) {
         var1.fs();
      }

      var1.ej = this.af;
      var1.ez = this.af.ez;
      var1.ej.ez = var1;
      var1.ez.ej = var1;
   }

   public rk aw() {
      rk var1 = this.af.ez;
      return var1 == this.af ? null : var1;
   }

   public void ac(rk var1) {
      if (var1.ej != null) {
         var1.fs();
      }

      var1.ej = this.af.ej;
      var1.ez = this.af;
      var1.ej.ez = var1;
      var1.ez.ej = var1;
   }

   public void au(rk var1) {
      if (var1.ej != null) {
         var1.fs();
      }

      var1.ej = this.af.ej;
      var1.ez = this.af;
      var1.ej.ez = var1;
      var1.ez.ej = var1;
   }

   public rk aa() {
      rk var1 = this.af.ez;
      return var1 == this.af ? null : var1;
   }

   public void aq(rk var1) {
      if (var1.ej != null) {
         var1.fs();
      }

      var1.ej = this.af;
      var1.ez = this.af.ez;
      var1.ej.ez = var1;
      var1.ez.ej = var1;
   }

   public void an(rk var1) {
      if (var1.ej != null) {
         var1.fs();
      }

      var1.ej = this.af;
      var1.ez = this.af.ez;
      var1.ej.ez = var1;
      var1.ez.ej = var1;
   }

   public rk at() {
      rk var1 = this.af.ez;
      return var1 == this.af ? null : var1;
   }

   public ni() {
      this.af.ez = this.af;
      this.af.ej = this.af;
   }
}
