public final class dg extends Node {
   int an;
   int aw;
   int ac;
   int au;
   int aq;
   int aa;
   int ai = 0;
   int at;
   int al;
   int ab;
   int ax = 2015793749;
   int af;
   int ag = -376812409;
   int ay;

   public static AnimFrameset af_renamed(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
      boolean var5 = true;
      int[] var6 = var0.ck(var2);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         byte[] var8 = var0.getFile(var2, var6[var7]);
         if (null == var8) {
            var5 = false;
         } else {
            int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
            byte[] var10;
            if (var3) {
               var10 = var1.getFile(0, var9);
            } else {
               var10 = var1.getFile(var9, 0);
            }

            if (null == var10) {
               var5 = false;
            }
         }
      }

      if (!var5) {
         return null;
      } else {
         try {
            return new AnimFrameset(var0, var1, var2, var3);
         } catch (Exception var11) {
            return null;
         }
      }
   }

   void af(int var1) {
      this.ax = -1874637045 * var1;
   }

   boolean an(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (-1693875037 * this.ax & 1 << var1);
      } else {
         return true;
      }
   }

   dg() {
   }
}
