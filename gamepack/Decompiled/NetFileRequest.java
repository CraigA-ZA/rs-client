public class NetFileRequest extends DualNode {
   static Archive archive9;
   byte padding;
   int crc;
   Archive archive;

   NetFileRequest() {
   }

   static int ad_renamed(int var0, ClientScript var1, boolean var2) {
      String var12;
      if (3100 == var0) {
         var12 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
         es.an_renamed(0, "", var12);
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
         int var11;
         if (var0 == 3104) {
            var12 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
            var11 = 0;
            if (WorldMapSectionType.an_renamed(var12)) {
               var11 = PacketBitNode.ac_renamed(var12);
            }

            PacketBitNode var15 = mi.an_renamed(ClientProt.ao, Client.packetWriter.au);
            var15.bit.ba(var11);
            Client.packetWriter.aw(var15);
            return 1;
         } else {
            PacketBitNode var9;
            if (var0 == 3105) {
               var12 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               var9 = mi.an_renamed(ClientProt.cu, Client.packetWriter.au);
               var9.bit.bu(var12.length() + 1);
               var9.bit.bh(var12);
               Client.packetWriter.aw(var9);
               return 1;
            } else if (var0 == 3106) {
               var12 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               var9 = mi.an_renamed(ClientProt.cr, Client.packetWriter.au);
               var9.bit.bu(var12.length() + 1);
               var9.bit.bh(var12);
               Client.packetWriter.aw(var9);
               return 1;
            } else {
               int var4;
               String var5;
               if (3107 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                  eu.ky_renamed(var4, var5);
                  return 1;
               } else if (var0 == 3108) {
                  Interpreter.Interpreter_intStackSize -= 1281407919;
                  var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                  var11 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                  int var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
                  Component var16 = gh.an_renamed(var14);
                  ol.mm_renamed(var16, var4, var11);
                  return 1;
               } else if (var0 == 3109) {
                  Interpreter.Interpreter_intStackSize -= 854271946;
                  var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                  var11 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                  Component var13 = var2 ? SoundSystem.ag : an.ai;
                  ol.mm_renamed(var13, var4, var11);
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
                  var12 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                  boolean var10 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                  Ignored.af_renamed(var12, var10, false);
                  return 1;
               } else if (3115 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var9 = mi.an_renamed(ClientProt.cm, Client.packetWriter.au);
                  var9.bit.p2(var4);
                  Client.packetWriter.aw(var9);
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
                  Client.oz = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                  return 1;
               } else if (var0 == 3119) {
                  Client.md = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
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
                  boolean var8;
                  if (3141 == var0) {
                     var8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     aj.clientPreferences.aq(var8);
                     return 1;
                  } else if (3142 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = aj.clientPreferences.al() ? 1 : 0;
                     return 1;
                  } else if (var0 == 3143) {
                     var8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     Client.hb = var8;
                     if (!var8) {
                        aj.clientPreferences.ad("");
                     }

                     return 1;
                  } else if (var0 == 3144) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.hb ? 1 : 0;
                     return 1;
                  } else if (3145 == var0) {
                     return 1;
                  } else if (3146 == var0) {
                     var8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     aj.clientPreferences.at(!var8);
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
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1158424865 * cz.ad;
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
         SeqType var2 = Inventory.getSeqType(-1302441815 * var0.spotAnimationFrame, (byte)49);
         if (var2 != null) {
            if (!var2.ao() && null != var2.ag) {
               var0.walkSequence += -105665867;
               if (424813829 * var0.spotAnimationFrameCycle < var2.ag.length && var0.walkSequence * -767724643 > var2.frameLengths[var0.spotAnimationFrameCycle * 424813829]) {
                  var0.walkSequence = -105665867;
                  var0.spotAnimationFrameCycle += 1348853709;
                  lm.hk_renamed(var2, var0.spotAnimationFrameCycle * 424813829, 1144428983 * var0.bx, var0.bo * -411750205);
               }

               if (var0.spotAnimationFrameCycle * 424813829 >= var2.ag.length) {
                  if (1363943497 * var2.am > 0) {
                     var0.spotAnimationFrameCycle -= var2.am * -152931979;
                     if (var2.by) {
                        var0.ch += 1404488991;
                     }

                     if (424813829 * var0.spotAnimationFrameCycle < 0 || 424813829 * var0.spotAnimationFrameCycle >= var2.ag.length || var2.by && -463442209 * var0.ch >= var2.ap * 1786137655) {
                        var0.walkSequence = 0;
                        var0.spotAnimationFrameCycle = 0;
                        var0.ch = 0;
                     }
                  } else {
                     var0.walkSequence = 0;
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
                  if (var2.am * 1363943497 > 0) {
                     var0.spotAnimationFrameCycle -= -152931979 * var2.am;
                     if (var2.by) {
                        var0.ch += 1404488991;
                     }

                     if (424813829 * var0.spotAnimationFrameCycle < 0 || 424813829 * var0.spotAnimationFrameCycle >= var3 || var2.by && -463442209 * var0.ch >= 1786137655 * var2.ap) {
                        var0.spotAnimationFrameCycle = 0;
                        var0.walkSequence = 0;
                        var0.ch = 0;
                     }
                  } else {
                     var0.walkSequence = 0;
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

      IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.ch());

      int var4;
      for(tt var8 = (tt)var7.an(); var8 != null; var8 = (tt)var7.next()) {
         if (-1171575623 * var8.af != -1 && -1886224337 * Client.ep >= -1415749665 * var8.ac) {
            var4 = Inventory.getSpotType(var8.af * -1171575623).aq * 374130911;
            if (var4 == -1) {
               var8.remove();
               var0.do -= -1822461181;
            } else {
               var8.an = Math.max(971664459 * var8.an, 0) * -793313949;
               SeqType var5 = Inventory.getSeqType(var4, (byte)3);
               if (null != var5.ag && !var5.ao()) {
                  var8.aw += 1417617079;
                  if (971664459 * var8.an < var5.ag.length && var8.aw * 77733639 > var5.frameLengths[var8.an * 971664459]) {
                     var8.aw = 1417617079;
                     var8.an += -793313949;
                     lm.hk_renamed(var5, var8.an * 971664459, 1144428983 * var0.bx, var0.bo * -411750205);
                  }

                  if (971664459 * var8.an >= var5.ag.length) {
                     var8.remove();
                     var0.do -= -1822461181;
                  }
               } else if (var5.ao()) {
                  var8.an += -793313949;
                  int var6 = var5.ax();
                  if (var8.an * 971664459 < var6) {
                     KeyHandler.ha_renamed(var5, var8.an * 971664459, var0.bx * 1144428983, var0.bo * -411750205);
                  } else {
                     var8.remove();
                     var0.do -= -1822461181;
                  }
               } else {
                  var8.remove();
                  var0.do -= -1822461181;
               }
            }
         }
      }

      SeqType var9;
      if (var0.ct * -1372355773 != -1 && 1253892101 * var0.dm <= 1) {
         var9 = Inventory.getSeqType(var0.ct * -1372355773, (byte)124);
         if (var9.bb * 1069382699 == 1 && -1181739279 * var0.eo > 0 && -435598119 * var0.dt <= Client.ep * -1886224337 && -1274841313 * var0.dv < Client.ep * -1886224337) {
            var0.dm = -401806131;
            return;
         }
      }

      if (-1372355773 * var0.ct != -1 && 1253892101 * var0.dm == 0) {
         var9 = Inventory.getSeqType(-1372355773 * var0.ct, (byte)41);
         if (null != var9) {
            if (!var9.ao() && var9.ag != null) {
               var0.sequenceFrame += 672779449;
               if (var0.cp * -41215169 < var9.ag.length && var0.sequenceFrame * 1356757385 > var9.frameLengths[-41215169 * var0.cp]) {
                  var0.sequenceFrame = 672779449;
                  var0.cp += -63286081;
                  lm.hk_renamed(var9, -41215169 * var0.cp, 1144428983 * var0.bx, -411750205 * var0.bo);
               }

               if (var0.cp * -41215169 >= var9.ag.length) {
                  var0.cp -= var9.am * -823260553;
                  var0.dw += -823959909;
                  if (-92383341 * var0.dw >= 1786137655 * var9.ap) {
                     var0.ct = 1690721941;
                  } else if (var0.cp * -41215169 >= 0 && -41215169 * var0.cp < var9.ag.length) {
                     lm.hk_renamed(var9, var0.cp * -41215169, 1144428983 * var0.bx, -411750205 * var0.bo);
                  } else {
                     var0.ct = 1690721941;
                  }
               }

               var0.an = var9.ak;
            } else if (var9.ao()) {
               var0.cp += -63286081;
               var4 = var9.ax();
               if (var0.cp * -41215169 < var4) {
                  KeyHandler.ha_renamed(var9, -41215169 * var0.cp, 1144428983 * var0.bx, -411750205 * var0.bo);
               } else {
                  var0.cp -= var9.am * -823260553;
                  var0.dw += -823959909;
                  if (var0.dw * -92383341 >= 1786137655 * var9.ap) {
                     var0.ct = 1690721941;
                  } else if (-41215169 * var0.cp >= 0 && var0.cp * -41215169 < var4) {
                     KeyHandler.ha_renamed(var9, -41215169 * var0.cp, var0.bx * 1144428983, -411750205 * var0.bo);
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
         LocType var5 = fw.an_renamed(var4);
         Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var5 ? var5.name : "";
         return 1;
      } else {
         return 2;
      }
   }
}
