import java.awt.FontMetrics;
import java.util.Arrays;

public class bb {
   static FontMetrics pauseFontMetrics;
   int[] al = new int[192];
   int[] aq = new int[112];

   public bb() {
      Arrays.fill(this.aq, 3);
      Arrays.fill(this.al, 3);
   }

   public void af(int var1, int var2) {
      if (this.at(var1) && this.ay(var2)) {
         this.aq[var1] = var2;
      }

   }

   public void an(char var1, int var2) {
      if (this.aa(var1) && this.ay(var2)) {
         this.al[var1] = var2;
      }

   }

   public int aw(int var1) {
      return this.at(var1) ? this.aq[var1] : 0;
   }

   public int ac(char var1) {
      return this.aa(var1) ? this.al[var1] : 0;
   }

   public boolean au(int var1) {
      return this.at(var1) && (1 == this.aq[var1] || this.aq[var1] == 3);
   }

   public boolean ab(char var1) {
      return this.aa(var1) && (this.al[var1] == 1 || this.al[var1] == 3);
   }

   public boolean aq(int var1) {
      return this.at(var1) && (this.aq[var1] == 2 || 3 == this.aq[var1]);
   }

   public boolean al(char var1) {
      return this.aa(var1) && (2 == this.al[var1] || 3 == this.al[var1]);
   }

