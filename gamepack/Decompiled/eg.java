public class eg extends AbstractUserComparator {
   static MouseRecorder mouseRecorder;
   final boolean af;

   public eg(boolean var1) {
      this.af = var1;
   }

   int af(Buddy var1, Buddy var2) {
      if (177258591 * var1.world0 != 0 && 0 != 177258591 * var2.world0) {
         return this.af ? var1.username().compareTo0(var2.username()) : var2.username().compareTo0(var1.username());
      } else {
         return this.ao(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.af((Buddy)var1, (Buddy)var2);
   }

   static boolean an(long var0) {
      return TextureProvider.al(var0) == 2;
   }

   static int bd_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 5000) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.sj * -1963411823;
         return 1;
      } else if (5001 == var0) {
         Interpreter.Interpreter_intStackSize -= 1281407919;
         Client.sj = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * 1410976369;
         FloorUnderlayType.sn = pj.af_renamed(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]);
         if (FloorUnderlayType.sn == null) {
            FloorUnderlayType.sn = tf.an;
         }

         Client.su = -2053731769 * Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize];
         PacketBitNode var17 = mi.an_renamed(ClientProt.cs, Client.packetWriter.au);
         var17.bit.bu(-1963411823 * Client.sj);
         var17.bit.bu(1843384107 * FloorUnderlayType.sn.ac);
         var17.bit.bu(-839909513 * Client.su);
         Client.packetWriter.aw(var17);
         return 1;
      } else {
         String var4;
         PacketBitNode var7;
         int var12;
         int var14;
         if (var0 == 5002) {
            var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
            Interpreter.Interpreter_intStackSize -= 854271946;
            var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var14 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            var7 = mi.an_renamed(ClientProt.cj, Client.packetWriter.au);
            var7.bit.bu(DynamicObject.bc_renamed(var4) + 2);
            var7.bit.bh(var4);
            var7.bit.bu(var12 - 1);
            var7.bit.bu(var14);
            Client.packetWriter.aw(var7);
            return 1;
         } else {
            Message var6;
            int var11;
            if (5003 == var0) {
               Interpreter.Interpreter_intStackSize -= 854271946;
               var11 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
               var12 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
               var6 = Actor.ac_renamed(var11, var12);
               if (var6 != null) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6.count * -1117255211;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6.cycle * -524761677;
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var6.sender ? var6.sender : "";
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var6.prefix ? var6.prefix : "";
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var6.text != null ? var6.text : "";
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6.isFromFriend() ? 1 : (var6.isFromIgnored() ? 2 : 0);
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else {
               Message var5;
               if (5004 == var0) {
                  var11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = MouseRecorder.au_renamed(var11);
                  if (null != var5) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -53488167 * var5.type;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.cycle * -524761677;
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var5.sender ? var5.sender : "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var5.prefix ? var5.prefix : "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.text != null ? var5.text : "";
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
                  } else {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  }

                  return 1;
               } else if (5005 == var0) {
                  if (FloorUnderlayType.sn == null) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = FloorUnderlayType.sn.ac * 1843384107;
                  }

                  return 1;
               } else {
                  PacketBitNode var15;
                  if (var0 == 5008) {
                     var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                     var12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                     var15 = mz.af_renamed(var12, var4, fj.ck, -1);
                     Client.packetWriter.aw(var15);
                     return 1;
                  } else if (var0 == 5009) {
                     SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                     var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                     String var13 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1];
                     var15 = mi.an_renamed(ClientProt.aq, Client.packetWriter.au);
                     var15.bit.p2(0);
                     int var16 = -1633313603 * var15.bit.index;
                     var15.bit.bh(var4);
                     WorldMapArea.an_renamed(var15.bit, var13);
                     var15.bit.ca(var15.bit.index * -1633313603 - var16);
                     Client.packetWriter.aw(var15);
                     return 1;
                  } else if (var0 == 5010) {
                     var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                     var14 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                     var7 = mz.af_renamed(var12, var4, fj.ck, var14);
                     Client.packetWriter.aw(var7);
                     return 1;
                  } else if (5015 != var0) {
                     if (5016 == var0) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.su * -839909513;
                        return 1;
                     } else if (var0 == 5017) {
                        var11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.ab_renamed(var11);
                        return 1;
                     } else if (var0 == 5018) {
                        var11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = FaceNormal.ay_renamed(var11);
                        return 1;
                     } else if (5019 == var0) {
                        var11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = er.aa_renamed(var11);
                        return 1;
                     } else if (var0 == 5020) {
                        var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                        DynamicObject.chatCommand(var4);
                        return 1;
                     } else if (5021 == var0) {
                        Client.ss = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987].toLowerCase().trim();
                        return 1;
                     } else if (var0 == 5022) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = Client.ss;
                        return 1;
                     } else if (var0 == 5023) {
                        var4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
                        System.out.println(var4);
                        return 1;
                     } else if (var0 == 5030) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        var11 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                        var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                        var6 = Actor.ac_renamed(var11, var12);
                        if (null != var6) {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1117255211 * var6.count;
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6.cycle * -524761677;
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var6.sender ? var6.sender : "";
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var6.prefix ? var6.prefix : "";
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var6.text ? var6.text : "";
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6.isFromFriend() ? 1 : (var6.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                        }

                        return 1;
                     } else if (5031 == var0) {
                        var11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        var5 = MouseRecorder.au_renamed(var11);
                        if (null != var5) {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.type * -53488167;
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -524761677 * var5.cycle;
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var5.sender ? var5.sender : "";
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.prefix != null ? var5.prefix : "";
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.text != null ? var5.text : "";
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (MusicPatchNode.localPlayer != null && null != MusicPatchNode.localPlayer.username) {
                        var4 = MusicPatchNode.localPlayer.username.name();
                     } else {
                        var4 = "";
                     }

                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4;
                     return 1;
                  }
               }
            }
         }
      }
   }

   static final void jd_renamed(Actor var0, int var1) {
      ot.worldToScreen(var0.bx * 1144428983, var0.bo * -411750205, var1);
   }
}
