public class kb {
   static ArchiveDisk wh;
   static final kb af = new kb(0);
   static final kb an = new kb(1);
   final int aw;

   kb(int var1) {
      this.aw = -576222849 * var1;
   }

   static AnimFrameset getAnimFrameset(int var0) {
      AnimFrameset var2 = (AnimFrameset)SeqType.at.get((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         var2 = dg.af_renamed(SeqType.ab, SeqType.aq, var0, false);
         if (var2 != null) {
            SeqType.at.put(var2, (long)var0);
         }

         return var2;
      }
   }

   static boolean updateExternalPlayer(PacketBit var0, int var1) {
      int var3 = var0.gBit(2);
      int var4;
      int var5;
      int var8;
      int var9;
      int var10;
      int var11;
      if (0 == var3) {
         if (var0.gBit(1) != 0) {
            updateExternalPlayer(var0, var1);
         }

         var4 = var0.gBit(13);
         var5 = var0.gBit(13);
         boolean var12 = var0.gBit(1) == 1;
         if (var12) {
            ds.ai[(ds.ax += 1362331411) * 1474255643 - 1] = var1;
         }

         if (null != Client.mc[var1]) {
            throw new RuntimeException();
         } else {
            Player var13 = Client.mc[var1] = new Player();
            var13.ae = var1 * -710946309;
            if (ds.au[var1] != null) {
               var13.read(ds.au[var1]);
            }

            var13.dd = 385564471 * ds.ay[var1];
            var13.cr = ds.ao[var1] * 1052277865;
            var8 = ds.aa[var1];
            var9 = var8 >> 28;
            var10 = var8 >> 14 & 255;
            var11 = var8 & 255;
            var13.da[0] = ds.ac[var1];
            var13.ad = -1829675965 * (byte)var9;
            var13.resetPath(var4 + (var10 << 13) - jm.ib * -1232093375, var5 + (var11 << 13) - 827352769 * Scenery.jc);
            var13.bi = false;
            return true;
         }
      } else if (var3 == 1) {
         var4 = var0.gBit(2);
         var5 = ds.aa[var1];
         ds.aa[var1] = ((var4 + (var5 >> 28) & 3) << 28) + (var5 & 268435455);
         return false;
      } else {
         int var6;
         int var7;
         if (2 == var3) {
            var4 = var0.gBit(5);
            var5 = var4 >> 3;
            var6 = var4 & 7;
            var7 = ds.aa[var1];
            var8 = var5 + (var7 >> 28) & 3;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            if (0 == var6) {
               --var9;
               --var10;
            }

            if (1 == var6) {
               --var10;
            }

            if (var6 == 2) {
               ++var9;
               --var10;
            }

            if (3 == var6) {
               --var9;
            }

            if (var6 == 4) {
               ++var9;
            }

            if (5 == var6) {
               --var9;
               ++var10;
            }

            if (6 == var6) {
               ++var10;
            }

            if (7 == var6) {
               ++var9;
               ++var10;
            }

            ds.aa[var1] = (var9 << 14) + (var8 << 28) + var10;
            return false;
         } else {
            var4 = var0.gBit(18);
            var5 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var7 = var4 & 255;
            var8 = ds.aa[var1];
            var9 = var5 + (var8 >> 28) & 3;
            var10 = (var8 >> 14) + var6 & 255;
            var11 = var7 + var8 & 255;
            ds.aa[var1] = var11 + (var10 << 14) + (var9 << 28);
            return false;
         }
      }
   }
}
