public class Decimator {
   int ac;
   int au;
   int[][] ab;

   public Decimator(int var1, int var2) {
      if (var1 != var2) {
         int var4 = var1;
         int var5 = var2;
         if (var2 > var1) {
            var4 = var2;
            var5 = var1;
         }

         while(var5 != 0) {
            int var6 = var4 % var5;
            var4 = var5;
            var5 = var6;
         }

         var1 /= var4;
         var2 /= var4;
         this.ac = -1129997997 * var1;
         this.au = 1881760051 * var2;
         this.ab = new int[var1][14];

         for(int var7 = 0; var7 < var1; ++var7) {
            int[] var8 = this.ab[var7];
            double var9 = (double)var7 / (double)var1 + 6.0;
            int var11 = (int)Math.floor(var9 - 7.0 + 1.0);
            if (var11 < 0) {
               var11 = 0;
            }

            int var12 = (int)Math.ceil(7.0 + var9);
            if (var12 > 14) {
               var12 = 14;
            }

            for(double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
               double var15 = ((double)var11 - var9) * Math.PI;
               double var17 = var13;
               if (var15 < -1.0E-4 || var15 > 1.0E-4) {
                  var17 = var13 * (Math.sin(var15) / var15);
               }

               var17 *= 0.54 + 0.46 * Math.cos(0.2243994752564138 * ((double)var11 - var9));
               var8[var11] = (int)Math.floor(0.5 + var17 * 65536.0);
            }
         }

      }
   }

   byte[] resample(byte[] var1) {
      if (this.ab != null) {
         int var3 = (int)((long)(this.au * -2101247493) * (long)var1.length / (long)(2021266139 * this.ac)) + 14;
         int[] var4 = new int[var3];
         int var5 = 0;
         int var6 = 0;

         int var7;
         int var8;
         for(var7 = 0; var7 < var1.length; ++var7) {
            var8 = var1[var7];
            int[] var9 = this.ab[var6];

            int var10;
            for(var10 = 0; var10 < 14; ++var10) {
               var4[var5 + var10] += var9[var10] * var8;
            }

            var6 += -2101247493 * this.au;
            var10 = var6 / (2021266139 * this.ac);
            var5 += var10;
            var6 -= var10 * 2021266139 * this.ac;
         }

         var1 = new byte[var3];

         for(var7 = 0; var7 < var3; ++var7) {
            var8 = '耀' + var4[var7] >> 16;
            if (var8 < -128) {
               var1[var7] = -128;
            } else if (var8 > 127) {
               var1[var7] = 127;
            } else {
               var1[var7] = (byte)var8;
            }
         }
      }

      return var1;
   }

   int scaleRate(int var1) {
      if (this.ab != null) {
         var1 = (int)((long)var1 * (long)(this.au * -2101247493) / (long)(this.ac * 2021266139));
      }

      return var1;
   }

   int scalePosition(int var1) {
      if (this.ab != null) {
         var1 = (int)((long)(this.au * -2101247493) * (long)var1 / (long)(this.ac * 2021266139)) + 6;
      }

      return var1;
   }

   public static int an_renamed(int var0) {
      return 255 - (var0 & 255);
   }

