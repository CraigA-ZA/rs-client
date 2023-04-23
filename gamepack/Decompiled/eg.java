public class eg extends AbstractUserComparator {
   static MouseRecorder eq;
   final boolean af;

   public eg(boolean var1) {
      this.af = var1;
   }

   int af(Buddy var1, Buddy var2) {
      if (177258591 * var1.au != 0 && 0 != 177258591 * var2.au) {
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
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Client.sj * -1963411823;
         return 1;
      } else if (5001 == var0) {
         Interpreter.at -= 1281407919;
         Client.sj = Interpreter.al[Interpreter.at * -964267539] * 1410976369;
         FloorUnderlayType.sn = pj.af_renamed(Interpreter.al[Interpreter.at * -964267539 + 1]);
         if (FloorUnderlayType.sn == null) {
            FloorUnderlayType.sn = tf.an;
         }

         Client.su = -2053731769 * Interpreter.al[2 + -964267539 * Interpreter.at];
         PacketBitNode var14 = mi.an_renamed(ClientProt.cs, Client.in.au);
         var14.aw.bu(-1963411823 * Client.sj);
         var14.aw.bu(1843384107 * FloorUnderlayType.sn.ac);
         var14.aw.bu(-839909513 * Client.su);
         Client.in.aw(var14);
         return 1;
      } else {
         String var4;
         PacketBitNode var7;
         int var9;
         int var11;
         if (var0 == 5002) {
            var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
            Interpreter.at -= 854271946;
            var9 = Interpreter.al[-964267539 * Interpreter.at];
            var11 = Interpreter.al[-964267539 * Interpreter.at + 1];
            var7 = mi.an_renamed(ClientProt.cj, Client.in.au);
            var7.aw.bu(DynamicObject.bc_renamed(var4) + 2);
            var7.aw.bh(var4);
            var7.aw.bu(var9 - 1);
            var7.aw.bu(var11);
            Client.in.aw(var7);
            return 1;
         } else {
            Message var6;
            int var8;
            if (5003 == var0) {
               Interpreter.at -= 854271946;
               var8 = Interpreter.al[-964267539 * Interpreter.at];
               var9 = Interpreter.al[1 + -964267539 * Interpreter.at];
               var6 = Actor.ac_renamed(var8, var9);
               if (var6 != null) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var6.af * -1117255211;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var6.an * -524761677;
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = null != var6.ac ? var6.ac : "";
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = null != var6.al ? var6.al : "";
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var6.at != null ? var6.at : "";
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var6.isFromFriend() ? 1 : (var6.isFromIgnored() ? 2 : 0);
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else {
               Message var5;
               if (5004 == var0) {
                  var8 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  var5 = MouseRecorder.au_renamed(var8);
                  if (null != var5) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -53488167 * var5.aw;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.an * -524761677;
                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = null != var5.ac ? var5.ac : "";
                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = null != var5.al ? var5.al : "";
                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5.at != null ? var5.at : "";
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
                  } else {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                  }

                  return 1;
               } else if (5005 == var0) {
                  if (FloorUnderlayType.sn == null) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                  } else {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = FloorUnderlayType.sn.ac * 1843384107;
                  }

                  return 1;
               } else {
                  PacketBitNode var12;
                  if (var0 == 5008) {
                     var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                     var9 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                     var12 = mz.af_renamed(var9, var4, fj.ck, -1);
                     Client.in.aw(var12);
                     return 1;
                  } else if (var0 == 5009) {
                     SecureRandomCallable.ay -= 2121864538;
                     var4 = Interpreter.aa[SecureRandomCallable.ay * -2017760987];
                     String var10 = Interpreter.aa[SecureRandomCallable.ay * -2017760987 + 1];
                     var12 = mi.an_renamed(ClientProt.aq, Client.in.au);
                     var12.aw.p2(0);
                     int var13 = -1633313603 * var12.aw.at;
                     var12.aw.bh(var4);
                     WorldMapArea.an_renamed(var12.aw, var10);
                     var12.aw.ca(var12.aw.at * -1633313603 - var13);
                     Client.in.aw(var12);
                     return 1;
                  } else if (var0 == 5010) {
                     var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                     Interpreter.at -= 854271946;
                     var9 = Interpreter.al[-964267539 * Interpreter.at];
                     var11 = Interpreter.al[1 + -964267539 * Interpreter.at];
                     var7 = mz.af_renamed(var9, var4, fj.ck, var11);
                     Client.in.aw(var7);
                     return 1;
                  } else if (5015 != var0) {
                     if (5016 == var0) {
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Client.su * -839909513;
                        return 1;
                     } else if (var0 == 5017) {
                        var8 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = World.ab_renamed(var8);
                        return 1;
                     } else if (var0 == 5018) {
                        var8 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = ir.ay_renamed(var8);
                        return 1;
                     } else if (5019 == var0) {
                        var8 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = er.aa_renamed(var8);
                        return 1;
                     } else if (var0 == 5020) {
                        var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                        DynamicObject.chatCommand(var4);
                        return 1;
                     } else if (5021 == var0) {
                        Client.ss = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987].toLowerCase().trim();
                        return 1;
                     } else if (var0 == 5022) {
                        Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = Client.ss;
                        return 1;
                     } else if (var0 == 5023) {
                        var4 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
                        System.out.println(var4);
                        return 1;
                     } else if (var0 == 5030) {
                        Interpreter.at -= 854271946;
                        var8 = Interpreter.al[-964267539 * Interpreter.at];
                        var9 = Interpreter.al[Interpreter.at * -964267539 + 1];
                        var6 = Actor.ac_renamed(var8, var9);
                        if (null != var6) {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1117255211 * var6.af;
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var6.an * -524761677;
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = null != var6.ac ? var6.ac : "";
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = null != var6.al ? var6.al : "";
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = null != var6.at ? var6.at : "";
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var6.isFromFriend() ? 1 : (var6.isFromIgnored() ? 2 : 0);
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                        } else {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                        }

                        return 1;
                     } else if (5031 == var0) {
                        var8 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                        var5 = MouseRecorder.au_renamed(var8);
                        if (null != var5) {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.aw * -53488167;
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -524761677 * var5.an;
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = null != var5.ac ? var5.ac : "";
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5.al != null ? var5.al : "";
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5.at != null ? var5.at : "";
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                        } else {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                           Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (MusicPatchNode.mi != null && null != MusicPatchNode.mi.af) {
                        var4 = MusicPatchNode.mi.af.af();
                     } else {
                        var4 = "";
                     }

                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4;
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