   boolean at(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   boolean aa(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   boolean ay(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   static final void jh_renamed() {
      Language.jv_renamed(false);
      Client.jx = 0;
      boolean var1 = true;

      int var2;
      for(var2 = 0; var2 < au.regionLandArchives.length; ++var2) {
         if (FontName.regionMapArchiveIds[var2] != -1 && null == au.regionLandArchives[var2]) {
            au.regionLandArchives[var2] = TotalQuantityComparator.archive5.takeFile(FontName.regionMapArchiveIds[var2], 0);
            if (null == au.regionLandArchives[var2]) {
               var1 = false;
               Client.jx += 1047178289;
            }
         }

         if (-1 != Archive.regionLandArchiveIds[var2] && LocSound.regionMapArchives[var2] == null) {
            LocSound.regionMapArchives[var2] = TotalQuantityComparator.archive5.takeFileEncrypted(Archive.regionLandArchiveIds[var2], 0, Scenery.xteaKeys[var2]);
            if (null == LocSound.regionMapArchives[var2]) {
               var1 = false;
               Client.jx += 1047178289;
            }
         }
      }

      if (!var1) {
         Client.je = -1672521981;
      } else {
         Client.jk = 0;
         var1 = true;

         int var4;
         int var5;
         for(var2 = 0; var2 < au.regionLandArchives.length; ++var2) {
            byte[] var3 = LocSound.regionMapArchives[var2];
            if (null != var3) {
               var4 = 64 * (WorldMapAreaData.regions[var2] >> 8) - -1232093375 * jm.baseX;
               var5 = (WorldMapAreaData.regions[var2] & 255) * 64 - Scenery.baseY * 827352769;
               if (Client.isInInstance) {
                  var4 = 10;
                  var5 = 10;
               }

               var1 &= IDKType.al_renamed(var3, var4, var5);
            }
         }

         if (!var1) {
            Client.je = 949923334;
         } else {
            if (Client.je * -2139010133 != 0) {
               jl.ij_renamed(Strings.Strings_loadingPleaseWait + Formatting.Formatting_lineBreakTag + Formatting.Formatting_spaceLeftParenthesis + 100 + "%" + Formatting.Formatting_rightParenthesis, true);
            }

            mj.hz_renamed();
            bx.scene.clear();

            for(var2 = 0; var2 < 4; ++var2) {
               Client.collisionMaps[var2].clear();
            }

            int var22;
            for(var2 = 0; var2 < 4; ++var2) {
               for(var22 = 0; var22 < 104; ++var22) {
                  for(var4 = 0; var4 < 104; ++var4) {
                     Tiles.Tiles_renderFlags[var2][var22][var4] = 0;
                  }
               }
            }

            mj.hz_renamed();
            fx.af_renamed();
            var2 = au.regionLandArchives.length;
            StructType.af_renamed();
            Language.jv_renamed(true);
            int var24;
            if (!Client.isInInstance) {
               byte[] var6;
               for(var22 = 0; var22 < var2; ++var22) {
                  var4 = (WorldMapAreaData.regions[var22] >> 8) * 64 - -1232093375 * jm.baseX;
                  var5 = (WorldMapAreaData.regions[var22] & 255) * 64 - Scenery.baseY * 827352769;
                  var6 = au.regionLandArchives[var22];
                  if (var6 != null) {
                     mj.hz_renamed();
                     WallDecoration.ac_renamed(var6, var4, var5, bi.ji * 856658440 - 48, qj.jg * 370541272 - 48, Client.collisionMaps);
                  }
               }

               for(var22 = 0; var22 < var2; ++var22) {
                  var4 = (WorldMapAreaData.regions[var22] >> 8) * 64 - jm.baseX * -1232093375;
                  var5 = (WorldMapAreaData.regions[var22] & 255) * 64 - 827352769 * Scenery.baseY;
                  var6 = au.regionLandArchives[var22];
                  if (null == var6 && qj.jg * 583188571 < 800) {
                     mj.hz_renamed();
                     ew.aw_renamed(var4, var5, 64, 64);
                  }
               }

               Language.jv_renamed(true);

               for(var22 = 0; var22 < var2; ++var22) {
                  byte[] var23 = LocSound.regionMapArchives[var22];
                  if (null != var23) {
                     var5 = 64 * (WorldMapAreaData.regions[var22] >> 8) - jm.baseX * -1232093375;
                     var24 = 64 * (WorldMapAreaData.regions[var22] & 255) - Scenery.baseY * 827352769;
                     mj.hz_renamed();
                     fq.at_renamed(var23, var5, var24, bx.scene, Client.collisionMaps);
                  }
               }
            }

            int var7;
            int var8;
            int var9;
            if (Client.isInInstance) {
               int var10;
               int var11;
               int var12;
               for(var22 = 0; var22 < 4; ++var22) {
                  mj.hz_renamed();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        boolean var25 = false;
                        var7 = Client.instanceChunkTemplates[var22][var4][var5];
                        if (-1 != var7) {
                           var8 = var7 >> 24 & 3;
                           var9 = var7 >> 1 & 3;
                           var10 = var7 >> 14 & 1023;
                           var11 = var7 >> 3 & 2047;
                           var12 = (var10 / 8 << 8) + var11 / 8;

                           for(int var13 = 0; var13 < WorldMapAreaData.regions.length; ++var13) {
                              if (var12 == WorldMapAreaData.regions[var13] && null != au.regionLandArchives[var13]) {
                                 int var14 = 8 * (var10 - var4);
                                 int var15 = 8 * (var11 - var5);
                                 as.au_renamed(au.regionLandArchives[var13], var22, var4 * 8, var5 * 8, var8, 8 * (var10 & 7), 8 * (var11 & 7), var9, var14, var15, Client.collisionMaps);
                                 var25 = true;
                                 break;
                              }
                           }
                        }

                        if (!var25) {
                           TextureProvider.ab_renamed(var22, 8 * var4, 8 * var5);
                        }
                     }
                  }
               }

               for(var22 = 0; var22 < 13; ++var22) {
                  for(var4 = 0; var4 < 13; ++var4) {
                     var5 = Client.instanceChunkTemplates[0][var22][var4];
                     if (-1 == var5) {
                        ew.aw_renamed(8 * var22, 8 * var4, 8, 8);
                     }
                  }
               }

               Language.jv_renamed(true);

               for(var22 = 0; var22 < 4; ++var22) {
                  mj.hz_renamed();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        var24 = Client.instanceChunkTemplates[var22][var4][var5];
                        if (-1 != var24) {
                           var7 = var24 >> 24 & 3;
                           var8 = var24 >> 1 & 3;
                           var9 = var24 >> 14 & 1023;
                           var10 = var24 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(var12 = 0; var12 < WorldMapAreaData.regions.length; ++var12) {
                              if (WorldMapAreaData.regions[var12] == var11 && null != LocSound.regionMapArchives[var12]) {
                                 Tiles.aa(LocSound.regionMapArchives[var12], var22, 8 * var4, var5 * 8, var7, 8 * (var9 & 7), (var10 & 7) * 8, var8, bx.scene, Client.collisionMaps);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            Language.jv_renamed(true);
            mj.hz_renamed();
            ay.ao_renamed(bx.scene, Client.collisionMaps);
            Language.jv_renamed(true);
            var22 = Tiles.aw * 1401144457;
            if (var22 > -1727408401 * GameShell.plane) {
               var22 = -1727408401 * GameShell.plane;
            }

            if (var22 < GameShell.plane * -1727408401 - 1) {
               var22 = GameShell.plane * -1727408401 - 1;
            }

            if (Client.isLowDetail) {
               bx.scene.an(1401144457 * Tiles.aw);
            } else {
               bx.scene.an(0);
            }

            for(var4 = 0; var4 < 104; ++var4) {
               for(var5 = 0; var5 < 104; ++var5) {
                  em.kd_renamed(var4, var5);
               }
            }

            mj.hz_renamed();
            KeyHandler.jl_renamed();
            LocType.LocType_cachedUnlitModels.clear();
            PacketBitNode var26;
            if (ClientScriptFrame.client.hasFrame()) {
               var26 = mi.an_renamed(ClientProt.bt, Client.packetWriter.au);
               var26.bit.ba(1057001181);
               Client.packetWriter.aw(var26);
            }

            if (!Client.isInInstance) {
               var4 = (1717695041 * bi.ji - 6) / 8;
               var5 = (6 + bi.ji * 1717695041) / 8;
               var24 = (qj.jg * 583188571 - 6) / 8;
               var7 = (qj.jg * 583188571 + 6) / 8;

               for(var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
                  for(var9 = var24 - 1; var9 <= 1 + var7; ++var9) {
                     if (var8 < var4 || var8 > var5 || var9 < var24 || var9 > var7) {
                        TotalQuantityComparator.archive5.cw("m" + var8 + "_" + var9);
                        TotalQuantityComparator.archive5.cw("l" + var8 + "_" + var9);
                     }
                  }
               }
            }

            fd.hi_renamed(30);
            mj.hz_renamed();
            Entity.an_renamed();
            var26 = mi.an_renamed(ClientProt.ch, Client.packetWriter.au);
            Client.packetWriter.aw(var26);
            Npc.bz_renamed();
         }
      }
   }
}
