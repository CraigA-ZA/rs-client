import java.util.Comparator;

public abstract class AbstractUserComparator implements Comparator {
   Comparator an;

   protected AbstractUserComparator() {
   }

   final void ay(Comparator var1) {
      if (null == this.an) {
         this.an = var1;
      } else if (this.an instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.an).ay(var1);
      }

   }

   protected final int ao(User var1, User var2) {
      return null == this.an ? 0 : this.an.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static int ai_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4 = var2 ? SoundSystem.ag : an.ai;
      if (1600 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1469632775 * var4.scrollX;
         return 1;
      } else if (1601 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1223232735 * var4.scrollY;
         return 1;
      } else {
         mz var14;
         if (1602 == var0) {
            if (12 == var4.bg * 883712245) {
               var14 = var4.bj();
               if (null != var14) {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var14.bc().ab();
                  return 1;
               }
            }

            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4.text;
            return 1;
         } else if (var0 == 1603) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.scrollWidth * -773060713;
            return 1;
         } else if (1604 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1273374131 * var4.scrollHeight;
            return 1;
         } else if (1605 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 942674363 * var4.modelZoom;
            return 1;
         } else if (var0 == 1606) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.modelAngleX * 797932055;
            return 1;
         } else if (1607 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.modelAngleZ * -1023931993;
            return 1;
         } else if (1608 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -480949115 * var4.modelAngleY;
            return 1;
         } else if (1609 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.transparency * 1634279623;
            return 1;
         } else if (1610 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.cz * 122284991;
            return 1;
         } else if (var0 == 1611) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1409091639 * var4.color;
            return 1;
         } else if (1612 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.color2 * 1449039161;
            return 1;
         } else if (1613 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.cb.ordinal();
            return 1;
         } else if (var0 == 1614) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.modelTransparency ? 1 : 0;
            return 1;
         } else {
            FaceNormal var5;
            if (1617 == var0) {
               var5 = var4.bn();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var5 ? -90398499 * var5.af : 0;
            }

            if (var0 == 1618) {
               var5 = var4.bn();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var5 ? 216034339 * var5.an : 0;
               return 1;
            } else if (var0 == 1619) {
               var14 = var4.bj();
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var14 != null ? var14.bh().ab() : "";
               return 1;
            } else if (var0 == 1620) {
               var5 = var4.bn();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5 != null ? 1912484269 * var5.aw : 0;
               return 1;
            } else if (var0 == 1621) {
               var14 = var4.bj();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var14 != null ? var14.cq() : 0;
               return 1;
            } else if (1622 == var0) {
               var14 = var4.bj();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var14 ? var14.cm() : 0;
               return 1;
            } else if (1623 == var0) {
               var14 = var4.bj();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var14 != null ? var14.cf() : 0;
               return 1;
            } else if (var0 == 1624) {
               var14 = var4.bj();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var14 && var14.ce() ? 1 : 0;
               return 1;
            } else if (1625 != var0) {
               if (1626 == var0) {
                  var14 = var4.bj();
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var14 != null ? var14.bw().af() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var14 = var4.bj();
                  int var6 = var14 != null ? var14.cn() : 0;
                  int var7 = var14 != null ? var14.cc() : 0;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.min(var6, var7);
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (1628 == var0) {
                  var14 = var4.bj();
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var14 != null ? var14.cc() : 0;
                  return 1;
               } else if (1629 == var0) {
                  var14 = var4.bj();
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var14 ? var14.cg() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var14 = var4.bj();
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var14 != null ? var14.cl() : 0;
                  return 1;
               } else if (1631 == var0) {
                  var14 = var4.bj();
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var14 ? var14.cr() : 0;
                  return 1;
               } else if (1632 == var0) {
                  var14 = var4.bj();
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = null != var14 ? var14.cy() : 0;
                  return 1;
               } else {
                  bb var15;
                  if (var0 == 1633) {
                     var15 = var4.bs();
                     Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1] = null != var15 ? var15.aw(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1]) : 0;
                     return 1;
                  } else if (1634 == var0) {
                     var15 = var4.bs();
                     Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1] = var15 != null ? var15.ac((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var14 = var4.bj();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var14 != null && var14.ci() ? 1 : 0;
               return 1;
            }
         }
      }
   }
}
