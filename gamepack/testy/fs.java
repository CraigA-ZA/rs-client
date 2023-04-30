public class fs {
   static final int bm = 9;

   fs() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "fs.<init>(" + ')');
      }
   }

   static int au(int var0, ch var1, boolean var2, int var3) {
      try {
         int var4 = -1;
         mq var5;
         if (var0 >= 2000) {
            if (var3 != 1883190484) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = cy.al[(cy.at -= 427135973) * -964267539];
            var5 = gh.an(var4, (byte)5);
         } else {
            mq var10000;
            if (var2) {
               if (var3 != 1883190484) {
                  throw new IllegalStateException();
               }

               var10000 = bq.ag;
            } else {
               var10000 = an.ai;
            }

            var5 = var10000;
         }

         if (var0 == 1000) {
            if (var3 != 1883190484) {
               throw new IllegalStateException();
            } else {
               cy.at -= 1708543892;
               var5.bp = 1806877347 * cy.al[-964267539 * cy.at];
               var5.bc = 1231090287 * cy.al[1 + cy.at * -964267539];
               var5.bq = cy.al[2 + cy.at * -964267539] * 1656805111;
               var5.ba = cy.al[3 + -964267539 * cy.at] * -362988363;
               fw.ma(var5, -672313735);
               ck.bc.lt(var5, 195955152);
               if (var4 != -1) {
                  if (var3 != 1883190484) {
                     throw new IllegalStateException();
                  }

                  if (883712245 * var5.bg == 0) {
                     if (var3 != 1883190484) {
                        throw new IllegalStateException();
                     }

                     je.lz(hn.ap[var4 >> 16], var5, false, (byte)63);
                  }
               }

               return 1;
            }
         } else if (1001 == var0) {
            if (var3 != 1883190484) {
               throw new IllegalStateException();
            } else {
               cy.at -= 1708543892;
               var5.bh = -1495372107 * cy.al[cy.at * -964267539];
               var5.bw = 1193771871 * cy.al[1 + cy.at * -964267539];
               var5.bv = 387308049 * cy.al[2 + cy.at * -964267539];
               var5.bl = -480958745 * cy.al[3 + -964267539 * cy.at];
               fw.ma(var5, -1210238136);
               ck.bc.lt(var5, 30736470);
               if (-1 != var4) {
                  if (var3 != 1883190484) {
                     throw new IllegalStateException();
                  }

                  if (var5.bg * 883712245 == 0) {
                     if (var3 != 1883190484) {
                        throw new IllegalStateException();
                     }

                     je.lz(hn.ap[var4 >> 16], var5, false, (byte)121);
                  }
               }

               return 1;
            }
         } else if (1003 == var0) {
            if (var3 != 1883190484) {
               throw new IllegalStateException();
            } else {
               boolean var6 = cy.al[(cy.at -= 427135973) * -964267539] == 1;
               if (var6 != var5.ck) {
                  if (var3 != 1883190484) {
                     throw new IllegalStateException();
                  }

                  var5.ck = var6;
                  fw.ma(var5, -1743554950);
               }

               return 1;
            }
         } else {
            boolean var10001;
            if (var0 == 1005) {
               if (var3 != 1883190484) {
                  throw new IllegalStateException();
               } else {
                  if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                     if (var3 != 1883190484) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var5.hn = var10001;
                  return 1;
               }
            } else if (var0 == 1006) {
               if (var3 != 1883190484) {
                  throw new IllegalStateException();
               } else {
                  if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                     if (var3 != 1883190484) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var5.hl = var10001;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "fs.au(" + ')');
      }
   }

   public static qx an(byte var0) {
      try {
         synchronized(qx.af) {
            if (0 == -2133937525 * qx.aw) {
               return new qx();
            } else {
               qx.af[(qx.aw -= 1732158755) * -2133937525].ab(479654573);
               return qx.af[-2133937525 * qx.aw];
            }
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "fs.an(" + ')');
      }
   }
}
