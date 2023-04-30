public class bt {
   public static IterableNodeDeque reflectionChecks = new IterableNodeDeque();
   static int cameraX;
   static Sprite[] headIconPkSprites;

   bt() throws Throwable {
      throw new Error();
   }

   static void ie_renamed() {
      if (null != ey.worldMap0) {
         ey.worldMap0.ao(GameShell.plane * -1727408401, (1144428983 * MusicPatchNode.localPlayer.bx >> 7) + -1232093375 * jm.baseX, 827352769 * Scenery.baseY + (MusicPatchNode.localPlayer.bo * -411750205 >> 7), false);
         ey.worldMap0.loadCache();
      }

   }

   static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      int var7;
      if (var6 < 0) {
         var7 = Client.vv;
      } else if (var6 >= 100) {
         var7 = Client.va;
      } else {
         var7 = var6 * (Client.va - Client.vv) / 100 + Client.vv;
      }

      int var8 = var3 * var7 * 512 / (var2 * 334);
      int var9;
      int var10;
      short var19;
      if (var8 < Client.vo) {
         var19 = Client.vo;
         var7 = var2 * var19 * 334 / (512 * var3);
         if (var7 > Client.vn) {
            var7 = Client.vn;
            var9 = 512 * var7 * var3 / (var19 * 334);
            var10 = (var2 - var9) / 2;
            if (var4) {
               Rasterizer2D.Rasterizer2D_resetClip();
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var10, var3, -16777216);
               Rasterizer2D.Rasterizer2D_fillRectangle(var2 + var0 - var10, var1, var10, var3, -16777216);
            }

            var0 += var10;
            var2 -= var10 * 2;
         }
      } else if (var8 > Client.vk) {
         var19 = Client.vk;
         var7 = var2 * var19 * 334 / (512 * var3);
         if (var7 < Client.vm) {
            var7 = Client.vm;
            var9 = var2 * var19 * 334 / (var7 * 512);
            var10 = (var3 - var9) / 2;
            if (var4) {
               Rasterizer2D.Rasterizer2D_resetClip();
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var10, -16777216);
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + var3 - var10, var2, var10, -16777216);
            }

            var1 += var10;
            var3 -= var10 * 2;
         }
      }

      Client.viewportZoom = -787687633 * (var3 * var7 / 334);
      if (var2 != Client.viewportWidth * 433849721 || 2042096749 * Client.viewportHeight != var3) {
         int[] var20 = new int[9];

         for(var10 = 0; var10 < var20.length; ++var10) {
            int var11 = var10 * 32 + 128 + 15;
            int var12 = jm.hv_renamed(var11);
            int var13 = Rasterizer3D.Rasterizer3D_sine[var11];
            int var15 = var3 - 334;
            if (var15 < 0) {
               var15 = 0;
            } else if (var15 > 100) {
               var15 = 100;
            }

            int var16 = Client.vl + var15 * (Client.ve - Client.vl) / 100;
            int var14 = var12 * var16 / 256;
            var20[var10] = var14 * var13 >> 16;
         }

         Scene.Scene_buildVisiblityMap(var20, 500, 800, 334 * var2 / var3, 334);
      }

      Client.vd = var0 * -1528400137;
      Client.vx = var1 * 2017169511;
      Client.viewportWidth = var2 * -350989111;
      Client.viewportHeight = var3 * -538378907;
   }

   static final void la_renamed(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var7 = var2 - var0;
      int var8 = var3 - var1;
      int var9 = var7 >= 0 ? var7 : -var7;
      int var10 = var8 >= 0 ? var8 : -var8;
      int var11 = var9;
      if (var9 < var10) {
         var11 = var10;
      }

      if (0 != var11) {
         int var12 = (var7 << 16) / var11;
         int var13 = (var8 << 16) / var11;
         if (var13 <= var12) {
            var12 = -var12;
         } else {
            var13 = -var13;
         }

         int var14 = var5 * var13 >> 17;
         int var15 = 1 + var13 * var5 >> 17;
         int var16 = var12 * var5 >> 17;
         int var17 = var5 * var12 + 1 >> 17;
         var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
         var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
         int var18 = var0 + var14;
         int var19 = var0 - var15;
         int var20 = var7 + var0 - var15;
         int var21 = var0 + var7 + var14;
         int var22 = var16 + var1;
         int var23 = var1 - var17;
         int var24 = var1 + var8 - var17;
         int var25 = var1 + var8 + var16;
         gz.ag_renamed(var18, var19, var20);
         fw.av_renamed(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
         gz.ag_renamed(var18, var20, var21);
         fw.av_renamed(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
      }
   }

   static final void no_renamed() {
      Client.qy = Client.qu * 1321175015;
      Inventory.sv = true;
   }
}
