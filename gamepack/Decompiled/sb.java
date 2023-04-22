public class sb {
   sb() throws Throwable {
      throw new Error();
   }

   public static void aa_renamed(byte[] var0) {
      Packet var2 = new Packet(var0);
      var2.index = -1516355947 * (var0.length - 2);
      tx.af = var2.cl() * 1532315763;
      tx.ac = new int[tx.af * 1606065339];
      ar.au = new int[1606065339 * tx.af];
      dd.ab = new int[tx.af * 1606065339];
      fd.aq = new int[1606065339 * tx.af];
      VarBitType.at = new byte[tx.af * 1606065339][];
      var2.index = (var0.length - 7 - tx.af * -36379176) * -1516355947;
      tx.an = var2.cl() * -90671369;
      tx.aw = var2.cl() * -2145718617;
      int var3 = (var2.g1() & 255) + 1;

      int var4;
      for(var4 = 0; var4 < tx.af * 1606065339; ++var4) {
         tx.ac[var4] = var2.cl();
      }

      for(var4 = 0; var4 < tx.af * 1606065339; ++var4) {
         ar.au[var4] = var2.cl();
      }

      for(var4 = 0; var4 < tx.af * 1606065339; ++var4) {
         dd.ab[var4] = var2.cl();
      }

      for(var4 = 0; var4 < tx.af * 1606065339; ++var4) {
         fd.aq[var4] = var2.cl();
      }

      var2.index = -1516355947 * (var0.length - 7 - tx.af * -36379176 - 3 * (var3 - 1));
      pc.al = new int[var3];

      for(var4 = 1; var4 < var3; ++var4) {
         pc.al[var4] = var2.cr();
         if (pc.al[var4] == 0) {
            pc.al[var4] = 1;
         }
      }

      var2.index = 0;

      for(var4 = 0; var4 < 1606065339 * tx.af; ++var4) {
         int var5 = dd.ab[var4];
         int var6 = fd.aq[var4];
         int var7 = var6 * var5;
         byte[] var8 = new byte[var7];
         VarBitType.at[var4] = var8;
         int var9 = var2.g1();
         int var10;
         if (0 == var9) {
            for(var10 = 0; var10 < var7; ++var10) {
               var8[var10] = var2.g1s();
            }
         } else if (1 == var9) {
            for(var10 = 0; var10 < var5; ++var10) {
               for(int var11 = 0; var11 < var6; ++var11) {
                  var8[var11 * var5 + var10] = var2.g1s();
               }
            }
         }
      }

   }

   static final void worldToMinimap(int var0, int var1, int var2, int var3, Rasterizer3D var4, SpriteMask var5) {
      int var7 = var3 * var3 + var2 * var2;
      if (var7 > 4225 && var7 < 90000) {
         int var8 = Client.kf * 704283033 & 2047;
         int var9 = in.ac[var8];
         int var10 = in.au[var8];
         int var11 = var2 * var10 + var9 * var3 >> 16;
         int var12 = var10 * var3 - var9 * var2 >> 16;
         double var13 = Math.atan2((double)var11, (double)var12);
         int var15 = var5.height * 1484188043 / 2 - 25;
         int var16 = (int)(Math.sin(var13) * (double)var15);
         int var17 = (int)(Math.cos(var13) * (double)var15);
         byte var18 = 20;
         dp.jz.bk(var5.height * 1484188043 / 2 + var0 - var18 / 2 + var16, var1 + 939947663 * var5.width / 2 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
      } else {
         qc.ns_renamed(var0, var1, var2, var3, var4, var5);
      }

   }
}