   static void ai_renamed(Font var0, Font var1) {
      int var5;
      int var6;
      if (null == st.dr) {
         Archive var4 = rr.fv;
         Rasterizer3D[] var3;
         if (!var4.cv("sl_back", "")) {
            var3 = null;
         } else {
            var5 = var4.getGroupId("sl_back");
            var6 = var4.getFileId(var5, "");
            var3 = eb.an_renamed(var4, var5, var6);
         }

         st.dr = var3;
      }

      if (null == av.dl) {
         av.dl = mz.ac_renamed(rr.fv, "sl_flags", "");
      }

      if (DevicePcmPlayerProvider.dk == null) {
         DevicePcmPlayerProvider.dk = mz.ac_renamed(rr.fv, "sl_arrows", "");
      }

      if (World.dt == null) {
         World.dt = mz.ac_renamed(rr.fv, "sl_stars", "");
      }

      if (PlayerType.dz == null) {
         PlayerType.dz = MusicPatchNode2.au_renamed(rr.fv, "leftarrow", "");
      }

      if (ai.dg == null) {
         ai.dg = MusicPatchNode2.au_renamed(rr.fv, "rightarrow", "");
      }

      Rasterizer2D.Rasterizer2D_fillRectangle(cz.aw * 578342931, 23, 765, 480, 0);
      Rasterizer2D.ew_renamed(578342931 * cz.aw, 0, 125, 23, 12425273, 9135624);
      Rasterizer2D.ew_renamed(125 + cz.aw * 578342931, 0, 640, 23, 5197647, 2697513);
      var0.drawCentered(Strings.mo, cz.aw * 578342931 + 62, 15, 0, -1);
      if (null != World.dt) {
         World.dt[1].aw(cz.aw * 578342931 + 140, 1);
         var1.draw(Strings.mn, 578342931 * cz.aw + 152, 10, 16777215, -1);
         World.dt[0].aw(cz.aw * 578342931 + 140, 12);
         var1.draw(Strings.mi, 152 + cz.aw * 578342931, 21, 16777215, -1);
      }

      if (DevicePcmPlayerProvider.dk != null) {
         int var23 = 578342931 * cz.aw + 280;
         if (World.at[0] == 0 && World.al[0] == 0) {
            DevicePcmPlayerProvider.dk[2].aw(var23, 4);
         } else {
            DevicePcmPlayerProvider.dk[0].aw(var23, 4);
         }

         if (World.at[0] == 0 && 1 == World.al[0]) {
            DevicePcmPlayerProvider.dk[3].aw(15 + var23, 4);
         } else {
            DevicePcmPlayerProvider.dk[1].aw(var23 + 15, 4);
         }

         var0.draw(Strings.md, 32 + var23, 17, 16777215, -1);
         int var25 = cz.aw * 578342931 + 390;
         if (1 == World.at[0] && 0 == World.al[0]) {
            DevicePcmPlayerProvider.dk[2].aw(var25, 4);
         } else {
            DevicePcmPlayerProvider.dk[0].aw(var25, 4);
         }

         if (World.at[0] == 1 && 1 == World.al[0]) {
            DevicePcmPlayerProvider.dk[3].aw(15 + var25, 4);
         } else {
            DevicePcmPlayerProvider.dk[1].aw(var25 + 15, 4);
         }

         var0.draw(Strings.mr, 32 + var25, 17, 16777215, -1);
         var5 = cz.aw * 578342931 + 500;
         if (2 == World.at[0] && 0 == World.al[0]) {
            DevicePcmPlayerProvider.dk[2].aw(var5, 4);
         } else {
            DevicePcmPlayerProvider.dk[0].aw(var5, 4);
         }

         if (World.at[0] == 2 && World.al[0] == 1) {
            DevicePcmPlayerProvider.dk[3].aw(var5 + 15, 4);
         } else {
            DevicePcmPlayerProvider.dk[1].aw(15 + var5, 4);
         }

         var0.draw(Strings.ml, 32 + var5, 17, 16777215, -1);
         var6 = cz.aw * 578342931 + 610;
         if (World.at[0] == 3 && World.al[0] == 0) {
            DevicePcmPlayerProvider.dk[2].aw(var6, 4);
         } else {
            DevicePcmPlayerProvider.dk[0].aw(var6, 4);
         }

         if (3 == World.at[0] && 1 == World.al[0]) {
            DevicePcmPlayerProvider.dk[3].aw(15 + var6, 4);
         } else {
            DevicePcmPlayerProvider.dk[1].aw(var6 + 15, 4);
         }

         var0.draw(Strings.mf, var6 + 32, 17, 16777215, -1);
      }

      Rasterizer2D.Rasterizer2D_fillRectangle(cz.aw * 578342931 + 708, 4, 50, 16, 0);
      var1.drawCentered(Strings.jl, 25 + 708 + cz.aw * 578342931, 16, 16777215, -1);
      cz.de = 848889613;
      if (st.dr != null) {
         byte var24 = 88;
         byte var26 = 19;
         var5 = 765 / (var24 + 1) - 1;
         var6 = 480 / (1 + var26);

         int var7;
         int var8;
         do {
            var7 = var6;
            var8 = var5;
            if (var6 * (var5 - 1) >= -734287707 * World.ab) {
               --var5;
            }

            if (var5 * (var6 - 1) >= -734287707 * World.ab) {
               --var6;
            }

            if ((var6 - 1) * var5 >= World.ab * -734287707) {
               --var6;
            }
         } while(var6 != var7 || var8 != var5);

         var7 = (765 - var24 * var5) / (var5 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         var8 = (480 - var6 * var26) / (var6 + 1);
         if (var8 > 5) {
            var8 = 5;
         }

         int var9 = (765 - var24 * var5 - var7 * (var5 - 1)) / 2;
         int var10 = (480 - var26 * var6 - var8 * (var6 - 1)) / 2;
         int var11 = (-734287707 * World.ab + var6 - 1) / var6;
         cz.dp = (var11 - var5) * 1853447421;
         if (PlayerType.dz != null && cz.dh * 1246310743 > 0) {
            PlayerType.dz.aw(8, kd.ak * 1658005443 / 2 - PlayerType.dz.ac / 2);
         }

         if (ai.dg != null && 1246310743 * cz.dh < cz.dp * 1959698517) {
            ai.dg.aw(GameShell.aj * -1687260435 - ai.dg.aw - 8, 1658005443 * kd.ak / 2 - ai.dg.ac / 2);
         }

         int var12 = var10 + 23;
         int var13 = cz.aw * 578342931 + var9;
         int var14 = 0;
         boolean var15 = false;
         int var16 = 1246310743 * cz.dh;

         int var17;
         for(var17 = var6 * var16; var17 < World.ab * -734287707 && var16 - 1246310743 * cz.dh < var5; ++var17) {
            World var18 = bx.au[var17];
            boolean var19 = true;
            String var20 = Integer.toString(-1396846889 * var18.ax);
            if (-1 == -1396846889 * var18.ax) {
               var20 = Strings.my;
               var19 = false;
            } else if (var18.ax * -1396846889 > 1980) {
               var20 = Strings.mk;
               var19 = false;
            }

            da var21 = null;
            int var22 = 0;
            if (var18.ag()) {
               var21 = var18.at() ? da.al : da.aq;
            } else if (var18.aa()) {
               var21 = var18.at() ? da.ah : da.ag;
            } else if (var18.ai()) {
               var22 = 16711680;
               var21 = var18.at() ? da.ab : da.au;
            } else if (var18.ah()) {
               var21 = var18.at() ? da.aa : da.at;
            } else if (var18.ao()) {
               var21 = var18.at() ? da.ac : da.aw;
            } else if (var18.av()) {
               var21 = var18.at() ? da.ao : da.ay;
            } else if (var18.ar()) {
               var21 = var18.at() ? da.ai : da.ax;
            }

            if (null == var21 || var21.av * 1140778173 >= st.dr.length) {
               var21 = var18.at() ? da.an : da.af;
            }

            if (MouseHandler.ay * -2063363905 >= var13 && MouseHandler.ao * -1224153235 >= var12 && -2063363905 * MouseHandler.ay < var13 + var24 && MouseHandler.ao * -1224153235 < var26 + var12 && var19) {
               cz.de = var17 * -848889613;
               st.dr[1140778173 * var21.av].av(var13, var12, 128, 16777215);
               var15 = true;
            } else {
               st.dr[1140778173 * var21.av].ay(var13, var12);
            }

            if (null != av.dl) {
               av.dl[(var18.at() ? 8 : 0) + var18.ah * -665846519].aw(var13 + 29, var12);
            }

            var0.drawCentered(Integer.toString(-2091224171 * var18.ay), 15 + var13, 5 + var26 / 2 + var12, var22, -1);
            var1.drawCentered(var20, var13 + 60, 5 + var26 / 2 + var12, 268435455, -1);
            var12 += var8 + var26;
            ++var14;
            if (var14 >= var6) {
               var12 = 23 + var10;
               var13 += var24 + var7;
               var14 = 0;
               ++var16;
            }
         }

         if (var15) {
            var17 = var1.stringWidth(bx.au[cz.de * 248569915].ag) + 6;
            int var27 = 8 + var1.al;
            int var28 = MouseHandler.ao * -1224153235 + 25;
            if (var27 + var28 > 480) {
               var28 = -1224153235 * MouseHandler.ao - 25 - var27;
            }

            Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.ay * -2063363905 - var17 / 2, var28, var17, var27, 16777120);
            Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.ay * -2063363905 - var17 / 2, var28, var17, var27, 0);
            var1.drawCentered(bx.au[cz.de * 248569915].ag, -2063363905 * MouseHandler.ay, 4 + var1.al + var28, 0, -1);
         }
      }

