public final class WallDecoration {
   static Font io;
   int ab;
   int ac;
   int af;
   int an;
   int aq;
   int au;
   int aw;
   int ay = 0;
   public Entity al;
   public Entity at;
   public long aa = 0L;

   WallDecoration() {
   }

   static final void ac_renamed(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if (var1 + var8 > 0 && var1 + var8 < 103 && var9 + var2 > 0 && var9 + var2 < 103) {
                  int[] var10000 = var5[var7].bj[var1 + var8];
                  var10000[var2 + var9] &= -16777217;
               }
            }
         }
      }

      Packet var13 = new Packet(var0);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               int var11 = var1 + var9;
               int var12 = var2 + var10;
               of.loadTerrain(var13, var8, var11, var12, var3 + var11, var4 + var12, 0);
            }
         }
      }

   }

   static void ac_renamed() {
      if (null == cz.ca || cz.ca.length() <= 0) {
         if (aj.vb.ae() != null) {
            cz.ca = aj.vb.ae();
            Client.hb = true;
         } else {
            Client.hb = false;
         }

      }
   }

   static void lz_renamed(Component[] var0, Component var1, boolean var2) {
      int var4 = var1.cf * -773060713 != 0 ? var1.cf * -773060713 : -794961409 * var1.cs;
      int var5 = 0 != var1.cl * -1273374131 ? -1273374131 * var1.cl : var1.cc * 1473950221;
      fp.ld_renamed(var0, 1713081171 * var1.bs, var4, var5, var2);
      if (var1.gz != null) {
         fp.ld_renamed(var1.gz, 1713081171 * var1.bs, var4, var5, var2);
      }

      InterfaceParent var6 = (InterfaceParent)Client.oc.get((long)(var1.bs * 1713081171));
      if (null != var6) {
         SeqType.lc_renamed(var6.af * 944864121, var4, var5, var2);
      }

      if (1337 == var1.bf * 1021339961) {
      }

   }
}
