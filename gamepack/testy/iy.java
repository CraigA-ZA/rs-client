import accessors.RSObjStack;

public final class iy implements RSObjStack {
   int an;
   int af;
   int aw;
   iv ac;
   iv au;
   iv ab;
   long aq;
   int al;
   static final int rc = 1;

   static final void ka(boolean var0, sq var1, int var2) {
      try {
         while(true) {
            byte var3 = 16;
            int var4 = 1 << var3;
            if (var1.ay(889658999 * client.in.al, 1751384746) < 12 + var3) {
               if (var2 == 1308778639) {
                  throw new IllegalStateException();
               }
            } else {
               int var5 = var1.at(var3, -608529648);
               if (var4 - 1 != var5) {
                  boolean var6 = false;
                  if (null == client.iu[var5]) {
                     if (var2 == 1308778639) {
                        throw new IllegalStateException();
                     }

                     client.iu[var5] = new df();
                     var6 = true;
                  }

                  df var7 = client.iu[var5];
                  client.iy[(client.iw += 1796101277) * 265474485 - 1] = var5;
                  var7.dg = client.ep * -1014023335;
                  int var10;
                  if (var0) {
                     if (var2 == 1308778639) {
                        throw new IllegalStateException();
                     }

                     var10 = var1.at(8, -2068665558);
                     if (var10 > 127) {
                        if (var2 == 1308778639) {
                           throw new IllegalStateException();
                        }

                        var10 -= 256;
                     }
                  } else {
                     var10 = var1.at(5, -525988797);
                     if (var10 > 15) {
                        if (var2 == 1308778639) {
                           throw new IllegalStateException();
                        }

                        var10 -= 32;
                     }
                  }

                  boolean var11 = var1.at(1, -1128801419) == 1;
                  if (var11) {
                     if (var2 == 1308778639) {
                        throw new IllegalStateException();
                     }

                     var1.at(32, -1208673230);
                  }

                  int var12 = var1.at(1, -234990129);
                  if (1 == var12) {
                     client.ih[(client.ig += 1487412345) * 606834121 - 1] = var5;
                  }

                  int var8 = var1.at(1, -1288246620);
                  var7.af = nm.an(var1.at(14, -41054214), (byte)15);
                  int var9;
                  if (var0) {
                     if (var2 == 1308778639) {
                        return;
                     }

                     var9 = var1.at(8, -589613457);
                     if (var9 > 127) {
                        if (var2 == 1308778639) {
                           throw new IllegalStateException();
                        }

                        var9 -= 256;
                     }
                  } else {
                     var9 = var1.at(5, -836060017);
                     if (var9 > 15) {
                        if (var2 == 1308778639) {
                           return;
                        }

                        var9 -= 32;
                     }
                  }

                  int var13 = client.nm[var1.at(3, -1154668937)];
                  if (var6) {
                     if (var2 == 1308778639) {
                        return;
                     }

                     var7.dd = (var7.bz = -1228309915 * var13) * 720096107;
                  }

                  fa.kg(var7, (byte)77);
                  if (var7.dx * 351748387 == 0) {
                     if (var2 == 1308778639) {
                        throw new IllegalStateException();
                     }

                     var7.bz = 0;
                  }

                  int var10001 = var9 + lq.mi.dy[0];
                  int var10002 = var10 + lq.mi.ds[0];
                  boolean var10003;
                  if (1 == var8) {
                     if (var2 == 1308778639) {
                        throw new IllegalStateException();
                     }

                     var10003 = true;
                  } else {
                     var10003 = false;
                  }

                  var7.ay(var10001, var10002, var10003, -208577848);
                  continue;
               }
            }

            var1.aa((byte)-17);
            return;
         }
      } catch (RuntimeException var14) {
         throw db.an(var14, "iy.ka(" + ')');
      }
   }

   public static boolean au(int var0, int var1) {
      try {
         boolean var10000;
         if (var0 >= mc.aj.ad * -1344801027) {
            if (var1 >= -2084847753) {
               throw new IllegalStateException();
            }

            if (var0 <= mc.ak.ad * -1344801027) {
               if (var1 >= -2084847753) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "iy.au(" + ')');
      }
   }

   iy() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "iy.<init>(" + ')');
      }
   }
}
