public class rr extends rm {
   double aq;
   int an;
   static nd fv;
   double ac;
   double au;
   double aw;
   int af;
   double ab;

   static final boolean lb(mq var0, int var1) {
      try {
         if (null == var0.gf) {
            if (var1 == 1758054564) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            for(int var2 = 0; var2 < var0.gf.length; ++var2) {
               if (var1 == 1758054564) {
                  throw new IllegalStateException();
               }

               int var3 = dw.lx(var0, var2, 1696113134);
               int var4 = var0.gm[var2];
               if (var0.gf[var2] == 2) {
                  if (var1 == 1758054564) {
                     throw new IllegalStateException();
                  }

                  if (var3 >= var4) {
                     return false;
                  }
               } else if (var0.gf[var2] == 3) {
                  if (var1 == 1758054564) {
                     throw new IllegalStateException();
                  }

                  if (var3 <= var4) {
                     if (var1 == 1758054564) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               } else if (4 == var0.gf[var2]) {
                  if (var1 == 1758054564) {
                     throw new IllegalStateException();
                  }

                  if (var3 == var4) {
                     return false;
                  }
               } else if (var4 != var3) {
                  if (var1 == 1758054564) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "rr.lb(" + ')');
      }
   }

   public int at() {
      double var1 = this.ay(1089057010);
      return (int)Math.round((double)(this.an * -970289067 - this.af * -925977301) * var1 + (double)(this.af * -925977301));
   }

   public int au() {
      double var1 = this.ay(1089057010);
      double var3 = (this.aq - this.ab) * var1 + this.ab;
      return (int)Math.round(this.ac + this.au * Math.sin(var3));
   }

   public int aw(byte var1) {
      try {
         double var2 = this.ay(1089057010);
         return (int)Math.round((double)(this.an * -970289067 - this.af * -925977301) * var2 + (double)(this.af * -925977301));
      } catch (RuntimeException var4) {
         throw db.an(var4, "rr.aw(" + ')');
      }
   }

   public int ac() {
      double var1 = this.ay(1089057010);
      double var3 = this.ab + var1 * (this.aq - this.ab);
      return (int)Math.round(this.aw + this.au * Math.cos(var3));
   }

   public rr(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      try {
         super(var9, var10);
         this.af = 0;
         this.an = 0;
         this.aw = 0.0;
         this.ac = 0.0;
         this.au = 0.0;
         this.ab = 0.0;
         this.aq = 0.0;
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
      } catch (RuntimeException var26) {
         throw db.an(var26, "rr.<init>(" + ')');
      }
   }

   public int af(int var1) {
      try {
         double var2 = this.ay(1089057010);
         double var4 = this.ab + var2 * (this.aq - this.ab);
         return (int)Math.round(this.aw + this.au * Math.cos(var4));
      } catch (RuntimeException var6) {
         throw db.an(var6, "rr.af(" + ')');
      }
   }

   public int aq() {
      double var1 = this.ay(1089057010);
      double var3 = (this.aq - this.ab) * var1 + this.ab;
      return (int)Math.round(this.ac + this.au * Math.sin(var3));
   }

   public int al() {
      double var1 = this.ay(1089057010);
      return (int)Math.round((double)(this.an * -970289067 - this.af * -925977301) * var1 + (double)(this.af * -925977301));
   }

   public static tc aq(nm var0, int var1, int var2) {
      try {
         byte[] var4 = var0.cn(var1, (byte)31);
         boolean var3;
         if (var4 == null) {
            if (var2 == 1511448314) {
               throw new IllegalStateException();
            }

            var3 = false;
         } else {
            sb.aa(var4, 1145263442);
            var3 = true;
         }

         if (!var3) {
            if (var2 == 1511448314) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return mk.al((byte)1);
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "rr.aq(" + ')');
      }
   }

   public int ab() {
      double var1 = this.ay(1089057010);
      double var3 = (this.aq - this.ab) * var1 + this.ab;
      return (int)Math.round(this.ac + this.au * Math.sin(var3));
   }

   public int an(int var1) {
      try {
         double var2 = this.ay(1089057010);
         double var4 = (this.aq - this.ab) * var2 + this.ab;
         return (int)Math.round(this.ac + this.au * Math.sin(var4));
      } catch (RuntimeException var6) {
         throw db.an(var6, "rr.an(" + ')');
      }
   }
}
