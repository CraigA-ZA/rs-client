import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class WorldMapAreaData extends WorldMapArea {
   static int[] jj;
   HashSet ai;
   HashSet ax;
   List ag;

   WorldMapAreaData() {
   }

   void cl(Packet var1, Packet var2, int var3, boolean var4) {
      this.read(var1, var3);
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
         if (World.vt.aq * -1736413869 == 0) {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -2;
         } else if (World.vt.aq * -1736413869 == 1) {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
         } else {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = World.vt.au.size();
         }

         return 1;
      } else {
         int var4;
         if (3601 == var0) {
            var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            if (World.vt.af() && var4 >= 0 && var4 < World.vt.au.size()) {
               Friend var9 = (Friend)World.vt.au.get(var4);
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var9.previousName();
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var9.name();
            } else {
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
            }

            return 1;
         } else if (var0 == 3602) {
            var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            if (World.vt.af() && var4 >= 0 && var4 < World.vt.au.size()) {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = ((Buddy)World.vt.au.get(var4)).au * 177258591;
            } else {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
            }

            return 1;
         } else if (3603 == var0) {
            var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            if (World.vt.af() && var4 >= 0 && var4 < World.vt.au.size()) {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = ((Buddy)World.vt.au.get(var4)).aq * 1922414955;
            } else {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
            }

            return 1;
         } else {
            String var10;
            if (3604 == var0) {
               var10 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
               int var8 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               dp.ar_renamed(var10, var8);
               return 1;
            } else if (3605 == var0) {
               var10 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
               World.vt.al(var10);
               return 1;
            } else if (3606 == var0) {
               var10 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
               World.vt.removeFriend(var10);
               return 1;
            } else if (var0 == 3607) {
               var10 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
               World.vt.ax(var10);
               return 1;
            } else if (var0 == 3608) {
               var10 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
               boolean var7 = true;
               World.vt.removeIgnore(var10, var7);
               return 1;
            } else if (var0 == 3609) {
               var10 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
               var10 = ne.nh_renamed(var10);
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = World.vt.ab(new Username(var10, co.cn), false) ? 1 : 0;
               return 1;
            } else if (var0 == 3611) {
               if (es.sb != null) {
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = es.sb.ac;
               } else {
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            } else if (var0 == 3612) {
               if (es.sb != null) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = es.sb.size();
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3613) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               if (null != es.sb && var4 < es.sb.size()) {
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = es.sb.get(var4).username().af();
               } else {
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            } else if (var0 == 3614) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               if (es.sb != null && var4 < es.sb.size()) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = ((Buddy)es.sb.get(var4)).world();
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (3615 == var0) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               if (null != es.sb && var4 < es.sb.size()) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = ((Buddy)es.sb.get(var4)).aq * 1922414955;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (3616 == var0) {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = es.sb != null ? es.sb.ab : 0;
               return 1;
            } else if (3617 == var0) {
               var10 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
               sh.nm_renamed(var10);
               return 1;
            } else if (3618 == var0) {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = es.sb != null ? 1788650387 * es.sb.aq : 0;
               return 1;
            } else if (3619 == var0) {
               var10 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
               oq.nl_renamed(var10);
               return 1;
            } else if (3620 == var0) {
               jm.nr_renamed();
               return 1;
            } else if (3621 == var0) {
               if (!World.vt.af()) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = World.vt.ab.size();
               }

               return 1;
            } else if (3622 == var0) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               if (World.vt.af() && var4 >= 0 && var4 < World.vt.ab.size()) {
                  Ignored var5 = (Ignored)World.vt.ab.get(var4);
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5.previousName();
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5.name();
               } else {
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            } else if (3623 == var0) {
               var10 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
               var10 = ne.nh_renamed(var10);
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = World.vt.aq(new Username(var10, co.cn)) ? 1 : 0;
               return 1;
            } else if (var0 == 3624) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               if (null != es.sb && var4 < es.sb.size() && es.sb.get(var4).username().equals(MusicPatchNode.mi.af)) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (3625 == var0) {
               if (null != es.sb && es.sb.au != null) {
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = es.sb.au;
               } else {
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            } else if (3626 == var0) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               if (null != es.sb && var4 < es.sb.size() && ((ClanMate)es.sb.get(var4)).isIgnored()) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (3627 != var0) {
               if (var0 == 3628) {
                  World.vt.au.removeComparator();
                  return 1;
               } else {
                  boolean var6;
                  if (var0 == 3629) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.au.addComparator(new tw(var6));
                     return 1;
                  } else if (var0 == 3630) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.au.addComparator(new ty(var6));
                     return 1;
                  } else if (3631 == var0) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.au.addComparator(new eb(var6));
                     return 1;
                  } else if (var0 == 3632) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.au.addComparator(new ej(var6));
                     return 1;
                  } else if (var0 == 3633) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.au.addComparator(new es(var6));
                     return 1;
                  } else if (3634 == var0) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.au.addComparator(new eg(var6));
                     return 1;
                  } else if (var0 == 3635) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.au.addComparator(new eu(var6));
                     return 1;
                  } else if (var0 == 3636) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.au.addComparator(new ea(var6));
                     return 1;
                  } else if (var0 == 3637) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.au.addComparator(new el(var6));
                     return 1;
                  } else if (3638 == var0) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.au.addComparator(new en(var6));
                     return 1;
                  } else if (var0 == 3639) {
                     World.vt.au.sort();
                     return 1;
                  } else if (3640 == var0) {
                     World.vt.ab.removeComparator();
                     return 1;
                  } else if (var0 == 3641) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.ab.addComparator(new tw(var6));
                     return 1;
                  } else if (var0 == 3642) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.ab.addComparator(new ty(var6));
                     return 1;
                  } else if (3643 == var0) {
                     World.vt.ab.sort();
                     return 1;
                  } else if (3644 == var0) {
                     if (es.sb != null) {
                        es.sb.removeComparator();
                     }

                     return 1;
                  } else if (3645 == var0) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (null != es.sb) {
                        es.sb.addComparator(new tw(var6));
                     }

                     return 1;
                  } else if (3646 == var0) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (null != es.sb) {
                        es.sb.addComparator(new ty(var6));
                     }

                     return 1;
                  } else if (3647 == var0) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (null != es.sb) {
                        es.sb.addComparator(new eb(var6));
                     }

                     return 1;
                  } else if (3648 == var0) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (null != es.sb) {
                        es.sb.addComparator(new ej(var6));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (null != es.sb) {
                        es.sb.addComparator(new es(var6));
                     }

                     return 1;
                  } else if (3650 == var0) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (es.sb != null) {
                        es.sb.addComparator(new eg(var6));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (es.sb != null) {
                        es.sb.addComparator(new eu(var6));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (es.sb != null) {
                        es.sb.addComparator(new ea(var6));
                     }

                     return 1;
                  } else if (3653 == var0) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (es.sb != null) {
                        es.sb.addComparator(new el(var6));
                     }

                     return 1;
                  } else if (3654 == var0) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (es.sb != null) {
                        es.sb.addComparator(new en(var6));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (es.sb != null) {
                        es.sb.sort();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     World.vt.au.addComparator(new er(var6));
                     return 1;
                  } else if (3657 == var0) {
                     var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                     if (null != es.sb) {
                        es.sb.addComparator(new er(var6));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               if (es.sb != null && var4 < es.sb.size() && ((ClanMate)es.sb.get(var4)).isFriend()) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
