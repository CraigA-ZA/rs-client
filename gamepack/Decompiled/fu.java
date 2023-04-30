public abstract class fu extends Node {
   fu() {
   }

   static final void mb_renamed(Component var0, int var1, int var2, int var3) {
      mj.hz_renamed();
      SpriteMask var5 = var0.getSpriteMask(false);
      if (null != var5) {
         Rasterizer2D.Rasterizer2D_setClip(var1, var2, 1484188043 * var5.width + var1, var5.height * 939947663 + var2);
         if (2 != 1383336963 * Client.minimapState && Client.minimapState * 1383336963 != 5) {
            int var6 = 704283033 * Client.camAngleY & 2047;
            int var7 = 48 + MusicPatchNode.localPlayer.bx * 1144428983 / 32;
            int var8 = 464 - -411750205 * MusicPatchNode.localPlayer.bo / 32;
            UrlRequester.sceneMinimapSprite.be(var1, var2, 1484188043 * var5.width, var5.height * 939947663, var7, var8, var6, 256, var5.xStarts, var5.xWidths);

            int var9;
            int var10;
            int var11;
            for(var9 = 0; var9 < Client.sr * 1573101195; ++var9) {
               var10 = 4 * Client.tw[var9] + 2 - MusicPatchNode.localPlayer.bx * 1144428983 / 32;
               var11 = 2 + Client.ty[var9] * 4 - -411750205 * MusicPatchNode.localPlayer.bo / 32;
               qc.ns_renamed(var1, var2, var10, var11, Client.mapIcons[var9], var5);
            }

            int var12;
            int var13;
            for(var9 = 0; var9 < 104; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  NodeDeque var21 = Client.objStacks[GameShell.plane * -1727408401][var9][var10];
                  if (null != var21) {
                     var12 = 4 * var9 + 2 - 1144428983 * MusicPatchNode.localPlayer.bx / 32;
                     var13 = var10 * 4 + 2 - -411750205 * MusicPatchNode.localPlayer.bo / 32;
                     qc.ns_renamed(var1, var2, var12, var13, sf.mapDotSprites[0], var5);
                  }
               }
            }

            for(var9 = 0; var9 < 265474485 * Client.npcCount; ++var9) {
               Npc var19 = Client.npcs[Client.npcIndices[var9]];
               if (null != var19 && var19.isVisible()) {
                  NPCType var22 = var19.type;
                  if (null != var22 && null != var22.transforms) {
                     var22 = var22.transform();
                  }

                  if (var22 != null && var22.drawMapDot && var22.interactable) {
                     var12 = var19.bx * 1144428983 / 32 - MusicPatchNode.localPlayer.bx * 1144428983 / 32;
                     var13 = var19.bo * -411750205 / 32 - MusicPatchNode.localPlayer.bo * -411750205 / 32;
                     qc.ns_renamed(var1, var2, var12, var13, sf.mapDotSprites[1], var5);
                  }
               }
            }

            var9 = ds.ab * -2010934433;
            int[] var20 = ds.aq;

            for(var11 = 0; var11 < var9; ++var11) {
               Player var23 = Client.players[var20[var11]];
               if (null != var23 && var23.isVisible() && !var23.isHidden && MusicPatchNode.localPlayer != var23) {
                  var13 = 1144428983 * var23.bx / 32 - 1144428983 * MusicPatchNode.localPlayer.bx / 32;
                  int var14 = -411750205 * var23.bo / 32 - -411750205 * MusicPatchNode.localPlayer.bo / 32;
                  if (var23.aw()) {
                     qc.ns_renamed(var1, var2, var13, var14, sf.mapDotSprites[3], var5);
                  } else if (-55850951 * MusicPatchNode.localPlayer.team != 0 && -55850951 * var23.team != 0 && -55850951 * MusicPatchNode.localPlayer.team == -55850951 * var23.team) {
                     qc.ns_renamed(var1, var2, var13, var14, sf.mapDotSprites[4], var5);
                  } else if (var23.aa()) {
                     qc.ns_renamed(var1, var2, var13, var14, sf.mapDotSprites[5], var5);
                  } else if (var23.ag()) {
                     qc.ns_renamed(var1, var2, var13, var14, sf.mapDotSprites[6], var5);
                  } else {
                     qc.ns_renamed(var1, var2, var13, var14, sf.mapDotSprites[2], var5);
                  }
               }
            }

            if (0 != Client.eu * 633821975 && -1886224337 * Client.ep % 20 < 10) {
               if (1 == Client.eu * 633821975 && 920558921 * Client.es >= 0 && Client.es * 920558921 < Client.npcs.length) {
                  Npc var24 = Client.npcs[920558921 * Client.es];
                  if (null != var24) {
                     var12 = var24.bx * 1144428983 / 32 - MusicPatchNode.localPlayer.bx * 1144428983 / 32;
                     var13 = var24.bo * -411750205 / 32 - -411750205 * MusicPatchNode.localPlayer.bo / 32;
                     sb.worldToMinimap(var1, var2, var12, var13, ds.mapMarkerSprites[1], var5);
                  }
               }

               if (2 == 633821975 * Client.eu) {
                  var11 = -420453652 * Client.el - -633406204 * jm.baseX + 2 - MusicPatchNode.localPlayer.bx * 1144428983 / 32;
                  var12 = 2 + (-1108154476 * Client.en - Scenery.baseY * -985556220) - -411750205 * MusicPatchNode.localPlayer.bo / 32;
                  sb.worldToMinimap(var1, var2, var11, var12, ds.mapMarkerSprites[1], var5);
               }

               if (10 == 633821975 * Client.eu && Client.eb * 561980131 >= 0 && Client.eb * 561980131 < Client.players.length) {
                  Player var25 = Client.players[Client.eb * 561980131];
                  if (null != var25) {
                     var12 = 1144428983 * var25.bx / 32 - MusicPatchNode.localPlayer.bx * 1144428983 / 32;
                     var13 = var25.bo * -411750205 / 32 - MusicPatchNode.localPlayer.bo * -411750205 / 32;
                     sb.worldToMinimap(var1, var2, var12, var13, ds.mapMarkerSprites[1], var5);
                  }
               }
            }

            if (1494100363 * Client.destinationX != 0) {
               var11 = 2 + 1681434156 * Client.destinationX - 1144428983 * MusicPatchNode.localPlayer.bx / 32;
               var12 = 2 + 1597878452 * Client.destinationY - -411750205 * MusicPatchNode.localPlayer.bo / 32;
               qc.ns_renamed(var1, var2, var11, var12, ds.mapMarkerSprites[0], var5);
            }

            if (!MusicPatchNode.localPlayer.isHidden) {
               Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1484188043 * var5.width / 2 - 1, var2 + 939947663 * var5.height / 2 - 1, 3, 3, 16777215);
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
