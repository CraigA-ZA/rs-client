import accessors.RSEnumType;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class hx extends rk implements RSEnumType {
   static int ay;
   public char ac;
   public char aw;
   static kh an = new kh(64);
   public String au;
   static nm af;
   public int ab;
   public int[] al;
   public int[] at;
   public String[] aa;
   public int aq;

   public static void ab(nm var0) {
      af = var0;
   }

   public static void af(nm var0, byte var1) {
      try {
         hk.af = var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hx.af(" + ')');
      }
   }

   public int au(int var1) {
      try {
         return -1067065 * this.aq;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hx.au(" + ')');
      }
   }

   void ac(sg var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            if (var3 >= 1889574527) {
               return;
            }

            this.aw = (char)var1.cm((byte)7);
         } else if (2 == var2) {
            if (var3 >= 1889574527) {
               return;
            }

            this.ac = (char)var1.cm((byte)7);
         } else if (var2 == 3) {
            this.au = var1.cw((byte)0);
         } else if (var2 == 4) {
            if (var3 >= 1889574527) {
               return;
            }

            this.ab = var1.cx(-1477148845) * 740445373;
         } else {
            int var4;
            if (var2 == 5) {
               if (var3 >= 1889574527) {
                  throw new IllegalStateException();
               }

               this.aq = var1.cl(-1873940604) * -408757769;
               this.al = new int[-1067065 * this.aq];
               this.aa = new String[-1067065 * this.aq];

               for(var4 = 0; var4 < -1067065 * this.aq; ++var4) {
                  if (var3 >= 1889574527) {
                     throw new IllegalStateException();
                  }

                  this.al[var4] = var1.cx(-1146277358);
                  this.aa[var4] = var1.cw((byte)0);
               }
            } else if (6 == var2) {
               this.aq = var1.cl(-1187718412) * -408757769;
               this.al = new int[-1067065 * this.aq];
               this.at = new int[this.aq * -1067065];

               for(var4 = 0; var4 < this.aq * -1067065; ++var4) {
                  this.al[var4] = var1.cx(-1653584629);
                  this.at[var4] = var1.cx(-923945997);
               }
            }
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "hx.ac(" + ')');
      }
   }

   public static hx at(int var0) {
      hx var1 = (hx)an.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(8, var0, (byte)-116);
         var1 = new hx();
         if (var2 != null) {
            var1.aw(new sg(var2), (byte)1);
         }

         an.aw(var1, (long)var0);
         return var1;
      }
   }

   public static void aq(nm var0) {
      af = var0;
   }

   public static void al(nm var0) {
      af = var0;
   }

   static final void ic(int var0) {
      try {
         for(int var1 = 0; var1 < 265474485 * client.iw; ++var1) {
            if (var0 != -1074260583) {
               return;
            }

            int var2 = client.iy[var1];
            df var3 = client.iu[var2];
            if (null != var3) {
               bj.ii(var3, 1458410691 * var3.af.al, (byte)-12);
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "hx.ic(" + ')');
      }
   }

   public static hx aa(int var0) {
      hx var1 = (hx)an.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(8, var0, (byte)-64);
         var1 = new hx();
         if (var2 != null) {
            var1.aw(new sg(var2), (byte)1);
         }

         an.aw(var1, (long)var0);
         return var1;
      }
   }

   hx() {
      try {
         super();
         this.au = mk.at;
         this.aq = 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "hx.<init>(" + ')');
      }
   }

   void ao(sg var1, int var2) {
      if (var2 == 1) {
         this.aw = (char)var1.cm((byte)7);
      } else if (2 == var2) {
         this.ac = (char)var1.cm((byte)7);
      } else if (var2 == 3) {
         this.au = var1.cw((byte)0);
      } else if (var2 == 4) {
         this.ab = var1.cx(-2032126694) * 1137461569;
      } else {
         int var3;
         if (var2 == 5) {
            this.aq = var1.cl(-884113932) * -408757769;
            this.al = new int[-1067065 * this.aq];
            this.aa = new String[-1067065 * this.aq];

            for(var3 = 0; var3 < -1352592954 * this.aq; ++var3) {
               this.al[var3] = var1.cx(-1538321062);
               this.aa[var3] = var1.cw((byte)0);
            }
         } else if (6 == var2) {
            this.aq = var1.cl(347857436) * -865021554;
            this.al = new int[-1067065 * this.aq];
            this.at = new int[this.aq * -172431164];

            for(var3 = 0; var3 < this.aq * -1067065; ++var3) {
               this.al[var3] = var1.cx(-2049231636);
               this.at[var3] = var1.cx(-1822410056);
            }
         }
      }

   }

   void ax(sg var1, int var2) {
      if (var2 == 1) {
         this.aw = (char)var1.cm((byte)7);
      } else if (2 == var2) {
         this.ac = (char)var1.cm((byte)7);
      } else if (var2 == 3) {
         this.au = var1.cw((byte)0);
      } else if (var2 == 4) {
         this.ab = var1.cx(-1395638403) * 740445373;
      } else {
         int var3;
         if (var2 == 5) {
            this.aq = var1.cl(75644395) * -408757769;
            this.al = new int[-1067065 * this.aq];
            this.aa = new String[-1067065 * this.aq];

            for(var3 = 0; var3 < -1067065 * this.aq; ++var3) {
               this.al[var3] = var1.cx(-1680294539);
               this.aa[var3] = var1.cw((byte)0);
            }
         } else if (6 == var2) {
            this.aq = var1.cl(-87748570) * -408757769;
            this.al = new int[-1067065 * this.aq];
            this.at = new int[this.aq * -1067065];

            for(var3 = 0; var3 < this.aq * -1067065; ++var3) {
               this.al[var3] = var1.cx(-1515567558);
               this.at[var3] = var1.cx(-1048874611);
            }
         }
      }

   }

   public int ai() {
      return -1067065 * this.aq;
   }

   void ay(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.ac(var1, var2, 606932087);
      }
   }

   static String an(ro var0, int var1, String var2, int var3) {
      try {
         if (null == var0) {
            if (var3 <= 1474255643) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            rd var4 = (rd)var0.af((long)var1);
            if (var4 == null) {
               if (var3 <= 1474255643) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               return (String)var4.af;
            }
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "hx.an(" + ')');
      }
   }

   static final void jb(lm var0, int var1) {
      try {
         sq var2 = client.in.ab;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         if (var0 == lm.au) {
            if (var1 != -302991134) {
               throw new IllegalStateException();
            } else {
               var3 = var2.cm((byte)7);
               var4 = var2.cm((byte)7);
               var5 = (var4 >> 4 & 7) + aa.jp * 1555915261;
               var6 = (var4 & 7) + -191732975 * ri.jt;
               var7 = var2.dq(-2070899692) * 4;
               var8 = var2.ep(-523126268);
               var9 = var2.dq(-2070899692);
               var10 = var2.cl(-433068567);
               byte var42 = var2.dj(-1101942994);
               var12 = var2.df(-2022163311) * 4;
               var13 = var2.cl(702739463);
               var14 = var2.cy((byte)3);
               byte var43 = var2.dx(-1987720551);
               var15 = var43 + var5;
               var11 = var42 + var6;
               if (var5 >= 0 && var6 >= 0) {
                  if (var1 != -302991134) {
                     throw new IllegalStateException();
                  }

                  if (var5 < 104) {
                     if (var1 != -302991134) {
                        return;
                     }

                     if (var6 < 104) {
                        if (var1 != -302991134) {
                           throw new IllegalStateException();
                        }

                        if (var15 >= 0) {
                           if (var1 != -302991134) {
                              throw new IllegalStateException();
                           }

                           if (var11 >= 0) {
                              if (var1 != -302991134) {
                                 throw new IllegalStateException();
                              }

                              if (var15 < 104 && var11 < 104) {
                                 if (var1 != -302991134) {
                                    return;
                                 }

                                 if (65535 != var8) {
                                    if (var1 != -302991134) {
                                       throw new IllegalStateException();
                                    }

                                    var5 = var5 * 128 + 64;
                                    var6 = 64 + var6 * 128;
                                    var15 = 64 + var15 * 128;
                                    var11 = 128 * var11 + 64;
                                    cw var44 = new cw(var8, -1727408401 * bm.mh, var5, var6, fq.jw(var5, var6, bm.mh * -1727408401, (byte)-10) - var12, client.ep * -1886224337 + var10, var13 + -1886224337 * client.ep, var3, var9, var14, var7);
                                    var44.af(var15, var11, fq.jw(var15, var11, -1727408401 * bm.mh, (byte)-56) - var7, client.ep * -1886224337 + var10, -335674854);
                                    client.na.an(var44);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

            }
         } else {
            if (var0 == lm.an) {
               if (var1 != -302991134) {
                  return;
               }

               var3 = var2.cl(-812305488);
               var4 = var2.dx(-1819338821);
               var5 = var2.dd(-270768016);
               var6 = var2.db((byte)-100);
               var7 = (var6 >> 4 & 7) + 1555915261 * aa.jp;
               var8 = -191732975 * ri.jt + (var6 & 7);
               var9 = var2.cf(435772489);
               var10 = var2.cl(-1498015623);
               var11 = var2.dd(1186450642);
               var12 = var2.cm((byte)7);
               var13 = var12 >> 2;
               var14 = var12 & 3;
               var15 = client.jy[var13];
               int var16 = var2.ep(-523126268);
               int var17 = var2.eo(-1829147082);
               dv var18;
               if (var3 == -549033243 * client.mg) {
                  if (var1 != -302991134) {
                     throw new IllegalStateException();
                  }

                  var18 = lq.mi;
               } else {
                  var18 = client.mc[var3];
               }

               if (null != var18) {
                  if (var1 != -302991134) {
                     return;
                  }

                  hq var19;
                  int var20;
                  int var21;
                  label724: {
                     var19 = fw.an(var17, (short)32332);
                     if (1 != var14) {
                        if (var1 != -302991134) {
                           throw new IllegalStateException();
                        }

                        if (var14 != 3) {
                           var20 = -1339930361 * var19.av;
                           var21 = var19.ar * -1659393955;
                           break label724;
                        }

                        if (var1 != -302991134) {
                           throw new IllegalStateException();
                        }
                     }

                     var20 = -1659393955 * var19.ar;
                     var21 = var19.av * -1339930361;
                  }

                  int var22 = var7 + (var20 >> 1);
                  int var23 = var7 + (var20 + 1 >> 1);
                  int var24 = (var21 >> 1) + var8;
                  int var25 = (1 + var21 >> 1) + var8;
                  int[][] var26 = cd.af[bm.mh * -1727408401];
                  int var27 = var26[var22][var25] + var26[var23][var24] + var26[var22][var24] + var26[var23][var25] >> 2;
                  int var28 = (var7 << 7) + (var20 << 6);
                  int var29 = (var21 << 6) + (var8 << 7);
                  it var30 = var19.at(var13, var14, var26, var28, var27, var29, (byte)-58);
                  if (var30 != null) {
                     if (var1 != -302991134) {
                        return;
                     }

                     bz.jz(bm.mh * -1727408401, var7, var8, var15, -1, 0, 0, 31, var10 + 1, 1 + var16, 87894197);
                     var18.ay = (client.ep * -1886224337 + var10) * -746690647;
                     var18.ao = -377301053 * (var16 + client.ep * -1886224337);
                     var18.ah = var30;
                     var18.ax = var7 * -494827904 + -247413952 * var20;
                     var18.ag = var8 * -856229504 + var21 * -428114752;
                     var18.ai = var27 * 1514773119;
                     byte var31;
                     if (var9 > var11) {
                        if (var1 != -302991134) {
                           throw new IllegalStateException();
                        }

                        var31 = (byte)var9;
                        var9 = var11;
                        var11 = var31;
                     }

                     if (var4 > var5) {
                        var31 = (byte)var4;
                        var4 = var5;
                        var5 = var31;
                     }

                     var18.av = (var7 + var9) * -890592649;
                     var18.am = 1649066605 * (var7 + var11);
                     var18.ar = -751305383 * (var8 + var4);
                     var18.as = (var5 + var8) * 105031851;
                  }
               }
            }

            if (var0 == lm.ay) {
               if (var1 != -302991134) {
                  throw new IllegalStateException();
               } else {
                  var3 = var2.dq(-2070899692);
                  var4 = (var3 >> 4 & 7) + 1555915261 * aa.jp;
                  var5 = (var3 & 7) + -191732975 * ri.jt;
                  var6 = var2.cx(-1783503877);
                  var7 = var2.eo(-700158791);
                  var8 = var2.cx(-1832135287);
                  if (var4 >= 0 && var5 >= 0) {
                     if (var1 != -302991134) {
                        throw new IllegalStateException();
                     }

                     if (var4 < 104) {
                        if (var1 != -302991134) {
                           throw new IllegalStateException();
                        }

                        if (var5 < 104) {
                           if (var1 != -302991134) {
                              throw new IllegalStateException();
                           }

                           nh var40 = client.nr[-1727408401 * bm.mh][var4][var5];
                           if (var40 != null) {
                              if (var1 != -302991134) {
                                 return;
                              }

                              for(dx var35 = (dx)var40.aq(); var35 != null; var35 = (dx)var40.at()) {
                                 if (var1 != -302991134) {
                                    return;
                                 }

                                 if ((var7 & 32767) == 176307405 * var35.af && var8 == -1745152527 * var35.an) {
                                    if (var1 != -302991134) {
                                       throw new IllegalStateException();
                                    }

                                    var35.an = var6 * -1785382127;
                                    break;
                                 }
                              }

                              em.kd(var4, var5, 2124147832);
                           }
                        }
                     }
                  }

               }
            } else {
               dx var36;
               if (lm.aa == var0) {
                  if (var1 == -302991134) {
                     var2.db((byte)-7);
                     var3 = var2.en(383378593);
                     var4 = var2.db((byte)-83);
                     var5 = var2.cm((byte)7);
                     var6 = 1555915261 * aa.jp + (var5 >> 4 & 7);
                     var7 = ri.jt * -191732975 + (var5 & 7);
                     var8 = var2.ep(-523126268);
                     var2.da(1987255744);
                     var2.ep(-523126268);
                     var2.df(-2002150366);
                     if (var6 >= 0) {
                        if (var1 != -302991134) {
                           throw new IllegalStateException();
                        }

                        if (var7 >= 0) {
                           if (var1 != -302991134) {
                              throw new IllegalStateException();
                           }

                           if (var6 < 104) {
                              if (var1 != -302991134) {
                                 return;
                              }

                              if (var7 < 104) {
                                 if (var1 != -302991134) {
                                    throw new IllegalStateException();
                                 }

                                 var36 = new dx();
                                 var36.af = var8 * -968355835;
                                 var36.an = var3 * -1785382127;
                                 var36.af(var4, (byte)77);
                                 if (client.nr[bm.mh * -1727408401][var6][var7] == null) {
                                    client.nr[bm.mh * -1727408401][var6][var7] = new nh();
                                 }

                                 client.nr[bm.mh * -1727408401][var6][var7].an(var36);
                                 em.kd(var6, var7, 2097659653);
                              }
                           }
                        }
                     }

                  }
               } else if (var0 == lm.ab) {
                  if (var1 == -302991134) {
                     var3 = var2.cm((byte)7);
                     var4 = var2.dq(-2070899692);
                     var5 = 1555915261 * aa.jp + (var4 >> 4 & 7);
                     var6 = (var4 & 7) + -191732975 * ri.jt;
                     var7 = var2.df(-2056802803);
                     var8 = var7 >> 2;
                     var9 = var7 & 3;
                     var10 = client.jy[var8];
                     var11 = var2.da(1870761121);
                     if (var5 >= 0) {
                        if (var1 != -302991134) {
                           throw new IllegalStateException();
                        }

                        if (var6 >= 0) {
                           if (var1 != -302991134) {
                              throw new IllegalStateException();
                           }

                           if (var5 < 104) {
                              if (var1 != -302991134) {
                                 throw new IllegalStateException();
                              }

                              if (var6 < 104) {
                                 if (var1 != -302991134) {
                                    throw new IllegalStateException();
                                 }

                                 bz.jz(-1727408401 * bm.mh, var5, var6, var10, var11, var8, var9, var3, 0, -1, 87894197);
                              }
                           }
                        }
                     }

                  }
               } else {
                  nh var33;
                  if (lm.at == var0) {
                     if (var1 == -302991134) {
                        var3 = var2.df(-2140950608);
                        var4 = (var3 >> 4 & 7) + aa.jp * 1555915261;
                        var5 = (var3 & 7) + ri.jt * -191732975;
                        var6 = var2.da(2095246000);
                        var7 = var2.er(363073604);
                        if (var4 >= 0) {
                           if (var1 != -302991134) {
                              throw new IllegalStateException();
                           }

                           if (var5 >= 0 && var4 < 104) {
                              if (var1 != -302991134) {
                                 return;
                              }

                              if (var5 < 104) {
                                 if (var1 != -302991134) {
                                    throw new IllegalStateException();
                                 }

                                 var33 = client.nr[-1727408401 * bm.mh][var4][var5];
                                 if (null != var33) {
                                    for(var36 = (dx)var33.aq(); null != var36; var36 = (dx)var33.at()) {
                                       if (var1 != -302991134) {
                                          throw new IllegalStateException();
                                       }

                                       if ((var6 & 32767) == 176307405 * var36.af) {
                                          if (var1 != -302991134) {
                                             throw new IllegalStateException();
                                          }

                                          if (-1745152527 * var36.an == var7) {
                                             if (var1 != -302991134) {
                                                throw new IllegalStateException();
                                             }

                                             var36.ga();
                                             break;
                                          }
                                       }
                                    }

                                    if (var33.aq() == null) {
                                       if (var1 != -302991134) {
                                          throw new IllegalStateException();
                                       }

                                       client.nr[bm.mh * -1727408401][var4][var5] = null;
                                    }

                                    em.kd(var4, var5, 1980985022);
                                 }
                              }
                           }
                        }

                     }
                  } else {
                     if (lm.aq == var0) {
                        var3 = var2.eo(518490290);
                        var4 = var2.df(-1993215311);
                        var5 = var4 >> 4 & 15;
                        var6 = var4 & 7;
                        var7 = var2.db((byte)-76);
                        var8 = 1555915261 * aa.jp + (var7 >> 4 & 7);
                        var9 = (var7 & 7) + -191732975 * ri.jt;
                        var10 = var2.dq(-2070899692);
                        if (var8 >= 0) {
                           if (var1 != -302991134) {
                              throw new IllegalStateException();
                           }

                           if (var9 >= 0) {
                              if (var1 != -302991134) {
                                 throw new IllegalStateException();
                              }

                              if (var8 < 104) {
                                 if (var1 != -302991134) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 < 104) {
                                    if (var1 != -302991134) {
                                       throw new IllegalStateException();
                                    }

                                    var11 = var5 + 1;
                                    if (lq.mi.dy[0] >= var8 - var11) {
                                       if (var1 != -302991134) {
                                          throw new IllegalStateException();
                                       }

                                       if (lq.mi.dy[0] <= var11 + var8 && lq.mi.ds[0] >= var9 - var11) {
                                          if (var1 != -302991134) {
                                             throw new IllegalStateException();
                                          }

                                          if (lq.mi.ds[0] <= var9 + var11) {
                                             if (var1 != -302991134) {
                                                throw new IllegalStateException();
                                             }

                                             if (aj.vb.az(-1668406882) != 0) {
                                                if (var1 != -302991134) {
                                                   return;
                                                }

                                                if (var6 > 0) {
                                                   if (var1 != -302991134) {
                                                      throw new IllegalStateException();
                                                   }

                                                   if (-297150195 * client.tl < 50) {
                                                      if (var1 != -302991134) {
                                                         return;
                                                      }

                                                      client.tu[client.tl * -297150195] = var3;
                                                      client.tr[client.tl * -297150195] = var6;
                                                      client.tg[-297150195 * client.tl] = var10;
                                                      client.ti[client.tl * -297150195] = null;
                                                      client.tb[client.tl * -297150195] = (var9 << 8) + (var8 << 16) + var5;
                                                      client.tl += 831233477;
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if (var0 == lm.al) {
                        if (var1 != -302991134) {
                           throw new IllegalStateException();
                        } else {
                           var3 = var2.eo(-415611439);
                           var4 = var2.df(-2014177229);
                           var5 = (var4 >> 4 & 7) + aa.jp * 1555915261;
                           var6 = (var4 & 7) + ri.jt * -191732975;
                           var7 = var2.db((byte)-22);
                           if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                              if (var1 != -302991134) {
                                 throw new IllegalStateException();
                              }

                              var33 = client.nr[bm.mh * -1727408401][var5][var6];
                              if (null != var33) {
                                 if (var1 != -302991134) {
                                    throw new IllegalStateException();
                                 }

                                 for(var36 = (dx)var33.aq(); null != var36; var36 = (dx)var33.at()) {
                                    if (var1 != -302991134) {
                                       throw new IllegalStateException();
                                    }

                                    if ((var3 & 32767) == 176307405 * var36.af) {
                                       if (var1 != -302991134) {
                                          return;
                                       }

                                       var36.af(var7, (byte)49);
                                       break;
                                    }
                                 }
                              }
                           }

                        }
                     } else if (var0 == lm.ac) {
                        if (var1 == -302991134) {
                           var3 = var2.cm((byte)7);
                           var4 = (var3 >> 4 & 7) + aa.jp * 1555915261;
                           var5 = (var3 & 7) + ri.jt * -191732975;
                           var6 = var2.da(896063284);
                           var7 = var2.df(-2006751425);
                           var8 = var7 >> 2;
                           var9 = var7 & 3;
                           var10 = client.jy[var8];
                           if (var4 >= 0 && var5 >= 0) {
                              if (var1 != -302991134) {
                                 throw new IllegalStateException();
                              }

                              if (var4 < 103) {
                                 if (var1 != -302991134) {
                                    return;
                                 }

                                 if (var5 < 103) {
                                    if (var1 != -302991134) {
                                       throw new IllegalStateException();
                                    }

                                    if (var10 == 0) {
                                       if (var1 != -302991134) {
                                          throw new IllegalStateException();
                                       }

                                       jk var37 = bx.js.az(bm.mh * -1727408401, var4, var5);
                                       if (var37 != null) {
                                          var12 = di.at(-4009183385476919801L * var37.al);
                                          if (2 == var8) {
                                             if (var1 != -302991134) {
                                                return;
                                             }

                                             var37.ab = new ct(var12, 2, var9 + 4, -1727408401 * bm.mh, var4, var5, var6, false, var37.ab);
                                             var37.aq = new ct(var12, 2, var9 + 1 & 3, -1727408401 * bm.mh, var4, var5, var6, false, var37.aq);
                                          } else {
                                             var37.ab = new ct(var12, var8, var9, bm.mh * -1727408401, var4, var5, var6, false, var37.ab);
                                          }

                                          return;
                                       }
                                    }

                                    if (1 == var10) {
                                       je var38 = bx.js.ad(bm.mh * -1727408401, var4, var5);
                                       if (null != var38) {
                                          if (var1 != -302991134) {
                                             throw new IllegalStateException();
                                          }

                                          var12 = di.at(-4691380879163567243L * var38.aa);
                                          if (4 != var8) {
                                             if (var1 != -302991134) {
                                                throw new IllegalStateException();
                                             }

                                             if (var8 != 5) {
                                                if (6 == var8) {
                                                   if (var1 != -302991134) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var38.al = new ct(var12, 4, 4 + var9, -1727408401 * bm.mh, var4, var5, var6, false, var38.al);
                                                   return;
                                                } else {
                                                   if (7 == var8) {
                                                      if (var1 != -302991134) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var38.al = new ct(var12, 4, (2 + var9 & 3) + 4, bm.mh * -1727408401, var4, var5, var6, false, var38.al);
                                                   } else if (var8 == 8) {
                                                      if (var1 != -302991134) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var38.al = new ct(var12, 4, 4 + var9, -1727408401 * bm.mh, var4, var5, var6, false, var38.al);
                                                      var38.at = new ct(var12, 4, 4 + (2 + var9 & 3), -1727408401 * bm.mh, var4, var5, var6, false, var38.at);
                                                      return;
                                                   }

                                                   return;
                                                }
                                             }

                                             if (var1 != -302991134) {
                                                return;
                                             }
                                          }

                                          var38.al = new ct(var12, 4, var9, bm.mh * -1727408401, var4, var5, var6, false, var38.al);
                                          return;
                                       }
                                    }

                                    if (var10 == 2) {
                                       if (var1 != -302991134) {
                                          throw new IllegalStateException();
                                       }

                                       jj var39 = bx.js.ae(-1727408401 * bm.mh, var4, var5);
                                       if (11 == var8) {
                                          var8 = 10;
                                       }

                                       if (null != var39) {
                                          if (var1 != -302991134) {
                                             throw new IllegalStateException();
                                          }

                                          var39.ab = new ct(di.at(5016412888503339625L * var39.ax), var8, var9, bm.mh * -1727408401, var4, var5, var6, false, var39.ab);
                                          return;
                                       }
                                    }

                                    if (var10 == 3) {
                                       if (var1 != -302991134) {
                                          throw new IllegalStateException();
                                       }

                                       ig var41 = bx.js.ap(-1727408401 * bm.mh, var4, var5);
                                       if (var41 != null) {
                                          if (var1 != -302991134) {
                                             throw new IllegalStateException();
                                          }

                                          var41.ac = new ct(di.at(3423223696102332293L * var41.au), 22, var9, -1727408401 * bm.mh, var4, var5, var6, false, var41.ac);
                                          return;
                                       }
                                    }

                                    hu.ju(-1727408401 * bm.mh, var4, var5, var10, var6, (byte)65);
                                 }
                              }
                           }

                        }
                     } else if (lm.af == var0) {
                        if (var1 != -302991134) {
                           throw new IllegalStateException();
                        } else {
                           var3 = var2.db((byte)-78);
                           var4 = aa.jp * 1555915261 + (var3 >> 4 & 7);
                           var5 = ri.jt * -191732975 + (var3 & 7);
                           var6 = var2.cm((byte)7);
                           var7 = var6 >> 2;
                           var8 = var6 & 3;
                           var9 = client.jy[var7];
                           if (var4 >= 0) {
                              if (var1 != -302991134) {
                                 throw new IllegalStateException();
                              }

                              if (var5 >= 0) {
                                 if (var1 != -302991134) {
                                    throw new IllegalStateException();
                                 }

                                 if (var4 < 104) {
                                    if (var1 != -302991134) {
                                       throw new IllegalStateException();
                                    }

                                    if (var5 < 104) {
                                       if (var1 != -302991134) {
                                          throw new IllegalStateException();
                                       }

                                       bz.jz(-1727408401 * bm.mh, var4, var5, var9, -1, var7, var8, 31, 0, -1, 87894197);
                                    }
                                 }
                              }
                           }

                        }
                     } else if (var0 == lm.aw) {
                        if (var1 != -302991134) {
                           throw new IllegalStateException();
                        } else {
                           var3 = var2.df(-2073730188);
                           var4 = var2.cl(-1791051481);
                           var5 = var2.dq(-2070899692);
                           var6 = (var5 >> 4 & 7) + 1555915261 * aa.jp;
                           var7 = ri.jt * -191732975 + (var5 & 7);
                           var8 = var2.da(958654185);
                           if (var6 >= 0) {
                              if (var1 != -302991134) {
                                 throw new IllegalStateException();
                              }

                              if (var7 >= 0) {
                                 if (var1 != -302991134) {
                                    throw new IllegalStateException();
                                 }

                                 if (var6 < 104) {
                                    if (var1 != -302991134) {
                                       throw new IllegalStateException();
                                    }

                                    if (var7 < 104) {
                                       if (var1 != -302991134) {
                                          throw new IllegalStateException();
                                       }

                                       var6 = 128 * var6 + 64;
                                       var7 = 128 * var7 + 64;
                                       cx var34 = new cx(var8, bm.mh * -1727408401, var6, var7, fq.jw(var6, var7, bm.mh * -1727408401, (byte)-93) - var3, var4, -1886224337 * client.ep);
                                       client.np.an(var34);
                                    }
                                 }
                              }
                           }

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var32) {
         throw db.an(var32, "hx.jb(" + ')');
      }
   }

   static void ab(bm var0, on var1, on var2, int var3) {
      try {
         if (cz.di) {
            if (var3 <= 470143489) {
               throw new IllegalStateException();
            } else {
               bz.ag(var0, 626811319);
            }
         } else {
            label2674: {
               if (1 != -1222491879 * bd.ar) {
                  if (var3 <= 470143489) {
                     throw new IllegalStateException();
                  }

                  if (su.ev) {
                     break label2674;
                  }

                  if (var3 <= 470143489) {
                     return;
                  }

                  if (4 != bd.ar * -1222491879) {
                     break label2674;
                  }

                  if (var3 <= 470143489) {
                     throw new IllegalStateException();
                  }
               }

               if (2020601481 * bd.am >= 765 + cz.aw * 578342931 - 50) {
                  if (var3 <= 470143489) {
                     throw new IllegalStateException();
                  }

                  if (1163896205 * bd.as >= 453) {
                     if (var3 <= 470143489) {
                        throw new IllegalStateException();
                     }

                     aj.vb.at(!aj.vb.aa(-1197954221), -527699713);
                     if (!aj.vb.aa(-1197954221)) {
                        if (var3 <= 470143489) {
                           return;
                        }

                        sh.an(pj.fw, "scape main", "", 255, false, 435790040);
                     } else {
                        hr.au(-852125385);
                     }
                  }
               }
            }

            if (5 == -1275976559 * client.dw) {
               if (var3 <= 470143489) {
                  throw new IllegalStateException();
               }
            } else {
               if (-1L == cz.db * -7899453336143161787L) {
                  cz.db = (dq.af(732314738) + 1000L) * -8298737133189264243L;
               }

               long var4;
               boolean var6;
               label2661: {
                  var4 = dq.af(138985148);
                  if (null != client.we) {
                     if (var3 <= 470143489) {
                        return;
                     }

                     if (client.wy * -397497277 < client.we.size()) {
                        while(-397497277 * client.wy < client.we.size()) {
                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           dw var7 = (dw)client.we.get(-397497277 * client.wy);
                           if (!var7.af((byte)46)) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              var6 = false;
                              break label2661;
                           }

                           client.wy += -1719009173;
                        }

                        var6 = true;
                        break label2661;
                     }

                     if (var3 <= 470143489) {
                        return;
                     }
                  }

                  var6 = true;
               }

               if (var6) {
                  if (var3 <= 470143489) {
                     return;
                  }

                  if (-1L == cz.df * 6949275123175874863L) {
                     if (var3 <= 470143489) {
                        throw new IllegalStateException();
                     }

                     cz.df = var4 * -1178331881283680817L;
                     if (cz.df * 6949275123175874863L > -7899453336143161787L * cz.db) {
                        if (var3 <= 470143489) {
                           return;
                        }

                        cz.db = -606941742840038685L * cz.df;
                     }
                  }
               }

               if (10 != client.dw * -1275976559) {
                  if (var3 <= 470143489) {
                     throw new IllegalStateException();
                  }

                  if (-1275976559 * client.dw != 11) {
                     if (var3 <= 470143489) {
                        throw new IllegalStateException();
                     }

                     return;
                  }
               }

               int var8;
               int var9;
               int var41;
               if (fj.ck == nx.af) {
                  if (var3 <= 470143489) {
                     throw new IllegalStateException();
                  }

                  label2640: {
                     if (-1222491879 * bd.ar != 1) {
                        if (var3 <= 470143489) {
                           return;
                        }

                        if (su.ev) {
                           break label2640;
                        }

                        if (var3 <= 470143489) {
                           throw new IllegalStateException();
                        }

                        if (4 != bd.ar * -1222491879) {
                           break label2640;
                        }

                        if (var3 <= 470143489) {
                           throw new IllegalStateException();
                        }
                     }

                     var41 = 5 + 578342931 * cz.aw;
                     var8 = 463;
                     var9 = 100;
                     byte var10 = 35;
                     if (2020601481 * bd.am >= var41 && 2020601481 * bd.am <= var41 + var9) {
                        if (var3 <= 470143489) {
                           throw new IllegalStateException();
                        }

                        if (bd.as * 1163896205 >= var8) {
                           if (var3 <= 470143489) {
                              return;
                           }

                           if (bd.as * 1163896205 <= var8 + var10) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              cz.ar(2141606464);
                              return;
                           }
                        }
                     }
                  }

                  if (ao.aa != null) {
                     if (var3 <= 470143489) {
                        return;
                     }

                     cz.ar(1739913385);
                  }
               }

               var41 = -1222491879 * bd.ar;
               var8 = 2020601481 * bd.am;
               var9 = bd.as * 1163896205;
               if (var41 == 0) {
                  if (var3 <= 470143489) {
                     throw new IllegalStateException();
                  }

                  var8 = -2063363905 * bd.ay;
                  var9 = bd.ao * -1224153235;
               }

               if (!su.ev && var41 == 4) {
                  if (var3 <= 470143489) {
                     throw new IllegalStateException();
                  }

                  var41 = 1;
               }

               hy var42 = client.sh;
               hy var11 = var42;
               int var13;
               short var43;
               if (0 == cz.ce * 1145608355) {
                  if (var3 <= 470143489) {
                     return;
                  }

                  boolean var77 = false;

                  while(var11.ag(1742320284)) {
                     if (84 == var11.ai * 546317845) {
                        if (var3 <= 470143489) {
                           throw new IllegalStateException();
                        }

                        var77 = true;
                     }
                  }

                  var13 = fy.az * 950254081 - 80;
                  var43 = 291;
                  if (1 == var41) {
                     if (var3 <= 470143489) {
                        throw new IllegalStateException();
                     }

                     if (var8 >= var13 - 75) {
                        if (var3 <= 470143489) {
                           throw new IllegalStateException();
                        }

                        if (var8 <= 75 + var13) {
                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           if (var9 >= var43 - 20 && var9 <= 20 + var43) {
                              pi.af(gl.nb("secure", true, 1569639022) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, (byte)-88);
                           }
                        }
                     }
                  }

                  label2421: {
                     var13 = fy.az * 950254081 + 80;
                     if (var41 == 1) {
                        if (var3 <= 470143489) {
                           throw new IllegalStateException();
                        }

                        if (var8 >= var13 - 75) {
                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           if (var8 <= 75 + var13 && var9 >= var43 - 20) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              if (var9 <= 20 + var43) {
                                 break label2421;
                              }

                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }

                     if (!var77) {
                        return;
                     }
                  }

                  if ((-205173751 * client.ce & 33554432) != 0) {
                     if (var3 <= 470143489) {
                        return;
                     }

                     cz.ci = "";
                     cz.cs = mk.jo;
                     cz.cc = mk.jk;
                     cz.cn = mk.jq;
                     ee.ak(1, (byte)23);
                     if (client.hb && null != cz.ca) {
                        if (var3 <= 470143489) {
                           return;
                        }

                        if (cz.ca.length() > 0) {
                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           cz.dm = 1153152795;
                           return;
                        }
                     }

                     cz.dm = 0;
                  } else if ((-205173751 * client.ce & 4) != 0) {
                     if (var3 <= 470143489) {
                        throw new IllegalStateException();
                     }

                     if ((-205173751 * client.ce & 1024) != 0) {
                        cz.cs = mk.ji;
                        cz.cc = mk.jg;
                        cz.cn = mk.jx;
                     } else {
                        cz.cs = mk.ij;
                        cz.cc = mk.id;
                        cz.cn = mk.it;
                     }

                     cz.ci = mk.im;
                     ee.ak(1, (byte)104);
                     if (client.hb) {
                        if (var3 <= 470143489) {
                           return;
                        }

                        if (cz.ca != null && cz.ca.length() > 0) {
                           if (var3 <= 470143489) {
                              return;
                           }

                           cz.dm = 1153152795;
                           return;
                        }
                     }

                     cz.dm = 0;
                  } else if ((client.ce * -205173751 & 1024) != 0) {
                     if (var3 <= 470143489) {
                        throw new IllegalStateException();
                     }

                     cz.cs = mk.ix;
                     cz.cc = mk.ib;
                     cz.cn = mk.jc;
                     cz.ci = mk.im;
                     ee.ak(1, (byte)126);
                     if (client.hb && cz.ca != null) {
                        if (var3 <= 470143489) {
                           throw new IllegalStateException();
                        }

                        if (cz.ca.length() > 0) {
                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           cz.dm = 1153152795;
                           return;
                        }
                     }

                     cz.dm = 0;
                  } else {
                     aq.aa(false, 1620071571);
                  }
               } else {
                  int var12;
                  short var44;
                  if (cz.ce * 1145608355 == 1) {
                     if (var3 <= 470143489) {
                        throw new IllegalStateException();
                     }

                     while(var11.ag(2023501727)) {
                        if (var3 <= 470143489) {
                           throw new IllegalStateException();
                        }

                        if (546317845 * var11.ai == 84) {
                           aq.aa(false, 1620071571);
                        } else if (13 == 546317845 * var11.ai) {
                           ee.ak(0, (byte)29);
                        }
                     }

                     var12 = fy.az * 950254081 - 80;
                     var44 = 321;
                     if (1 == var41 && var8 >= var12 - 75 && var8 <= 75 + var12) {
                        if (var3 <= 470143489) {
                           throw new IllegalStateException();
                        }

                        if (var9 >= var44 - 20) {
                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           if (var9 <= var44 + 20) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              aq.aa(false, 1620071571);
                           }
                        }
                     }

                     var12 = 950254081 * fy.az + 80;
                     if (1 == var41) {
                        if (var3 <= 470143489) {
                           throw new IllegalStateException();
                        }

                        if (var8 >= var12 - 75) {
                           if (var3 <= 470143489) {
                              return;
                           }

                           if (var8 <= 75 + var12 && var9 >= var44 - 20 && var9 <= 20 + var44) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              ee.ak(0, (byte)91);
                           }
                        }
                     }
                  } else {
                     boolean var10000;
                     boolean var48;
                     int var49;
                     int var52;
                     char var54;
                     char var57;
                     short var59;
                     int var61;
                     boolean var65;
                     String var66;
                     if (2 == 1145608355 * cz.ce) {
                        if (var3 <= 470143489) {
                           throw new IllegalStateException();
                        }

                        var59 = 201;
                        var12 = var59 + 52;
                        if (var41 == 1) {
                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           if (var9 >= var12 - 12 && var9 < 2 + var12) {
                              if (var3 <= 470143489) {
                                 return;
                              }

                              cz.dm = 0;
                           }
                        }

                        var12 += 15;
                        if (var41 == 1 && var9 >= var12 - 12 && var9 < var12 + 2) {
                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           cz.dm = 1153152795;
                        }

                        var12 += 15;
                        var59 = 361;
                        if (null != dq.bh) {
                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           var13 = dq.bh.aw * 944313703 / 2;
                           if (var41 == 1) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              if (var8 >= dq.bh.af * -844906645 - var13) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 <= -844906645 * dq.bh.af + var13) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 >= var59 - 15) {
                                       if (var3 <= 470143489) {
                                          return;
                                       }

                                       if (var9 < var59) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          switch (-1733444455 * cz.bp) {
                                             case 1:
                                                he.ax(mk.lu, mk.lk, mk.lh, -146564225);
                                                ee.ak(5, (byte)26);
                                                return;
                                             case 2:
                                                pi.af("https://support.runescape.com/hc/en-gb", true, false, (byte)-29);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var13 = fy.az * 950254081 - 80;
                        var43 = 321;
                        if (1 == var41) {
                           if (var3 <= 470143489) {
                              return;
                           }

                           if (var8 >= var13 - 75) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              if (var8 <= 75 + var13) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 >= var43 - 20) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 <= var43 + 20) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       cz.ca = cz.ca.trim();
                                       if (cz.ca.length() == 0) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          he.ax(mk.em, mk.ew, mk.ex, 768397072);
                                          return;
                                       }

                                       if (cz.cu.length() == 0) {
                                          he.ax(mk.eh, mk.ek, mk.ey, 1781152454);
                                          return;
                                       }

                                       he.ax(mk.jm, mk.jn, mk.jd, 276154620);
                                       ag.hb(false, -1683073993);
                                       fd.hi(20, 2027900389);
                                       return;
                                    }
                                 }
                              }
                           }
                        }

                        var13 = 80 + cz.ak * 678588245 + 180;
                        if (var41 == 1) {
                           if (var3 <= 470143489) {
                              return;
                           }

                           if (var8 >= var13 - 75) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              if (var8 <= var13 + 75) {
                                 if (var3 <= 470143489) {
                                    return;
                                 }

                                 if (var9 >= var43 - 20) {
                                    if (var3 <= 470143489) {
                                       return;
                                    }

                                    if (var9 <= 20 + var43) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       ee.ak(0, (byte)12);
                                       cz.ca = "";
                                       cz.cu = "";
                                       hp.ct = 0;
                                       eo.cp = "";
                                       cz.cd = true;
                                    }
                                 }
                              }
                           }
                        }

                        label2545: {
                           var13 = -117 + 950254081 * fy.az;
                           var43 = 277;
                           if (var8 >= var13) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              if (var8 < var13 + cp.cz * 1381277089) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 >= var43) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 < hr.cw * -1649414567 + var43) {
                                       if (var3 <= 470143489) {
                                          return;
                                       }

                                       var10000 = true;
                                       break label2545;
                                    }
                                 }
                              }
                           }

                           var10000 = false;
                        }

                        cz.cj = var10000;
                        if (var41 == 1) {
                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           if (cz.cj) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              if (!client.hb) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              client.hb = var10000;
                              if (!client.hb) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (aj.vb.ae(-598675425) != null) {
                                    if (var3 <= 470143489) {
                                       return;
                                    }

                                    aj.vb.ad((String)null, -472730554);
                                 }
                              }
                           }
                        }

                        label2534: {
                           var13 = 950254081 * fy.az + 24;
                           var43 = 277;
                           if (var8 >= var13) {
                              if (var3 <= 470143489) {
                                 return;
                              }

                              if (var8 < cp.cz * 1381277089 + var13) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 >= var43) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 < var43 + hr.cw * -1649414567) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = true;
                                       break label2534;
                                    }
                                 }
                              }
                           }

                           var10000 = false;
                        }

                        cz.ch = var10000;
                        if (1 == var41) {
                           if (var3 <= 470143489) {
                              return;
                           }

                           if (cz.ch) {
                              du var93 = aj.vb;
                              boolean var92;
                              if (!aj.vb.al(-2084960938)) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 var92 = true;
                              } else {
                                 var92 = false;
                              }

                              var93.aq(var92, -1926536328);
                              if (!aj.vb.al(-2093990105)) {
                                 label2696: {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    cz.ca = "";
                                    aj.vb.ad((String)null, -472730554);
                                    if (client.hb) {
                                       if (var3 <= 470143489) {
                                          return;
                                       }

                                       if (null != cz.ca && cz.ca.length() > 0) {
                                          cz.dm = 1153152795;
                                          break label2696;
                                       }
                                    }

                                    cz.dm = 0;
                                 }
                              }
                           }
                        }

                        while(true) {
                           Transferable var63;
                           do {
                              while(true) {
                                 label2467:
                                 do {
                                    while(true) {
                                       while(var11.ag(2044586247)) {
                                          if (546317845 * var11.ai != 13) {
                                             if (-1232221421 * cz.dm != 0) {
                                                continue label2467;
                                             }

                                             if (var3 <= 470143489) {
                                                throw new IllegalStateException();
                                             }

                                             char var53 = var11.ax;

                                             for(var49 = 0; var49 < cz.dw.length(); ++var49) {
                                                if (var3 <= 470143489) {
                                                   return;
                                                }

                                                if (var53 == cz.dw.charAt(var49)) {
                                                   if (var3 <= 470143489) {
                                                      throw new IllegalStateException();
                                                   }
                                                   break;
                                                }
                                             }

                                             if (85 == 546317845 * var11.ai && cz.ca.length() > 0) {
                                                if (var3 <= 470143489) {
                                                   throw new IllegalStateException();
                                                }

                                                cz.ca = cz.ca.substring(0, cz.ca.length() - 1);
                                             }

                                             label2451: {
                                                if (84 != 546317845 * var11.ai) {
                                                   if (546317845 * var11.ai != 80) {
                                                      break label2451;
                                                   }

                                                   if (var3 <= 470143489) {
                                                      throw new IllegalStateException();
                                                   }
                                                }

                                                cz.dm = 1153152795;
                                             }

                                             var54 = var11.ax;
                                             if (cz.dw.indexOf(var54) != -1) {
                                                if (var3 <= 470143489) {
                                                   throw new IllegalStateException();
                                                }

                                                var10000 = true;
                                             } else {
                                                var10000 = false;
                                             }

                                             boolean var62 = var10000;
                                             if (var62) {
                                                if (var3 <= 470143489) {
                                                   return;
                                                }

                                                if (cz.ca.length() < 320) {
                                                   if (var3 <= 470143489) {
                                                      return;
                                                   }

                                                   cz.ca = cz.ca + var11.ax;
                                                }
                                             }
                                          } else {
                                             if (var3 <= 470143489) {
                                                throw new IllegalStateException();
                                             }

                                             ee.ak(0, (byte)84);
                                             cz.ca = "";
                                             cz.cu = "";
                                             hp.ct = 0;
                                             eo.cp = "";
                                             cz.cd = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(cz.dm * -1232221421 != 1);

                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 label2703: {
                                    if (var11.ai * 546317845 == 85) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (cz.cu.length() > 0) {
                                          cz.cu = cz.cu.substring(0, cz.cu.length() - 1);
                                          break label2703;
                                       }
                                    }

                                    if (84 != 546317845 * var11.ai) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (80 != var11.ai * 546317845) {
                                          break label2703;
                                       }

                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    cz.dm = 0;
                                    if (546317845 * var11.ai == 84) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       cz.ca = cz.ca.trim();
                                       if (cz.ca.length() == 0) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          he.ax(mk.em, mk.ew, mk.ex, 1675298225);
                                          return;
                                       }

                                       if (cz.cu.length() == 0) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          he.ax(mk.eh, mk.ek, mk.ey, -1045498386);
                                          return;
                                       }

                                       he.ax(mk.jm, mk.jn, mk.jd, -1328424461);
                                       ag.hb(false, -1913677463);
                                       fd.hi(20, 546969201);
                                       return;
                                    }
                                 }

                                 label2487: {
                                    if (!var11.av(82, -2050120872)) {
                                       if (var3 <= 470143489) {
                                          return;
                                       }

                                       if (!var11.av(87, -1218327735)) {
                                          break label2487;
                                       }

                                       if (var3 <= 470143489) {
                                          return;
                                       }
                                    }

                                    if (67 == var11.ai * 546317845) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       Clipboard var55 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                       var63 = var55.getContents(ck.bc);
                                       var52 = 20 - cz.cu.length();
                                       break;
                                    }
                                 }

                                 if (bd.an(var11.ax, 1983052490)) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    var57 = var11.ax;
                                    if (cz.dw.indexOf(var57) != -1) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = true;
                                    } else {
                                       var10000 = false;
                                    }

                                    var48 = var10000;
                                    if (var48) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (cz.cu.length() < 20) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          cz.cu = cz.cu + var11.ax;
                                       }
                                    }
                                 }
                              }
                           } while(var52 <= 0);

                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           try {
                              var66 = (String)var63.getTransferData(DataFlavor.stringFlavor);
                              var61 = Math.min(var52, var66.length());
                              int var74 = 0;

                              while(true) {
                                 if (var74 < var61) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (bd.an(var66.charAt(var74), -2111294595)) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       char var79 = var66.charAt(var74);
                                       if (cz.dw.indexOf(var79) != -1) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          var10000 = true;
                                       } else {
                                          var10000 = false;
                                       }

                                       var65 = var10000;
                                       if (var65) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          ++var74;
                                          continue;
                                       }
                                    }

                                    ee.ak(3, (byte)88);
                                    return;
                                 }

                                 cz.cu = cz.cu + var66.substring(0, var61);
                                 break;
                              }
                           } catch (UnsupportedFlavorException var37) {
                           } catch (IOException var38) {
                           }
                        }
                     } else {
                        qu var14;
                        if (1145608355 * cz.ce == 3) {
                           if (var3 <= 470143489) {
                              throw new IllegalStateException();
                           }

                           var12 = 180 + cz.ak * 678588245;
                           var44 = 241;
                           var14 = var1.av(25, mk.kh.length() - 34, mk.kh, var12, var44);
                           if (1 == var41) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              if (var14.aw(var8, var9, 917820097)) {
                                 if (var3 <= 470143489) {
                                    return;
                                 }

                                 pi.af(mk.ns, true, false, (byte)-69);
                              }
                           }

                           var12 = 180 + cz.ak * 678588245;
                           var44 = 276;
                           if (var41 == 1 && var8 >= var12 - 75) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              if (var8 <= var12 + 75) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 >= var44 - 20) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 <= 20 + var44) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       cz.ay(false, -722826482);
                                    }
                                 }
                              }
                           }

                           var12 = 180 + cz.ak * 678588245;
                           var44 = 326;
                           if (var41 == 1 && var8 >= var12 - 75) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              if (var8 <= 75 + var12 && var9 >= var44 - 20) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 <= 20 + var44) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    he.ax(mk.lu, mk.lk, mk.lh, 2047687466);
                                    ee.ak(5, (byte)77);
                                    return;
                                 }
                              }
                           }
                        } else {
                           int var46;
                           if (4 == 1145608355 * cz.ce) {
                              if (var3 <= 470143489) {
                                 return;
                              }

                              var12 = 180 + 678588245 * cz.ak - 80;
                              var44 = 321;
                              if (var41 == 1) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 >= var12 - 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= var12 + 75) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 >= var44 - 20) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          if (var9 <= 20 + var44) {
                                             if (var3 <= 470143489) {
                                                throw new IllegalStateException();
                                             }

                                             eo.cp.trim();
                                             if (eo.cp.length() != 6) {
                                                he.ax(mk.br, mk.bg, mk.bu, 1248025620);
                                                return;
                                             }

                                             hp.ct = Integer.parseInt(eo.cp) * -209153533;
                                             eo.cp = "";
                                             ag.hb(true, -153055855);
                                             he.ax(mk.jm, mk.jn, mk.jd, -1565303475);
                                             fd.hi(20, 2018553744);
                                             return;
                                          }
                                       }
                                    }
                                 }
                              }

                              if (var41 == 1 && var8 >= 678588245 * cz.ak + 180 - 9) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 <= cz.ak * 678588245 + 180 + 130) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 >= 263) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 <= 296) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          if (!cz.cd) {
                                             if (var3 <= 470143489) {
                                                return;
                                             }

                                             var10000 = true;
                                          } else {
                                             var10000 = false;
                                          }

                                          cz.cd = var10000;
                                       }
                                    }
                                 }
                              }

                              if (1 == var41 && var8 >= cz.ak * 678588245 + 180 - 34) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 <= 180 + cz.ak * 678588245 + 34) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 >= 351) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 <= 363) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          pi.af(gl.nb("secure", true, -1213010247) + "m=totp-authenticator/disableTOTPRequest", true, false, (byte)-90);
                                       }
                                    }
                                 }
                              }

                              var12 = 80 + 180 + cz.ak * 678588245;
                              if (1 == var41) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 >= var12 - 75 && var8 <= 75 + var12) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 >= var44 - 20) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 <= var44 + 20) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          ee.ak(0, (byte)4);
                                          cz.ca = "";
                                          cz.cu = "";
                                          hp.ct = 0;
                                          eo.cp = "";
                                       }
                                    }
                                 }
                              }

                              while(var11.ag(927276767)) {
                                 if (var3 <= 470143489) {
                                    return;
                                 }

                                 boolean var50 = false;

                                 for(var46 = 0; var46 < cz.dc.length(); ++var46) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var11.ax == cz.dc.charAt(var46)) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       var50 = true;
                                       break;
                                    }
                                 }

                                 if (var11.ai * 546317845 == 13) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    ee.ak(0, (byte)116);
                                    cz.ca = "";
                                    cz.cu = "";
                                    hp.ct = 0;
                                    eo.cp = "";
                                 } else {
                                    if (85 == var11.ai * 546317845 && eo.cp.length() > 0) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       eo.cp = eo.cp.substring(0, eo.cp.length() - 1);
                                    }

                                    if (var11.ai * 546317845 == 84) {
                                       eo.cp.trim();
                                       if (eo.cp.length() != 6) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          he.ax(mk.br, mk.bg, mk.bu, -978423873);
                                          return;
                                       }

                                       hp.ct = Integer.parseInt(eo.cp) * -209153533;
                                       eo.cp = "";
                                       ag.hb(true, -1077158855);
                                       he.ax(mk.jm, mk.jn, mk.jd, 588216615);
                                       fd.hi(20, 1677526702);
                                       return;
                                    }

                                    if (var50) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (eo.cp.length() < 6) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          eo.cp = eo.cp + var11.ax;
                                       }
                                    }
                                 }
                              }
                           } else if (5 == cz.ce * 1145608355) {
                              var12 = 180 + cz.ak * 678588245 - 80;
                              var44 = 321;
                              if (var41 == 1 && var8 >= var12 - 75) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 <= 75 + var12 && var9 >= var44 - 20) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 <= var44 + 20) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       cz.ca = cz.ca.trim();
                                       if (cz.ca.length() == 0) {
                                          he.ax(mk.lu, mk.lk, mk.lh, 722134294);
                                       } else {
                                          long var51 = kt.af((byte)-87);
                                          byte var47;
                                          if (var51 == 0L) {
                                             if (var3 <= 470143489) {
                                                throw new IllegalStateException();
                                             }

                                             var47 = 5;
                                          } else {
                                             var66 = cz.ca;
                                             Random var69 = new Random();
                                             sg var72 = new sg(128);
                                             sg var70 = new sg(128);
                                             int[] var75 = new int[]{var69.nextInt(), var69.nextInt(), (int)(var51 >> 32), (int)var51};
                                             var72.bu(10, (byte)34);

                                             int var78;
                                             for(var78 = 0; var78 < 4; ++var78) {
                                                if (var3 <= 470143489) {
                                                   return;
                                                }

                                                var72.ba(var69.nextInt(), -2081835031);
                                             }

                                             var72.ba(var75[0], -2081835031);
                                             var72.ba(var75[1], -2081835031);
                                             var72.bl(var51);
                                             var72.bl(0L);

                                             for(var78 = 0; var78 < 4; ++var78) {
                                                if (var3 <= 470143489) {
                                                   throw new IllegalStateException();
                                                }

                                                var72.ba(var69.nextInt(), -2081835031);
                                             }

                                             var72.dz(cv.au, cv.ab, 1086371939);
                                             var70.bu(10, (byte)12);

                                             for(var78 = 0; var78 < 3; ++var78) {
                                                var70.ba(var69.nextInt(), -2081835031);
                                             }

                                             var70.bl(var69.nextLong());
                                             var70.bv(var69.nextLong());
                                             oa.nj(var70, (byte)23);
                                             var70.bl(var69.nextLong());
                                             var70.dz(cv.au, cv.ab, 2141959936);
                                             var78 = ct.bc(var66, (byte)1);
                                             if (var78 % 8 != 0) {
                                                if (var3 <= 470143489) {
                                                   return;
                                                }

                                                var78 += 8 - var78 % 8;
                                             }

                                             sg var82 = new sg(var78);
                                             var82.bh(var66, -1772573081);
                                             var82.at = var78 * -1516355947;
                                             var82.dl(var75, -794961409);
                                             sg var86 = new sg(var82.at * -1633313603 + -1633313603 * var70.at + var72.at * -1633313603 + 5);
                                             var86.bu(2, (byte)126);
                                             var86.bu(var72.at * -1633313603, (byte)57);
                                             var86.cs(var72.al, 0, -1633313603 * var72.at, (byte)9);
                                             var86.bu(-1633313603 * var70.at, (byte)50);
                                             var86.cs(var70.al, 0, var70.at * -1633313603, (byte)36);
                                             var86.bf(-1633313603 * var82.at, (byte)-81);
                                             var86.cs(var82.al, 0, -1633313603 * var82.at, (byte)12);
                                             String var83 = jb.af(var86.al, 248570740);

                                             byte var60;
                                             try {
                                                URL var84 = new URL(gl.nb("services", false, 759571604) + "m=accountappeal/login.ws");
                                                URLConnection var85 = var84.openConnection();
                                                var85.setDoInput(true);
                                                var85.setDoOutput(true);
                                                var85.setConnectTimeout(5000);
                                                OutputStreamWriter var87 = new OutputStreamWriter(var85.getOutputStream());
                                                var87.write("data2=" + pg.af(var83, 1798518611) + "&dest=" + pg.af("passwordchoice.ws", 2110174258));
                                                var87.flush();
                                                InputStream var88 = var85.getInputStream();
                                                var86 = new sg(new byte[1000]);

                                                while(true) {
                                                   int var89 = var88.read(var86.al, -1633313603 * var86.at, 1000 - var86.at * -1633313603);
                                                   if (var89 == -1) {
                                                      if (var3 <= 470143489) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var87.close();
                                                      var88.close();
                                                      String var90 = new String(var86.al);
                                                      if (var90.startsWith("OFFLINE")) {
                                                         if (var3 <= 470143489) {
                                                            return;
                                                         }

                                                         var60 = 4;
                                                      } else if (var90.startsWith("WRONG")) {
                                                         if (var3 <= 470143489) {
                                                            throw new IllegalStateException();
                                                         }

                                                         var60 = 7;
                                                      } else if (var90.startsWith("RELOAD")) {
                                                         if (var3 <= 470143489) {
                                                            return;
                                                         }

                                                         var60 = 3;
                                                      } else if (var90.startsWith("Not permitted for social network accounts.")) {
                                                         if (var3 <= 470143489) {
                                                            throw new IllegalStateException();
                                                         }

                                                         var60 = 6;
                                                      } else {
                                                         var86.dk(var75, 2136223901);

                                                         while(-1633313603 * var86.at > 0) {
                                                            if (var3 <= 470143489) {
                                                               throw new IllegalStateException();
                                                            }

                                                            if (var86.al[var86.at * -1633313603 - 1] != 0) {
                                                               break;
                                                            }

                                                            if (var3 <= 470143489) {
                                                               throw new IllegalStateException();
                                                            }

                                                            var86.at -= -1516355947;
                                                         }

                                                         var90 = new String(var86.al, 0, var86.at * -1633313603);
                                                         if (dj.an(var90, (byte)29)) {
                                                            if (var3 <= 470143489) {
                                                               throw new IllegalStateException();
                                                            }

                                                            pi.af(var90, true, false, (byte)34);
                                                            var60 = 2;
                                                         } else {
                                                            var60 = 5;
                                                         }
                                                      }
                                                      break;
                                                   }

                                                   var86.at += -1516355947 * var89;
                                                   if (var86.at * -1633313603 >= 1000) {
                                                      var60 = 5;
                                                      break;
                                                   }
                                                }
                                             } catch (Throwable var34) {
                                                var34.printStackTrace();
                                                var60 = 5;
                                             }

                                             var47 = var60;
                                          }

                                          switch (var47) {
                                             case 2:
                                                he.ax(mk.la, mk.lp, mk.ly, 419419764);
                                                ee.ak(6, (byte)33);
                                                break;
                                             case 3:
                                                he.ax(mk.ln, mk.lt, mk.lz, 997431790);
                                                break;
                                             case 4:
                                                he.ax(mk.lc, mk.ld, mk.lq, 123915991);
                                                break;
                                             case 5:
                                                he.ax(mk.lj, mk.ll, mk.le, 1349757695);
                                                break;
                                             case 6:
                                                he.ax(mk.lb, mk.lx, mk.lo, -1994258778);
                                                break;
                                             case 7:
                                                he.ax(mk.lw, mk.lr, mk.mt, 1308965248);
                                          }
                                       }

                                       return;
                                    }
                                 }
                              }

                              var12 = cz.ak * 678588245 + 180 + 80;
                              if (var41 == 1) {
                                 if (var3 <= 470143489) {
                                    return;
                                 }

                                 if (var8 >= var12 - 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= 75 + var12) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 >= var44 - 20 && var9 <= 20 + var44) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          aq.aa(true, 1620071571);
                                       }
                                    }
                                 }
                              }

                              var43 = 361;
                              if (as.bw != null) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 var46 = 944313703 * as.bw.aw / 2;
                                 if (1 == var41) {
                                    if (var3 <= 470143489) {
                                       return;
                                    }

                                    if (var8 >= as.bw.af * -844906645 - var46) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var8 <= var46 + -844906645 * as.bw.af) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          if (var9 >= var43 - 15) {
                                             if (var3 <= 470143489) {
                                                return;
                                             }

                                             if (var9 < var43) {
                                                pi.af(gl.nb("secure", true, -924674997) + "m=weblogin/g=oldscape/cant_log_in", true, false, (byte)36);
                                             }
                                          }
                                       }
                                    }
                                 }
                              }

                              while(var11.ag(482197532)) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 var48 = false;

                                 for(var49 = 0; var49 < cz.dw.length(); ++var49) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var11.ax == cz.dw.charAt(var49)) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       var48 = true;
                                       break;
                                    }
                                 }

                                 if (546317845 * var11.ai == 13) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    aq.aa(true, 1620071571);
                                 } else {
                                    if (85 == 546317845 * var11.ai) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (cz.ca.length() > 0) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          cz.ca = cz.ca.substring(0, cz.ca.length() - 1);
                                       }
                                    }

                                    if (546317845 * var11.ai == 84) {
                                       if (var3 <= 470143489) {
                                          return;
                                       }

                                       cz.ca = cz.ca.trim();
                                       if (cz.ca.length() == 0) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          he.ax(mk.lu, mk.lk, mk.lh, 1359849800);
                                       } else {
                                          long var56 = kt.af((byte)-50);
                                          if (var56 == 0L) {
                                             if (var3 <= 470143489) {
                                                return;
                                             }

                                             var57 = 5;
                                          } else {
                                             String var71 = cz.ca;
                                             Random var67 = new Random();
                                             sg var73 = new sg(128);
                                             sg var76 = new sg(128);
                                             int[] var80 = new int[]{var67.nextInt(), var67.nextInt(), (int)(var56 >> 32), (int)var56};
                                             var73.bu(10, (byte)89);

                                             int var81;
                                             for(var81 = 0; var81 < 4; ++var81) {
                                                if (var3 <= 470143489) {
                                                   throw new IllegalStateException();
                                                }

                                                var73.ba(var67.nextInt(), -2081835031);
                                             }

                                             var73.ba(var80[0], -2081835031);
                                             var73.ba(var80[1], -2081835031);
                                             var73.bl(var56);
                                             var73.bl(0L);

                                             for(var81 = 0; var81 < 4; ++var81) {
                                                if (var3 <= 470143489) {
                                                   throw new IllegalStateException();
                                                }

                                                var73.ba(var67.nextInt(), -2081835031);
                                             }

                                             var73.dz(cv.au, cv.ab, 1415011410);
                                             var76.bu(10, (byte)93);

                                             for(var81 = 0; var81 < 3; ++var81) {
                                                if (var3 <= 470143489) {
                                                   return;
                                                }

                                                var76.ba(var67.nextInt(), -2081835031);
                                             }

                                             var76.bl(var67.nextLong());
                                             var76.bv(var67.nextLong());
                                             oa.nj(var76, (byte)59);
                                             var76.bl(var67.nextLong());
                                             var76.dz(cv.au, cv.ab, 288155835);
                                             var81 = ct.bc(var71, (byte)-31);
                                             if (0 != var81 % 8) {
                                                if (var3 <= 470143489) {
                                                   return;
                                                }

                                                var81 += 8 - var81 % 8;
                                             }

                                             sg var26 = new sg(var81);
                                             var26.bh(var71, -1762977062);
                                             var26.at = var81 * -1516355947;
                                             var26.dl(var80, -794961409);
                                             sg var27 = new sg(5 + var73.at * -1633313603 + -1633313603 * var76.at + -1633313603 * var26.at);
                                             var27.bu(2, (byte)40);
                                             var27.bu(-1633313603 * var73.at, (byte)63);
                                             var27.cs(var73.al, 0, var73.at * -1633313603, (byte)30);
                                             var27.bu(var76.at * -1633313603, (byte)82);
                                             var27.cs(var76.al, 0, var76.at * -1633313603, (byte)39);
                                             var27.bf(var26.at * -1633313603, (byte)-62);
                                             var27.cs(var26.al, 0, var26.at * -1633313603, (byte)116);
                                             String var28 = jb.af(var27.al, -668340515);

                                             try {
                                                URL var29 = new URL(gl.nb("services", false, -780712494) + "m=accountappeal/login.ws");
                                                URLConnection var30 = var29.openConnection();
                                                var30.setDoInput(true);
                                                var30.setDoOutput(true);
                                                var30.setConnectTimeout(5000);
                                                OutputStreamWriter var31 = new OutputStreamWriter(var30.getOutputStream());
                                                var31.write("data2=" + pg.af(var28, 1796508444) + "&dest=" + pg.af("passwordchoice.ws", 1761854811));
                                                var31.flush();
                                                InputStream var32 = var30.getInputStream();
                                                var27 = new sg(new byte[1000]);

                                                while(true) {
                                                   int var33 = var32.read(var27.al, var27.at * -1633313603, 1000 - var27.at * -1633313603);
                                                   if (var33 == -1) {
                                                      if (var3 <= 470143489) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var31.close();
                                                      var32.close();
                                                      String var91 = new String(var27.al);
                                                      if (var91.startsWith("OFFLINE")) {
                                                         if (var3 <= 470143489) {
                                                            throw new IllegalStateException();
                                                         }

                                                         var61 = 4;
                                                      } else if (var91.startsWith("WRONG")) {
                                                         if (var3 <= 470143489) {
                                                            return;
                                                         }

                                                         var61 = 7;
                                                      } else if (var91.startsWith("RELOAD")) {
                                                         if (var3 <= 470143489) {
                                                            throw new IllegalStateException();
                                                         }

                                                         var61 = 3;
                                                      } else if (var91.startsWith("Not permitted for social network accounts.")) {
                                                         if (var3 <= 470143489) {
                                                            return;
                                                         }

                                                         var61 = 6;
                                                      } else {
                                                         var27.dk(var80, 1836270491);

                                                         while(var27.at * -1633313603 > 0) {
                                                            if (var3 <= 470143489) {
                                                               return;
                                                            }

                                                            if (0 != var27.al[var27.at * -1633313603 - 1]) {
                                                               break;
                                                            }

                                                            var27.at -= -1516355947;
                                                         }

                                                         var91 = new String(var27.al, 0, var27.at * -1633313603);
                                                         if (dj.an(var91, (byte)-35)) {
                                                            if (var3 <= 470143489) {
                                                               throw new IllegalStateException();
                                                            }

                                                            pi.af(var91, true, false, (byte)7);
                                                            var61 = 2;
                                                         } else {
                                                            var61 = 5;
                                                         }
                                                      }
                                                      break;
                                                   }

                                                   var27.at += -1516355947 * var33;
                                                   if (var27.at * -1633313603 >= 1000) {
                                                      var61 = 5;
                                                      break;
                                                   }
                                                }
                                             } catch (Throwable var35) {
                                                var35.printStackTrace();
                                                var61 = 5;
                                             }

                                             var57 = (char)var61;
                                          }

                                          switch (var57) {
                                             case '\u0002':
                                                he.ax(mk.la, mk.lp, mk.ly, -649432621);
                                                ee.ak(6, (byte)90);
                                                break;
                                             case '\u0003':
                                                he.ax(mk.ln, mk.lt, mk.lz, 399291060);
                                                break;
                                             case '\u0004':
                                                he.ax(mk.lc, mk.ld, mk.lq, -1884623678);
                                                break;
                                             case '\u0005':
                                                he.ax(mk.lj, mk.ll, mk.le, -379104814);
                                                break;
                                             case '\u0006':
                                                he.ax(mk.lb, mk.lx, mk.lo, 1453387582);
                                                break;
                                             case '\u0007':
                                                he.ax(mk.lw, mk.lr, mk.mt, 1232865133);
                                          }
                                       }

                                       return;
                                    }

                                    if (var48) {
                                       if (var3 <= 470143489) {
                                          return;
                                       }

                                       if (cz.ca.length() < 320) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          cz.ca = cz.ca + var11.ax;
                                       }
                                    }
                                 }
                              }
                           } else if (1145608355 * cz.ce == 6) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              while(true) {
                                 do {
                                    if (!var11.ag(1110121216)) {
                                       var59 = 321;
                                       if (var41 == 1) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          if (var9 >= var59 - 20) {
                                             if (var3 <= 470143489) {
                                                throw new IllegalStateException();
                                             }

                                             if (var9 <= 20 + var59) {
                                                aq.aa(true, 1620071571);
                                             }

                                             return;
                                          }
                                       }

                                       return;
                                    }

                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }
                                 } while(84 != 546317845 * var11.ai && 546317845 * var11.ai != 13);

                                 aq.aa(true, 1620071571);
                              }
                           } else if (cz.ce * 1145608355 == 7) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              if (jb.ds) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (!client.cy) {
                                    var12 = fy.az * 950254081 - 150;
                                    var13 = 40 + var12 + 240 + 25;
                                    var43 = 231;
                                    var46 = 40 + var43;
                                    if (var41 == 1 && var8 >= var12) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var8 <= var13) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          if (var9 >= var43) {
                                             if (var3 <= 470143489) {
                                                return;
                                             }

                                             if (var9 <= var46) {
                                                if (var3 <= 470143489) {
                                                   throw new IllegalStateException();
                                                }

                                                var52 = var12;

                                                label2599: {
                                                   for(int var18 = 0; var18 < 8; ++var18) {
                                                      if (var3 <= 470143489) {
                                                         return;
                                                      }

                                                      if (var8 <= var52 + 30) {
                                                         if (var3 <= 470143489) {
                                                            throw new IllegalStateException();
                                                         }

                                                         var49 = var18;
                                                         break label2599;
                                                      }

                                                      byte var10001;
                                                      label2595: {
                                                         var52 += 30;
                                                         if (var18 != 1) {
                                                            if (3 != var18) {
                                                               var10001 = 5;
                                                               break label2595;
                                                            }

                                                            if (var3 <= 470143489) {
                                                               throw new IllegalStateException();
                                                            }
                                                         }

                                                         var10001 = 20;
                                                      }

                                                      var52 += var10001;
                                                   }

                                                   var49 = 0;
                                                }

                                                cz.cq = var49 * 1670187551;
                                             }
                                          }
                                       }
                                    }

                                    var49 = 678588245 * cz.ak + 180 - 80;
                                    var54 = 321;
                                    Date var19;
                                    Date var20;
                                    SimpleDateFormat var21;
                                    StringBuilder var22;
                                    String[] var23;
                                    int var24;
                                    String var25;
                                    boolean var58;
                                    boolean var64;
                                    Date var68;
                                    if (var41 == 1) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var8 >= var49 - 75) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          if (var8 <= 75 + var49) {
                                             if (var3 <= 470143489) {
                                                throw new IllegalStateException();
                                             }

                                             if (var9 >= var54 - 20) {
                                                if (var3 <= 470143489) {
                                                   throw new IllegalStateException();
                                                }

                                                if (var9 <= 20 + var54) {
                                                   if (var3 <= 470143489) {
                                                      return;
                                                   }

                                                   label2571: {
                                                      try {
                                                         var21 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                                         var21.setLenient(false);
                                                         var22 = new StringBuilder();
                                                         var23 = cz.cm;

                                                         label2566: {
                                                            for(var24 = 0; var24 < var23.length; ++var24) {
                                                               if (var3 <= 470143489) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var25 = var23[var24];
                                                               if (var25 == null) {
                                                                  if (var3 <= 470143489) {
                                                                     throw new IllegalStateException();
                                                                  }

                                                                  ju.at("Date not valid.", "Please ensure all characters are populated.", "", 5766018);
                                                                  var20 = null;
                                                                  break label2566;
                                                               }

                                                               var22.append(var25);
                                                            }

                                                            var22.append("12");
                                                            var20 = var21.parse(var22.toString());
                                                         }

                                                         var19 = var20;
                                                      } catch (ParseException var39) {
                                                         ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 965364135);
                                                         var58 = false;
                                                         break label2571;
                                                      }

                                                      if (var19 == null) {
                                                         if (var3 <= 470143489) {
                                                            return;
                                                         }

                                                         var58 = false;
                                                      } else {
                                                         var64 = do.al(var19, 1164059747);
                                                         var68 = ep.aq(2052817619);
                                                         var65 = var19.after(var68);
                                                         if (!var65) {
                                                            if (var3 <= 470143489) {
                                                               throw new IllegalStateException();
                                                            }

                                                            ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -742505913);
                                                            var58 = false;
                                                         } else {
                                                            if (!var64) {
                                                               if (var3 <= 470143489) {
                                                                  return;
                                                               }

                                                               oj.ck = 1974420353;
                                                            } else {
                                                               oj.ck = (int)(var19.getTime() / 86400000L - 11745L) * -909067137;
                                                            }

                                                            var58 = true;
                                                         }
                                                      }
                                                   }

                                                   if (var58) {
                                                      if (var3 <= 470143489) {
                                                         throw new IllegalStateException();
                                                      }

                                                      fd.hi(50, 1831885711);
                                                      return;
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }

                                    var49 = 80 + cz.ak * 678588245 + 180;
                                    if (1 == var41 && var8 >= var49 - 75) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var8 <= var49 + 75 && var9 >= var54 - 20 && var9 <= var54 + 20) {
                                          cz.cm = new String[8];
                                          aq.aa(true, 1620071571);
                                       }
                                    }

                                    do {
                                       if (!var11.ag(1763615547)) {
                                          return;
                                       }

                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (101 == 546317845 * var11.ai) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          cz.cm[cz.cq * -1262226977] = null;
                                       }

                                       if (546317845 * var11.ai == 85) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          if (null == cz.cm[-1262226977 * cz.cq]) {
                                             if (var3 <= 470143489) {
                                                return;
                                             }

                                             if (-1262226977 * cz.cq > 0) {
                                                if (var3 <= 470143489) {
                                                   throw new IllegalStateException();
                                                }

                                                cz.cq -= 1670187551;
                                             }
                                          }

                                          cz.cm[cz.cq * -1262226977] = null;
                                       }

                                       if (var11.ax >= '0') {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          if (var11.ax <= '9') {
                                             if (var3 <= 470143489) {
                                                throw new IllegalStateException();
                                             }

                                             cz.cm[-1262226977 * cz.cq] = "" + var11.ax;
                                             if (-1262226977 * cz.cq < 7) {
                                                cz.cq += 1670187551;
                                             }
                                          }
                                       }
                                    } while(546317845 * var11.ai != 84);

                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    label2267: {
                                       try {
                                          var21 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                          var21.setLenient(false);
                                          var22 = new StringBuilder();
                                          var23 = cz.cm;

                                          label2262: {
                                             for(var24 = 0; var24 < var23.length; ++var24) {
                                                if (var3 <= 470143489) {
                                                   throw new IllegalStateException();
                                                }

                                                var25 = var23[var24];
                                                if (var25 == null) {
                                                   if (var3 <= 470143489) {
                                                      throw new IllegalStateException();
                                                   }

                                                   ju.at("Date not valid.", "Please ensure all characters are populated.", "", -2050253005);
                                                   var20 = null;
                                                   break label2262;
                                                }

                                                var22.append(var25);
                                             }

                                             var22.append("12");
                                             var20 = var21.parse(var22.toString());
                                          }

                                          var19 = var20;
                                       } catch (ParseException var36) {
                                          ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -1927944409);
                                          var58 = false;
                                          break label2267;
                                       }

                                       if (var19 == null) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          var58 = false;
                                       } else {
                                          var64 = do.al(var19, 1718619538);
                                          var68 = ep.aq(2052817619);
                                          var65 = var19.after(var68);
                                          if (!var65) {
                                             if (var3 <= 470143489) {
                                                return;
                                             }

                                             ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -1102077499);
                                             var58 = false;
                                          } else {
                                             if (!var64) {
                                                if (var3 <= 470143489) {
                                                   return;
                                                }

                                                oj.ck = 1974420353;
                                             } else {
                                                oj.ck = (int)(var19.getTime() / 86400000L - 11745L) * -909067137;
                                             }

                                             var58 = true;
                                          }
                                       }
                                    }

                                    if (var58) {
                                       fd.hi(50, 1595584685);
                                    }

                                    return;
                                 }
                              }

                              var12 = 678588245 * cz.ak + 180 - 80;
                              var44 = 321;
                              if (1 == var41) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 >= var12 - 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= var12 + 75) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 >= var44 - 20) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          if (var9 <= 20 + var44) {
                                             if (var3 <= 470143489) {
                                                return;
                                             }

                                             pi.af(gl.nb("secure", true, -507060556) + "m=dob/set_dob.ws", true, false, (byte)49);
                                             he.ax(mk.ls, mk.lf, mk.li, -1881776508);
                                             ee.ak(6, (byte)37);
                                             return;
                                          }
                                       }
                                    }
                                 }
                              }

                              var12 = 80 + cz.ak * 678588245 + 180;
                              if (var41 == 1) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 >= var12 - 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= var12 + 75) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 >= var44 - 20) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          if (var9 <= var44 + 20) {
                                             if (var3 <= 470143489) {
                                                throw new IllegalStateException();
                                             }

                                             aq.aa(true, 1620071571);
                                          }
                                       }
                                    }
                                 }
                              }
                           } else if (8 == 1145608355 * cz.ce) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              var12 = cz.ak * 678588245 + 180 - 80;
                              var13 = 321;
                              if (var41 == 1) {
                                 if (var3 <= 470143489) {
                                    return;
                                 }

                                 if (var8 >= var12 - 75) {
                                    if (var3 <= 470143489) {
                                       return;
                                    }

                                    if (var8 <= var12 + 75) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 >= var13 - 20) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          if (var9 <= var13 + 20) {
                                             if (var3 <= 470143489) {
                                                throw new IllegalStateException();
                                             }

                                             pi.af("https://www.jagex.com/terms/privacy", true, false, (byte)20);
                                             he.ax(mk.ls, mk.lf, mk.li, -958757129);
                                             ee.ak(6, (byte)14);
                                             return;
                                          }
                                       }
                                    }
                                 }
                              }

                              var12 = 80 + cz.ak * 678588245 + 180;
                              if (1 == var41 && var8 >= var12 - 75 && var8 <= var12 + 75 && var9 >= var13 - 20 && var9 <= var13 + 20) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 aq.aa(true, 1620071571);
                              }
                           } else if (9 == 1145608355 * cz.ce) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              var12 = 180 + 678588245 * cz.ak;
                              var13 = 311;
                              if (84 != var42.ai * 546317845 && var42.ai * 546317845 != 13) {
                                 if (var3 <= 470143489) {
                                    return;
                                 }

                                 if (1 != var41) {
                                    return;
                                 }

                                 if (var3 <= 470143489) {
                                    return;
                                 }

                                 if (var8 < var12 - 75 || var8 > 75 + var12 || var9 < var13 - 20) {
                                    return;
                                 }

                                 if (var3 <= 470143489) {
                                    return;
                                 }

                                 if (var9 > var13 + 20) {
                                    return;
                                 }

                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }
                              }

                              cz.ay(false, -1009088416);
                           } else if (10 == cz.ce * 1145608355) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              var12 = cz.ak * 678588245 + 180;
                              var13 = 209;
                              if (546317845 * var42.ai != 84) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (1 != var41) {
                                    return;
                                 }

                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 < var12 - 109) {
                                    return;
                                 }

                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 > 109 + var12) {
                                    return;
                                 }

                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 < var13) {
                                    return;
                                 }

                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 > var13 + 68) {
                                    return;
                                 }
                              }

                              he.ax(mk.jm, mk.jn, mk.jd, 1802608095);
                              client.gy = sr.an;
                              ag.hb(false, -866931312);
                              fd.hi(20, 955343689);
                           } else if (1145608355 * cz.ce == 12) {
                              var12 = fy.az * 950254081;
                              var13 = 233;
                              var14 = var2.av(0, 30, mk.ma, var12, var13);
                              qu var15 = var2.av(32, 32, mk.ma, var12, var13);
                              qu var16 = var2.av(70, 34, mk.ma, var12, var13);
                              var13 += 17;
                              qu var17 = var2.av(0, 34, mk.mp, var12, var13);
                              if (var41 == 1) {
                                 if (var3 <= 470143489) {
                                    return;
                                 }

                                 if (var14.aw(var8, var9, 917820097)) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    pi.af("https://www.jagex.com/terms", true, false, (byte)8);
                                 } else if (var15.aw(var8, var9, 917820097)) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    pi.af("https://www.jagex.com/terms/privacy", true, false, (byte)-55);
                                 } else {
                                    label2775: {
                                       if (!var16.aw(var8, var9, 917820097)) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          if (!var17.aw(var8, var9, 917820097)) {
                                             break label2775;
                                          }
                                       }

                                       pi.af("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false, (byte)7);
                                    }
                                 }
                              }

                              var12 = fy.az * 950254081 - 80;
                              var44 = 311;
                              if (1 == var41) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 >= var12 - 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= var12 + 75) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 >= var44 - 20 && var9 <= var44 + 20) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          aj.vb.ap(client.cl * 976454555, -1008471336);
                                          cz.ay(true, -1938544859);
                                       }
                                    }
                                 }
                              }

                              var12 = fy.az * 950254081 + 80;
                              if (1 == var41) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 >= var12 - 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= 75 + var12) {
                                       if (var3 <= 470143489) {
                                          return;
                                       }

                                       if (var9 >= var44 - 20 && var9 <= var44 + 20) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          cz.ce = 127737743;
                                       }
                                    }
                                 }
                              }
                           } else if (1145608355 * cz.ce == 13) {
                              if (var3 <= 470143489) {
                                 return;
                              }

                              var12 = fy.az * 950254081;
                              var44 = 321;
                              if (1 == var41) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 >= var12 - 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= 75 + var12 && var9 >= var44 - 20 && var9 <= var44 + 20) {
                                       cz.ay(true, -1810987380);
                                    }
                                 }
                              }
                           } else if (1145608355 * cz.ce == 14) {
                              if (var3 <= 470143489) {
                                 return;
                              }

                              String var45 = "";
                              switch (-1478945003 * cz.ba) {
                                 case 0:
                                    var45 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                    break;
                                 case 1:
                                    var45 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                    break;
                                 case 2:
                                    var45 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                    break;
                                 default:
                                    aq.aa(false, 1620071571);
                              }

                              var13 = 678588245 * cz.ak + 180;
                              var43 = 276;
                              if (1 == var41) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 >= var13 - 75) {
                                    if (var3 <= 470143489) {
                                       return;
                                    }

                                    if (var8 <= 75 + var13 && var9 >= var43 - 20) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 <= var43 + 20) {
                                          pi.af(var45, true, false, (byte)-4);
                                          he.ax(mk.ls, mk.lf, mk.li, 443307107);
                                          ee.ak(6, (byte)81);
                                          return;
                                       }
                                    }
                                 }
                              }

                              var13 = cz.ak * 678588245 + 180;
                              var43 = 326;
                              if (var41 == 1) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 >= var13 - 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= var13 + 75) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 >= var43 - 20) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          if (var9 <= var43 + 20) {
                                             if (var3 <= 470143489) {
                                                throw new IllegalStateException();
                                             }

                                             aq.aa(false, 1620071571);
                                          }
                                       }
                                    }
                                 }
                              }
                           } else if (24 == cz.ce * 1145608355) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              var12 = cz.ak * 678588245 + 180;
                              var44 = 301;
                              if (1 == var41) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 >= var12 - 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= var12 + 75) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 >= var44 - 20 && var9 <= var44 + 20) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          cz.ay(false, -1103171427);
                                       }
                                    }
                                 }
                              }
                           } else if (32 == cz.ce * 1145608355) {
                              if (var3 <= 470143489) {
                                 throw new IllegalStateException();
                              }

                              var12 = 180 + 678588245 * cz.ak - 80;
                              var44 = 321;
                              if (var41 == 1 && var8 >= var12 - 75) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 <= var12 + 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 >= var44 - 20) {
                                       if (var3 <= 470143489) {
                                          return;
                                       }

                                       if (var9 <= var44 + 20) {
                                          if (var3 <= 470143489) {
                                             throw new IllegalStateException();
                                          }

                                          pi.af(gl.nb("secure", true, -345793959) + "m=dob/set_dob.ws", true, false, (byte)35);
                                          he.ax(mk.ls, mk.lf, mk.li, -1330806732);
                                          ee.ak(6, (byte)73);
                                          return;
                                       }
                                    }
                                 }
                              }

                              var12 = 80 + 180 + cz.ak * 678588245;
                              if (1 == var41) {
                                 if (var3 <= 470143489) {
                                    return;
                                 }

                                 if (var8 >= var12 - 75 && var8 <= 75 + var12) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 >= var44 - 20) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 <= var44 + 20) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          aq.aa(true, 1620071571);
                                       }
                                    }
                                 }
                              }
                           } else if (1145608355 * cz.ce == 33) {
                              if (var3 <= 470143489) {
                                 return;
                              }

                              var12 = 180 + cz.ak * 678588245;
                              var44 = 276;
                              if (var41 == 1) {
                                 if (var3 <= 470143489) {
                                    return;
                                 }

                                 if (var8 >= var12 - 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= 75 + var12 && var9 >= var44 - 20) {
                                       if (var3 <= 470143489) {
                                          return;
                                       }

                                       if (var9 <= 20 + var44) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          pi.af(mk.ns, true, false, (byte)-108);
                                       }
                                    }
                                 }
                              }

                              var12 = 180 + 678588245 * cz.ak;
                              var44 = 326;
                              if (1 == var41) {
                                 if (var3 <= 470143489) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 >= var12 - 75) {
                                    if (var3 <= 470143489) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= 75 + var12) {
                                       if (var3 <= 470143489) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 >= var44 - 20) {
                                          if (var3 <= 470143489) {
                                             return;
                                          }

                                          if (var9 <= var44 + 20) {
                                             if (var3 <= 470143489) {
                                                return;
                                             }

                                             aq.aa(true, 1620071571);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      } catch (RuntimeException var40) {
         throw db.an(var40, "hx.ab(" + ')');
      }
   }

   void aw(sg var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (var3 == 0) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ac(var1, var3, -1230554018);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hx.aw(" + ')');
      }
   }
}
