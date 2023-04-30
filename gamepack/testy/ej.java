import accessors.RSUserComparator4;
import java.util.Comparator;

public class ej implements Comparator, RSUserComparator4 {
   public static final int ai = 16;
   final boolean af;
   public static final int br = 64;
   static final int wk = 5;
   static int[] ax;

   static void nc(sg var0, int var1, byte var2) {
      try {
         byte[] var3 = var0.al;
         if (null == client.hf) {
            client.hf = new byte[24];
         }

         op.af(var3, var1, client.hf, 0, 24);
         gx.ac(var0, var1, -1564700734);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ej.nc(" + ')');
      }
   }

   int af(pb var1, pb var2, byte var3) {
      try {
         int var10000;
         if (this.af) {
            if (var3 <= 14) {
               throw new IllegalStateException();
            }

            var10000 = 1907692493 * var1.ab - 1907692493 * var2.ab;
         } else {
            var10000 = var2.ab * 1907692493 - 1907692493 * var1.ab;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ej.af(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((pb)var1, (pb)var2, (byte)54);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ej.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "ej.equals(" + ')');
      }
   }

   public int au(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)79);
   }

   public boolean gi(Object var1) {
      return super.equals(var1);
   }

   public int aq(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)29);
   }

   public int al(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)89);
   }

   public boolean gm(Object var1) {
      return super.equals(var1);
   }

   public int ab(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)57);
   }

   public boolean gq(Object var1) {
      return super.equals(var1);
   }

   public boolean gk(Object var1) {
      return super.equals(var1);
   }

   static int bt(int var0, ch var1, boolean var2, int var3) {
      try {
         if (5306 == var0) {
            if (var3 >= -1468900217) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = na.iv(631520575);
               return 1;
            }
         } else {
            int var4;
            if (5307 == var0) {
               if (var3 >= -1468900217) {
                  throw new IllegalStateException();
               } else {
                  var4 = cy.al[(cy.at -= 427135973) * -964267539];
                  if (var4 != 1) {
                     if (var3 >= -1468900217) {
                        throw new IllegalStateException();
                     }

                     if (var4 != 2) {
                        return 1;
                     }

                     if (var3 >= -1468900217) {
                        throw new IllegalStateException();
                     }
                  }

                  cc.ir(var4, (byte)-80);
                  return 1;
               }
            } else if (5308 == var0) {
               if (var3 >= -1468900217) {
                  throw new IllegalStateException();
               } else {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = aj.vb.bi((byte)106);
                  return 1;
               }
            } else if (5309 == var0) {
               if (var3 >= -1468900217) {
                  throw new IllegalStateException();
               } else {
                  var4 = cy.al[(cy.at -= 427135973) * -964267539];
                  if (1 != var4) {
                     if (var3 >= -1468900217) {
                        throw new IllegalStateException();
                     }

                     if (var4 != 2) {
                        return 1;
                     }
                  }

                  aj.vb.bb(var4, 1521769017);
                  return 1;
               }
            } else if (5310 == var0) {
               cy.at -= 427135973;
               return 1;
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "ej.bt(" + ')');
      }
   }

   int at(pb var1, pb var2) {
      return this.af ? 1907692493 * var1.ab - 1907692493 * var2.ab : var2.ab * 1907692493 - 1907692493 * var1.ab;
   }

   int ac(pb var1, pb var2) {
      return this.af ? 1907692493 * var1.ab - 1907692493 * var2.ab : var2.ab * 1907692493 - 1907692493 * var1.ab;
   }

   int an(pb var1, pb var2) {
      return this.af ? 1336987454 * var1.ab - 350638117 * var2.ab : var2.ab * 1907692493 - 1907692493 * var1.ab;
   }

   int aa(pb var1, pb var2) {
      return this.af ? 1907692493 * var1.ab - 1907692493 * var2.ab : var2.ab * 1907692493 - 1907692493 * var1.ab;
   }

   public static ac af(aq var0, int var1) {
      try {
         switch (var0.an * -1098467785) {
            case 0:
               return new af();
            default:
               throw new IllegalArgumentException();
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "ej.af(" + ')');
      }
   }

   int aw(pb var1, pb var2) {
      return this.af ? 1907692493 * var1.ab - 1907692493 * var2.ab : var2.ab * 1907692493 - 1907692493 * var1.ab;
   }

   static dj[] au(byte var0) {
      try {
         return new dj[]{dj.au, dj.af, dj.an, dj.aw, dj.ac};
      } catch (RuntimeException var1) {
         throw db.an(var1, "ej.au(" + ')');
      }
   }

   public ej(boolean var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ej.<init>(" + ')');
      }
   }
}
