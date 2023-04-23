import java.util.concurrent.Future;

public class am {
   static int au;
   static String bc;
   String an;
   Future af;

   am(Future var1) {
      this.af = var1;
   }

   am(String var1) {
      this.af(var1);
   }

   void af(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.an = var1;
      if (this.af != null) {
         this.af.cancel(true);
         this.af = null;
      }

   }

   public final String an() {
      return this.an;
   }

   public boolean aw() {
      return null != this.an || null == this.af;
   }

   public final boolean ac() {
      return this.aw() ? true : this.af.isDone();
   }

   public final aj au() {
      if (this.aw()) {
         return new aj(this.an);
      } else if (!this.ac()) {
         return null;
      } else {
         try {
            return (aj)this.af.get();
         } catch (Exception var4) {
            String var3 = "Error retrieving REST request reply";
            System.err.println(var3 + "\r\n" + var4);
            this.af(var3);
            return new aj(var3);
         }
      }
   }

   public static int aw_renamed(int var0) {
      var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = (var0 >>> 4) + var0 & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   static void an_renamed() {
      for(LocSound var1 = (LocSound)LocSound.objectSounds.last(); var1 != null; var1 = (LocSound)LocSound.objectSounds.previous()) {
         if (var1.obj != null) {
            var1.set();
         }
      }

   }

   public static void an(double var0) {
      al.aw_renamed(var0, 0, 512, -1907908914);
   }

   public static void ao_renamed() {
      int var1 = Rasterizer2D.Rasterizer2D_xClipStart;
      int var2 = Rasterizer2D.Rasterizer2D_yClipStart;
      int var3 = Rasterizer2D.Rasterizer2D_xClipEnd;
      int var4 = Rasterizer2D.Rasterizer2D_yClipEnd;
      Rasterizer3D.ab.ag = (var3 - var1) * 1163083059;
      Rasterizer3D.ab.ah = -508492839 * (var4 - var2);
      Tiles.ax_renamed();
      if (Rasterizer3D.ab.aj.length < Rasterizer3D.ab.ah * -1347859351) {
         Rasterizer3D.ab.aj = new int[co.ab_renamed(Rasterizer3D.ab.ah * -1347859351)];
      }

      int var5 = var1 + Rasterizer2D.Rasterizer2D_width * var2;

      for(int var6 = 0; var6 < Rasterizer3D.ab.ah * -1347859351; ++var6) {
         Rasterizer3D.ab.aj[var6] = var5;
         var5 += Rasterizer2D.Rasterizer2D_width;
      }

   }

   static String aw_renamed() {
      return aj.clientPreferences.al() ? mc.ai_renamed(cz.ca) : cz.ca;
   }

   public static void av_renamed() {
      Component.bx.clear();
      Component.Component_cachedModels.clear();
      Component.Component_cachedFonts.clear();
      Component.bm.clear();
   }

   static int bx_renamed(int var0, ClientScript var1, boolean var2) {
      int var4;
      if (3903 == var0) {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[var4].type();
         return 1;
      } else if (var0 == 3904) {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[var4].id * -300881317;
         return 1;
      } else if (var0 == 3905) {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[var4].unitPrice * -1994102707;
         return 1;
      } else if (var0 == 3906) {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 857042809 * Client.grandExchangeOffers[var4].totalQuantity;
         return 1;
      } else if (var0 == 3907) {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.grandExchangeOffers[var4].currentQuantity * -52036157;
         return 1;
      } else if (var0 == 3908) {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1510761213 * Client.grandExchangeOffers[var4].currentPrice;
         return 1;
      } else {
         int var19;
         if (3910 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            var19 = Client.grandExchangeOffers[var4].status();
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var19 == 0 ? 1 : 0;
            return 1;
         } else if (3911 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            var19 = Client.grandExchangeOffers[var4].status();
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 2 == var19 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            var19 = Client.grandExchangeOffers[var4].status();
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 5 == var19 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            var19 = Client.grandExchangeOffers[var4].status();
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1 == var19 ? 1 : 0;
            return 1;
         } else {
            boolean var17;
            if (3914 == var0) {
               var17 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
               if (oh.grandExchangeEvents != null) {
                  oh.grandExchangeEvents.sort(GrandExchangeEvents.ac, var17);
               }

               return 1;
            } else if (var0 == 3915) {
               var17 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
               if (null != oh.grandExchangeEvents) {
                  oh.grandExchangeEvents.sort(GrandExchangeEvents.aw, var17);
               }

               return 1;
            } else if (3916 == var0) {
               Interpreter.Interpreter_intStackSize -= 854271946;
               var17 = 1 == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
               boolean var18 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] == 1;
               if (oh.grandExchangeEvents != null) {
                  Client.wg.af = var18;
                  oh.grandExchangeEvents.sort(Client.wg, var17);
               }

               return 1;
            } else if (var0 == 3917) {
               var17 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
               if (null != oh.grandExchangeEvents) {
                  oh.grandExchangeEvents.sort(GrandExchangeEvents.an, var17);
               }

               return 1;
            } else if (var0 == 3918) {
               var17 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
               if (oh.grandExchangeEvents != null) {
                  oh.grandExchangeEvents.sort(GrandExchangeEvents.au, var17);
               }

               return 1;
            } else if (3919 == var0) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null == oh.grandExchangeEvents ? 0 : oh.grandExchangeEvents.events.size();
               return 1;
            } else {
               GrandExchangeEvent var5;
               if (3920 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = (GrandExchangeEvent)oh.grandExchangeEvents.events.get(var4);
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.world * -39392873;
                  return 1;
               } else if (3921 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = (GrandExchangeEvent)oh.grandExchangeEvents.events.get(var4);
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.af();
                  return 1;
               } else if (3922 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = (GrandExchangeEvent)oh.grandExchangeEvents.events.get(var4);
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.an();
                  return 1;
               } else if (var0 == 3923) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = (GrandExchangeEvent)oh.grandExchangeEvents.events.get(var4);
                  long var6 = Formatting.af_renamed() - mj.wd * -8156142729726467959L - -2107275097961185091L * var5.an;
                  int var8 = (int)(var6 / 3600000L);
                  int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
                  int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)('\uea60' * var9)) / 1000L);
                  String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var11;
                  return 1;
               } else if (var0 == 3924) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = (GrandExchangeEvent)oh.grandExchangeEvents.events.get(var4);
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.grandExchangeOffer.totalQuantity * 857042809;
                  return 1;
               } else if (var0 == 3925) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = (GrandExchangeEvent)oh.grandExchangeEvents.events.get(var4);
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1994102707 * var5.grandExchangeOffer.unitPrice;
                  return 1;
               } else if (3926 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = (GrandExchangeEvent)oh.grandExchangeEvents.events.get(var4);
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.grandExchangeOffer.id * -300881317;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static final int iz_renamed(int var0) {
      return Math.min(Math.max(var0, 128), 383);
   }

   static final void drawActors2d(int var0, int var1, int var2, int var3) {
      Client.mw += 1160286419;
      if (MusicPatchNode.localPlayer.bx * 1144428983 >> 7 == 1494100363 * Client.te && Client.th * -1748014035 == MusicPatchNode.localPlayer.bo * -411750205 >> 7) {
         Client.te = 0;
      }

      Obj.ix_renamed();
      if (-1565733637 * Client.nl >= 0 && Client.players[-1565733637 * Client.nl] != null) {
         MouseHandler.addPlayerToScene(Client.players[Client.nl * -1565733637], false);
      }

      ia.jc_renamed(true);
      int var5 = ds.ab * -2010934433;
      int[] var6 = ds.aq;

      int var7;
      for(var7 = 0; var7 < var5; ++var7) {
         if (Client.nl * -1565733637 != var6[var7] && Client.localPlayerIndex * -549033243 != var6[var7]) {
            MouseHandler.addPlayerToScene(Client.players[var6[var7]], true);
         }
      }

      ia.jc_renamed(false);
      fa.ji_renamed();
      GraphicsDefaults.jg_renamed();
      bt.setViewportShape(var0, var1, var2, var3, true);
      var0 = -82629945 * Client.vd;
      var1 = Client.vx * 1352043351;
      var2 = 433849721 * Client.viewportWidth;
      var3 = 2042096749 * Client.viewportHeight;
      Rasterizer2D.Rasterizer2D_setClip(var0, var1, var2 + var0, var1 + var3);
      ao_renamed();
      Rasterizer2D.fd();
      var5 = -954734641 * Client.kp;
      if (205350563 * Client.lc / 256 > var5) {
         var5 = Client.lc * 205350563 / 256;
      }

      if (Client.ue[4] && Client.vw[4] + 128 > var5) {
         var5 = Client.vw[4] + 128;
      }

      int var35 = 704283033 * Client.kf & 2047;
      var7 = bz.lg * -1958669353;
      int var8 = Formatting.ls * 470489225;
      int var9 = fw.lf * -365969735;
      int var10 = jm.hv_renamed(var5);
      int var12 = var3 - 334;
      if (var12 < 0) {
         var12 = 0;
      } else if (var12 > 100) {
         var12 = 100;
      }

      int var13 = Client.vl + var12 * (Client.ve - Client.vl) / 100;
      int var11 = var10 * var13 / 256;
      var12 = 2048 - var5 & 2047;
      var13 = 2048 - var35 & 2047;
      int var14 = 0;
      int var15 = 0;
      int var16 = var11;
      int var17;
      int var18;
      int var19;
      if (var12 != 0) {
         var17 = Rasterizer3D.Rasterizer3D_sine[var12];
         var18 = Rasterizer3D.Rasterizer3D_cosine[var12];
         var19 = var18 * var15 - var17 * var11 >> 16;
         var16 = var17 * var15 + var11 * var18 >> 16;
         var15 = var19;
      }

      if (var13 != 0) {
         var17 = Rasterizer3D.Rasterizer3D_sine[var13];
         var18 = Rasterizer3D.Rasterizer3D_cosine[var13];
         var19 = var14 * var18 + var17 * var16 >> 16;
         var16 = var16 * var18 - var17 * var14 >> 16;
         var14 = var19;
      }

      if (Client.uj) {
         ju.uh = (var7 - var14) * -1769642683;
         ds.un = (var8 - var15) * -1412316127;
         IDKType.ur = 1637163077 * (var9 - var16);
         ClientScriptEvent.uw = -268140793 * var5;
         dt.uf = -523744247 * var35;
      } else {
         bt.cameraX = (var7 - var14) * -1682679895;
         gk.cameraY = -424093663 * (var8 - var15);
         ly.cameraZ = 46344275 * (var9 - var16);
         WorldMapSectionType.cameraPitch = var5 * 528729485;
         ek.cameraYaw = var35 * -1545206147;
      }

      if (1 == 986256295 * Client.lv && Client.pu * 324465533 >= 2 && 0 == Client.ep * -1886224337 % 50 && (1144428983 * MusicPatchNode.localPlayer.bx >> 7 != -1958669353 * bz.lg >> 7 || -365969735 * fw.lf >> 7 != -411750205 * MusicPatchNode.localPlayer.bo >> 7)) {
         var17 = MusicPatchNode.localPlayer.ad * -1900490645;
         var18 = -1232093375 * jm.baseX + (bz.lg * -1958669353 >> 7);
         var19 = 827352769 * Scenery.baseY + (fw.lf * -365969735 >> 7);
         PacketBitNode var20 = mi.an_renamed(ClientProt.cq, Client.packetWriter.au);
         var20.bit.p4ME(1263827259 * Client.ly);
         var20.bit.dy(var18);
         var20.bit.dh(var17);
         var20.bit.ds(var19);
         Client.packetWriter.aw(var20);
      }

      if (!Client.uj) {
         var11 = eb.jx_renamed();
      } else {
         if (aj.clientPreferences.ab()) {
            var12 = -1727408401 * GameShell.plane;
         } else {
            var13 = fq.getTileHeight(-2100544359 * bt.cameraX, ly.cameraZ * -91399205, GameShell.plane * -1727408401);
            if (var13 - gk.cameraY * 1772923873 < 800 && 0 != (Tiles.Tiles_renderFlags[-1727408401 * GameShell.plane][-2100544359 * bt.cameraX >> 7][ly.cameraZ * -91399205 >> 7] & 4)) {
               var12 = GameShell.plane * -1727408401;
            } else {
               var12 = 3;
            }
         }

         var11 = var12;
      }

      var12 = -2100544359 * bt.cameraX;
      var13 = 1772923873 * gk.cameraY;
      var14 = -91399205 * ly.cameraZ;
      var15 = WorldMapSectionType.cameraPitch * 1897923909;
      var16 = -1010818347 * ek.cameraYaw;

      for(var17 = 0; var17 < 5; ++var17) {
         if (Client.ue[var17]) {
            var18 = (int)(Math.random() * (double)(Client.vq[var17] * 2 + 1) - (double)Client.vq[var17] + Math.sin((double)Client.vg[var17] * ((double)Client.vf[var17] / 100.0)) * (double)Client.vw[var17]);
            if (var17 == 0) {
               bt.cameraX += -1682679895 * var18;
            }

            if (1 == var17) {
               gk.cameraY += -424093663 * var18;
            }

            if (var17 == 2) {
               ly.cameraZ += 46344275 * var18;
            }

            if (3 == var17) {
               ek.cameraYaw = (ek.cameraYaw * -1010818347 + var18 & 2047) * -1545206147;
            }

            if (4 == var17) {
               WorldMapSectionType.cameraPitch += 528729485 * var18;
               if (1897923909 * WorldMapSectionType.cameraPitch < 128) {
                  WorldMapSectionType.cameraPitch = -1042102656;
               }

               if (1897923909 * WorldMapSectionType.cameraPitch > 383) {
                  WorldMapSectionType.cameraPitch = 639929843;
               }
            }
         }
      }

      var17 = -2063363905 * MouseHandler.ay;
      var18 = -1224153235 * MouseHandler.ao;
      if (0 != MouseHandler.MouseHandler_lastButton * -1222491879) {
         var17 = 2020601481 * MouseHandler.MouseHandler_lastPressedX;
         var18 = 1163896205 * MouseHandler.MouseHandler_lastPressedY;
      }

      if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var1 + var3) {
         var19 = var17 - var0;
         int var36 = var18 - var1;
         ix.an = -580855267 * var19;
         ix.aw = var36 * 1124836073;
         ix.af = true;
         ix.ai = 0;
         ix.ac = false;
      } else {
         fv.ay_renamed();
      }

      mj.hz_renamed();
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
      mj.hz_renamed();
      var19 = eu.at_renamed();
      mz.af_renamed(ClientScriptFrame.client.by);
      Rasterizer3D.ab.ab = Client.viewportZoom * 1241253503;
      bx.scene.draw(-2100544359 * bt.cameraX, 1772923873 * gk.cameraY, -91399205 * ly.cameraZ, 1897923909 * WorldMapSectionType.cameraPitch, ek.cameraYaw * -1010818347, var11);
      mz.af_renamed(false);
      if (Client.ex) {
         Rasterizer2D.fb();
      }

      Rasterizer3D.ab.ab = var19 * 1001249361;
      mj.hz_renamed();
      bx.scene.ag();
      Client.overheadTextCount = 0;
      boolean var37 = false;
      int var21 = -1;
      int var22 = -1;
      int var23 = ds.ab * -2010934433;
      int[] var24 = ds.aq;

      int var25;
      for(var25 = 0; var25 < 265474485 * Client.iw + var23; ++var25) {
         Object var26;
         if (var25 < var23) {
            var26 = Client.players[var24[var25]];
            if (var24[var25] == -1565733637 * Client.nl) {
               var37 = true;
               var21 = var25;
               continue;
            }

            if (MusicPatchNode.localPlayer == var26) {
               var22 = var25;
               continue;
            }
         } else {
            var26 = Client.npcs[Client.iy[var25 - var23]];
         }

         bz.drawActor2d((Actor)var26, var25, var0, var1, var2, var3);
      }

      if (Client.md && -1 != var22) {
         bz.drawActor2d(MusicPatchNode.localPlayer, var22, var0, var1, var2, var3);
      }

      if (var37) {
         bz.drawActor2d(Client.players[-1565733637 * Client.nl], var21, var0, var1, var2, var3);
      }

      for(var25 = 0; var25 < Client.overheadTextCount * 734988573; ++var25) {
         int var38 = Client.lj[var25];
         int var27 = Client.ll[var25];
         int var28 = Client.overheadTextXOffsets[var25];
         int var29 = Client.le[var25];
         boolean var30 = true;

         while(var30) {
            var30 = false;

            for(int var31 = 0; var31 < var25; ++var31) {
               if (var27 + 2 > Client.ll[var31] - Client.le[var31] && var27 - var29 < 2 + Client.ll[var31] && var38 - var28 < Client.overheadTextXOffsets[var31] + Client.lj[var31] && var38 + var28 > Client.lj[var31] - Client.overheadTextXOffsets[var31] && Client.ll[var31] - Client.le[var31] < var27) {
                  var27 = Client.ll[var31] - Client.le[var31];
                  var30 = true;
               }
            }
         }

         Client.mz = -846498395 * Client.lj[var25];
         Client.mu = (Client.ll[var25] = var27) * -1610031701;
         String var39 = Client.lr[var25];
         if (0 == Client.py * 395188193) {
            int var32 = 16776960;
            if (Client.lx[var25] < 6) {
               var32 = Client.sy[Client.lx[var25]];
            }

            if (Client.lx[var25] == 6) {
               var32 = Client.mw * 2041464667 % 20 < 10 ? 16711680 : 16776960;
            }

            if (7 == Client.lx[var25]) {
               var32 = 2041464667 * Client.mw % 20 < 10 ? 255 : '\uffff';
            }

            if (8 == Client.lx[var25]) {
               var32 = Client.mw * 2041464667 % 20 < 10 ? '뀀' : 8454016;
            }

            int var33;
            if (9 == Client.lx[var25]) {
               var33 = 150 - Client.lw[var25];
               if (var33 < 50) {
                  var32 = var33 * 1280 + 16711680;
               } else if (var33 < 100) {
                  var32 = 16776960 - (var33 - 50) * 327680;
               } else if (var33 < 150) {
                  var32 = 5 * (var33 - 100) + '\uff00';
               }
            }

            if (10 == Client.lx[var25]) {
               var33 = 150 - Client.lw[var25];
               if (var33 < 50) {
                  var32 = 5 * var33 + 16711680;
               } else if (var33 < 100) {
                  var32 = 16711935 - (var33 - 50) * 327680;
               } else if (var33 < 150) {
                  var32 = 255 + 327680 * (var33 - 100) - 5 * (var33 - 100);
               }
            }

            if (11 == Client.lx[var25]) {
               var33 = 150 - Client.lw[var25];
               if (var33 < 50) {
                  var32 = 16777215 - var33 * 327685;
               } else if (var33 < 100) {
                  var32 = '\uff00' + 327685 * (var33 - 50);
               } else if (var33 < 150) {
                  var32 = 16777215 - (var33 - 100) * 327680;
               }
            }

            if (0 == Client.lo[var25]) {
               fx.fontBold12.drawCentered(var39, var0 + Client.mz * -1848743379, var1 + 318977283 * Client.mu, var32, 0);
            }

            if (Client.lo[var25] == 1) {
               fx.fontBold12.drawCenteredWave(var39, -1848743379 * Client.mz + var0, Client.mu * 318977283 + var1, var32, 0, Client.mw * 2041464667);
            }

            if (Client.lo[var25] == 2) {
               fx.fontBold12.drawCenteredWave2(var39, -1848743379 * Client.mz + var0, var1 + 318977283 * Client.mu, var32, 0, Client.mw * 2041464667);
            }

            if (Client.lo[var25] == 3) {
               fx.fontBold12.drawCenteredShake(var39, var0 + Client.mz * -1848743379, var1 + 318977283 * Client.mu, var32, 0, 2041464667 * Client.mw, 150 - Client.lw[var25]);
            }

            if (4 == Client.lo[var25]) {
               var33 = (150 - Client.lw[var25]) * (fx.fontBold12.stringWidth(var39) + 100) / 150;
               Rasterizer2D.Rasterizer2D_expandClip(-1848743379 * Client.mz + var0 - 50, var1, var0 + Client.mz * -1848743379 + 50, var3 + var1);
               fx.fontBold12.draw(var39, 50 + var0 + -1848743379 * Client.mz - var33, var1 + Client.mu * 318977283, var32, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var1 + var3);
            }

            if (Client.lo[var25] == 5) {
               var33 = 150 - Client.lw[var25];
               int var34 = 0;
               if (var33 < 25) {
                  var34 = var33 - 25;
               } else if (var33 > 125) {
                  var34 = var33 - 125;
               }

               Rasterizer2D.Rasterizer2D_expandClip(var0, var1 + 318977283 * Client.mu - fx.fontBold12.ascent - 1, var2 + var0, 5 + 318977283 * Client.mu + var1);
               fx.fontBold12.drawCentered(var39, var0 + Client.mz * -1848743379, var1 + 318977283 * Client.mu + var34, var32, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var2 + var0, var3 + var1);
            }
         } else {
            fx.fontBold12.drawCentered(var39, Client.mz * -1848743379 + var0, var1 + 318977283 * Client.mu, 16776960, 0);
         }
      }

      mm.jo_renamed(var0, var1);
      ((TextureProvider)Rasterizer3D.ab.aq).animate(Client.ja * -1795081153);
      Friend.jn_renamed();
      bt.cameraX = -1682679895 * var12;
      gk.cameraY = -424093663 * var13;
      ly.cameraZ = var14 * 46344275;
      WorldMapSectionType.cameraPitch = var15 * 528729485;
      ek.cameraYaw = var16 * -1545206147;
      if (Client.da && hd.au_renamed(true, false) == 0) {
         Client.da = false;
      }

      if (Client.da) {
         Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
         jl.ij_renamed(Strings.Strings_loadingPleaseWait, false);
      }

   }

   static void kh_renamed(int var0, int var1, int var2, int var3) {
      Component var5 = SoundSystem.getComponentChild(var0, var1);
      if (var5 != null && var5.onTargetEnter != null) {
         ClientScriptEvent var6 = new ClientScriptEvent();
         var6.aw = var5;
         var6.args0 = var5.onTargetEnter;
         HeadbarUpdate.af_renamed(var6);
      }

      Client.op = var3 * 35668549;
      Client.om = true;
      jg.ou = var0 * 1511366623;
      Client.oa = -1204907975 * var1;
      SecureRandomFuture.oo = var2 * 1300386839;
      fw.ma_renamed(var5);
   }
}
