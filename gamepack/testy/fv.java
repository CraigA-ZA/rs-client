public class fv extends fb {
   byte au;
   byte an;
   byte aw;
   // $FF: synthetic field
   final fa this$0;
   byte ac;
   boolean af;
   static nm bk;
   public static final int av = 0;

   public static final void ay(int var0) {
      try {
         ix.af = false;
         ix.ai = 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "fv.ay(" + ')');
      }
   }

   void af(sg var1, int var2) {
      try {
         boolean var10001;
         if (var1.cm((byte)7) == 1) {
            if (var2 == 1120136284) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.af = var10001;
         this.an = var1.cf(435772489);
         this.aw = var1.cf(435772489);
         this.ac = var1.cf(435772489);
         this.au = var1.cf(435772489);
      } catch (RuntimeException var3) {
         throw db.an(var3, "fv.af(" + ')');
      }
   }

   void an(fj var1, int var2) {
      try {
         var1.al = this.af;
         var1.at = this.an;
         var1.aa = this.aw;
         var1.ay = this.ac;
         var1.ao = this.au;
      } catch (RuntimeException var3) {
         throw db.an(var3, "fv.an(" + ')');
      }
   }

   void aw(fj var1) {
      var1.al = this.af;
      var1.at = this.an;
      var1.aa = this.aw;
      var1.ay = this.ac;
      var1.ao = this.au;
   }

   public static md af(int var0, int var1) {
      try {
         md[] var2 = new md[]{md.af, md.an, md.aw, md.ac};
         md[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if (var1 == -724447164) {
               throw new IllegalStateException();
            }

            md var5 = var3[var4];
            if (var0 == var5.ab * -978256915) {
               if (var1 == -724447164) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw db.an(var6, "fv.af(" + ')');
      }
   }

   void au(sg var1) {
      this.af = var1.cm((byte)7) == 1;
      this.an = var1.cf(435772489);
      this.aw = var1.cf(435772489);
      this.ac = var1.cf(435772489);
      this.au = var1.cf(435772489);
   }

   void ac(sg var1) {
      this.af = var1.cm((byte)7) == 1;
      this.an = var1.cf(435772489);
      this.aw = var1.cf(435772489);
      this.ac = var1.cf(435772489);
      this.au = var1.cf(435772489);
   }

   fv(fa var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw db.an(var2, "fv.<init>(" + ')');
      }
   }

   public static int aw(int var0, int var1) {
      try {
         return (var0 & 265217111 * sc.aw) - 1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fv.aw(" + ')');
      }
   }

   static final void kb(boolean var0, sq var1, int var2) {
      try {
         client.mb = 0;
         client.ig = 0;
         bk.kt(var1, 900654741);
         iy.ka(var0, var1, -875746645);

         int var3;
         int var4;
         for(var3 = 0; var3 < client.ig * 606834121; ++var3) {
            if (var2 != -1232221421) {
               throw new IllegalStateException();
            }

            var4 = client.ih[var3];
            df var5 = client.iu[var4];
            int var6 = var1.cm((byte)7);
            int var7;
            if (0 != (var6 & 128)) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var7 = var1.cm((byte)7);
               var6 += var7 << 8;
            }

            if (0 != (var6 & 256)) {
               if (var2 != -1232221421) {
                  return;
               }

               var7 = var1.cm((byte)7);
               var6 += var7 << 16;
            }

            int var8;
            int var9;
            if (0 != (var6 & 64)) {
               label841: {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var7 = var1.cl(412358679);
                  if (var7 == 65535) {
                     var7 = -1;
                  }

                  var8 = var1.db((byte)-93);
                  if (-1372355773 * var5.ct == var7) {
                     if (var2 != -1232221421) {
                        throw new IllegalStateException();
                     }

                     if (-1 != var7) {
                        var9 = dc.an(var7, (byte)5).be * 789159225;
                        if (var9 == 1) {
                           if (var2 != -1232221421) {
                              throw new IllegalStateException();
                           }

                           var5.cp = 0;
                           var5.cd = 0;
                           var5.dm = -401806131 * var8;
                           var5.dw = 0;
                        }

                        if (2 == var9) {
                           if (var2 != -1232221421) {
                              throw new IllegalStateException();
                           }

                           var5.dw = 0;
                        }
                        break label841;
                     }
                  }

                  if (var7 != -1) {
                     if (var2 != -1232221421) {
                        throw new IllegalStateException();
                     }

                     if (-1372355773 * var5.ct != -1) {
                        if (var2 != -1232221421) {
                           throw new IllegalStateException();
                        }

                        if (dc.an(var7, (byte)116).az * -1932560049 < dc.an(-1372355773 * var5.ct, (byte)2).az * -1932560049) {
                           break label841;
                        }
                     }
                  }

                  var5.ct = -1690721941 * var7;
                  var5.cp = 0;
                  var5.cd = 0;
                  var5.dm = -401806131 * var8;
                  var5.dw = 0;
                  var5.eo = -1718989897 * var5.dn;
               }
            }

            if ((var6 & 32) != 0) {
               if (var2 != -1232221421) {
                  return;
               }

               var5.cr = var1.cl(-328477384) * 1052277865;
               var5.cr += (var1.db((byte)-127) << 16) * 1052277865;
               var7 = 16777215;
               if (var7 == 1005900761 * var5.cr) {
                  var5.cr = -1052277865;
               }
            }

            if (0 != (var6 & 2)) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var5.bw = var1.cw((byte)0);
               var5.cs = -1924554444;
            }

            int var10;
            int var11;
            int var12;
            int var10000;
            if (0 != (var6 & 4)) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var7 = var1.cm((byte)7);
               int var13;
               if (var7 > 0) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  for(var8 = 0; var8 < var7; ++var8) {
                     if (var2 != -1232221421) {
                        throw new IllegalStateException();
                     }

                     var10 = -1;
                     var11 = -1;
                     var12 = -1;
                     var9 = var1.cd(-53042423);
                     if (var9 == 32767) {
                        if (var2 != -1232221421) {
                           throw new IllegalStateException();
                        }

                        var9 = var1.cd(-1013005421);
                        var11 = var1.cd(-738243490);
                        var10 = var1.cd(-1594717523);
                        var12 = var1.cd(-1604471571);
                     } else if (32766 != var9) {
                        var11 = var1.cd(-651141391);
                     } else {
                        var9 = -1;
                     }

                     var13 = var1.cd(-1995934976);
                     var5.co(var9, var11, var10, var12, -1886224337 * client.ep, var13, 1919870398);
                  }
               }

               var8 = var1.df(-2110389308);
               if (var8 > 0) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var1.cd(-1118841547);
                     var11 = var1.cd(-1847028101);
                     if (var11 != 32767) {
                        if (var2 != -1232221421) {
                           return;
                        }

                        var12 = var1.cd(-664950594);
                        var13 = var1.cm((byte)7);
                        if (var11 > 0) {
                           if (var2 != -1232221421) {
                              throw new IllegalStateException();
                           }

                           var10000 = var1.df(-2030175664);
                        } else {
                           var10000 = var13;
                        }

                        int var14 = var10000;
                        var5.cz(var10, -1886224337 * client.ep, var11, var12, var13, var14, (byte)121);
                     } else {
                        var5.cw(var10, 1269115179);
                     }
                  }
               }
            }

            if (0 != (var6 & 8)) {
               if (var2 != -1232221421) {
                  return;
               }

               var5.af = nm.an(var1.eo(-1426367109), (byte)-113);
               fa.kg(var5, (byte)76);
               var5.ah((byte)47);
            }

            if ((var6 & 1) != 0) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var7 = var1.cl(-1831796070);
               var8 = var1.en(383378593);
               var5.cj(0, var7, var8 >> 16, var8 & '\uffff', -817052815);
            }

            if (0 != (var6 & 16)) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var7 = var1.ep(-523126268);
               var8 = var1.ep(-523126268);
               boolean var10001;
               if (var1.db((byte)-73) == 1) {
                  if (var2 != -1232221421) {
                     return;
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var5.co = var10001;
               if (-1931866699 * client.cx >= 212) {
                  var5.cv = -1213206377 * var7;
                  var5.cb = var8 * 1388623137;
               } else {
                  label847: {
                     var9 = 1144428983 * var5.bx - (var7 - -1232093375 * jm.ib - jm.ib * -1232093375) * 64;
                     var10 = -411750205 * var5.bo - (var8 - jj.jc * 827352769 - 827352769 * jj.jc) * 64;
                     if (0 == var9) {
                        if (var2 != -1232221421) {
                           return;
                        }

                        if (var10 == 0) {
                           break label847;
                        }

                        if (var2 != -1232221421) {
                           return;
                        }
                     }

                     var12 = (int)(Math.atan2((double)var9, (double)var10) * 325.94932345220167) & 2047;
                     var5.cx = -1409690365 * var12;
                  }
               }
            }

            if (0 != (var6 & 16384)) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var5.di = var1.cf(435772489) * -278393391;
               var5.dl = var1.dj(916064469) * -1448856093;
               var5.dr = var1.dj(227566312) * 242410523;
               var5.dk = var1.dj(599607163) * 2106434927;
               var5.dt = (var1.ep(-523126268) + -1886224337 * client.ep) * -608537751;
               var5.dv = (var1.da(560305948) + -1886224337 * client.ep) * -2100738849;
               var5.dz = var1.eo(-1438285532) * -698990457;
               var5.dn = 400971895;
               var5.eo = 0;
               var5.di += var5.dy[0] * -278393391;
               var5.dl += -1448856093 * var5.ds[0];
               var5.dr += var5.dy[0] * 242410523;
               var5.dk += 2106434927 * var5.ds[0];
            }

            if ((var6 & '耀') != 0) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var5.eq = var1.cx(-1826144972) * 1392091407;
            }

            if ((var6 & 2048) != 0) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var5.dh = (client.ep * -1886224337 + var1.da(2028770606)) * -887211183;
               var5.dp = (client.ep * -1886224337 + var1.cl(-1031172461)) * -368061749;
               var5.du = var1.dd(797294812);
               var5.db = var1.dj(-984504244);
               var5.df = var1.dx(-2086413203);
               var5.dq = (byte)var1.dq(-2070899692);
            }

            if (0 != (var6 & 512)) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var5.af(var1.cw((byte)0), -1586819780);
            }

            if ((var6 & 8192) != 0) {
               if (var2 != -1232221421) {
                  return;
               }

               var5.aw(var1.cm((byte)7), -1826007749);
            }

            int[] var16;
            short[] var17;
            short[] var18;
            long var19;
            boolean var20;
            if (0 != (var6 & 4096)) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var7 = var1.dq(-2070899692);
               if ((var7 & 1) == 1) {
                  if (var2 != -1232221421) {
                     return;
                  }

                  var5.aj((short)17996);
               } else {
                  var16 = null;
                  if (2 == (var7 & 2)) {
                     if (var2 != -1232221421) {
                        throw new IllegalStateException();
                     }

                     var9 = var1.dq(-2070899692);
                     var16 = new int[var9];

                     for(var10 = 0; var10 < var9; ++var10) {
                        if (var2 != -1232221421) {
                           throw new IllegalStateException();
                        }

                        var11 = var1.cl(-801366224);
                        var11 = var11 == 65535 ? -1 : var11;
                        var16[var10] = var11;
                     }
                  }

                  var17 = null;
                  if ((var7 & 4) == 4) {
                     if (var2 != -1232221421) {
                        throw new IllegalStateException();
                     }

                     var10 = 0;
                     if (var5.af.by != null) {
                        if (var2 != -1232221421) {
                           throw new IllegalStateException();
                        }

                        var10 = var5.af.by.length;
                     }

                     var17 = new short[var10];

                     for(var11 = 0; var11 < var10; ++var11) {
                        var17[var11] = (short)var1.da(1077275980);
                     }
                  }

                  var18 = null;
                  if ((var7 & 8) == 8) {
                     if (var2 != -1232221421) {
                        throw new IllegalStateException();
                     }

                     var11 = 0;
                     if (var5.af.bi != null) {
                        var11 = var5.af.bi.length;
                     }

                     var18 = new short[var11];

                     for(var12 = 0; var12 < var11; ++var12) {
                        if (var2 != -1232221421) {
                           throw new IllegalStateException();
                        }

                        var18[var12] = (short)var1.ep(-523126268);
                     }
                  }

                  var20 = false;
                  if ((var7 & 16) != 0) {
                     boolean var21;
                     if (var1.cm((byte)7) == 1) {
                        if (var2 != -1232221421) {
                           throw new IllegalStateException();
                        }

                        var21 = true;
                     } else {
                        var21 = false;
                     }

                     var20 = var21;
                  }

                  var19 = (long)((df.aa += -1963015503) * 413681233 - 1);
                  var5.av(new hv(var19, var16, var17, var18, var20), -1457608941);
               }
            }

            if (0 != (var6 & 1024)) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var7 = var1.db((byte)-120);
               if ((var7 & 1) == 1) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var5.ak((byte)-112);
               } else {
                  var16 = null;
                  if ((var7 & 2) == 2) {
                     var9 = var1.db((byte)-11);
                     var16 = new int[var9];

                     for(var10 = 0; var10 < var9; ++var10) {
                        if (var2 != -1232221421) {
                           throw new IllegalStateException();
                        }

                        var11 = var1.eo(1547349819);
                        if (var11 == 65535) {
                           if (var2 != -1232221421) {
                              throw new IllegalStateException();
                           }

                           var10000 = -1;
                        } else {
                           var10000 = var11;
                        }

                        var11 = var10000;
                        var16[var10] = var11;
                     }
                  }

                  var17 = null;
                  if (4 == (var7 & 4)) {
                     if (var2 != -1232221421) {
                        throw new IllegalStateException();
                     }

                     var10 = 0;
                     if (null != var5.af.by) {
                        if (var2 != -1232221421) {
                           throw new IllegalStateException();
                        }

                        var10 = var5.af.by.length;
                     }

                     var17 = new short[var10];

                     for(var11 = 0; var11 < var10; ++var11) {
                        if (var2 != -1232221421) {
                           throw new IllegalStateException();
                        }

                        var17[var11] = (short)var1.da(1052580750);
                     }
                  }

                  var18 = null;
                  if ((var7 & 8) == 8) {
                     var11 = 0;
                     if (var5.af.bi != null) {
                        if (var2 != -1232221421) {
                           throw new IllegalStateException();
                        }

                        var11 = var5.af.bi.length;
                     }

                     var18 = new short[var11];

                     for(var12 = 0; var12 < var11; ++var12) {
                        if (var2 != -1232221421) {
                           throw new IllegalStateException();
                        }

                        var18[var12] = (short)var1.eo(483094229);
                     }
                  }

                  var20 = false;
                  if (0 != (var7 & 16)) {
                     if (var2 != -1232221421) {
                        throw new IllegalStateException();
                     }

                     var20 = var1.cm((byte)7) == 1;
                  }

                  var19 = (long)((df.al += -1714612375) * -1770985255 - 1);
                  var5.am(new hv(var19, var16, var17, var18, var20), 1428478753);
               }
            }

            if ((var6 & 131072) != 0) {
               if (var2 != -1232221421) {
                  return;
               }

               var7 = var1.dq(-2070899692);
               var16 = new int[8];
               var17 = new short[8];

               for(var10 = 0; var10 < 8; ++var10) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  if ((var7 & 1 << var10) != 0) {
                     if (var2 != -1232221421) {
                        throw new IllegalStateException();
                     }

                     var16[var10] = var1.do(1266103064);
                     var17[var10] = (short)var1.dm(-1370697348);
                  } else {
                     var16[var10] = -1;
                     var17[var10] = -1;
                  }
               }

               var5.ag(var16, var17, 1712497596);
            }

            if (0 != (var6 & 262144)) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var7 = var1.cx(-916752754);
               int var22;
               if ((var7 & 1) != 0) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var22 = var1.cl(-1430533565);
               } else {
                  var22 = -2117504177 * var5.af.ao;
               }

               var5.bj = var22 * -767436785;
               if (0 != (var7 & 2)) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var22 = var1.cl(-397899594);
               } else {
                  var22 = var5.af.ax * 1635935495;
               }

               var5.bn = var22 * -603869663;
               var5.bs = (0 != (var7 & 4) ? var1.eo(1131590434) : var5.af.ai * 849832979) * 1672510249;
               if (0 != (var7 & 8)) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var22 = var1.cl(-1729909218);
               } else {
                  var22 = var5.af.ag * 606174455;
               }

               var5.br = var22 * -1683505383;
               if ((var7 & 16) != 0) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var22 = var1.cl(-1451542115);
               } else {
                  var22 = 429445119 * var5.af.ah;
               }

               var5.bg = var22 * 497469823;
               var5.bu = (0 != (var7 & 32) ? var1.cl(371800336) : var5.af.av * -1237616413) * 1927855919;
               if ((var7 & 64) != 0) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var22 = var1.cl(598391576);
               } else {
                  var22 = -1565402875 * var5.af.ar;
               }

               var5.bf = var22 * 140602839;
               var5.bq = ((var7 & 128) != 0 ? var1.da(1420443594) : var5.af.am * 1434909561) * -1320156809;
               if (0 != (var7 & 256)) {
                  if (var2 != -1232221421) {
                     return;
                  }

                  var22 = var1.da(1878073532);
               } else {
                  var22 = -1171795391 * var5.af.as;
               }

               var5.ba = var22 * 725472713;
               if (0 != (var7 & 512)) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var22 = var1.da(1527871692);
               } else {
                  var22 = var5.af.aj * 1924156607;
               }

               var5.bv = var22 * -1530081757;
               var5.bl = (0 != (var7 & 1024) ? var1.cl(-817963034) : -1186532489 * var5.af.ak) * -1035736995;
               if ((var7 & 2048) != 0) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var22 = var1.cl(-1420449257);
               } else {
                  var22 = var5.af.az * 1456216629;
               }

               var5.bp = var22 * -1110395975;
               if ((var7 & 4096) != 0) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var22 = var1.ep(-523126268);
               } else {
                  var22 = var5.af.ad * -750567499;
               }

               var5.bc = var22 * -2025717011;
               if ((var7 & 8192) != 0) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var22 = var1.eo(-732373798);
               } else {
                  var22 = var5.af.ae * 1520351037;
               }

               var5.bh = var22 * -919918425;
               if ((var7 & 16384) != 0) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var22 = var1.ep(-523126268);
               } else {
                  var22 = var5.af.ay * 1235033537;
               }

               var5.bt = var22 * 1196796229;
            }

            if ((var6 & 65536) != 0) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               var7 = var1.db((byte)-26);

               for(var8 = 0; var8 < var7; ++var8) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  var9 = var1.dq(-2070899692);
                  var10 = var1.eo(1483574464);
                  var11 = var1.en(383378593);
                  var5.cj(var9, var10, var11 >> 16, var11 & '\uffff', -605803370);
               }
            }
         }

         for(var3 = 0; var3 < 216061641 * client.mb; ++var3) {
            if (var2 != -1232221421) {
               return;
            }

            var4 = client.nz[var3];
            if (client.ep * -1886224337 != client.iu[var4].dg * -523202873) {
               if (var2 != -1232221421) {
                  throw new IllegalStateException();
               }

               client.iu[var4].af = null;
               client.iu[var4] = null;
            }
         }

         if (-1633313603 * var1.at != client.in.al * 889658999) {
            if (var2 == -1232221421) {
               throw new RuntimeException(var1.at * -1633313603 + dq.an + 889658999 * client.in.al);
            }
         } else {
            for(var3 = 0; var3 < 265474485 * client.iw; ++var3) {
               if (var2 != -1232221421) {
                  return;
               }

               if (client.iu[client.iy[var3]] == null) {
                  if (var2 != -1232221421) {
                     throw new IllegalStateException();
                  }

                  throw new RuntimeException(var3 + dq.an + client.iw * 265474485);
               }
            }

         }
      } catch (RuntimeException var15) {
         throw db.an(var15, "fv.kb(" + ')');
      }
   }
}
