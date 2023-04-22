public class gq {
   public int al;
   public String ac;
   public float[] au;
   // $FF: synthetic field
   final gy this$0;
   public int ab;
   public int aq;
   static Rasterizer3D[] kb;

   static void nk_renamed() {
      if (986256295 * Client.lv == 1) {
         Client.ln = true;
      }

   }

   public static int af_renamed(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 <= 127) {
            ++var3;
         } else if (var5 <= 2047) {
            var3 += 2;
         } else {
            var3 += 3;
         }
      }

      return var3;
   }

   public static boolean aw(long var0) {
      boolean var2 = 0L != var0;
      if (var2) {
         boolean var3 = 1 == (int)(var0 >>> 16 & 1L);
         var2 = !var3;
      }

      return var2;
   }

   public static void ax_renamed() {
      hs.ac.clear();
      hs.au.clear();
   }

   gq(gy var1) {
      this.this$0 = var1;
      this.au = new float[4];
      this.ab = -663309687;
      this.aq = 1437150123;
      this.al = 0;
   }
}
