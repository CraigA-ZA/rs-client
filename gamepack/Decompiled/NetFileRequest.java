public class NetFileRequest extends DualNode {
   static Archive archive10;
   byte padding;
   int crc;
   Archive archive;

   NetFileRequest() {
   }

   static int ad_renamed(int var0, ClientScript var1, boolean var2) {
      String var22;
      if (3100 == var0) {
         var22 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
         UserComparator5.an_renamed(0, "", var22);
         return 1;
      } else if (var0 == 3101) {
         Interpreter.Interpreter_intStackSize -= 854271946;
         FloorDecoration.iq_renamed(MusicPatchNode.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]);
         return 1;
      } else if (var0 == 3103) {
         if (!Interpreter.az) {
            Interpreter.ak = true;
         }

         return 1;
      } else {
         int var21;
         if (var0 == 3104) {
            var22 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
            var21 = 0;
            if (WorldMapSectionType.an_renamed(var22)) {
               var21 = PacketBitNode.ac_renamed(var22);
            }

            PacketBitNode var25 = mi.an_renamed(ClientProt.ao, Client.packetWriter.au);
            var25.bit.ba(var21);
            Client.packetWriter.aw(var25);
            return 1;
         } else {
            PacketBitNode var19;
            if (var0 == 3105) {
               var22 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               var19 = mi.an_renamed(ClientProt.cu, Client.packetWriter.au);
               var19.bit.bu(var22.length() + 1);
               var19.bit.bh(var22);
               Client.packetWriter.aw(var19);
               return 1;
            } else if (var0 == 3106) {
               var22 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               var19 = mi.an_renamed(ClientProt.cr, Client.packetWriter.au);
               var19.bit.bu(var22.length() + 1);
               var19.bit.bh(var22);
               Client.packetWriter.aw(var19);
               return 1;
            } else {
               int var4;
               String var5;
               if (3107 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                  UserComparator7.ky_renamed(var4, var5);
                  return 1;
               } else if (var0 == 3108) {
                  Interpreter.Interpreter_intStackSize -= 1281407919;
                  var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                  var21 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                  int var24 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
                  Component var26 = gh.getInterfaceComponent(var24);
                  ol.clickComponent(var26, var4, var21);
                  return 1;
               } else if (var0 == 3109) {
                  Interpreter.Interpreter_intStackSize -= 854271946;
                  var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                  var21 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                  Component var23 = var2 ? SoundSystem.ag : an.ai;
                  ol.clickComponent(var23, var4, var21);
                  return 1;
               } else if (var0 == 3110) {
                  su.ev = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                  return 1;
               } else if (var0 == 3111) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = aj.clientPreferences.ab() ? 1 : 0;
                  return 1;
               } else if (var0 == 3112) {
                  aj.clientPreferences.au(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                  return 1;
               } else if (var0 == 3113) {
                  var22 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                  boolean var20 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                  Ignored.af_renamed(var22, var20, false);
                  return 1;
               } else if (3115 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var19 = mi.an_renamed(ClientProt.cm, Client.packetWriter.au);
                  var19.bit.p2(var4);
                  Client.packetWriter.aw(var19);
                  return 1;
               } else if (3116 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                  var5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                  String var6 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1];
                  if (var5.length() > 500) {
                     return 1;
                  } else if (var6.length() > 500) {
                     return 1;
                  } else {
                     PacketBitNode var7 = mi.an_renamed(ClientProt.bu, Client.packetWriter.au);
                     var7.bit.p2(1 + DynamicObject.bc_renamed(var5) + DynamicObject.bc_renamed(var6));
                     var7.bit.bh(var5);
                     var7.bit.du(var4);
                     var7.bit.bh(var6);
                     Client.packetWriter.aw(var7);
                     return 1;
                  }
               } else if (3117 == var0) {
                  Interpreter.Interpreter_intStackSize -= 427135973;
                  return 1;
               } else if (var0 == 3118) {
                  Client.showMouseOverText = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                  return 1;
               } else if (var0 == 3119) {
                  Client.renderSelf = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                  return 1;
               } else if (3120 == var0) {
                  if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                     Client.mk = (-1387790283 * Client.mk | 1) * -1433710051;
                  } else {
                     Client.mk = (Client.mk * -1387790283 & -2) * -1433710051;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                     Client.mk = -1433710051 * (Client.mk * -1387790283 | 2);
                  } else {
                     Client.mk = (Client.mk * -1387790283 & -3) * -1433710051;
                  }

                  return 1;
               } else if (3122 == var0) {
                  if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                     Client.mk = -1433710051 * (Client.mk * -1387790283 | 4);
                  } else {
                     Client.mk = (-1387790283 * Client.mk & -5) * -1433710051;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                     Client.mk = -1433710051 * (-1387790283 * Client.mk | 8);
                  } else {
                     Client.mk = (Client.mk * -1387790283 & -9) * -1433710051;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  Client.mk = 0;
                  return 1;
               } else if (var0 == 3125) {
                  Client.mx = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                  return 1;
               } else if (3126 == var0) {
                  Client.mj = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                  return 1;
               } else if (var0 == 3127) {
                  ev.lw_renamed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                  return 1;
               } else if (3128 == var0) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ai.lr_renamed() ? 1 : 0;
                  return 1;
               } else if (3129 == var0) {
                  Interpreter.Interpreter_intStackSize -= 854271946;
                  Client.la = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * -658916663;
                  Client.lp = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] * 583547559;
                  return 1;
               } else if (var0 == 3130) {
                  Interpreter.Interpreter_intStackSize -= 854271946;
                  return 1;
               } else if (3131 == var0) {
                  Interpreter.Interpreter_intStackSize -= 427135973;
                  return 1;
               } else if (var0 == 3132) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = GameShell.aj * -1687260435;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = kd.ak * 1658005443;
                  return 1;
               } else if (var0 == 3133) {
                  Interpreter.Interpreter_intStackSize -= 427135973;
                  return 1;
               } else if (3134 == var0) {
                  return 1;
               } else if (3135 == var0) {
                  Interpreter.Interpreter_intStackSize -= 854271946;
                  return 1;
               } else if (var0 == 3136) {
                  Client.pc = -1068626777;
                  Client.pp = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -757532791;
                  return 1;
               } else if (var0 == 3137) {
                  Client.pc = 719237914;
                  Client.pp = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -757532791;
                  return 1;
               } else if (3138 == var0) {
                  Client.pc = 0;
                  return 1;
               } else if (3139 == var0) {
                  Client.pc = -1787864691;
                  return 1;
               } else if (3140 == var0) {
                  Client.pc = -1068626777;
                  Client.pp = -757532791 * (var2 ? SoundSystem.ag.id * 1713081171 : an.ai.id * 1713081171);
                  return 1;
               } else {
                  boolean var18;
                  if (3141 == var0) {
                     var18 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     aj.clientPreferences.aq(var18);
                     return 1;
                  } else if (3142 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = aj.clientPreferences.al() ? 1 : 0;
                     return 1;
                  } else if (var0 == 3143) {
                     var18 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     Client.hb = var18;
                     if (!var18) {
                        aj.clientPreferences.ad("");
                     }

                     return 1;
                  } else if (var0 == 3144) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.hb ? 1 : 0;
                     return 1;
                  } else if (3145 == var0) {
                     return 1;
                  } else if (3146 == var0) {
                     var18 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     aj.clientPreferences.at(!var18);
                     return 1;
                  } else if (var0 == 3147) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = aj.clientPreferences.aa() ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (3149 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (3150 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (3152 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1158424865 * Login.ad;
                     return 1;
                  } else if (var0 == 3154) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = MouseHandler.hd_renamed();
                     return 1;
                  } else if (3155 == var0) {
                     SecureRandomCallable.Interpreter_stringStackSize -= -1086551379;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (3157 == var0) {
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     return 1;
                  } else if (var0 == 3158) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (3160 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     SecureRandomCallable.Interpreter_stringStackSize -= -1086551379;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (3168 == var0) {
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (3171 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (3172 == var0) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     return 1;
                  } else if (var0 == 3173) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     return 1;
                  } else if (var0 == 3175) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else if (3176 == var0) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (3178 == var0) {
                     SecureRandomCallable.Interpreter_stringStackSize -= -1086551379;
                     return 1;
                  } else if (3179 == var0) {
                     return 1;
                  } else if (3180 == var0) {
                     SecureRandomCallable.Interpreter_stringStackSize -= -1086551379;
                     return 1;
                  } else if (var0 == 3181) {
                     cm.mc_renamed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                     return 1;
                  } else if (3182 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = da.mh_renamed();
                     return 1;
                  } else if (3189 == var0) {
                     var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                     DevicePcmPlayerProvider.oz_renamed(var4);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }

   static final void ik_renamed(Actor var0) {
      var0.an = false;
      if (-1 != var0.spotAnimationFrame * -1302441815) {
         SeqType var2 = Inventory.getSeqType(-1302441815 * var0.spotAnimationFrame);
         if (var2 != null) {
            if (!var2.ao() && null != var2.frameIds) {
               var0.npcCycle += -105665867;
               if (424813829 * var0.spotAnimationFrameCycle < var2.frameIds.length && var0.npcCycle * -767724643 > var2.frameLengths[var0.spotAnimationFrameCycle * 424813829]) {
                  var0.npcCycle = -105665867;
                  var0.spotAnimationFrameCycle += 1348853709;
                  lm.hk_renamed(var2, var0.spotAnimationFrameCycle * 424813829, 1144428983 * var0.bx, var0.bo * -411750205);
               }

               if (var0.spotAnimationFrameCycle * 424813829 >= var2.frameIds.length) {
                  if (1363943497 * var2.righthand > 0) {
                     var0.spotAnimationFrameCycle -= var2.righthand * -152931979;
                     if (var2.by) {
                        var0.ch += 1404488991;
                     }

                     if (424813829 * var0.spotAnimationFrameCycle < 0 || 424813829 * var0.spotAnimationFrameCycle >= var2.frameIds.length || var2.by && -463442209 * var0.ch >= var2.ap * 1786137655) {
                        var0.npcCycle = 0;
                        var0.spotAnimationFrameCycle = 0;
                        var0.ch = 0;
                     }
                  } else {
                     var0.npcCycle = 0;
                     var0.spotAnimationFrameCycle = 0;
                  }

                  lm.hk_renamed(var2, 424813829 * var0.spotAnimationFrameCycle, var0.bx * 1144428983, var0.bo * -411750205);
               }
            } else if (var2.ao()) {
               var0.spotAnimationFrameCycle += 1348853709;
               int var3 = var2.ax();
               if (424813829 * var0.spotAnimationFrameCycle < var3) {
                  KeyHandler.ha_renamed(var2, var0.spotAnimationFrameCycle * 424813829, var0.bx * 1144428983, -411750205 * var0.bo);
               } else {
                  if (var2.righthand * 1363943497 > 0) {
                     var0.spotAnimationFrameCycle -= -152931979 * var2.righthand;
                     if (var2.by) {
                        var0.ch += 1404488991;
                     }

                     if (424813829 * var0.spotAnimationFrameCycle < 0 || 424813829 * var0.spotAnimationFrameCycle >= var3 || var2.by && -463442209 * var0.ch >= 1786137655 * var2.ap) {
                        var0.spotAnimationFrameCycle = 0;
                        var0.npcCycle = 0;
                        var0.ch = 0;
                     }
                  } else {
                     var0.npcCycle = 0;
                     var0.spotAnimationFrameCycle = 0;
                  }

                  KeyHandler.ha_renamed(var2, 424813829 * var0.spotAnimationFrameCycle, var0.bx * 1144428983, -411750205 * var0.bo);
               }
            } else {
               var0.spotAnimationFrame = -327373721;
            }
         } else {
            var0.spotAnimationFrame = -327373721;
         }
      }

      IterableNodeHashTableIterator var8 = new IterableNodeHashTableIterator(var0.ch());

      int var4;
      for(tt var9 = (tt)var8.an(); var9 != null; var9 = (tt)var8.next()) {
         if (-1171575623 * var9.af != -1 && -1886224337 * Client.ep >= -1415749665 * var9.ac) {
            var4 = Inventory.getSpotType(var9.af * -1171575623).sequence * 374130911;
            if (var4 == -1) {
               var9.remove();
               var0.do_renamed -= -1822461181;
            } else {
               var9.an = Math.max(971664459 * var9.an, 0) * -793313949;
               SeqType var5 = Inventory.getSeqType(var4);
               if (null != var5.frameIds && !var5.ao()) {
                  var9.aw += 1417617079;
                  if (971664459 * var9.an < var5.frameIds.length && var9.aw * 77733639 > var5.frameLengths[var9.an * 971664459]) {
                     var9.aw = 1417617079;
                     var9.an += -793313949;
                     lm.hk_renamed(var5, var9.an * 971664459, 1144428983 * var0.bx, var0.bo * -411750205);
                  }

                  if (971664459 * var9.an >= var5.frameIds.length) {
                     var9.remove();
                     var0.do_renamed -= -1822461181;
                  }
               } else if (var5.ao()) {
                  var9.an += -793313949;
                  int var6 = var5.ax();
                  if (var9.an * 971664459 < var6) {
                     KeyHandler.ha_renamed(var5, var9.an * 971664459, var0.bx * 1144428983, var0.bo * -411750205);
                  } else {
                     var9.remove();
                     var0.do_renamed -= -1822461181;
                  }
               } else {
                  var9.remove();
                  var0.do_renamed -= -1822461181;
               }
            }
         }
      }

      SeqType var10;
      if (var0.ct * -1372355773 != -1 && 1253892101 * var0.dm <= 1) {
         var10 = Inventory.getSeqType(var0.ct * -1372355773);
         if (var10.bb * 1069382699 == 1 && -1181739279 * var0.eo > 0 && -435598119 * var0.dt <= Client.ep * -1886224337 && -1274841313 * var0.dv < Client.ep * -1886224337) {
            var0.dm = -401806131;
            return;
         }
      }

      if (-1372355773 * var0.ct != -1 && 1253892101 * var0.dm == 0) {
         var10 = Inventory.getSeqType(-1372355773 * var0.ct);
         if (null != var10) {
            if (!var10.ao() && var10.frameIds != null) {
               var0.cd += 672779449;
               if (var0.cp * -41215169 < var10.frameIds.length && var0.cd * 1356757385 > var10.frameLengths[-41215169 * var0.cp]) {
                  var0.cd = 672779449;
                  var0.cp += -63286081;
                  lm.hk_renamed(var10, -41215169 * var0.cp, 1144428983 * var0.bx, -411750205 * var0.bo);
               }

               if (var0.cp * -41215169 >= var10.frameIds.length) {
                  var0.cp -= var10.righthand * -823260553;
                  var0.dw += -823959909;
                  if (-92383341 * var0.dw >= 1786137655 * var10.ap) {
                     var0.ct = 1690721941;
                  } else if (var0.cp * -41215169 >= 0 && -41215169 * var0.cp < var10.frameIds.length) {
                     lm.hk_renamed(var10, var0.cp * -41215169, 1144428983 * var0.bx, -411750205 * var0.bo);
                  } else {
                     var0.ct = 1690721941;
                  }
               }

               var0.an = var10.ak;
            } else if (var10.ao()) {
               var0.cp += -63286081;
               var4 = var10.ax();
               if (var0.cp * -41215169 < var4) {
                  KeyHandler.ha_renamed(var10, -41215169 * var0.cp, 1144428983 * var0.bx, -411750205 * var0.bo);
               } else {
                  var0.cp -= var10.righthand * -823260553;
                  var0.dw += -823959909;
                  if (var0.dw * -92383341 >= 1786137655 * var10.ap) {
                     var0.ct = 1690721941;
                  } else if (-41215169 * var0.cp >= 0 && var0.cp * -41215169 < var4) {
                     KeyHandler.ha_renamed(var10, -41215169 * var0.cp, var0.bx * 1144428983, -411750205 * var0.bo);
                  } else {
                     var0.ct = 1690721941;
                  }
               }
            } else {
               var0.ct = 1690721941;
            }
         } else {
            var0.ct = 1690721941;
         }
      }

      if (var0.dm * 1253892101 > 0) {
         var0.dm -= -401806131;
      }

   }

   static int ba_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 6809) {
         int var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         LocType var5 = fw.getLocType(var4);
         Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var5 ? var5.name : "";
         return 1;
      } else {
         return 2;
      }
   }
}
