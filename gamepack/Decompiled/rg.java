public class rg {
   public final Object af;
   public final Object an;

   public rg(Object var1, Object var2) {
      this.af = var1;
      this.an = var2;
   }

   public String toString() {
      return this.af + ", " + this.an;
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof rg) {
         rg var2 = (rg)var1;
         if (this.af == null) {
            if (var2.af != null) {
               return false;
            }
         } else if (!this.af.equals(var2.af)) {
            return false;
         }

         if (null == this.an) {
            if (var2.an != null) {
               return false;
            }
         } else if (!this.an.equals(var2.an)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = 0;
      if (null != this.af) {
         var1 += this.af.hashCode();
      }

      if (this.an != null) {
         var1 += 31 * this.an.hashCode();
      }

      return var1;
   }
}
