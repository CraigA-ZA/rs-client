public class fn extends fb {
   boolean an;
   int af;
   // $FF: synthetic field
   final fa this$0;
   static final int cx = 74;

   void af(sg var1, int var2) {
      try {
         this.af = var1.cl(-1543722563) * 209663463;
         boolean var10001;
         if (var1.cm((byte)7) == 1) {
            if (var2 == 1120136284) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.an = var10001;
      } catch (RuntimeException var3) {
         throw db.an(var3, "fn.af(" + ')');
      }
   }

   void an(fj var1, int var2) {
      try {
         var1.ai(562761175 * this.af, this.an, (short)-16552);
      } catch (RuntimeException var3) {
         throw db.an(var3, "fn.an(" + ')');
      }
   }

   public static int an(int var0, byte var1) {
      try {
         return la.af[var0];
      } catch (RuntimeException var2) {
         throw db.an(var2, "fn.an(" + ')');
      }
   }

   fn(fa var1) {
      try {
         this.this$0 = var1;
         super();
         this.af = -209663463;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fn.<init>(" + ')');
      }
   }

   void ac(sg var1) {
      this.af = var1.cl(-2141188649) * 209663463;
      this.an = var1.cm((byte)7) == 1;
   }

   void au(sg var1) {
      this.af = var1.cl(-1580473601) * 209663463;
      this.an = var1.cm((byte)7) == 1;
   }

   void aw(fj var1) {
      var1.ai(562761175 * this.af, this.an, (short)-22236);
   }
}
