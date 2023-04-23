import java.applet.Applet;

public class bx {
   public static Applet af = null;
   public static String an = "";
   static World[] worlds;
   static Scene scene;
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
         var5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         var4 = gh.an_renamed(var5);
      } else {
         var4 = var2 ? SoundSystem.ag : an.ai;
      }

      int var14;
      if (1100 == var0) {
         Interpreter.Interpreter_intStackSize -= 854271946;
         var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
         int var11 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
         if (var4.bg * 883712245 == 12) {
            mz var8 = var4.bj();
            if (var8 != null && var8.ay(var14, var11)) {
               fw.ma_renamed(var4);
            }
         } else {
            var4.scrollX = 66597705 * var14;
            if (-1469632775 * var4.scrollX > -773060713 * var4.scrollWidth - var4.width * -794961409) {
               var4.scrollX = var4.scrollWidth * 18431759 - var4.width * 460912311;
            }

            if (var4.scrollX * -1469632775 < 0) {
               var4.scrollX = 0;
            }

            var4.scrollY = var11 * 946188063;
            if (var4.scrollY * 1223232735 > -1273374131 * var4.scrollHeight - 1473950221 * var4.height) {
               var4.scrollY = var4.scrollHeight * 1941770835 - var4.height * 978547347;
            }

            if (var4.scrollY * 1223232735 < 0) {
               var4.scrollY = 0;
            }

            fw.ma_renamed(var4);
         }

         return 1;
      } else if (var0 == 1101) {
         var4.color = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -1604768377;
         fw.ma_renamed(var4);
         return 1;
      } else if (1102 == var0) {
         var4.fill = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
         fw.ma_renamed(var4);
         return 1;
      } else if (1103 == var0) {
         var4.transparency = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1833148663;
         fw.ma_renamed(var4);
         return 1;
      } else if (var0 == 1104) {
         var4.lineWid = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1040382753;
         fw.ma_renamed(var4);
         return 1;
      } else if (1105 == var0) {
         var4.spriteId2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -504605111;
         fw.ma_renamed(var4);
         return 1;
      } else if (1106 == var0) {
         var4.spriteAngle = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 877496813;
         fw.ma_renamed(var4);
         return 1;
      } else if (1107 == var0) {
         var4.spriteTiling = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
         fw.ma_renamed(var4);
         return 1;
      } else if (1108 == var0) {
         var4.modelType = -1714481443;
         var4.modelId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 509431749;
         fw.ma_renamed(var4);
         return 1;
      } else if (1109 == var0) {
         Interpreter.Interpreter_intStackSize -= -1732151458;
         var4.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * 1759898391;
         var4.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] * 1163821709;
         var4.modelAngleX = -142910041 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2];
         var4.modelAngleY = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 3] * -230241203;
         var4.modelAngleZ = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 4] * -1051718121;
         var4.modelZoom = Interpreter.Interpreter_intStack[5 + Interpreter.Interpreter_intStackSize * -964267539] * -467727501;
         fw.ma_renamed(var4);
         return 1;
      } else if (var0 == 1110) {
         var14 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         if (-1526544909 * var4.sequenceId != var14) {
            var4.sequenceId = -1195025605 * var14;
            var4.modelFrame = 0;
            var4.modelFrameCycle = 0;
            fw.ma_renamed(var4);
         }

         return 1;
      } else if (var0 == 1111) {
         var4.modelOrthog = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
         fw.ma_renamed(var4);
         return 1;
      } else if (var0 == 1112) {
         String var15 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
         if (!var15.equals(var4.text)) {
            var4.text = var15;
            fw.ma_renamed(var4);
         }

         return 1;
      } else {
         mz var9;
         if (1113 == var0) {
            var4.textLineHeight = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1858899927;
            if (883712245 * var4.bg == 12) {
               var9 = var4.bj();
               if (var9 != null) {
                  var9.ar();
               }
            }

            fw.ma_renamed(var4);
            return 1;
         } else if (var0 == 1114) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            if (12 == var4.bg * 883712245) {
               var9 = var4.bj();
               if (var9 != null) {
                  var9.ao(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]);
                  var9.ax(Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539]);
               }
            } else {
               var4.textYAlignment = 1612549297 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
               var4.paddingX = -522107433 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
               var4.textXAlignment = 2116078665 * Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
            }

            fw.ma_renamed(var4);
            return 1;
         } else if (var0 == 1115) {
            var4.textShadowed = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            fw.ma_renamed(var4);
            return 1;
         } else if (1116 == var0) {
            var4.outline = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 646392503;
            fw.ma_renamed(var4);
            return 1;
         } else if (1117 == var0) {
            var4.spriteShadow = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -140657215;
            fw.ma_renamed(var4);
            return 1;
         } else if (1118 == var0) {
            var4.do = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            fw.ma_renamed(var4);
            return 1;
         } else if (var0 == 1119) {
            var4.di = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            fw.ma_renamed(var4);
            return 1;
         } else if (1120 == var0) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var4.scrollWidth = -1469650905 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var4.scrollHeight = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1] * -1357451643;
            fw.ma_renamed(var4);
            if (var5 != -1 && 0 == var4.bg * 883712245) {
               WallDecoration.lz_renamed(hn.interfaceComponents[var5 >> 16], var4, false);
            }

            return 1;
         } else if (var0 == 1121) {
            do.kf_renamed(1713081171 * var4.id, 55577617 * var4.childIndex);
            Client.pg = var4;
            fw.ma_renamed(var4);
            return 1;
         } else if (1122 == var0) {
            var4.spriteId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1679014525;
            fw.ma_renamed(var4);
            return 1;
         } else if (1123 == var0) {
            var4.color2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 714852617;
            fw.ma_renamed(var4);
            return 1;
         } else if (var0 == 1124) {
            var4.cz = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -1159723969;
            fw.ma_renamed(var4);
            return 1;
         } else if (var0 == 1125) {
            var14 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            ta var10 = (ta)StructType.findEnumerated(GrandExchangeOffer.au_renamed(), var14);
            if (var10 != null) {
               var4.cb = var10;
               fw.ma_renamed(var4);
            }

            return 1;
         } else {
            boolean var12;
            if (var0 == 1126) {
               var12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
               var4.cj = var12;
               return 1;
            } else if (1127 == var0) {
               var12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
               var4.modelTransparency = var12;
               return 1;
            } else if (var0 == 1129) {
               var4.cp = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               fw.ma_renamed(var4);
               return 1;
            } else if (1130 == var0) {
               var4.aj(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987], ag.urlRequester, Projectile.ho_renamed());
               return 1;
            } else if (var0 == 1131) {
               Interpreter.Interpreter_intStackSize -= 854271946;
               var4.swapItems(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]);
               return 1;
            } else if (var0 == 1132) {
               var4.ae(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
               return 1;
            } else {
               FaceNormal var13;
               if (var0 == 1133) {
                  Interpreter.Interpreter_intStackSize -= 427135973;
                  var13 = var4.bn();
                  if (var13 != null) {
                     var13.af = 202848117 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  Interpreter.Interpreter_intStackSize -= 427135973;
                  var13 = var4.bn();
                  if (null != var13) {
                     var13.an = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * -1464228981;
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  SecureRandomCallable.Interpreter_stringStackSize -= -1086551379;
                  var9 = var4.bj();
                  if (null != var9) {
                     var4.text2 = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
                  }

                  return 1;
               } else if (1136 == var0) {
                  Interpreter.Interpreter_intStackSize -= 427135973;
                  var13 = var4.bn();
                  if (var13 != null) {
                     var13.aw = -1652794843 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else if (1137 == var0) {
                  Interpreter.Interpreter_intStackSize -= 427135973;
                  var9 = var4.bj();
                  if (var9 != null && var9.al(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539])) {
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else if (1138 == var0) {
                  Interpreter.Interpreter_intStackSize -= 427135973;
                  var9 = var4.bj();
                  if (var9 != null && var9.at(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize])) {
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  Interpreter.Interpreter_intStackSize -= 427135973;
                  var9 = var4.bj();
                  if (null != var9 && var9.aa(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539])) {
                     fw.ma_renamed(var4);
                  }

                  return 1;
               } else {
                  mz var7;
                  if (var0 == 1140) {
                     var12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
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
                     var12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
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
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     var9 = var4.bj();
                     if (var9 != null && var9.ap(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539])) {
                        fw.ma_renamed(var4);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     var9 = var4.bj();
                     if (null != var9 && var9.ap(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize])) {
                        fw.ma_renamed(var4);
                     }

                     return 1;
                  } else if (1144 == var0) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     var9 = var4.bj();
                     if (var9 != null) {
                        var9.ag(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]);
                        fw.ma_renamed(var4);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     var9 = var4.bj();
                     if (null != var9) {
                        var9.ai(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     var9 = var4.bj();
                     if (var9 != null) {
                        var9.av(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     var9 = var4.bj();
                     if (null != var9) {
                        var9.ah(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539]);
                        fw.ma_renamed(var4);
                     }

                     return 1;
                  } else {
                     bb var6;
                     if (1148 == var0) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        var6 = var4.bs();
                        if (null != var6) {
                           var6.af(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]);
                        }

                        return 1;
                     } else if (1149 == var0) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        var6 = var4.bs();
                        if (var6 != null) {
                           var6.an((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1]);
                        }

                        return 1;
                     } else if (1150 == var0) {
                        var4.ak(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987], ag.urlRequester);
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
      Component var4 = gh.an_renamed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
      if (var0 == 2500) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.x * 262951665;
         return 1;
      } else if (var0 == 2501) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -747355095 * var4.y;
         return 1;
      } else if (2502 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -794961409 * var4.width;
         return 1;
      } else if (var0 == 2503) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1473950221 * var4.height;
         return 1;
      } else if (2504 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.isHidden ? 1 : 0;
         return 1;
      } else if (2505 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.parentId * 913615679;
         return 1;
      } else {
         return 2;
      }
   }

   static final void hc_renamed() {
      Client.packetWriter.au();
      FloorOverlayType.an.clear();
      lh.ab_renamed();
      au.at_renamed();
      ag.ag_renamed();
      gq.ax_renamed();
      oq.as_renamed();
      SeqType.SeqType_cached.clear();
      SeqType.at.clear();
      SeqType.aa.clear();
      SpotType.SpotType_cached.clear();
      SpotType.ac.clear();
      VarBitType.VarBitType_cached.clear();
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
      ClientScript.ClientScript_cached.clear();
      Client.wx.ab();
      DevicePcmPlayerProvider.archive0.cg();
      ServerBuild.archive1.cg();
      dk.archive3.cg();
      qc.archive4.cg();
      nn.archive5.cg();
      pj.archive6.cg();
      FloorUnderlayType.fr.cg();
      rr.archive7.cg();
      WorldMapLabelSize.archive8.cg();
      NetFileRequest.archive9.cg();
      hc.archive10.cg();
      ey.archive16.cg();
      PcmPlayer.archive14.cg();
      scene.clear();

      for(int var1 = 0; var1 < 4; ++var1) {
         Client.collisionMaps[var1].clear();
      }

      Client.si.ag();
      System.gc();
      ly.au = -626822165;
      ly.ab = null;
      oq.aq = 1643562499;
      gz.al = -1823837761;
      dn.at = 0;
      ev.musicTrackBoolean = false;
      ga.aa = 440964570;
      Client.tz = -1225072817;
      Client.tf = false;
      StructType.af_renamed();
      fd.hi_renamed(10);
   }
}
