public class PlayerType implements Enumerated {
   static IndexedSprite dz;
   static final PlayerType aa = new PlayerType(9, 43, false, false, true);
   static final PlayerType PlayerType_hardcoreIronman = new PlayerType(5, 10, false, false, true);
   static final PlayerType PlayerType_ironman = new PlayerType(3, 2, false, false, true);
   static final PlayerType PlayerType_normal = new PlayerType(0, -1, true, false, true);
   static final PlayerType ag = new PlayerType(14, 48, false, false, true);
   static final PlayerType ah = new PlayerType(15, 49, false, false, true);
   static final PlayerType ai = new PlayerType(13, 47, false, false, true);
   static final PlayerType al = new PlayerType(7, 41, false, false, true);
   static final PlayerType PlayerType_playerModerator = new PlayerType(1, 0, true, true, true);
   static final PlayerType ao = new PlayerType(11, 45, false, false, true);
   static final PlayerType aq = new PlayerType(6, 22, false, false, true);
   static final PlayerType at = new PlayerType(8, 42, false, false, true);
   static final PlayerType PlayerType_ultimateIronman = new PlayerType(4, 3, false, false, true);
   static final PlayerType av = new PlayerType(16, 52, false, false, true);
   static final PlayerType PlayerType_jagexModerator = new PlayerType(2, 1, true, true, false);
   static final PlayerType ax = new PlayerType(12, 46, false, false, true);
   static final PlayerType ay = new PlayerType(10, 44, false, false, true);
   final int id;
   public final boolean isUser;
   public final boolean isPrivileged;
   public final int modIcon;

   PlayerType(int var1, int var2, boolean var3, boolean var4, boolean var5) {
      this.id = var1 * -1325228517;
      this.modIcon = 1532409379 * var2;
      this.isPrivileged = var4;
      this.isUser = var5;
   }

   public int ordinal() {
      return this.id * -897643501;
   }