      ia.bn.drawFull(0, 0);
   }

   static void ir_renamed(int var0) {
      Client.rj = 0L;
      if (var0 >= 2) {
         Client.ro = true;
      } else {
         Client.ro = false;
      }

      if (na.iv_renamed() == 1) {
         ClientScriptFrame.bc.setMaxCanvasSize(765, 503);
      } else {
         ClientScriptFrame.bc.setMaxCanvasSize(7680, 2160);
      }

      if (-1275976559 * Client.dw >= 25) {
         an.io_renamed();
      }

   }

   static final void jr_renamed(int var0, int var1, boolean var2) {
      if (!var2 || 1717695041 * bi.ji != var0 || 583188571 * qj.jg != var1) {
         bi.ji = 1006050753 * var0;
         qj.jg = var1 * -193171501;
         fd.hi_renamed(25);
         jl.ij_renamed(Strings.ao, true);
         int var4 = jm.ib * -1232093375;
         int var5 = 827352769 * Scenery.jc;
         jm.ib = (var0 - 6) * -102332920;
         Scenery.jc = 1527335432 * (var1 - 6);
         int var6 = jm.ib * -1232093375 - var4;
         int var7 = Scenery.jc * 827352769 - var5;
         var4 = jm.ib * -1232093375;
         var5 = Scenery.jc * 827352769;

         int var8;
         int var10;
         int[] var10000;
         for(var8 = 0; var8 < 65536; ++var8) {
            Npc var9 = Client.iu[var8];
            if (null != var9) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var9.dy;
                  var10000[var10] -= var6;
                  var10000 = var9.ds;
                  var10000[var10] -= var7;
               }

               var9.bx -= var6 * -1102445696;
               var9.bo -= var7 * -1887439488;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            Player var20 = Client.mc[var8];
            if (var20 != null) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var20.dy;
                  var10000[var10] -= var6;
                  var10000 = var20.ds;
                  var10000[var10] -= var7;
               }

               var20.bx -= -1102445696 * var6;
               var20.bo -= -1887439488 * var7;
            }
         }

         byte var19 = 0;
         byte var21 = 104;
         byte var22 = 1;
         if (var6 < 0) {
            var19 = 103;
            var21 = -1;
            var22 = -1;
         }

         byte var11 = 0;
         byte var12 = 104;
         byte var13 = 1;
         if (var7 < 0) {
            var11 = 103;
            var12 = -1;
            var13 = -1;
         }

         int var15;
         for(int var14 = var19; var21 != var14; var14 += var22) {
            for(var15 = var11; var15 != var12; var15 += var13) {
               int var16 = var6 + var14;
               int var17 = var15 + var7;

               for(int var18 = 0; var18 < 4; ++var18) {
                  if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                     Client.nr[var18][var14][var15] = Client.nr[var18][var16][var17];
                  } else {
                     Client.nr[var18][var14][var15] = null;
                  }
               }
            }
         }

         for(dg var23 = (dg)Client.nn.last(); var23 != null; var23 = (dg)Client.nn.previous()) {
            var23.aw -= var6 * -1524387603;
            var23.ac -= var7 * -1930509111;
            if (var23.aw * 68300005 < 0 || 800888185 * var23.ac < 0 || var23.aw * 68300005 >= 104 || 800888185 * var23.ac >= 104) {
               var23.remove();
            }
         }

         if (1494100363 * Client.te != 0) {
            Client.te -= var6 * -1970850269;
            Client.th -= 875414437 * var7;
         }

         Client.tl = 0;
         Client.uj = false;
         bt.kx -= (var6 << 7) * -1682679895;
         ly.ke -= 46344275 * (var7 << 7);
         bz.lg -= (var6 << 7) * 1293848551;
         fw.lf -= (var7 << 7) * 892004233;
         Client.sp = 1715437485;
         Client.np.af();
         Client.na.af();

         for(var15 = 0; var15 < 4; ++var15) {
            Client.jr[var15].clear();
         }

      }
   }

   static final void kq_renamed(Player var0, int var1, int var2, iu var3) {
      int var5 = var0.dy[0];
      int var6 = var0.ds[0];
      int var7 = var0.transformedSize();
      if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7) {
         if (var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
            int var10 = var0.transformedSize();
            Client.xr.af = -1369677151 * var1;
            Client.xr.an = -2066887785 * var2;
            Client.xr.aw = -2134236799;
            Client.xr.ac = -1188140267;
            cm var11 = Client.xr;
            int var12 = fw.af_renamed(var5, var6, var10, var11, Client.jr[-1900490645 * var0.ad], true, Client.xm, Client.xn);
            if (var12 >= 1) {
               for(int var13 = 0; var13 < var12 - 1; ++var13) {
                  var0.am(Client.xm[var13], Client.xn[var13], var3);
               }

            }
         }
      }
   }
}
