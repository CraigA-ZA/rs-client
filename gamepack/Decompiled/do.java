import java.util.Calendar;
import java.util.Date;

public class do {
   do() throws Throwable {
      throw new Error();
   }

   static boolean al_renamed(Date var0) {
      Calendar var2 = Calendar.getInstance();
      var2.set(1, var2.get(1) - 13);
      var2.set(5, var2.get(5) + 1);
      var2.set(11, 0);
      var2.set(12, 0);
      var2.set(13, 0);
      var2.set(14, 0);
      Date var3 = var2.getTime();
      return var0.before(var3);
   }

   static final void ku_renamed(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (Client.cu && var0 != GameShell.mh * -1727408401) {
            return;
         }

         long var9 = 0L;
         boolean var11 = true;
         boolean var12 = false;
         boolean var13 = false;
         if (0 == var1) {
            var9 = bx.js.by(var0, var2, var3);
         }

         if (var1 == 1) {
            var9 = bx.js.bb(var0, var2, var3);
         }

         if (var1 == 2) {
            var9 = bx.js.bi(var0, var2, var3);
         }

         if (3 == var1) {
            var9 = bx.js.be(var0, var2, var3);
         }

         int var14;
         if (var9 != 0L) {
            var14 = bx.js.bk(var0, var2, var3, var9);
            int var16 = InterfaceParent.at(var9);
            int var17 = var14 & 31;
            int var18 = var14 >> 6 & 3;
            hq var15;
            if (0 == var1) {
               bx.js.ar(var0, var2, var3);
               var15 = fw.an_renamed(var16);
               if (0 != var15.am * -973955889) {
                  Client.jr[var0].aq(var2, var3, var17, var18, var15.as);
               }
            }

            if (1 == var1) {
               bx.js.am(var0, var2, var3);
            }

            if (var1 == 2) {
               bx.js.as(var0, var2, var3);
               var15 = fw.an_renamed(var16);
               if (-1339930361 * var15.av + var2 > 103 || -1339930361 * var15.av + var3 > 103 || var2 + var15.ar * -1659393955 > 103 || -1659393955 * var15.ar + var3 > 103) {
                  return;
               }

               if (-973955889 * var15.am != 0) {
                  Client.jr[var0].al(var2, var3, -1339930361 * var15.av, var15.ar * -1659393955, var18, var15.as);
               }
            }

            if (3 == var1) {
               bx.js.aj(var0, var2, var3);
               var15 = fw.an_renamed(var16);
               if (-973955889 * var15.am == 1) {
                  Client.jr[var0].aa(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var14 = var0;
            if (var0 < 3 && 2 == (Tiles.an[1][var2][var3] & 2)) {
               var14 = var0 + 1;
            }

            gh.ak_renamed(var0, var14, var2, var3, var4, var5, var6, var7, bx.js, Client.jr[var0]);
         }
      }

   }

   static void kf_renamed(int var0, int var1) {
      PacketBitNode var3 = mi.an_renamed(ClientProt.cp, Client.in.au);
      var3.aw.el(var0);
      var3.aw.p2LE(var1);
      Client.in.aw(var3);
   }

   static boolean mz_renamed(int var0) {
      for(int var2 = 0; var2 < Client.sm * -1685179677; ++var2) {
         if (Client.sz[var2] == var0) {
            return true;
         }
      }

      return false;
   }
}
