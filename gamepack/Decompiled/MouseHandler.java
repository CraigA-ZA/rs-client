import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
   public static MouseHandler ac = new MouseHandler();
   public static int aa = 0;
   public static int am = 0;
   public static int ao = 0;
   public static int ar = 0;
   public static int as = 0;
   public static int ay = 0;
   public static long aj = 0L;
   public static long ax = 0L;
   public static volatile int ab = 0;
   public static volatile int ag = 0;
   public static volatile int ah = 0;
   public static volatile int ai = 0;
   public static volatile int al = -225734783;
   public static volatile int aq = 1849679947;
   public static volatile int au = 0;
   public static volatile long at = -678214925528160149L;
   public static volatile long av = 0L;
   static gj sx;

   MouseHandler() {
   }

   public static boolean an_renamed(char var0) {
      if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
         return true;
      } else {
         if (0 != var0) {
            char[] var2 = od.af;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               char var4 = var2[var3];
               if (var4 == var0) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   final int getButton(MouseEvent var1) {
      int var3 = var1.getButton();
      if (!var1.isAltDown() && var3 != 2) {
         return !var1.isMetaDown() && 3 != var3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (ac != null) {
         au = 0;
         ag = var1.getX() * 394285213;
         ah = var1.getY() * -1202616623;
         av = Formatting.af_renamed() * 4279889128239043159L;
         ai = this.getButton(var1) * -528109255;
         if (0 != -1491866359 * ai) {
            ab = -946669631 * ai;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (null != ac) {
         au = 0;
         ab = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (ac != null) {
         au = 0;
         aq = 1849679947;
         al = -225734783;
         at = var1.getWhen() * 678214925528160149L;
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (null != ac) {
         au = 0;
         aq = var1.getX() * -1849679947;
         al = var1.getY() * 225734783;
         at = var1.getWhen() * 678214925528160149L;
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (null != ac) {
         ab = 0;
      }

   }

   static int hd_renamed() {
      if (null != Client.we && Client.wy * -397497277 < Client.we.size()) {
         int var1 = 0;

         for(int var2 = 0; var2 <= Client.wy * -397497277; ++var2) {
            var1 += ((ArchiveLoader)Client.we.get(var2)).ac * -1464399353;
         }

         return var1 * 10000 / (Client.ws * 1240602605);
      } else {
         return 10000;
      }
   }

   static int aj_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4 = gh.an_renamed(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
      if (var0 == 2600) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.cq * -1469632775;
         return 1;
      } else if (2601 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.cm * 1223232735;
         return 1;
      } else if (var0 == 2602) {
         Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var4.ds;
         return 1;
      } else if (2603 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.cf * -773060713;
         return 1;
      } else if (2604 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.cl * -1273374131;
         return 1;
      } else if (2605 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 942674363 * var4.db;
         return 1;
      } else if (var0 == 2606) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 797932055 * var4.dh;
         return 1;
      } else if (2607 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1023931993 * var4.du;
         return 1;
      } else if (2608 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -480949115 * var4.dp;
         return 1;
      } else if (2609 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1634279623 * var4.co;
         return 1;
      } else if (2610 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 122284991 * var4.cz;
         return 1;
      } else if (2611 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.cg * 1409091639;
         return 1;
      } else if (2612 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1449039161 * var4.cr;
         return 1;
      } else if (var0 == 2613) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.cb.ordinal();
         return 1;
      } else if (var0 == 2614) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.dx ? 1 : 0;
         return 1;
      } else {
         FaceNormal var5;
         if (var0 == 2617) {
            var5 = var4.bn();
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = null != var5 ? var5.af * -90398499 : 0;
         }

         if (2618 == var0) {
            var5 = var4.bn();
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5 != null ? var5.an * 216034339 : 0;
            return 1;
         } else {
            mz var8;
            if (2619 == var0) {
               var8 = var4.bj();
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = null != var8 ? var8.bh().ab() : "";
               return 1;
            } else if (2620 == var0) {
               var5 = var4.bn();
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = null != var5 ? var5.aw * 1912484269 : 0;
               return 1;
            } else if (2621 == var0) {
               var8 = var4.bj();
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var8 != null ? var8.cq() : 0;
               return 1;
            } else if (var0 == 2622) {
               var8 = var4.bj();
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var8 != null ? var8.cm() : 0;
               return 1;
            } else if (var0 == 2623) {
               var8 = var4.bj();
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var8 != null ? var8.cf() : 0;
               return 1;
            } else if (var0 == 2624) {
               var8 = var4.bj();
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var8 != null && var8.ce() ? 1 : 0;
               return 1;
            } else if (var0 != 2625) {
               if (2626 == var0) {
                  var8 = var4.bj();
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = null != var8 ? var8.bw().af() : "";
                  return 1;
               } else if (var0 == 2627) {
                  var8 = var4.bj();
                  int var6 = null != var8 ? var8.cn() : 0;
                  int var7 = null != var8 ? var8.cc() : 0;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Math.min(var6, var7);
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (var0 == 2628) {
                  var8 = var4.bj();
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var8 != null ? var8.cc() : 0;
                  return 1;
               } else if (var0 == 2629) {
                  var8 = var4.bj();
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = null != var8 ? var8.cg() : 0;
                  return 1;
               } else if (var0 == 2630) {
                  var8 = var4.bj();
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var8 != null ? var8.cl() : 0;
                  return 1;
               } else if (2631 == var0) {
                  var8 = var4.bj();
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = null != var8 ? var8.cr() : 0;
                  return 1;
               } else if (2632 == var0) {
                  var8 = var4.bj();
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = null != var8 ? var8.cy() : 0;
                  return 1;
               } else {
                  bb var9;
                  if (var0 == 2633) {
                     var9 = var4.bs();
                     Interpreter.al[Interpreter.at * -964267539 - 1] = var9 != null ? var9.aw(Interpreter.al[Interpreter.at * -964267539 - 1]) : 0;
                     return 1;
                  } else if (var0 == 2634) {
                     var9 = var4.bs();
                     Interpreter.al[Interpreter.at * -964267539 - 1] = var9 != null ? var9.ac((char)Interpreter.al[-964267539 * Interpreter.at - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = var4.bj();
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var8 != null && var8.ci() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   static void addPlayerToScene(Player var0, boolean var1) {
      if (null != var0 && var0.isVisible() && !var0.az) {
         var0.aj = false;
         if ((Client.cu && ds.ab * -2010934433 > 50 || -2010934433 * ds.ab > 200) && var1 && var0.bt * 1590591885 == -1302441815 * var0.cz) {
            var0.aj = true;
         }

         int var3 = 1144428983 * var0.bx >> 7;
         int var4 = -411750205 * var0.bo >> 7;
         if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
            long var5 = ir.aa_renamed(0, 0, 0, false, var0.ae * -1232170701);
            if (var0.ah != null && -1886224337 * Client.ep >= var0.ay * -1402262375 && -1886224337 * Client.ep < var0.ao * -935505685) {
               var0.aj = false;
               var0.aa = fq.getTileHeight(1144428983 * var0.bx, -411750205 * var0.bo, GameShell.mh * -1727408401) * -548513145;
               var0.bd = -14183397 * Client.ep;
               bx.js.ax(-1727408401 * GameShell.mh, var0.bx * 1144428983, var0.bo * -411750205, 561204023 * var0.aa, 60, var0, var0.bz * -1703696531, var5, -1793206457 * var0.av, -1107395863 * var0.ar, 54499173 * var0.am, var0.as * 806621699);
            } else {
               if (64 == (1144428983 * var0.bx & 127) && 64 == (var0.bo * -411750205 & 127)) {
                  if (Client.mt[var3][var4] == Client.mw * 2041464667) {
                     return;
                  }

                  Client.mt[var3][var4] = 2041464667 * Client.mw;
               }

               var0.aa = fq.getTileHeight(1144428983 * var0.bx, var0.bo * -411750205, -1727408401 * GameShell.mh) * -548513145;
               var0.bd = Client.ep * -14183397;
               bx.js.ao(GameShell.mh * -1727408401, var0.bx * 1144428983, var0.bo * -411750205, 561204023 * var0.aa, 60, var0, -1703696531 * var0.bz, var5, var0.an);
            }
         }
      }

   }

   static final void mr_renamed(Component var0) {
      int var2 = var0.bf * 1021339961;
      if (var2 == 324) {
         if (-1 == Client.vr * -1563612739) {
            Client.vr = 1781840109 * var0.ch;
            Client.vu = 1885844547 * var0.ct;
         }

         if (1 == Client.vh.au * 1693987821) {
            var0.ch = Client.vr * -272472859;
         } else {
            var0.ch = -1012252929 * Client.vu;
         }

      } else if (var2 == 325) {
         if (-1 == -1563612739 * Client.vr) {
            Client.vr = 1781840109 * var0.ch;
            Client.vu = var0.ct * 1885844547;
         }

         if (1 == Client.vh.au * 1693987821) {
            var0.ch = Client.vu * -1012252929;
         } else {
            var0.ch = -272472859 * Client.vr;
         }

      } else if (327 == var2) {
         var0.dh = 38330330;
         var0.dp = ((int)(Math.sin((double)(Client.ep * -1886224337) / 40.0) * 256.0) & 2047) * -230241203;
         var0.dr = 17527377;
         var0.dl = 0;
      } else if (328 == var2) {
         var0.dh = 38330330;
         var0.dp = ((int)(Math.sin((double)(Client.ep * -1886224337) / 40.0) * 256.0) & 2047) * -230241203;
         var0.dr = 17527377;
         var0.dl = 509431749;
      }
   }
}
