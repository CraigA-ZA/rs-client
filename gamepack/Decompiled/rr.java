public class rr extends rm {
   static Archive fv;
   double ab = 0.0;
   double ac = 0.0;
   double aq = 0.0;
   double au = 0.0;
   double aw = 0.0;
   int af = 0;
   int an = 0;

   public rr(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var9, var10);
      this.af = var3 * -1598267005;
      this.an = var6 * -1940001539;
      if ((var4 - var7) * (var8 - var2) == (var7 - var1) * (var5 - var8)) {
         this.aw = (double)var4;
         this.ac = (double)var5;
      } else {
         double var11 = (double)((float)(var7 + var1)) / 2.0;
         double var13 = (double)((float)(var8 + var2)) / 2.0;
         double var15 = (double)((float)(var4 + var7)) / 2.0;
         double var17 = (double)((float)(var8 + var5)) / 2.0;
         double var19 = (double)(var7 - var1) * -1.0 / (double)(var8 - var2);
         double var21 = (double)(var4 - var7) * -1.0 / (double)(var5 - var8);
         this.aw = (var17 + (var19 * var11 - var21 * var15) - var13) / (var19 - var21);
         this.ac = var13 + var19 * (this.aw - var11);
         this.au = Math.sqrt(Math.pow(this.aw - (double)var1, 2.0) + Math.pow(this.ac - (double)var2, 2.0));
         this.ab = Math.atan2((double)var2 - this.ac, (double)var1 - this.aw);
         double var23 = Math.atan2((double)var8 - this.ac, (double)var7 - this.aw);
         this.aq = Math.atan2((double)var5 - this.ac, (double)var4 - this.aw);
         boolean var25 = this.ab <= var23 && var23 <= this.aq || this.aq <= var23 && var23 <= this.ab;
         if (!var25) {
            this.aq += (double)(this.ab - this.aq > 0.0 ? 2 : -2) * Math.PI;
         }

      }
   }

   public int af() {
      double var2 = this.ay();
      double var4 = this.ab + var2 * (this.aq - this.ab);
      return (int)Math.round(this.aw + this.au * Math.cos(var4));
   }

   public int an() {
      double var2 = this.ay();
      double var4 = (this.aq - this.ab) * var2 + this.ab;
      return (int)Math.round(this.ac + this.au * Math.sin(var4));
   }

   public int aw() {
      double var2 = this.ay();
      return (int)Math.round((double)(this.an * -970289067 - this.af * -925977301) * var2 + (double)(this.af * -925977301));
   }

   public static IndexedSprite aq_renamed(AbstractArchive var0, int var1) {
      byte[] var4 = var0.takeFileFlat(var1);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         sb.aa_renamed(var4);
         var3 = true;
      }

      return !var3 ? null : Strings.al_renamed();
   }

   static final boolean runCs1(Component var0) {
      if (null == var0.gf) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.gf.length; ++var2) {
            int var3 = ArchiveLoader.lx_renamed(var0, var2);
            int var4 = var0.gm[var2];
            if (var0.gf[var2] == 2) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (var0.gf[var2] == 3) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (4 == var0.gf[var2]) {
               if (var3 == var4) {
                  return false;
               }
            } else if (var4 != var3) {
               return false;
            }
         }

         return true;
      }
   }
}
