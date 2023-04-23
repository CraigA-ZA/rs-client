public class StructType extends DualNode {
   static EvictingDualNodeHashTable an = new EvictingDualNodeHashTable(64);
   static AbstractArchive af;
   IterableNodeHashTable aw;

   public static int an_renamed(int var0) {
      return var0 >> 17 & 7;
   }

   StructType() {
   }

   public static Enumerated findEnumerated(Enumerated[] var0, int var1) {
      Enumerated[] var3 = var0;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Enumerated var5 = var3[var4];
         if (var1 == var5.ordinal()) {
            return var5;
         }
      }

      return null;
   }

   static void af_renamed() {
      for(cr var1 = (cr)cr.af.last(); null != var1; var1 = (cr)cr.af.previous()) {
         if (var1.at != null) {
            fe.td.removeSubStream(var1.at);
            var1.at = null;
         }

         if (null != var1.ai) {
            fe.td.removeSubStream(var1.ai);
            var1.ai = null;
         }
      }

      cr.af.af();
   }

   void postDecode() {
   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (var3 == 0) {
            return;
         }

         this.decode0(var1, var3);
      }
   }

   void decode0(Packet var1, int var2) {
      if (var2 == 249) {
         this.aw = ChatChannel.readStringIntParameters(var1, this.aw);
      }

   }

   public int getIntParam(int var1, int var2) {
      IterableNodeHashTable var5 = this.aw;
      int var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         IntegerNode var6 = (IntegerNode)var5.get((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = var6.af;
         }
      }

      return var4;
   }

   public String getStringParam(int var1, String var2) {
      return EnumType.an_renamed(this.aw, var1, var2);
   }

   static int al_renamed(int var0, ClientScript var1, boolean var2) {
      boolean var4 = true;
      Component var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = gh.an_renamed(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
         var4 = false;
      } else {
         var5 = var2 ? SoundSystem.ag : an.ai;
      }

      int var9;
      if (1300 == var0) {
         var9 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] - 1;
         if (var9 >= 0 && var9 <= 9) {
            var5.setAction(var9, Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987]);
            return 1;
         } else {
            SecureRandomCallable.ay -= -1086551379;
            return 1;
         }
      } else {
         int var11;
         if (var0 == 1301) {
            Interpreter.at -= 854271946;
            var9 = Interpreter.al[Interpreter.at * -964267539];
            var11 = Interpreter.al[1 + Interpreter.at * -964267539];
            var5.ey = SoundSystem.getComponentChild(var9, var11);
            return 1;
         } else if (1302 == var0) {
            var5.ee = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
            return 1;
         } else if (var0 == 1303) {
            var5.ec = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * 1773001161;
            return 1;
         } else if (var0 == 1304) {
            var5.ei = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * 1466803237;
            return 1;
         } else if (var0 == 1305) {
            var5.eh = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
            return 1;
         } else if (var0 == 1306) {
            var5.fe = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
            return 1;
         } else if (1307 == var0) {
            var5.ek = null;
            return 1;
         } else if (var0 == 1308) {
            var5.hh = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
            return 1;
         } else if (1309 == var0) {
            Interpreter.at -= 427135973;
            return 1;
         } else {
            byte[] var7;
            int var8;
            if (1350 != var0) {
               byte var10;
               if (1351 == var0) {
                  Interpreter.at -= 854271946;
                  var10 = 10;
                  var7 = new byte[]{(byte)Interpreter.al[Interpreter.at * -964267539]};
                  byte[] var12 = new byte[]{(byte)Interpreter.al[-964267539 * Interpreter.at + 1]};
                  al.at_renamed(var5, var10, var7, var12);
                  return 1;
               } else if (1352 == var0) {
                  Interpreter.at -= 1281407919;
                  var9 = Interpreter.al[-964267539 * Interpreter.at] - 1;
                  var11 = Interpreter.al[-964267539 * Interpreter.at + 1];
                  var8 = Interpreter.al[Interpreter.at * -964267539 + 2];
                  if (var9 >= 0 && var9 <= 9) {
                     cv.aa_renamed(var5, var9, var11, var8);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1353) {
                  var10 = 10;
                  var11 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  var8 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  cv.aa_renamed(var5, var10, var11, var8);
                  return 1;
               } else if (var0 == 1354) {
                  Interpreter.at -= 427135973;
                  var9 = Interpreter.al[-964267539 * Interpreter.at] - 1;
                  if (var9 >= 0 && var9 <= 9) {
                     ne.ay_renamed(var5, var9);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (1355 == var0) {
                  var9 = 10;
                  ne.ay_renamed(var5, var9);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var6 = null;
               var7 = null;
               if (var4) {
                  Interpreter.at -= -23607566;

                  for(var8 = 0; var8 < 10 && Interpreter.al[var8 + -964267539 * Interpreter.at] >= 0; var8 += 2) {
                  }

                  if (var8 > 0) {
                     var6 = new byte[var8 / 2];
                     var7 = new byte[var8 / 2];

                     for(var8 -= 2; var8 >= 0; var8 -= 2) {
                        var6[var8 / 2] = (byte)Interpreter.al[Interpreter.at * -964267539 + var8];
                        var7[var8 / 2] = (byte)Interpreter.al[1 + -964267539 * Interpreter.at + var8];
                     }
                  }
               } else {
                  Interpreter.at -= 854271946;
                  var6 = new byte[]{(byte)Interpreter.al[-964267539 * Interpreter.at]};
                  var7 = new byte[]{(byte)Interpreter.al[1 + -964267539 * Interpreter.at]};
               }

               var8 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] - 1;
               if (var8 >= 0 && var8 <= 9) {
                  al.at_renamed(var5, var8, var6, var7);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }
}
