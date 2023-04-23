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

public class EnumType extends DualNode {
   static int ay;
   static EvictingDualNodeHashTable EnumType_cached = new EvictingDualNodeHashTable(64);
   static AbstractArchive EnumType_archive;
   public char outputtype;
   public char inputtype;
   public int ab;
   public int outputcount;
   public int[] keys;
   public int[] intvals;
   public String defaultstr;
   public String[] strvals;

   EnumType() {
      this.defaultstr = Strings.Strings_null;
      this.outputcount = 0;
   }

   public static void af_renamed(AbstractArchive var0) {
      FloorOverlayType.af = var0;
   }

   static String an_renamed(IterableNodeHashTable var0, int var1, String var2) {
      if (null == var0) {
         return var2;
      } else {
         ObjectNode var4 = (ObjectNode)var0.get((long)var1);
         return var4 == null ? var2 : (String)var4.obj;
      }
   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (var3 == 0) {
            return;
         }

         this.decode0(var1, var3);
      }
   }

   void decode0(Packet var1, int var2) {
      if (var2 == 1) {
         this.inputtype = (char)var1.g1();
      } else if (2 == var2) {
         this.outputtype = (char)var1.g1();
      } else if (var2 == 3) {
         this.defaultstr = var1.cw();
      } else if (var2 == 4) {
         this.ab = var1.g4s() * 740445373;
      } else {
         int var4;
         if (var2 == 5) {
            this.outputcount = var1.cl() * -408757769;
            this.keys = new int[-1067065 * this.outputcount];
            this.strvals = new String[-1067065 * this.outputcount];

            for(var4 = 0; var4 < -1067065 * this.outputcount; ++var4) {
               this.keys[var4] = var1.g4s();
               this.strvals[var4] = var1.cw();
            }
         } else if (6 == var2) {
            this.outputcount = var1.cl() * -408757769;
            this.keys = new int[-1067065 * this.outputcount];
            this.intvals = new int[this.outputcount * -1067065];

            for(var4 = 0; var4 < this.outputcount * -1067065; ++var4) {
               this.keys[var4] = var1.g4s();
               this.intvals[var4] = var1.g4s();
            }
         }
      }

   }

   public int size() {
      return -1067065 * this.outputcount;
   }

   static void ab_renamed(GameShell var0, Font var1, Font var2) {
      if (cz.di) {
         bz.ag_renamed(var0);
      } else {
         if ((1 == -1222491879 * MouseHandler.ar || !su.ev && 4 == MouseHandler.ar * -1222491879) && 2020601481 * MouseHandler.MouseHandler_lastButton >= 765 + cz.aw * 578342931 - 50 && 1163896205 * MouseHandler.as >= 453) {
            aj.clientPreferences.at(!aj.clientPreferences.aa());
            if (!aj.clientPreferences.aa()) {
               sh.an_renamed(pj.archive6, "scape main", "", 255, false);
            } else {
               FloorUnderlayType.au_renamed();
            }
         }

         if (5 != -1275976559 * Client.dw) {
            if (-1L == cz.db * -7899453336143161787L) {
               cz.db = (Formatting.af_renamed() + 1000L) * -8298737133189264243L;
            }

            long var4 = Formatting.af_renamed();
            boolean var6;
            if (null != Client.archiveLoaders && Client.wy * -397497277 < Client.archiveLoaders.size()) {
               while(true) {
                  if (-397497277 * Client.wy >= Client.archiveLoaders.size()) {
                     var6 = true;
                     break;
                  }

                  ArchiveLoader var7 = (ArchiveLoader)Client.archiveLoaders.get(-397497277 * Client.wy);
                  if (!var7.af()) {
                     var6 = false;
                     break;
                  }

                  Client.wy += -1719009173;
               }
            } else {
               var6 = true;
            }

            if (var6 && -1L == cz.df * 6949275123175874863L) {
               cz.df = var4 * -1178331881283680817L;
               if (cz.df * 6949275123175874863L > -7899453336143161787L * cz.db) {
                  cz.db = -606941742840038685L * cz.df;
               }
            }

            if (10 == Client.dw * -1275976559 || -1275976559 * Client.dw == 11) {
               int var8;
               int var9;
               int var40;
               if (fj.ck == Language.af) {
                  if (-1222491879 * MouseHandler.ar == 1 || !su.ev && 4 == MouseHandler.ar * -1222491879) {
                     var40 = 5 + 578342931 * cz.aw;
                     var8 = 463;
                     var9 = 100;
                     byte var10 = 35;
                     if (2020601481 * MouseHandler.MouseHandler_lastButton >= var40 && 2020601481 * MouseHandler.MouseHandler_lastButton <= var40 + var9 && MouseHandler.as * 1163896205 >= var8 && MouseHandler.as * 1163896205 <= var8 + var10) {
                        cz.ar_renamed();
                        return;
                     }
                  }

                  if (ao.aa != null) {
                     cz.ar_renamed();
                  }
               }

               var40 = -1222491879 * MouseHandler.ar;
               var8 = 2020601481 * MouseHandler.MouseHandler_lastButton;
               var9 = MouseHandler.as * 1163896205;
               if (var40 == 0) {
                  var8 = -2063363905 * MouseHandler.ay;
                  var9 = MouseHandler.ao * -1224153235;
               }

               if (!su.ev && var40 == 4) {
                  var40 = 1;
               }

               hy var41 = Client.sh;
               hy var11 = var41;
               int var13;
               short var44;
               if (0 == cz.ce * 1145608355) {
                  boolean var75 = false;

                  while(var11.ag()) {
                     if (84 == var11.ai * 546317845) {
                        var75 = true;
                     }
                  }

                  var13 = fy.az * 950254081 - 80;
                  var44 = 291;
                  if (1 == var40 && var8 >= var13 - 75 && var8 <= 75 + var13 && var9 >= var44 - 20 && var9 <= 20 + var44) {
                     Ignored.af_renamed(InvType.nb_renamed("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var13 = fy.az * 950254081 + 80;
                  if (var40 == 1 && var8 >= var13 - 75 && var8 <= 75 + var13 && var9 >= var44 - 20 && var9 <= 20 + var44 || var75) {
                     if ((-205173751 * Client.ce & 33554432) != 0) {
                        cz.Login_response0 = "";
                        cz.Login_response1 = Strings.Strings_thisIsABetaWorld;
                        cz.Login_response2 = Strings.Strings_yourNormalAccountWillNotBeAffected;
                        cz.Login_response3 = Strings.jq;
                        ee.ak_renamed(1);
                        if (Client.hb && null != cz.ca && cz.ca.length() > 0) {
                           cz.dm = 1153152795;
                        } else {
                           cz.dm = 0;
                        }
                     } else if ((-205173751 * Client.ce & 4) != 0) {
                        if ((-205173751 * Client.ce & 1024) != 0) {
                           cz.Login_response1 = Strings.Strings_thisIsAHighRiskPvpWorld;
                           cz.Login_response2 = Strings.Strings_playersCanAttackEachOtherAlmostEverywhere;
                           cz.Login_response3 = Strings.Strings_andTheProtectItemPrayerWontWork;
                        } else {
                           cz.Login_response1 = Strings.Strings_thisIsAPvpWorld;
                           cz.Login_response2 = Strings.Strings_playersCanAttackEachOther;
                           cz.Login_response3 = Strings.Strings_almostEverywhere;
                        }

                        cz.Login_response0 = Strings.Strings_warning;
                        ee.ak_renamed(1);
                        if (Client.hb && cz.ca != null && cz.ca.length() > 0) {
                           cz.dm = 1153152795;
                        } else {
                           cz.dm = 0;
                        }
                     } else if ((Client.ce * -205173751 & 1024) != 0) {
                        cz.Login_response1 = Strings.Strings_thisIsAHighRiskWorld;
                        cz.Login_response2 = Strings.Strings_theProtectItemPrayerWill;
                        cz.Login_response3 = Strings.Strings_notWorkOnThisWorld;
                        cz.Login_response0 = Strings.Strings_warning;
                        ee.ak_renamed(1);
                        if (Client.hb && cz.ca != null && cz.ca.length() > 0) {
                           cz.dm = 1153152795;
                        } else {
                           cz.dm = 0;
                        }
                     } else {
                        aq.aa_renamed(false);
                     }
                  }
               } else {
                  int var12;
                  short var45;
                  if (cz.ce * 1145608355 == 1) {
                     while(true) {
                        if (!var11.ag()) {
                           var12 = fy.az * 950254081 - 80;
                           var45 = 321;
                           if (1 == var40 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                              aq.aa_renamed(false);
                           }

                           var12 = 950254081 * fy.az + 80;
                           if (1 == var40 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var45 - 20 && var9 <= 20 + var45) {
                              ee.ak_renamed(0);
                           }
                           break;
                        }

                        if (546317845 * var11.ai == 84) {
                           aq.aa_renamed(false);
                        } else if (13 == 546317845 * var11.ai) {
                           ee.ak_renamed(0);
                        }
                     }
                  } else {
                     int var16;
                     String var18;
                     int var19;
                     short var42;
                     boolean var47;
                     char var48;
                     int var50;
                     char var63;
                     boolean var68;
                     if (2 == 1145608355 * cz.ce) {
                        var42 = 201;
                        var12 = var42 + 52;
                        if (var40 == 1 && var9 >= var12 - 12 && var9 < 2 + var12) {
                           cz.dm = 0;
                        }

                        var12 += 15;
                        if (var40 == 1 && var9 >= var12 - 12 && var9 < var12 + 2) {
                           cz.dm = 1153152795;
                        }

                        var12 += 15;
                        var42 = 361;
                        if (null != Formatting.bh) {
                           var13 = Formatting.bh.aw * 944313703 / 2;
                           if (var40 == 1 && var8 >= Formatting.bh.af * -844906645 - var13 && var8 <= -844906645 * Formatting.bh.af + var13 && var9 >= var42 - 15 && var9 < var42) {
                              switch (-1733444455 * cz.bp) {
                                 case 1:
                                    he.ax_renamed(Strings.lu, Strings.lk, Strings.lh);
                                    ee.ak_renamed(5);
                                    return;
                                 case 2:
                                    Ignored.af_renamed("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var13 = fy.az * 950254081 - 80;
                        var44 = 321;
                        if (1 == var40 && var8 >= var13 - 75 && var8 <= 75 + var13 && var9 >= var44 - 20 && var9 <= var44 + 20) {
                           cz.ca = cz.ca.trim();
                           if (cz.ca.length() == 0) {
                              he.ax_renamed(Strings.em, Strings.Strings_pleaseEnterYourUsername, Strings.ex);
                              return;
                           }

                           if (cz.cu.length() == 0) {
                              he.ax_renamed(Strings.eh, Strings.Strings_pleaseEnterYourPassword, Strings.ey);
                              return;
                           }

                           he.ax_renamed(Strings.jm, Strings.Strings_connectingToServer, Strings.jd);
                           ag.hb_renamed(false);
                           fd.hi_renamed(20);
                           return;
                        }

                        var13 = 80 + cz.ak * 678588245 + 180;
                        if (var40 == 1 && var8 >= var13 - 75 && var8 <= var13 + 75 && var9 >= var44 - 20 && var9 <= 20 + var44) {
                           ee.ak_renamed(0);
                           cz.ca = "";
                           cz.cu = "";
                           hp.ct = 0;
                           Messages.cp = "";
                           cz.cd = true;
                        }

                        var13 = -117 + 950254081 * fy.az;
                        var44 = 277;
                        cz.cj = var8 >= var13 && var8 < var13 + ChatChannel.cz * 1381277089 && var9 >= var44 && var9 < FloorUnderlayType.cw * -1649414567 + var44;
                        if (var40 == 1 && cz.cj) {
                           Client.hb = !Client.hb;
                           if (!Client.hb && aj.clientPreferences.ae() != null) {
                              aj.clientPreferences.ad((String)null);
                           }
                        }

                        var13 = 950254081 * fy.az + 24;
                        var44 = 277;
                        cz.ch = var8 >= var13 && var8 < ChatChannel.cz * 1381277089 + var13 && var9 >= var44 && var9 < var44 + FloorUnderlayType.cw * -1649414567;
                        if (1 == var40 && cz.ch) {
                           aj.clientPreferences.aq(!aj.clientPreferences.al());
                           if (!aj.clientPreferences.al()) {
                              cz.ca = "";
                              aj.clientPreferences.ad((String)null);
                              if (Client.hb && null != cz.ca && cz.ca.length() > 0) {
                                 cz.dm = 1153152795;
                              } else {
                                 cz.dm = 0;
                              }
                           }
                        }

                        label1654:
                        while(true) {
                           Transferable var61;
                           do {
                              while(true) {
                                 label1618:
                                 do {
                                    while(true) {
                                       while(var11.ag()) {
                                          if (546317845 * var11.ai != 13) {
                                             if (-1232221421 * cz.dm != 0) {
                                                continue label1618;
                                             }

                                             char var52 = var11.ax;

                                             for(var16 = 0; var16 < cz.dw.length() && var52 != cz.dw.charAt(var16); ++var16) {
                                             }

                                             if (85 == 546317845 * var11.ai && cz.ca.length() > 0) {
                                                cz.ca = cz.ca.substring(0, cz.ca.length() - 1);
                                             }

                                             if (84 == 546317845 * var11.ai || 546317845 * var11.ai == 80) {
                                                cz.dm = 1153152795;
                                             }

                                             var63 = var11.ax;
                                             boolean var59 = cz.dw.indexOf(var63) != -1;
                                             if (var59 && cz.ca.length() < 320) {
                                                cz.ca = cz.ca + var11.ax;
                                             }
                                          } else {
                                             ee.ak_renamed(0);
                                             cz.ca = "";
                                             cz.cu = "";
                                             hp.ct = 0;
                                             Messages.cp = "";
                                             cz.cd = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(cz.dm * -1232221421 != 1);

                                 if (var11.ai * 546317845 == 85 && cz.cu.length() > 0) {
                                    cz.cu = cz.cu.substring(0, cz.cu.length() - 1);
                                 } else if (84 == 546317845 * var11.ai || 80 == var11.ai * 546317845) {
                                    cz.dm = 0;
                                    if (546317845 * var11.ai == 84) {
                                       cz.ca = cz.ca.trim();
                                       if (cz.ca.length() == 0) {
                                          he.ax_renamed(Strings.em, Strings.Strings_pleaseEnterYourUsername, Strings.ex);
                                          return;
                                       }

                                       if (cz.cu.length() == 0) {
                                          he.ax_renamed(Strings.eh, Strings.Strings_pleaseEnterYourPassword, Strings.ey);
                                          return;
                                       }

                                       he.ax_renamed(Strings.jm, Strings.Strings_connectingToServer, Strings.jd);
                                       ag.hb_renamed(false);
                                       fd.hi_renamed(20);
                                       return;
                                    }
                                 }

                                 if ((var11.av(82) || var11.av(87)) && 67 == var11.ai * 546317845) {
                                    Clipboard var55 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var61 = var55.getContents(ClientScriptFrame.client);
                                    var50 = 20 - cz.cu.length();
                                    break;
                                 }

                                 if (MouseHandler.an_renamed(var11.ax)) {
                                    var48 = var11.ax;
                                    var47 = cz.dw.indexOf(var48) != -1;
                                    if (var47 && cz.cu.length() < 20) {
                                       cz.cu = cz.cu + var11.ax;
                                    }
                                 }
                              }
                           } while(var50 <= 0);

                           try {
                              var18 = (String)var61.getTransferData(DataFlavor.stringFlavor);
                              var19 = Math.min(var50, var18.length());
                              int var74 = 0;

                              while(true) {
                                 if (var74 >= var19) {
                                    cz.cu = cz.cu + var18.substring(0, var19);
                                    continue label1654;
                                 }

                                 if (!MouseHandler.an_renamed(var18.charAt(var74))) {
                                    break;
                                 }

                                 char var76 = var18.charAt(var74);
                                 var68 = cz.dw.indexOf(var76) != -1;
                                 if (!var68) {
                                    break;
                                 }

                                 ++var74;
                              }

                              ee.ak_renamed(3);
                              return;
                           } catch (UnsupportedFlavorException var38) {
                           } catch (IOException var39) {
                           }
                        }
                     } else {
                        Bounds var14;
                        if (1145608355 * cz.ce == 3) {
                           var12 = 180 + cz.ak * 678588245;
                           var13 = 241;
                           var14 = var1.av(25, Strings.kh.length() - 34, Strings.kh, var12, var13);
                           if (1 == var40 && var14.aw(var8, var9)) {
                              Ignored.af_renamed(Strings.ns, true, false);
                           }

                           var12 = 180 + cz.ak * 678588245;
                           var13 = 276;
                           if (var40 == 1 && var8 >= var12 - 75 && var8 <= var12 + 75 && var9 >= var13 - 20 && var9 <= 20 + var13) {
                              cz.ay_renamed(false);
                           }

                           var12 = 180 + cz.ak * 678588245;
                           var13 = 326;
                           if (var40 == 1 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var13 - 20 && var9 <= 20 + var13) {
                              he.ax_renamed(Strings.lu, Strings.lk, Strings.lh);
                              ee.ak_renamed(5);
                              return;
                           }
                        } else {
                           int var15;
                           if (4 == 1145608355 * cz.ce) {
                              var12 = 180 + 678588245 * cz.ak - 80;
                              var13 = 321;
                              if (var40 == 1 && var8 >= var12 - 75 && var8 <= var12 + 75 && var9 >= var13 - 20 && var9 <= 20 + var13) {
                                 Messages.cp.trim();
                                 if (Messages.cp.length() != 6) {
                                    he.ax_renamed(Strings.br, Strings.bg, Strings.bu);
                                    return;
                                 }

                                 hp.ct = Integer.parseInt(Messages.cp) * -209153533;
                                 Messages.cp = "";
                                 ag.hb_renamed(true);
                                 he.ax_renamed(Strings.jm, Strings.Strings_connectingToServer, Strings.jd);
                                 fd.hi_renamed(20);
                                 return;
                              }

                              if (var40 == 1 && var8 >= 678588245 * cz.ak + 180 - 9 && var8 <= cz.ak * 678588245 + 180 + 130 && var9 >= 263 && var9 <= 296) {
                                 cz.cd = !cz.cd;
                              }

                              if (1 == var40 && var8 >= cz.ak * 678588245 + 180 - 34 && var8 <= 180 + cz.ak * 678588245 + 34 && var9 >= 351 && var9 <= 363) {
                                 Ignored.af_renamed(InvType.nb_renamed("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                              }

                              var12 = 80 + 180 + cz.ak * 678588245;
                              if (1 == var40 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var13 - 20 && var9 <= var13 + 20) {
                                 ee.ak_renamed(0);
                                 cz.ca = "";
                                 cz.cu = "";
                                 hp.ct = 0;
                                 Messages.cp = "";
                              }

                              while(var11.ag()) {
                                 boolean var43 = false;

                                 for(var15 = 0; var15 < cz.dc.length(); ++var15) {
                                    if (var11.ax == cz.dc.charAt(var15)) {
                                       var43 = true;
                                       break;
                                    }
                                 }

                                 if (var11.ai * 546317845 == 13) {
                                    ee.ak_renamed(0);
                                    cz.ca = "";
                                    cz.cu = "";
                                    hp.ct = 0;
                                    Messages.cp = "";
                                 } else {
                                    if (85 == var11.ai * 546317845 && Messages.cp.length() > 0) {
                                       Messages.cp = Messages.cp.substring(0, Messages.cp.length() - 1);
                                    }

                                    if (var11.ai * 546317845 == 84) {
                                       Messages.cp.trim();
                                       if (Messages.cp.length() != 6) {
                                          he.ax_renamed(Strings.br, Strings.bg, Strings.bu);
                                          return;
                                       }

                                       hp.ct = Integer.parseInt(Messages.cp) * -209153533;
                                       Messages.cp = "";
                                       ag.hb_renamed(true);
                                       he.ax_renamed(Strings.jm, Strings.Strings_connectingToServer, Strings.jd);
                                       fd.hi_renamed(20);
                                       return;
                                    }

                                    if (var43 && Messages.cp.length() < 6) {
                                       Messages.cp = Messages.cp + var11.ax;
                                    }
                                 }
                              }
                           } else if (5 == cz.ce * 1145608355) {
                              var12 = 180 + cz.ak * 678588245 - 80;
                              var13 = 321;
                              if (var40 == 1 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var13 - 20 && var9 <= var13 + 20) {
                                 cz.ca = cz.ca.trim();
                                 if (cz.ca.length() == 0) {
                                    he.ax_renamed(Strings.lu, Strings.lk, Strings.lh);
                                 } else {
                                    long var49 = kt.af_renamed((byte)-87);
                                    byte var46;
                                    if (var49 == 0L) {
                                       var46 = 5;
                                    } else {
                                       var18 = cz.ca;
                                       Random var67 = new Random();
                                       Packet var58 = new Packet(128);
                                       Packet var62 = new Packet(128);
                                       int[] var69 = new int[]{var67.nextInt(), var67.nextInt(), (int)(var49 >> 32), (int)var49};
                                       var58.bu(10);

                                       int var73;
                                       for(var73 = 0; var73 < 4; ++var73) {
                                          var58.ba(var67.nextInt());
                                       }

                                       var58.ba(var69[0]);
                                       var58.ba(var69[1]);
                                       var58.p8s(var49);
                                       var58.p8s(0L);

                                       for(var73 = 0; var73 < 4; ++var73) {
                                          var58.ba(var67.nextInt());
                                       }

                                       var58.rsaEncrypt(cv.au, cv.ab);
                                       var62.bu(10);

                                       for(var73 = 0; var73 < 3; ++var73) {
                                          var62.ba(var67.nextInt());
                                       }

                                       var62.p8s(var67.nextLong());
                                       var62.p6(var67.nextLong());
                                       oa.nj_renamed(var62);
                                       var62.p8s(var67.nextLong());
                                       var62.rsaEncrypt(cv.au, cv.ab);
                                       var73 = DynamicObject.bc_renamed(var18);
                                       if (var73 % 8 != 0) {
                                          var73 += 8 - var73 % 8;
                                       }

                                       Packet var77 = new Packet(var73);
                                       var77.bh(var18);
                                       var77.index = var73 * -1516355947;
                                       var77.tinyKeyEncryptAll(var69);
                                       Packet var82 = new Packet(var77.index * -1633313603 + -1633313603 * var62.index + var58.index * -1633313603 + 5);
                                       var82.bu(2);
                                       var82.bu(var58.index * -1633313603);
                                       var82.cs(var58.array, 0, -1633313603 * var58.index);
                                       var82.bu(-1633313603 * var62.index);
                                       var82.cs(var62.array, 0, var62.index * -1633313603);
                                       var82.p2(-1633313603 * var77.index);
                                       var82.cs(var77.array, 0, -1633313603 * var77.index);
                                       String var80 = WorldMapSectionType.af_renamed(var82.array);

                                       try {
                                          URL var81 = new URL(InvType.nb_renamed("services", false) + "m=accountappeal/login.ws");
                                          URLConnection var83 = var81.openConnection();
                                          var83.setDoInput(true);
                                          var83.setDoOutput(true);
                                          var83.setConnectTimeout(5000);
                                          OutputStreamWriter var85 = new OutputStreamWriter(var83.getOutputStream());
                                          var85.write("data2=" + pg.af_renamed(var80) + "&dest=" + pg.af_renamed("passwordchoice.ws"));
                                          var85.flush();
                                          InputStream var86 = var83.getInputStream();
                                          var82 = new Packet(new byte[1000]);

                                          while(true) {
                                             int var87 = var86.read(var82.array, -1633313603 * var82.index, 1000 - var82.index * -1633313603);
                                             if (var87 == -1) {
                                                var85.close();
                                                var86.close();
                                                String var88 = new String(var82.array);
                                                if (var88.startsWith("OFFLINE")) {
                                                   var50 = 4;
                                                } else if (var88.startsWith("WRONG")) {
                                                   var50 = 7;
                                                } else if (var88.startsWith("RELOAD")) {
                                                   var50 = 3;
                                                } else if (var88.startsWith("Not permitted for social network accounts.")) {
                                                   var50 = 6;
                                                } else {
                                                   var82.tinyKeyDecryptAll(var69);

                                                   while(-1633313603 * var82.index > 0 && var82.array[var82.index * -1633313603 - 1] == 0) {
                                                      var82.index -= -1516355947;
                                                   }

                                                   var88 = new String(var82.array, 0, var82.index * -1633313603);
                                                   if (dj.an_renamed(var88)) {
                                                      Ignored.af_renamed(var88, true, false);
                                                      var50 = 2;
                                                   } else {
                                                      var50 = 5;
                                                   }
                                                }
                                                break;
                                             }

                                             var82.index += -1516355947 * var87;
                                             if (var82.index * -1633313603 >= 1000) {
                                                var50 = 5;
                                                break;
                                             }
                                          }
                                       } catch (Throwable var34) {
                                          var34.printStackTrace();
                                          var50 = 5;
                                       }

                                       var46 = (byte)var50;
                                    }

                                    switch (var46) {
                                       case 2:
                                          he.ax_renamed(Strings.la, Strings.lp, Strings.ly);
                                          ee.ak_renamed(6);
                                          break;
                                       case 3:
                                          he.ax_renamed(Strings.ln, Strings.lt, Strings.lz);
                                          break;
                                       case 4:
                                          he.ax_renamed(Strings.lc, Strings.ld, Strings.lq);
                                          break;
                                       case 5:
                                          he.ax_renamed(Strings.lj, Strings.ll, Strings.le);
                                          break;
                                       case 6:
                                          he.ax_renamed(Strings.lb, Strings.lx, Strings.lo);
                                          break;
                                       case 7:
                                          he.ax_renamed(Strings.lw, Strings.lr, Strings.mt);
                                    }
                                 }

                                 return;
                              }

                              var12 = cz.ak * 678588245 + 180 + 80;
                              if (var40 == 1 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var13 - 20 && var9 <= 20 + var13) {
                                 aq.aa_renamed(true);
                              }

                              var44 = 361;
                              if (as.bw != null) {
                                 var15 = 944313703 * as.bw.aw / 2;
                                 if (1 == var40 && var8 >= as.bw.af * -844906645 - var15 && var8 <= var15 + -844906645 * as.bw.af && var9 >= var44 - 15 && var9 < var44) {
                                    Ignored.af_renamed(InvType.nb_renamed("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                 }
                              }

                              while(var11.ag()) {
                                 var47 = false;

                                 for(var16 = 0; var16 < cz.dw.length(); ++var16) {
                                    if (var11.ax == cz.dw.charAt(var16)) {
                                       var47 = true;
                                       break;
                                    }
                                 }

                                 if (546317845 * var11.ai == 13) {
                                    aq.aa_renamed(true);
                                 } else {
                                    if (85 == 546317845 * var11.ai && cz.ca.length() > 0) {
                                       cz.ca = cz.ca.substring(0, cz.ca.length() - 1);
                                    }

                                    if (546317845 * var11.ai == 84) {
                                       cz.ca = cz.ca.trim();
                                       if (cz.ca.length() == 0) {
                                          he.ax_renamed(Strings.lu, Strings.lk, Strings.lh);
                                       } else {
                                          long var17 = kt.af_renamed((byte)-50);
                                          if (var17 == 0L) {
                                             var48 = 5;
                                          } else {
                                             String var20 = cz.ca;
                                             Random var21 = new Random();
                                             Packet var22 = new Packet(128);
                                             Packet var23 = new Packet(128);
                                             int[] var24 = new int[]{var21.nextInt(), var21.nextInt(), (int)(var17 >> 32), (int)var17};
                                             var22.bu(10);

                                             int var25;
                                             for(var25 = 0; var25 < 4; ++var25) {
                                                var22.ba(var21.nextInt());
                                             }

                                             var22.ba(var24[0]);
                                             var22.ba(var24[1]);
                                             var22.p8s(var17);
                                             var22.p8s(0L);

                                             for(var25 = 0; var25 < 4; ++var25) {
                                                var22.ba(var21.nextInt());
                                             }

                                             var22.rsaEncrypt(cv.au, cv.ab);
                                             var23.bu(10);

                                             for(var25 = 0; var25 < 3; ++var25) {
                                                var23.ba(var21.nextInt());
                                             }

                                             var23.p8s(var21.nextLong());
                                             var23.p6(var21.nextLong());
                                             oa.nj_renamed(var23);
                                             var23.p8s(var21.nextLong());
                                             var23.rsaEncrypt(cv.au, cv.ab);
                                             var25 = DynamicObject.bc_renamed(var20);
                                             if (0 != var25 % 8) {
                                                var25 += 8 - var25 % 8;
                                             }

                                             Packet var26 = new Packet(var25);
                                             var26.bh(var20);
                                             var26.index = var25 * -1516355947;
                                             var26.tinyKeyEncryptAll(var24);
                                             Packet var27 = new Packet(5 + var22.index * -1633313603 + -1633313603 * var23.index + -1633313603 * var26.index);
                                             var27.bu(2);
                                             var27.bu(-1633313603 * var22.index);
                                             var27.cs(var22.array, 0, var22.index * -1633313603);
                                             var27.bu(var23.index * -1633313603);
                                             var27.cs(var23.array, 0, var23.index * -1633313603);
                                             var27.p2(var26.index * -1633313603);
                                             var27.cs(var26.array, 0, var26.index * -1633313603);
                                             String var28 = WorldMapSectionType.af_renamed(var27.array);

                                             try {
                                                URL var29 = new URL(InvType.nb_renamed("services", false) + "m=accountappeal/login.ws");
                                                URLConnection var30 = var29.openConnection();
                                                var30.setDoInput(true);
                                                var30.setDoOutput(true);
                                                var30.setConnectTimeout(5000);
                                                OutputStreamWriter var31 = new OutputStreamWriter(var30.getOutputStream());
                                                var31.write("data2=" + pg.af_renamed(var28) + "&dest=" + pg.af_renamed("passwordchoice.ws"));
                                                var31.flush();
                                                InputStream var32 = var30.getInputStream();
                                                var27 = new Packet(new byte[1000]);

                                                while(true) {
                                                   int var33 = var32.read(var27.array, var27.index * -1633313603, 1000 - var27.index * -1633313603);
                                                   if (var33 == -1) {
                                                      var31.close();
                                                      var32.close();
                                                      String var89 = new String(var27.array);
                                                      if (var89.startsWith("OFFLINE")) {
                                                         var19 = 4;
                                                      } else if (var89.startsWith("WRONG")) {
                                                         var19 = 7;
                                                      } else if (var89.startsWith("RELOAD")) {
                                                         var19 = 3;
                                                      } else if (var89.startsWith("Not permitted for social network accounts.")) {
                                                         var19 = 6;
                                                      } else {
                                                         var27.tinyKeyDecryptAll(var24);

                                                         while(var27.index * -1633313603 > 0 && 0 == var27.array[var27.index * -1633313603 - 1]) {
                                                            var27.index -= -1516355947;
                                                         }

                                                         var89 = new String(var27.array, 0, var27.index * -1633313603);
                                                         if (dj.an_renamed(var89)) {
                                                            Ignored.af_renamed(var89, true, false);
                                                            var19 = 2;
                                                         } else {
                                                            var19 = 5;
                                                         }
                                                      }
                                                      break;
                                                   }

                                                   var27.index += -1516355947 * var33;
                                                   if (var27.index * -1633313603 >= 1000) {
                                                      var19 = 5;
                                                      break;
                                                   }
                                                }
                                             } catch (Throwable var35) {
                                                var35.printStackTrace();
                                                var19 = 5;
                                             }

                                             var48 = (char)var19;
                                          }

                                          switch (var48) {
                                             case '\u0002':
                                                he.ax_renamed(Strings.la, Strings.lp, Strings.ly);
                                                ee.ak_renamed(6);
                                                break;
                                             case '\u0003':
                                                he.ax_renamed(Strings.ln, Strings.lt, Strings.lz);
                                                break;
                                             case '\u0004':
                                                he.ax_renamed(Strings.lc, Strings.ld, Strings.lq);
                                                break;
                                             case '\u0005':
                                                he.ax_renamed(Strings.lj, Strings.ll, Strings.le);
                                                break;
                                             case '\u0006':
                                                he.ax_renamed(Strings.lb, Strings.lx, Strings.lo);
                                                break;
                                             case '\u0007':
                                                he.ax_renamed(Strings.lw, Strings.lr, Strings.mt);
                                          }
                                       }

                                       return;
                                    }

                                    if (var47 && cz.ca.length() < 320) {
                                       cz.ca = cz.ca + var11.ax;
                                    }
                                 }
                              }
                           } else if (1145608355 * cz.ce != 6) {
                              if (cz.ce * 1145608355 == 7) {
                                 if (WorldMapSectionType.ds && !Client.cy) {
                                    var12 = fy.az * 950254081 - 150;
                                    var13 = 40 + var12 + 240 + 25;
                                    var44 = 231;
                                    var15 = 40 + var44;
                                    if (var40 == 1 && var8 >= var12 && var8 <= var13 && var9 >= var44 && var9 <= var15) {
                                       var50 = var12;
                                       int var53 = 0;

                                       while(true) {
                                          if (var53 >= 8) {
                                             var16 = 0;
                                             break;
                                          }

                                          if (var8 <= var50 + 30) {
                                             var16 = var53;
                                             break;
                                          }

                                          var50 += 30;
                                          var50 += var53 != 1 && 3 != var53 ? 5 : 20;
                                          ++var53;
                                       }

                                       cz.cq = var16 * 1670187551;
                                    }

                                    var16 = 678588245 * cz.ak + 180 - 80;
                                    var63 = 321;
                                    boolean var56;
                                    Date var60;
                                    SimpleDateFormat var64;
                                    boolean var66;
                                    Date var70;
                                    StringBuilder var71;
                                    Date var72;
                                    int var78;
                                    String[] var79;
                                    String var84;
                                    if (var40 == 1 && var8 >= var16 - 75 && var8 <= 75 + var16 && var9 >= var63 - 20 && var9 <= 20 + var63) {
                                       label1470: {
                                          try {
                                             var64 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                             var64.setLenient(false);
                                             var71 = new StringBuilder();
                                             var79 = cz.cm;
                                             var78 = 0;

                                             while(true) {
                                                if (var78 >= var79.length) {
                                                   var71.append("12");
                                                   var60 = var64.parse(var71.toString());
                                                   break;
                                                }

                                                var84 = var79[var78];
                                                if (var84 == null) {
                                                   ju.at_renamed("Date not valid.", "Please ensure all characters are populated.", "");
                                                   var60 = null;
                                                   break;
                                                }

                                                var71.append(var84);
                                                ++var78;
                                             }

                                             var70 = var60;
                                          } catch (ParseException var37) {
                                             ju.at_renamed("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                             var56 = false;
                                             break label1470;
                                          }

                                          if (var70 == null) {
                                             var56 = false;
                                          } else {
                                             var66 = do.al_renamed(var70);
                                             var72 = Varcs.aq_renamed();
                                             var68 = var70.after(var72);
                                             if (!var68) {
                                                ju.at_renamed("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var56 = false;
                                             } else {
                                                if (!var66) {
                                                   ByteArrayPool.ck = 1974420353;
                                                } else {
                                                   ByteArrayPool.ck = (int)(var70.getTime() / 86400000L - 11745L) * -909067137;
                                                }

                                                var56 = true;
                                             }
                                          }
                                       }

                                       if (var56) {
                                          fd.hi_renamed(50);
                                          return;
                                       }
                                    }

                                    var16 = 80 + cz.ak * 678588245 + 180;
                                    if (1 == var40 && var8 >= var16 - 75 && var8 <= var16 + 75 && var9 >= var63 - 20 && var9 <= var63 + 20) {
                                       cz.cm = new String[8];
                                       aq.aa_renamed(true);
                                    }

                                    while(var11.ag()) {
                                       if (101 == 546317845 * var11.ai) {
                                          cz.cm[cz.cq * -1262226977] = null;
                                       }

                                       if (546317845 * var11.ai == 85) {
                                          if (null == cz.cm[-1262226977 * cz.cq] && -1262226977 * cz.cq > 0) {
                                             cz.cq -= 1670187551;
                                          }

                                          cz.cm[cz.cq * -1262226977] = null;
                                       }

                                       if (var11.ax >= '0' && var11.ax <= '9') {
                                          cz.cm[-1262226977 * cz.cq] = "" + var11.ax;
                                          if (-1262226977 * cz.cq < 7) {
                                             cz.cq += 1670187551;
                                          }
                                       }

                                       if (546317845 * var11.ai == 84) {
                                          label1398: {
                                             try {
                                                var64 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                                var64.setLenient(false);
                                                var71 = new StringBuilder();
                                                var79 = cz.cm;
                                                var78 = 0;

                                                while(true) {
                                                   if (var78 < var79.length) {
                                                      var84 = var79[var78];
                                                      if (var84 != null) {
                                                         var71.append(var84);
                                                         ++var78;
                                                         continue;
                                                      }

                                                      ju.at_renamed("Date not valid.", "Please ensure all characters are populated.", "");
                                                      var60 = null;
                                                   } else {
                                                      var71.append("12");
                                                      var60 = var64.parse(var71.toString());
                                                   }

                                                   var70 = var60;
                                                   break;
                                                }
                                             } catch (ParseException var36) {
                                                ju.at_renamed("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var56 = false;
                                                break label1398;
                                             }

                                             if (var70 == null) {
                                                var56 = false;
                                             } else {
                                                var66 = do.al_renamed(var70);
                                                var72 = Varcs.aq_renamed();
                                                var68 = var70.after(var72);
                                                if (!var68) {
                                                   ju.at_renamed("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                   var56 = false;
                                                } else {
                                                   if (!var66) {
                                                      ByteArrayPool.ck = 1974420353;
                                                   } else {
                                                      ByteArrayPool.ck = (int)(var70.getTime() / 86400000L - 11745L) * -909067137;
                                                   }

                                                   var56 = true;
                                                }
                                             }
                                          }

                                          if (var56) {
                                             fd.hi_renamed(50);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var12 = 678588245 * cz.ak + 180 - 80;
                                    var13 = 321;
                                    if (1 == var40 && var8 >= var12 - 75 && var8 <= var12 + 75 && var9 >= var13 - 20 && var9 <= 20 + var13) {
                                       Ignored.af_renamed(InvType.nb_renamed("secure", true) + "m=dob/set_dob.ws", true, false);
                                       he.ax_renamed(Strings.ls, Strings.lf, Strings.li);
                                       ee.ak_renamed(6);
                                       return;
                                    }

                                    var12 = 80 + cz.ak * 678588245 + 180;
                                    if (var40 == 1 && var8 >= var12 - 75 && var8 <= var12 + 75 && var9 >= var13 - 20 && var9 <= var13 + 20) {
                                       aq.aa_renamed(true);
                                    }
                                 }
                              } else if (8 == 1145608355 * cz.ce) {
                                 var12 = cz.ak * 678588245 + 180 - 80;
                                 var45 = 321;
                                 if (var40 == 1 && var8 >= var12 - 75 && var8 <= var12 + 75 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                                    Ignored.af_renamed("https://www.jagex.com/terms/privacy", true, false);
                                    he.ax_renamed(Strings.ls, Strings.lf, Strings.li);
                                    ee.ak_renamed(6);
                                    return;
                                 }

                                 var12 = 80 + cz.ak * 678588245 + 180;
                                 if (1 == var40 && var8 >= var12 - 75 && var8 <= var12 + 75 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                                    aq.aa_renamed(true);
                                 }
                              } else if (9 == 1145608355 * cz.ce) {
                                 var12 = 180 + 678588245 * cz.ak;
                                 var45 = 311;
                                 if (84 == var41.ai * 546317845 || var41.ai * 546317845 == 13 || 1 == var40 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                                    cz.ay_renamed(false);
                                 }
                              } else if (10 == cz.ce * 1145608355) {
                                 var12 = cz.ak * 678588245 + 180;
                                 var45 = 209;
                                 if (546317845 * var41.ai == 84 || 1 == var40 && var8 >= var12 - 109 && var8 <= 109 + var12 && var9 >= var45 && var9 <= var45 + 68) {
                                    he.ax_renamed(Strings.jm, Strings.Strings_connectingToServer, Strings.jd);
                                    Client.gy = sr.an;
                                    ag.hb_renamed(false);
                                    fd.hi_renamed(20);
                                 }
                              } else if (1145608355 * cz.ce == 12) {
                                 var12 = fy.az * 950254081;
                                 var45 = 233;
                                 var14 = var2.av(0, 30, Strings.ma, var12, var45);
                                 Bounds var51 = var2.av(32, 32, Strings.ma, var12, var45);
                                 Bounds var57 = var2.av(70, 34, Strings.ma, var12, var45);
                                 var13 = var45 + 17;
                                 Bounds var65 = var2.av(0, 34, Strings.mp, var12, var13);
                                 if (var40 == 1) {
                                    if (var14.aw(var8, var9)) {
                                       Ignored.af_renamed("https://www.jagex.com/terms", true, false);
                                    } else if (var51.aw(var8, var9)) {
                                       Ignored.af_renamed("https://www.jagex.com/terms/privacy", true, false);
                                    } else if (var57.aw(var8, var9) || var65.aw(var8, var9)) {
                                       Ignored.af_renamed("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                    }
                                 }

                                 var12 = fy.az * 950254081 - 80;
                                 var45 = 311;
                                 if (1 == var40 && var8 >= var12 - 75 && var8 <= var12 + 75 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                                    aj.clientPreferences.ap(Client.cl * 976454555);
                                    cz.ay_renamed(true);
                                 }

                                 var12 = fy.az * 950254081 + 80;
                                 if (1 == var40 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                                    cz.ce = 127737743;
                                 }
                              } else if (1145608355 * cz.ce == 13) {
                                 var12 = fy.az * 950254081;
                                 var45 = 321;
                                 if (1 == var40 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                                    cz.ay_renamed(true);
                                 }
                              } else if (1145608355 * cz.ce == 14) {
                                 String var54 = "";
                                 switch (-1478945003 * cz.ba) {
                                    case 0:
                                       var54 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                       break;
                                    case 1:
                                       var54 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                       break;
                                    case 2:
                                       var54 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                       break;
                                    default:
                                       aq.aa_renamed(false);
                                 }

                                 var13 = 678588245 * cz.ak + 180;
                                 var44 = 276;
                                 if (1 == var40 && var8 >= var13 - 75 && var8 <= 75 + var13 && var9 >= var44 - 20 && var9 <= var44 + 20) {
                                    Ignored.af_renamed(var54, true, false);
                                    he.ax_renamed(Strings.ls, Strings.lf, Strings.li);
                                    ee.ak_renamed(6);
                                    return;
                                 }

                                 var13 = cz.ak * 678588245 + 180;
                                 var44 = 326;
                                 if (var40 == 1 && var8 >= var13 - 75 && var8 <= var13 + 75 && var9 >= var44 - 20 && var9 <= var44 + 20) {
                                    aq.aa_renamed(false);
                                 }
                              } else if (24 == cz.ce * 1145608355) {
                                 var12 = cz.ak * 678588245 + 180;
                                 var45 = 301;
                                 if (1 == var40 && var8 >= var12 - 75 && var8 <= var12 + 75 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                                    cz.ay_renamed(false);
                                 }
                              } else if (32 == cz.ce * 1145608355) {
                                 var12 = 180 + 678588245 * cz.ak - 80;
                                 var45 = 321;
                                 if (var40 == 1 && var8 >= var12 - 75 && var8 <= var12 + 75 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                                    Ignored.af_renamed(InvType.nb_renamed("secure", true) + "m=dob/set_dob.ws", true, false);
                                    he.ax_renamed(Strings.ls, Strings.lf, Strings.li);
                                    ee.ak_renamed(6);
                                    return;
                                 }

                                 var12 = 80 + 180 + cz.ak * 678588245;
                                 if (1 == var40 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                                    aq.aa_renamed(true);
                                 }
                              } else if (1145608355 * cz.ce == 33) {
                                 var12 = 180 + cz.ak * 678588245;
                                 var45 = 276;
                                 if (var40 == 1 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var45 - 20 && var9 <= 20 + var45) {
                                    Ignored.af_renamed(Strings.ns, true, false);
                                 }

                                 var12 = 180 + 678588245 * cz.ak;
                                 var45 = 326;
                                 if (1 == var40 && var8 >= var12 - 75 && var8 <= 75 + var12 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                                    aq.aa_renamed(true);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var11.ag()) {
                                       var42 = 321;
                                       if (var40 == 1 && var9 >= var42 - 20 && var9 <= 20 + var42) {
                                          aq.aa_renamed(true);
                                       }

                                       return;
                                    }
                                 } while(84 != 546317845 * var11.ai && 546317845 * var11.ai != 13);

                                 aq.aa_renamed(true);
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

   static final void ic_renamed() {
      for(int var1 = 0; var1 < 265474485 * Client.iw; ++var1) {
         int var2 = Client.iy[var1];
         Npc var3 = Client.npcs[var2];
         if (null != var3) {
            ReflectionCheck.ii_renamed(var3, 1458410691 * var3.type.size);
         }
      }

   }

   static final void jb_renamed(lm var0) {
      PacketBit var2 = Client.packetWriter.bit;
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
         var3 = var2.g1();
         var4 = var2.g1();
         var5 = (var4 >> 4 & 7) + aa.jp * 1555915261;
         var6 = (var4 & 7) + -191732975 * FontName.jt;
         var7 = var2.dq() * 4;
         var8 = var2.ep();
         var9 = var2.dq();
         var10 = var2.cl();
         byte var41 = var2.dj();
         var12 = var2.g1n() * 4;
         var13 = var2.cl();
         var14 = var2.cy();
         byte var42 = var2.dx();
         var15 = var42 + var5;
         var11 = var41 + var6;
         if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var15 >= 0 && var11 >= 0 && var15 < 104 && var11 < 104 && 65535 != var8) {
            var5 = var5 * 128 + 64;
            var6 = 64 + var6 * 128;
            var15 = 64 + var15 * 128;
            var11 = 128 * var11 + 64;
            Projectile var43 = new Projectile(var8, -1727408401 * GameShell.plane, var5, var6, fq.getTileHeight(var5, var6, GameShell.plane * -1727408401) - var12, Client.ep * -1886224337 + var10, var13 + -1886224337 * Client.ep, var3, var9, var14, var7);
            var43.setDestination(var15, var11, fq.getTileHeight(var15, var11, -1727408401 * GameShell.plane) - var7, Client.ep * -1886224337 + var10);
            Client.projectiles.addFirst(var43);
         }

      } else {
         if (var0 == lm.an) {
            var3 = var2.cl();
            var4 = var2.dx();
            var5 = var2.dd();
            var6 = var2.db();
            var7 = (var6 >> 4 & 7) + 1555915261 * aa.jp;
            var8 = -191732975 * FontName.jt + (var6 & 7);
            var9 = var2.g1s();
            var10 = var2.cl();
            var11 = var2.dd();
            var12 = var2.g1();
            var13 = var12 >> 2;
            var14 = var12 & 3;
            var15 = Client.jy[var13];
            int var16 = var2.ep();
            int var17 = var2.eo();
            Player var18;
            if (var3 == -549033243 * Client.localPlayerIndex) {
               var18 = MusicPatchNode.localPlayer;
            } else {
               var18 = Client.players[var3];
            }

            if (null != var18) {
               hq var19 = fw.an_renamed(var17);
               int var20;
               int var21;
               if (1 != var14 && var14 != 3) {
                  var20 = -1339930361 * var19.av;
                  var21 = var19.ar * -1659393955;
               } else {
                  var20 = -1659393955 * var19.ar;
                  var21 = var19.av * -1339930361;
               }

               int var22 = var7 + (var20 >> 1);
               int var23 = var7 + (var20 + 1 >> 1);
               int var24 = (var21 >> 1) + var8;
               int var25 = (1 + var21 >> 1) + var8;
               int[][] var26 = Tiles.Tiles_heights[GameShell.plane * -1727408401];
               int var27 = var26[var22][var25] + var26[var23][var24] + var26[var22][var24] + var26[var23][var25] >> 2;
               int var28 = (var7 << 7) + (var20 << 6);
               int var29 = (var21 << 6) + (var8 << 7);
               it var30 = var19.at(var13, var14, var26, var28, var27, var29);
               if (var30 != null) {
                  bz.jz_renamed(GameShell.plane * -1727408401, var7, var8, var15, -1, 0, 0, 31, var10 + 1, 1 + var16);
                  var18.headIconPrayer = (Client.ep * -1886224337 + var10) * -746690647;
                  var18.animationCycleStart = -377301053 * (var16 + Client.ep * -1886224337);
                  var18.ah = var30;
                  var18.ax = var7 * -494827904 + -247413952 * var20;
                  var18.ag = var8 * -856229504 + var21 * -428114752;
                  var18.ai = var27 * 1514773119;
                  byte var31;
                  if (var9 > var11) {
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
            var3 = var2.dq();
            var4 = (var3 >> 4 & 7) + 1555915261 * aa.jp;
            var5 = (var3 & 7) + -191732975 * FontName.jt;
            var6 = var2.g4s();
            var7 = var2.eo();
            var8 = var2.g4s();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
               NodeDeque var39 = Client.objStacks[-1727408401 * GameShell.plane][var4][var5];
               if (var39 != null) {
                  for(Obj var34 = (Obj)var39.last(); var34 != null; var34 = (Obj)var39.previous()) {
                     if ((var7 & 32767) == 176307405 * var34.id && var8 == -1745152527 * var34.quantity) {
                        var34.quantity = var6 * -1785382127;
                        break;
                     }
                  }

                  em.kd_renamed(var4, var5);
               }
            }

         } else {
            Obj var35;
            if (lm.aa == var0) {
               var2.db();
               var3 = var2.en();
               var4 = var2.db();
               var5 = var2.g1();
               var6 = 1555915261 * aa.jp + (var5 >> 4 & 7);
               var7 = FontName.jt * -191732975 + (var5 & 7);
               var8 = var2.ep();
               var2.da();
               var2.ep();
               var2.g1n();
               if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                  var35 = new Obj();
                  var35.id = var8 * -968355835;
                  var35.quantity = var3 * -1785382127;
                  var35.af(var4);
                  if (Client.objStacks[GameShell.plane * -1727408401][var6][var7] == null) {
                     Client.objStacks[GameShell.plane * -1727408401][var6][var7] = new NodeDeque();
                  }

                  Client.objStacks[GameShell.plane * -1727408401][var6][var7].addFirst(var35);
                  em.kd_renamed(var6, var7);
               }

            } else if (var0 == lm.ab) {
               var3 = var2.g1();
               var4 = var2.dq();
               var5 = 1555915261 * aa.jp + (var4 >> 4 & 7);
               var6 = (var4 & 7) + -191732975 * FontName.jt;
               var7 = var2.g1n();
               var8 = var7 >> 2;
               var9 = var7 & 3;
               var10 = Client.jy[var8];
               var11 = var2.da();
               if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                  bz.jz_renamed(-1727408401 * GameShell.plane, var5, var6, var10, var11, var8, var9, var3, 0, -1);
               }

            } else {
               NodeDeque var32;
               if (lm.at == var0) {
                  var3 = var2.g1n();
                  var4 = (var3 >> 4 & 7) + aa.jp * 1555915261;
                  var5 = (var3 & 7) + FontName.jt * -191732975;
                  var6 = var2.da();
                  var7 = var2.er();
                  if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                     var32 = Client.objStacks[-1727408401 * GameShell.plane][var4][var5];
                     if (null != var32) {
                        for(var35 = (Obj)var32.last(); null != var35; var35 = (Obj)var32.previous()) {
                           if ((var6 & 32767) == 176307405 * var35.id && -1745152527 * var35.quantity == var7) {
                              var35.remove();
                              break;
                           }
                        }

                        if (var32.last() == null) {
                           Client.objStacks[GameShell.plane * -1727408401][var4][var5] = null;
                        }

                        em.kd_renamed(var4, var5);
                     }
                  }

               } else {
                  if (lm.aq == var0) {
                     var3 = var2.eo();
                     var4 = var2.g1n();
                     var5 = var4 >> 4 & 15;
                     var6 = var4 & 7;
                     var7 = var2.db();
                     var8 = 1555915261 * aa.jp + (var7 >> 4 & 7);
                     var9 = (var7 & 7) + -191732975 * FontName.jt;
                     var10 = var2.dq();
                     if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                        var11 = var5 + 1;
                        if (MusicPatchNode.localPlayer.pathX[0] >= var8 - var11 && MusicPatchNode.localPlayer.pathX[0] <= var11 + var8 && MusicPatchNode.localPlayer.pathY[0] >= var9 - var11 && MusicPatchNode.localPlayer.pathY[0] <= var9 + var11 && aj.clientPreferences.az() != 0 && var6 > 0 && -297150195 * Client.soundEffectCount < 50) {
                           Client.tu[Client.soundEffectCount * -297150195] = var3;
                           Client.tr[Client.soundEffectCount * -297150195] = var6;
                           Client.tg[-297150195 * Client.soundEffectCount] = var10;
                           Client.soundEffects[Client.soundEffectCount * -297150195] = null;
                           Client.tb[Client.soundEffectCount * -297150195] = (var9 << 8) + (var8 << 16) + var5;
                           Client.soundEffectCount += 831233477;
                        }
                     }
                  }

                  if (var0 == lm.al) {
                     var3 = var2.eo();
                     var4 = var2.g1n();
                     var5 = (var4 >> 4 & 7) + aa.jp * 1555915261;
                     var6 = (var4 & 7) + FontName.jt * -191732975;
                     var7 = var2.db();
                     if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                        var32 = Client.objStacks[GameShell.plane * -1727408401][var5][var6];
                        if (null != var32) {
                           for(var35 = (Obj)var32.last(); null != var35; var35 = (Obj)var32.previous()) {
                              if ((var3 & 32767) == 176307405 * var35.id) {
                                 var35.af(var7);
                                 break;
                              }
                           }
                        }
                     }

                  } else if (var0 != lm.ac) {
                     if (lm.af == var0) {
                        var3 = var2.db();
                        var4 = aa.jp * 1555915261 + (var3 >> 4 & 7);
                        var5 = FontName.jt * -191732975 + (var3 & 7);
                        var6 = var2.g1();
                        var7 = var6 >> 2;
                        var8 = var6 & 3;
                        var9 = Client.jy[var7];
                        if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                           bz.jz_renamed(-1727408401 * GameShell.plane, var4, var5, var9, -1, var7, var8, 31, 0, -1);
                        }

                     } else if (var0 == lm.aw) {
                        var3 = var2.g1n();
                        var4 = var2.cl();
                        var5 = var2.dq();
                        var6 = (var5 >> 4 & 7) + 1555915261 * aa.jp;
                        var7 = FontName.jt * -191732975 + (var5 & 7);
                        var8 = var2.da();
                        if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                           var6 = 128 * var6 + 64;
                           var7 = 128 * var7 + 64;
                           GraphicsObject var33 = new GraphicsObject(var8, GameShell.plane * -1727408401, var6, var7, fq.getTileHeight(var6, var7, GameShell.plane * -1727408401) - var3, var4, -1886224337 * Client.ep);
                           Client.graphicsObjects.addFirst(var33);
                        }

                     }
                  } else {
                     var3 = var2.g1();
                     var4 = (var3 >> 4 & 7) + aa.jp * 1555915261;
                     var5 = (var3 & 7) + FontName.jt * -191732975;
                     var6 = var2.da();
                     var7 = var2.g1n();
                     var8 = var7 >> 2;
                     var9 = var7 & 3;
                     var10 = Client.jy[var8];
                     if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
                        if (var10 == 0) {
                           Wall var36 = bx.scene.az(GameShell.plane * -1727408401, var4, var5);
                           if (var36 != null) {
                              var12 = InterfaceParent.at(-4009183385476919801L * var36.tag);
                              if (2 == var8) {
                                 var36.entity1 = new DynamicObject(var12, 2, var9 + 4, -1727408401 * GameShell.plane, var4, var5, var6, false, var36.entity1);
                                 var36.entity2 = new DynamicObject(var12, 2, var9 + 1 & 3, -1727408401 * GameShell.plane, var4, var5, var6, false, var36.entity2);
                              } else {
                                 var36.entity1 = new DynamicObject(var12, var8, var9, GameShell.plane * -1727408401, var4, var5, var6, false, var36.entity1);
                              }

                              return;
                           }
                        }

                        if (1 == var10) {
                           WallDecoration var37 = bx.scene.ad(GameShell.plane * -1727408401, var4, var5);
                           if (null != var37) {
                              var12 = InterfaceParent.at(-4691380879163567243L * var37.tag);
                              if (4 != var8 && var8 != 5) {
                                 if (6 == var8) {
                                    var37.entity1 = new DynamicObject(var12, 4, 4 + var9, -1727408401 * GameShell.plane, var4, var5, var6, false, var37.entity1);
                                 } else if (7 == var8) {
                                    var37.entity1 = new DynamicObject(var12, 4, (2 + var9 & 3) + 4, GameShell.plane * -1727408401, var4, var5, var6, false, var37.entity1);
                                 } else if (var8 == 8) {
                                    var37.entity1 = new DynamicObject(var12, 4, 4 + var9, -1727408401 * GameShell.plane, var4, var5, var6, false, var37.entity1);
                                    var37.entity2 = new DynamicObject(var12, 4, 4 + (2 + var9 & 3), -1727408401 * GameShell.plane, var4, var5, var6, false, var37.entity2);
                                 }
                              } else {
                                 var37.entity1 = new DynamicObject(var12, 4, var9, GameShell.plane * -1727408401, var4, var5, var6, false, var37.entity1);
                              }

                              return;
                           }
                        }

                        if (var10 == 2) {
                           Scenery var38 = bx.scene.ae(-1727408401 * GameShell.plane, var4, var5);
                           if (11 == var8) {
                              var8 = 10;
                           }

                           if (null != var38) {
                              var38.entity = new DynamicObject(InterfaceParent.at(5016412888503339625L * var38.ax), var8, var9, GameShell.plane * -1727408401, var4, var5, var6, false, var38.entity);
                              return;
                           }
                        }

                        if (var10 == 3) {
                           FloorDecoration var40 = bx.scene.ap(-1727408401 * GameShell.plane, var4, var5);
                           if (var40 != null) {
                              var40.entity = new DynamicObject(InterfaceParent.at(3423223696102332293L * var40.tag), 22, var9, -1727408401 * GameShell.plane, var4, var5, var6, false, var40.entity);
                              return;
                           }
                        }

                        hu.ju_renamed(-1727408401 * GameShell.plane, var4, var5, var10, var6);
                     }

                  }
               }
            }
         }
      }
   }
}
