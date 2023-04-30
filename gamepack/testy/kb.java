public class kb {
   static final kb af = new kb(0);
   static final kb an = new kb(1);
   final int aw;
   static final int ab = 3;
   static final int ae = 27;
   public static final int cr = 87;
   static qk wh;

   kb(int var1) {
      try {
         super();
         this.aw = -576222849 * var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "kb.<init>(" + ')');
      }
   }

   static boolean au(sq var0, int var1, int var2) {
      try {
         int var3 = var0.at(2, -1776668599);
         int var4;
         int var5;
         int var8;
         int var9;
         int var10;
         int var11;
         if (0 == var3) {
            if (var2 == -869866431) {
               throw new IllegalStateException();
            } else {
               if (var0.at(1, 85325946) != 0) {
                  if (var2 == -869866431) {
                     throw new IllegalStateException();
                  }

                  au(var0, var1, 480153681);
               }

               var4 = var0.at(13, -1195878756);
               var5 = var0.at(13, -1817426607);
               boolean var10000;
               if (var0.at(1, 54877744) == 1) {
                  if (var2 == -869866431) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var13 = var10000;
               if (var13) {
                  if (var2 == -869866431) {
                     throw new IllegalStateException();
                  }

                  ds.ai[(ds.ax += 1362331411) * 1474255643 - 1] = var1;
               }

               if (null != client.mc[var1]) {
                  if (var2 == -869866431) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException();
                  }
               } else {
                  dv var14 = client.mc[var1] = new dv();
                  var14.ae = var1 * -710946309;
                  if (ds.au[var1] != null) {
                     var14.af(ds.au[var1], 403299594);
                  }

                  var14.dd = 385564471 * ds.ay[var1];
                  var14.cr = ds.ao[var1] * 1052277865;
                  var8 = ds.aa[var1];
                  var9 = var8 >> 28;
                  var10 = var8 >> 14 & 255;
                  var11 = var8 & 255;
                  var14.da[0] = ds.ac[var1];
                  var14.ad = -1829675965 * (byte)var9;
                  var14.ar(var4 + (var10 << 13) - jm.ib * -1232093375, var5 + (var11 << 13) - 827352769 * jj.jc, -1736496502);
                  var14.bi = false;
                  return true;
               }
            }
         } else if (var3 == 1) {
            if (var2 == -869866431) {
               throw new IllegalStateException();
            } else {
               var4 = var0.at(2, -1417372014);
               var5 = ds.aa[var1];
               ds.aa[var1] = ((var4 + (var5 >> 28) & 3) << 28) + (var5 & 268435455);
               return false;
            }
         } else {
            int var6;
            int var7;
            if (2 == var3) {
               var4 = var0.at(5, -1644483628);
               var5 = var4 >> 3;
               var6 = var4 & 7;
               var7 = ds.aa[var1];
               var8 = var5 + (var7 >> 28) & 3;
               var9 = var7 >> 14 & 255;
               var10 = var7 & 255;
               if (0 == var6) {
                  --var9;
                  --var10;
               }

               if (1 == var6) {
                  if (var2 == -869866431) {
                     throw new IllegalStateException();
                  }

                  --var10;
               }

               if (var6 == 2) {
                  if (var2 == -869866431) {
                     throw new IllegalStateException();
                  }

                  ++var9;
                  --var10;
               }

               if (3 == var6) {
                  if (var2 == -869866431) {
                     throw new IllegalStateException();
                  }

                  --var9;
               }

               if (var6 == 4) {
                  if (var2 == -869866431) {
                     throw new IllegalStateException();
                  }

                  ++var9;
               }

               if (5 == var6) {
                  if (var2 == -869866431) {
                     throw new IllegalStateException();
                  }

                  --var9;
                  ++var10;
               }

               if (6 == var6) {
                  if (var2 == -869866431) {
                     throw new IllegalStateException();
                  }

                  ++var10;
               }

               if (7 == var6) {
                  ++var9;
                  ++var10;
               }

               ds.aa[var1] = (var9 << 14) + (var8 << 28) + var10;
               return false;
            } else {
               var4 = var0.at(18, -1484294885);
               var5 = var4 >> 16;
               var6 = var4 >> 8 & 255;
               var7 = var4 & 255;
               var8 = ds.aa[var1];
               var9 = var5 + (var8 >> 28) & 3;
               var10 = (var8 >> 14) + var6 & 255;
               var11 = var7 + var8 & 255;
               ds.aa[var1] = var11 + (var10 << 14) + (var9 << 28);
               return false;
            }
         }
      } catch (RuntimeException var12) {
         throw db.an(var12, "kb.au(" + ')');
      }
   }

   static io ai(int var0, int var1) {
      try {
         io var2 = (io)ha.at.af((long)var0);
         if (var2 != null) {
            return var2;
         } else {
            var2 = dg.af(ha.ab, ha.aq, var0, false, -264326412);
            if (var2 != null) {
               if (var1 == 236330078) {
                  throw new IllegalStateException();
               }

               ha.at.aw(var2, (long)var0);
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "kb.ai(" + ')');
      }
   }
}
