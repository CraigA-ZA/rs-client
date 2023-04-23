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
      for(var2 = 0; var2 < au.jf.length; ++var2) {
         if (FontName.jm[var2] != -1 && null == au.jf[var2]) {
            au.jf[var2] = nn.archive5.takeFile(FontName.jm[var2], 0);
            if (null == au.jf[var2]) {
               var1 = false;
               Client.jx += 1047178289;
            }
         }

         if (-1 != Archive.jn[var2] && cr.jw[var2] == null) {
            cr.jw[var2] = nn.archive5.takeFileEncrypted(Archive.jn[var2], 0, Scenery.xteaKeys[var2]);
            if (null == cr.jw[var2]) {
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
         for(var2 = 0; var2 < au.jf.length; ++var2) {
            byte[] var3 = cr.jw[var2];
            if (null != var3) {
               var4 = 64 * (WorldMapAreaData.jj[var2] >> 8) - -1232093375 * jm.ib;
               var5 = (WorldMapAreaData.jj[var2] & 255) * 64 - Scenery.jc * 827352769;
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

            int var16;
            for(var2 = 0; var2 < 4; ++var2) {
               for(var16 = 0; var16 < 104; ++var16) {
                  for(var4 = 0; var4 < 104; ++var4) {
                     Tiles.Tiles_renderFlags[var2][var16][var4] = 0;
                  }
               }
            }

            mj.hz_renamed();
            fx.af_renamed();
            var2 = au.jf.length;
            StructType.af_renamed();
            Language.jv_renamed(true);
            int var18;
            if (!Client.isInInstance) {
               byte[] var6;
               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = (WorldMapAreaData.jj[var16] >> 8) * 64 - -1232093375 * jm.ib;
                  var5 = (WorldMapAreaData.jj[var16] & 255) * 64 - Scenery.jc * 827352769;
                  var6 = au.jf[var16];
                  if (var6 != null) {
                     mj.hz_renamed();
                     WallDecoration.ac_renamed(var6, var4, var5, bi.ji * 856658440 - 48, qj.jg * 370541272 - 48, Client.collisionMaps);
                  }
               }

               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = (WorldMapAreaData.jj[var16] >> 8) * 64 - jm.ib * -1232093375;
                  var5 = (WorldMapAreaData.jj[var16] & 255) * 64 - 827352769 * Scenery.jc;
                  var6 = au.jf[var16];
                  if (null == var6 && qj.jg * 583188571 < 800) {
                     mj.hz_renamed();
                     ew.aw_renamed(var4, var5, 64, 64);
                  }
               }

               Language.jv_renamed(true);

               for(var16 = 0; var16 < var2; ++var16) {
                  byte[] var17 = cr.jw[var16];
                  if (null != var17) {
                     var5 = 64 * (WorldMapAreaData.jj[var16] >> 8) - jm.ib * -1232093375;
                     var18 = 64 * (WorldMapAreaData.jj[var16] & 255) - Scenery.jc * 827352769;
                     mj.hz_renamed();
                     fq.at_renamed(var17, var5, var18, bx.scene, Client.collisionMaps);
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
               for(var16 = 0; var16 < 4; ++var16) {
                  mj.hz_renamed();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        boolean var19 = false;
                        var7 = Client.instanceChunkTemplates[var16][var4][var5];
                        if (-1 != var7) {
                           var8 = var7 >> 24 & 3;
                           var9 = var7 >> 1 & 3;
                           var10 = var7 >> 14 & 1023;
                           var11 = var7 >> 3 & 2047;
                           var12 = (var10 / 8 << 8) + var11 / 8;

                           for(int var13 = 0; var13 < WorldMapAreaData.jj.length; ++var13) {
                              if (var12 == WorldMapAreaData.jj[var13] && null != au.jf[var13]) {
                                 int var14 = 8 * (var10 - var4);
                                 int var15 = 8 * (var11 - var5);
                                 as.au_renamed(au.jf[var13], var16, var4 * 8, var5 * 8, var8, 8 * (var10 & 7), 8 * (var11 & 7), var9, var14, var15, Client.collisionMaps);
                                 var19 = true;
                                 break;
                              }
                           }
                        }

                        if (!var19) {
                           TextureProvider.ab_renamed(var16, 8 * var4, 8 * var5);
                        }
                     }
                  }
               }

               for(var16 = 0; var16 < 13; ++var16) {
                  for(var4 = 0; var4 < 13; ++var4) {
                     var5 = Client.instanceChunkTemplates[0][var16][var4];
                     if (-1 == var5) {
                        ew.aw_renamed(8 * var16, 8 * var4, 8, 8);
                     }
                  }
               }

               Language.jv_renamed(true);

               for(var16 = 0; var16 < 4; ++var16) {
                  mj.hz_renamed();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        var18 = Client.instanceChunkTemplates[var16][var4][var5];
                        if (-1 != var18) {
                           var7 = var18 >> 24 & 3;
                           var8 = var18 >> 1 & 3;
                           var9 = var18 >> 14 & 1023;
                           var10 = var18 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(var12 = 0; var12 < WorldMapAreaData.jj.length; ++var12) {
                              if (WorldMapAreaData.jj[var12] == var11 && null != cr.jw[var12]) {
                                 Tiles.aa(cr.jw[var12], var16, 8 * var4, var5 * 8, var7, 8 * (var9 & 7), (var10 & 7) * 8, var8, bx.scene, Client.collisionMaps);
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
            var16 = Tiles.aw * 1401144457;
            if (var16 > -1727408401 * GameShell.plane) {
               var16 = -1727408401 * GameShell.plane;
            }

            if (var16 < GameShell.plane * -1727408401 - 1) {
               var16 = GameShell.plane * -1727408401 - 1;
            }

            if (Client.cu) {
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
            hq.au.clear();
            PacketBitNode var20;
            if (ClientScriptFrame.client.hasFrame()) {
               var20 = mi.an_renamed(ClientProt.bt, Client.packetWriter.au);
               var20.bit.ba(1057001181);
               Client.packetWriter.aw(var20);
            }

            if (!Client.isInInstance) {
               var4 = (1717695041 * bi.ji - 6) / 8;
               var5 = (6 + bi.ji * 1717695041) / 8;
               var18 = (qj.jg * 583188571 - 6) / 8;
               var7 = (qj.jg * 583188571 + 6) / 8;

               for(var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
                  for(var9 = var18 - 1; var9 <= 1 + var7; ++var9) {
                     if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
                        nn.archive5.cw("m" + var8 + "_" + var9);
                        nn.archive5.cw("l" + var8 + "_" + var9);
                     }
                  }
               }
            }

            fd.hi_renamed(30);
            mj.hz_renamed();
            Entity.an_renamed();
            var20 = mi.an_renamed(ClientProt.ch, Client.packetWriter.au);
            Client.packetWriter.aw(var20);
            Npc.bz_renamed();
         }
      }
   }
}
