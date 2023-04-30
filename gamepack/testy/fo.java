import java.util.Date;

public class fo extends fb {
   int aw;
   static final int ai = 14;
   // $FF: synthetic field
   final fa this$0;
   static int[] ar;
   int an;
   int ac;
   static final int ag = 12;
   int af;
   public static final int au = 64;
   static final int ry = 765;

   void au(sg var1) {
      this.af = var1.cl(372155256) * 2034222333;
      this.an = var1.cx(-1378526618) * 1848917875;
      this.aw = var1.cm((byte)7) * 108318663;
      this.ac = var1.cm((byte)7) * -152654653;
   }

   void af(sg var1, int var2) {
      try {
         this.af = var1.cl(515138995) * 2034222333;
         this.an = var1.cx(-1773523369) * 1848917875;
         this.aw = var1.cm((byte)7) * 108318663;
         this.ac = var1.cm((byte)7) * -152654653;
      } catch (RuntimeException var3) {
         throw db.an(var3, "fo.af(" + ')');
      }
   }

   fo(fa var1) {
      try {
         this.this$0 = var1;
         super();
         this.af = -2034222333;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fo.<init>(" + ')');
      }
   }

   void an(fj var1, int var2) {
      try {
         var1.ag(-830375851 * this.af, 605814203 * this.an, this.aw * -1826209289, this.ac * -1378851861, 789169188);
      } catch (RuntimeException var3) {
         throw db.an(var3, "fo.an(" + ')');
      }
   }

   void ac(sg var1) {
      this.af = var1.cl(232757768) * 173860180;
      this.an = var1.cx(-2050327401) * 1253456219;
      this.aw = var1.cm((byte)7) * 1716395598;
      this.ac = var1.cm((byte)7) * -681549185;
   }

   static void aw(int var0, String var1, String var2, String var3, short var4) {
      try {
         cp var5 = (cp)eo.af.get(var0);
         if (var5 == null) {
            var5 = new cp();
            eo.af.put(var0, var5);
         }

         cq var6 = var5.af(var0, var1, var2, var3, (short)-22035);
         eo.an.an(var6, (long)(var6.af * -1117255211));
         eo.aw.an(var6);
         client.qb = client.qu * -2073795047;
      } catch (RuntimeException var7) {
         throw db.an(var7, "fo.aw(" + ')');
      }
   }

   void aw(fj var1) {
      var1.ag(-1891641929 * this.af, 605814203 * this.an, this.aw * -1826209289, this.ac * -1378851861, 965511276);
   }

   public static String af(long var0) {
      try {
         ma.aw.setTime(new Date(var0));
         int var2 = ma.aw.get(7);
         int var3 = ma.aw.get(5);
         int var4 = ma.aw.get(2);
         int var5 = ma.aw.get(1);
         int var6 = ma.aw.get(11);
         int var7 = ma.aw.get(12);
         int var8 = ma.aw.get(13);
         return ma.an[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + ma.af[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
      } catch (RuntimeException var9) {
         throw db.an(var9, "fo.af(" + ')');
      }
   }
}
