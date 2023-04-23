import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class eb extends AbstractUserComparator {
   public static AbstractArchive Component_archive;
   static byte[][][] am;
   final boolean af;

   public eb(boolean var1) {
      this.af = var1;
   }

   int af(Buddy var1, Buddy var2) {
      if (var1.world0 * 177258591 != var2.world0 * 177258591) {
         return this.af ? 177258591 * var1.world0 - var2.world0 * 177258591 : var2.world0 * 177258591 - var1.world0 * 177258591;
      } else {
         return this.ao(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.af((Buddy)var1, (Buddy)var2);
   }

   public static Sprite[] an_renamed(AbstractArchive var0, int var1, int var2) {
      byte[] var5 = var0.takeFile(var1, var2);
      boolean var4;
      if (null == var5) {
         var4 = false;
      } else {
         sb.aa_renamed(var5);
         var4 = true;
      }

      if (!var4) {
         return null;
      } else {
         Sprite[] var6 = new Sprite[tx.af * 1606065339];

         for(int var7 = 0; var7 < 1606065339 * tx.af; ++var7) {
            Sprite var8 = var6[var7] = new Sprite();
            var8.width = -822007097 * tx.an;
            var8.height = tx.aw * 378525975;
            var8.yOffset = tx.ac[var7];
            var8.xOffset = ar.au[var7];
            var8.subWidth = dd.ab[var7];
            var8.subHeight = fd.aq[var7];
            int var9 = var8.subHeight * var8.subWidth;
            byte[] var10 = VarBitType.at[var7];
            var8.pixels = new int[var9];

            for(int var11 = 0; var11 < var9; ++var11) {
               var8.pixels[var11] = pc.al[var10[var11] & 255];
            }
         }

         pk.ay_renamed();
         return var6;
      }
   }

   public static void an_renamed(Packet var0, int var1) {
      ReflectionCheck var3 = new ReflectionCheck();
      var3.size = var0.g1() * 16276435;
      var3.id = var0.g4s() * 711502553;
      var3.operations = new int[-153242533 * var3.size];
      var3.creationErrors = new int[var3.size * -153242533];
      var3.fields = new Field[-153242533 * var3.size];
      var3.intReplaceValues = new int[var3.size * -153242533];
      var3.methods = new Method[var3.size * -153242533];
      var3.arguments = new byte[-153242533 * var3.size][][];

      for(int var4 = 0; var4 < var3.size * -153242533; ++var4) {
         try {
            int var5 = var0.g1();
            String var6;
            String var7;
            int var8;
            if (0 != var5 && var5 != 1 && 2 != var5) {
               if (3 == var5 || 4 == var5) {
                  var6 = var0.cw();
                  var7 = var0.cw();
                  var8 = var0.g1();
                  String[] var9 = new String[var8];

                  for(int var10 = 0; var10 < var8; ++var10) {
                     var9[var10] = var0.cw();
                  }

                  String var26 = var0.cw();
                  byte[][] var11 = new byte[var8][];
                  int var13;
                  if (var5 == 3) {
                     for(int var12 = 0; var12 < var8; ++var12) {
                        var13 = var0.g4s();
                        var11[var12] = new byte[var13];
                        var0.ct(var11[var12], 0, var13);
                     }
                  }

                  var3.operations[var4] = var5;
                  Class[] var27 = new Class[var8];

                  for(var13 = 0; var13 < var8; ++var13) {
                     var27[var13] = bz.loadClassFromDescriptor(var9[var13]);
                  }

                  Class var28 = bz.loadClassFromDescriptor(var26);
                  if (bz.loadClassFromDescriptor(var6).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var14 = bz.loadClassFromDescriptor(var6).getDeclaredMethods();
                  Method[] var15 = var14;

                  for(int var16 = 0; var16 < var15.length; ++var16) {
                     Method var17 = var15[var16];
                     if (var17.getName().equals(var7)) {
                        Class[] var18 = var17.getParameterTypes();
                        if (var18.length == var27.length) {
                           boolean var19 = true;

                           for(int var20 = 0; var20 < var27.length; ++var20) {
                              if (var27[var20] != var18[var20]) {
                                 var19 = false;
                                 break;
                              }
                           }

                           if (var19 && var28 == var17.getReturnType()) {
                              var3.methods[var4] = var17;
                           }
                        }
                     }
                  }

                  var3.arguments[var4] = var11;
               }
            } else {
               var6 = var0.cw();
               var7 = var0.cw();
               var8 = 0;
               if (1 == var5) {
                  var8 = var0.g4s();
               }

               var3.operations[var4] = var5;
               var3.intReplaceValues[var4] = var8;
               if (bz.loadClassFromDescriptor(var6).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var3.fields[var4] = bz.loadClassFromDescriptor(var6).getDeclaredField(var7);
            }
         } catch (ClassNotFoundException var21) {
            var3.creationErrors[var4] = -1;
         } catch (SecurityException var22) {
            var3.creationErrors[var4] = -2;
         } catch (NullPointerException var23) {
            var3.creationErrors[var4] = -3;
         } catch (Exception var24) {
            var3.creationErrors[var4] = -4;
         } catch (Throwable var25) {
            var3.creationErrors[var4] = -5;
         }
      }

      bt.reflectionChecks.addFirst(var3);
   }

   static int bo_renamed(int var0, ClientScript var1, boolean var2) {
      int var5;
      int var12;
      if (var0 == 4000) {
         Interpreter.Interpreter_intStackSize -= 854271946;
         var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
         var5 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5 + var12;
         return 1;
      } else if (var0 == 4001) {
         Interpreter.Interpreter_intStackSize -= 854271946;
         var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
         var5 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 - var5;
         return 1;
      } else if (4002 == var0) {
         Interpreter.Interpreter_intStackSize -= 854271946;
         var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
         var5 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 * var5;
         return 1;
      } else if (var0 == 4003) {
         Interpreter.Interpreter_intStackSize -= 854271946;
         var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
         var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 / var5;
         return 1;
      } else if (var0 == 4004) {
         var12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)(Math.random() * (double)var12);
         return 1;
      } else if (4005 == var0) {
         var12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)(Math.random() * (double)(1 + var12));
         return 1;
      } else {
         int var6;
         int var7;
         int var8;
         if (4006 == var0) {
            Interpreter.Interpreter_intStackSize -= 2135679865;
            var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
            var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 3];
            var8 = Interpreter.Interpreter_intStack[4 + Interpreter.Interpreter_intStackSize * -964267539];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 + (var8 - var6) * (var5 - var12) / (var7 - var6);
            return 1;
         } else if (4007 == var0) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 * var5 / 100 + var12;
            return 1;
         } else if (4008 == var0) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var5 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 | 1 << var5;
            return 1;
         } else if (var0 == 4009) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 & -1 - (1 << var5);
            return 1;
         } else if (var0 == 4010) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0 != (var12 & 1 << var5) ? 1 : 0;
            return 1;
         } else if (4011 == var0) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var5 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 % var5;
            return 1;
         } else if (4012 == var0) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            if (var12 == 0) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            } else {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.pow((double)var12, (double)var5);
            }

            return 1;
         } else if (var0 == 4013) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            if (0 == var12) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               return 1;
            } else {
               switch (var5) {
                  case 0:
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12;
                     break;
                  case 2:
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.sqrt((double)var12);
                     break;
                  case 3:
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.cbrt((double)var12);
                     break;
                  case 4:
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.sqrt(Math.sqrt((double)var12));
                     break;
                  default:
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)Math.pow((double)var12, 1.0 / (double)var5);
               }

               return 1;
            }
         } else if (var0 == 4014) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 & var5;
            return 1;
         } else if (var0 == 4015) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 | var5;
            return 1;
         } else if (4016 == var0) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 < var5 ? var12 : var5;
            return 1;
         } else if (4017 == var0) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 > var5 ? var12 : var5;
            return 1;
         } else if (4018 == var0) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            long var13 = (long)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            long var14 = (long)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            long var15 = (long)Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)(var15 * var13 / var14);
            return 1;
         } else if (var0 == 4025) {
            var12 = am.aw_renamed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12;
            return 1;
         } else if (var0 == 4026) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var5 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 ^ 1 << var5;
            return 1;
         } else if (var0 == 4027) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            var6 = Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fl.au_renamed(var12, var5, var6);
            return 1;
         } else if (4028 == var0) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            var6 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Canvas.ac_renamed(var12, var5, var6);
            return 1;
         } else if (var0 == 4029) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            var6 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
            var7 = 31 - var6;
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 << var7 >>> var5 + var7;
            return 1;
         } else if (4030 == var0) {
            Interpreter.Interpreter_intStackSize -= 1708543892;
            var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            var6 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
            var7 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 3];
            var12 = Canvas.ac_renamed(var12, var6, var7);
            var8 = fn.an_renamed(var7 - var6 + 1);
            if (var5 > var8) {
               var5 = var8;
            }

            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var12 | var5 << var6;
            return 1;
         } else if (4032 == var0) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = dj.aw_renamed(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4033) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = TriBool.ac_renamed(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4034) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            var6 = ea.an_renamed(var12, var5);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6;
            return 1;
         } else if (var0 == 4035) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1]);
            return 1;
         } else if (4036 == var0) {
            String var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
            var5 = -1;
            if (WorldMapSectionType.an_renamed(var4)) {
               var5 = PacketBitNode.ac_renamed(var4);
            }

            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5;
            return 1;
         } else {
            return 2;
         }
      }
   }

   static final int jx_renamed() {
      if (aj.clientPreferences.ab()) {
         return -1727408401 * GameShell.plane;
      } else {
         int var1 = 3;
         if (WorldMapSectionType.cameraPitch * 1897923909 < 310) {
            int var2;
            int var3;
            if (986256295 * Client.lv == 1) {
               var2 = -1958669353 * bz.lg >> 7;
               var3 = -365969735 * fw.lf >> 7;
            } else {
               var2 = 1144428983 * MusicPatchNode.localPlayer.bx >> 7;
               var3 = MusicPatchNode.localPlayer.bo * -411750205 >> 7;
            }

            int var4 = -2100544359 * bt.cameraX >> 7;
            int var5 = ly.cameraZ * -91399205 >> 7;
            if (var4 < 0 || var5 < 0 || var4 >= 104 || var5 >= 104) {
               return -1727408401 * GameShell.plane;
            }

            if (var2 < 0 || var3 < 0 || var2 >= 104 || var3 >= 104) {
               return -1727408401 * GameShell.plane;
            }

            if (0 != (Tiles.Tiles_renderFlags[GameShell.plane * -1727408401][var4][var5] & 4)) {
               var1 = -1727408401 * GameShell.plane;
            }

            int var6;
            if (var2 > var4) {
               var6 = var2 - var4;
            } else {
               var6 = var4 - var2;
            }

            int var7;
            if (var3 > var5) {
               var7 = var3 - var5;
            } else {
               var7 = var5 - var3;
            }

            int var8;
            int var9;
            if (var6 > var7) {
               var8 = 65536 * var7 / var6;
               var9 = 32768;

               while(var2 != var4) {
                  if (var4 < var2) {
                     ++var4;
                  } else if (var4 > var2) {
                     --var4;
                  }

                  if (0 != (Tiles.Tiles_renderFlags[GameShell.plane * -1727408401][var4][var5] & 4)) {
                     var1 = GameShell.plane * -1727408401;
                  }

                  var9 += var8;
                  if (var9 >= 65536) {
                     var9 -= 65536;
                     if (var5 < var3) {
                        ++var5;
                     } else if (var5 > var3) {
                        --var5;
                     }

                     if (0 != (Tiles.Tiles_renderFlags[GameShell.plane * -1727408401][var4][var5] & 4)) {
                        var1 = GameShell.plane * -1727408401;
                     }
                  }
               }
            } else if (var7 > 0) {
               var8 = var6 * 65536 / var7;
               var9 = 32768;

               while(var5 != var3) {
                  if (var5 < var3) {
                     ++var5;
                  } else if (var5 > var3) {
                     --var5;
                  }

                  if (0 != (Tiles.Tiles_renderFlags[-1727408401 * GameShell.plane][var4][var5] & 4)) {
                     var1 = -1727408401 * GameShell.plane;
                  }

                  var9 += var8;
                  if (var9 >= 65536) {
                     var9 -= 65536;
                     if (var4 < var2) {
                        ++var4;
                     } else if (var4 > var2) {
                        --var4;
                     }

                     if (0 != (Tiles.Tiles_renderFlags[GameShell.plane * -1727408401][var4][var5] & 4)) {
                        var1 = GameShell.plane * -1727408401;
                     }
                  }
               }
            }
         }

         if (MusicPatchNode.localPlayer.bx * 1144428983 >= 0 && MusicPatchNode.localPlayer.bo * -411750205 >= 0 && 1144428983 * MusicPatchNode.localPlayer.bx < 13312 && -411750205 * MusicPatchNode.localPlayer.bo < 13312) {
            if ((Tiles.Tiles_renderFlags[GameShell.plane * -1727408401][1144428983 * MusicPatchNode.localPlayer.bx >> 7][-411750205 * MusicPatchNode.localPlayer.bo >> 7] & 4) != 0) {
               var1 = -1727408401 * GameShell.plane;
            }

            return var1;
         } else {
            return -1727408401 * GameShell.plane;
         }
      }
   }
}
