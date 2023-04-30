public class Username implements Comparable {
   String name0;
   String cleanName0;

   public Username(String var1) {
      this.name0 = var1;
      this.cleanName0 = bk.aw_renamed(var1, LoginType.af);
   }

   public Username(String var1, LoginType var2) {
      this.name0 = var1;
      this.cleanName0 = bk.aw_renamed(var1, var2);
   }

   public String name() {
      return this.name0;
   }

   public String cleanName() {
      return this.cleanName0;
   }

   public boolean hasCleanName() {
      return this.cleanName0 != null;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof Username) {
         Username var2 = (Username)var1;
         if (null == this.cleanName0) {
            return null == var2.cleanName0;
         } else if (var2.cleanName0 == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.cleanName0.equals(var2.cleanName0);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return null == this.cleanName0 ? 0 : this.cleanName0.hashCode();
   }

   public String toString() {
      return this.name();
   }

   public int compareTo0(Username var1) {
      if (this.cleanName0 == null) {
         return var1.cleanName0 == null ? 0 : 1;
      } else {
         return null == var1.cleanName0 ? -1 : this.cleanName0.compareTo(var1.cleanName0);
      }
   }

   public int compareTo(Object var1) {
      return this.compareTo0((Username)var1);
   }
}
