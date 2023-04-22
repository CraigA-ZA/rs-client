public class gi {
   public float[] an;
   // $FF: synthetic field
   final gy this$0;
   public UrlRequest af;

   gi(gy var1) {
      this.this$0 = var1;
      this.an = new float[4];
   }

   static long af_renamed(CharSequence var0) {
      long var2 = 0L;
      int var4 = var0.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 *= 37L;
         char var6 = var0.charAt(var5);
         if (var6 >= 'A' && var6 <= 'Z') {
            var2 += (long)(1 + var6 - 65);
         } else if (var6 >= 'a' && var6 <= 'z') {
            var2 += (long)(1 + var6 - 97);
         } else if (var6 >= '0' && var6 <= '9') {
            var2 += (long)(var6 + 27 - 48);
         }

         if (var2 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var2 % 37L && 0L != var2) {
         var2 /= 37L;
      }

      return var2;
   }
}
