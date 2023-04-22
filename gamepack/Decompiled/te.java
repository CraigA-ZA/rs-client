public class te {
   public Object an;
   public final int af;

   public te(int var1) {
      this.af = -850259735 * var1;
   }

   public te(int var1, Object var2) {
      this.af = -850259735 * var1;
      this.an = var2;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof te)) {
         return false;
      } else {
         te var2 = (te)var1;
         if (null == var2.an && null != this.an) {
            return false;
         } else if (this.an == null && null != var2.an) {
            return false;
         } else {
            return var2.af * -52705447 == this.af * -52705447 && var2.an.equals(this.an);
         }
      }
   }
}
