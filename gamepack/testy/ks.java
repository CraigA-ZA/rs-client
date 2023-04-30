public class ks {
   static final int af = 8388607;
   public static final int an = 8388607;
   public static final int dl = 112;
   static final int ap = 28;
   public static final int ab = 15;

   ks() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ks.<init>(" + ')');
      }
   }

   static int an(int var0, int var1, int var2, byte var3) {
      try {
         return var0 << 28 | var1 << 14 | var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ks.an(" + ')');
      }
   }

   static int bq(int var0, ch var1, boolean var2, int var3) {
      try {
         if (var0 == 6754) {
            if (var3 == -180772952) {
               throw new IllegalStateException();
            } else {
               int var7 = cy.al[(cy.at -= 427135973) * -964267539];
               hs var8 = nm.an(var7, (byte)1);
               cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = null != var8 ? var8.aq : "";
               return 1;
            }
         } else {
            hs var4;
            if (6764 == var0) {
               if (var3 == -180772952) {
                  throw new IllegalStateException();
               } else {
                  cy.at -= 854271946;
                  var4 = nm.an(cy.al[-964267539 * cy.at], (byte)-21);
                  int var5 = cy.al[1 + -964267539 * cy.at];
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.ah(var5, (byte)123);
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.ar(var5, 439788995);
                  return 1;
               }
            } else if (var0 == 6765) {
               if (var3 == -180772952) {
                  throw new IllegalStateException();
               } else {
                  var4 = nm.an(cy.al[(cy.at -= 427135973) * -964267539], (byte)-126);
                  int[] var10000 = cy.al;
                  int var10001 = (cy.at += 427135973) * -964267539 - 1;
                  int var10002;
                  if (var4 != null) {
                     if (var3 == -180772952) {
                        throw new IllegalStateException();
                     }

                     var10002 = 2062903815 * var4.bx;
                  } else {
                     var10002 = 0;
                  }

                  var10000[var10001] = var10002;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "ks.bq(" + ')');
      }
   }

   public static void ba(mq var0, int var1, int var2) {
      try {
         hz var3 = dh.af(var1, (byte)51);
         var0.dd.an[-1935812527 * var3.bk] = 512 + var1;
         if (-1719338253 * var3.bx != -1) {
            if (var2 >= -655350082) {
               throw new IllegalStateException();
            }

            var0.dd.an[var3.bx * -1719338253] = 0;
         }

         if (var3.bo * 723093341 != -1) {
            if (var2 >= -655350082) {
               return;
            }

            var0.dd.an[var3.bo * 723093341] = 0;
         }

         var0.dd.ax(-469114674);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ks.ba(" + ')');
      }
   }

   public static void ab(int var0, nm var1, String var2, String var3, int var4, boolean var5, int var6) {
      try {
         if (var1.cv(var2, var3, -1313069490)) {
            if (var6 == 741327699) {
               throw new IllegalStateException();
            }

            int var7 = var1.cy(var2, -1262984149);
            int var8 = var1.cx(var7, var3, (short)8192);
            de.aq(var0, var1, var7, var8, var4, var5, -1238631827);
         }

      } catch (RuntimeException var9) {
         throw db.an(var9, "ks.ab(" + ')');
      }
   }
}
