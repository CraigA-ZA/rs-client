public class StructType extends DualNode {
   static EvictingDualNodeHashTable an = new EvictingDualNodeHashTable(64);
   static AbstractArchive af;
   IterableNodeHashTable params;

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
      for(LocSound var1 = (LocSound)LocSound.objectSounds.last(); null != var1; var1 = (LocSound)LocSound.objectSounds.previous()) {
         if (var1.stream1 != null) {
            fe.pcmStreamMixer.removeSubStream(var1.stream1);
            var1.stream1 = null;
         }

         if (null != var1.stream2) {
            fe.pcmStreamMixer.removeSubStream(var1.stream2);
            var1.stream2 = null;
         }
      }

      LocSound.objectSounds.af();
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
         this.params = ChatChannel.readStringIntParameters(var1, this.params);
      }

   }

   public int getIntParam(int var1, int var2) {
      IterableNodeHashTable var5 = this.params;
      int var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         IntegerNode var6 = (IntegerNode)var5.get((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = var6.integer;
         }
      }

      return var4;
   }

   public String getStringParam(int var1, String var2) {
      return EnumType.an_renamed(this.params, var1, var2);
   }

   static int al_renamed(int var0, ClientScript var1, boolean var2) {
      boolean var4 = true;
      Component var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = gh.getInterfaceComponent(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
         var4 = false;
      } else {
         var5 = var2 ? SoundSystem.ag : an.ai;
      }

      int var19;
      if (1300 == var0) {
         var19 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] - 1;
         if (var19 >= 0 && var19 <= 9) {
            var5.setAction(var19, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987]);
            return 1;
         } else {
            SecureRandomCallable.Interpreter_stringStackSize -= -1086551379;
            return 1;
         }
      } else {
         int var21;
         if (var0 == 1301) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var21 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            var5.parent = SoundSystem.getComponentChild(var19, var21);
            return 1;
         } else if (1302 == var0) {
            var5.isDraggable = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            return 1;
         } else if (var0 == 1303) {
            var5.dragDeadZone = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1773001161;
            return 1;
         } else if (var0 == 1304) {
            var5.dragDeadTime = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1466803237;
            return 1;
         } else if (var0 == 1305) {
            var5.opbase = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
            return 1;
         } else if (var0 == 1306) {
            var5.targetVerb = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
            return 1;
         } else if (1307 == var0) {
            var5.actions = null;
            return 1;
         } else if (var0 == 1308) {
            var5.hh = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
            return 1;
         } else if (1309 == var0) {
            Interpreter.Interpreter_intStackSize -= 427135973;
            return 1;
         } else {
            byte[] var7;
            int var8;
            if (1350 != var0) {
               byte var20;
               if (1351 == var0) {
                  Interpreter.Interpreter_intStackSize -= 854271946;
                  var20 = 10;
                  var7 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539]};
                  byte[] var22 = new byte[]{(byte)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1]};
                  al.at_renamed(var5, var20, var7, var22);
                  return 1;
               } else if (1352 == var0) {
                  Interpreter.Interpreter_intStackSize -= 1281407919;
                  var19 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - 1;
                  var21 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                  var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
                  if (var19 >= 0 && var19 <= 9) {
                     cv.aa_renamed(var5, var19, var21, var8);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1353) {
                  var20 = 10;
                  var21 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  cv.aa_renamed(var5, var20, var21, var8);
                  return 1;
               } else if (var0 == 1354) {
                  Interpreter.Interpreter_intStackSize -= 427135973;
                  var19 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - 1;
                  if (var19 >= 0 && var19 <= 9) {
                     ne.ay_renamed(var5, var19);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (1355 == var0) {
                  var19 = 10;
                  ne.ay_renamed(var5, var19);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var6 = null;
               var7 = null;
               if (var4) {
                  Interpreter.Interpreter_intStackSize -= -23607566;

                  for(var8 = 0; var8 < 10 && Interpreter.Interpreter_intStack[var8 + -964267539 * Interpreter.Interpreter_intStackSize] >= 0; var8 += 2) {
                  }

                  if (var8 > 0) {
                     var6 = new byte[var8 / 2];
                     var7 = new byte[var8 / 2];

                     for(var8 -= 2; var8 >= 0; var8 -= 2) {
                        var6[var8 / 2] = (byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + var8];
                        var7[var8 / 2] = (byte)Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize + var8];
                     }
                  }
               } else {
                  Interpreter.Interpreter_intStackSize -= 854271946;
                  var6 = new byte[]{(byte)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]};
                  var7 = new byte[]{(byte)Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]};
               }

               var8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] - 1;
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
