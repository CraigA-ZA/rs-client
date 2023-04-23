public abstract class ii extends Rasterizer2D {
   boolean af = false;
   boolean an = false;
   int[] aq;
   jg al;

   ii(jg var1) {
      this.aq = Rasterizer3D.af;
      this.al = var1;
   }

   void af(int[] var1, int var2, int var3, float[] var4) {
      Rasterizer2D_replace(var1, var2, var3, var4);
   }

   void ac(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
      var10 = ge.an_renamed(var10, var13, var14, var15, var16);
      var11 = ge.an_renamed(var11, var13, var14, var15, var16);
      var12 = ge.an_renamed(var12, var13, var14, var15, var16);
      this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   public static void ac_renamed(int var0) {
      if (926096579 * ly.au != 0) {
         dn.at = var0 * 111967803;
      } else {
         sa.midiPcmStream.af(var0);
      }

   }

   public static int br_renamed(byte[] var0, int var1) {
      return SeqType.bs_renamed(var0, 0, var1);
   }

   void au(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var16 = ge.an_renamed(var10, var11, var12, var13, var14);
      var10 = this.aq[var16];
      this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   static void aj_renamed() {
      ee.ak_renamed(24);
      he.ax_renamed(Strings.jr, Strings.jv, Strings.jh);
   }

   static void cs_renamed(int var0, Coord var1, boolean var2) {
      WorldMapArea var4 = dz.worldMap().getMapArea(var0);
      int var5 = -1900490645 * MusicPatchNode.localPlayer.ad;
      int var6 = (MusicPatchNode.localPlayer.bx * 1144428983 >> 7) + -1232093375 * jm.baseX;
      int var7 = Scenery.baseY * 827352769 + (-411750205 * MusicPatchNode.localPlayer.bo >> 7);
      Coord var8 = new Coord(var5, var6, var7);
      dz.worldMap().ar(var4, var8, var1, var2);
   }

   abstract void at(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void ab(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   abstract void aq(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   abstract void al(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);
}
