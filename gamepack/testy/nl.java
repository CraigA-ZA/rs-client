import accessors.RSNetCache;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.zip.CRC32;

public class nl implements RSNetCache {
   static int ak = -2072522323;
   static nd[] aj = new nd[256];
   public static ph af;
   public static rc ac = new rc(4096);
   public static int au = 0;
   public static rc ab = new rc(32);
   public static int aq = 0;
   public static ni al = new ni();
   public static rc at = new rc(4096);
   static boolean ax;
   public static rc ay = new rc(4096);
   public static int ao = 0;
   public static int an = 0;
   public static sg ag = new sg(8);
   public static sg ah;
   public static int av = 0;
   static CRC32 am = new CRC32();
   public static byte ad = 0;
   public static int aa = 0;
   static int az = -1684033519;
   static final int cv = 28;
   public static long aw;
   public static int ap = 0;
   public static int ae = 0;

   static int av(int var0, int var1) {
      long var2 = (long)(var1 + (var0 << 16));
      return ch.ai != null && ch.ai.hr == var2 ? 1819487879 * ah.at / (ah.al.length - ch.ai.aw) + 1 : 0;
   }

   public static boolean aq() {
      long var0 = dq.af(1647883261);
      int var2 = (int)(var0 - -2114584129517998633L * aw);
      aw = -6047020038529116697L * var0;
      if (var2 > 200) {
         var2 = 200;
      }

      an += var2 * -1186998915;
      if (ao * -1651605431 == 0 && 0 == aq * 82060807 && 0 == -32010957 * aa && 0 == au * 474505778) {
         return true;
      } else if (af == null) {
         return false;
      } else {
         try {
            if (an * -942339237 > 331164043) {
               throw new IOException();
            } else {
               no var3;
               sg var4;
               while(-1952694793 * aq < -1738003801 && au * -1599103042 > 0) {
                  var3 = (no)ac.aw();
                  var4 = new sg(4);
                  var4.bu(1, (byte)119);
                  var4.bq((int)var3.hr, -505576272);
                  af.ab(var4.al, 0, 4, -2115422184);
                  ab.an(var3, var3.hr);
                  au -= 697974660;
                  aq += -1691554512;
               }

               while(ao * -1651605431 < -1363234906 && aa * -1882975813 > 0) {
                  var3 = (no)al.aw();
                  var4 = new sg(4);
                  var4.bu(0, (byte)104);
                  var4.bq((int)var3.hr, 1726817401);
                  af.ab(var4.al, 0, 4, -2115422184);
                  var3.fs();
                  ay.an(var3, var3.hr);
                  aa -= -2069940741;
                  ao += -1839725562;
               }

               for(int var18 = 0; var18 < -1016290497; ++var18) {
                  int var19 = af.aw(1221276115);
                  if (var19 < 0) {
                     throw new IOException();
                  }

                  if (0 == var19) {
                     break;
                  }

                  an = 0;
                  byte var5 = 0;
                  if (ch.ai == null) {
                     var5 = 8;
                  } else if (0 == av * -1809971006) {
                     var5 = 1;
                  }

                  int var6;
                  int var7;
                  int var8;
                  int var10;
                  byte[] var10000;
                  int var10001;
                  sg var22;
                  if (var5 > 0) {
                     var6 = var5 - ag.at * 1285177419;
                     if (var6 > var19) {
                        var6 = var19;
                     }

                     af.au(ag.al, -1633313603 * ag.at, var6, -2106093590);
                     if (0 != ad) {
                        for(var7 = 0; var7 < var6; ++var7) {
                           var10000 = ag.al;
                           var10001 = -1714231203 * ag.at + var7;
                           var10000[var10001] ^= ad;
                        }
                     }

                     var22 = ag;
                     var22.at += var6 * 1827547965;
                     if (-1633313603 * ag.at < var5) {
                        break;
                     }

                     if (null == ch.ai) {
                        ag.at = 0;
                        var7 = ag.cm((byte)7);
                        var8 = ag.cl(-1161614083);
                        int var9 = ag.cm((byte)7);
                        var10 = ag.cx(-1213412388);
                        long var11 = (long)((var7 << 16) + var8);
                        no var13 = (no)ab.af(var11);
                        ax = true;
                        if (var13 == null) {
                           var13 = (no)ay.af(var11);
                           ax = false;
                        }

                        if (null == var13) {
                           throw new IOException();
                        }

                        int var14 = 0 == var9 ? 5 : 9;
                        ch.ai = var13;
                        ah = new sg(var14 + var10 + ch.ai.aw);
                        ah.bu(var9, (byte)26);
                        ah.ba(var10, -2081835031);
                        av = -598099048;
                        ag.at = 0;
                     } else if (av * -1961769541 == 0) {
                        if (-1 == ag.al[0]) {
                           av = -814483516;
                           ag.at = 0;
                        } else {
                           ch.ai = null;
                        }
                     }
                  } else {
                     var6 = ah.al.length - ch.ai.aw;
                     var7 = 512 - av * -1961769541;
                     if (var7 > var6 - ah.at * -5564816) {
                        var7 = var6 - ah.at * -1633313603;
                     }

                     if (var7 > var19) {
                        var7 = var19;
                     }

                     af.au(ah.al, ah.at * -1633313603, var7, -2106093590);
                     if (0 != ad) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           var10000 = ah.al;
                           var10001 = var8 + -1633313603 * ah.at;
                           var10000[var10001] ^= ad;
                        }
                     }

                     var22 = ah;
                     var22.at += var7 * -1516355947;
                     av += 714951213 * var7;
                     if (var6 == ah.at * -1633313603) {
                        if (ch.ai.hr == 16711935L) {
                           cz.as = ah;

                           for(var8 = 0; var8 < 1183593763; ++var8) {
                              nd var20 = aj[var8];
                              if (var20 != null) {
                                 cz.as.at = var8 * 21258836 + 191583781;
                                 if (-1633313603 * cz.as.at >= cz.as.al.length) {
                                    if (!var20.ah) {
                                       throw new RuntimeException("");
                                    }

                                    var20.au((byte)-32);
                                 } else {
                                    var10 = cz.as.cx(-1245400428);
                                    int var21 = cz.as.cx(-1947715362);
                                    var20.ab(var10, var21, -691028);
                                 }
                              }
                           }
                        } else {
                           am.reset();
                           am.update(ah.al, 0, var6);
                           var8 = (int)am.getValue();
                           if (var8 != ch.ai.an * -75260527) {
                              try {
                                 af.aq(1413634892);
                              } catch (Exception var16) {
                              }

                              ae += 372675253;
                              af = null;
                              ad = (byte)((int)(Math.random() * 255.0 + 1.0));
                              return false;
                           }

                           ae = 0;
                           ap = 0;
                           ch.ai.af.aq((int)(ch.ai.hr & 65535L), ah.al, 16711680L == (ch.ai.hr & 16711680L), ax, 1914755224);
                        }

                        ch.ai.ga();
                        if (ax) {
                           aq -= -558808582;
                        } else {
                           ao -= -979537415;
                        }

                        av = 0;
                        ch.ai = null;
                        ah = null;
                     } else {
                        if (-1961769541 * av != 753693866) {
                           break;
                        }

                        av = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var17) {
            try {
               af.aq(1043065132);
            } catch (Exception var15) {
            }

            ap += -161323731;
            af = null;
            return false;
         }
      }
   }

   public static boolean al() {
      long var0 = dq.af(2088734227);
      int var2 = (int)(var0 - -2114584129517998633L * aw);
      aw = -6047020038529116697L * var0;
      if (var2 > 200) {
         var2 = 200;
      }

      an += var2 * -425972525;
      if (ao * -1651605431 == 0 && 0 == aq * -1952694793 && 0 == -32010957 * aa && 0 == au * -1171541559) {
         return true;
      } else if (af == null) {
         return false;
      } else {
         try {
            if (an * -942339237 > 30000) {
               throw new IOException();
            } else {
               no var3;
               sg var4;
               while(-1952694793 * aq < 200 && au * -1171541559 > 0) {
                  var3 = (no)ac.aw();
                  var4 = new sg(4);
                  var4.bu(1, (byte)8);
                  var4.bq((int)var3.hr, -890874726);
                  af.ab(var4.al, 0, 4, -2115422184);
                  ab.an(var3, var3.hr);
                  au -= -1320339335;
                  aq += -1677618233;
               }

               while(ao * -1651605431 < 200 && aa * -32010957 > 0) {
                  var3 = (no)al.aw();
                  var4 = new sg(4);
                  var4.bu(0, (byte)88);
                  var4.bq((int)var3.hr, -636926537);
                  af.ab(var4.al, 0, 4, -2115422184);
                  var3.fs();
                  ay.an(var3, var3.hr);
                  aa -= -2069940741;
                  ao += -979537415;
               }

               for(int var18 = 0; var18 < 100; ++var18) {
                  int var19 = af.aw(1689099129);
                  if (var19 < 0) {
                     throw new IOException();
                  }

                  if (0 == var19) {
                     break;
                  }

                  an = 0;
                  byte var5 = 0;
                  if (ch.ai == null) {
                     var5 = 8;
                  } else if (0 == av * -1961769541) {
                     var5 = 1;
                  }

                  int var6;
                  int var7;
                  int var8;
                  int var10;
                  byte[] var10000;
                  int var10001;
                  sg var22;
                  if (var5 > 0) {
                     var6 = var5 - ag.at * -1633313603;
                     if (var6 > var19) {
                        var6 = var19;
                     }

                     af.au(ag.al, -1633313603 * ag.at, var6, -2106093590);
                     if (0 != ad) {
                        for(var7 = 0; var7 < var6; ++var7) {
                           var10000 = ag.al;
                           var10001 = -1633313603 * ag.at + var7;
                           var10000[var10001] ^= ad;
                        }
                     }

                     var22 = ag;
                     var22.at += var6 * -1516355947;
                     if (-1633313603 * ag.at < var5) {
                        break;
                     }

                     if (null == ch.ai) {
                        ag.at = 0;
                        var7 = ag.cm((byte)7);
                        var8 = ag.cl(-1003955405);
                        int var9 = ag.cm((byte)7);
                        var10 = ag.cx(-1279455036);
                        long var11 = (long)((var7 << 16) + var8);
                        no var13 = (no)ab.af(var11);
                        ax = true;
                        if (var13 == null) {
                           var13 = (no)ay.af(var11);
                           ax = false;
                        }

                        if (null == var13) {
                           throw new IOException();
                        }

                        int var14 = 0 == var9 ? 5 : 9;
                        ch.ai = var13;
                        ah = new sg(var14 + var10 + ch.ai.aw);
                        ah.bu(var9, (byte)13);
                        ah.ba(var10, -2081835031);
                        av = -598099048;
                        ag.at = 0;
                     } else if (av * -1961769541 == 0) {
                        if (-1 == ag.al[0]) {
                           av = -74762381;
                           ag.at = 0;
                        } else {
                           ch.ai = null;
                        }
                     }
                  } else {
                     var6 = ah.al.length - ch.ai.aw;
                     var7 = 512 - av * -1961769541;
                     if (var7 > var6 - ah.at * -1633313603) {
                        var7 = var6 - ah.at * -1633313603;
                     }

                     if (var7 > var19) {
                        var7 = var19;
                     }

                     af.au(ah.al, ah.at * -1633313603, var7, -2106093590);
                     if (0 != ad) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           var10000 = ah.al;
                           var10001 = var8 + -1633313603 * ah.at;
                           var10000[var10001] ^= ad;
                        }
                     }

                     var22 = ah;
                     var22.at += var7 * -1516355947;
                     av += -74762381 * var7;
                     if (var6 == ah.at * -1633313603) {
                        if (ch.ai.hr == 16711935L) {
                           cz.as = ah;

                           for(var8 = 0; var8 < 256; ++var8) {
                              nd var20 = aj[var8];
                              if (var20 != null) {
                                 cz.as.at = var8 * 754054312 + 1008154857;
                                 if (-1633313603 * cz.as.at >= cz.as.al.length) {
                                    if (!var20.ah) {
                                       throw new RuntimeException("");
                                    }

                                    var20.au((byte)-32);
                                 } else {
                                    var10 = cz.as.cx(-1852438806);
                                    int var21 = cz.as.cx(-1686174048);
                                    var20.ab(var10, var21, -691028);
                                 }
                              }
                           }
                        } else {
                           am.reset();
                           am.update(ah.al, 0, var6);
                           var8 = (int)am.getValue();
                           if (var8 != ch.ai.an * -75260527) {
                              try {
                                 af.aq(-180302260);
                              } catch (Exception var16) {
                              }

                              ae += 372675253;
                              af = null;
                              ad = (byte)((int)(Math.random() * 255.0 + 1.0));
                              return false;
                           }

                           ae = 0;
                           ap = 0;
                           ch.ai.af.aq((int)(ch.ai.hr & 65535L), ah.al, 16711680L == (ch.ai.hr & 16711680L), ax, 350645982);
                        }

                        ch.ai.ga();
                        if (ax) {
                           aq -= -1677618233;
                        } else {
                           ao -= -979537415;
                        }

                        av = 0;
                        ch.ai = null;
                        ah = null;
                     } else {
                        if (-1961769541 * av != 512) {
                           break;
                        }

                        av = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var17) {
            try {
               af.aq(1477615842);
            } catch (Exception var15) {
            }

            ap += -161323731;
            af = null;
            return false;
         }
      }
   }

   public static int am(boolean var0, boolean var1) {
      int var2 = 0;
      if (var0) {
         var2 += -1171541559 * au + -1952694793 * aq;
      }

      if (var1) {
         var2 += aa * -32010957 + -1651605431 * ao;
      }

      return var2;
   }

   public static void aa(boolean var0) {
      if (null != af) {
         try {
            sg var1 = new sg(4);
            var1.bu(var0 ? 2 : 3, (byte)65);
            var1.bq(0, -943352222);
            af.ab(var1.al, 0, 4, -2115422184);
         } catch (IOException var4) {
            try {
               af.aq(1164081672);
            } catch (Exception var3) {
            }

            ap += -161323731;
            af = null;
         }

      }
   }

   nl() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "nl.<init>(" + ')');
      }
   }

   public static void ao(boolean var0) {
      if (null != af) {
         try {
            sg var1 = new sg(4);
            var1.bu(var0 ? 2 : 3, (byte)11);
            var1.bq(0, 1204057858);
            af.ab(var1.al, 0, 4, -2115422184);
         } catch (IOException var4) {
            try {
               af.aq(-1524938047);
            } catch (Exception var3) {
            }

            ap += -161323731;
            af = null;
         }

      }
   }

   static int ah(int var0, int var1) {
      long var2 = (long)(var1 + (var0 << 16));
      return ch.ai != null && ch.ai.hr == var2 ? 627475114 * ah.at / (ah.al.length - ch.ai.aw) + 1 : 0;
   }

   public static boolean at() {
      long var0 = dq.af(46679390);
      int var2 = (int)(var0 - -2114584129517998633L * aw);
      aw = -6047020038529116697L * var0;
      if (var2 > 200) {
         var2 = 200;
      }

      an += var2 * -425972525;
      if (ao * -1651605431 == 0 && 0 == aq * -1952694793 && 0 == -32010957 * aa && 0 == au * -1171541559) {
         return true;
      } else if (af == null) {
         return false;
      } else {
         try {
            if (an * -942339237 > 30000) {
               throw new IOException();
            } else {
               no var3;
               sg var4;
               while(-1952694793 * aq < 200 && au * -1171541559 > 0) {
                  var3 = (no)ac.aw();
                  var4 = new sg(4);
                  var4.bu(1, (byte)63);
                  var4.bq((int)var3.hr, 890899539);
                  af.ab(var4.al, 0, 4, -2115422184);
                  ab.an(var3, var3.hr);
                  au -= -1320339335;
                  aq += -1677618233;
               }

               while(ao * -1651605431 < 200 && aa * -32010957 > 0) {
                  var3 = (no)al.aw();
                  var4 = new sg(4);
                  var4.bu(0, (byte)103);
                  var4.bq((int)var3.hr, 659683759);
                  af.ab(var4.al, 0, 4, -2115422184);
                  var3.fs();
                  ay.an(var3, var3.hr);
                  aa -= -2069940741;
                  ao += -979537415;
               }

               for(int var18 = 0; var18 < 100; ++var18) {
                  int var19 = af.aw(2015124351);
                  if (var19 < 0) {
                     throw new IOException();
                  }

                  if (0 == var19) {
                     break;
                  }

                  an = 0;
                  byte var5 = 0;
                  if (ch.ai == null) {
                     var5 = 8;
                  } else if (0 == av * -1961769541) {
                     var5 = 1;
                  }

                  int var6;
                  int var7;
                  int var8;
                  int var10;
                  byte[] var10000;
                  int var10001;
                  sg var22;
                  if (var5 > 0) {
                     var6 = var5 - ag.at * -1633313603;
                     if (var6 > var19) {
                        var6 = var19;
                     }

                     af.au(ag.al, -1633313603 * ag.at, var6, -2106093590);
                     if (0 != ad) {
                        for(var7 = 0; var7 < var6; ++var7) {
                           var10000 = ag.al;
                           var10001 = -1633313603 * ag.at + var7;
                           var10000[var10001] ^= ad;
                        }
                     }

                     var22 = ag;
                     var22.at += var6 * -1516355947;
                     if (-1633313603 * ag.at < var5) {
                        break;
                     }

                     if (null == ch.ai) {
                        ag.at = 0;
                        var7 = ag.cm((byte)7);
                        var8 = ag.cl(-1780904866);
                        int var9 = ag.cm((byte)7);
                        var10 = ag.cx(-1524439095);
                        long var11 = (long)((var7 << 16) + var8);
                        no var13 = (no)ab.af(var11);
                        ax = true;
                        if (var13 == null) {
                           var13 = (no)ay.af(var11);
                           ax = false;
                        }

                        if (null == var13) {
                           throw new IOException();
                        }

                        int var14 = 0 == var9 ? 5 : 9;
                        ch.ai = var13;
                        ah = new sg(var14 + var10 + ch.ai.aw);
                        ah.bu(var9, (byte)112);
                        ah.ba(var10, -2081835031);
                        av = -598099048;
                        ag.at = 0;
                     } else if (av * -1961769541 == 0) {
                        if (-1 == ag.al[0]) {
                           av = -74762381;
                           ag.at = 0;
                        } else {
                           ch.ai = null;
                        }
                     }
                  } else {
                     var6 = ah.al.length - ch.ai.aw;
                     var7 = 512 - av * -1961769541;
                     if (var7 > var6 - ah.at * -1633313603) {
                        var7 = var6 - ah.at * -1633313603;
                     }

                     if (var7 > var19) {
                        var7 = var19;
                     }

                     af.au(ah.al, ah.at * -1633313603, var7, -2106093590);
                     if (0 != ad) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           var10000 = ah.al;
                           var10001 = var8 + -1633313603 * ah.at;
                           var10000[var10001] ^= ad;
                        }
                     }

                     var22 = ah;
                     var22.at += var7 * -1516355947;
                     av += -74762381 * var7;
                     if (var6 == ah.at * -1633313603) {
                        if (ch.ai.hr == 16711935L) {
                           cz.as = ah;

                           for(var8 = 0; var8 < 256; ++var8) {
                              nd var20 = aj[var8];
                              if (var20 != null) {
                                 cz.as.at = var8 * 754054312 + 1008154857;
                                 if (-1633313603 * cz.as.at >= cz.as.al.length) {
                                    if (!var20.ah) {
                                       throw new RuntimeException("");
                                    }

                                    var20.au((byte)-45);
                                 } else {
                                    var10 = cz.as.cx(-1582091904);
                                    int var21 = cz.as.cx(-1443378061);
                                    var20.ab(var10, var21, -691028);
                                 }
                              }
                           }
                        } else {
                           am.reset();
                           am.update(ah.al, 0, var6);
                           var8 = (int)am.getValue();
                           if (var8 != ch.ai.an * -75260527) {
                              try {
                                 af.aq(-643053257);
                              } catch (Exception var16) {
                              }

                              ae += 372675253;
                              af = null;
                              ad = (byte)((int)(Math.random() * 255.0 + 1.0));
                              return false;
                           }

                           ae = 0;
                           ap = 0;
                           ch.ai.af.aq((int)(ch.ai.hr & 65535L), ah.al, 16711680L == (ch.ai.hr & 16711680L), ax, -12209136);
                        }

                        ch.ai.ga();
                        if (ax) {
                           aq -= -1677618233;
                        } else {
                           ao -= -979537415;
                        }

                        av = 0;
                        ch.ai = null;
                        ah = null;
                     } else {
                        if (-1961769541 * av != 512) {
                           break;
                        }

                        av = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var17) {
            try {
               af.aq(2083500558);
            } catch (Exception var15) {
            }

            ap += -161323731;
            af = null;
            return false;
         }
      }
   }

   static void ag(nd var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)(var2 + (var1 << 16));
      no var8 = (no)ac.af(var6);
      if (var8 == null) {
         var8 = (no)ab.af(var6);
         if (null == var8) {
            var8 = (no)at.af(var6);
            if (var8 != null) {
               if (var5) {
                  var8.fs();
                  ac.an(var8, var6);
                  aa -= -763199901;
                  au += 2021758914;
               }

            } else {
               if (!var5) {
                  var8 = (no)ay.af(var6);
                  if (var8 != null) {
                     return;
                  }
               }

               var8 = new no();
               var8.af = var0;
               var8.an = var3 * -404182335;
               var8.aw = var4;
               if (var5) {
                  ac.an(var8, var6);
                  au += -1874875034;
               } else {
                  al.af(var8);
                  at.an(var8, var6);
                  aa += -16779484;
               }

            }
         }
      }
   }

   static void ai(nd var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)(var2 + (var1 << 16));
      no var8 = (no)ac.af(var6);
      if (var8 == null) {
         var8 = (no)ab.af(var6);
         if (null == var8) {
            var8 = (no)at.af(var6);
            if (var8 != null) {
               if (var5) {
                  var8.fs();
                  ac.an(var8, var6);
                  aa -= -2069940741;
                  au += -1320339335;
               }

            } else {
               if (!var5) {
                  var8 = (no)ay.af(var6);
                  if (var8 != null) {
                     return;
                  }
               }

               var8 = new no();
               var8.af = var0;
               var8.an = var3 * 1949343561;
               var8.aw = var4;
               if (var5) {
                  ac.an(var8, var6);
                  au += -1320339335;
               } else {
                  al.af(var8);
                  at.an(var8, var6);
                  aa += 2019882076;
               }

            }
         }
      }
   }

   public static int as(boolean var0, boolean var1) {
      int var2 = 0;
      if (var0) {
         var2 += -1171541559 * au + -1952694793 * aq;
      }

      if (var1) {
         var2 += aa * -32010957 + -1651605431 * ao;
      }

      return var2;
   }

   public static int ar(boolean var0, boolean var1) {
      int var2 = 0;
      if (var0) {
         var2 += -1171541559 * au + -1952694793 * aq;
      }

      if (var1) {
         var2 += aa * -32010957 + -1651605431 * ao;
      }

      return var2;
   }

   public static void ay(boolean var0) {
      if (null != af) {
         try {
            sg var1 = new sg(4);
            var1.bu(var0 ? 2 : 3, (byte)55);
            var1.bq(0, 359833185);
            af.ab(var1.al, 0, 4, -2115422184);
         } catch (IOException var4) {
            try {
               af.aq(-273762386);
            } catch (Exception var3) {
            }

            ap += -161323731;
            af = null;
         }

      }
   }

   public static void ax(boolean var0) {
      if (null != af) {
         try {
            sg var1 = new sg(4);
            var1.bu(var0 ? 2 : 3, (byte)21);
            var1.bq(0, -705374037);
            af.ab(var1.al, 0, 4, -2115422184);
         } catch (IOException var4) {
            try {
               af.aq(-138721683);
            } catch (Exception var3) {
            }

            ap += -1466242362;
            af = null;
         }

      }
   }

   public static void aj() {
      if (af != null) {
         af.aq(2074802430);
      }

   }

   protected static int bq(int var0) {
      try {
         int var1;
         label58: {
            var1 = 0;
            if (li.ba != null) {
               if (li.ba.isValid()) {
                  break label58;
               }

               if (var0 <= 1708543892) {
                  throw new IllegalStateException();
               }
            }

            try {
               Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

               while(var2.hasNext()) {
                  if (var0 <= 1708543892) {
                     throw new IllegalStateException();
                  }

                  GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
                  if (var3.isValid()) {
                     li.ba = var3;
                     bm.bl = 4496549445389278039L;
                     bm.bv = -3922098655801851377L;
                  }
               }
            } catch (Throwable var10) {
            }
         }

         if (null != li.ba) {
            if (var0 <= 1708543892) {
               throw new IllegalStateException();
            }

            long var12 = dq.af(96073437);
            long var4 = li.ba.getCollectionTime();
            if (-3199239881614683375L * bm.bv != -1L) {
               if (var0 <= 1708543892) {
                  throw new IllegalStateException();
               }

               long var6 = var4 - -3199239881614683375L * bm.bv;
               long var8 = var12 - 9118577410129870745L * bm.bl;
               if (var8 != 0L) {
                  if (var0 <= 1708543892) {
                     throw new IllegalStateException();
                  }

                  var1 = (int)(100L * var6 / var8);
               }
            }

            bm.bv = 3922098655801851377L * var4;
            bm.bl = -4496549445389278039L * var12;
         }

         return var1;
      } catch (RuntimeException var11) {
         throw db.an(var11, "nl.bq(" + ')');
      }
   }
}
