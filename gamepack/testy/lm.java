public class lm {
   public static final lm ay = new lm(11);
   public static final lm an = new lm(14);
   static final int ah = 18;
   public static final lm ac = new lm(4);
   public static final lm au = new lm(16);
   public static final lm aw = new lm(6);
   public static final lm ab = new lm(5);
   public static final lm al = new lm(4);
   public static final lm at = new lm(7);
   public static final lm aa = new lm(14);
   public static final lm af = new lm(2);
   public static final int ex = 8;
   public static final lm aq = new lm(5);

   static void mv(int var0, byte var1) {
      try {
         nx.ot = new cb();
         nx.ot.af = 116605911 * client.nk[var0];
         nx.ot.an = client.ni[var0] * 1112086437;
         nx.ot.aw = client.nh[var0] * -1623394963;
         nx.ot.ac = client.nq[var0] * -1353871487;
         nx.ot.au = 355643405 * client.oi[var0];
         nx.ot.ab = client.og[var0];
         nx.ot.aq = client.ok[var0];
      } catch (RuntimeException var2) {
         throw db.an(var2, "lm.mv(" + ')');
      }
   }

   public static lm[] ab() {
      return new lm[]{af, an, aw, ac, au, ab, aq, al, at, aa, ay};
   }

   public static lm[] an() {
      return new lm[]{af, an, aw, ac, au, ab, aq, al, at, aa, ay};
   }

   public static lm[] aw() {
      return new lm[]{af, an, aw, ac, au, ab, aq, al, at, aa, ay};
   }

   public static lm[] ac() {
      return new lm[]{af, an, aw, ac, au, ab, aq, al, at, aa, ay};
   }

   public static lm[] au() {
      return new lm[]{af, an, aw, ac, au, ab, aq, al, at, aa, ay};
   }

   lm(int var1) {
      try {
         super();
      } catch (RuntimeException var2) {
         throw db.an(var2, "lm.<init>(" + ')');
      }
   }

   static final void mj(int var0, int var1) {
      try {
         if (!bq.ac(var0, 1376777516)) {
            if (var1 <= 923211175) {
               throw new IllegalStateException();
            }
         } else {
            mq[] var2 = hn.ap[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               if (var1 <= 923211175) {
                  throw new IllegalStateException();
               }

               mq var4 = var2[var3];
               if (var4 == null) {
                  if (var1 <= 923211175) {
                     throw new IllegalStateException();
                  }
               } else {
                  var4.gx = 0;
                  var4.gl = 0;
               }
            }

         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "lm.mj(" + ')');
      }
   }

   static void hk(ha var0, int var1, int var2, int var3, int var4) {
      try {
         if (-297150195 * client.tl < 50) {
            if (var4 != -1566363123) {
               throw new IllegalStateException();
            }

            if (aj.vb.az(-1676290123) != 0) {
               if (null != var0.ar) {
                  if (var1 < var0.ar.length) {
                     ge.hp(var0.ar[var1], var2, var3, 1719542324);
                     return;
                  }

                  if (var4 != -1566363123) {
                     throw new IllegalStateException();
                  }
               }

               return;
            }

            if (var4 != -1566363123) {
               return;
            }
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "lm.hk(" + ')');
      }
   }
}
