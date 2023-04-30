import accessors.RSServerBuild;

public class md implements RSServerBuild {
   final int ab;
   static final md an = new md("BUILDLIVE", 3);
   static final md aw = new md("RC", 1);
   public final String au;
   static nd fb;
   static final md ac = new md("WIP", 2);
   static final md af = new md("LIVE", 0);

   static final int as(int var0, int var1, int var2, int var3) {
      try {
         if (var2 > 179) {
            if (var3 >= 1348853709) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 192) {
            if (var3 >= 1348853709) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 217) {
            if (var3 >= 1348853709) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 243) {
            if (var3 >= 1348853709) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         int var4 = (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
         return var4;
      } catch (RuntimeException var5) {
         throw db.an(var5, "md.as(" + ')');
      }
   }

   public static md ac(int var0) {
      md[] var1 = new md[]{af, an, aw, ac};
      md[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         md var4 = var2[var3];
         if (var0 == var4.ab * -978256915) {
            return var4;
         }
      }

      return null;
   }

   md(String var1, int var2) {
      try {
         super();
         this.au = var1;
         this.ab = -1294558747 * var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "md.<init>(" + ')');
      }
   }

   public static md au(int var0) {
      md[] var1 = new md[]{af, an, aw, ac};
      md[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         md var4 = var2[var3];
         if (var0 == var4.ab * -978256915) {
            return var4;
         }
      }

      return null;
   }

   public static md aw(int var0) {
      md[] var1 = new md[]{af, an, aw, ac};
      md[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         md var4 = var2[var3];
         if (var0 == var4.ab * -978256915) {
            return var4;
         }
      }

      return null;
   }

   public static sm an(int var0, byte var1) {
      try {
         sm var2 = (sm)sm.an.af((long)var0);
         if (null != var2) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = sm.af.bh(39, var0, (byte)0);
            var2 = new sm();
            if (var3 != null) {
               var2.aw(new sg(var3), (byte)1);
            }

            var2.au((short)-25081);
            sm.an.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "md.an(" + ')');
      }
   }

   public static md an(int var0) {
      md[] var1 = new md[]{af, an, aw, ac};
      md[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         md var4 = var2[var3];
         if (var0 == var4.ab * 2122091691) {
            return var4;
         }
      }

      return null;
   }
}