   static void an_renamed(ClientScriptEvent var0, int var1, int var2) {
      Object[] var4 = var0.args0;
      ClientScript var5;
      int var26;
      if (lu.af_renamed(var0.type0 * 937869311)) {
         ByteArrayPool.worldMapEvent = (WorldMapEvent)var4[0];
         MapElementType var6 = nf.getMapElementType(1618357717 * ByteArrayPool.worldMapEvent.mapElement);
         var5 = fg.an_renamed(var0.type0 * 937869311, var6.au * 219774827, -461862935 * var6.category);
      } else {
         var26 = (Integer)var4[0];
         var5 = AbstractByteArrayCopier.af_renamed(var26);
      }

      if (null != var5) {
         Interpreter.Interpreter_intStackSize = 0;
         SecureRandomCallable.Interpreter_stringStackSize = 0;
         var26 = -1;
         int[] var7 = var5.opcodes;
         int[] var8 = var5.intOperands;
         int var9 = -1;
         Interpreter.Interpreter_frameDepth = 0;
         Interpreter.ak = false;
         boolean var10 = false;
         int var11 = 0;
         boolean var23 = false;

         label953: {
            label954: {
               try {
                  int var14;
                  try {
                     var23 = true;
                     Interpreter.Interpreter_intLocals = new int[2144970855 * var5.localIntCount];
                     int var12 = 0;
                     Interpreter.Interpreter_stringLocals = new String[-1897224143 * var5.localStringCount];
                     int var28 = 0;

                     int var15;
                     String var38;
                     for(var14 = 1; var14 < var4.length; ++var14) {
                        if (var4[var14] instanceof Integer) {
                           var15 = (Integer)var4[var14];
                           if (-2147483647 == var15) {
                              var15 = -1266615561 * var0.ac;
                           }

                           if (-2147483646 == var15) {
                              var15 = var0.au * 650213389;
                           }

                           if (-2147483645 == var15) {
                              var15 = var0.aw != null ? 1713081171 * var0.aw.id : -1;
                           }

                           if (-2147483644 == var15) {
                              var15 = 684782445 * var0.ab;
                           }

                           if (var15 == -2147483643) {
                              var15 = null != var0.aw ? 55577617 * var0.aw.childIndex : -1;
                           }

                           if (var15 == -2147483642) {
                              var15 = var0.aq != null ? var0.aq.id * 1713081171 : -1;
                           }

                           if (var15 == -2147483641) {
                              var15 = null != var0.aq ? 55577617 * var0.aq.childIndex : -1;
                           }

                           if (-2147483640 == var15) {
                              var15 = -2125751633 * var0.al;
                           }

                           if (-2147483639 == var15) {
                              var15 = var0.at * -19398649;
                           }

                           Interpreter.Interpreter_intLocals[var12++] = var15;
                        } else if (var4[var14] instanceof String) {
                           var38 = (String)var4[var14];
                           if (var38.equals("event_opbase")) {
                              var38 = var0.opbase;
                           }

                           Interpreter.Interpreter_stringLocals[var28++] = var38;
                        }
                     }

                     Interpreter.ae = -1037192187 * var0.ay;

                     label937:
                     while(true) {
                        ++var11;
                        if (var11 > var1) {
                           throw new RuntimeException();
                        }

                        ++var26;
                        var9 = var7[var26];
                        if (var9 >= 100) {
                           boolean var37;
                           if (1 == var5.intOperands[var26]) {
                              var37 = true;
                           } else {
                              var37 = false;
                           }

                           var15 = bz.aw_renamed(var9, var5, var37);
                           switch (var15) {
                              case 0:
                                 var23 = false;
                                 break label937;
                              case 1:
                              default:
                                 break;
                              case 2:
                                 throw new IllegalStateException();
                           }
                        } else if (0 == var9) {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var8[var26];
                        } else if (var9 == 1) {
                           var14 = var8[var26];
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Varps.Varps_main[var14];
                        } else if (2 == var9) {
                           var14 = var8[var26];
                           Varps.Varps_main[var14] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                           al.md_renamed(var14);
                        } else if (3 == var9) {
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.stringOperands[var26];
                        } else if (6 == var9) {
                           var26 += var8[var26];
                        } else if (7 == var9) {
                           Interpreter.Interpreter_intStackSize -= 854271946;
                           if (Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]) {
                              var26 += var8[var26];
                           }
                        } else if (var9 == 8) {
                           Interpreter.Interpreter_intStackSize -= 854271946;
                           if (Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539] == Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]) {
                              var26 += var8[var26];
                           }
                        } else if (var9 == 9) {
                           Interpreter.Interpreter_intStackSize -= 854271946;
                           if (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var9 == 10) {
                           Interpreter.Interpreter_intStackSize -= 854271946;
                           if (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var9 == 21) {
                           if (-1968816839 * Interpreter.Interpreter_frameDepth == 0) {
                              var23 = false;
                              break label954;
                           }

                           ClientScriptFrame var36 = Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth -= 937402633) * -1968816839];
                           var5 = var36.script;
                           var7 = var5.opcodes;
                           var8 = var5.intOperands;
                           var26 = var36.pc * -1780087085;
                           Interpreter.Interpreter_intLocals = var36.intLocals;
                           Interpreter.Interpreter_stringLocals = var36.stringLocals;
                        } else if (var9 == 25) {
                           var14 = var8[var26];
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = WorldMapSection1.getVarbit(var14);
                        } else if (27 == var9) {
                           var14 = var8[var26];
                           kn.an_renamed(var14, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                        } else if (var9 == 31) {
                           Interpreter.Interpreter_intStackSize -= 854271946;
                           if (Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]) {
                              var26 += var8[var26];
                           }
                        } else if (32 == var9) {
                           Interpreter.Interpreter_intStackSize -= 854271946;
                           if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] >= Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]) {
                              var26 += var8[var26];
                           }
                        } else if (33 == var9) {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intLocals[var8[var26]];
                        } else if (var9 == 34) {
                           Interpreter.Interpreter_intLocals[var8[var26]] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        } else if (var9 == 35) {
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringLocals[var8[var26]];
                        } else if (36 == var9) {
                           Interpreter.Interpreter_stringLocals[var8[var26]] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                        } else if (var9 == 37) {
                           var14 = var8[var26];
                           SecureRandomCallable.Interpreter_stringStackSize -= var14 * -1086551379;
                           var38 = kc.af_renamed(Interpreter.Interpreter_stringStack, SecureRandomCallable.Interpreter_stringStackSize * -2017760987, var14);
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var38;
                        } else if (38 == var9) {
                           Interpreter.Interpreter_intStackSize -= 427135973;
                        } else if (39 == var9) {
                           SecureRandomCallable.Interpreter_stringStackSize -= -1086551379;
                        } else {
                           int var18;
                           if (40 != var9) {
                              if (var9 == 42) {
                                 Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = oy.varcs.getInt(var8[var26]);
                              } else if (43 == var9) {
                                 oy.varcs.setInt(var8[var26], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                              } else if (44 == var9) {
                                 var14 = var8[var26] >> 16;
                                 var15 = var8[var26] & '\uffff';
                                 int var29 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                 if (var29 < 0 || var29 > 5000) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.Interpreter_arrayLengths[var14] = var29;
                                 byte var32 = -1;
                                 if (105 == var15) {
                                    var32 = 0;
                                 }

                                 for(var18 = 0; var18 < var29; ++var18) {
                                    Interpreter.Interpreter_arrays[var14][var18] = var32;
                                 }
                              } else if (var9 == 45) {
                                 var14 = var8[var26];
                                 var15 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                 if (var15 < 0 || var15 >= Interpreter.Interpreter_arrayLengths[var14]) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_arrays[var14][var15];
                              } else if (46 == var9) {
                                 var14 = var8[var26];
                                 Interpreter.Interpreter_intStackSize -= 854271946;
                                 var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                                 if (var15 < 0 || var15 >= Interpreter.Interpreter_arrayLengths[var14]) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.Interpreter_arrays[var14][var15] = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                              } else {
                                 String var30;
                                 if (var9 == 47) {
                                    var30 = oy.varcs.getStringOld(var8[var26]);
                                    if (var30 == null) {
                                       var30 = Strings.Strings_null;
                                    }

                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var30;
                                 } else if (var9 == 48) {
                                    oy.varcs.setStringOld(var8[var26], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987]);
                                 } else if (49 == var9) {
                                    var30 = oy.varcs.getString(var8[var26]);
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var30;
                                 } else if (var9 == 50) {
                                    oy.varcs.setString(var8[var26], Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987]);
                                 } else if (60 == var9) {
                                    IterableNodeHashTable var33 = var5.switches[var8[var26]];
                                    IntegerNode var41 = (IntegerNode)var33.get((long)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                                    if (null != var41) {
                                       var26 += var41.integer;
                                    }
                                 } else {
                                    Integer var34;
                                    if (74 == var9) {
                                       var34 = fh.ah.au(var8[var26]);
                                       if (null == var34) {
                                          Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                       } else {
                                          Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var34;
                                       }
                                    } else {
                                       if (var9 != 76) {
                                          throw new IllegalStateException();
                                       }

                                       var34 = ds.rx.af(var8[var26]);
                                       if (var34 == null) {
                                          Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                       } else {
                                          Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var34;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var14 = var8[var26];
                              ClientScript var40 = AbstractByteArrayCopier.af_renamed(var14);
                              int[] var16 = new int[2144970855 * var40.localIntCount];
                              String[] var17 = new String[var40.localStringCount * -1897224143];

                              for(var18 = 0; var18 < -1203198865 * var40.intArgumentCount; ++var18) {
                                 var16[var18] = Interpreter.Interpreter_intStack[var18 + (-964267539 * Interpreter.Interpreter_intStackSize - var40.intArgumentCount * -1203198865)];
                              }

                              for(var18 = 0; var18 < 1178893217 * var40.stringArgumentCount; ++var18) {
                                 var17[var18] = Interpreter.Interpreter_stringStack[var18 + (-2017760987 * SecureRandomCallable.Interpreter_stringStackSize - var40.stringArgumentCount * 1178893217)];
                              }

                              Interpreter.Interpreter_intStackSize -= var40.intArgumentCount * -1927162805;
                              SecureRandomCallable.Interpreter_stringStackSize -= var40.stringArgumentCount * 2141738445;
                              ClientScriptFrame var35 = new ClientScriptFrame();
                              var35.script = var5;
                              var35.pc = var26 * -1031782053;
                              var35.intLocals = Interpreter.Interpreter_intLocals;
                              var35.stringLocals = Interpreter.Interpreter_stringLocals;
                              Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth += 937402633) * -1968816839 - 1] = var35;
                              var5 = var40;
                              var7 = var40.opcodes;
                              var8 = var40.intOperands;
                              var26 = -1;
                              Interpreter.Interpreter_intLocals = var16;
                              Interpreter.Interpreter_stringLocals = var17;
                           }
                        }
                     }
                  } catch (Exception var24) {
                     var10 = true;
                     StringBuilder var13 = new StringBuilder(30);
                     var13.append("").append(var5.key).append(" ");

                     for(var14 = -1968816839 * Interpreter.Interpreter_frameDepth - 1; var14 >= 0; --var14) {
                        var13.append("").append(Interpreter.Interpreter_frames[var14].script.key).append(" ");
                     }

                     var13.append("").append(var9);
                     ob.af_renamed(var13.toString(), var24);
                     var23 = false;
                     break label953;
                  }
               } finally {
                  if (var23) {
                     while(Interpreter.ad.size() > 0) {
                        dd var20 = (dd)Interpreter.ad.remove(0);
                        Message.ks_renamed(var20.af(), var20.an(), var20.aw(), var20.ac(), "");
                     }

                     if (Interpreter.ak) {
                        Interpreter.ak = false;
                        fc.ml_renamed();
                     }

                     if (!var10 && var2 > 0 && var11 >= var2) {
                        ob.af_renamed("Warning: Script " + var5.an + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
                     }

                  }
               }

               while(Interpreter.ad.size() > 0) {
                  dd var31 = (dd)Interpreter.ad.remove(0);
                  Message.ks_renamed(var31.af(), var31.an(), var31.aw(), var31.ac(), "");
               }

               if (Interpreter.ak) {
                  Interpreter.ak = false;
                  fc.ml_renamed();
               }

               if (!var10 && var2 > 0 && var11 >= var2) {
                  ob.af_renamed("Warning: Script " + var5.an + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
               }

               return;
            }

            while(Interpreter.ad.size() > 0) {
               dd var39 = (dd)Interpreter.ad.remove(0);
               Message.ks_renamed(var39.af(), var39.an(), var39.aw(), var39.ac(), "");
            }

            if (Interpreter.ak) {
               Interpreter.ak = false;
               fc.ml_renamed();
            }

            if (!var10 && var2 > 0 && var11 >= var2) {
               ob.af_renamed("Warning: Script " + var5.an + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
            }

            return;
         }

         while(Interpreter.ad.size() > 0) {
            dd var27 = (dd)Interpreter.ad.remove(0);
            Message.ks_renamed(var27.af(), var27.an(), var27.aw(), var27.ac(), "");
         }

         if (Interpreter.ak) {
            Interpreter.ak = false;
            fc.ml_renamed();
         }

         if (!var10 && var2 > 0 && var11 >= var2) {
            ob.af_renamed("Warning: Script " + var5.an + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
         }

      }
   }
}
