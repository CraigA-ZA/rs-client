public class DevicePcmPlayerProvider implements PcmPlayerProvider {
   static int gi;
   static Archive fd;
   static IndexedSprite[] dk;

   DevicePcmPlayerProvider() {
   }

   public PcmPlayer player() {
      return new DevicePcmPlayer();
   }

   static void ar_renamed(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      in.aq.al(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void hs_renamed() {
      int var1;
      if (-627796577 * Client.fi == 0) {
         bx.js = new Scene(4, 104, 104, Tiles.af);

         for(var1 = 0; var1 < 4; ++var1) {
            Client.jr[var1] = new CollisionMap(104, 104);
         }

         UrlRequester.tk = new Rasterizer3D(512, 512);
         cz.ae = Strings.ag;
         cz.ad = 1084032613;
         Client.fi = 1602846572;
      } else if (20 == Client.fi * -627796577) {
         cz.ae = Strings.ah;
         cz.ad = -2126902070;
         Client.fi = -1890697438;
      } else if (Client.fi * -627796577 == 30) {
         fd = WorldMapLabelSize.newArchive(0, false, true, true, false);
         ServerBuild.fb = WorldMapLabelSize.newArchive(1, false, true, true, false);
         dk.fn = WorldMapLabelSize.newArchive(2, true, false, true, false);
         dk.fz = WorldMapLabelSize.newArchive(3, false, true, true, false);
         qc.fa = WorldMapLabelSize.newArchive(4, false, true, true, false);
         nn.fy = WorldMapLabelSize.newArchive(5, true, true, true, false);
         pj.fw = WorldMapLabelSize.newArchive(6, true, true, true, false);
         FloorUnderlayType.fr = WorldMapLabelSize.newArchive(7, false, true, true, false);
         rr.fv = WorldMapLabelSize.newArchive(8, false, true, true, false);
         WorldMapLabelSize.fq = WorldMapLabelSize.newArchive(9, false, true, true, false);
         NetFileRequest.fc = WorldMapLabelSize.newArchive(10, false, true, true, false);
         hc.ff = WorldMapLabelSize.newArchive(11, false, true, true, false);
         ey.fj = WorldMapLabelSize.newArchive(12, false, true, true, false);
         ei.fg = WorldMapLabelSize.newArchive(13, true, false, true, false);
         id.fk = WorldMapLabelSize.newArchive(14, false, true, true, false);
         ey.fm = WorldMapLabelSize.newArchive(15, false, true, true, false);
         gw.go = WorldMapLabelSize.newArchive(17, true, true, true, false);
         nt.fu = WorldMapLabelSize.newArchive(18, false, true, true, false);
         bi.ft = WorldMapLabelSize.newArchive(19, false, true, true, false);
         he.gr = WorldMapLabelSize.newArchive(20, false, true, true, false);
         PcmPlayer.gs = WorldMapLabelSize.newArchive(21, false, true, true, true);
         cz.ae = Strings.av;
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
            bi.to = fc.newPcmPlayer(Client.af, 0, 22050);
            bi.to.aj(var14);
            ParamType.af_renamed(ey.fm, id.fk, qc.fa, var14);
            hd.tt = fc.newPcmPlayer(Client.af, 1, 2048);
            fe.td = new PcmStreamMixer();
            hd.tt.aj(fe.td);
            WorldMapSectionType.tj = new Decimator(22050, PcmPlayer.au * -1359271235);
            cz.ae = Strings.as;
            cz.ad = -1001706301;
            Client.fi = -287850866;
            nv.iv = new Fonts(rr.fv, ei.fg);
         } else if (50 == -627796577 * Client.fi) {
            var1 = FontName.FontName_values().length;
            Client.im = nv.iv.createMap(FontName.FontName_values());
            if (Client.im.size() < var1) {
               cz.ae = Strings.aj + Client.im.size() * 100 / var1 + "%";
               cz.ad = 82326312;
            } else {
               Language.ir = (Font)Client.im.get(FontName.af);
               WallDecoration.io = (Font)Client.im.get(FontName.an);
               fx.ip = (Font)Client.im.get(FontName.aw);
               en.vz = Client.vc.get();
               cz.ae = Strings.ak;
               cz.ad = 82326312;
               Client.fi = 513572420;
            }
         } else {
            int var4;
            int var5;
            Archive var13;
            if (60 == -627796577 * Client.fi) {
               var13 = NetFileRequest.fc;
               Archive var16 = rr.fv;
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

               var5 = cf.af_renamed(rr.fv);
               if (var4 < var5) {
                  cz.ae = Strings.az + 100 * var4 / var5 + "%";
                  cz.ad = -2044575758;
               } else {
                  cz.ae = Strings.ad;
                  cz.ad = -2044575758;
                  fd.hi_renamed(5);
                  Client.fi = 1314995706;
               }
            } else if (70 == -627796577 * Client.fi) {
               if (!dk.fn.cc()) {
                  cz.ae = Strings.ae + dk.fn.loadPercent() + "%";
                  cz.ad = 123489468;
               } else if (!PcmPlayer.gs.cc()) {
                  cz.ae = Strings.ae + (80 + ey.fj.loadPercent() / 6) + "%";
                  cz.ad = 123489468;
               } else {
                  EnumType.af_renamed(dk.fn);
                  World.af_renamed(dk.fn);
                  Client.af_renamed(dk.fn, FloorUnderlayType.fr);
                  Interpreter.af_renamed(dk.fn, FloorUnderlayType.fr, Client.cu);
                  MiniMenuEntry.af_renamed(dk.fn, FloorUnderlayType.fr);
                  dk.af_renamed(dk.fn);
                  Archive var25 = dk.fn;
                  var13 = FloorUnderlayType.fr;
                  boolean var15 = Client.ca;
                  Font var17 = Language.ir;
                  nc.ab = var25;
                  ObjType.aq = var13;
                  gm.al = var15;
                  MouseRecorder.at = nc.ab.cq(10) * -1255946235;
                  eh.ax = var17;
                  fk.af_renamed(dk.fn, fd, ServerBuild.fb);
                  er.af_renamed(dk.fn, FloorUnderlayType.fr);
                  MiniMenuEntry.af_renamed(dk.fn);
                  Archive var18 = dk.fn;
                  gz.af = var18;
                  gz.an = gz.af.cq(16) * -805125715;
                  au.af_renamed(dk.fz, FloorUnderlayType.fr, rr.fv, ei.fg);
                  Npc.af_renamed(dk.fn);
                  MidiPcmStream.af_renamed(dk.fn);
                  Archive var6 = dk.fn;
                  lh.af = var6;
                  Archive var7 = dk.fn;
                  hc.af_renamed(dk.fn);
                  ReflectionCheck.af_renamed(dk.fn);
                  mg.af_renamed(dk.fn);
                  gg.qm = new su(Client.cc, 54, fj.ck, dk.fn);
                  MiniMenuEntry.qh = new su(Client.cc, 47, fj.ck, dk.fn);
                  oy.qo = new Varcs();
                  Archive var8 = dk.fn;
                  Archive var9 = rr.fv;
                  Archive var10 = ei.fg;
                  HitmarkType.af = var8;
                  HitmarkType.an = var9;
                  HitmarkType.aw = var10;
                  Archive var11 = dk.fn;
                  Archive var12 = rr.fv;
                  HeadbarType.af = var11;
                  HeadbarType.an = var12;
                  bz.af_renamed(dk.fn, rr.fv);
                  cz.ae = Strings.ap;
                  cz.ad = 123489468;
                  Client.fi = 2116418992;
               }
            } else if (Client.fi * -627796577 == 80) {
               var1 = 0;
               if (ChatChannel.jb == null) {
                  ChatChannel.jb = sc.aw_renamed(rr.fv, Varcs.gg.af * -25531251, 0);
               } else {
                  ++var1;
               }

               if (dp.jz == null) {
                  dp.jz = sc.aw_renamed(rr.fv, Varcs.gg.an * -740583791, 0);
               } else {
                  ++var1;
               }

               if (null == ml.ju) {
                  ml.ju = cv.af_renamed(rr.fv, -506869823 * Varcs.gg.aw, 0);
               } else {
                  ++var1;
               }

               if (bt.jl == null) {
                  bt.jl = eb.an_renamed(rr.fv, Varcs.gg.ac * 84664645, 0);
               } else {
                  ++var1;
               }

               if (null == qj.kc) {
                  qj.kc = eb.an_renamed(rr.fv, Varcs.gg.au * 842447949, 0);
               } else {
                  ++var1;
               }

               if (IDKType.ku == null) {
                  IDKType.ku = eb.an_renamed(rr.fv, Varcs.gg.ab * -1721152621, 0);
               } else {
                  ++var1;
               }

               if (null == ds.kd) {
                  ds.kd = eb.an_renamed(rr.fv, -1343036557 * Varcs.gg.aq, 0);
               } else {
                  ++var1;
               }

               if (gq.kb == null) {
                  gq.kb = eb.an_renamed(rr.fv, Varcs.gg.al * 1146186045, 0);
               } else {
                  ++var1;
               }

               if (sf.kt == null) {
                  sf.kt = eb.an_renamed(rr.fv, Varcs.gg.at * 130583873, 0);
               } else {
                  ++var1;
               }

               if (null == Headbar.ka) {
                  Headbar.ka = cv.af_renamed(rr.fv, Varcs.gg.aa * 233709739, 0);
               } else {
                  ++var1;
               }

               if (null == bx.kg) {
                  bx.kg = cv.af_renamed(rr.fv, Varcs.gg.ay * -2142254499, 0);
               } else {
                  ++var1;
               }

               if (var1 < 11) {
                  cz.ae = Strings.by + var1 * 100 / 12 + "%";
                  cz.ad = -2003412602;
               } else {
                  AbstractFont.ay = bx.kg;
                  dp.jz.removeAll();
                  int var2 = (int)(Math.random() * 21.0) - 10;
                  int var3 = (int)(Math.random() * 21.0) - 10;
                  var4 = (int)(Math.random() * 21.0) - 10;
                  var5 = (int)(Math.random() * 41.0) - 20;
                  ml.ju[0].shiftColors(var5 + var2, var5 + var3, var4 + var5);
                  cz.ae = Strings.bb;
                  cz.ad = -2003412602;
                  Client.fi = -1377125018;
               }
            } else if (90 == Client.fi * -627796577) {
               if (!WorldMapLabelSize.fq.cc()) {
                  cz.ae = Strings.bi + "0%";
                  cz.ad = -1962249446;
               } else {
                  al.mp = new TextureProvider(WorldMapLabelSize.fq, rr.fv, 20, aj.vb.av(), Client.cu ? 64 : 128);
                  TextureProvider var24 = al.mp;
                  in.ab.aq = var24;
                  am.an(aj.vb.av());
                  Client.fi = -575701732;
               }
            } else if (100 == -627796577 * Client.fi) {
               var1 = al.mp.af();
               if (var1 < 100) {
                  cz.ae = Strings.bi + var1 + "%";
                  cz.ad = -1962249446;
               } else {
                  cz.ae = Strings.be;
                  cz.ad = -1962249446;
                  Client.fi = 225721554;
               }
            } else if (Client.fi * -627796577 == 110) {
               eg.eq = new MouseRecorder();
               Client.af.newThreadTask(eg.eq, 10);
               cz.ae = Strings.bk;
               cz.ad = 1907337436;
               Client.fi = 1027144840;
            } else if (120 == -627796577 * Client.fi) {
               if (!NetFileRequest.fc.tryLoadFileByNames("huffman", "")) {
                  cz.ae = Strings.bx + 0 + "%";
                  cz.ad = 1481957022;
               } else {
                  Huffman var23 = new Huffman(NetFileRequest.fc.takeFileByNames("huffman", ""));
                  ft.af_renamed(var23);
                  cz.ae = Strings.bo;
                  cz.ad = 1481957022;
                  Client.fi = 1828568126;
               }
            } else if (-627796577 * Client.fi == 130) {
               if (!dk.fz.cc()) {
                  cz.ae = Strings.bz + dk.fz.loadPercent() * 4 / 5 + "%";
                  cz.ad = 1056576608;
               } else if (!ey.fj.cc()) {
                  cz.ae = Strings.bz + (80 + ey.fj.loadPercent() / 6) + "%";
                  cz.ad = 1056576608;
               } else if (!ei.fg.cc()) {
                  cz.ae = Strings.bz + (96 + ei.fg.loadPercent() / 50) + "%";
                  cz.ad = 1056576608;
               } else {
                  cz.ae = Strings.bm;
                  cz.ad = 631196194;
                  if (ey.fj.cv("version.dat", "")) {
                     Packet var22 = new Packet(ey.fj.takeFileByNames("version.dat", ""));
                     var22.cl();
                  }

                  Client.fi = -1664975884;
               }
            } else if (140 == -627796577 * Client.fi) {
               cz.ad = 205815780;
               if (bi.ft.cm() > 0 && !bi.ft.tryLoadGroupByName(WorldMapCacheName.af.ab)) {
                  cz.ae = Strings.bd + bi.ft.groupLoadPercentByName(WorldMapCacheName.af.ab) / 10 + "%";
               } else {
                  if (ey.wt == null) {
                     ey.wt = new WorldMap();
                     ey.wt.init(bi.ft, nt.fu, he.gr, fx.ip, Client.im, ml.ju);
                  }

                  cz.ae = Strings.bt;
                  Client.fi = -863552598;
               }
            } else if (150 == Client.fi * -627796577) {
               fd.hi_renamed(10);
            }
         }
      } else {
         var1 = 0;
         var1 += fd.an() * 4 / 100;
         var1 += ServerBuild.fb.an() * 4 / 100;
         var1 += dk.fn.an() * 2 / 100;
         var1 += dk.fz.an() * 2 / 100;
         var1 += qc.fa.an() * 6 / 100;
         var1 += nn.fy.an() * 4 / 100;
         var1 += pj.fw.an() * 2 / 100;
         var1 += FloorUnderlayType.fr.an() * 55 / 100;
         var1 += rr.fv.an() * 2 / 100;
         var1 += WorldMapLabelSize.fq.an() * 2 / 100;
         var1 += NetFileRequest.fc.an() * 2 / 100;
         var1 += hc.ff.an() * 2 / 100;
         var1 += ey.fj.an() * 2 / 100;
         var1 += ei.fg.an() * 2 / 100;
         var1 += id.fk.an() * 2 / 100;
         var1 += ey.fm.an() * 2 / 100;
         var1 += bi.ft.an() * 1 / 100;
         var1 += nt.fu.an() * 1 / 100;
         var1 += he.gr.an() * 1 / 100;
         var1 += PcmPlayer.gs.an() * 1 / 100;
         var1 += gw.go.af() && gw.go.cc() ? 1 : 0;
         if (100 != var1) {
            if (var1 != 0) {
               cz.ae = Strings.ar + var1 + "%";
            }

            cz.ad = -2085738914;
         } else {
            es.hx_renamed(fd, "Animations");
            es.hx_renamed(ServerBuild.fb, "Skeletons");
            es.hx_renamed(qc.fa, "Sound FX");
            es.hx_renamed(nn.fy, "Maps");
            es.hx_renamed(pj.fw, "Music Tracks");
            es.hx_renamed(FloorUnderlayType.fr, "Models");
            es.hx_renamed(rr.fv, "Sprites");
            es.hx_renamed(hc.ff, "Music Jingles");
            es.hx_renamed(id.fk, "Music Samples");
            es.hx_renamed(ey.fm, "Music Patches");
            es.hx_renamed(bi.ft, "World Map");
            es.hx_renamed(nt.fu, "World Map Geography");
            es.hx_renamed(he.gr, "World Map Ground");
            Varcs.gg = new GraphicsDefaults();
            Varcs.gg.decode(gw.go);
            cz.ae = Strings.am;
            cz.ad = -2085738914;
            Client.fi = 1458921139;
         }
      }
   }

   static void oz_renamed(int var0) {
      SeqType var2 = Inventory.getSeqType(var0, (byte)13);
      if (var2.ao()) {
         if (aj.ag_renamed(1238147375 * var2.ay) == 2) {
            Client.wz.add(1238147375 * var2.ay);
         }

      }
   }
}
