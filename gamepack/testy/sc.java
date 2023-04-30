public class sc {
   static final int rn = 2;
   static final int aw = (int)(Math.pow(2.0, 4.0) - 1.0) * 1010976615;
   static final int ac = (int)(Math.pow(2.0, 8.0) - 1.0) * 998296027;
   static final int af = 4;
   static final String hn = "shield/oauth/token";

   public static int aa(int var0) {
      return (var0 & 265217111 * aw) - 1;
   }

   static Object[] ag(sg var0, int[] var1) {
      int var2 = var0.cd(-1142565996);
      Object[] var3 = new Object[var2 * var1.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var5 + var4 * var1.length;
            sh var7 = da.an(var1[var5], -1981678092);
            var3[var6] = var7.at(var0, -1183771146);
         }
      }

      return var3;
   }

   sc() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "sc.<init>(" + ')');
      }
   }

   public static int ab(int var0) {
      return var0 >>> 12;
   }

   public static int aq(int var0) {
      return var0 >>> 12;
   }

   public static int al(int var0) {
      return var0 >>> 12;
   }

   public static int at(int var0) {
      return var0 >>> 4 & 1885164930 * ac;
   }

   public static int ax(int var0) {
      return (var0 & 265217111 * aw) - 1;
   }

   public static int ay(int var0) {
      return (var0 & 844080606 * aw) - 1;
   }

   public static int ao(int var0) {
      return (var0 & 1211275346 * aw) - 1;
   }

   static Object[] ai(sg var0, int[] var1) {
      int var2 = var0.cd(-514047468);
      Object[] var3 = new Object[var2 * var1.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var5 + var4 * var1.length;
            sh var7 = da.an(var1[var5], -1116187866);
            var3[var6] = var7.at(var0, -1183771146);
         }
      }

      return var3;
   }

   public static int au(int var0) {
      return var0 >>> 12;
   }

   static Object[] ah(sg var0, int[] var1) {
      int var2 = var0.cd(-788186050);
      Object[] var3 = new Object[var2 * var1.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var5 + var4 * var1.length;
            sh var7 = da.an(var1[var5], 1998220821);
            var3[var6] = var7.at(var0, -1183771146);
         }
      }

      return var3;
   }

   public static tq aw(nm var0, int var1, int var2, int var3) {
      try {
         byte[] var5 = var0.bh(var1, var2, (byte)-67);
         boolean var4;
         if (var5 == null) {
            if (var3 == 959841720) {
               throw new IllegalStateException();
            }

            var4 = false;
         } else {
            sb.aa(var5, 1145263442);
            var4 = true;
         }

         if (!var4) {
            if (var3 == 959841720) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return gx.at(-1490841904);
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "sc.aw(" + ')');
      }
   }
}
