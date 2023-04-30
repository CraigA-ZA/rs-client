import accessors.RSClientScript;

public class ch extends rk implements RSClientScript {
   String an;
   static final int by = 0;
   int[] aw;
   int[] ac;
   String[] au;
   int ab;
   int aq;
   int at;
   int al;
   ro[] aa;
   static kh af = new kh(128);
   public static no ai;

   static ch aa(int var0, int var1) {
      ch var2 = (ch)af.af((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = ey.fj.cy(var3, 412805306);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = ey.fj.cn(var4, (byte)79);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = bz.ac(var5, (byte)1);
               if (var2 != null) {
                  af.aw(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   ro[] au(int var1, int var2) {
      try {
         return new ro[var1];
      } catch (RuntimeException var3) {
         throw db.an(var3, "ch.au(" + ')');
      }
   }

   static ch ab(int var0) {
      ch var1 = (ch)af.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ey.fj.bh(var0, 0, (byte)-4);
         if (null == var2) {
            return null;
         } else {
            var1 = bz.ac(var2, (byte)1);
            af.aw(var1, (long)var0);
            return var1;
         }
      }
   }

   static ch aq(int var0, int var1, int var2) {
      int var3 = (var1 << 8) + var0;
      ch var5 = hq.aw(var3, var0, (byte)-16);
      if (null != var5) {
         return var5;
      } else {
         int var4 = kd.af(var2, var0, 1891104876);
         ch var7 = (ch)af.af((long)(var4 << 16));
         ch var6;
         if (null != var7) {
            var6 = var7;
         } else {
            String var8 = String.valueOf(var4);
            int var9 = ey.fj.cy(var8, -750958888);
            if (-1 == var9) {
               var6 = null;
            } else {
               byte[] var10 = ey.fj.cn(var9, (byte)-11);
               if (null != var10) {
                  if (var10.length <= 1) {
                     var6 = null;
                     return var6 != null ? var6 : null;
                  }

                  var7 = bz.ac(var10, (byte)1);
                  if (var7 != null) {
                     af.aw(var7, (long)(var4 << 16));
                     var6 = var7;
                     return var6 != null ? var6 : null;
                  }
               }

               var6 = null;
            }
         }

         return var6 != null ? var6 : null;
      }
   }

   static ch al(int var0, int var1, int var2) {
      int var3 = (var1 << 8) + var0;
      ch var5 = hq.aw(var3, var0, (byte)-42);
      if (null != var5) {
         return var5;
      } else {
         int var4 = kd.af(var2, var0, 710526576);
         ch var7 = (ch)af.af((long)(var4 << 16));
         ch var6;
         if (null != var7) {
            var6 = var7;
         } else {
            String var8 = String.valueOf(var4);
            int var9 = ey.fj.cy(var8, -109322301);
            if (-1 == var9) {
               var6 = null;
            } else {
               byte[] var10 = ey.fj.cn(var9, (byte)-61);
               if (null != var10) {
                  if (var10.length <= 1) {
                     var6 = null;
                     return var6 != null ? var6 : null;
                  }

                  var7 = bz.ac(var10, (byte)1);
                  if (var7 != null) {
                     af.aw(var7, (long)(var4 << 16));
                     var6 = var7;
                     return var6 != null ? var6 : null;
                  }
               }

               var6 = null;
            }
         }

         return var6 != null ? var6 : null;
      }
   }

   static ch at(int var0, int var1, int var2) {
      int var3 = (var1 << 8) + var0;
      ch var5 = hq.aw(var3, var0, (byte)-77);
      if (null != var5) {
         return var5;
      } else {
         int var4 = kd.af(var2, var0, 1975379723);
         ch var7 = (ch)af.af((long)(var4 << 16));
         ch var6;
         if (null != var7) {
            var6 = var7;
         } else {
            String var8 = String.valueOf(var4);
            int var9 = ey.fj.cy(var8, 1363244126);
            if (-1 == var9) {
               var6 = null;
            } else {
               byte[] var10 = ey.fj.cn(var9, (byte)-7);
               if (null != var10) {
                  if (var10.length <= 1) {
                     var6 = null;
                     return var6 != null ? var6 : null;
                  }

                  var7 = bz.ac(var10, (byte)1);
                  if (var7 != null) {
                     af.aw(var7, (long)(var4 << 16));
                     var6 = var7;
                     return var6 != null ? var6 : null;
                  }
               }

               var6 = null;
            }
         }

         return var6 != null ? var6 : null;
      }
   }

   public static int af(int var0, int var1, int var2) {
      try {
         int var3;
         for(var3 = 1; var1 > 1; var1 >>= 1) {
            if (var2 >= -1229852866) {
               throw new IllegalStateException();
            }

            if ((var1 & 1) != 0) {
               if (var2 >= -1229852866) {
                  throw new IllegalStateException();
               }

               var3 *= var0;
            }

            var0 *= var0;
         }

         if (1 == var1) {
            if (var2 >= -1229852866) {
               throw new IllegalStateException();
            } else {
               return var3 * var0;
            }
         } else {
            return var3;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ch.af(" + ')');
      }
   }

   static ch ay(int var0, int var1) {
      ch var2 = (ch)af.af((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = ey.fj.cy(var3, 1709856093);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = ey.fj.cn(var4, (byte)-29);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = bz.ac(var5, (byte)1);
               if (var2 != null) {
                  af.aw(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   static ch ao(int var0, int var1) {
      ch var2 = (ch)af.af((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = ey.fj.cy(var3, 527870709);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = ey.fj.cn(var4, (byte)-10);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = bz.ac(var5, (byte)1);
               if (var2 != null) {
                  af.aw(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   static ch ax(byte[] var0) {
      ch var1 = new ch();
      sg var2 = new sg(var0);
      var2.at = -1516355947 * (var2.al.length - 2);
      int var3 = var2.cl(-1933172346);
      int var4 = var2.al.length - 2 - var3 - 12;
      var2.at = -1516355947 * var4;
      int var5 = var2.cx(-1026781034);
      var1.ab = var2.cl(-1020926575) * -140315817;
      var1.aq = var2.cl(-1183288665) * -1816416047;
      var1.al = var2.cl(-2106316872) * -603637105;
      var1.at = var2.cl(227086029) * -751032223;
      int var6 = var2.cm((byte)7);
      int var7;
      int var8;
      if (var6 > 0) {
         var1.aa = var1.au(var6, 2033492127);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.cl(-1127780228);
            ro var9 = new ro(var8 > 0 ? co.ab(var8, 1496826272) : 1);
            var1.aa[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.cx(-2016324961);
               int var11 = var2.cx(-1040808599);
               var9.an(new rt(var11), (long)var10);
            }
         }
      }

      var2.at = 0;
      var1.an = var2.cz((byte)15);
      var1.aw = new int[var5];
      var1.ac = new int[var5];
      var1.au = new String[var5];

      for(var7 = 0; -1633313603 * var2.at < var4; var1.aw[var7++] = var8) {
         var8 = var2.cl(192156296);
         if (var8 == 3) {
            var1.au[var7] = var2.cw((byte)0);
         } else if (var8 < 100 && var8 != 21 && var8 != 38 && 39 != var8) {
            var1.ac[var7] = var2.cx(-1112135350);
         } else {
            var1.ac[var7] = var2.cm((byte)7);
         }
      }

      return var1;
   }

   ro[] ai(int var1) {
      return new ro[var1];
   }

   ch() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ch.<init>(" + ')');
      }
   }
}
