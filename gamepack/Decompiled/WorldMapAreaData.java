import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class WorldMapAreaData extends WorldMapArea {
   List ag;
   HashSet ax;
   HashSet ai;
   static int[] jj;

   void cl(Packet var1, Packet var2, int var3, boolean var4) {
      this.af(var1, var3);
      int var6 = var2.cl();
      this.ax = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         jm var8 = new jm();

         try {
            var8.af(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.ax.add(var8);
      }

      var7 = var2.cl();
      this.ai = new HashSet(var7);

      for(int var13 = 0; var13 < var7; ++var13) {
         jh var9 = new jh();

         try {
            var9.af(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.ai.add(var9);
      }

      this.cg(var2, var4);
   }

   WorldMapAreaData() {
   }

   void cg(Packet var1, boolean var2) {
      this.ag = new LinkedList();
      int var4 = var1.cl();

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var1.gSmart2or4();
         Coord var7 = new Coord(var1.g4s());
         boolean var8 = var1.g1() == 1;
         if (var2 || !var8) {
            this.ag.add(new WorldMapIcon1((Coord)null, var7, var6, (WorldMapLabel)null));
         }
      }

   }

   static int bi_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 3600) {
         if (World.friendSystem.aq * -1736413869 == 0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2;
         } else if (World.friendSystem.aq * -1736413869 == 1) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
         } else {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.friendsList.bm();
         }

         return 1;
      } else {
         int var4;
         if (3601 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.af() && var4 >= 0 && var4 < World.friendSystem.friendsList.bm()) {
               Friend var9 = (Friend)World.friendSystem.friendsList.bq(var4);
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var9.bk();
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var9.bx();
            } else {
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
            }

            return 1;
         } else if (var0 == 3602) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.af() && var4 >= 0 && var4 < World.friendSystem.friendsList.bm()) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)World.friendSystem.friendsList.bq(var4)).world0 * 177258591;
            } else {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }

            return 1;
         } else if (3603 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (World.friendSystem.af() && var4 >= 0 && var4 < World.friendSystem.friendsList.bm()) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)World.friendSystem.friendsList.bq(var4)).rank * 1922414955;
            } else {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }

            return 1;
         } else {
            String var10;
            if (3604 == var0) {
               var10 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               int var8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               dp.ar_renamed(var10, var8);
               return 1;
            } else if (3605 == var0) {
               var10 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               World.friendSystem.al(var10);
               return 1;
            } else if (3606 == var0) {
               var10 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               World.friendSystem.removeFriend(var10);
               return 1;
            } else if (var0 == 3607) {
               var10 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               World.friendSystem.ax(var10);
               return 1;
            } else if (var0 == 3608) {
               var10 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               boolean var7 = true;
               World.friendSystem.removeIgnore(var10, var7);
               return 1;
            } else if (var0 == 3609) {
               var10 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               var10 = ne.nh_renamed(var10);
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.ab(new Username(var10, co.loginType), false) ? 1 : 0;
               return 1;
            } else if (var0 == 3611) {
               if (es.clanChat != null) {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = es.clanChat.owner;
               } else {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            } else if (var0 == 3612) {
               if (es.clanChat != null) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = es.clanChat.bm();
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3613) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               if (null != es.clanChat && var4 < es.clanChat.bm()) {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = es.clanChat.bq(var4).username().af();
               } else {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            } else if (var0 == 3614) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               if (es.clanChat != null && var4 < es.clanChat.bm()) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)es.clanChat.bq(var4)).world();
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (3615 == var0) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               if (null != es.clanChat && var4 < es.clanChat.bm()) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)es.clanChat.bq(var4)).rank * 1922414955;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (3616 == var0) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = es.clanChat != null ? es.clanChat.minKick : 0;
               return 1;
            } else if (3617 == var0) {
               var10 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               sh.nm_renamed(var10);
               return 1;
            } else if (3618 == var0) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = es.clanChat != null ? 1788650387 * es.clanChat.rank : 0;
               return 1;
            } else if (3619 == var0) {
               var10 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               oq.nl_renamed(var10);
               return 1;
            } else if (3620 == var0) {
               jm.nr_renamed();
               return 1;
            } else if (3621 == var0) {
               if (!World.friendSystem.af()) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.ignoreList.bm();
               }

               return 1;
            } else if (3622 == var0) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               if (World.friendSystem.af() && var4 >= 0 && var4 < World.friendSystem.ignoreList.bm()) {
                  Ignored var5 = (Ignored)World.friendSystem.ignoreList.bq(var4);
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.bk();
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.bx();
               } else {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            } else if (3623 == var0) {
               var10 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               var10 = ne.nh_renamed(var10);
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.aq(new Username(var10, co.loginType)) ? 1 : 0;
               return 1;
            } else if (var0 == 3624) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               if (null != es.clanChat && var4 < es.clanChat.bm() && es.clanChat.bq(var4).username().equals(MusicPatchNode.localPlayer.username)) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (3625 == var0) {
               if (null != es.clanChat && es.clanChat.name != null) {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = es.clanChat.name;
               } else {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            } else if (3626 == var0) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               if (null != es.clanChat && var4 < es.clanChat.bm() && ((ClanMate)es.clanChat.bq(var4)).isIgnored()) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (3627 != var0) {
               if (var0 == 3628) {
                  World.friendSystem.friendsList.ce();
                  return 1;
               } else {
                  boolean var6;
                  if (var0 == 3629) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.friendsList.ci(new tw(var6));
                     return 1;
                  } else if (var0 == 3630) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.friendsList.ci(new ty(var6));
                     return 1;
                  } else if (3631 == var0) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.friendsList.ci(new eb(var6));
                     return 1;
                  } else if (var0 == 3632) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.friendsList.ci(new ej(var6));
                     return 1;
                  } else if (var0 == 3633) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.friendsList.ci(new es(var6));
                     return 1;
                  } else if (3634 == var0) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.friendsList.ci(new eg(var6));
                     return 1;
                  } else if (var0 == 3635) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.friendsList.ci(new eu(var6));
                     return 1;
                  } else if (var0 == 3636) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.friendsList.ci(new ea(var6));
                     return 1;
                  } else if (var0 == 3637) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.friendsList.ci(new el(var6));
                     return 1;
                  } else if (3638 == var0) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.friendsList.ci(new en(var6));
                     return 1;
                  } else if (var0 == 3639) {
                     World.friendSystem.friendsList.ba();
                     return 1;
                  } else if (3640 == var0) {
                     World.friendSystem.ignoreList.ce();
                     return 1;
                  } else if (var0 == 3641) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.ignoreList.ci(new tw(var6));
                     return 1;
                  } else if (var0 == 3642) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.ignoreList.ci(new ty(var6));
                     return 1;
                  } else if (3643 == var0) {
                     World.friendSystem.ignoreList.ba();
                     return 1;
                  } else if (3644 == var0) {
                     if (es.clanChat != null) {
                        es.clanChat.ce();
                     }

                     return 1;
                  } else if (3645 == var0) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     if (null != es.clanChat) {
                        es.clanChat.ci(new tw(var6));
                     }

                     return 1;
                  } else if (3646 == var0) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     if (null != es.clanChat) {
                        es.clanChat.ci(new ty(var6));
                     }

                     return 1;
                  } else if (3647 == var0) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     if (null != es.clanChat) {
                        es.clanChat.ci(new eb(var6));
                     }

                     return 1;
                  } else if (3648 == var0) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     if (null != es.clanChat) {
                        es.clanChat.ci(new ej(var6));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     if (null != es.clanChat) {
                        es.clanChat.ci(new es(var6));
                     }

                     return 1;
                  } else if (3650 == var0) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     if (es.clanChat != null) {
                        es.clanChat.ci(new eg(var6));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     if (es.clanChat != null) {
                        es.clanChat.ci(new eu(var6));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     if (es.clanChat != null) {
                        es.clanChat.ci(new ea(var6));
                     }

                     return 1;
                  } else if (3653 == var0) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     if (es.clanChat != null) {
                        es.clanChat.ci(new el(var6));
                     }

                     return 1;
                  } else if (3654 == var0) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     if (es.clanChat != null) {
                        es.clanChat.ci(new en(var6));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (es.clanChat != null) {
                        es.clanChat.ba();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     World.friendSystem.friendsList.ci(new er(var6));
                     return 1;
                  } else if (3657 == var0) {
                     var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                     if (null != es.clanChat) {
                        es.clanChat.ci(new er(var6));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               if (es.clanChat != null && var4 < es.clanChat.bm() && ((ClanMate)es.clanChat.bq(var4)).isFriend()) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
