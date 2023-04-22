public class eu extends AbstractUserComparator {
   final boolean af;

   int af(Buddy var1, Buddy var2) {
      if (0 != 177258591 * var1.world0 && 177258591 * var2.world0 != 0) {
         return this.af ? 1907692493 * var1.int2 - var2.int2 * 1907692493 : 1907692493 * var2.int2 - var1.int2 * 1907692493;
      } else {
         return this.ao(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.af((Buddy)var1, (Buddy)var2);
   }

   public eu(boolean var1) {
      this.af = var1;
   }

   public static int at_renamed() {
      return in.ab.ab * -1734758735;
   }

   static void ky_renamed(int var0, String var1) {
      int var3 = -2010934433 * ds.ab;
      int[] var4 = ds.aq;
      boolean var5 = false;
      Username var6 = new Username(var1, co.loginType);

      for(int var7 = 0; var7 < var3; ++var7) {
         Player var8 = Client.players[var4[var7]];
         if (null != var8 && var8 != MusicPatchNode.localPlayer && null != var8.username && var8.username.equals(var6)) {
            PacketBitNode var9;
            if (var0 == 1) {
               var9 = mi.an_renamed(ClientProt.de, Client.packetWriter.au);
               var9.bit.du(0);
               var9.bit.bf(var4[var7]);
               Client.packetWriter.aw(var9);
            } else if (4 == var0) {
               var9 = mi.an_renamed(ClientProt.cf, Client.packetWriter.au);
               var9.bit.dp(0);
               var9.bit.dn(var4[var7]);
               Client.packetWriter.aw(var9);
            } else if (var0 == 6) {
               var9 = mi.an_renamed(ClientProt.ca, Client.packetWriter.au);
               var9.bit.dy(var4[var7]);
               var9.bit.dp(0);
               Client.packetWriter.aw(var9);
            } else if (var0 == 7) {
               var9 = mi.an_renamed(ClientProt.al, Client.packetWriter.au);
               var9.bit.ds(var4[var7]);
               var9.bit.dh(0);
               Client.packetWriter.aw(var9);
            }

            var5 = true;
            break;
         }
      }

      if (!var5) {
         es.an_renamed(4, "", Strings.Strings_unableToFind + var1);
      }

   }

   public static final int af(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (var2 != 0.0) {
         double var12;
         if (var4 < 0.5) {
            var12 = var4 * (1.0 + var2);
         } else {
            var12 = var4 + var2 - var2 * var4;
         }

         double var14 = var4 * 2.0 - var12;
         double var16 = 0.3333333333333333 + var0;
         if (var16 > 1.0) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333;
         if (var20 < 0.0) {
            ++var20;
         }

         if (var16 * 6.0 < 1.0) {
            var6 = 6.0 * (var12 - var14) * var16 + var14;
         } else if (2.0 * var16 < 1.0) {
            var6 = var12;
         } else if (var16 * 3.0 < 2.0) {
            var6 = var14 + (0.6666666666666666 - var16) * (var12 - var14) * 6.0;
         } else {
            var6 = var14;
         }

         if (var0 * 6.0 < 1.0) {
            var8 = var14 + 6.0 * (var12 - var14) * var0;
         } else if (var0 * 2.0 < 1.0) {
            var8 = var12;
         } else if (3.0 * var0 < 2.0) {
            var8 = var14 + 6.0 * (var12 - var14) * (0.6666666666666666 - var0);
         } else {
            var8 = var14;
         }

         if (6.0 * var20 < 1.0) {
            var10 = 6.0 * (var12 - var14) * var20 + var14;
         } else if (2.0 * var20 < 1.0) {
            var10 = var12;
         } else if (var20 * 3.0 < 2.0) {
            var10 = (0.6666666666666666 - var20) * (var12 - var14) * 6.0 + var14;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(256.0 * var6);
      int var13 = (int)(256.0 * var8);
      int var23 = (int)(256.0 * var10);
      int var15 = (var13 << 8) + (var22 << 16) + var23;
      return var15;
   }

   static int bv_renamed(int var0, ClientScript var1, boolean var2) {
      return 2;
   }
}
