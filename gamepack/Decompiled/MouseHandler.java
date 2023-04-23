import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
   public static MouseHandler MouseHandler_instance = new MouseHandler();
   public static int MouseHandler_currentButton = 0;
   public static int MouseHandler_lastPressedX = 0;
   public static int ao = 0;
   public static int MouseHandler_lastButton = 0;
   public static int MouseHandler_lastPressedY = 0;
   public static int ay = 0;
   public static long MouseHandler_lastPressedTimeMillis = 0L;
   public static long ax = 0L;
   public static volatile int MouseHandler_currentButton0 = 0;
   public static volatile int MouseHandler_lastPressedX0 = 0;
   public static volatile int MouseHandler_lastPressedY0 = 0;
   public static volatile int MouseHandler_lastButton0 = 0;
   public static volatile int MouseHandler_y0 = -225734783;
   public static volatile int MouseHandler_x0 = 1849679947;
   public static volatile int MouseHandler_idleCycles = 0;
   public static volatile long at = -678214925528160149L;
   public static volatile long MouseHandler_lastPressedTimeMillis0 = 0L;
   static gj sx;

   MouseHandler() {
   }

   public static boolean an_renamed(char var0) {
      if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
         return true;
      } else {
         if (0 != var0) {
            char[] var2 = od.cp1252AsciiExtension;

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
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_lastPressedX0 = var1.getX() * 394285213;
         MouseHandler_lastPressedY0 = var1.getY() * -1202616623;
         MouseHandler_lastPressedTimeMillis0 = Formatting.af_renamed() * 4279889128239043159L;
         MouseHandler_lastButton0 = this.getButton(var1) * -528109255;
         if (0 != -1491866359 * MouseHandler_lastButton0) {
            MouseHandler_currentButton0 = -946669631 * MouseHandler_lastButton0;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_idleCycles = 0;
         MouseHandler_currentButton0 = 0;
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
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_x0 = 1849679947;
         MouseHandler_y0 = -225734783;
         at = var1.getWhen() * 678214925528160149L;
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_idleCycles = 0;
         MouseHandler_x0 = var1.getX() * -1849679947;
         MouseHandler_y0 = var1.getY() * 225734783;
         at = var1.getWhen() * 678214925528160149L;
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_currentButton0 = 0;
      }

   }

   static int hd_renamed() {
      if (null != Client.archiveLoaders && Client.wy * -397497277 < Client.archiveLoaders.size()) {
         int var1 = 0;

         for(int var2 = 0; var2 <= Client.wy * -397497277; ++var2) {
            var1 += ((ArchiveLoader)Client.archiveLoaders.get(var2)).ac * -1464399353;
         }

         return var1 * 10000 / (Client.ws * 1240602605);
      } else {
         return 10000;
      }
   }

   static int aj_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4 = gh.getInterfaceComponent(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
      if (var0 == 2600) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.scrollX * -1469632775;
         return 1;
      } else if (2601 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.scrollY * 1223232735;
         return 1;
      } else if (var0 == 2602) {
         Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4.text;
         return 1;
      } else if (2603 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.scrollWidth * -773060713;
         return 1;
      } else if (2604 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.scrollHeight * -1273374131;
         return 1;
      } else if (2605 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 942674363 * var4.modelZoom;
         return 1;
      } else if (var0 == 2606) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 797932055 * var4.modelAngleX;
         return 1;
      } else if (2607 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1023931993 * var4.modelAngleZ;
         return 1;
      } else if (2608 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -480949115 * var4.modelAngleY;
         return 1;
      } else if (2609 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1634279623 * var4.transparency;
         return 1;
      } else if (2610 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 122284991 * var4.cz;
         return 1;
      } else if (2611 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.color * 1409091639;
         return 1;
      } else if (2612 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1449039161 * var4.color2;
         return 1;
      } else if (var0 == 2613) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.cb.ordinal();
         return 1;
      } else if (var0 == 2614) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.modelTransparency ? 1 : 0;
         return 1;
      } else {
         FaceNormal var5;
         if (var0 == 2617) {
            var5 = var4.bn();
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var5 ? var5.af * -90398499 : 0;
         }

         if (2618 == var0) {
            var5 = var4.bn();
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5 != null ? var5.an * 216034339 : 0;
            return 1;
         } else {
            mz var15;
            if (2619 == var0) {
               var15 = var4.bj();
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var15 ? var15.bh().ab() : "";
               return 1;
            } else if (2620 == var0) {
               var5 = var4.bn();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var5 ? var5.aw * 1912484269 : 0;
               return 1;
            } else if (2621 == var0) {
               var15 = var4.bj();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var15 != null ? var15.cq() : 0;
               return 1;
            } else if (var0 == 2622) {
               var15 = var4.bj();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var15 != null ? var15.cm() : 0;
               return 1;
            } else if (var0 == 2623) {
               var15 = var4.bj();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var15 != null ? var15.cf() : 0;
               return 1;
            } else if (var0 == 2624) {
               var15 = var4.bj();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var15 != null && var15.ce() ? 1 : 0;
               return 1;
            } else if (var0 != 2625) {
               if (2626 == var0) {
                  var15 = var4.bj();
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var15 ? var15.bw().af() : "";
                  return 1;
               } else if (var0 == 2627) {
                  var15 = var4.bj();
                  int var6 = null != var15 ? var15.cn() : 0;
                  int var7 = null != var15 ? var15.cc() : 0;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.min(var6, var7);
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (var0 == 2628) {
                  var15 = var4.bj();
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var15 != null ? var15.cc() : 0;
                  return 1;
               } else if (var0 == 2629) {
                  var15 = var4.bj();
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var15 ? var15.cg() : 0;
                  return 1;
               } else if (var0 == 2630) {
                  var15 = var4.bj();
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var15 != null ? var15.cl() : 0;
                  return 1;
               } else if (2631 == var0) {
                  var15 = var4.bj();
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var15 ? var15.cr() : 0;
                  return 1;
               } else if (2632 == var0) {
                  var15 = var4.bj();
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var15 ? var15.cy() : 0;
                  return 1;
               } else {
                  bb var16;
                  if (var0 == 2633) {
                     var16 = var4.bs();
                     Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = var16 != null ? var16.aw(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1]) : 0;
                     return 1;
                  } else if (var0 == 2634) {
                     var16 = var4.bs();
                     Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = var16 != null ? var16.ac((char)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var15 = var4.bj();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var15 != null && var15.ci() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   static void addPlayerToScene(Player var0, boolean var1) {
      if (null != var0 && var0.isVisible() && !var0.isHidden) {
         var0.isUnanimated = false;
         if ((Client.isLowDetail && ds.ab * -2010934433 > 50 || -2010934433 * ds.ab > 200) && var1 && var0.readySequence * 1590591885 == -1302441815 * var0.spotAnimationFrame) {
            var0.isUnanimated = true;
         }

         int var3 = 1144428983 * var0.bx >> 7;
         int var4 = -411750205 * var0.bo >> 7;
         if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
            long var5 = ir.aa_renamed(0, 0, 0, false, var0.ae * -1232170701);
            if (var0.ah != null && -1886224337 * Client.ep >= var0.animationCycleStart * -1402262375 && -1886224337 * Client.ep < var0.animationCycleEnd * -935505685) {
               var0.isUnanimated = false;
               var0.aa = fq.getTileHeight(1144428983 * var0.bx, -411750205 * var0.bo, GameShell.plane * -1727408401) * -548513145;
               var0.bd = -14183397 * Client.ep;
               bx.scene.ax(-1727408401 * GameShell.plane, var0.bx * 1144428983, var0.bo * -411750205, 561204023 * var0.aa, 60, var0, var0.bz * -1703696531, var5, -1793206457 * var0.av, -1107395863 * var0.ar, 54499173 * var0.am, var0.as * 806621699);
            } else {
               if (64 == (1144428983 * var0.bx & 127) && 64 == (var0.bo * -411750205 & 127)) {
                  if (Client.mt[var3][var4] == Client.mw * 2041464667) {
                     return;
                  }

                  Client.mt[var3][var4] = 2041464667 * Client.mw;
               }

               var0.aa = fq.getTileHeight(1144428983 * var0.bx, var0.bo * -411750205, -1727408401 * GameShell.plane) * -548513145;
               var0.bd = Client.ep * -14183397;
               bx.scene.ao(GameShell.plane * -1727408401, var0.bx * 1144428983, var0.bo * -411750205, 561204023 * var0.aa, 60, var0, -1703696531 * var0.bz, var5, var0.an);
            }
         }
      }

   }

   static final void mr_renamed(Component var0) {
      int var2 = var0.clientCode * 1021339961;
      if (var2 == 324) {
         if (-1 == Client.vr * -1563612739) {
            Client.vr = 1781840109 * var0.spriteId2;
            Client.vu = 1885844547 * var0.spriteId;
         }

         if (1 == Client.vh.au * 1693987821) {
            var0.spriteId2 = Client.vr * -272472859;
         } else {
            var0.spriteId2 = -1012252929 * Client.vu;
         }

      } else if (var2 == 325) {
         if (-1 == -1563612739 * Client.vr) {
            Client.vr = 1781840109 * var0.spriteId2;
            Client.vu = var0.spriteId * 1885844547;
         }

         if (1 == Client.vh.au * 1693987821) {
            var0.spriteId2 = Client.vu * -1012252929;
         } else {
            var0.spriteId2 = -272472859 * Client.vr;
         }

      } else if (327 == var2) {
         var0.modelAngleX = 38330330;
         var0.modelAngleY = ((int)(Math.sin((double)(Client.ep * -1886224337) / 40.0) * 256.0) & 2047) * -230241203;
         var0.modelType = 17527377;
         var0.modelId = 0;
      } else if (328 == var2) {
         var0.modelAngleX = 38330330;
         var0.modelAngleY = ((int)(Math.sin((double)(Client.ep * -1886224337) / 40.0) * 256.0) & 2047) * -230241203;
         var0.modelType = 17527377;
         var0.modelId = 509431749;
      }
   }
}
