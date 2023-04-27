public class DevicePcmPlayerProvider implements PcmPlayerProvider {
   static int gi;
   static Archive archive0;
   static IndexedSprite[] slArrowSprites;

   DevicePcmPlayerProvider() {
   }

   public PcmPlayer player() {
      return new DevicePcmPlayer();
   }

   static void ar_renamed(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      Rasterizer3D.aq.al(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void hs_renamed() {
      int var1;
      if (-627796577 * Client.titleLoadingStage == 0) {
         bx.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

         for(var1 = 0; var1 < 4; ++var1) {
            Client.collisionMaps[var1] = new CollisionMap(104, 104);
         }

         UrlRequester.sceneMinimapSprite = new Sprite(512, 512);
         Login.Login_loadingText = Strings.Strings_startingGameEngine;
         Login.ad = 1084032613;
         Client.titleLoadingStage = 1602846572;
      } else if (20 == Client.titleLoadingStage * -627796577) {
         Login.Login_loadingText = Strings.Strings_preparedVisibilityMap;
         Login.ad = -2126902070;
         Client.titleLoadingStage = -1890697438;
      } else if (Client.titleLoadingStage * -627796577 == 30) {
         archive0 = WorldMapLabelSize.newArchive(0, false, true, true, false);
         ServerBuild.archive1 = WorldMapLabelSize.newArchive(1, false, true, true, false);
         dk.archive2 = WorldMapLabelSize.newArchive(2, true, false, true, false);
         dk.archive3 = WorldMapLabelSize.newArchive(3, false, true, true, false);
         qc.archive4 = WorldMapLabelSize.newArchive(4, false, true, true, false);
         TotalQuantityComparator.archive5 = WorldMapLabelSize.newArchive(5, true, true, true, false);
         pj.archive6 = WorldMapLabelSize.newArchive(6, true, true, true, false);
         FloorUnderlayType.archive7 = WorldMapLabelSize.newArchive(7, false, true, true, false);
         rr.archive8 = WorldMapLabelSize.newArchive(8, false, true, true, false);
         WorldMapLabelSize.archive9 = WorldMapLabelSize.newArchive(9, false, true, true, false);
         NetFileRequest.archive10 = WorldMapLabelSize.newArchive(10, false, true, true, false);
         hc.archive11 = WorldMapLabelSize.newArchive(11, false, true, true, false);
         ey.archive12 = WorldMapLabelSize.newArchive(12, false, true, true, false);
         ei.archive13 = WorldMapLabelSize.newArchive(13, true, false, true, false);
         id.archive14 = WorldMapLabelSize.newArchive(14, false, true, true, false);
         ey.archive15 = WorldMapLabelSize.newArchive(15, false, true, true, false);
         gw.archive16 = WorldMapLabelSize.newArchive(17, true, true, true, false);
         UnitPriceComparator.fu = WorldMapLabelSize.newArchive(18, false, true, true, false);
         bi.ft = WorldMapLabelSize.newArchive(19, false, true, true, false);
         he.gr = WorldMapLabelSize.newArchive(20, false, true, true, false);
         PcmPlayer.gs = WorldMapLabelSize.newArchive(21, false, true, true, true);
         Login.Login_loadingText = Strings.Strings_connectingToUpdateServer;
         Login.ad = 41163156;
         Client.titleLoadingStage = -1089274152;
      } else if (40 != -627796577 * Client.titleLoadingStage) {
         if (-627796577 * Client.titleLoadingStage == 45) {
            boolean var26 = !Client.isLowDetail;
            PcmPlayer.au = -1500814902;
            PcmPlayer.ab = var26;
            UrlRequest.at = 754987022;
            MidiPcmStream var14 = new MidiPcmStream();
            var14.ai(9, 128);
            bi.pcmPlayer0 = fc.newPcmPlayer(Client.taskHandler, 0, 22050);
            bi.pcmPlayer0.aj(var14);
            ParamType.af_renamed(ey.archive15, id.archive14, qc.archive4, var14);
            hd.pcmPlayer1 = fc.newPcmPlayer(Client.taskHandler, 1, 2048);
            fe.pcmStreamMixer = new PcmStreamMixer();
            hd.pcmPlayer1.aj(fe.pcmStreamMixer);
            WorldMapSectionType.decimator = new Decimator(22050, PcmPlayer.au * -1359271235);
            Login.Login_loadingText = Strings.Strings_preparedSoundEngine;
            Login.ad = -1001706301;
            Client.titleLoadingStage = -287850866;
            nv.fonts = new Fonts(rr.archive8, ei.archive13);
         } else if (50 == -627796577 * Client.titleLoadingStage) {
            var1 = FontName.FontName_values().length;
            Client.im = nv.fonts.createMap(FontName.FontName_values());
            if (Client.im.size() < var1) {
               Login.Login_loadingText = Strings.Strings_loadingFonts + Client.im.size() * 100 / var1 + "%";
               Login.ad = 82326312;
            } else {
               Language.fontPlain11 = (Font)Client.im.get(FontName.FontName_plain11);
               WallDecoration.fontPlain12 = (Font)Client.im.get(FontName.FontName_plain12);
               fx.fontBold12 = (Font)Client.im.get(FontName.FontName_bold12);
               UserComparator10.platformInfo = Client.platformInfoProvider.get();
               Login.Login_loadingText = Strings.Strings_loadedFonts;
               Login.ad = 82326312;
               Client.titleLoadingStage = 513572420;
            }
         } else {
            int var4;
            int var5;
            Archive var13;
            if (60 == -627796577 * Client.titleLoadingStage) {
               var13 = NetFileRequest.archive10;
               Archive var16 = rr.archive8;
               var4 = 0;
               String[] var19 = Login.dq;

               int var20;
               String var21;
               for(var20 = 0; var20 < var19.length; ++var20) {
                  var21 = var19[var20];
                  if (var13.tryLoadFileByNames(var21, "")) {
                     ++var4;
                  }
               }

               var19 = Login.dd;

               for(var20 = 0; var20 < var19.length; ++var20) {
                  var21 = var19[var20];
                  if (var16.tryLoadFileByNames(var21, "")) {
                     ++var4;
                  }
               }

               var19 = Login.dj;

               for(var20 = 0; var20 < var19.length; ++var20) {
                  var21 = var19[var20];
                  if (var16.getGroupId(var21) != -1 && var16.tryLoadFileByNames(var21, "")) {
                     ++var4;
                  }
               }

               var5 = OwnWorldComparator.af_renamed(rr.archive8);
               if (var4 < var5) {
                  Login.Login_loadingText = Strings.Strings_loadingTitleScreen + 100 * var4 / var5 + "%";
                  Login.ad = -2044575758;
               } else {
                  Login.Login_loadingText = Strings.Strings_loadedTitleScreen;
                  Login.ad = -2044575758;
                  fd.updateGameState(5);
                  Client.titleLoadingStage = 1314995706;
               }
            } else if (70 == -627796577 * Client.titleLoadingStage) {
               if (!dk.archive2.cc()) {
                  Login.Login_loadingText = Strings.Strings_loadingConfig + dk.archive2.loadPercent() + "%";
                  Login.ad = 123489468;
               } else if (!PcmPlayer.gs.cc()) {
                  Login.Login_loadingText = Strings.Strings_loadingConfig + (80 + ey.archive12.loadPercent() / 6) + "%";
                  Login.ad = 123489468;
               } else {
                  EnumType.af_renamed(dk.archive2);
                  World.af_renamed(dk.archive2);
                  Client.af_renamed(dk.archive2, FloorUnderlayType.archive7);
                  Interpreter.af_renamed(dk.archive2, FloorUnderlayType.archive7, Client.isLowDetail);
                  MiniMenuEntry.af_renamed(dk.archive2, FloorUnderlayType.archive7);
                  dk.af_renamed(dk.archive2);
                  Archive var25 = dk.archive2;
                  var13 = FloorUnderlayType.archive7;
                  boolean var15 = Client.isMembersWorld;
                  Font var17 = Language.fontPlain11;
                  nc.ObjType_archive = var25;
                  ObjType.aq = var13;
                  gm.al = var15;
                  MouseRecorder.at = nc.ObjType_archive.cq(10) * -1255946235;
                  eh.ax = var17;
                  fk.af_renamed(dk.archive2, archive0, ServerBuild.archive1);
                  er.af_renamed(dk.archive2, FloorUnderlayType.archive7);
                  MiniMenuEntry.af_renamed(dk.archive2);
                  Archive var18 = dk.archive2;
                  gz.af = var18;
                  gz.an = gz.af.cq(16) * -805125715;
                  au.af_renamed(dk.archive3, FloorUnderlayType.archive7, rr.archive8, ei.archive13);
                  Npc.af_renamed(dk.archive2);
                  MidiPcmStream.af_renamed(dk.archive2);
                  Archive var6 = dk.archive2;
                  lh.af = var6;
                  Archive var7 = dk.archive2;
                  hc.af_renamed(dk.archive2);
                  ReflectionCheck.af_renamed(dk.archive2);
                  mg.af_renamed(dk.archive2);
                  gg.qm = new su(Client.studioGame, 54, fj.ck, dk.archive2);
                  MiniMenuEntry.qh = new su(Client.studioGame, 47, fj.ck, dk.archive2);
                  oy.varcs = new Varcs();
                  Archive var8 = dk.archive2;
                  Archive var9 = rr.archive8;
                  Archive var10 = ei.archive13;
                  HitmarkType.af = var8;
                  HitmarkType.an = var9;
                  HitmarkType.aw = var10;
                  Archive var11 = dk.archive2;
                  Archive var12 = rr.archive8;
                  HeadbarType.af = var11;
                  HeadbarType.an = var12;
                  bz.af_renamed(dk.archive2, rr.archive8);
                  Login.Login_loadingText = Strings.Strings_loadedConfig;
                  Login.ad = 123489468;
                  Client.titleLoadingStage = 2116418992;
               }
            } else if (Client.titleLoadingStage * -627796577 == 80) {
               var1 = 0;
               if (ChatChannel.jb == null) {
                  ChatChannel.jb = sc.readSprite(rr.archive8, Varcs.spriteIds.compass * -25531251, 0);
               } else {
                  ++var1;
               }

               if (dp.jz == null) {
                  dp.jz = sc.readSprite(rr.archive8, Varcs.spriteIds.mapedge * -740583791, 0);
               } else {
                  ++var1;
               }

               if (null == ml.mapSceneSprites) {
                  ml.mapSceneSprites = cv.af_renamed(rr.archive8, -506869823 * Varcs.spriteIds.mapscene, 0);
               } else {
                  ++var1;
               }

               if (bt.headIconPkSprites == null) {
                  bt.headIconPkSprites = UserComparator3.an_renamed(rr.archive8, Varcs.spriteIds.headiconspk * 84664645, 0);
               } else {
                  ++var1;
               }

               if (null == qj.headIconPrayerSprites) {
                  qj.headIconPrayerSprites = UserComparator3.an_renamed(rr.archive8, Varcs.spriteIds.headiconsprayer * 842447949, 0);
               } else {
                  ++var1;
               }

               if (IDKType.headIconHintSprites == null) {
                  IDKType.headIconHintSprites = UserComparator3.an_renamed(rr.archive8, Varcs.spriteIds.headiconshint * -1721152621, 0);
               } else {
                  ++var1;
               }

               if (null == ds.mapMarkerSprites) {
                  ds.mapMarkerSprites = UserComparator3.an_renamed(rr.archive8, -1343036557 * Varcs.spriteIds.mapmarker, 0);
               } else {
                  ++var1;
               }

               if (gq.crossSprites == null) {
                  gq.crossSprites = UserComparator3.an_renamed(rr.archive8, Varcs.spriteIds.cross * 1146186045, 0);
               } else {
                  ++var1;
               }

               if (sf.mapDotSprites == null) {
                  sf.mapDotSprites = UserComparator3.an_renamed(rr.archive8, Varcs.spriteIds.mapdots * 130583873, 0);
               } else {
                  ++var1;
               }

               if (null == Headbar.scrollBarSprites) {
                  Headbar.scrollBarSprites = cv.af_renamed(rr.archive8, Varcs.spriteIds.scrollbar * 233709739, 0);
               } else {
                  ++var1;
               }

               if (null == bx.modIconSprites) {
                  bx.modIconSprites = cv.af_renamed(rr.archive8, Varcs.spriteIds.modicons * -2142254499, 0);
               } else {
                  ++var1;
               }

               if (var1 < 11) {
                  Login.Login_loadingText = Strings.Strings_loadingSprites + var1 * 100 / 12 + "%";
                  Login.ad = -2003412602;
               } else {
                  AbstractFont.AbstractFont_modIconSprites = bx.modIconSprites;
                  dp.jz.normalize();
                  int var2 = (int)(Math.random() * 21.0) - 10;
                  int var3 = (int)(Math.random() * 21.0) - 10;
                  var4 = (int)(Math.random() * 21.0) - 10;
                  var5 = (int)(Math.random() * 41.0) - 20;
                  ml.mapSceneSprites[0].shiftColors(var5 + var2, var5 + var3, var4 + var5);
                  Login.Login_loadingText = Strings.Strings_loadedSprites;
                  Login.ad = -2003412602;
                  Client.titleLoadingStage = -1377125018;
               }
            } else if (90 == Client.titleLoadingStage * -627796577) {
               if (!WorldMapLabelSize.archive9.cc()) {
                  Login.Login_loadingText = Strings.Strings_loadingTextures + "0%";
                  Login.ad = -1962249446;
               } else {
                  al.textureProvider = new TextureProvider(WorldMapLabelSize.archive9, rr.archive8, 20, aj.clientPreferences.av(), Client.isLowDetail ? 64 : 128);
                  TextureProvider var24 = al.textureProvider;
                  Rasterizer3D.ab.aq = var24;
                  am.an(aj.clientPreferences.av());
                  Client.titleLoadingStage = -575701732;
               }
            } else if (100 == -627796577 * Client.titleLoadingStage) {
               var1 = al.textureProvider.af();
               if (var1 < 100) {
                  Login.Login_loadingText = Strings.Strings_loadingTextures + var1 + "%";
                  Login.ad = -1962249446;
               } else {
                  Login.Login_loadingText = Strings.Strings_loadedTextures;
                  Login.ad = -1962249446;
                  Client.titleLoadingStage = 225721554;
               }
            } else if (Client.titleLoadingStage * -627796577 == 110) {
               UserComparator6.mouseRecorder = new MouseRecorder();
               Client.taskHandler.newThreadTask(UserComparator6.mouseRecorder, 10);
               Login.Login_loadingText = Strings.Strings_loadedInputHandler;
               Login.ad = 1907337436;
               Client.titleLoadingStage = 1027144840;
            } else if (120 == -627796577 * Client.titleLoadingStage) {
               if (!NetFileRequest.archive10.tryLoadFileByNames("huffman", "")) {
                  Login.Login_loadingText = Strings.Strings_loadingWordpack + 0 + "%";
                  Login.ad = 1481957022;
               } else {
                  Huffman var23 = new Huffman(NetFileRequest.archive10.takeFileByNames("huffman", ""));
                  ft.af_renamed(var23);
                  Login.Login_loadingText = Strings.Strings_loadedWordpack;
                  Login.ad = 1481957022;
                  Client.titleLoadingStage = 1828568126;
               }
            } else if (-627796577 * Client.titleLoadingStage == 130) {
               if (!dk.archive3.cc()) {
                  Login.Login_loadingText = Strings.Strings_loadingInterfaces + dk.archive3.loadPercent() * 4 / 5 + "%";
                  Login.ad = 1056576608;
               } else if (!ey.archive12.cc()) {
                  Login.Login_loadingText = Strings.Strings_loadingInterfaces + (80 + ey.archive12.loadPercent() / 6) + "%";
                  Login.ad = 1056576608;
               } else if (!ei.archive13.cc()) {
                  Login.Login_loadingText = Strings.Strings_loadingInterfaces + (96 + ei.archive13.loadPercent() / 50) + "%";
                  Login.ad = 1056576608;
               } else {
                  Login.Login_loadingText = Strings.Strings_loadedInterfaces;
                  Login.ad = 631196194;
                  if (ey.archive12.cv("version.dat", "")) {
                     Packet var22 = new Packet(ey.archive12.takeFileByNames("version.dat", ""));
                     var22.cl();
                  }

                  Client.titleLoadingStage = -1664975884;
               }
            } else if (140 == -627796577 * Client.titleLoadingStage) {
               Login.ad = 205815780;
               if (bi.ft.cm() > 0 && !bi.ft.tryLoadGroupByName(WorldMapCacheName.WorldMapCacheName_details.name)) {
                  Login.Login_loadingText = Strings.Strings_loadingWorldMap + bi.ft.groupLoadPercentByName(WorldMapCacheName.WorldMapCacheName_details.name) / 10 + "%";
               } else {
                  if (ey.worldMap0 == null) {
                     ey.worldMap0 = new WorldMap();
                     ey.worldMap0.init(bi.ft, UnitPriceComparator.fu, he.gr, fx.fontBold12, Client.im, ml.mapSceneSprites);
                  }

                  Login.Login_loadingText = Strings.Strings_loadedWorldMap;
                  Client.titleLoadingStage = -863552598;
               }
            } else if (150 == Client.titleLoadingStage * -627796577) {
               fd.updateGameState(10);
            }
         }
      } else {
         var1 = 0;
         var1 += archive0.an() * 4 / 100;
         var1 += ServerBuild.archive1.an() * 4 / 100;
         var1 += dk.archive2.an() * 2 / 100;
         var1 += dk.archive3.an() * 2 / 100;
         var1 += qc.archive4.an() * 6 / 100;
         var1 += TotalQuantityComparator.archive5.an() * 4 / 100;
         var1 += pj.archive6.an() * 2 / 100;
         var1 += FloorUnderlayType.archive7.an() * 55 / 100;
         var1 += rr.archive8.an() * 2 / 100;
         var1 += WorldMapLabelSize.archive9.an() * 2 / 100;
         var1 += NetFileRequest.archive10.an() * 2 / 100;
         var1 += hc.archive11.an() * 2 / 100;
         var1 += ey.archive12.an() * 2 / 100;
         var1 += ei.archive13.an() * 2 / 100;
         var1 += id.archive14.an() * 2 / 100;
         var1 += ey.archive15.an() * 2 / 100;
         var1 += bi.ft.an() * 1 / 100;
         var1 += UnitPriceComparator.fu.an() * 1 / 100;
         var1 += he.gr.an() * 1 / 100;
         var1 += PcmPlayer.gs.an() * 1 / 100;
         var1 += gw.archive16.af() && gw.archive16.cc() ? 1 : 0;
         if (100 != var1) {
            if (var1 != 0) {
               Login.Login_loadingText = Strings.Strings_checkingForUpdates + var1 + "%";
            }

            Login.ad = -2085738914;
         } else {
            UserComparator5.hx_renamed(archive0, "Animations");
            UserComparator5.hx_renamed(ServerBuild.archive1, "Skeletons");
            UserComparator5.hx_renamed(qc.archive4, "Sound FX");
            UserComparator5.hx_renamed(TotalQuantityComparator.archive5, "Maps");
            UserComparator5.hx_renamed(pj.archive6, "Music Tracks");
            UserComparator5.hx_renamed(FloorUnderlayType.archive7, "Models");
            UserComparator5.hx_renamed(rr.archive8, "Sprites");
            UserComparator5.hx_renamed(hc.archive11, "Music Jingles");
            UserComparator5.hx_renamed(id.archive14, "Music Samples");
            UserComparator5.hx_renamed(ey.archive15, "Music Patches");
            UserComparator5.hx_renamed(bi.ft, "World Map");
            UserComparator5.hx_renamed(UnitPriceComparator.fu, "World Map Geography");
            UserComparator5.hx_renamed(he.gr, "World Map Ground");
            Varcs.spriteIds = new GraphicsDefaults();
            Varcs.spriteIds.decode(gw.archive16);
            Login.Login_loadingText = Strings.Strings_loadedUpdateList;
            Login.ad = -2085738914;
            Client.titleLoadingStage = 1458921139;
         }
      }
   }

   static void oz_renamed(int var0) {
      SeqType var2 = Inventory.getSeqType(var0);
      if (var2.ao()) {
         if (aj.ag_renamed(1238147375 * var2.frameCount) == 2) {
            Client.wz.add(1238147375 * var2.frameCount);
         }

      }
   }
}
