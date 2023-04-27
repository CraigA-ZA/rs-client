public final class Player extends Actor {
   boolean isUnanimated;
   boolean isHidden;
   boolean bi;
   int tileHeight;
   int headIconPk = -1162421511;
   int plane;
   int index;
   int ag;
   int tileHeight2;
   int team;
   int combatLevel;
   int am;
   int animationCycleEnd;
   int ar;
   int as;
   int skillLevel;
   int headIconPrayer = 914676177;
   int av;
   int ax;
   int animationCycleStart;
   int tileX;
   int tileY;
   Model model0;
   String[] actions = new String[3];
   PlayerAppearance appearance;
   TriBool ap;
   TriBool bb;
   TriBool by;
   Username username;

   static int af_renamed(int var0, int var1) {
      Inventory var3 = (Inventory)Inventory.itemContainers.get((long)var0);
      if (var3 == null) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var3.ids.length ? var3.ids[var1] : -1;
      }
   }

   Player() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.actions[var1] = "";
      }

      this.combatLevel = 0;
      this.skillLevel = 0;
      this.animationCycleStart = 0;
      this.animationCycleEnd = 0;
      this.isUnanimated = false;
      this.team = 0;
      this.isHidden = false;
      this.ap = TriBool.TriBool_unknown;
      this.by = TriBool.TriBool_unknown;
      this.bb = TriBool.TriBool_unknown;
      this.bi = false;
   }

   final void read(Packet var1) {
      var1.index = 0;
      int var3 = var1.g1();
      boolean var4 = true;
      this.headIconPk = var1.g1s() * 1162421511;
      this.headIconPrayer = var1.g1s() * -914676177;
      int var5 = -1;
      this.team = 0;
      int[] var6 = new int[12];

      int var8;
      int var9;
      int var10;
      for(int var7 = 0; var7 < 12; ++var7) {
         var8 = var1.g1();
         if (var8 == 0) {
            var6[var7] = 0;
         } else {
            var9 = var1.g1();
            var6[var7] = var9 + (var8 << 8);
            if (0 == var7 && 65535 == var6[0]) {
               var5 = var1.cl();
               break;
            }

            if (var6[var7] >= 512) {
               var10 = HeadbarUpdate.getObjType(var6[var7] - 512).placeholderlink * -919846075;
               if (0 != var10) {
                  this.team = -248928759 * var10;
               }
            }
         }
      }

      int[] var15 = null;
      if (-1931866699 * Client.cx >= 213) {
         var15 = new int[12];

         for(var8 = 0; var8 < 12; ++var8) {
            var9 = var1.g1();
            if (var9 == 0) {
               var15[var8] = 0;
            } else {
               var10 = var1.g1();
               var15[var8] = (var9 << 8) + var10;
            }
         }
      }

      int[] var16 = new int[5];

      for(var9 = 0; var9 < 5; ++var9) {
         var10 = var1.g1();
         if (var10 < 0 || var10 >= PlayerAppearance.ao[var9].length) {
            var10 = 0;
         }

         var16[var9] = var10;
      }

      this.readySequence = var1.cl() * 1196796229;
      if (65535 == this.readySequence * 1590591885) {
         this.readySequence = -1196796229;
      }

      this.turnLeftSequence = var1.cl() * -767436785;
      if (65535 == this.turnLeftSequence * 1319769839) {
         this.turnLeftSequence = 767436785;
      }

      this.turnRightSequence = this.turnLeftSequence * 980575951;
      this.walkSequence = var1.cl() * 1672510249;
      if (this.walkSequence * 736907545 == 65535) {
         this.walkSequence = -1672510249;
      }

      this.walkBackSequence = var1.cl() * -1683505383;
      if (65535 == 1648569641 * this.walkBackSequence) {
         this.walkBackSequence = 1683505383;
      }

      this.walkLeftSequence = var1.cl() * 497469823;
      if (-127994241 * this.walkLeftSequence == 65535) {
         this.walkLeftSequence = -497469823;
      }

      this.walkRightSequence = var1.cl() * 1927855919;
      if (65535 == this.walkRightSequence * -1059657777) {
         this.walkRightSequence = -1927855919;
      }

      this.runSequence = var1.cl() * 140602839;
      if (1939789287 * this.runSequence == 65535) {
         this.runSequence = -140602839;
      }

      this.username = new Username(var1.cw(), co.loginType);
      this.ac();
      this.ay();
      this.ai();
      if (MusicPatchNode.localPlayer == this) {
         ClientError.localPlayerName = this.username.name();
      }

      this.combatLevel = var1.g1() * 225691243;
      this.skillLevel = var1.cl() * 1353643761;
      this.isHidden = var1.g1() == 1;
      if (Client.cs * -1274626977 == 0 && Client.staffModLevel * 324465533 >= 2) {
         this.isHidden = false;
      }

      gx[] var17 = null;
      boolean var18 = false;
      int var11 = var1.cl();
      var18 = (var11 >> 15 & 1) == 1;
      int var12;
      if (var11 > 0 && 32768 != var11) {
         var17 = new gx[12];

         for(var12 = 0; var12 < 12; ++var12) {
            int var13 = var11 >> 12 - var12 & 1;
            if (1 == var13) {
               var17[var12] = Projectile.af_renamed(var6[var12] - 512, var1);
            }
         }
      }

      for(var12 = 0; var12 < 3; ++var12) {
         this.actions[var12] = var1.cw();
      }

      int var14 = var1.g1();
      if (this.appearance == null) {
         this.appearance = new PlayerAppearance();
      }

      this.appearance.af(var15, var6, var17, var18, var16, var3, var5, var14);
   }

   boolean aw() {
      if (this.ap == TriBool.TriBool_unknown) {
         this.at();
      }

      return this.ap == TriBool.TriBool_true;
   }

   void ac() {
      this.ap = TriBool.TriBool_unknown;
   }

   void at() {
      this.ap = World.friendSystem.am(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   boolean aa() {
      if (TriBool.TriBool_unknown == this.by) {
         this.ao();
      }

      return this.by == TriBool.TriBool_true;
   }

   void ay() {
      this.by = TriBool.TriBool_unknown;
   }

   void ao() {
      this.by = UserComparator5.clanChat != null && UserComparator5.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   void ax() {
      for(int var2 = 0; var2 < 4; ++var2) {
         if (Client.sg[var2] != null && Client.sg[var2].aw(this.username.name()) != -1 && 2 != var2) {
            this.bb = TriBool.TriBool_true;
            return;
         }
      }

      this.bb = TriBool.TriBool_false;
   }

   void ai() {
      this.bb = TriBool.TriBool_unknown;
   }

   boolean ag() {
      if (this.bb == TriBool.TriBool_unknown) {
         this.ax();
      }

      return this.bb == TriBool.TriBool_true;
   }

   int transformedSize() {
      return this.appearance != null && -1 != -2131733097 * this.appearance.ab ? AbstractArchive.getNPCType(-2131733097 * this.appearance.ab).size * 1458410691 : 1;
   }

   protected final Model getModel() {
      if (this.appearance == null) {
         return null;
      } else {
         SeqType var2 = this.ct * -1372355773 != -1 && 0 == this.dm * 1253892101 ? Inventory.getSeqType(this.ct * -1372355773) : null;
         SeqType var3 = -1 == this.spotAnimationFrame * -1302441815 || this.isUnanimated || this.spotAnimationFrame * -1302441815 == this.readySequence * 1590591885 && var2 != null ? null : Inventory.getSeqType(this.spotAnimationFrame * -1302441815);
         Model var4 = this.appearance.getModel(var2, -41215169 * this.cp, var3, 424813829 * this.spotAnimationFrameCycle);
         if (var4 == null) {
            return null;
         } else {
            var4.calculateBoundsCylinder();
            this.de = 2070391287 * var4.height;
            int var5 = var4.indicesCount;
            if (!this.isUnanimated) {
               var4 = this.cp(var4);
            }

            if (!this.isUnanimated && this.model0 != null) {
               if (Client.ep * -1886224337 >= this.animationCycleEnd * -935505685) {
                  this.model0 = null;
               }

               if (-1886224337 * Client.ep >= -1402262375 * this.animationCycleStart && -1886224337 * Client.ep < -935505685 * this.animationCycleEnd) {
                  Model var6 = this.model0;
                  var6.offset(this.ax * 1793688517 - 1144428983 * this.bx, this.tileHeight2 * 1238902143 - 561204023 * this.tileHeight, 240546619 * this.ag - -411750205 * this.bo);
                  if (this.dd * -1751341433 == 512) {
                     var6.rotateY90Ccw();
                     var6.rotateY90Ccw();
                     var6.rotateY90Ccw();
                  } else if (1024 == -1751341433 * this.dd) {
                     var6.rotateY90Ccw();
                     var6.rotateY90Ccw();
                  } else if (1536 == -1751341433 * this.dd) {
                     var6.rotateY90Ccw();
                  }

                  Model[] var7 = new Model[]{var4, var6};
                  var4 = new Model(var7, 2);
                  if (this.dd * -1751341433 == 512) {
                     var6.rotateY90Ccw();
                  } else if (1024 == this.dd * -1751341433) {
                     var6.rotateY90Ccw();
                     var6.rotateY90Ccw();
                  } else if (-1751341433 * this.dd == 1536) {
                     var6.rotateY90Ccw();
                     var6.rotateY90Ccw();
                     var6.rotateY90Ccw();
                  }

                  var6.offset(this.bx * 1144428983 - 1793688517 * this.ax, 561204023 * this.tileHeight - this.tileHeight2 * 1238902143, -411750205 * this.bo - this.ag * 240546619);
               }
            }

            var4.isSingleTile = true;
            if (this.dq != 0 && Client.ep * -1886224337 >= this.dh * 1182789041 && Client.ep * -1886224337 < 707232483 * this.dp) {
               var4.cj = this.du;
               var4.ch = this.db;
               var4.ct = this.df;
               var4.cp = this.dq;
               var4.cd = (short)var5;
            } else {
               var4.cp = 0;
            }

            return var4;
         }
      }
   }

   final void av(int var1, int var2, MoveSpeed var3) {
      if (this.ct * -1372355773 != -1 && Inventory.getSeqType(-1372355773 * this.ct).bi * 1957040329 == 1) {
         this.ct = 1690721941;
      }

      this.cd();
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (this.pathX[0] >= 0 && this.pathX[0] < 104 && this.pathY[0] >= 0 && this.pathY[0] < 104) {
            if (MoveSpeed.run == var3) {
               Decimator.kq_renamed(this, var1, var2, MoveSpeed.run);
            }

            this.am(var1, var2, var3);
         } else {
            this.resetPath(var1, var2);
         }
      } else {
         this.resetPath(var1, var2);
      }

   }

   void resetPath(int var1, int var2) {
      this.dn = 0;
      this.eo = 0;
      this.pathLength = 0;
      this.pathX[0] = var1;
      this.pathY[0] = var2;
      int var4 = this.transformedSize();
      this.bx = -1102445696 * this.pathX[0] + -551222848 * var4;
      this.bo = var4 * -943719744 + -1887439488 * this.pathY[0];
   }

   static void au_renamed() {
      if (ax.an) {
         Login.au = null;
         lu.ab = null;
         py.runeSprites = null;
         ex.at = null;
         ParamType.aa = null;
         Canvas.ay = null;
         fc.titleMuteSprites = null;
         Login.ax = null;
         gs.ag = null;
         st.dr = null;
         av.slFlagSprites = null;
         DevicePcmPlayerProvider.slArrowSprites = null;
         World.slStarSprites = null;
         mv.dv = null;
         em.av.an();
         ly.au = -626822165;
         ly.ab = null;
         oq.aq = 1643562499;
         gz.al = -1823837761;
         dn.at = 0;
         ev.musicTrackBoolean = false;
         ga.aa = 440964570;
         gn.an_renamed(true);
         ax.an = false;
      }
   }

   final void am(int var1, int var2, MoveSpeed var3) {
      if (this.dn * 1134756167 < 9) {
         this.dn += 400971895;
      }

      for(int var5 = 1134756167 * this.dn; var5 > 0; --var5) {
         this.pathX[var5] = this.pathX[var5 - 1];
         this.pathY[var5] = this.pathY[var5 - 1];
         this.pathTraversed[var5] = this.pathTraversed[var5 - 1];
      }

      this.pathX[0] = var1;
      this.pathY[0] = var2;
      this.pathTraversed[0] = var3;
   }

   final boolean isVisible() {
      return this.appearance != null;
   }
}
