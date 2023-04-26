public class DynamicObject extends Entity {
   static AbstractArchive bi;
   SeqType seqType;
   int y;
   int plane;
   int id;
   int frame;
   int type;
   int cycleStart;
   int x;
   int orientation;

   DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Entity var9) {
      this.id = 1330439285 * var1;
      this.type = 918377177 * var2;
      this.orientation = 1745873217 * var3;
      this.plane = var4 * -1874330171;
      this.x = -1211484067 * var5;
      this.y = -1840369975 * var6;
      if (-1 != var7) {
         this.seqType = Inventory.getSeqType(var7);
         this.frame = 0;
         this.cycleStart = -1495562491 * Client.ep - -1353577717;
         if (this.seqType.be * 789159225 == 0 && var9 != null && var9 instanceof DynamicObject) {
            DynamicObject var10 = (DynamicObject)var9;
            if (var10.seqType == this.seqType) {
               this.frame = var10.frame * 1;
               this.cycleStart = 1 * var10.cycleStart;
               return;
            }
         }

         if (var8 && this.seqType.righthand * 1363943497 != -1) {
            if (!this.seqType.ao()) {
               this.frame = (int)(Math.random() * (double)this.seqType.frameIds.length) * 499784167;
               this.cycleStart -= (int)(Math.random() * (double)this.seqType.frameLengths[1017637335 * this.frame]) * -1353577717;
            } else {
               this.frame = (int)(Math.random() * (double)this.seqType.ax()) * 499784167;
            }
         }
      }

   }

   protected final Model getModel() {
      int var3;
      if (null != this.seqType) {
         int var2 = -1886224337 * Client.ep - this.cycleStart * -287053661;
         if (var2 > 100 && 1363943497 * this.seqType.righthand > 0) {
            var2 = 100;
         }

         if (this.seqType.ao()) {
            var3 = this.seqType.ax();
            this.frame += 499784167 * var2;
            var2 = 0;
            if (1017637335 * this.frame >= var3) {
               this.frame = 499784167 * (var3 - this.seqType.righthand * 1363943497);
               if (1017637335 * this.frame < 0 || 1017637335 * this.frame > var3) {
                  this.seqType = null;
               }
            }
         } else {
            label94: {
               do {
                  do {
                     if (var2 <= this.seqType.frameLengths[this.frame * 1017637335]) {
                        break label94;
                     }

                     var2 -= this.seqType.frameLengths[1017637335 * this.frame];
                     this.frame += 499784167;
                  } while(1017637335 * this.frame < this.seqType.frameIds.length);

                  this.frame -= this.seqType.righthand * -1989000481;
               } while(1017637335 * this.frame >= 0 && 1017637335 * this.frame < this.seqType.frameIds.length);

               this.seqType = null;
            }
         }

         this.cycleStart = -1353577717 * (-1886224337 * Client.ep - var2);
      }

      LocType var13 = fw.getLocType(618580957 * this.id);
      if (var13.multi != null) {
         var13 = var13.multiLoc();
      }

      if (var13 == null) {
         return null;
      } else {
         int var4;
         if (this.orientation * 1904322241 != 1 && 3 != 1904322241 * this.orientation) {
            var3 = -1339930361 * var13.width;
            var4 = var13.length * -1659393955;
         } else {
            var3 = var13.length * -1659393955;
            var4 = -1339930361 * var13.width;
         }

         int var5 = 1815829493 * this.x + (var3 >> 1);
         int var6 = this.x * 1815829493 + (var3 + 1 >> 1);
         int var7 = (var4 >> 1) + this.y * -1893774471;
         int var8 = -1893774471 * this.y + (var4 + 1 >> 1);
         int[][] var9 = Tiles.Tiles_heights[-1674675955 * this.plane];
         int var10 = var9[var5][var8] + var9[var5][var7] + var9[var6][var7] + var9[var6][var8] >> 2;
         int var11 = (var3 << 6) + (this.x * 1815829493 << 7);
         int var12 = (var4 << 6) + (this.y * -1893774471 << 7);
         return var13.getModelDynamic(-373027479 * this.type, this.orientation * 1904322241, var9, var11, var10, var12, this.seqType, 1017637335 * this.frame);
      }
   }

   public static long al_renamed(int var0) {
      if (var0 > 63) {
         throw new ot("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0, (double)var0) - 1L;
      }
   }

   public static int bc_renamed(String var0) {
      return var0.length() + 1;
   }

   static final void chatCommand(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         aj.clientPreferences.au(!aj.clientPreferences.ab());
         if (aj.clientPreferences.ab()) {
            es.an_renamed(99, "", "Roofs are now all hidden");
         } else {
            es.an_renamed(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.startsWith("zbuf")) {
         boolean var2 = PacketBitNode.ac_renamed(var0.substring(5).trim()) == 1;
         ClientScriptFrame.client.ad(var2);
         mz.af_renamed(var2);
      }

      if (var0.equalsIgnoreCase("z")) {
         Client.ex = !Client.ex;
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         aj.clientPreferences.ao();
      }

      if (var0.equalsIgnoreCase("renderself")) {
         Client.md = !Client.md;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         Client.oz = !Client.oz;
      }

      if (324465533 * Client.pu >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            ey.worldMap0.ck = !ey.worldMap0.ck;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            aj.clientPreferences.ay(true);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            aj.clientPreferences.ay(false);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            ng.ht_renamed();
         }
      }

      PacketBitNode var3 = mi.an_renamed(ClientProt.di, Client.packetWriter.au);
      var3.bit.bu(var0.length() + 1);
      var3.bit.bh(var0);
      Client.packetWriter.aw(var3);
   }

   static final int lm_renamed() {
      return Client.menuOptionsCount * 730065501 - 1;
   }

   static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
      if (var0 != MusicPatchNode.localPlayer) {
         if (Client.menuOptionsCount * 730065501 < 400) {
            String var5;
            if (0 == var0.skillLevel * 761215505) {
               var5 = var0.actions[0] + var0.username + var0.actions[1] + Inventory.lu_renamed(var0.combatLevel * 1302967875, MusicPatchNode.localPlayer.combatLevel * 1302967875) + " " + Formatting.Formatting_spaceLeftParenthesis + Strings.Strings_level + 1302967875 * var0.combatLevel + Formatting.Formatting_rightParenthesis + var0.actions[2];
            } else {
               var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + Formatting.Formatting_spaceLeftParenthesis + Strings.Strings_skill + 761215505 * var0.skillLevel + Formatting.Formatting_rightParenthesis + var0.actions[2];
            }

            int var6;
            if (Client.oq * -303899309 == 1) {
               MiniMenuEntry.kz_renamed(Strings.Strings_use, Client.selectedItemName + " " + Formatting.Formatting_rightArrow + " " + oa.colorStartTag(16777215) + var5, 14, var1, var2, var3);
            } else if (Client.om) {
               if ((1457791911 * SecureRandomFuture.oo & 8) == 8) {
                  MiniMenuEntry.kz_renamed(Client.oj, Client.selectedSpellName + " " + Formatting.Formatting_rightArrow + " " + oa.colorStartTag(16777215) + var5, 15, var1, var2, var3);
               }
            } else {
               for(var6 = 7; var6 >= 0; --var6) {
                  if (null != Client.playerMenuActions[var6]) {
                     short var7 = 0;
                     if (Client.playerMenuActions[var6].equalsIgnoreCase(Strings.Strings_attack)) {
                        if (Client.em == dj.ac) {
                           continue;
                        }

                        if (Client.em == dj.an || dj.af == Client.em && var0.combatLevel * 1302967875 > MusicPatchNode.localPlayer.combatLevel * 1302967875) {
                           var7 = 2000;
                        }

                        if (-55850951 * MusicPatchNode.localPlayer.team != 0 && -55850951 * var0.team != 0) {
                           if (var0.team * -55850951 == -55850951 * MusicPatchNode.localPlayer.team) {
                              var7 = 2000;
                           } else {
                              var7 = 0;
                           }
                        } else if (Client.em == dj.au && var0.ag()) {
                           var7 = 2000;
                        }
                     } else if (Client.no[var6]) {
                        var7 = 2000;
                     }

                     boolean var8 = false;
                     int var9 = var7 + Client.playerMenuOpcodes[var6];
                     MiniMenuEntry.kz_renamed(Client.playerMenuActions[var6], oa.colorStartTag(16777215) + var5, var9, var1, var2, var3);
                  }
               }
            }

            for(var6 = 0; var6 < 730065501 * Client.menuOptionsCount; ++var6) {
               if (23 == Client.menuOpcodes[var6]) {
                  Client.menuTargetNames[var6] = oa.colorStartTag(16777215) + var5;
                  break;
               }
            }

         }
      }
   }

   static final void nz_renamed(Component var0, int var1, int var2, int var3) {
      SpriteMask var5 = var0.getSpriteMask(false);
      if (var5 != null) {
         if (Client.tp * 1383336963 < 3) {
            ChatChannel.jb.be(var1, var2, var5.width * 1484188043, 939947663 * var5.height, 25, 25, 704283033 * Client.kf, 256, var5.xStarts, var5.xWidths);
         } else {
            Rasterizer2D.fx(var1, var2, 0, var5.xStarts, var5.xWidths);
         }

      }
   }
}
