public abstract class fu extends Node {
   fu() {
   }

   static final void mb_renamed(Component var0, int var1, int var2, int var3) {
      mj.hz_renamed();
      SpriteMask var5 = var0.getSpriteMask(false, (byte)-106);
      if (null != var5) {
         Rasterizer2D.Rasterizer2D_setClip(var1, var2, 1484188043 * var5.height + var1, var5.width * 939947663 + var2);
         if (2 != 1383336963 * Client.tp && Client.tp * 1383336963 != 5) {
            int var6 = 704283033 * Client.kf & 2047;
            int var7 = 48 + MusicPatchNode.localPlayer.bx * 1144428983 / 32;
            int var8 = 464 - -411750205 * MusicPatchNode.localPlayer.bo / 32;
            UrlRequester.tk.be(var1, var2, 1484188043 * var5.height, var5.width * 939947663, var7, var8, var6, 256, var5.xStarts, var5.xWidths);

            int var9;
            int var10;
            int var11;
            for(var9 = 0; var9 < Client.sr * 1573101195; ++var9) {
               var10 = 4 * Client.tw[var9] + 2 - MusicPatchNode.localPlayer.bx * 1144428983 / 32;
               var11 = 2 + Client.ty[var9] * 4 - -411750205 * MusicPatchNode.localPlayer.bo / 32;
               qc.ns_renamed(var1, var2, var10, var11, Client.ts[var9], var5);
            }

            int var12;
            int var13;
            for(var9 = 0; var9 < 104; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  NodeDeque var17 = Client.objStacks[GameShell.plane * -1727408401][var9][var10];
                  if (null != var17) {
                     var12 = 4 * var9 + 2 - 1144428983 * MusicPatchNode.localPlayer.bx / 32;
                     var13 = var10 * 4 + 2 - -411750205 * MusicPatchNode.localPlayer.bo / 32;
                     qc.ns_renamed(var1, var2, var12, var13, sf.kt[0], var5);
                  }
               }
            }

            for(var9 = 0; var9 < 265474485 * Client.iw; ++var9) {
               Npc var15 = Client.npcs[Client.iy[var9]];
               if (null != var15 && var15.isVisible()) {
                  hs var18 = var15.af;
                  if (null != var18 && null != var18.bn) {
                     var18 = var18.at();
                  }

                  if (var18 != null && var18.bk && var18.bg) {
                     var12 = var15.bx * 1144428983 / 32 - MusicPatchNode.localPlayer.bx * 1144428983 / 32;
                     var13 = var15.bo * -411750205 / 32 - MusicPatchNode.localPlayer.bo * -411750205 / 32;
                     qc.ns_renamed(var1, var2, var12, var13, sf.kt[1], var5);
                  }
               }
            }

            var9 = ds.ab * -2010934433;
            int[] var16 = ds.aq;

            for(var11 = 0; var11 < var9; ++var11) {
               Player var19 = Client.players[var16[var11]];
               if (null != var19 && var19.isVisible() && !var19.az && MusicPatchNode.localPlayer != var19) {
                  var13 = 1144428983 * var19.bx / 32 - 1144428983 * MusicPatchNode.localPlayer.bx / 32;
                  int var14 = -411750205 * var19.bo / 32 - -411750205 * MusicPatchNode.localPlayer.bo / 32;
                  if (var19.aw()) {
                     qc.ns_renamed(var1, var2, var13, var14, sf.kt[3], var5);
                  } else if (-55850951 * MusicPatchNode.localPlayer.animationCycleEnd != 0 && -55850951 * var19.animationCycleEnd != 0 && -55850951 * MusicPatchNode.localPlayer.animationCycleEnd == -55850951 * var19.animationCycleEnd) {
                     qc.ns_renamed(var1, var2, var13, var14, sf.kt[4], var5);
                  } else if (var19.aa()) {
                     qc.ns_renamed(var1, var2, var13, var14, sf.kt[5], var5);
                  } else if (var19.ag()) {
                     qc.ns_renamed(var1, var2, var13, var14, sf.kt[6], var5);
                  } else {
                     qc.ns_renamed(var1, var2, var13, var14, sf.kt[2], var5);
                  }
               }
            }

            if (0 != Client.eu * 633821975 && -1886224337 * Client.ep % 20 < 10) {
               if (1 == Client.eu * 633821975 && 920558921 * Client.es >= 0 && Client.es * 920558921 < Client.npcs.length) {
                  Npc var20 = Client.npcs[920558921 * Client.es];
                  if (null != var20) {
                     var12 = var20.bx * 1144428983 / 32 - MusicPatchNode.localPlayer.bx * 1144428983 / 32;
                     var13 = var20.bo * -411750205 / 32 - -411750205 * MusicPatchNode.localPlayer.bo / 32;
                     sb.worldToMinimap(var1, var2, var12, var13, ds.kd[1], var5);
                  }
               }

               if (2 == 633821975 * Client.eu) {
                  var11 = -420453652 * Client.el - -633406204 * jm.ib + 2 - MusicPatchNode.localPlayer.bx * 1144428983 / 32;
                  var12 = 2 + (-1108154476 * Client.en - Scenery.jc * -985556220) - -411750205 * MusicPatchNode.localPlayer.bo / 32;
                  sb.worldToMinimap(var1, var2, var11, var12, ds.kd[1], var5);
               }

               if (10 == 633821975 * Client.eu && Client.eb * 561980131 >= 0 && Client.eb * 561980131 < Client.players.length) {
                  Player var21 = Client.players[Client.eb * 561980131];
                  if (null != var21) {
                     var12 = 1144428983 * var21.bx / 32 - MusicPatchNode.localPlayer.bx * 1144428983 / 32;
                     var13 = var21.bo * -411750205 / 32 - MusicPatchNode.localPlayer.bo * -411750205 / 32;
                     sb.worldToMinimap(var1, var2, var12, var13, ds.kd[1], var5);
                  }
               }
            }

            if (1494100363 * Client.te != 0) {
               var11 = 2 + 1681434156 * Client.te - 1144428983 * MusicPatchNode.localPlayer.bx / 32;
               var12 = 2 + 1597878452 * Client.th - -411750205 * MusicPatchNode.localPlayer.bo / 32;
               qc.ns_renamed(var1, var2, var11, var12, ds.kd[0], var5);
            }

            if (!MusicPatchNode.localPlayer.az) {
               Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1484188043 * var5.height / 2 - 1, var2 + 939947663 * var5.width / 2 - 1, 3, 3, 16777215);
            }
         } else {
            Rasterizer2D.fx(var1, var2, 0, var5.xStarts, var5.xWidths);
         }

         Client.rm[var3] = true;
      }
   }

   abstract void af(Packet var1);

   abstract void an(gj var1);
}
