public class gx {
   public static final int ag = 11;
   static final int an = 2;
   public short[] ac;
   public short[] aw;
   static final int bg = 33;
   static final int af = 1;
   static int ut;

   public static int bw(String var0, byte var1) {
      try {
         return var0.length() + 2;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gx.bw(" + ')');
      }
   }

   gx(int var1) {
      try {
         super();
         hz var2 = dh.af(var1, (byte)82);
         if (var2.ak((short)467)) {
            this.aw = new short[var2.ar.length];
            System.arraycopy(var2.ar, 0, this.aw, 0, this.aw.length);
         }

         if (var2.az(-1913004166)) {
            this.ac = new short[var2.as.length];
            System.arraycopy(var2.as, 0, this.ac, 0, this.ac.length);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "gx.<init>(" + ')');
      }
   }

   public static gx aw(int var0, sg var1) {
      int var2 = var1.cm((byte)7);
      boolean var3 = 0 != (var2 & 1);
      boolean var4 = (var2 & 2) != 0;
      gx var5 = new gx(var0);
      int var6;
      int[] var7;
      boolean var8;
      int var9;
      short var10;
      if (var3) {
         var6 = var1.cm((byte)7);
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.aw != null && var7.length == var5.aw.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (var7[var9] != 15) {
               var10 = (short)var1.cl(-1456699561);
               if (var8) {
                  var5.aw[var7[var9]] = var10;
               }
            }
         }
      }

      if (var4) {
         var6 = var1.cm((byte)7);
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.ac != null && var7.length == var5.ac.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (15 != var7[var9]) {
               var10 = (short)var1.cl(506620582);
               if (var8) {
                  var5.ac[var7[var9]] = var10;
               }
            }
         }
      }

      return var5;
   }

   public static gx ac(int var0, sg var1) {
      int var2 = var1.cm((byte)7);
      boolean var3 = 0 != (var2 & 1);
      boolean var4 = (var2 & 2) != 0;
      gx var5 = new gx(var0);
      int var6;
      int[] var7;
      boolean var8;
      int var9;
      short var10;
      if (var3) {
         var6 = var1.cm((byte)7);
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.aw != null && var7.length == var5.aw.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (var7[var9] != 15) {
               var10 = (short)var1.cl(-1954855039);
               if (var8) {
                  var5.aw[var7[var9]] = var10;
               }
            }
         }
      }

      if (var4) {
         var6 = var1.cm((byte)7);
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.ac != null && var7.length == var5.ac.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (15 != var7[var9]) {
               var10 = (short)var1.cl(597502706);
               if (var8) {
                  var5.ac[var7[var9]] = var10;
               }
            }
         }
      }

      return var5;
   }

   public static void ac(sg var0, int var1, int var2) {
      try {
         if (null != gc.ao) {
            try {
               gc.ao.an(0L);
               gc.ao.aq(var0.al, var1, 24, (byte)3);
            } catch (Exception var4) {
            }
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "gx.ac(" + ')');
      }
   }

   public static gx an(int var0, sg var1) {
      int var2 = var1.cm((byte)7);
      boolean var3 = 0 != (var2 & 1);
      boolean var4 = (var2 & 2) != 0;
      gx var5 = new gx(var0);
      int var6;
      int[] var7;
      boolean var8;
      int var9;
      short var10;
      if (var3) {
         var6 = var1.cm((byte)7);
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.aw != null && var7.length == var5.aw.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (var7[var9] != 15) {
               var10 = (short)var1.cl(-183568134);
               if (var8) {
                  var5.aw[var7[var9]] = var10;
               }
            }
         }
      }

      if (var4) {
         var6 = var1.cm((byte)7);
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.ac != null && var7.length == var5.ac.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (15 != var7[var9]) {
               var10 = (short)var1.cl(139723499);
               if (var8) {
                  var5.ac[var7[var9]] = var10;
               }
            }
         }
      }

      return var5;
   }

   static tq at(int var0) {
      try {
         tq var1 = new tq();
         var1.ab = -822007097 * tx.an;
         var1.aq = tx.aw * 378525975;
         var1.ac = tx.ac[0];
         var1.au = ar.au[0];
         var1.an = dd.ab[0];
         var1.aw = fd.aq[0];
         int var2 = var1.aw * var1.an;
         byte[] var3 = hg.at[0];
         var1.af = new int[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            if (var0 >= 687212254) {
               throw new IllegalStateException();
            }

            var1.af[var4] = pc.al[var3[var4] & 255];
         }

         pk.ay(-262861184);
         return var1;
      } catch (RuntimeException var5) {
         throw db.an(var5, "gx.at(" + ')');
      }
   }
}
