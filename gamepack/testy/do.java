import java.util.Calendar;
import java.util.Date;

public class do {
   static final int as = 20;
   static final int an = 2;
   static final int aw = 3;
   static final int au = 5;
   static final int af = 1;
   public static final int aq = 16;
   static final int bo = 47;
   static final int pe = 1;

   static void kf(int var0, int var1, short var2) {
      try {
         lg var3 = mi.an(lv.cp, client.in.au, (short)-8374);
         var3.aw.el(var0, -437883978);
         var3.aw.dn(var1, (byte)4);
         client.in.aw(var3, 414135591);
      } catch (RuntimeException var4) {
         throw db.an(var4, "do.kf(" + ')');
      }
   }

   static boolean al(Date var0, int var1) {
      try {
         Calendar var2 = Calendar.getInstance();
         var2.set(1, var2.get(1) - 13);
         var2.set(5, var2.get(5) + 1);
         var2.set(11, 0);
         var2.set(12, 0);
         var2.set(13, 0);
         var2.set(14, 0);
         Date var3 = var2.getTime();
         return var0.before(var3);
      } catch (RuntimeException var4) {
         throw db.an(var4, "do.al(" + ')');
      }
   }

   static final void ku(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (var2 >= 1) {
            if (var8 >= -2128603190) {
               throw new IllegalStateException();
            }

            if (var3 >= 1) {
               if (var8 >= -2128603190) {
                  return;
               }

               if (var2 <= 102) {
                  if (var8 >= -2128603190) {
                     return;
                  }

                  if (var3 <= 102) {
                     if (var8 >= -2128603190) {
                        return;
                     }

                     if (client.cu) {
                        if (var8 >= -2128603190) {
                           throw new IllegalStateException();
                        }

                        if (var0 != bm.mh * -1727408401) {
                           return;
                        }
                     }

                     long var9 = 0L;
                     boolean var11 = true;
                     boolean var12 = false;
                     boolean var13 = false;
                     if (0 == var1) {
                        if (var8 >= -2128603190) {
                           throw new IllegalStateException();
                        }

                        var9 = bx.js.by(var0, var2, var3);
                     }

                     if (var1 == 1) {
                        if (var8 >= -2128603190) {
                           return;
                        }

                        var9 = bx.js.bb(var0, var2, var3);
                     }

                     if (var1 == 2) {
                        if (var8 >= -2128603190) {
                           throw new IllegalStateException();
                        }

                        var9 = bx.js.bi(var0, var2, var3);
                     }

                     if (3 == var1) {
                        if (var8 >= -2128603190) {
                           throw new IllegalStateException();
                        }

                        var9 = bx.js.be(var0, var2, var3);
                     }

                     int var14;
                     if (var9 != 0L) {
                        if (var8 >= -2128603190) {
                           throw new IllegalStateException();
                        }

                        var14 = bx.js.bk(var0, var2, var3, var9);
                        int var17 = di.at(var9);
                        int var18 = var14 & 31;
                        int var19 = var14 >> 6 & 3;
                        hq var15;
                        if (0 == var1) {
                           if (var8 >= -2128603190) {
                              throw new IllegalStateException();
                           }

                           bx.js.ar(var0, var2, var3);
                           var15 = fw.an(var17, (short)1282);
                           if (0 != var15.am * -973955889) {
                              if (var8 >= -2128603190) {
                                 throw new IllegalStateException();
                              }

                              client.jr[var0].aq(var2, var3, var18, var19, var15.as, -776317282);
                           }
                        }

                        if (1 == var1) {
                           bx.js.am(var0, var2, var3);
                        }

                        if (var1 == 2) {
                           if (var8 >= -2128603190) {
                              throw new IllegalStateException();
                           }

                           bx.js.as(var0, var2, var3);
                           var15 = fw.an(var17, (short)5392);
                           if (-1339930361 * var15.av + var2 > 103) {
                              return;
                           }

                           if (var8 >= -2128603190) {
                              throw new IllegalStateException();
                           }

                           if (-1339930361 * var15.av + var3 > 103) {
                              return;
                           }

                           if (var8 >= -2128603190) {
                              return;
                           }

                           if (var2 + var15.ar * -1659393955 > 103) {
                              return;
                           }

                           if (-1659393955 * var15.ar + var3 > 103) {
                              if (var8 >= -2128603190) {
                                 throw new IllegalStateException();
                              }

                              return;
                           }

                           if (-973955889 * var15.am != 0) {
                              if (var8 >= -2128603190) {
                                 throw new IllegalStateException();
                              }

                              client.jr[var0].al(var2, var3, -1339930361 * var15.av, var15.ar * -1659393955, var19, var15.as, -929861828);
                           }
                        }

                        if (3 == var1) {
                           bx.js.aj(var0, var2, var3);
                           var15 = fw.an(var17, (short)9672);
                           if (-973955889 * var15.am == 1) {
                              if (var8 >= -2128603190) {
                                 return;
                              }

                              client.jr[var0].aa(var2, var3, -127908210);
                           }
                        }
                     }

                     if (var4 >= 0) {
                        var14 = var0;
                        if (var0 < 3) {
                           if (var8 >= -2128603190) {
                              throw new IllegalStateException();
                           }

                           if (2 == (cd.an[1][var2][var3] & 2)) {
                              if (var8 >= -2128603190) {
                                 throw new IllegalStateException();
                              }

                              var14 = var0 + 1;
                           }
                        }

                        gh.ak(var0, var14, var2, var3, var4, var5, var6, var7, bx.js, client.jr[var0], -1255092021);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var16) {
         throw db.an(var16, "do.ku(" + ')');
      }
   }

   static boolean mz(int var0, int var1) {
      try {
         for(int var2 = 0; var2 < client.sm * -1685179677; ++var2) {
            if (var1 != -2013563855) {
               throw new IllegalStateException();
            }

            if (client.sz[var2] == var0) {
               if (var1 != -2013563855) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw db.an(var3, "do.mz(" + ')');
      }
   }

   do() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "do.<init>(" + ')');
      }
   }
}
