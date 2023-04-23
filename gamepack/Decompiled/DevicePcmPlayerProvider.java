public class DevicePcmPlayerProvider implements PcmPlayerProvider {
   static int gi;
   static Archive archive0;
   static IndexedSprite[] dk;

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
      if (-627796577 * Client.fi == 0) {
         bx.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

         for(var1 = 0; var1 < 4; ++var1) {
            Client.collisionMaps[var1] = new CollisionMap(104, 104);
         }

         UrlRequester.tk = new Sprite(512, 512);
         cz.Login_loadingText = Strings.Strings_startingGameEngine;
         cz.ad = 1084032613;
         Client.fi = 1602846572;
      } else if (20 == Client.fi * -627796577) {
         cz.Login_loadingText = Strings.Strings_preparedVisibilityMap;
         cz.ad = -2126902070;
         Client.fi = -1890697438;
      } else if (Client.fi * -627796577 == 30) {
         archive0 = WorldMapLabelSize.newArchive(0, false, true, true, false);
         ServerBuild.archive1 = WorldMapLabelSize.newArchive(1, false, true, true, false);
         dk.archive2 = WorldMapLabelSize.newArchive(2, true, false, true, false);
         dk.archive3 = WorldMapLabelSize.newArchive(3, false, true, true, false);
         qc.archive4 = WorldMapLabelSize.newArchive(4, false, true, true, false);
         nn.archive5 = WorldMapLabelSize.newArchive(5, true, true, true, false);
         pj.archive6 = WorldMapLabelSize.newArchive(6, true, true, true, false);
         FloorUnderlayType.fr = WorldMapLabelSize.newArchive(7, false, true, true, false);
         rr.archive7 = WorldMapLabelSize.newArchive(8, false, true, true, false);
         WorldMapLabelSize.archive8 = WorldMapLabelSize.newArchive(9, false, true, true, false);
         NetFileRequest.archive9 = WorldMapLabelSize.newArchive(10, false, true, true, false);
         hc.archive10 = WorldMapLabelSize.newArchive(11, false, true, true, false);
         ey.archive16 = WorldMapLabelSize.newArchive(12, false, true, true, false);
         ei.fg = WorldMapLabelSize.newArchive(13, true, false, true, false);
         id.archive15 = WorldMapLabelSize.newArchive(14, false, true, true, false);
         ey.fm = WorldMapLabelSize.newArchive(15, false, true, true, false);
         gw.go = WorldMapLabelSize.newArchive(17, true, true, true, false);
         nt.archive11 = WorldMapLabelSize.newArchive(18, false, true, true, false);
         bi.archive12 = WorldMapLabelSize.newArchive(19, false, true, true, false);
         he.archive13 = WorldMapLabelSize.newArchive(20, false, true, true, false);
         PcmPlayer.archive14 = WorldMapLabelSize.newArchive(21, false, true, true, true);
         cz.Login_loadingText = Strings.Strings_connectingToUpdateServer;
         cz.ad = 41163156;
         Client.fi = -1089274152;
      } else if (40 != -627796577 * Client.fi) {
         if (-627796577 * Client.fi == 45) {
            boolean var26 = !Client.cu;
            PcmPlayer.au = -1500814902;
            PcmPlayer.ab = var26;
            UrlRequest.at = 754987022;
            MidiPcmStream var14 = new MidiPcmStream();
            var14.ai(9, 128);
            bi.pcmPlayer0 = fc.newPcmPlayer(Client.taskHandler, 0, 22050);
            bi.pcmPlayer0.aj(var14);
            ParamType.af_renamed(ey.fm, id.archive15, qc.archive4, var14);
            hd.pcmPlayer1 = fc.newPcmPlayer(Client.taskHandler, 1, 2048);
            fe.pcmStreamMixer = new PcmStreamMixer();
            hd.pcmPlayer1.aj(fe.pcmStreamMixer);
            WorldMapSectionType.decimator = new Decimator(22050, PcmPlayer.au * -1359271235);
            cz.Login_loadingText = Strings.Strings_preparedSoundEngine;
            cz.ad = -1001706301;
            Client.fi = -287850866;
            nv.fonts = new Fonts(rr.archive7, ei.fg);
         } else if (50 == -627796577 * Client.fi) {
            var1 = FontName.FontName_values().length;
            Client.im = nv.fonts.createMap(FontName.FontName_values());
            if (Client.im.size() < var1) {
               cz.Login_loadingText = Strings.Strings_loadingFonts + Client.im.size() * 100 / var1 + "%";
               cz.ad = 82326312;
            } else {
               Language.fontPlain11 = (Font)Client.im.get(FontName.FontName_plain11);
               WallDecoration.fontPlain12 = (Font)Client.im.get(FontName.FontName_plain12);
               fx.fontBold12 = (Font)Client.im.get(FontName.FontName_bold12);
               en.platformInfo = Client.platformInfoProvider.get();
               cz.Login_loadingText = Strings.Strings_loadedFonts;
               cz.ad = 82326312;
               Client.fi = 513572420;
            }
         } else {
            int var4;
            int var5;
            Archive var13;
            if (60 == -627796577 * Client.fi) {
               var13 = NetFileRequest.archive9;
               Archive var16 = rr.archive7;
               var4 = 0;
               String[] var19 = cz.dq;

               int var20;
               String var21;
               for(var20 = 0; var20 < var19.length; ++var20) {
                  var21 = var19[var20];
                  if (var13.tryLoadFileByNames(var21, "")) {
                     ++var4;
                  }
               }

               var19 = cz.dd;

               for(var20 = 0; var20 < var19.length; ++var20) {
                  var21 = var19[var20];
                  if (var16.tryLoadFileByNames(var21, "")) {
                     ++var4;
                  }
               }

               var19 = cz.dj;

               for(var20 = 0; var20 < var19.length; ++var20) {
                  var21 = var19[var20];
                  if (var16.getGroupId(var21) != -1 && var16.tryLoadFileByNames(var21, "")) {
                     ++var4;
                  }
               }

               var5 = cf.af_renamed(rr.archive7);
               if (var4 < var5) {
                  cz.Login_loadingText = Strings.Strings_loadingTitleScreen + 100 * var4 / var5 + "%";
                  cz.ad = -2044575758;
               } else {
                  cz.Login_loadingText = Strings.Strings_loadedTitleScreen;
                  cz.ad = -2044575758;
                  fd.hi_renamed(5);
                  Client.fi = 1314995706;
               }
            } else if (70 == -627796577 * Client.fi) {
               if (!dk.archive2.cc()) {
                  cz.Login_loadingText = Strings.Strings_loadingConfig + dk.archive2.loadPercent() + "%";
                  cz.ad = 123489468;
               } else if (!PcmPlayer.archive14.cc()) {
                  cz.Login_loadingText = Strings.Strings_loadingConfig + (80 + ey.archive16.loadPercent() / 6) + "%";
                  cz.ad = 123489468;
               } else {
                  EnumType.af_renamed(dk.archive2);
                  World.af_renamed(dk.archive2);
                  Client.af_renamed(dk.archive2, FloorUnderlayType.fr);
                  Interpreter.af_renamed(dk.archive2, FloorUnderlayType.fr, Client.cu);
                  MiniMenuEntry.af_renamed(dk.archive2, FloorUnderlayType.fr);
                  dk.af_renamed(dk.archive2);
                  Archive var25 = dk.archive2;
                  var13 = FloorUnderlayType.fr;
                  boolean var15 = Client.ca;
                  Font var17 = Language.fontPlain11;
                  nc.ObjType_archive = var25;
                  ObjType.aq = var13;
                  gm.al = var15;
                  MouseRecorder.at = nc.ObjType_archive.cq(10) * -1255946235;
                  eh.ax = var17;
                  fk.af_renamed(dk.archive2, archive0, ServerBuild.archive1);
                  er.af_renamed(dk.archive2, FloorUnderlayType.fr);
                  MiniMenuEntry.af_renamed(dk.archive2);
                  Archive var18 = dk.archive2;
                  gz.af = var18;
                  gz.an = gz.af.cq(16) * -805125715;
                  au.af_renamed(dk.archive3, FloorUnderlayType.fr, rr.archive7, ei.fg);
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
                  Archive var9 = rr.archive7;
                  Archive var10 = ei.fg;
                  HitmarkType.af = var8;
                  HitmarkType.an = var9;
                  HitmarkType.aw = var10;
                  Archive var11 = dk.archive2;
                  Archive var12 = rr.archive7;
                  HeadbarType.af = var11;
                  HeadbarType.an = var12;
                  bz.af_renamed(dk.archive2, rr.archive7);
                  cz.Login_loadingText = Strings.Strings_loadedConfig;
                  cz.ad = 123489468;
                  Client.fi = 2116418992;
               }
            } else if (Client.fi * -627796577 == 80) {
               var1 = 0;
               if (ChatChannel.jb == null) {
                  ChatChannel.jb = sc.aw_renamed(rr.archive7, Varcs.spriteIds.compass * -25531251, 0);
               } else {
                  ++var1;
               }

               if (dp.jz == null) {
                  dp.jz = sc.aw_renamed(rr.archive7, Varcs.spriteIds.mapedge * -740583791, 0);
               } else {
                  ++var1;
               }

               if (null == ml.ju) {
                  ml.ju = cv.af_renamed(rr.archive7, -506869823 * Varcs.spriteIds.mapscene, 0);
               } else {
                  ++var1;
               }

               if (bt.jl == null) {
                  bt.jl = eb.an_renamed(rr.archive7, Varcs.spriteIds.headiconspk * 84664645, 0);
               } else {
                  ++var1;
               }

               if (null == qj.kc) {
                  qj.kc = eb.an_renamed(rr.archive7, Varcs.spriteIds.headiconsprayer * 842447949, 0);
               } else {
                  ++var1;
               }

               if (IDKType.ku == null) {
                  IDKType.ku = eb.an_renamed(rr.archive7, Varcs.spriteIds.headiconshint * -1721152621, 0);
               } else {
                  ++var1;
               }

               if (null == ds.kd) {
                  ds.kd = eb.an_renamed(rr.archive7, -1343036557 * Varcs.spriteIds.mapmarker, 0);
               } else {
                  ++var1;
               }

               if (gq.kb == null) {
                  gq.kb = eb.an_renamed(rr.archive7, Varcs.spriteIds.cross * 1146186045, 0);
               } else {
                  ++var1;
               }

               if (sf.kt == null) {
                  sf.kt = eb.an_renamed(rr.archive7, Varcs.spriteIds.mapdots * 130583873, 0);
               } else {
                  ++var1;
               }

               if (null == Headbar.ka) {
                  Headbar.ka = cv.af_renamed(rr.archive7, Varcs.spriteIds.scrollbar * 233709739, 0);
               } else {
                  ++var1;
               }

               if (null == bx.kg) {
                  bx.kg = cv.af_renamed(rr.archive7, Varcs.spriteIds.modicons * -2142254499, 0);
               } else {
                  ++var1;
               }

               if (var1 < 11) {
                  cz.Login_loadingText = Strings.Strings_loadingSprites + var1 * 100 / 12 + "%";
                  cz.ad = -2003412602;
               } else {
                  AbstractFont.AbstractFont_modIconSprites = bx.kg;
                  dp.jz.normalize();
                  int var2 = (int)(Math.random() * 21.0) - 10;
                  int var3 = (int)(Math.random() * 21.0) - 10;
                  var4 = (int)(Math.random() * 21.0) - 10;
                  var5 = (int)(Math.random() * 41.0) - 20;
                  ml.ju[0].shiftColors(var5 + var2, var5 + var3, var4 + var5);
                  cz.Login_loadingText = Strings.Strings_loadedSprites;
                  cz.ad = -2003412602;
                  Client.fi = -1377125018;
               }
            } else if (90 == Client.fi * -627796577) {
               if (!WorldMapLabelSize.archive8.cc()) {
                  cz.Login_loadingText = Strings.Strings_loadingTextures + "0%";
                  cz.ad = -1962249446;
               } else {
                  al.textureProvider = new TextureProvider(WorldMapLabelSize.archive8, rr.archive7, 20, aj.clientPreferences.av(), Client.cu ? 64 : 128);
                  TextureProvider var24 = al.textureProvider;
                  Rasterizer3D.ab.aq = var24;
                  am.an(aj.clientPreferences.av());
                  Client.fi = -575701732;
               }
            } else if (100 == -627796577 * Client.fi) {
               var1 = al.textureProvider.af();
               if (var1 < 100) {
                  cz.Login_loadingText = Strings.Strings_loadingTextures + var1 + "%";
                  cz.ad = -1962249446;
               } else {
                  cz.Login_loadingText = Strings.Strings_loadedTextures;
                  cz.ad = -1962249446;
                  Client.fi = 225721554;
               }
            } else if (Client.fi * -627796577 == 110) {
               eg.mouseRecorder = new MouseRecorder();
               Client.taskHandler.newThreadTask(eg.mouseRecorder, 10);
               cz.Login_loadingText = Strings.Strings_loadedInputHandler;
               cz.ad = 1907337436;
               Client.fi = 1027144840;
            } else if (120 == -627796577 * Client.fi) {
               if (!NetFileRequest.archive9.tryLoadFileByNames("huffman", "")) {
                  cz.Login_loadingText = Strings.Strings_loadingWordpack + 0 + "%";
                  cz.ad = 1481957022;
               } else {
                  Huffman var23 = new Huffman(NetFileRequest.archive9.takeFileByNames("huffman", ""));
                  ft.af_renamed(var23);
                  cz.Login_loadingText = Strings.Strings_loadedWordpack;
                  cz.ad = 1481957022;
                  Client.fi = 1828568126;
               }
            } else if (-627796577 * Client.fi == 130) {
               if (!dk.archive3.cc()) {
                  cz.Login_loadingText = Strings.Strings_loadingInterfaces + dk.archive3.loadPercent() * 4 / 5 + "%";
                  cz.ad = 1056576608;
               } else if (!ey.archive16.cc()) {
                  cz.Login_loadingText = Strings.Strings_loadingInterfaces + (80 + ey.archive16.loadPercent() / 6) + "%";
                  cz.ad = 1056576608;
               } else if (!ei.fg.cc()) {
                  cz.Login_loadingText = Strings.Strings_loadingInterfaces + (96 + ei.fg.loadPercent() / 50) + "%";
                  cz.ad = 1056576608;
               } else {
                  cz.Login_loadingText = Strings.Strings_loadedInterfaces;
                  cz.ad = 631196194;
                  if (ey.archive16.cv("version.dat", "")) {
                     Packet var22 = new Packet(ey.archive16.takeFileByNames("version.dat", ""));
                     var22.cl();
                  }

                  Client.fi = -1664975884;
               }
            } else if (140 == -627796577 * Client.fi) {
               cz.ad = 205815780;
               if (bi.archive12.cm() > 0 && !bi.archive12.tryLoadGroupByName(WorldMapCacheName.WorldMapCacheName_details.name)) {
                  cz.Login_loadingText = Strings.Strings_loadingWorldMap + bi.archive12.groupLoadPercentByName(WorldMapCacheName.WorldMapCacheName_details.name) / 10 + "%";
               } else {
                  if (ey.worldMap0 == null) {
                     ey.worldMap0 = new WorldMap();
                     ey.worldMap0.init(bi.archive12, nt.archive11, he.archive13, fx.fontBold12, Client.im, ml.ju);
                  }

                  cz.Login_loadingText = Strings.Strings_loadedWorldMap;
                  Client.fi = -863552598;
               }
            } else if (150 == Client.fi * -627796577) {
               fd.hi_renamed(10);
            }
         }
      } else {
         var1 = 0;
         var1 += archive0.an() * 4 / 100;
         var1 += ServerBuild.archive1.an() * 4 / 100;
         var1 += dk.archive2.an() * 2 / 100;
         var1 += dk.archive3.an() * 2 / 100;
         var1 += qc.archive4.an() * 6 / 100;
         var1 += nn.archive5.an() * 4 / 100;
         var1 += pj.archive6.an() * 2 / 100;
         var1 += FloorUnderlayType.fr.an() * 55 / 100;
         var1 += rr.archive7.an() * 2 / 100;
         var1 += WorldMapLabelSize.archive8.an() * 2 / 100;
         var1 += NetFileRequest.archive9.an() * 2 / 100;
         var1 += hc.archive10.an() * 2 / 100;
         var1 += ey.archive16.an() * 2 / 100;
         var1 += ei.fg.an() * 2 / 100;
         var1 += id.archive15.an() * 2 / 100;
         var1 += ey.fm.an() * 2 / 100;
         var1 += bi.archive12.an() * 1 / 100;
         var1 += nt.archive11.an() * 1 / 100;
         var1 += he.archive13.an() * 1 / 100;
         var1 += PcmPlayer.archive14.an() * 1 / 100;
         var1 += gw.go.af() && gw.go.cc() ? 1 : 0;
         if (100 != var1) {
            if (var1 != 0) {
               cz.Login_loadingText = Strings.Strings_checkingForUpdates + var1 + "%";
            }

            cz.ad = -2085738914;
         } else {
            es.hx_renamed(archive0, "Animations");
            es.hx_renamed(ServerBuild.archive1, "Skeletons");
            es.hx_renamed(qc.archive4, "Sound FX");
            es.hx_renamed(nn.archive5, "Maps");
            es.hx_renamed(pj.archive6, "Music Tracks");
            es.hx_renamed(FloorUnderlayType.fr, "Models");
            es.hx_renamed(rr.archive7, "Sprites");
            es.hx_renamed(hc.archive10, "Music Jingles");
            es.hx_renamed(id.archive15, "Music Samples");
            es.hx_renamed(ey.fm, "Music Patches");
            es.hx_renamed(bi.archive12, "World Map");
            es.hx_renamed(nt.archive11, "World Map Geography");
            es.hx_renamed(he.archive13, "World Map Ground");
            Varcs.spriteIds = new GraphicsDefaults();
            Varcs.spriteIds.decode(gw.go);
            cz.Login_loadingText = Strings.Strings_loadedUpdateList;
            cz.ad = -2085738914;
            Client.fi = 1458921139;
         }
      }
   }

   static void oz_renamed(int var0) {
      SeqType var2 = Inventory.getSeqType(var0, (byte)13);
      if (var2.ao()) {
         if (aj.ag_renamed(1238147375 * var2.righthand) == 2) {
            Client.wz.add(1238147375 * var2.righthand);
         }

      }
   }
}
