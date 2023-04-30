public class tx {
   static int aw;
   static int an;
   public static int[] ac;
   static int af;
   public static final int ae = 7;
   public static final int au = 1401;

   tx() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "tx.<init>(" + ')');
      }
   }

   public static tc[] ao(nm var0, int var1, int var2) {
      byte[] var4 = var0.bh(var1, var2, (byte)-33);
      boolean var3;
      if (null == var4) {
         var3 = false;
      } else {
         sb.aa(var4, 1145263442);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         tc[] var5 = new tc[1130473623 * af];

         for(int var6 = 0; var6 < 1606065339 * af; ++var6) {
            tc var7 = var5[var6] = new tc();
            var7.aq = an * 256530235;
            var7.al = 378525975 * aw;
            var7.au = ac[var6];
            var7.ab = ar.au[var6];
            var7.aw = dd.ab[var6];
            var7.ac = fd.aq[var6];
            var7.an = pc.al;
            var7.af = hg.at[var6];
         }

         pk.ay(-262861184);
         return var5;
      }
   }

   public static tq[] ag(nm var0, int var1, int var2) {
      byte[] var4 = var0.bh(var1, var2, (byte)-13);
      boolean var3;
      if (null == var4) {
         var3 = false;
      } else {
         sb.aa(var4, 1145263442);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         tq[] var5 = new tq[af * 1606065339];

         for(int var6 = 0; var6 < 1606065339 * af; ++var6) {
            tq var7 = var5[var6] = new tq();
            var7.ab = 346207900 * an;
            var7.aq = aw * 1998537177;
            var7.ac = ac[var6];
            var7.au = ar.au[var6];
            var7.an = dd.ab[var6];
            var7.aw = fd.aq[var6];
            int var8 = var7.aw * var7.an;
            byte[] var9 = hg.at[var6];
            var7.af = new int[var8];

            for(int var10 = 0; var10 < var8; ++var10) {
               var7.af[var10] = pc.al[var9[var10] & -1757096995];
            }
         }

         pk.ay(-262861184);
         return var5;
      }
   }

   public static tq[] ai(nm var0, int var1, int var2) {
      byte[] var4 = var0.bh(var1, var2, (byte)-3);
      boolean var3;
      if (null == var4) {
         var3 = false;
      } else {
         sb.aa(var4, 1145263442);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         tq[] var5 = new tq[af * 1606065339];

         for(int var6 = 0; var6 < 1606065339 * af; ++var6) {
            tq var7 = var5[var6] = new tq();
            var7.ab = -822007097 * an;
            var7.aq = aw * 378525975;
            var7.ac = ac[var6];
            var7.au = ar.au[var6];
            var7.an = dd.ab[var6];
            var7.aw = fd.aq[var6];
            int var8 = var7.aw * var7.an;
            byte[] var9 = hg.at[var6];
            var7.af = new int[var8];

            for(int var10 = 0; var10 < var8; ++var10) {
               var7.af[var10] = pc.al[var9[var10] & 255];
            }
         }

         pk.ay(-262861184);
         return var5;
      }
   }

   public static void be(byte[] var0) {
      sg var1 = new sg(var0);
      var1.at = -920932353 * (var0.length - 2);
      af = var1.cl(-1285221263) * 1532315763;
      ac = new int[af * 1743286332];
      ar.au = new int[-306999367 * af];
      dd.ab = new int[af * -1835027695];
      fd.aq = new int[-1961434515 * af];
      hg.at = new byte[af * 918342705][];
      var1.at = (var0.length - 7 - af * -36379176) * -876925196;
      an = var1.cl(-1627243529) * 818420777;
      aw = var1.cl(848555483) * -2145718617;
      int var2 = (var1.cm((byte)7) & 1234136616) + 1;

      int var3;
      for(var3 = 0; var3 < af * -333948870; ++var3) {
         ac[var3] = var1.cl(-435436153);
      }

      for(var3 = 0; var3 < af * 1606065339; ++var3) {
         ar.au[var3] = var1.cl(-1378716815);
      }

      for(var3 = 0; var3 < af * 1606065339; ++var3) {
         dd.ab[var3] = var1.cl(-1208367834);
      }

      for(var3 = 0; var3 < af * -1700153408; ++var3) {
         fd.aq[var3] = var1.cl(-45065543);
      }

      var1.at = 2062070105 * (var0.length - 7 - af * -36379176 - 3 * (var2 - 1));
      pc.al = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         pc.al[var3] = var1.cr(1223551411);
         if (pc.al[var3] == 0) {
            pc.al[var3] = 1;
         }
      }

      var1.at = 0;

      for(var3 = 0; var3 < 1606065339 * af; ++var3) {
         int var4 = dd.ab[var3];
         int var5 = fd.aq[var3];
         int var6 = var5 * var4;
         byte[] var7 = new byte[var6];
         hg.at[var3] = var7;
         int var8 = var1.cm((byte)7);
         int var9;
         if (0 == var8) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.cf(435772489);
            }
         } else if (1 == var8) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var10 * var4 + var9] = var1.cf(435772489);
               }
            }
         }
      }

   }

   public static tq[] ah(nm var0, int var1, int var2) {
      byte[] var4 = var0.bh(var1, var2, (byte)-123);
      boolean var3;
      if (null == var4) {
         var3 = false;
      } else {
         sb.aa(var4, 1145263442);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         tq[] var5 = new tq[af * 1606065339];

         for(int var6 = 0; var6 < 1606065339 * af; ++var6) {
            tq var7 = var5[var6] = new tq();
            var7.ab = -822007097 * an;
            var7.aq = aw * 378525975;
            var7.ac = ac[var6];
            var7.au = ar.au[var6];
            var7.an = dd.ab[var6];
            var7.aw = fd.aq[var6];
            int var8 = var7.aw * var7.an;
            byte[] var9 = hg.at[var6];
            var7.af = new int[var8];

            for(int var10 = 0; var10 < var8; ++var10) {
               var7.af[var10] = pc.al[var9[var10] & 255];
            }
         }

         pk.ay(-262861184);
         return var5;
      }
   }

   public static tq av(nm var0, int var1, int var2) {
      byte[] var4 = var0.bh(var1, var2, (byte)-21);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         sb.aa(var4, 1145263442);
         var3 = true;
      }

      return !var3 ? null : gx.at(-1700779426);
   }

   public static tq ar(nm var0, int var1, int var2) {
      byte[] var4 = var0.bh(var1, var2, (byte)-11);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         sb.aa(var4, 1145263442);
         var3 = true;
      }

      return !var3 ? null : gx.at(-913042857);
   }

   public static tq am(nm var0, int var1, int var2) {
      byte[] var4 = var0.bh(var1, var2, (byte)-28);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         sb.aa(var4, 1145263442);
         var3 = true;
      }

      return !var3 ? null : gx.at(-1957212481);
   }

   public static tc[] as(nm var0, String var1, String var2) {
      if (!var0.cv(var1, var2, -1313069490)) {
         return null;
      } else {
         int var3 = var0.cy(var1, 291056895);
         int var4 = var0.cx(var3, var2, (short)8192);
         return cv.af(var0, var3, var4, 1564128874);
      }
   }

   public static tc[] aj(nm var0, String var1, String var2) {
      if (!var0.cv(var1, var2, -1313069490)) {
         return null;
      } else {
         int var3 = var0.cy(var1, -481618733);
         int var4 = var0.cx(var3, var2, (short)8192);
         return cv.af(var0, var3, var4, -1480719353);
      }
   }

   public static tc[] ax(nm var0, int var1, int var2) {
      byte[] var4 = var0.bh(var1, var2, (byte)-80);
      boolean var3;
      if (null == var4) {
         var3 = false;
      } else {
         sb.aa(var4, 1145263442);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         tc[] var5 = new tc[1606065339 * af];

         for(int var6 = 0; var6 < 1606065339 * af; ++var6) {
            tc var7 = var5[var6] = new tc();
            var7.aq = an * -822007097;
            var7.al = 378525975 * aw;
            var7.au = ac[var6];
            var7.ab = ar.au[var6];
            var7.aw = dd.ab[var6];
            var7.ac = fd.aq[var6];
            var7.an = pc.al;
            var7.af = hg.at[var6];
         }

         pk.ay(-262861184);
         return var5;
      }
   }

   public static on az(nm var0, nm var1, String var2, String var3) {
      if (!var0.cv(var2, var3, -1313069490)) {
         return null;
      } else {
         int var4 = var0.cy(var2, 767438565);
         int var5 = var0.cx(var4, var3, (short)8192);
         byte[] var8 = var0.bh(var4, var5, (byte)-33);
         boolean var7;
         if (null == var8) {
            var7 = false;
         } else {
            sb.aa(var8, 1145263442);
            var7 = true;
         }

         on var6;
         if (!var7) {
            var6 = null;
         } else {
            byte[] var9 = var1.bh(var4, var5, (byte)-72);
            on var11;
            if (null == var9) {
               var11 = null;
            } else {
               on var10 = new on(var9, ac, ar.au, dd.ab, fd.aq, pc.al, hg.at);
               pk.ay(-262861184);
               var11 = var10;
            }

            var6 = var11;
         }

         return var6;
      }
   }

   public static on ad(nm var0, nm var1, String var2, String var3) {
      if (!var0.cv(var2, var3, -1313069490)) {
         return null;
      } else {
         int var4 = var0.cy(var2, -1272576155);
         int var5 = var0.cx(var4, var3, (short)8192);
         byte[] var8 = var0.bh(var4, var5, (byte)-7);
         boolean var7;
         if (null == var8) {
            var7 = false;
         } else {
            sb.aa(var8, 1145263442);
            var7 = true;
         }

         on var6;
         if (!var7) {
            var6 = null;
         } else {
            byte[] var9 = var1.bh(var4, var5, (byte)-59);
            on var11;
            if (null == var9) {
               var11 = null;
            } else {
               on var10 = new on(var9, ac, ar.au, dd.ab, fd.aq, pc.al, hg.at);
               pk.ay(-262861184);
               var11 = var10;
            }

            var6 = var11;
         }

         return var6;
      }
   }

   public static tc ae(nm var0, int var1) {
      byte[] var3 = var0.cn(var1, (byte)-20);
      boolean var2;
      if (var3 == null) {
         var2 = false;
      } else {
         sb.aa(var3, 1145263442);
         var2 = true;
      }

      return !var2 ? null : mk.al((byte)1);
   }

   public static tc ap(nm var0, int var1) {
      byte[] var3 = var0.cn(var1, (byte)-19);
      boolean var2;
      if (var3 == null) {
         var2 = false;
      } else {
         sb.aa(var3, 1145263442);
         var2 = true;
      }

      return !var2 ? null : mk.al((byte)1);
   }

   static tq by() {
      tq var0 = new tq();
      var0.ab = -822007097 * an;
      var0.aq = aw * 378525975;
      var0.ac = ac[0];
      var0.au = ar.au[0];
      var0.an = dd.ab[0];
      var0.aw = fd.aq[0];
      int var1 = var0.aw * var0.an;
      byte[] var2 = hg.at[0];
      var0.af = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var0.af[var3] = pc.al[var2[var3] & 255];
      }

      pk.ay(-262861184);
      return var0;
   }

   static tq bb() {
      tq var0 = new tq();
      var0.ab = -822007097 * an;
      var0.aq = aw * 378525975;
      var0.ac = ac[0];
      var0.au = ar.au[0];
      var0.an = dd.ab[0];
      var0.aw = fd.aq[0];
      int var1 = var0.aw * var0.an;
      byte[] var2 = hg.at[0];
      var0.af = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var0.af[var3] = pc.al[var2[var3] & 255];
      }

      pk.ay(-262861184);
      return var0;
   }

   public static tc[] ak(nm var0, String var1, String var2) {
      if (!var0.cv(var1, var2, -1313069490)) {
         return null;
      } else {
         int var3 = var0.cy(var1, 441810620);
         int var4 = var0.cx(var3, var2, (short)8192);
         return cv.af(var0, var3, var4, -492123611);
      }
   }

   public static void bi(byte[] var0) {
      sg var1 = new sg(var0);
      var1.at = -1516355947 * (var0.length - 2);
      af = var1.cl(-617400810) * 1532315763;
      ac = new int[af * 1606065339];
      ar.au = new int[1606065339 * af];
      dd.ab = new int[af * 1606065339];
      fd.aq = new int[1606065339 * af];
      hg.at = new byte[af * 1606065339][];
      var1.at = (var0.length - 7 - af * -36379176) * -1516355947;
      an = var1.cl(796221604) * -90671369;
      aw = var1.cl(582531455) * -2145718617;
      int var2 = (var1.cm((byte)7) & 255) + 1;

      int var3;
      for(var3 = 0; var3 < af * 1606065339; ++var3) {
         ac[var3] = var1.cl(-107188618);
      }

      for(var3 = 0; var3 < af * 1606065339; ++var3) {
         ar.au[var3] = var1.cl(588189910);
      }

      for(var3 = 0; var3 < af * 1606065339; ++var3) {
         dd.ab[var3] = var1.cl(566885448);
      }

      for(var3 = 0; var3 < af * 1606065339; ++var3) {
         fd.aq[var3] = var1.cl(406615323);
      }

      var1.at = -1516355947 * (var0.length - 7 - af * -36379176 - 3 * (var2 - 1));
      pc.al = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         pc.al[var3] = var1.cr(-347564250);
         if (pc.al[var3] == 0) {
            pc.al[var3] = 1;
         }
      }

      var1.at = 0;

      for(var3 = 0; var3 < 1606065339 * af; ++var3) {
         int var4 = dd.ab[var3];
         int var5 = fd.aq[var3];
         int var6 = var5 * var4;
         byte[] var7 = new byte[var6];
         hg.at[var3] = var7;
         int var8 = var1.cm((byte)7);
         int var9;
         if (0 == var8) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.cf(435772489);
            }
         } else if (1 == var8) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var10 * var4 + var9] = var1.cf(435772489);
               }
            }
         }
      }

   }

   public static void bk() {
      ac = null;
      ar.au = null;
      dd.ab = null;
      fd.aq = null;
      pc.al = null;
      hg.at = (byte[][])null;
   }

   public static void bx() {
      ac = null;
      ar.au = null;
      dd.ab = null;
      fd.aq = null;
      pc.al = null;
      hg.at = (byte[][])null;
   }
}
