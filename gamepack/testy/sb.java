public class sb {
   static final int aw = 2;

   sb() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "sb.<init>(" + ')');
      }
   }

   public static void ac(String[] var0, short[] var1) {
      lo.an(var0, var1, 0, var0.length - 1, 1826563573);
   }

   public static void au(String[] var0, short[] var1) {
      lo.an(var0, var1, 0, var0.length - 1, 1826563573);
   }

   static void ab(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         lo.an(var0, var1, var2, var5 - 1, 1826563573);
         lo.an(var0, var1, var5 + 1, var3, 1826563573);
      }

   }

   public static void al(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (null == var6 || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         fd.aw(var0, var1, var2, var5 - 1, (byte)1);
         fd.aw(var0, var1, 1 + var5, var3, (byte)1);
      }

   }

   static void aq(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         lo.an(var0, var1, var2, var5 - 1, 1826563573);
         lo.an(var0, var1, var5 + 1, var3, 1826563573);
      }

   }

   public static void at(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (null == var6 || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         fd.aw(var0, var1, var2, var5 - 1, (byte)1);
         fd.aw(var0, var1, 1 + var5, var3, (byte)1);
      }

   }

   public static void aa(byte[] var0, int var1) {
      try {
         sg var2 = new sg(var0);
         var2.at = -1516355947 * (var0.length - 2);
         tx.af = var2.cl(-1668232779) * 1532315763;
         tx.ac = new int[tx.af * 1606065339];
         ar.au = new int[1606065339 * tx.af];
         dd.ab = new int[tx.af * 1606065339];
         fd.aq = new int[1606065339 * tx.af];
         hg.at = new byte[tx.af * 1606065339][];
         var2.at = (var0.length - 7 - tx.af * -36379176) * -1516355947;
         tx.an = var2.cl(-832215386) * -90671369;
         aw = var2.cl(-1341953023) * -2145718617;
         int var3 = (var2.cm((byte)7) & 255) + 1;

         int var4;
         for(var4 = 0; var4 < tx.af * 1606065339; ++var4) {
            if (var1 != 1145263442) {
               throw new IllegalStateException();
            }

            tx.ac[var4] = var2.cl(549992582);
         }

         for(var4 = 0; var4 < tx.af * 1606065339; ++var4) {
            if (var1 != 1145263442) {
               return;
            }

            ar.au[var4] = var2.cl(-1575421326);
         }

         for(var4 = 0; var4 < tx.af * 1606065339; ++var4) {
            if (var1 != 1145263442) {
               return;
            }

            dd.ab[var4] = var2.cl(168263311);
         }

         for(var4 = 0; var4 < tx.af * 1606065339; ++var4) {
            if (var1 != 1145263442) {
               throw new IllegalStateException();
            }

            fd.aq[var4] = var2.cl(783872037);
         }

         var2.at = -1516355947 * (var0.length - 7 - tx.af * -36379176 - 3 * (var3 - 1));
         pc.al = new int[var3];

         for(var4 = 1; var4 < var3; ++var4) {
            if (var1 != 1145263442) {
               throw new IllegalStateException();
            }

            pc.al[var4] = var2.cr(786806433);
            if (pc.al[var4] == 0) {
               if (var1 != 1145263442) {
                  return;
               }

               pc.al[var4] = 1;
            }
         }

         var2.at = 0;

         for(var4 = 0; var4 < 1606065339 * tx.af; ++var4) {
            if (var1 != 1145263442) {
               throw new IllegalStateException();
            }

            int var5 = dd.ab[var4];
            int var6 = fd.aq[var4];
            int var7 = var6 * var5;
            byte[] var8 = new byte[var7];
            hg.at[var4] = var8;
            int var9 = var2.cm((byte)7);
            int var10;
            if (0 == var9) {
               if (var1 != 1145263442) {
                  throw new IllegalStateException();
               }

               for(var10 = 0; var10 < var7; ++var10) {
                  if (var1 != 1145263442) {
                     return;
                  }

                  var8[var10] = var2.cf(435772489);
               }
            } else if (1 == var9) {
               if (var1 != 1145263442) {
                  return;
               }

               for(var10 = 0; var10 < var5; ++var10) {
                  if (var1 != 1145263442) {
                     throw new IllegalStateException();
                  }

                  for(int var11 = 0; var11 < var6; ++var11) {
                     if (var1 != 1145263442) {
                        throw new IllegalStateException();
                     }

                     var8[var11 * var5 + var10] = var2.cf(435772489);
                  }
               }
            }
         }

      } catch (RuntimeException var12) {
         throw db.an(var12, "sb.aa(" + ')');
      }
   }

   static final void nw(int var0, int var1, int var2, int var3, tq var4, ll var5, int var6) {
      try {
         int var7 = var3 * var3 + var2 * var2;
         if (var7 > 4225) {
            if (var6 != 1850494258) {
               throw new IllegalStateException();
            }

            if (var7 < 90000) {
               int var8 = client.kf * 704283033 & 2047;
               int var9 = in.ac[var8];
               int var10 = in.au[var8];
               int var11 = var2 * var10 + var9 * var3 >> 16;
               int var12 = var10 * var3 - var9 * var2 >> 16;
               double var13 = Math.atan2((double)var11, (double)var12);
               int var15 = var5.af * 1484188043 / 2 - 25;
               int var16 = (int)(Math.sin(var13) * (double)var15);
               int var17 = (int)(Math.cos(var13) * (double)var15);
               byte var18 = 20;
               dp.jz.bk(var5.af * 1484188043 / 2 + var0 - var18 / 2 + var16, var1 + 939947663 * var5.an / 2 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
               return;
            }
         }

         qc.ns(var0, var1, var2, var3, var4, var5, -1609285207);
      } catch (RuntimeException var19) {
         throw db.an(var19, "sb.nw(" + ')');
      }
   }
}
