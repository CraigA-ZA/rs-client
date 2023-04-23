public class Username implements Comparable {
   String af;
   String an;

   public Username(String var1) {
      this.af = var1;
      this.an = bk.aw_renamed(var1, LoginType.af);
   }

   public Username(String var1, LoginType var2) {
      this.af = var1;
      this.an = bk.aw_renamed(var1, var2);
   }

   public String af() {
      return this.af;
   }

   public String an() {
      return this.an;
   }

   public boolean hasCleanName() {
      return this.an != null;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof Username) {
         Username var2 = (Username)var1;
         if (null == this.an) {
            return null == var2.an;
         } else if (var2.an == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.an.equals(var2.an);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return null == this.an ? 0 : this.an.hashCode();
   }

   public String toString() {
      return this.af();
   }

   public int compareTo0(Username var1) {
      if (this.an == null) {
         return var1.an == null ? 0 : 1;
      } else {
         return null == var1.an ? -1 : this.an.compareTo(var1.an);
      }
   }

   public int compareTo(Object var1) {
      return this.compareTo0((Username)var1);
   }
}
