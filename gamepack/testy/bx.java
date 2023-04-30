import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

public class bx {
   static final float aq = 3.0F;
   static final int ab = 3;
   static tc[] kg;
   public static Applet af = null;
   public static String an = "";
   static int[] ai;
   static final int ay = 11;
   static cl[] au;
   static ie js;
   static final int ah = 585;
   static final int aw = 0;
   static final int ax = 10;
   static final int ar = 20;

   public static String ac(String var0, int var1) {
      try {
         if (var0 != null) {
            if (var1 <= -638497309) {
               throw new IllegalStateException();
            }

            if (!var0.isEmpty()) {
               if (var1 <= -638497309) {
                  throw new IllegalStateException();
               }

               if (var0.charAt(0) != '#') {
                  return var0;
               }

               if (var1 <= -638497309) {
                  throw new IllegalStateException();
               }
            }
         }

         return "";
      } catch (RuntimeException var2) {
         throw db.an(var2, "bx.ac(" + ')');
      }
   }

   public static void au(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
            }
         }

         if (an.startsWith("win") && !var2) {
            cf.an(var0, 0, -2147216913);
         } else if (an.startsWith("mac")) {
            ia.aw(var0, 1, "openjs", -2048568680);
         } else {
            ia.aw(var0, 2, "openjs", -2020654589);
         }
      } else {
         ia.aw(var0, 3, "openjs", -604957476);
      }

   }

   static int as(int var0, ch var1, boolean var2, byte var3) {
      try {
         mq var4 = gh.an(cy.al[(cy.at -= 427135973) * -964267539], (byte)5);
         if (var0 == 2500) {
            if (var3 <= 2) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.ce * 262951665;
               return 1;
            }
         } else if (var0 == 2501) {
            if (var3 <= 2) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = -747355095 * var4.ci;
               return 1;
            }
         } else if (2502 == var0) {
            cy.al[(cy.at += 427135973) * -964267539 - 1] = -794961409 * var4.cs;
            return 1;
         } else if (var0 == 2503) {
            cy.al[(cy.at += 427135973) * -964267539 - 1] = 1473950221 * var4.cc;
            return 1;
         } else if (2504 == var0) {
            if (var3 <= 2) {
               throw new IllegalStateException();
            } else {
               int[] var10000 = cy.al;
               int var10001 = (cy.at += 427135973) * -964267539 - 1;
               byte var10002;
               if (var4.ck) {
                  if (var3 <= 2) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (2505 == var0) {
            if (var3 <= 2) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.cu * 913615679;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "bx.as(" + ')');
      }
   }

   bx() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "bx.<init>(" + ')');
      }
   }

   static boolean aq(String var0, int var1) {
      return ia.aw(var0, var1, "openjs", -2017257398);
   }

   static boolean al(String var0, int var1) {
      return ia.aw(var0, var1, "openjs", -2016728682);
   }

   static int ab(int var0, ch var1, boolean var2, byte var3) {
      try {
         int var5 = -1;
         mq var4;
         if (var0 >= 2000) {
            if (var3 >= 64) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var5 = cy.al[(cy.at -= 427135973) * -964267539];
            var4 = gh.an(var5, (byte)5);
         } else {
            var4 = var2 ? bq.ag : an.ai;
         }

         int var15;
         if (1100 == var0) {
            if (var3 >= 64) {
               throw new IllegalStateException();
            } else {
               cy.at -= 854271946;
               var15 = cy.al[cy.at * -964267539];
               int var12 = cy.al[-964267539 * cy.at + 1];
               if (var4.bg * 883712245 == 12) {
                  mz var8 = var4.bj((byte)-21);
                  if (var8 != null) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     }

                     if (var8.ay(var15, var12, (byte)114)) {
                        if (var3 >= 64) {
                           throw new IllegalStateException();
                        }

                        fw.ma(var4, -1259476170);
                     }
                  }
               } else {
                  var4.cq = 66597705 * var15;
                  if (-1469632775 * var4.cq > -773060713 * var4.cf - var4.cs * -794961409) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     }

                     var4.cq = var4.cf * 18431759 - var4.cs * 460912311;
                  }

                  if (var4.cq * -1469632775 < 0) {
                     var4.cq = 0;
                  }

                  var4.cm = var12 * 946188063;
                  if (var4.cm * 1223232735 > -1273374131 * var4.cl - 1473950221 * var4.cc) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     }

                     var4.cm = var4.cl * 1941770835 - var4.cc * 978547347;
                  }

                  if (var4.cm * 1223232735 < 0) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     }

                     var4.cm = 0;
                  }

                  fw.ma(var4, -947145035);
               }

               return 1;
            }
         } else if (var0 == 1101) {
            if (var3 >= 64) {
               throw new IllegalStateException();
            } else {
               var4.cg = cy.al[(cy.at -= 427135973) * -964267539] * -1604768377;
               fw.ma(var4, -1063051972);
               return 1;
            }
         } else {
            boolean var10001;
            if (1102 == var0) {
               if (var3 >= 64) {
                  throw new IllegalStateException();
               } else {
                  if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var4.cv = var10001;
                  fw.ma(var4, -931974277);
                  return 1;
               }
            } else if (1103 == var0) {
               if (var3 >= 64) {
                  throw new IllegalStateException();
               } else {
                  var4.co = cy.al[(cy.at -= 427135973) * -964267539] * 1833148663;
                  fw.ma(var4, -1480322617);
                  return 1;
               }
            } else if (var0 == 1104) {
               if (var3 >= 64) {
                  throw new IllegalStateException();
               } else {
                  var4.cw = cy.al[(cy.at -= 427135973) * -964267539] * 1040382753;
                  fw.ma(var4, -1063049352);
                  return 1;
               }
            } else if (1105 == var0) {
               if (var3 >= 64) {
                  throw new IllegalStateException();
               } else {
                  var4.ch = cy.al[(cy.at -= 427135973) * -964267539] * -504605111;
                  fw.ma(var4, -932451390);
                  return 1;
               }
            } else if (1106 == var0) {
               if (var3 >= 64) {
                  throw new IllegalStateException();
               } else {
                  var4.cd = cy.al[(cy.at -= 427135973) * -964267539] * 877496813;
                  fw.ma(var4, -1285822924);
                  return 1;
               }
            } else if (1107 == var0) {
               if (var3 >= 64) {
                  throw new IllegalStateException();
               } else {
                  if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var4.dm = var10001;
                  fw.ma(var4, -1400918825);
                  return 1;
               }
            } else if (1108 == var0) {
               if (var3 >= 64) {
                  throw new IllegalStateException();
               } else {
                  var4.dr = -1714481443;
                  var4.dl = cy.al[(cy.at -= 427135973) * -964267539] * 509431749;
                  fw.ma(var4, -2131428764);
                  return 1;
               }
            } else if (1109 == var0) {
               if (var3 >= 64) {
                  throw new IllegalStateException();
               } else {
                  cy.at -= -1732151458;
                  var4.dg = cy.al[cy.at * -964267539] * 1759898391;
                  var4.de = cy.al[cy.at * -964267539 + 1] * 1163821709;
                  var4.dh = -142910041 * cy.al[-964267539 * cy.at + 2];
                  var4.dp = cy.al[-964267539 * cy.at + 3] * -230241203;
                  var4.du = cy.al[-964267539 * cy.at + 4] * -1051718121;
                  var4.db = cy.al[5 + cy.at * -964267539] * -467727501;
                  fw.ma(var4, -1300083234);
                  return 1;
               }
            } else if (var0 == 1110) {
               if (var3 >= 64) {
                  throw new IllegalStateException();
               } else {
                  var15 = cy.al[(cy.at -= 427135973) * -964267539];
                  if (-1526544909 * var4.dv != var15) {
                     var4.dv = -1195025605 * var15;
                     var4.gx = 0;
                     var4.gl = 0;
                     fw.ma(var4, -1009300791);
                  }

                  return 1;
               }
            } else if (var0 == 1111) {
               if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                  if (var3 >= 64) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var4.dj = var10001;
               fw.ma(var4, -1822094171);
               return 1;
            } else if (var0 == 1112) {
               if (var3 >= 64) {
                  throw new IllegalStateException();
               } else {
                  String var16 = cy.aa[(ay -= -1086551379) * -2017760987];
                  if (!var16.equals(var4.ds)) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     }

                     var4.ds = var16;
                     fw.ma(var4, -1585171731);
                  }

                  return 1;
               }
            } else {
               mz var10;
               if (1113 == var0) {
                  if (var3 >= 64) {
                     throw new IllegalStateException();
                  } else {
                     var4.dy = cy.al[(cy.at -= 427135973) * -964267539] * 1858899927;
                     if (883712245 * var4.bg == 12) {
                        if (var3 >= 64) {
                           throw new IllegalStateException();
                        }

                        var10 = var4.bj((byte)-64);
                        if (var10 != null) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           }

                           var10.ar(-83630880);
                        }
                     }

                     fw.ma(var4, -1339607446);
                     return 1;
                  }
               } else if (var0 == 1114) {
                  if (var3 >= 64) {
                     throw new IllegalStateException();
                  } else {
                     cy.at -= 1281407919;
                     if (12 == var4.bg * 883712245) {
                        if (var3 >= 64) {
                           throw new IllegalStateException();
                        }

                        var10 = var4.bj((byte)-50);
                        if (var10 != null) {
                           var10.ao(cy.al[-964267539 * cy.at], cy.al[cy.at * -964267539 + 1], 1553777879);
                           var10.ax(cy.al[2 + cy.at * -964267539], 2084045870);
                        }
                     } else {
                        var4.eo = 1612549297 * cy.al[cy.at * -964267539];
                        var4.eq = -522107433 * cy.al[cy.at * -964267539 + 1];
                        var4.ep = 2116078665 * cy.al[2 + cy.at * -964267539];
                     }

                     fw.ma(var4, -1974465525);
                     return 1;
                  }
               } else if (var0 == 1115) {
                  if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var4.et = var10001;
                  fw.ma(var4, -875283748);
                  return 1;
               } else if (1116 == var0) {
                  if (var3 >= 64) {
                     throw new IllegalStateException();
                  } else {
                     var4.dw = cy.al[(cy.at -= 427135973) * -964267539] * 646392503;
                     fw.ma(var4, -1135395149);
                     return 1;
                  }
               } else if (1117 == var0) {
                  if (var3 >= 64) {
                     throw new IllegalStateException();
                  } else {
                     var4.dc = cy.al[(cy.at -= 427135973) * -964267539] * -140657215;
                     fw.ma(var4, -1130124185);
                     return 1;
                  }
               } else if (1118 == var0) {
                  if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var4.do = var10001;
                  fw.ma(var4, -1270886750);
                  return 1;
               } else if (var0 == 1119) {
                  if (var3 >= 64) {
                     throw new IllegalStateException();
                  } else {
                     if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                        if (var3 >= 64) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var4.di = var10001;
                     fw.ma(var4, -1415777562);
                     return 1;
                  }
               } else if (1120 == var0) {
                  if (var3 >= 64) {
                     throw new IllegalStateException();
                  } else {
                     cy.at -= 854271946;
                     var4.cf = -1469650905 * cy.al[-964267539 * cy.at];
                     var4.cl = cy.al[-964267539 * cy.at + 1] * -1357451643;
                     fw.ma(var4, -589899660);
                     if (var5 != -1 && 0 == var4.bg * 883712245) {
                        if (var3 >= 64) {
                           throw new IllegalStateException();
                        }

                        je.lz(hn.ap[var5 >> 16], var4, false, (byte)97);
                     }

                     return 1;
                  }
               } else if (var0 == 1121) {
                  if (var3 >= 64) {
                     throw new IllegalStateException();
                  } else {
                     do.kf(1713081171 * var4.bs, 55577617 * var4.br, (short)30588);
                     client.pg = var4;
                     fw.ma(var4, -772862177);
                     return 1;
                  }
               } else if (1122 == var0) {
                  if (var3 >= 64) {
                     throw new IllegalStateException();
                  } else {
                     var4.ct = cy.al[(cy.at -= 427135973) * -964267539] * 1679014525;
                     fw.ma(var4, -1355236161);
                     return 1;
                  }
               } else if (1123 == var0) {
                  if (var3 >= 64) {
                     throw new IllegalStateException();
                  } else {
                     var4.cr = cy.al[(cy.at -= 427135973) * -964267539] * 714852617;
                     fw.ma(var4, -1109886796);
                     return 1;
                  }
               } else if (var0 == 1124) {
                  if (var3 >= 64) {
                     throw new IllegalStateException();
                  } else {
                     var4.cz = cy.al[(cy.at -= 427135973) * -964267539] * -1159723969;
                     fw.ma(var4, -1723613008);
                     return 1;
                  }
               } else if (var0 == 1125) {
                  var15 = cy.al[(cy.at -= 427135973) * -964267539];
                  ta var11 = (ta)ht.af(nb.au(1113408540), var15, (short)173);
                  if (var11 != null) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     }

                     var4.cb = var11;
                     fw.ma(var4, -1190731439);
                  }

                  return 1;
               } else {
                  boolean var13;
                  boolean var10000;
                  if (var0 == 1126) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     } else {
                        if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        var13 = var10000;
                        var4.cj = var13;
                        return 1;
                     }
                  } else if (1127 == var0) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     } else {
                        if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        var13 = var10000;
                        var4.dx = var13;
                        return 1;
                     }
                  } else if (var0 == 1129) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     } else {
                        var4.cp = cy.aa[(ay -= -1086551379) * -2017760987];
                        fw.ma(var4, -1494756041);
                        return 1;
                     }
                  } else if (1130 == var0) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     } else {
                        var4.aj(cy.aa[(ay -= -1086551379) * -2017760987], ag.iq, cw.ho(-451145787));
                        return 1;
                     }
                  } else if (var0 == 1131) {
                     if (var3 >= 64) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 854271946;
                        var4.ad(cy.al[cy.at * -964267539], cy.al[cy.at * -964267539 + 1], (byte)-108);
                        return 1;
                     }
                  } else if (var0 == 1132) {
                     var4.ae(cy.aa[(ay -= -1086551379) * -2017760987], cy.al[(cy.at -= 427135973) * -964267539], 1150325710);
                     return 1;
                  } else {
                     lo var14;
                     if (var0 == 1133) {
                        cy.at -= 427135973;
                        var14 = var4.bn(-1740765458);
                        if (var14 != null) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           }

                           var14.af = 202848117 * cy.al[-964267539 * cy.at];
                           fw.ma(var4, -1672427722);
                        }

                        return 1;
                     } else if (var0 == 1134) {
                        if (var3 >= 64) {
                           throw new IllegalStateException();
                        } else {
                           cy.at -= 427135973;
                           var14 = var4.bn(-1740765458);
                           if (null != var14) {
                              if (var3 >= 64) {
                                 throw new IllegalStateException();
                              }

                              var14.an = cy.al[cy.at * -964267539] * -1464228981;
                              fw.ma(var4, -1662789089);
                           }

                           return 1;
                        }
                     } else if (var0 == 1135) {
                        if (var3 >= 64) {
                           throw new IllegalStateException();
                        } else {
                           ay -= -1086551379;
                           var10 = var4.bj((byte)74);
                           if (null != var10) {
                              if (var3 >= 64) {
                                 throw new IllegalStateException();
                              }

                              var4.da = cy.aa[-2017760987 * dm.ay];
                           }

                           return 1;
                        }
                     } else if (1136 == var0) {
                        cy.at -= 427135973;
                        var14 = var4.bn(-1740765458);
                        if (var14 != null) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           }

                           var14.aw = -1652794843 * cy.al[-964267539 * cy.at];
                           fw.ma(var4, -1540567087);
                        }

                        return 1;
                     } else if (1137 == var0) {
                        if (var3 >= 64) {
                           throw new IllegalStateException();
                        } else {
                           cy.at -= 427135973;
                           var10 = var4.bj((byte)0);
                           if (var10 != null) {
                              if (var3 >= 64) {
                                 throw new IllegalStateException();
                              }

                              if (var10.al(cy.al[cy.at * -964267539], 2034737462)) {
                                 if (var3 >= 64) {
                                    throw new IllegalStateException();
                                 }

                                 fw.ma(var4, -1663792807);
                              }
                           }

                           return 1;
                        }
                     } else if (1138 == var0) {
                        if (var3 >= 64) {
                           throw new IllegalStateException();
                        } else {
                           cy.at -= 427135973;
                           var10 = var4.bj((byte)26);
                           if (var10 != null) {
                              if (var3 >= 64) {
                                 throw new IllegalStateException();
                              }

                              if (var10.at(cy.al[-964267539 * cy.at], (byte)16)) {
                                 fw.ma(var4, -1071804672);
                              }
                           }

                           return 1;
                        }
                     } else if (var0 == 1139) {
                        cy.at -= 427135973;
                        var10 = var4.bj((byte)66);
                        if (null != var10) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           }

                           if (var10.aa(cy.al[cy.at * -964267539], -1888462912)) {
                              if (var3 >= 64) {
                                 throw new IllegalStateException();
                              }

                              fw.ma(var4, -1406914923);
                           }
                        }

                        return 1;
                     } else {
                        mz var7;
                        if (var0 == 1140) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 >= 64) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var13 = var10000;
                              client.si.ag((byte)31);
                              var7 = var4.bj((byte)-56);
                              if (null != var7) {
                                 if (var3 >= 64) {
                                    throw new IllegalStateException();
                                 }

                                 if (var7.an(var13, 832608587)) {
                                    if (var13) {
                                       if (var3 >= 64) {
                                          throw new IllegalStateException();
                                       }

                                       client.si.ax(var4, -583881235);
                                    }

                                    fw.ma(var4, -2070746507);
                                 }
                              }

                              return 1;
                           }
                        } else if (1141 == var0) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 >= 64) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var13 = var10000;
                              if (!var13) {
                                 if (var3 >= 64) {
                                    throw new IllegalStateException();
                                 }

                                 if (client.si.ai((short)32767) == var4) {
                                    if (var3 >= 64) {
                                       throw new IllegalStateException();
                                    }

                                    client.si.ag((byte)-3);
                                    fw.ma(var4, -1890877688);
                                 }
                              }

                              var7 = var4.bj((byte)-8);
                              if (var7 != null) {
                                 if (var3 >= 64) {
                                    throw new IllegalStateException();
                                 }

                                 var7.aw(var13, 1575779976);
                              }

                              return 1;
                           }
                        } else if (1142 == var0) {
                           cy.at -= 854271946;
                           var10 = var4.bj((byte)-41);
                           if (var10 != null) {
                              if (var3 >= 64) {
                                 throw new IllegalStateException();
                              }

                              if (var10.ap(cy.al[cy.at * -964267539], cy.al[1 + cy.at * -964267539], (byte)19)) {
                                 if (var3 >= 64) {
                                    throw new IllegalStateException();
                                 }

                                 fw.ma(var4, -1633709236);
                              }
                           }

                           return 1;
                        } else if (var0 == 1143) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           } else {
                              cy.at -= 427135973;
                              var10 = var4.bj((byte)-7);
                              if (null != var10) {
                                 if (var3 >= 64) {
                                    throw new IllegalStateException();
                                 }

                                 if (var10.ap(cy.al[cy.at * -964267539], cy.al[-964267539 * cy.at], (byte)19)) {
                                    if (var3 >= 64) {
                                       throw new IllegalStateException();
                                    }

                                    fw.ma(var4, -1737202384);
                                 }
                              }

                              return 1;
                           }
                        } else if (1144 == var0) {
                           cy.at -= 427135973;
                           var10 = var4.bj((byte)-77);
                           if (var10 != null) {
                              if (var3 >= 64) {
                                 throw new IllegalStateException();
                              }

                              var10.ag(cy.al[-964267539 * cy.at], 1444501030);
                              fw.ma(var4, -1946722325);
                           }

                           return 1;
                        } else if (var0 == 1145) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           } else {
                              cy.at -= 427135973;
                              var10 = var4.bj((byte)-107);
                              if (null != var10) {
                                 if (var3 >= 64) {
                                    throw new IllegalStateException();
                                 }

                                 var10.ai(cy.al[cy.at * -964267539], -1564790862);
                              }

                              return 1;
                           }
                        } else if (var0 == 1146) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           } else {
                              cy.at -= 427135973;
                              var10 = var4.bj((byte)70);
                              if (var10 != null) {
                                 if (var3 >= 64) {
                                    throw new IllegalStateException();
                                 }

                                 var10.av(cy.al[cy.at * -964267539], (byte)59);
                              }

                              return 1;
                           }
                        } else if (var0 == 1147) {
                           if (var3 >= 64) {
                              throw new IllegalStateException();
                           } else {
                              cy.at -= 427135973;
                              var10 = var4.bj((byte)112);
                              if (null != var10) {
                                 if (var3 >= 64) {
                                    throw new IllegalStateException();
                                 }

                                 var10.ah(cy.al[cy.at * -964267539], (short)-6347);
                                 fw.ma(var4, -810371265);
                              }

                              return 1;
                           }
                        } else {
                           bb var6;
                           if (1148 == var0) {
                              if (var3 >= 64) {
                                 throw new IllegalStateException();
                              } else {
                                 cy.at -= 854271946;
                                 var6 = var4.bs(2008263270);
                                 if (null != var6) {
                                    if (var3 >= 64) {
                                       throw new IllegalStateException();
                                    }

                                    var6.af(cy.al[-964267539 * cy.at], cy.al[cy.at * -964267539 + 1], (byte)0);
                                 }

                                 return 1;
                              }
                           } else if (1149 == var0) {
                              if (var3 >= 64) {
                                 throw new IllegalStateException();
                              } else {
                                 cy.at -= 854271946;
                                 var6 = var4.bs(1888304373);
                                 if (var6 != null) {
                                    if (var3 >= 64) {
                                       throw new IllegalStateException();
                                    }

                                    var6.an((char)cy.al[cy.at * -964267539], cy.al[-964267539 * cy.at + 1], 48495477);
                                 }

                                 return 1;
                              }
                           } else if (1150 == var0) {
                              if (var3 >= 64) {
                                 throw new IllegalStateException();
                              } else {
                                 var4.ak(cy.aa[(ay -= -1086551379) * -2017760987], ag.iq, 554088678);
                                 return 1;
                              }
                           } else {
                              return 2;
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "bx.ab(" + ')');
      }
   }

   static boolean aa(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!an.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if (var10.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if (1 == var1) {
         try {
            Object var3 = by.aw(af, var2, new Object[]{(new URL(af.getCodeBase(), var0)).toString()}, -1205855937);
            return var3 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if (2 == var1) {
         try {
            af.getAppletContext().showDocument(new URL(af.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if (3 == var1) {
         try {
            by.an(af, "loggedout", (byte)-35);
         } catch (Throwable var9) {
         }

         try {
            af.getAppletContext().showDocument(new URL(af.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static boolean ay(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!an.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if (var10.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if (1 == var1) {
         try {
            Object var3 = by.aw(af, var2, new Object[]{(new URL(af.getCodeBase(), var0)).toString()}, -561761328);
            return var3 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if (2 == var1) {
         try {
            af.getAppletContext().showDocument(new URL(af.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if (3 == var1) {
         try {
            by.an(af, "loggedout", (byte)-1);
         } catch (Throwable var9) {
         }

         try {
            af.getAppletContext().showDocument(new URL(af.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static void ab(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
            }
         }

         if (an.startsWith("win") && !var2) {
            cf.an(var0, 0, -1891375398);
         } else if (an.startsWith("mac")) {
            ia.aw(var0, 1, "openjs", -692539419);
         } else {
            ia.aw(var0, 2, "openjs", -1889705114);
         }
      } else {
         ia.aw(var0, 3, "openjs", -463703802);
      }

   }

   public static void ac(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
            }
         }

         if (an.startsWith("win") && !var2) {
            cf.an(var0, 0, -1751378396);
         } else if (an.startsWith("mac")) {
            ia.aw(var0, 1, "openjs", -518713696);
         } else {
            ia.aw(var0, 2, "openjs", -1051063352);
         }
      } else {
         ia.aw(var0, 3, "openjs", -1228258961);
      }

   }

   static final void hc(int var0) {
      try {
         client.in.au(-1019860188);
         hk.an.ac();
         lh.ab((byte)-22);
         au.at(-518646489);
         ag.ag(-729068470);
         gq.ax((byte)61);
         oq.as((byte)-59);
         ha.al.ac();
         ha.at.ac();
         ha.aa.ac();
         hh.aw.ac();
         hh.ac.ac();
         hg.an.ac();
         gz.aw.ac();
         gg.qm.am((byte)-105);
         cb.qh.am((byte)19);
         qg.ay(1669272792);
         nu.au(157863063);
         di.al(-1880388281);
         gh.aq(1235100026);
         mk.at(-1979549952);
         oa.ab(-1054245173);
         sz.an.ac();
         client.wq.ac();
         client.ww.ac();
         nn.ai(175161870);
         am.av(2013158329);
         ((im)in.ab.aq).aq(-1471941846);
         ch.af.ac();
         client.wx.ab(1971799995);
         az.fd.cg(1903798827);
         md.fb.cg(1903798827);
         dk.fz.cg(1903798827);
         qc.fa.cg(1903798827);
         nn.fy.cg(1903798827);
         pj.fw.cg(1903798827);
         hr.fr.cg(1903798827);
         rr.fv.cg(1903798827);
         jd.fq.cg(1903798827);
         no.fc.cg(1903798827);
         hc.ff.cg(1903798827);
         ey.fj.cg(1903798827);
         bu.gs.cg(1903798827);
         js.af();

         for(int var1 = 0; var1 < 4; ++var1) {
            if (var0 == 1772402002) {
               throw new IllegalStateException();
            }

            client.jr[var1].af(1636677273);
         }

         client.si.ag((byte)78);
         System.gc();
         ly.au = -626822165;
         ly.ab = null;
         oq.aq = 1643562499;
         gz.al = -1823837761;
         dn.at = 0;
         ev.ay = false;
         ga.aa = 440964570;
         client.tz = -1225072817;
         client.tf = false;
         ht.af((byte)1);
         fd.hi(10, 1908973914);
      } catch (RuntimeException var2) {
         throw db.an(var2, "bx.hc(" + ')');
      }
   }

   static boolean at(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!an.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if (var10.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if (1 == var1) {
         try {
            Object var3 = by.aw(af, var2, new Object[]{(new URL(af.getCodeBase(), var0)).toString()}, -2117267696);
            return var3 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if (2 == var1) {
         try {
            af.getAppletContext().showDocument(new URL(af.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if (3 == var1) {
         try {
            by.an(af, "loggedout", (byte)-23);
         } catch (Throwable var9) {
         }

         try {
            af.getAppletContext().showDocument(new URL(af.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
