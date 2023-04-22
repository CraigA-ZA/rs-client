public final class WallDecoration {
   int xOffset;
   public long tag = 0L;
   int y;
   int x;
   int int7;
   public Entity entity2;
   int yOffset;
   public Entity entity1;
   int orientation;
   int tileHeight;
   int flags = 0;
   static Font fontPlain12;

   static final void ac_renamed(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if (var1 + var8 > 0 && var1 + var8 < 103 && var9 + var2 > 0 && var9 + var2 < 103) {
                  int[] var10000 = var5[var7].flags[var1 + var8];
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
         if (aj.clientPreferences.ae() != null) {
            cz.ca = aj.clientPreferences.ae();
            Client.hb = true;
         } else {
            Client.hb = false;
         }

      }
   }

   static void lz_renamed(Component[] var0, Component var1, boolean var2) {
      int var4 = var1.scrollWidth * -773060713 != 0 ? var1.scrollWidth * -773060713 : -794961409 * var1.width;
      int var5 = 0 != var1.scrollHeight * -1273374131 ? -1273374131 * var1.scrollHeight : var1.height * 1473950221;
      fp.ld_renamed(var0, 1713081171 * var1.id, var4, var5, var2);
      if (var1.children != null) {
         fp.ld_renamed(var1.children, 1713081171 * var1.id, var4, var5, var2);
      }

      InterfaceParent var6 = (InterfaceParent)Client.interfaceParents.get((long)(var1.id * 1713081171));
      if (null != var6) {
         SeqType.lc_renamed(var6.af * 944864121, var4, var5, var2);
      }

      if (1337 == var1.clientCode * 1021339961) {
      }

   }

   WallDecoration() {
   }
}
