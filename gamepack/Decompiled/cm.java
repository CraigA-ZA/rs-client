import java.util.Date;

public class cm extends ia {
   public static InvType an_renamed(int var0) {
      InvType var2 = (InvType)InvType.an.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = InvType.af.takeFile(5, var0);
         var2 = new InvType();
         if (var3 != null) {
            var2.decode(new Packet(var3));
         }

         InvType.an.put(var2, (long)var0);
         return var2;
      }
   }

   static int bz_renamed(int var0, ClientScript var1, boolean var2) {
      String var4;
      int var16;
      if (4100 == var0) {
         var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
         var16 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4 + var16;
         return 1;
      } else {
         String var5;
         if (4101 == var0) {
            SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
            var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
            var5 = Interpreter.Interpreter_stringStack[1 + -2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4 + var5;
            return 1;
         } else if (var0 == 4102) {
            var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
            var16 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4 + IDKType.intToString(var16, true);
            return 1;
         } else if (var0 == 4103) {
            var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4.toLowerCase();
            return 1;
         } else {
            int var7;
            int var8;
            int var19;
            if (4104 == var0) {
               var19 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               long var22 = ((long)var19 + 11745L) * 86400000L;
               Interpreter.Interpreter_calendar.setTime(new Date(var22));
               var7 = Interpreter.Interpreter_calendar.get(5);
               var8 = Interpreter.Interpreter_calendar.get(2);
               int var9 = Interpreter.Interpreter_calendar.get(1);
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var7 + "-" + Interpreter.as[var8] + "-" + var9;
               return 1;
            } else if (4105 != var0) {
               if (4106 == var0) {
                  var19 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = Integer.toString(var19);
                  return 1;
               } else if (var0 == 4107) {
                  SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = er.ah_renamed(av.af_renamed(Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1], fj.ck));
                  return 1;
               } else {
                  int var18;
                  byte[] var21;
                  Font var23;
                  if (var0 == 4108) {
                     var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                     var18 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                     var21 = ei.archive13.takeFile(var18, 0);
                     var23 = new Font(var21);
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var23.lineCount(var4, var16);
                     return 1;
                  } else if (var0 == 4109) {
                     var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     var16 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                     var18 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                     var21 = ei.archive13.takeFile(var18, 0);
                     var23 = new Font(var21);
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var23.lineWidth(var4, var16);
                     return 1;
                  } else if (var0 == 4110) {
                     SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                     var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                     var5 = Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                     if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4;
                     } else {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5;
                     }

                     return 1;
                  } else if (4111 == var0) {
                     var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = AbstractFont.escapeBrackets(var4);
                     return 1;
                  } else if (4112 == var0) {
                     var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                     var16 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4 + (char)var16;
                     return 1;
                  } else if (var0 == 4113) {
                     var19 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = VarcInt.ag_renamed((char)var19, (byte)4) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4114) {
                     var19 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = MiniMenuEntry.ay_renamed((char)var19) ? 1 : 0;
                     return 1;
                  } else if (4115 == var0) {
                     var19 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fl.at_renamed((char)var19) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var19 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ff.aa_renamed((char)var19) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                     if (null != var4) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.length();
                     } else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     }

                     return 1;
                  } else if (4118 == var0) {
                     var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                     var18 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4.substring(var16, var18);
                     return 1;
                  } else if (4119 == var0) {
                     var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                     StringBuilder var17 = new StringBuilder(var4.length());
                     boolean var20 = false;

                     for(var7 = 0; var7 < var4.length(); ++var7) {
                        var8 = var4.charAt(var7);
                        if (60 == var8) {
                           var20 = true;
                        } else if (var8 == 62) {
                           var20 = false;
                        } else if (!var20) {
                           var17.append((char)var8);
                        }
                     }

                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var17.toString();
                     return 1;
                  } else if (4120 == var0) {
                     var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                     var16 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.indexOf(var16);
                     return 1;
                  } else if (4121 == var0) {
                     SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                     var4 = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
                     var5 = Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                     var18 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.indexOf(var5, var18);
                     return 1;
                  } else if (4122 == var0) {
                     var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     SecureRandomCallable.Interpreter_stringStackSize -= 1035313159;
                     var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                     var5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1];
                     String var6 = Interpreter.Interpreter_stringStack[2 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                     if (null == MusicPatchNode.localPlayer.appearance) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var6;
                        return 1;
                     } else {
                        switch (-1004049459 * MusicPatchNode.localPlayer.appearance.ac) {
                           case 0:
                              Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4;
                              break;
                           case 1:
                              Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5;
                              break;
                           case 2:
                           default:
                              Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var6;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
               var4 = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
               var5 = Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
               if (null != MusicPatchNode.localPlayer.appearance && 0 != 1693987821 * MusicPatchNode.localPlayer.appearance.au) {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5;
               } else {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4;
               }

               return 1;
            }
         }
      }
   }

   static final void mc_renamed(int var0) {
      var0 = Math.max(Math.min(var0, 100), 0);
      var0 = 100 - var0;
      float var2 = 0.5F + (float)var0 / 200.0F;
      ClientScriptFrame.mg((double)var2);
   }

   cm() {
   }

   protected boolean af(int var1, int var2, int var3, CollisionMap var4) {
      return var2 == this.af * 689701217 && -407280601 * this.an == var3;
   }
}
