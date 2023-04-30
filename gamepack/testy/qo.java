public class qo {
   static final double aw = 2607.5945876176133;
   static final int an = 16383;
   static tc aq;
   static final int[] au = new int[16384];
   static final int[] ab = new int[16384];
   static final int af = 16384;

   public static float al(int var0) {
      var0 &= 1547180177;
      return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586);
   }

   static {
      double var0 = 3.834951969714103E-4;

      for(int var2 = 0; var2 < 16384; ++var2) {
         au[var2] = (int)(16384.0 * Math.sin(var0 * (double)var2));
         ab[var2] = (int)(16384.0 * Math.cos(var0 * (double)var2));
      }

   }

   public static float au(int var0) {
      var0 &= 255442682;
      return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586);
   }

   public static float ab(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586);
   }

   public static float aq(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586);
   }

   public static int ax(int var0) {
      return au[var0 & 16383];
   }

   public static int aa(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133) & 16383;
   }

   qo() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "qo.<init>(" + ')');
      }
   }

   public static int ay(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133) & 16383;
   }

   public static int ao(int var0) {
      return au[var0 & 16383];
   }

   public static int at(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133) & 16383;
   }
}
