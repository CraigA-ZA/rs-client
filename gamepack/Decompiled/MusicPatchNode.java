public class MusicPatchNode extends Node {
   static Player localPlayer;
   RawPcmStream stream;
   RawSound rawSound;
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
   MusicPatch patch;

   public static boolean aw_renamed(int var0) {
      return 0 != (var0 >> 20 & 1);
   }

   public static float af_renamed(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586);
   }

   MusicPatchNode() {
   }

   void af() {
      this.patch = null;
      this.rawSound = null;
      this.ac = null;
      this.stream = null;
   }

   static final void iw_renamed(Component var0, int var1, int var2) {
      if (Client.tp * 1383336963 == 0 || 1383336963 * Client.tp == 3) {
         if (!Client.isMiniMenuOpen && (MouseHandler.MouseHandler_lastButton * -1222491879 == 1 || !su.ev && MouseHandler.MouseHandler_lastButton * -1222491879 == 4)) {
            SpriteMask var4 = var0.getSpriteMask(true, (byte)29);
            if (null == var4) {
               return;
            }

            int var5 = 2020601481 * MouseHandler.MouseHandler_lastPressedX - var1;
            int var6 = MouseHandler.MouseHandler_lastPressedY * 1163896205 - var2;
            if (var4.contains(var5, var6)) {
               var5 -= var4.width * 1484188043 / 2;
               var6 -= var4.height * 939947663 / 2;
               int var7 = Client.kf * 704283033 & 2047;
               int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
               int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
               int var10 = var5 * var9 + var6 * var8 >> 11;
               int var11 = var6 * var9 - var5 * var8 >> 11;
               int var12 = 1144428983 * localPlayer.bx + var10 >> 7;
               int var13 = localPlayer.bo * -411750205 - var11 >> 7;
               PacketBitNode var14 = mi.an_renamed(ClientProt.af, Client.packetWriter.au);
               var14.bit.bu(18);
               var14.bit.ds(Scenery.baseY * 827352769 + var13);
               var14.bit.p2LE(var12 + -1232093375 * jm.baseX);
               var14.bit.du(Client.sh.av(82) ? (Client.sh.av(81) ? 2 : 1) : 0);
               var14.bit.bu(var5);
               var14.bit.bu(var6);
               var14.bit.p2(704283033 * Client.kf);
               var14.bit.bu(57);
               var14.bit.bu(0);
               var14.bit.bu(0);
               var14.bit.bu(89);
               var14.bit.p2(1144428983 * localPlayer.bx);
               var14.bit.p2(localPlayer.bo * -411750205);
               var14.bit.bu(63);
               Client.packetWriter.aw(var14);
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
         return var0.targetVerb != null && var0.targetVerb.trim().length() != 0 ? var0.targetVerb : null;
      }
   }
}
