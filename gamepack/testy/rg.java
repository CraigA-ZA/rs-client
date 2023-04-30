public class rg {
   public final Object af;
   public final Object an;
   static final int au = 2;
   public static final int aq = 65536;

   public String ahj() {
      return this.af + ", " + this.an;
   }

   public String toString() {
      try {
         return this.af + ", " + this.an;
      } catch (RuntimeException var1) {
         throw db.an(var1, "rg.toString(" + ')');
      }
   }

   public int ahh() {
      int var1 = 0;
      if (null != this.af) {
         var1 += this.af.hashCode();
      }

      if (this.an != null) {
         var1 += 31 * this.an.hashCode();
      }

      return var1;
   }

   public int hashCode() {
      try {
         int var1 = 0;
         if (null != this.af) {
            var1 += this.af.hashCode();
         }

         if (this.an != null) {
            var1 += 31 * this.an.hashCode();
         }

         return var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "rg.hashCode(" + ')');
      }
   }

   public boolean gm(Object var1) {
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

   public boolean gi(Object var1) {
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

   public boolean equals(Object var1) {
      try {
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
      } catch (RuntimeException var3) {
         throw db.an(var3, "rg.equals(" + ')');
      }
   }

   public boolean gk(Object var1) {
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

   public rg(Object var1, Object var2) {
      try {
         super();
         this.af = var1;
         this.an = var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "rg.<init>(" + ')');
      }
   }

   public boolean gq(Object var1) {
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

   public int ahv() {
      int var1 = 0;
      if (null != this.af) {
         var1 += this.af.hashCode();
      }

      if (this.an != null) {
         var1 += 31 * this.an.hashCode();
      }

      return var1;
   }

   public String ahm() {
      return this.af + ", " + this.an;
   }

   public String ahp() {
      return this.af + ", " + this.an;
   }

   public int aht() {
      int var1 = 0;
      if (null != this.af) {
         var1 += this.af.hashCode();
      }

      if (this.an != null) {
         var1 += 272763895 * this.an.hashCode();
      }

      return var1;
   }
}
