public class MusicPatchNode extends Node {
   int ah;
   int au;
   RawSound rawSound;
   MusicPatchNode2 ac;
   static Player localPlayer;
   int ab;
   int aq;
   int al;
   int ar;
   int aa;
   int ay;
   int ao;
   int ax;
   int as;
   RawPcmStream stream;
   int ag;
   int av;
   MusicPatch patch;
   int af;
   int ai;
   int ak;
   int at;

   MusicPatchNode() {
   }

   public static boolean aw_renamed(int var0) {
      return 0 != (var0 >> 20 & 1);
   }

   static String nu_renamed(Component var0) {
      if (hc.af_renamed(KeyHandler.getComponentClickMask(var0)) == 0) {
         return null;
      } else {
         return var0.targetVerb != null && var0.targetVerb.trim().length() != 0 ? var0.targetVerb : null;
      }
   }

   public static float af_renamed(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586);
   }

   void af() {
      this.patch = null;
      this.rawSound = null;
      this.ac = null;
      this.stream = null;
   }

   static final void iw_renamed(Component var0, int var1, int var2) {
      if (Client.tp * 1383336963 == 0 || 1383336963 * Client.tp == 3) {
         if (!Client.isMiniMenuOpen && (MouseHandler.ar * -1222491879 == 1 || !su.ev && MouseHandler.ar * -1222491879 == 4)) {
            SpriteMask var4 = var0.getSpriteMask(true, (byte)29);
            if (null == var4) {
               return;
            }

            int var5 = 2020601481 * MouseHandler.MouseHandler_lastButton - var1;
            int var6 = MouseHandler.as * 1163896205 - var2;
            if (var4.contains(var5, var6)) {
               var5 -= var4.height * 1484188043 / 2;
               var6 -= var4.width * 939947663 / 2;
               int var7 = Client.kf * 704283033 & 2047;
               int var8 = in.ac[var7];
               int var9 = in.au[var7];
               int var10 = var5 * var9 + var6 * var8 >> 11;
               int var11 = var6 * var9 - var5 * var8 >> 11;
               int var12 = 1144428983 * localPlayer.bx + var10 >> 7;
               int var13 = localPlayer.bo * -411750205 - var11 >> 7;
               PacketBitNode var14 = mi.an_renamed(ClientProt.af, Client.packetWriter.au);
               var14.bit.bu(18);
               var14.bit.ds(Scenery.jc * 827352769 + var13);
               var14.bit.dn(var12 + -1232093375 * jm.ib);
               var14.bit.du(Client.sh.av(82) ? (Client.sh.av(81) ? 2 : 1) : 0);
               var14.bit.bu(var5);
               var14.bit.bu(var6);
               var14.bit.bf(704283033 * Client.kf);
               var14.bit.bu(57);
               var14.bit.bu(0);
               var14.bit.bu(0);
               var14.bit.bu(89);
               var14.bit.bf(1144428983 * localPlayer.bx);
               var14.bit.bf(localPlayer.bo * -411750205);
               var14.bit.bu(63);
               Client.packetWriter.aw(var14);
               Client.te = var12 * -1970850269;
               Client.th = 875414437 * var13;
            }
         }

      }
   }
}
