public class ly {
   public static nm af;
   public static nm an;
   public static nm aw;
   public static nm ab;
   public static int au = 0;
   public static ba ax;
   static int ke;
   public static final int ay = 1792;

   public static void ak(int var0, nm var1, String var2, String var3, int var4, boolean var5) {
      if (var1.cv(var2, var3, -1313069490)) {
         int var6 = var1.cy(var2, 1810129675);
         int var7 = var1.cx(var6, var3, (short)8192);
         de.aq(var0, var1, var6, var7, var4, var5, -673688646);
      }

   }

   public static boolean at(nm var0, nm var1, nm var2, ln var3) {
      af = var0;
      an = var1;
      aw = var2;
      sa.ac = var3;
      return true;
   }

   static int ab(cl var0, cl var1, int var2, boolean var3, byte var4) {
      try {
         if (var2 == 1) {
            if (var4 <= 0) {
               throw new IllegalStateException();
            } else {
               int var5 = -1396846889 * var0.ax;
               int var6 = -1396846889 * var1.ax;
               if (!var3) {
                  if (var4 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (-1 == var5) {
                     if (var4 <= 0) {
                        throw new IllegalStateException();
                     }

                     var5 = 2001;
                  }

                  if (var6 == -1) {
                     if (var4 <= 0) {
                        throw new IllegalStateException();
                     }

                     var6 = 2001;
                  }
               }

               return var5 - var6;
            }
         } else if (var2 == 2) {
            return -665846519 * var0.ah - -665846519 * var1.ah;
         } else {
            byte var8;
            if (var2 == 3) {
               if (var4 <= 0) {
                  throw new IllegalStateException();
               } else if (var0.ag.equals("-")) {
                  if (var4 <= 0) {
                     throw new IllegalStateException();
                  } else if (var1.ag.equals("-")) {
                     return 0;
                  } else {
                     if (var3) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        var8 = -1;
                     } else {
                        var8 = 1;
                     }

                     return var8;
                  }
               } else if (var1.ag.equals("-")) {
                  if (var4 <= 0) {
                     throw new IllegalStateException();
                  } else {
                     if (var3) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        var8 = 1;
                     } else {
                        var8 = -1;
                     }

                     return var8;
                  }
               } else {
                  return var0.ag.compareTo(var1.ag);
               }
            } else if (4 == var2) {
               if (var4 <= 0) {
                  throw new IllegalStateException();
               } else {
                  if (var0.ax((byte)105)) {
                     if (var4 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (var1.ax((byte)59)) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        var8 = 0;
                     } else {
                        var8 = 1;
                     }
                  } else if (var1.ax((byte)24)) {
                     if (var4 <= 0) {
                        throw new IllegalStateException();
                     }

                     var8 = -1;
                  } else {
                     var8 = 0;
                  }

                  return var8;
               }
            } else {
               int var10000;
               if (var2 == 5) {
                  if (var4 <= 0) {
                     throw new IllegalStateException();
                  } else {
                     if (var0.ay(671253830)) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (var1.ay(555881941)) {
                           if (var4 <= 0) {
                              throw new IllegalStateException();
                           }

                           var10000 = 0;
                        } else {
                           var10000 = 1;
                        }
                     } else {
                        var10000 = var1.ay(408455672) ? -1 : 0;
                     }

                     return var10000;
                  }
               } else if (var2 == 6) {
                  if (var4 <= 0) {
                     throw new IllegalStateException();
                  } else {
                     if (var0.ao(2121026905)) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (var1.ao(1140984375)) {
                           if (var4 <= 0) {
                              throw new IllegalStateException();
                           }

                           var10000 = 0;
                        } else {
                           var10000 = 1;
                        }
                     } else if (var1.ao(1625717126)) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        var10000 = -1;
                     } else {
                        var10000 = 0;
                     }

                     return var10000;
                  }
               } else if (7 == var2) {
                  if (var0.at(1029039210)) {
                     if (var4 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (var1.at(1029039210)) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        var10000 = 0;
                     } else {
                        var10000 = 1;
                     }
                  } else if (var1.at(1029039210)) {
                     if (var4 <= 0) {
                        throw new IllegalStateException();
                     }

                     var10000 = -1;
                  } else {
                     var10000 = 0;
                  }

                  return var10000;
               } else {
                  return -2091224171 * var0.ay - var1.ay * -2091224171;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "ly.ab(" + ')');
      }
   }

   public static boolean ay(nm var0, nm var1, nm var2, ln var3) {
      af = var0;
      an = var1;
      aw = var2;
      sa.ac = var3;
      return true;
   }

   public static void ao(nm var0, int var1, int var2, int var3, boolean var4) {
      au = -626822165;
      ab = var0;
      oq.aq = var1 * -1643562499;
      gz.al = 1823837761 * var2;
      dn.at = 111967803 * var3;
      ev.ay = var4;
      ga.aa = 1504627152;
   }

   public static void ax(nm var0, int var1, int var2, int var3, boolean var4) {
      au = -626822165;
      ab = var0;
      oq.aq = var1 * -182695301;
      gz.al = -2135250830 * var2;
      dn.at = 1956427836 * var3;
      ev.ay = var4;
      ga.aa = 1504627152;
   }

   public static void ai(nm var0, int var1, int var2, int var3, boolean var4) {
      au = -626822165;
      ab = var0;
      oq.aq = var1 * -202962778;
      gz.al = 1823837761 * var2;
      dn.at = 1221280450 * var3;
      ev.ay = var4;
      ga.aa = -171872116;
   }

   public static boolean aa(nm var0, nm var1, nm var2, ln var3) {
      af = var0;
      an = var1;
      aw = var2;
      sa.ac = var3;
      return true;
   }

   public static void av() {
      sa.ac.ao((byte)-35);
      au = -626822165;
      ab = null;
   }

   public static void ar() {
      sa.ac.ao((byte)-7);
      au = -626822165;
      ab = null;
   }

   public static void as(int var0, nm var1, String var2, String var3, int var4, boolean var5) {
      if (var1.cv(var2, var3, -1313069490)) {
         int var6 = var1.cy(var2, -54145120);
         int var7 = var1.cx(var6, var3, (short)8192);
         de.aq(var0, var1, var6, var7, var4, var5, -354262644);
      }

   }

   public static void am(int var0, nm var1, String var2, String var3, int var4, boolean var5) {
      if (var1.cv(var2, var3, -1313069490)) {
         int var6 = var1.cy(var2, -1934621217);
         int var7 = var1.cx(var6, var3, (short)8192);
         de.aq(var0, var1, var6, var7, var4, var5, -789847682);
      }

   }

   ly() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ly.<init>(" + ')');
      }
   }

   public static void aj(int var0, nm var1, String var2, String var3, int var4, boolean var5) {
      if (var1.cv(var2, var3, -1313069490)) {
         int var6 = var1.cy(var2, -838492475);
         int var7 = var1.cx(var6, var3, (short)8192);
         de.aq(var0, var1, var6, var7, var4, var5, -416986334);
      }

   }

   public static void ag(int var0) {
      if (926096579 * au != 0) {
         dn.at = var0 * 111967803;
      } else {
         sa.ac.af(var0, (byte)19);
      }

   }

   public static void az(int var0, nm var1, int var2, int var3, int var4, boolean var5) {
      au = -626822165;
      ab = var1;
      oq.aq = var2 * -1643562499;
      gz.al = var3 * 1823837761;
      dn.at = var4 * 111967803;
      ev.ay = var5;
      ga.aa = var0 * -1927001363;
   }

   public static void ah(int var0) {
      if (-2138642109 * au != 0) {
         dn.at = var0 * -910915100;
      } else {
         sa.ac.af(var0, (byte)19);
      }

   }
}
