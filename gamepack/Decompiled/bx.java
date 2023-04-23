import java.applet.Applet;

public class bx {
   public static Applet af = null;
   public static String an = "";
   static World[] au;
   static Scene js;
   static int[] ai;
   static IndexedSprite[] kg;

   bx() throws Throwable {
      throw new Error();
   }

   public static String ac_renamed(String var0) {
      return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
   }

   static int ab_renamed(int var0, ClientScript var1, boolean var2) {
      int var5 = -1;
      Component var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
         var4 = gh.an_renamed(var5);
      } else {
         var4 = var2 ? SoundSystem.ag : an.ai;
      }

      int var14;
      if (1100 == var0) {
         Interpreter.at -= 854271946;
         var14 = Interpreter.al[Interpreter.at * -964267539];
         int var11 = Interpreter.al[-964267539 * Interpreter.at + 1];
         if (var4.bg * 883712245 == 12) {
            mz var8 = var4.bj();
            if (var8 != null && var8.ay(var14, var11)) {
               fw.ma_renamed(var4);
            }
         } else {
            var4.cq = 66597705 * var14;
            if (-1469632775 * var4.cq > -773060713 * var4.cf - var4.cs * -794961409) {
               var4.cq = var4.cf * 18431759 - var4.cs * 460912311;
            }

            if (var4.cq * -1469632775 < 0) {
               var4.cq = 0;
            }

            var4.cm = var11 * 946188063;
            if (var4.cm * 1223232735 > -1273374131 * var4.cl - 1473950221 * var4.cc) {
               var4.cm = var4.cl * 1941770835 - var4.cc * 978547347;
            }

            if (var4.cm * 1223232735 < 0) {
               var4.cm = 0;
            }

            fw.ma_renamed(var4);
         }

         return 1;
      } else if (var0 == 1101) {
         var4.cg = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * -1604768377;
         fw.ma_renamed(var4);
         return 1;
      } else if (1102 == var0) {
         var4.cv = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
         fw.ma_renamed(var4);
         return 1;
      } else if (1103 == var0) {
         var4.co = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * 1833148663;
         fw.ma_renamed(var4);
         return 1;
      } else if (var0 == 1104) {
         var4.cw = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * 1040382753;
         fw.ma_renamed(var4);
         return 1;
      } else if (1105 == var0) {
         var4.ch = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * -504605111;
         fw.ma_renamed(var4);
         return 1;
      } else if (1106 == var0) {
         var4.cd = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * 877496813;
         fw.ma_renamed(var4);
         return 1;
      } else if (1107 == var0) {
         var4.dm = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
         fw.ma_renamed(var4);
         return 1;
      } else if (1108 == var0) {
         var4.dr = -1714481443;
         var4.dl = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * 509431749;
         fw.ma_renamed(var4);
         return 1;
      } else if (1109 == var0) {
         Interpreter.at -= -1732151458;
         var4.dg = Interpreter.al[Interpreter.at * -964267539] * 1759898391;
         var4.de = Interpreter.al[Interpreter.at * -964267539 + 1] * 1163821709;
         var4.dh = -142910041 * Interpreter.al[-964267539 * Interpreter.at + 2];
         var4.dp = Interpreter.al[-964267539 * Interpreter.at + 3] * -230241203;
         var4.du = Interpreter.al[-964267539 * Interpreter.at + 4] * -1051718121;
         var4.db = Interpreter.al[5 + Interpreter.at * -964267539] * -467727501;
         fw.ma_renamed(var4);
         return 1;
      } else if (var0 == 1110) {
         var14 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
         if (-1526544909 * var4.dv != var14) {
            var4.dv = -1195025605 * var14;
            var4.gx = 0;
            var4.gl = 0;
            fw.ma_renamed(var4);
         }

         return 1;
      } else if (var0 == 1111) {
         var4.dj = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
         fw.ma_renamed(var4);
         return 1;
      } else if (var0 == 1112) {
         String var15 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
         if (!var15.equals(var4.ds)) {
            var4.ds = var15;
            fw.ma_renamed(var4);
         }

         return 1;
      } else {
         mz var9;
         if (1113 == var0) {
            var4.dy = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * 1858899927;
            if (883712245 * var4.bg == 12) {
               var9 = var4.bj();
               if (var9 != null) {
                  var9.ar();
               }
            }

            fw.ma_renamed(var4);
            return 1;
         } else if (var0 == 1114) {
            Interpreter.at -= 1281407919;
            if (12 == var4.bg * 883712245) {
               var9 = var4.bj();
               if (var9 != null) {
                  var9.ao(Interpreter.al[-964267539 * Interpreter.at], Interpreter.al[Interpreter.at * -964267539 + 1]);
                  var9.ax(Interpreter.al[2 + Interpreter.at * -964267539]);
               }
            } else {
               var4.eo = 1612549297 * Interpreter.al[Interpreter.at * -964267539];
               var4.eq = -522107433 * Interpreter.al[Interpreter.at * -964267539 + 1];
               var4.ep = 2116078665 * Interpreter.al[2 + Interpreter.at * -964267539];
            }

            fw.ma_renamed(var4);
            return 1;
         } else if (var0 == 1115) {
            var4.et = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
            fw.ma_renamed(var4);
            return 1;
         } else if (1116 == var0) {
            var4.dw = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * 646392503;
            fw.ma_renamed(var4);
            return 1;
         } else if (1117 == var0) {
            var4.dc = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * -140657215;
            fw.ma_renamed(var4);
            return 1;
         } else if (1118 == var0) {
            var4.do = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
            fw.ma_renamed(var4);
            return 1;
         } else if (var0 == 1119) {
            var4.di = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
            fw.ma_renamed(var4);
            return 1;
         } else if (1120 == var0) {
            Interpreter.at -= 854271946;
            var4.cf = -1469650905 * Interpreter.al[-964267539 * Interpreter.at];
            var4.cl = Interpreter.al[-964267539 * Interpreter.at + 1] * -1357451643;
            fw.ma_renamed(var4);
            if (var5 != -1 && 0 == var4.bg * 883712245) {
               WallDecoration.lz_renamed(hn.ap[var5 >> 16], var4, false);
            }

            return 1;
         } else if (var0 == 1121) {
            do.kf_renamed(1713081171 * var4.bs, 55577617 * var4.br);
            Client.pg = var4;
            fw.ma_renamed(var4);
            return 1;
         } else if (1122 == var0) {
            var4.ct = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * 1679014525;
            fw.ma_renamed(var4);
            return 1;
         } else if (1123 == var0) {
            var4.cr = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * 714852617;
            fw.ma_renamed(var4);
            return 1;
         } else if (var0 == 1124) {
            var4.cz = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * -1159723969;
            fw.ma_renamed(var4);
            return 1;
         } else if (var0 == 1125) {
            var14 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            ta var10 = (ta)StructType.findEnumerated(GrandExchangeOffer.au_renamed(), var14);
            if (var10 != null) {
               var4.cb = var10;
               fw.ma_renamed(var4);
            }

            return 1;
         } else {
            boolean var12;
            if (var0 == 1126) {
               var12 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
               var4.cj = var12;
               return 1;
            } else if (1127 == var0) {
               var12 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
               var4.dx = var12;
               return 1;
            } else if (var0 == 1129) {
               var4.cp = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
               fw.ma_renamed(var4);
               return 1;
            } else if (1130 == var0) {
               var4.aj(Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987], ag.iq, Projectile.ho_renamed());
               return 1;
            } else if (var0 == 1131) {
               Interpreter.at -= 854271946;
               var4.swapItems(Interpreter.al[Interpreter.at * -964267539], Interpreter.al[Interpreter.at * -964267539 + 1]);
               return 1;
            } else if (var0 == 1132) {
               var4.ae(Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987], Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
               return 1;
            } else {
               FaceNormal var13;
               if (var0 == 1133) {
                  Interpreter.at -= 427135973;
                  var13 = var4.bn();
                  if (var13 != null) {
                     var13.af = 202848117 * Interpreter.al[-964267539 * Interpreter.at];
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  Interpreter.at -= 427135973;
                  var13 = var4.bn();
                  if (null != var13) {
                     var13.an = Interpreter.al[Interpreter.at * -964267539] * -1464228981;
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  SecureRandomCallable.ay -= -1086551379;
                  var9 = var4.bj();
                  if (null != var9) {
                     var4.da = Interpreter.aa[-2017760987 * SecureRandomCallable.ay];
                  }

                  return 1;
               } else if (1136 == var0) {
                  Interpreter.at -= 427135973;
                  var13 = var4.bn();
                  if (var13 != null) {
                     var13.aw = -1652794843 * Interpreter.al[-964267539 * Interpreter.at];
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else if (1137 == var0) {
                  Interpreter.at -= 427135973;
                  var9 = var4.bj();
                  if (var9 != null && var9.al(Interpreter.al[Interpreter.at * -964267539])) {
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else if (1138 == var0) {
                  Interpreter.at -= 427135973;
                  var9 = var4.bj();
                  if (var9 != null && var9.at(Interpreter.al[-964267539 * Interpreter.at])) {
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  Interpreter.at -= 427135973;
                  var9 = var4.bj();
                  if (null != var9 && var9.aa(Interpreter.al[Interpreter.at * -964267539])) {
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else {
                  mz var7;
                  if (var0 == 1140) {
                     var12 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     Client.si.ag();
                     var7 = var4.bj();
                     if (null != var7 && var7.an(var12)) {
                        if (var12) {
                           Client.si.ax(var4);
                        }

                        fw.ma_renamed(var4);
                     }

                     return 1;
                  } else if (1141 == var0) {
                     var12 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (!var12 && Client.si.ai() == var4) {
                        Client.si.ag();
                        fw.ma_renamed(var4);
                     }

                     var7 = var4.bj();
                     if (var7 != null) {
                        var7.aw(var12);
                     }

                     return 1;
                  } else if (1142 == var0) {
                     Interpreter.at -= 854271946;
                     var9 = var4.bj();
                     if (var9 != null && var9.ap(Interpreter.al[Interpreter.at * -964267539], Interpreter.al[1 + Interpreter.at * -964267539])) {
                        fw.ma_renamed(var4);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     Interpreter.at -= 427135973;
                     var9 = var4.bj();
                     if (null != var9 && var9.ap(Interpreter.al[Interpreter.at * -964267539], Interpreter.al[-964267539 * Interpreter.at])) {
                        fw.ma_renamed(var4);
                     }

                     return 1;
                  } else if (1144 == var0) {
                     Interpreter.at -= 427135973;
                     var9 = var4.bj();
                     if (var9 != null) {
                        var9.ag(Interpreter.al[-964267539 * Interpreter.at]);
                        fw.ma_renamed(var4);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     Interpreter.at -= 427135973;
                     var9 = var4.bj();
                     if (null != var9) {
                        var9.ai(Interpreter.al[Interpreter.at * -964267539]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     Interpreter.at -= 427135973;
                     var9 = var4.bj();
                     if (var9 != null) {
                        var9.av(Interpreter.al[Interpreter.at * -964267539]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     Interpreter.at -= 427135973;
                     var9 = var4.bj();
                     if (null != var9) {
                        var9.ah(Interpreter.al[Interpreter.at * -964267539]);
                        fw.ma_renamed(var4);
                     }

                     return 1;
                  } else {
                     bb var6;
                     if (1148 == var0) {
                        Interpreter.at -= 854271946;
                        var6 = var4.bs();
                        if (null != var6) {
                           var6.af(Interpreter.al[-964267539 * Interpreter.at], Interpreter.al[Interpreter.at * -964267539 + 1]);
                        }

                        return 1;
                     } else if (1149 == var0) {
                        Interpreter.at -= 854271946;
                        var6 = var4.bs();
                        if (var6 != null) {
                           var6.an((char)Interpreter.al[Interpreter.at * -964267539], Interpreter.al[-964267539 * Interpreter.at + 1]);
                        }

                        return 1;
                     } else if (1150 == var0) {
                        var4.ak(Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987], ag.iq);
                        return 1;
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      }
   }

   static int as_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4 = gh.an_renamed(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
      if (var0 == 2500) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.ce * 262951665;
         return 1;
      } else if (var0 == 2501) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -747355095 * var4.ci;
         return 1;
      } else if (2502 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -794961409 * var4.cs;
         return 1;
      } else if (var0 == 2503) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1473950221 * var4.cc;
         return 1;
      } else if (2504 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.ck ? 1 : 0;
         return 1;
      } else if (2505 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.cu * 913615679;
         return 1;
      } else {
         return 2;
      }
   }

   static final void hc_renamed() {
      Client.in.au();
      FloorOverlayType.an.clear();
      lh.ab_renamed();
      au.at_renamed();
      ag.ag_renamed();
      gq.ax_renamed();
      oq.as_renamed();
      SeqType.al.clear();
      SeqType.at.clear();
      SeqType.aa.clear();
      SpotType.aw.clear();
      SpotType.ac.clear();
      VarBitType.an.clear();
      gz.aw.clear();
      gg.qm.am();
      MiniMenuEntry.qh.am();
      qg.ay_renamed();
      GrandExchangeEvent.au_renamed();
      InterfaceParent.al_renamed();
      gh.aq_renamed();
      Strings.at_renamed();
      oa.ab_renamed();
      sz.an.clear();
      Client.wq.clear();
      Client.ww.clear();
      nn.ai_renamed();
      am.av_renamed();
      ((TextureProvider)in.ab.aq).clear();
      ClientScript.af.clear();
      Client.wx.ab();
      DevicePcmPlayerProvider.fd.cg();
      ServerBuild.fb.cg();
      dk.fz.cg();
      qc.fa.cg();
      nn.fy.cg();
      pj.fw.cg();
      FloorUnderlayType.fr.cg();
      rr.fv.cg();
      WorldMapLabelSize.fq.cg();
      NetFileRequest.fc.cg();
      hc.ff.cg();
      ey.fj.cg();
      PcmPlayer.gs.cg();
      js.clear();

      for(int var1 = 0; var1 < 4; ++var1) {
         Client.jr[var1].clear();
      }

      Client.si.ag();
      System.gc();
      ly.au = -626822165;
      ly.ab = null;
      oq.aq = 1643562499;
      gz.al = -1823837761;
      dn.at = 0;
      ev.ay = false;
      ga.aa = 440964570;
      Client.tz = -1225072817;
      Client.tf = false;
      StructType.af_renamed();
      fd.hi_renamed(10);
   }
}
