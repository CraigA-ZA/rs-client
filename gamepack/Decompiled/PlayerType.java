public class PlayerType implements Enumerated {
   static IndexedSprite dz;
   static final PlayerType aa = new PlayerType(9, 43, false, false, true);
   static final PlayerType ab = new PlayerType(5, 10, false, false, true);
   static final PlayerType ac = new PlayerType(3, 2, false, false, true);
   static final PlayerType af = new PlayerType(0, -1, true, false, true);
   static final PlayerType ag = new PlayerType(14, 48, false, false, true);
   static final PlayerType ah = new PlayerType(15, 49, false, false, true);
   static final PlayerType ai = new PlayerType(13, 47, false, false, true);
   static final PlayerType al = new PlayerType(7, 41, false, false, true);
   static final PlayerType an = new PlayerType(1, 0, true, true, true);
   static final PlayerType ao = new PlayerType(11, 45, false, false, true);
   static final PlayerType aq = new PlayerType(6, 22, false, false, true);
   static final PlayerType at = new PlayerType(8, 42, false, false, true);
   static final PlayerType au = new PlayerType(4, 3, false, false, true);
   static final PlayerType av = new PlayerType(16, 52, false, false, true);
   static final PlayerType aw = new PlayerType(2, 1, true, true, false);
   static final PlayerType ax = new PlayerType(12, 46, false, false, true);
   static final PlayerType ay = new PlayerType(10, 44, false, false, true);
   final int ar;
   public final boolean aj;
   public final boolean as;
   public final int am;

   PlayerType(int var1, int var2, boolean var3, boolean var4, boolean var5) {
      this.ar = var1 * -1325228517;
      this.am = 1532409379 * var2;
      this.as = var4;
      this.aj = var5;
   }

   public int ordinal() {
      return this.ar * -897643501;
   }

   static void an_renamed(ClientScriptEvent var0, int var1, int var2) {
      Object[] var4 = var0.af;
      ClientScript var5;
      int var26;
      if (lu.af_renamed(var0.ao * 937869311)) {
         ByteArrayPool.aj = (WorldMapEvent)var4[0];
         MapElementType var6 = nf.getMapElementType(1618357717 * ByteArrayPool.aj.af);
         var5 = fg.an_renamed(var0.ao * 937869311, var6.au * 219774827, -461862935 * var6.ae);
      } else {
         var26 = (Integer)var4[0];
         var5 = AbstractByteArrayCopier.af_renamed(var26);
      }

      if (null != var5) {
         Interpreter.at = 0;
         SecureRandomCallable.ay = 0;
         var26 = -1;
         int[] var7 = var5.aw;
         int[] var8 = var5.ac;
         int var9 = -1;
         Interpreter.ao = 0;
         Interpreter.ak = false;
         boolean var10 = false;
         int var11 = 0;
         boolean var23 = false;

         label951: {
            label952: {
               try {
                  int var14;
                  try {
                     var23 = true;
                     Interpreter.ac = new int[2144970855 * var5.ab];
                     int var12 = 0;
                     Interpreter.au = new String[-1897224143 * var5.aq];
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
                              var15 = var0.aw != null ? 1713081171 * var0.aw.bs : -1;
                           }

                           if (-2147483644 == var15) {
                              var15 = 684782445 * var0.ab;
                           }

                           if (var15 == -2147483643) {
                              var15 = null != var0.aw ? 55577617 * var0.aw.br : -1;
                           }

                           if (var15 == -2147483642) {
                              var15 = var0.aq != null ? var0.aq.bs * 1713081171 : -1;
                           }

                           if (var15 == -2147483641) {
                              var15 = null != var0.aq ? 55577617 * var0.aq.br : -1;
                           }

                           if (-2147483640 == var15) {
                              var15 = -2125751633 * var0.al;
                           }

                           if (-2147483639 == var15) {
                              var15 = var0.at * -19398649;
                           }

                           Interpreter.ac[var12++] = var15;
                        } else if (var4[var14] instanceof String) {
                           var38 = (String)var4[var14];
                           if (var38.equals("event_opbase")) {
                              var38 = var0.aa;
                           }

                           Interpreter.au[var28++] = var38;
                        }
                     }

                     Interpreter.ae = -1037192187 * var0.ay;

                     while(true) {
                        ++var11;
                        if (var11 > var1) {
                           throw new RuntimeException();
                        }

                        ++var26;
                        var9 = var7[var26];
                        if (var9 >= 100) {
                           boolean var37;
                           if (1 == var5.ac[var26]) {
                              var37 = true;
                           } else {
                              var37 = false;
                           }

                           var15 = bz.aw_renamed(var9, var5, var37);
                           switch (var15) {
                              case 0:
                                 var23 = false;
                                 break label951;
                              case 1:
                              default:
                                 break;
                              case 2:
                                 throw new IllegalStateException();
                           }
                        } else if (0 == var9) {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var8[var26];
                        } else if (var9 == 1) {
                           var14 = var8[var26];
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Varps.aw[var14];
                        } else if (2 == var9) {
                           var14 = var8[var26];
                           Varps.aw[var14] = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                           al.md_renamed(var14);
                        } else if (3 == var9) {
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5.au[var26];
                        } else if (6 == var9) {
                           var26 += var8[var26];
                        } else if (7 == var9) {
                           Interpreter.at -= 854271946;
                           if (Interpreter.al[1 + -964267539 * Interpreter.at] != Interpreter.al[-964267539 * Interpreter.at]) {
                              var26 += var8[var26];
                           }
                        } else if (var9 == 8) {
                           Interpreter.at -= 854271946;
                           if (Interpreter.al[1 + Interpreter.at * -964267539] == Interpreter.al[-964267539 * Interpreter.at]) {
                              var26 += var8[var26];
                           }
                        } else if (var9 == 9) {
                           Interpreter.at -= 854271946;
                           if (Interpreter.al[-964267539 * Interpreter.at] < Interpreter.al[Interpreter.at * -964267539 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var9 == 10) {
                           Interpreter.at -= 854271946;
                           if (Interpreter.al[-964267539 * Interpreter.at] > Interpreter.al[-964267539 * Interpreter.at + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var9 == 21) {
                           if (-1968816839 * Interpreter.ao == 0) {
                              var23 = false;
                              break;
                           }

                           ClientScriptFrame var36 = Interpreter.ax[(Interpreter.ao -= 937402633) * -1968816839];
                           var5 = var36.af;
                           var7 = var5.aw;
                           var8 = var5.ac;
                           var26 = var36.an * -1780087085;
                           Interpreter.ac = var36.aw;
                           Interpreter.au = var36.ac;
                        } else if (var9 == 25) {
                           var14 = var8[var26];
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = WorldMapSection1.af_renamed(var14);
                        } else if (27 == var9) {
                           var14 = var8[var26];
                           kn.an_renamed(var14, Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
                        } else if (var9 == 31) {
                           Interpreter.at -= 854271946;
                           if (Interpreter.al[-964267539 * Interpreter.at] <= Interpreter.al[1 + Interpreter.at * -964267539]) {
                              var26 += var8[var26];
                           }
                        } else if (32 == var9) {
                           Interpreter.at -= 854271946;
                           if (Interpreter.al[Interpreter.at * -964267539] >= Interpreter.al[1 + Interpreter.at * -964267539]) {
                              var26 += var8[var26];
                           }
                        } else if (33 == var9) {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Interpreter.ac[var8[var26]];
                        } else if (var9 == 34) {
                           Interpreter.ac[var8[var26]] = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                        } else if (var9 == 35) {
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = Interpreter.au[var8[var26]];
                        } else if (36 == var9) {
                           Interpreter.au[var8[var26]] = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                        } else if (var9 == 37) {
                           var14 = var8[var26];
                           SecureRandomCallable.ay -= var14 * -1086551379;
                           var38 = kc.af_renamed(Interpreter.aa, SecureRandomCallable.ay * -2017760987, var14);
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var38;
                        } else if (38 == var9) {
                           Interpreter.at -= 427135973;
                        } else if (39 == var9) {
                           SecureRandomCallable.ay -= -1086551379;
                        } else {
                           int var18;
                           if (40 != var9) {
                              if (var9 == 42) {
                                 Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = oy.qo.getInt(var8[var26]);
                              } else if (43 == var9) {
                                 oy.qo.setInt(var8[var26], Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
                              } else if (44 == var9) {
                                 var14 = var8[var26] >> 16;
                                 var15 = var8[var26] & '\uffff';
                                 int var29 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                                 if (var29 < 0 || var29 > 5000) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.ab[var14] = var29;
                                 byte var32 = -1;
                                 if (105 == var15) {
                                    var32 = 0;
                                 }

                                 for(var18 = 0; var18 < var29; ++var18) {
                                    Interpreter.aq[var14][var18] = var32;
                                 }
                              } else if (var9 == 45) {
                                 var14 = var8[var26];
                                 var15 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                                 if (var15 < 0 || var15 >= Interpreter.ab[var14]) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Interpreter.aq[var14][var15];
                              } else if (46 == var9) {
                                 var14 = var8[var26];
                                 Interpreter.at -= 854271946;
                                 var15 = Interpreter.al[Interpreter.at * -964267539];
                                 if (var15 < 0 || var15 >= Interpreter.ab[var14]) {
                                    throw new RuntimeException();
                                 }

                                 Interpreter.aq[var14][var15] = Interpreter.al[-964267539 * Interpreter.at + 1];
                              } else {
                                 String var30;
                                 if (var9 == 47) {
                                    var30 = oy.qo.getStringOld(var8[var26]);
                                    if (var30 == null) {
                                       var30 = Strings.at;
                                    }

                                    Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var30;
                                 } else if (var9 == 48) {
                                    oy.qo.setStringOld(var8[var26], Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987]);
                                 } else if (49 == var9) {
                                    var30 = oy.qo.getString(var8[var26]);
                                    Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var30;
                                 } else if (var9 == 50) {
                                    oy.qo.setString(var8[var26], Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987]);
                                 } else if (60 == var9) {
                                    IterableNodeHashTable var33 = var5.aa[var8[var26]];
                                    IntegerNode var41 = (IntegerNode)var33.get((long)Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
                                    if (null != var41) {
                                       var26 += var41.af;
                                    }
                                 } else {
                                    Integer var34;
                                    if (74 == var9) {
                                       var34 = fh.ah.au(var8[var26]);
                                       if (null == var34) {
                                          Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                                       } else {
                                          Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var34;
                                       }
                                    } else {
                                       if (var9 != 76) {
                                          throw new IllegalStateException();
                                       }

                                       var34 = ds.rx.af(var8[var26]);
                                       if (var34 == null) {
                                          Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                                       } else {
                                          Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var34;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var14 = var8[var26];
                              ClientScript var40 = AbstractByteArrayCopier.af_renamed(var14);
                              int[] var16 = new int[2144970855 * var40.ab];
                              String[] var17 = new String[var40.aq * -1897224143];

                              for(var18 = 0; var18 < -1203198865 * var40.al; ++var18) {
                                 var16[var18] = Interpreter.al[var18 + (-964267539 * Interpreter.at - var40.al * -1203198865)];
                              }

                              for(var18 = 0; var18 < 1178893217 * var40.at; ++var18) {
                                 var17[var18] = Interpreter.aa[var18 + (-2017760987 * SecureRandomCallable.ay - var40.at * 1178893217)];
                              }

                              Interpreter.at -= var40.al * -1927162805;
                              SecureRandomCallable.ay -= var40.at * 2141738445;
                              ClientScriptFrame var35 = new ClientScriptFrame();
                              var35.af = var5;
                              var35.an = var26 * -1031782053;
                              var35.aw = Interpreter.ac;
                              var35.ac = Interpreter.au;
                              Interpreter.ax[(Interpreter.ao += 937402633) * -1968816839 - 1] = var35;
                              var5 = var40;
                              var7 = var40.aw;
                              var8 = var40.ac;
                              var26 = -1;
                              Interpreter.ac = var16;
                              Interpreter.au = var17;
                           }
                        }
                     }
                  } catch (Exception var24) {
                     var10 = true;
                     StringBuilder var13 = new StringBuilder(30);
                     var13.append("").append(var5.hr).append(" ");

                     for(var14 = -1968816839 * Interpreter.ao - 1; var14 >= 0; --var14) {
                        var13.append("").append(Interpreter.ax[var14].af.hr).append(" ");
                     }

                     var13.append("").append(var9);
                     ob.af_renamed(var13.toString(), var24);
                     var23 = false;
                     break label952;
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

            return;
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

      }
   }
}
