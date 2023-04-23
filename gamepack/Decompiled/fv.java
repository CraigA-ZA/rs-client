public class fv extends fb {
   static AbstractArchive bk;
   boolean af;
   byte ac;
   byte an;
   byte au;
   byte aw;
   // $FF: synthetic field
   final fa this$0;

   public static ServerBuild af_renamed(int var0) {
      ServerBuild[] var2 = new ServerBuild[]{ServerBuild.af, ServerBuild.an, ServerBuild.aw, ServerBuild.ac};
      ServerBuild[] var3 = var2;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         ServerBuild var5 = var3[var4];
         if (var0 == var5.id * -978256915) {
            return var5;
         }
      }

      return null;
   }

   public static int aw_renamed(int var0) {
      return (var0 & 265217111 * sc.aw) - 1;
   }

   public static final void ay_renamed() {
      ix.af = false;
      ix.ai = 0;
   }

   fv(fa var1) {
      this.this$0 = var1;
   }

   void write(Packet var1) {
      this.af = var1.g1() == 1;
      this.an = var1.g1s();
      this.aw = var1.g1s();
      this.ac = var1.g1s();
      this.au = var1.g1s();
   }

   void an(fj var1) {
      var1.al = this.af;
      var1.at = this.an;
      var1.aa = this.aw;
      var1.ay = this.ac;
      var1.ao = this.au;
   }

   static final void kb_renamed(boolean var0, PacketBit var1) {
      Client.mb = 0;
      Client.ig = 0;
      bk.kt_renamed(var1);
      ObjStack.ka_renamed(var0, var1);

      int var3;
      int var4;
      for(var3 = 0; var3 < Client.ig * 606834121; ++var3) {
         var4 = Client.ih[var3];
         Npc var5 = Client.npcs[var4];
         int var6 = var1.g1();
         int var7;
         if (0 != (var6 & 128)) {
            var7 = var1.g1();
            var6 += var7 << 8;
         }

         if (0 != (var6 & 256)) {
            var7 = var1.g1();
            var6 += var7 << 16;
         }

         int var8;
         int var9;
         if (0 != (var6 & 64)) {
            var7 = var1.cl();
            if (var7 == 65535) {
               var7 = -1;
            }

            var8 = var1.db();
            if (-1372355773 * var5.ct == var7 && -1 != var7) {
               var9 = Inventory.getSeqType(var7, (byte)5).be * 789159225;
               if (var9 == 1) {
                  var5.cp = 0;
                  var5.sequenceFrame = 0;
                  var5.dm = -401806131 * var8;
                  var5.dw = 0;
               }

               if (2 == var9) {
                  var5.dw = 0;
               }
            } else if (var7 == -1 || -1372355773 * var5.ct == -1 || Inventory.getSeqType(var7, (byte)116).frameCount * -1932560049 >= Inventory.getSeqType(-1372355773 * var5.ct, (byte)2).frameCount * -1932560049) {
               var5.ct = -1690721941 * var7;
               var5.cp = 0;
               var5.sequenceFrame = 0;
               var5.dm = -401806131 * var8;
               var5.dw = 0;
               var5.eo = -1718989897 * var5.dn;
            }
         }

         if ((var6 & 32) != 0) {
            var5.sequenceFrameCycle = var1.cl() * 1052277865;
            var5.sequenceFrameCycle += (var1.db() << 16) * 1052277865;
            var7 = 16777215;
            if (var7 == 1005900761 * var5.sequenceFrameCycle) {
               var5.sequenceFrameCycle = -1052277865;
            }
         }

         if (0 != (var6 & 2)) {
            var5.overheadText = var1.cw();
            var5.movementSequence = -1924554444;
         }

         int var10;
         int var11;
         int var12;
         if (0 != (var6 & 4)) {
            var7 = var1.g1();
            int var13;
            if (var7 > 0) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var10 = -1;
                  var11 = -1;
                  var12 = -1;
                  var9 = var1.cd();
                  if (var9 == 32767) {
                     var9 = var1.cd();
                     var11 = var1.cd();
                     var10 = var1.cd();
                     var12 = var1.cd();
                  } else if (32766 != var9) {
                     var11 = var1.cd();
                  } else {
                     var9 = -1;
                  }

                  var13 = var1.cd();
                  var5.addHitmark(var9, var11, var10, var12, -1886224337 * Client.ep, var13);
               }
            }

            var8 = var1.g1n();
            if (var8 > 0) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var1.cd();
                  var11 = var1.cd();
                  if (var11 != 32767) {
                     var12 = var1.cd();
                     var13 = var1.g1();
                     int var14 = var11 > 0 ? var1.g1n() : var13;
                     var5.addHeadbar(var10, -1886224337 * Client.ep, var11, var12, var13, var14);
                  } else {
                     var5.removeHeadbar(var10);
                  }
               }
            }
         }

         if (0 != (var6 & 8)) {
            var5.af = AbstractArchive.an_renamed(var1.eo());
            fa.kg_renamed(var5);
            var5.ah();
         }

         if ((var6 & 1) != 0) {
            var7 = var1.cl();
            var8 = var1.en();
            var5.cj(0, var7, var8 >> 16, var8 & '\uffff');
         }

         if (0 != (var6 & 16)) {
            var7 = var1.ep();
            var8 = var1.ep();
            var5.co = var1.db() == 1;
            if (-1931866699 * Client.cx >= 212) {
               var5.cv = -1213206377 * var7;
               var5.spotAnimation = var8 * 1388623137;
            } else {
               var9 = 1144428983 * var5.bx - (var7 - -1232093375 * jm.ib - jm.ib * -1232093375) * 64;
               var10 = -411750205 * var5.bo - (var8 - Scenery.jc * 827352769 - 827352769 * Scenery.jc) * 64;
               if (0 != var9 || var10 != 0) {
                  var12 = (int)(Math.atan2((double)var9, (double)var10) * 325.94932345220167) & 2047;
                  var5.size = -1409690365 * var12;
               }
            }
         }

         if (0 != (var6 & 16384)) {
            var5.di = var1.g1s() * -278393391;
            var5.dl = var1.dj() * -1448856093;
            var5.dr = var1.dj() * 242410523;
            var5.dk = var1.dj() * 2106434927;
            var5.dt = (var1.ep() + -1886224337 * Client.ep) * -608537751;
            var5.dv = (var1.da() + -1886224337 * Client.ep) * -2100738849;
            var5.dz = var1.eo() * -698990457;
            var5.dn = 400971895;
            var5.eo = 0;
            var5.di += var5.pathX[0] * -278393391;
            var5.dl += -1448856093 * var5.pathY[0];
            var5.dr += var5.pathX[0] * 242410523;
            var5.dk += 2106434927 * var5.pathY[0];
         }

         if ((var6 & '耀') != 0) {
            var5.eq = var1.g4s() * 1392091407;
         }

         if ((var6 & 2048) != 0) {
            var5.dh = (Client.ep * -1886224337 + var1.da()) * -887211183;
            var5.sequenceDelay = (Client.ep * -1886224337 + var1.cl()) * -368061749;
            var5.du = var1.dd();
            var5.db = var1.dj();
            var5.df = var1.dx();
            var5.dq = (byte)var1.dq();
         }

         if (0 != (var6 & 512)) {
            var5.af(var1.cw());
         }

         if ((var6 & 8192) != 0) {
            var5.advance(var1.g1());
         }

         int[] var15;
         short[] var16;
         short[] var17;
         long var18;
         boolean var19;
         if (0 != (var6 & 4096)) {
            var7 = var1.dq();
            if ((var7 & 1) == 1) {
               var5.aj();
            } else {
               var15 = null;
               if (2 == (var7 & 2)) {
                  var9 = var1.dq();
                  var15 = new int[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var1.cl();
                     var11 = var11 == 65535 ? -1 : var11;
                     var15[var10] = var11;
                  }
               }

               var16 = null;
               if ((var7 & 4) == 4) {
                  var10 = 0;
                  if (var5.af.by != null) {
                     var10 = var5.af.by.length;
                  }

                  var16 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var16[var11] = (short)var1.da();
                  }
               }

               var17 = null;
               if ((var7 & 8) == 8) {
                  var11 = 0;
                  if (var5.af.bi != null) {
                     var11 = var5.af.bi.length;
                  }

                  var17 = new short[var11];

                  for(var12 = 0; var12 < var11; ++var12) {
                     var17[var12] = (short)var1.ep();
                  }
               }

               var19 = false;
               if ((var7 & 16) != 0) {
                  var19 = var1.g1() == 1;
               }

               var18 = (long)((Npc.aa += -1963015503) * 413681233 - 1);
               var5.av(new hv(var18, var15, var16, var17, var19));
            }
         }

         if (0 != (var6 & 1024)) {
            var7 = var1.db();
            if ((var7 & 1) == 1) {
               var5.ak();
            } else {
               var15 = null;
               if ((var7 & 2) == 2) {
                  var9 = var1.db();
                  var15 = new int[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var1.eo();
                     var11 = var11 == 65535 ? -1 : var11;
                     var15[var10] = var11;
                  }
               }

               var16 = null;
               if (4 == (var7 & 4)) {
                  var10 = 0;
                  if (null != var5.af.by) {
                     var10 = var5.af.by.length;
                  }

                  var16 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var16[var11] = (short)var1.da();
                  }
               }

               var17 = null;
               if ((var7 & 8) == 8) {
                  var11 = 0;
                  if (var5.af.bi != null) {
                     var11 = var5.af.bi.length;
                  }

                  var17 = new short[var11];

                  for(var12 = 0; var12 < var11; ++var12) {
                     var17[var12] = (short)var1.eo();
                  }
               }

               var19 = false;
               if (0 != (var7 & 16)) {
                  var19 = var1.g1() == 1;
               }

               var18 = (long)((Npc.al += -1714612375) * -1770985255 - 1);
               var5.am(new hv(var18, var15, var16, var17, var19));
            }
         }

         if ((var6 & 131072) != 0) {
            var7 = var1.dq();
            var15 = new int[8];
            var16 = new short[8];

            for(var10 = 0; var10 < 8; ++var10) {
               if ((var7 & 1 << var10) != 0) {
                  var15[var10] = var1.gSmart2or4();
                  var16[var10] = (short)var1.dm();
               } else {
                  var15[var10] = -1;
                  var16[var10] = -1;
               }
            }

            var5.ag(var15, var16);
         }

         if (0 != (var6 & 262144)) {
            var7 = var1.g4s();
            var5.bj = ((var7 & 1) != 0 ? var1.cl() : -2117504177 * var5.af.ao) * -767436785;
            var5.sequence = (0 != (var7 & 2) ? var1.cl() : var5.af.ax * 1635935495) * -603869663;
            var5.readySequence = (0 != (var7 & 4) ? var1.eo() : var5.af.ai * 849832979) * 1672510249;
            var5.walkLeftSequence = (0 != (var7 & 8) ? var1.cl() : var5.af.ag * 606174455) * -1683505383;
            var5.bg = ((var7 & 16) != 0 ? var1.cl() : 429445119 * var5.af.ah) * 497469823;
            var5.walkRightSequence = (0 != (var7 & 32) ? var1.cl() : var5.af.av * -1237616413) * 1927855919;
            var5.runSequence = ((var7 & 64) != 0 ? var1.cl() : -1565402875 * var5.af.ar) * 140602839;
            var5.overheadTextCyclesRemaining = ((var7 & 128) != 0 ? var1.da() : var5.af.am * 1434909561) * -1320156809;
            var5.npcCycle = (0 != (var7 & 256) ? var1.da() : -1171795391 * var5.af.as) * 725472713;
            var5.bv = (0 != (var7 & 512) ? var1.da() : var5.af.aj * 1924156607) * -1530081757;
            var5.turnRightSequence = (0 != (var7 & 1024) ? var1.cl() : -1186532489 * var5.af.ak) * -1035736995;
            var5.bp = ((var7 & 2048) != 0 ? var1.cl() : var5.af.az * 1456216629) * -1110395975;
            var5.targetIndex = ((var7 & 4096) != 0 ? var1.ep() : var5.af.ad * -750567499) * -2025717011;
            var5.movementFrameCycle = ((var7 & 8192) != 0 ? var1.eo() : var5.af.ae * 1520351037) * -919918425;
            var5.turnLeftSequence = ((var7 & 16384) != 0 ? var1.ep() : var5.af.ay * 1235033537) * 1196796229;
         }

         if ((var6 & 65536) != 0) {
            var7 = var1.db();

            for(var8 = 0; var8 < var7; ++var8) {
               var9 = var1.dq();
               var10 = var1.eo();
               var11 = var1.en();
               var5.cj(var9, var10, var11 >> 16, var11 & '\uffff');
            }
         }
      }

      for(var3 = 0; var3 < 216061641 * Client.mb; ++var3) {
         var4 = Client.nz[var3];
         if (Client.ep * -1886224337 != Client.npcs[var4].dg * -523202873) {
            Client.npcs[var4].af = null;
            Client.npcs[var4] = null;
         }
      }

      if (-1633313603 * var1.index != Client.packetWriter.al * 889658999) {
         throw new RuntimeException(var1.index * -1633313603 + Formatting.Formatting_comma + 889658999 * Client.packetWriter.al);
      } else {
         for(var3 = 0; var3 < 265474485 * Client.iw; ++var3) {
            if (Client.npcs[Client.iy[var3]] == null) {
               throw new RuntimeException(var3 + Formatting.Formatting_comma + Client.iw * 265474485);
            }
         }

      }
   }
}
