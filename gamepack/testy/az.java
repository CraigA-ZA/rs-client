import accessors.RSDevicePcmPlayerProvider;

public class az implements bh, RSDevicePcmPlayerProvider {
   static final int cj = 91;
   static final int aj = 200;
   static final int my = 8;
   static nd fd;
   static int gi;
   static tc[] dk;

   static void hs(int var0) {
      try {
         int var15;
         if (-627796577 * client.fi == 0) {
            if (var0 <= 1084046795) {
               throw new IllegalStateException();
            } else {
               bx.js = new ie(4, 104, 104, cd.af);

               for(var15 = 0; var15 < 4; ++var15) {
                  if (var0 <= 1084046795) {
                     throw new IllegalStateException();
                  }

                  client.jr[var15] = new if(104, 104);
               }

               et.tk = new tq(512, 512);
               cz.ae = mk.ag;
               cz.ad = 1084032613;
               client.fi = 1602846572;
            }
         } else if (20 == client.fi * -627796577) {
            cz.ae = mk.ah;
            cz.ad = -2126902070;
            client.fi = -1890697438;
         } else if (client.fi * -627796577 == 30) {
            if (var0 <= 1084046795) {
               throw new IllegalStateException();
            } else {
               fd = jd.hn(0, false, true, true, false, 2134354855);
               md.fb = jd.hn(1, false, true, true, false, 2049040193);
               dk.fn = jd.hn(2, true, false, true, false, 2064610125);
               dk.fz = jd.hn(3, false, true, true, false, 2086817112);
               qc.fa = jd.hn(4, false, true, true, false, 2142668806);
               nn.fy = jd.hn(5, true, true, true, false, 2100631140);
               pj.fw = jd.hn(6, true, true, true, false, 2081538446);
               hr.fr = jd.hn(7, false, true, true, false, 2047712487);
               rr.fv = jd.hn(8, false, true, true, false, 2129540087);
               jd.fq = jd.hn(9, false, true, true, false, 2090413023);
               no.fc = jd.hn(10, false, true, true, false, 2081260761);
               hc.ff = jd.hn(11, false, true, true, false, 2073494782);
               ey.fj = jd.hn(12, false, true, true, false, 2132542361);
               ei.fg = jd.hn(13, true, false, true, false, 2037938818);
               id.fk = jd.hn(14, false, true, true, false, 2141469799);
               ey.fm = jd.hn(15, false, true, true, false, 2057751547);
               gw.go = jd.hn(17, true, true, true, false, 2084229724);
               nt.fu = jd.hn(18, false, true, true, false, 2058445249);
               bi.ft = jd.hn(19, false, true, true, false, 2089153832);
               he.gr = jd.hn(20, false, true, true, false, 2102395454);
               bu.gs = jd.hn(21, false, true, true, true, 2083465163);
               cz.ae = mk.av;
               cz.ad = 41163156;
               client.fi = -1089274152;
            }
         } else if (40 == -627796577 * client.fi) {
            if (var0 <= 1084046795) {
               throw new IllegalStateException();
            } else {
               byte var10001;
               label558: {
                  byte var28 = 0;
                  var15 = var28 + fd.an((byte)0) * 4 / 100;
                  var15 += md.fb.an((byte)0) * 4 / 100;
                  var15 += dk.fn.an((byte)0) * 2 / 100;
                  var15 += dk.fz.an((byte)0) * 2 / 100;
                  var15 += qc.fa.an((byte)0) * 6 / 100;
                  var15 += nn.fy.an((byte)0) * 4 / 100;
                  var15 += pj.fw.an((byte)0) * 2 / 100;
                  var15 += hr.fr.an((byte)0) * 55 / 100;
                  var15 += rr.fv.an((byte)0) * 2 / 100;
                  var15 += jd.fq.an((byte)0) * 2 / 100;
                  var15 += no.fc.an((byte)0) * 2 / 100;
                  var15 += hc.ff.an((byte)0) * 2 / 100;
                  var15 += ey.fj.an((byte)0) * 2 / 100;
                  var15 += ei.fg.an((byte)0) * 2 / 100;
                  var15 += id.fk.an((byte)0) * 2 / 100;
                  var15 += ey.fm.an((byte)0) * 2 / 100;
                  var15 += bi.ft.an((byte)0) * 1 / 100;
                  var15 += nt.fu.an((byte)0) * 1 / 100;
                  var15 += he.gr.an((byte)0) * 1 / 100;
                  var15 += bu.gs.an((byte)0) * 1 / 100;
                  if (gw.go.af((byte)-28)) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     }

                     if (gw.go.cc((short)128)) {
                        if (var0 <= 1084046795) {
                           throw new IllegalStateException();
                        }

                        var10001 = 1;
                        break label558;
                     }
                  }

                  var10001 = 0;
               }

               var15 += var10001;
               if (100 != var15) {
                  if (var0 <= 1084046795) {
                     throw new IllegalStateException();
                  } else {
                     if (var15 != 0) {
                        cz.ae = mk.ar + var15 + "%";
                     }

                     cz.ad = -2085738914;
                  }
               } else {
                  es.hx(fd, "Animations", 967968354);
                  es.hx(md.fb, "Skeletons", 1673426128);
                  es.hx(qc.fa, "Sound FX", 1309535473);
                  es.hx(nn.fy, "Maps", 1710852974);
                  es.hx(pj.fw, "Music Tracks", 1055606887);
                  es.hx(hr.fr, "Models", 1157975460);
                  es.hx(rr.fv, "Sprites", 1387362070);
                  es.hx(hc.ff, "Music Jingles", 1254988410);
                  es.hx(id.fk, "Music Samples", 1201918992);
                  es.hx(ey.fm, "Music Patches", 1104509821);
                  es.hx(bi.ft, "World Map", 1808738089);
                  es.hx(nt.fu, "World Map Geography", 1010255131);
                  es.hx(he.gr, "World Map Ground", 2058681842);
                  ep.gg = new qw();
                  ep.gg.af(gw.go, -1761039075);
                  cz.ae = mk.am;
                  cz.ad = -2085738914;
                  client.fi = 1458921139;
               }
            }
         } else if (-627796577 * client.fi == 45) {
            if (var0 <= 1084046795) {
               throw new IllegalStateException();
            } else {
               boolean var29;
               if (!client.cu) {
                  if (var0 <= 1084046795) {
                     throw new IllegalStateException();
                  }

                  var29 = true;
               } else {
                  var29 = false;
               }

               boolean var27 = var29;
               bu.au = -1500814902;
               bu.ab = var27;
               ez.at = 754987022;
               ln var18 = new ln();
               var18.ai(9, 128, (byte)-114);
               bi.to = fc.as(client.af, 0, 22050, 1831095645);
               bi.to.aj(var18, -412033085);
               ho.af(ey.fm, id.fk, qc.fa, var18, -1821221274);
               hd.tt = fc.as(client.af, 1, 2048, 1831095645);
               fe.td = new bn();
               hd.tt.aj(fe.td, -947213020);
               jb.tj = new cc(22050, bu.au * -1359271235);
               cz.ae = mk.as;
               cz.ad = -1001706301;
               client.fi = -287850866;
               nv.iv = new ra(rr.fv, ei.fg);
            }
         } else if (50 == -627796577 * client.fi) {
            if (var0 <= 1084046795) {
               throw new IllegalStateException();
            } else {
               var15 = ri.af((byte)75).length;
               client.im = nv.iv.af(ri.af((byte)121), (byte)54);
               if (client.im.size() < var15) {
                  if (var0 <= 1084046795) {
                     throw new IllegalStateException();
                  } else {
                     cz.ae = mk.aj + client.im.size() * 100 / var15 + "%";
                     cz.ad = 82326312;
                  }
               } else {
                  nx.ir = (on)client.im.get(ri.af);
                  je.io = (on)client.im.get(ri.an);
                  fx.ip = (on)client.im.get(ri.aw);
                  en.vz = client.vc.af(1351664737);
                  cz.ae = mk.ak;
                  cz.ad = 82326312;
                  client.fi = 513572420;
               }
            }
         } else {
            int var4;
            int var5;
            nd var17;
            if (60 == -627796577 * client.fi) {
               if (var0 > 1084046795) {
                  var17 = no.fc;
                  nd var20 = rr.fv;
                  var4 = 0;
                  String[] var23 = cz.dq;

                  int var24;
                  String var25;
                  for(var24 = 0; var24 < var23.length; ++var24) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     }

                     var25 = var23[var24];
                     if (var17.co(var25, "", 842451065)) {
                        if (var0 <= 1084046795) {
                           throw new IllegalStateException();
                        }

                        ++var4;
                     }
                  }

                  var23 = cz.dd;

                  for(var24 = 0; var24 < var23.length; ++var24) {
                     var25 = var23[var24];
                     if (var20.co(var25, "", 842451065)) {
                        if (var0 <= 1084046795) {
                           throw new IllegalStateException();
                        }

                        ++var4;
                     }
                  }

                  var23 = cz.dj;

                  for(var24 = 0; var24 < var23.length; ++var24) {
                     if (var0 <= 1084046795) {
                        return;
                     }

                     var25 = var23[var24];
                     if (var20.cy(var25, 1034841595) != -1) {
                        if (var0 <= 1084046795) {
                           throw new IllegalStateException();
                        }

                        if (var20.co(var25, "", 842451065)) {
                           if (var0 <= 1084046795) {
                              throw new IllegalStateException();
                           }

                           ++var4;
                        }
                     }
                  }

                  var5 = cf.af(rr.fv, -1584507403);
                  if (var4 < var5) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     } else {
                        cz.ae = mk.az + 100 * var4 / var5 + "%";
                        cz.ad = -2044575758;
                     }
                  } else {
                     cz.ae = mk.ad;
                     cz.ad = -2044575758;
                     fd.hi(5, 468091997);
                     client.fi = 1314995706;
                  }
               }
            } else if (70 == -627796577 * client.fi) {
               if (!dk.fn.cc((short)128)) {
                  if (var0 <= 1084046795) {
                     throw new IllegalStateException();
                  } else {
                     cz.ae = mk.ae + dk.fn.ax((byte)4) + "%";
                     cz.ad = 123489468;
                  }
               } else if (!bu.gs.cc((short)128)) {
                  cz.ae = mk.ae + (80 + ey.fj.ax((byte)4) / 6) + "%";
                  cz.ad = 123489468;
               } else {
                  hx.af(dk.fn, (byte)42);
                  cl.af(dk.fn, (short)941);
                  client.af(dk.fn, hr.fr, (byte)-10);
                  cy.af(dk.fn, hr.fr, client.cu, (byte)3);
                  cb.af(dk.fn, hr.fr, 1515081265);
                  dk.af(dk.fn, 579263121);
                  nd var26 = dk.fn;
                  var17 = hr.fr;
                  boolean var19 = client.ca;
                  on var21 = nx.ir;
                  nc.ab = var26;
                  hz.aq = var17;
                  gm.al = var19;
                  dl.at = nc.ab.cq(10, (byte)65) * -1255946235;
                  eh.ax = var21;
                  fk.af(dk.fn, fd, md.fb, 1755632957);
                  er.af((nm)dk.fn, (nm)hr.fr, (int)893030532);
                  cb.af(dk.fn, -1939733213);
                  nd var22 = dk.fn;
                  gz.af = var22;
                  gz.an = gz.af.cq(16, (byte)88) * -805125715;
                  au.af(dk.fz, hr.fr, rr.fv, ei.fg, 220568265);
                  df.af((nm)dk.fn, (byte)-54);
                  ln.af(dk.fn, -2144469370);
                  nd var6 = dk.fn;
                  lh.af = var6;
                  nd var7 = dk.fn;
                  hc.af(dk.fn, -1754928363);
                  bj.af(dk.fn, -1333163047);
                  mg.af(dk.fn, (byte)6);
                  gg.qm = new su(client.cc, 54, fj.ck, dk.fn);
                  cb.qh = new su(client.cc, 47, fj.ck, dk.fn);
                  oy.qo = new ep();
                  nd var8 = dk.fn;
                  nd var9 = rr.fv;
                  nd var10 = ei.fg;
                  hb.af = var8;
                  hb.an = var9;
                  hb.aw = var10;
                  nd var11 = dk.fn;
                  nd var12 = rr.fv;
                  hm.af = var11;
                  hm.an = var12;
                  bz.af(dk.fn, rr.fv, 2112098628);
                  cz.ae = mk.ap;
                  cz.ad = 123489468;
                  client.fi = 2116418992;
               }
            } else if (client.fi * -627796577 == 80) {
               if (var0 <= 1084046795) {
                  throw new IllegalStateException();
               } else {
                  var15 = 0;
                  if (cp.jb == null) {
                     cp.jb = sc.aw(rr.fv, ep.gg.af * -25531251, 0, -1572989467);
                  } else {
                     ++var15;
                  }

                  if (dp.jz == null) {
                     if (var0 <= 1084046795) {
                        return;
                     }

                     dp.jz = sc.aw(rr.fv, ep.gg.an * -740583791, 0, 1731928117);
                  } else {
                     ++var15;
                  }

                  if (null == ml.ju) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     }

                     ml.ju = cv.af(rr.fv, -506869823 * ep.gg.aw, 0, -973800610);
                  } else {
                     ++var15;
                  }

                  if (bt.jl == null) {
                     if (var0 <= 1084046795) {
                        return;
                     }

                     bt.jl = eb.an(rr.fv, ep.gg.ac * 84664645, 0, 1271520368);
                  } else {
                     ++var15;
                  }

                  if (null == qj.kc) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     }

                     qj.kc = eb.an(rr.fv, ep.gg.au * 842447949, 0, 1271520368);
                  } else {
                     ++var15;
                  }

                  if (hj.ku == null) {
                     hj.ku = eb.an(rr.fv, ep.gg.ab * -1721152621, 0, 1271520368);
                  } else {
                     ++var15;
                  }

                  if (null == ds.kd) {
                     ds.kd = eb.an(rr.fv, -1343036557 * ep.gg.aq, 0, 1271520368);
                  } else {
                     ++var15;
                  }

                  if (gq.kb == null) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     }

                     gq.kb = eb.an(rr.fv, ep.gg.al * 1146186045, 0, 1271520368);
                  } else {
                     ++var15;
                  }

                  if (sf.kt == null) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     }

                     sf.kt = eb.an(rr.fv, ep.gg.at * 130583873, 0, 1271520368);
                  } else {
                     ++var15;
                  }

                  if (null == db.ka) {
                     if (var0 <= 1084046795) {
                        return;
                     }

                     db.ka = cv.af(rr.fv, ep.gg.aa * 233709739, 0, -1034979318);
                  } else {
                     ++var15;
                  }

                  if (null == bx.kg) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     }

                     bx.kg = cv.af(rr.fv, ep.gg.ay * -2142254499, 0, 664259717);
                  } else {
                     ++var15;
                  }

                  if (var15 < 11) {
                     cz.ae = mk.by + var15 * 100 / 12 + "%";
                     cz.ad = -2003412602;
                  } else {
                     ou.ay = bx.kg;
                     dp.jz.au();
                     int var2 = (int)(Math.random() * 21.0) - 10;
                     int var3 = (int)(Math.random() * 21.0) - 10;
                     var4 = (int)(Math.random() * 21.0) - 10;
                     var5 = (int)(Math.random() * 41.0) - 20;
                     ml.ju[0].an(var5 + var2, var5 + var3, var4 + var5);
                     cz.ae = mk.bb;
                     cz.ad = -2003412602;
                     client.fi = -1377125018;
                  }
               }
            } else if (90 == client.fi * -627796577) {
               if (var0 <= 1084046795) {
                  throw new IllegalStateException();
               } else if (!jd.fq.cc((short)128)) {
                  cz.ae = mk.bi + "0%";
                  cz.ad = -1962249446;
               } else {
                  im var10000 = new im;
                  nd var10002 = jd.fq;
                  nd var10003 = rr.fv;
                  double var10005 = aj.vb.av(1864449029);
                  short var10006;
                  if (client.cu) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     }

                     var10006 = 64;
                  } else {
                     var10006 = 128;
                  }

                  var10000.<init>(var10002, var10003, 20, var10005, var10006);
                  al.mp = var10000;
                  im var16 = al.mp;
                  in.ab.aq = var16;
                  am.an(aj.vb.av(1838318322));
                  client.fi = -575701732;
               }
            } else if (100 == -627796577 * client.fi) {
               if (var0 <= 1084046795) {
                  throw new IllegalStateException();
               } else {
                  var15 = al.mp.af(1658187175);
                  if (var15 < 100) {
                     cz.ae = mk.bi + var15 + "%";
                     cz.ad = -1962249446;
                  } else {
                     cz.ae = mk.be;
                     cz.ad = -1962249446;
                     client.fi = 225721554;
                  }
               }
            } else if (client.fi * -627796577 == 110) {
               if (var0 > 1084046795) {
                  eg.eq = new dl();
                  client.af.ac(eg.eq, 10, (byte)0);
                  cz.ae = mk.bk;
                  cz.ad = 1907337436;
                  client.fi = 1027144840;
               }
            } else if (120 == -627796577 * client.fi) {
               if (var0 <= 1084046795) {
                  throw new IllegalStateException();
               } else if (!no.fc.co("huffman", "", 842451065)) {
                  if (var0 <= 1084046795) {
                     throw new IllegalStateException();
                  } else {
                     cz.ae = mk.bx + 0 + "%";
                     cz.ad = 1481957022;
                  }
               } else {
                  me var14 = new me(no.fc.cb("huffman", "", 1648560407));
                  ft.af(var14, -1214282669);
                  cz.ae = mk.bo;
                  cz.ad = 1481957022;
                  client.fi = 1828568126;
               }
            } else if (-627796577 * client.fi == 130) {
               if (var0 <= 1084046795) {
                  throw new IllegalStateException();
               } else if (!dk.fz.cc((short)128)) {
                  cz.ae = mk.bz + dk.fz.ax((byte)4) * 4 / 5 + "%";
                  cz.ad = 1056576608;
               } else if (!ey.fj.cc((short)128)) {
                  if (var0 > 1084046795) {
                     cz.ae = mk.bz + (80 + ey.fj.ax((byte)4) / 6) + "%";
                     cz.ad = 1056576608;
                  }
               } else if (!ei.fg.cc((short)128)) {
                  if (var0 <= 1084046795) {
                     throw new IllegalStateException();
                  } else {
                     cz.ae = mk.bz + (96 + ei.fg.ax((byte)4) / 50) + "%";
                     cz.ad = 1056576608;
                  }
               } else {
                  cz.ae = mk.bm;
                  cz.ad = 631196194;
                  if (ey.fj.cv("version.dat", "", -1313069490)) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     }

                     sg var1 = new sg(ey.fj.cb("version.dat", "", 1648560407));
                     var1.cl(-962785741);
                  }

                  client.fi = -1664975884;
               }
            } else if (140 == -627796577 * client.fi) {
               if (var0 <= 1084046795) {
                  throw new IllegalStateException();
               } else {
                  cz.ad = 205815780;
                  if (bi.ft.cm(-1154371114) > 0) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     }

                     if (!bi.ft.cz(kq.af.ab, 1583460139)) {
                        if (var0 <= 1084046795) {
                           return;
                        }

                        cz.ae = mk.bd + bi.ft.cj(kq.af.ab, 1956692579) / 10 + "%";
                        return;
                     }
                  }

                  if (ey.wt == null) {
                     if (var0 <= 1084046795) {
                        throw new IllegalStateException();
                     }

                     ey.wt = new rb();
                     ey.wt.af(bi.ft, nt.fu, he.gr, fx.ip, client.im, ml.ju, 87285163);
                  }

                  cz.ae = mk.bt;
                  client.fi = -863552598;
               }
            } else if (150 == client.fi * -627796577) {
               if (var0 <= 1084046795) {
                  throw new IllegalStateException();
               } else {
                  fd.hi(10, 2069942039);
               }
            }
         }
      } catch (RuntimeException var13) {
         throw db.an(var13, "az.hs(" + ')');
      }
   }

   az() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "az.<init>(" + ')');
      }
   }

   public bu an() {
      return new ae();
   }

   public bu aw() {
      return new ae();
   }

   public bu af(int var1) {
      try {
         return new ae();
      } catch (RuntimeException var2) {
         throw db.an(var2, "az.af(" + ')');
      }
   }

   static void ar(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, short var22) {
      try {
         in.aq.al(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
      } catch (RuntimeException var23) {
         throw db.an(var23, "az.ar(" + ')');
      }
   }

   static void oz(int var0, int var1) {
      try {
         ha var2 = dc.an(var0, (byte)13);
         if (!var2.ao(-1944241705)) {
            if (var1 != 329326313) {
               throw new IllegalStateException();
            }
         } else {
            if (aj.ag(1238147375 * var2.ay, 854271946) == 2) {
               if (var1 != 329326313) {
                  throw new IllegalStateException();
               }

               client.wz.add(1238147375 * var2.ay);
            }

         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "az.oz(" + ')');
      }
   }
}
