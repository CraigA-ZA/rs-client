public class MusicPatchNode extends Node {
   static Player mi;
   RawPcmStream am;
   RawSound aw;
   int aa;
   int ab;
   int af;
   int ag;
   int ah;
   int ai;
   int ak;
   int al;
   int ao;
   int aq;
   int ar;
   int as;
   int at;
   int au;
   int av;
   int ax;
   int ay;
   MusicPatchNode2 ac;
   MusicPatch an;

   public static boolean aw_renamed(int var0) {
      return 0 != (var0 >> 20 & 1);
   }

   public static float af_renamed(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586);
   }

   MusicPatchNode() {
   }

   void remove2() {
      this.an = null;
      this.aw = null;
      this.ac = null;
      this.am = null;
   }

   static final void iw_renamed(Component var0, int var1, int var2) {
      if (Client.tp * 1383336963 == 0 || 1383336963 * Client.tp == 3) {
         if (!Client.nt && (MouseHandler.ar * -1222491879 == 1 || !su.ev && MouseHandler.ar * -1222491879 == 4)) {
            SpriteMask var4 = var0.getSpriteMask(true, (byte)29);
            if (null == var4) {
               return;
            }

            int var5 = 2020601481 * MouseHandler.am - var1;
            int var6 = MouseHandler.as * 1163896205 - var2;
            if (var4.contains(var5, var6)) {
               var5 -= var4.af * 1484188043 / 2;
               var6 -= var4.an * 939947663 / 2;
               int var7 = Client.kf * 704283033 & 2047;
               int var8 = in.ac[var7];
               int var9 = in.au[var7];
               int var10 = var5 * var9 + var6 * var8 >> 11;
               int var11 = var6 * var9 - var5 * var8 >> 11;
               int var12 = 1144428983 * mi.bx + var10 >> 7;
               int var13 = mi.bo * -411750205 - var11 >> 7;
               PacketBitNode var14 = mi.an_renamed(ClientProt.af, Client.in.au);
               var14.aw.bu(18);
               var14.aw.ds(Scenery.jc * 827352769 + var13);
               var14.aw.p2LE(var12 + -1232093375 * jm.ib);
               var14.aw.du(Client.sh.av(82) ? (Client.sh.av(81) ? 2 : 1) : 0);
               var14.aw.bu(var5);
               var14.aw.bu(var6);
               var14.aw.p2(704283033 * Client.kf);
               var14.aw.bu(57);
               var14.aw.bu(0);
               var14.aw.bu(0);
               var14.aw.bu(89);
               var14.aw.p2(1144428983 * mi.bx);
               var14.aw.p2(mi.bo * -411750205);
               var14.aw.bu(63);
               Client.in.aw(var14);
               Client.te = var12 * -1970850269;
               Client.th = 875414437 * var13;
            }
         }

      }
   }

   static String nu_renamed(Component var0) {
      if (hc.af_renamed(KeyHandler.getComponentClickMask(var0)) == 0) {
         return null;
      } else {
         return var0.fe != null && var0.fe.trim().length() != 0 ? var0.fe : null;
      }
   }
}
