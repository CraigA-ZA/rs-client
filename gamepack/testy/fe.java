import java.util.concurrent.ThreadFactory;

final class fe implements ThreadFactory {
   static final int bl = 58;
   static final float af = 0.33333334F;
   static bn td;
   static mq os;
   static final int as = 2097152;
   public static String[] av;
   public static final int at = 11;
   static final int by = 3;

   static final void mn(int var0, int var1) {
      try {
         var0 = Math.min(Math.max(var0, 0), 127);
         aj.vb.as(var0, -957604712);
      } catch (RuntimeException var2) {
         throw db.an(var2, "fe.mn(" + ')');
      }
   }

   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS Maya Anim Load");
      } catch (RuntimeException var2) {
         throw db.an(var2, "fe.newThread(" + ')');
      }
   }

   public Thread an(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   static int ap(int var0, ch var1, boolean var2, byte var3) {
      try {
         if (var0 == 3300) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               cy.al[(at += 427135973) * -964267539 - 1] = client.ep * -1886224337;
               return 1;
            }
         } else {
            int var4;
            int var5;
            if (var0 == 3301) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  at -= 854271946;
                  var4 = cy.al[cy.at * -964267539];
                  var5 = cy.al[1 + -964267539 * cy.at];
                  cy.al[(at += 427135973) * -964267539 - 1] = dv.af(var4, var5, (byte)0);
                  return 1;
               }
            } else if (var0 == 3302) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  at -= 854271946;
                  var4 = cy.al[-964267539 * cy.at];
                  var5 = cy.al[-964267539 * cy.at + 1];
                  cy.al[(at += 427135973) * -964267539 - 1] = qb.an(var4, var5, 2098730562);
                  return 1;
               }
            } else if (var0 == 3303) {
               at -= 854271946;
               var4 = cy.al[-964267539 * cy.at];
               var5 = cy.al[cy.at * -964267539 + 1];
               cy.al[(at += 427135973) * -964267539 - 1] = pv.aw(var4, var5, 66317544);
               return 1;
            } else if (3304 == var0) {
               var4 = cy.al[(at -= 427135973) * -964267539];
               cy.al[(at += 427135973) * -964267539 - 1] = cm.an(var4, -1717461998).aw * -2010981849;
               return 1;
            } else if (3305 == var0) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  var4 = cy.al[(at -= 427135973) * -964267539];
                  cy.al[(at += 427135973) * -964267539 - 1] = client.ng[var4];
                  return 1;
               }
            } else if (3306 == var0) {
               var4 = cy.al[(at -= 427135973) * -964267539];
               cy.al[(at += 427135973) * -964267539 - 1] = client.ny[var4];
               return 1;
            } else if (3307 == var0) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  var4 = cy.al[(at -= 427135973) * -964267539];
                  cy.al[(at += 427135973) * -964267539 - 1] = client.nu[var4];
                  return 1;
               }
            } else {
               int var6;
               if (var0 == 3308) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var4 = -1727408401 * bm.mh;
                     var5 = jm.ib * -1232093375 + (1144428983 * lq.mi.bx >> 7);
                     var6 = 827352769 * jj.jc + (-411750205 * lq.mi.bo >> 7);
                     cy.al[(at += 427135973) * -964267539 - 1] = var6 + (var5 << 14) + (var4 << 28);
                     return 1;
                  }
               } else if (var0 == 3309) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var4 = cy.al[(at -= 427135973) * -964267539];
                     cy.al[(at += 427135973) * -964267539 - 1] = var4 >> 14 & 16383;
                     return 1;
                  }
               } else if (var0 == 3310) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var4 = cy.al[(at -= 427135973) * -964267539];
                     cy.al[(at += 427135973) * -964267539 - 1] = var4 >> 28;
                     return 1;
                  }
               } else if (3311 == var0) {
                  var4 = cy.al[(at -= 427135973) * -964267539];
                  cy.al[(at += 427135973) * -964267539 - 1] = var4 & 16383;
                  return 1;
               } else if (3312 == var0) {
                  int[] var10000 = cy.al;
                  int var10001 = (at += 427135973) * -964267539 - 1;
                  byte var10002;
                  if (client.ca) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     }

                     var10002 = 1;
                  } else {
                     var10002 = 0;
                  }

                  var10000[var10001] = var10002;
                  return 1;
               } else if (var0 == 3313) {
                  at -= 854271946;
                  var4 = '耀' + cy.al[cy.at * -964267539];
                  var5 = cy.al[-964267539 * cy.at + 1];
                  cy.al[(at += 427135973) * -964267539 - 1] = dv.af(var4, var5, (byte)0);
                  return 1;
               } else if (var0 == 3314) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     at -= 854271946;
                     var4 = '耀' + cy.al[cy.at * -964267539];
                     var5 = cy.al[1 + -964267539 * cy.at];
                     cy.al[(at += 427135973) * -964267539 - 1] = qb.an(var4, var5, 2098730562);
                     return 1;
                  }
               } else if (3315 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     at -= 854271946;
                     var4 = cy.al[cy.at * -964267539] + '耀';
                     var5 = cy.al[1 + -964267539 * cy.at];
                     cy.al[(at += 427135973) * -964267539 - 1] = pv.aw(var4, var5, -1375115622);
                     return 1;
                  }
               } else if (3316 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     if (client.pu * 324465533 >= 2) {
                        if (var3 == 1) {
                           throw new IllegalStateException();
                        }

                        cy.al[(at += 427135973) * -964267539 - 1] = client.pu * 324465533;
                     } else {
                        cy.al[(at += 427135973) * -964267539 - 1] = 0;
                     }

                     return 1;
                  }
               } else if (var0 == 3317) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     cy.al[(at += 427135973) * -964267539 - 1] = client.ea * -1496573241;
                     return 1;
                  }
               } else if (var0 == 3318) {
                  cy.al[(at += 427135973) * -964267539 - 1] = -453810525 * client.bw;
                  return 1;
               } else if (var0 == 3321) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     cy.al[(at += 427135973) * -964267539 - 1] = -365416549 * client.pk / 100;
                     return 1;
                  }
               } else if (3322 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     cy.al[(at += 427135973) * -964267539 - 1] = client.pj * -1940722149;
                     return 1;
                  }
               } else if (3323 == var0) {
                  if (client.po) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     }

                     cy.al[(at += 427135973) * -964267539 - 1] = 1;
                  } else {
                     cy.al[(at += 427135973) * -964267539 - 1] = 0;
                  }

                  return 1;
               } else if (3324 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     cy.al[(at += 427135973) * -964267539 - 1] = -205173751 * client.ce;
                     return 1;
                  }
               } else if (3325 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     at -= 1708543892;
                     var4 = cy.al[cy.at * -964267539];
                     var5 = cy.al[cy.at * -964267539 + 1];
                     var6 = cy.al[2 + cy.at * -964267539];
                     int var7 = cy.al[3 + cy.at * -964267539];
                     var4 += var5 << 14;
                     var4 += var6 << 28;
                     var4 += var7;
                     cy.al[(at += 427135973) * -964267539 - 1] = var4;
                     return 1;
                  }
               } else if (var0 == 3326) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     cy.al[(at += 427135973) * -964267539 - 1] = -751176573 * client.et;
                     return 1;
                  }
               } else if (var0 == 3327) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     cy.al[(at += 427135973) * -964267539 - 1] = client.ef * -2076298705;
                     return 1;
                  }
               } else if (3331 == var0) {
                  cy.al[(at += 427135973) * -964267539 - 1] = client.pk * -365416549;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "fe.ap(" + ')');
      }
   }

   public Thread af(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }
}
