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
      int var10;
      if (4100 == var0) {
         var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
         var10 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
         Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4 + var10;
         return 1;
      } else {
         String var5;
         if (4101 == var0) {
            SecureRandomCallable.ay -= 2121864538;
            var4 = Interpreter.aa[SecureRandomCallable.ay * -2017760987];
            var5 = Interpreter.aa[1 + -2017760987 * SecureRandomCallable.ay];
            Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4 + var5;
            return 1;
         } else if (var0 == 4102) {
            var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
            var10 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4 + IDKType.intToString(var10, true);
            return 1;
         } else if (var0 == 4103) {
            var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
            Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4.toLowerCase();
            return 1;
         } else {
            int var7;
            int var8;
            int var13;
            if (4104 == var0) {
               var13 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               long var16 = ((long)var13 + 11745L) * 86400000L;
               Interpreter.am.setTime(new Date(var16));
               var7 = Interpreter.am.get(5);
               var8 = Interpreter.am.get(2);
               int var9 = Interpreter.am.get(1);
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var7 + "-" + Interpreter.as[var8] + "-" + var9;
               return 1;
            } else if (4105 != var0) {
               if (4106 == var0) {
                  var13 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = Integer.toString(var13);
                  return 1;
               } else if (var0 == 4107) {
                  SecureRandomCallable.ay -= 2121864538;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = er.ah_renamed(av.af_renamed(Interpreter.aa[-2017760987 * SecureRandomCallable.ay], Interpreter.aa[SecureRandomCallable.ay * -2017760987 + 1], fj.ck));
                  return 1;
               } else {
                  int var12;
                  byte[] var15;
                  Font var17;
                  if (var0 == 4108) {
                     var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                     Interpreter.at -= 854271946;
                     var10 = Interpreter.al[Interpreter.at * -964267539];
                     var12 = Interpreter.al[1 + -964267539 * Interpreter.at];
                     var15 = ei.fg.takeFile(var12, 0);
                     var17 = new Font(var15);
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var17.lineCount(var4, var10);
                     return 1;
                  } else if (var0 == 4109) {
                     var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                     Interpreter.at -= 854271946;
                     var10 = Interpreter.al[-964267539 * Interpreter.at];
                     var12 = Interpreter.al[1 + Interpreter.at * -964267539];
                     var15 = ei.fg.takeFile(var12, 0);
                     var17 = new Font(var15);
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var17.lineWidth(var4, var10);
                     return 1;
                  } else if (var0 == 4110) {
                     SecureRandomCallable.ay -= 2121864538;
                     var4 = Interpreter.aa[SecureRandomCallable.ay * -2017760987];
                     var5 = Interpreter.aa[1 + SecureRandomCallable.ay * -2017760987];
                     if (Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1) {
                        Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4;
                     } else {
                        Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5;
                     }

                     return 1;
                  } else if (4111 == var0) {
                     var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = AbstractFont.escapeBrackets(var4);
                     return 1;
                  } else if (4112 == var0) {
                     var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                     var10 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4 + (char)var10;
                     return 1;
                  } else if (var0 == 4113) {
                     var13 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = VarcInt.ag_renamed((char)var13, (byte)4) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4114) {
                     var13 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = MiniMenuEntry.ay_renamed((char)var13) ? 1 : 0;
                     return 1;
                  } else if (4115 == var0) {
                     var13 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = fl.at_renamed((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var13 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = ff.aa_renamed((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                     if (null != var4) {
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.length();
                     } else {
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                     }

                     return 1;
                  } else if (4118 == var0) {
                     var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                     Interpreter.at -= 854271946;
                     var10 = Interpreter.al[Interpreter.at * -964267539];
                     var12 = Interpreter.al[1 + -964267539 * Interpreter.at];
                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4.substring(var10, var12);
                     return 1;
                  } else if (4119 == var0) {
                     var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                     StringBuilder var11 = new StringBuilder(var4.length());
                     boolean var14 = false;

                     for(var7 = 0; var7 < var4.length(); ++var7) {
                        var8 = var4.charAt(var7);
                        if (60 == var8) {
                           var14 = true;
                        } else if (var8 == 62) {
                           var14 = false;
                        } else if (!var14) {
                           var11.append((char)var8);
                        }
                     }

                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var11.toString();
                     return 1;
                  } else if (4120 == var0) {
                     var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                     var10 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.indexOf(var10);
                     return 1;
                  } else if (4121 == var0) {
                     SecureRandomCallable.ay -= 2121864538;
                     var4 = Interpreter.aa[-2017760987 * SecureRandomCallable.ay];
                     var5 = Interpreter.aa[1 + SecureRandomCallable.ay * -2017760987];
                     var12 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.indexOf(var5, var12);
                     return 1;
                  } else if (4122 == var0) {
                     var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     SecureRandomCallable.ay -= 1035313159;
                     var4 = Interpreter.aa[SecureRandomCallable.ay * -2017760987];
                     var5 = Interpreter.aa[SecureRandomCallable.ay * -2017760987 + 1];
                     String var6 = Interpreter.aa[2 + SecureRandomCallable.ay * -2017760987];
                     if (null == MusicPatchNode.mi.aw) {
                        Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var6;
                        return 1;
                     } else {
                        switch (-1004049459 * MusicPatchNode.mi.aw.ac) {
                           case 0:
                              Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4;
                              break;
                           case 1:
                              Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5;
                              break;
                           case 2:
                           default:
                              Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var6;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               SecureRandomCallable.ay -= 2121864538;
               var4 = Interpreter.aa[-2017760987 * SecureRandomCallable.ay];
               var5 = Interpreter.aa[1 + SecureRandomCallable.ay * -2017760987];
               if (null != MusicPatchNode.mi.aw && 0 != 1693987821 * MusicPatchNode.mi.aw.au) {
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5;
               } else {
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4;
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
