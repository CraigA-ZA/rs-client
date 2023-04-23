public class el extends AbstractUserComparator {
   final boolean af;

   public el(boolean var1) {
      this.af = var1;
   }

   int af(Buddy var1, Buddy var2) {
      if (Client.bw * -453810525 == var1.au * 177258591 && var2.au * 177258591 == Client.bw * -453810525) {
         return this.af ? var1.username().compareTo0(var2.username()) : var2.username().compareTo0(var1.username());
      } else {
         return this.ao(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.af((Buddy)var1, (Buddy)var2);
   }

   static void af_renamed() {
      if (qh.an == null) {
         qh.an = new int[65536];
         double var1 = 0.949999988079071;

         for(int var3 = 0; var3 < 65536; ++var3) {
            double var4 = 0.0078125 + (double)(var3 >> 10 & 63) / 64.0;
            double var6 = (double)(var3 >> 7 & 7) / 8.0 + 0.0625;
            double var8 = (double)(var3 & 127) / 128.0;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0) {
               double var16;
               if (var8 < 0.5) {
                  var16 = var8 * (1.0 + var6);
               } else {
                  var16 = var6 + var8 - var6 * var8;
               }

               double var18 = var8 * 2.0 - var16;
               double var20 = 0.3333333333333333 + var4;
               if (var20 > 1.0) {
                  --var20;
               }

               double var24 = var4 - 0.3333333333333333;
               if (var24 < 0.0) {
                  ++var24;
               }

               if (6.0 * var20 < 1.0) {
                  var10 = var18 + var20 * 6.0 * (var16 - var18);
               } else if (var20 * 2.0 < 1.0) {
                  var10 = var16;
               } else if (3.0 * var20 < 2.0) {
                  var10 = var18 + 6.0 * (var16 - var18) * (0.6666666666666666 - var20);
               } else {
                  var10 = var18;
               }

               if (6.0 * var4 < 1.0) {
                  var12 = 6.0 * (var16 - var18) * var4 + var18;
               } else if (2.0 * var4 < 1.0) {
                  var12 = var16;
               } else if (3.0 * var4 < 2.0) {
                  var12 = (var16 - var18) * (0.6666666666666666 - var4) * 6.0 + var18;
               } else {
                  var12 = var18;
               }

               if (var24 * 6.0 < 1.0) {
                  var14 = var24 * 6.0 * (var16 - var18) + var18;
               } else if (var24 * 2.0 < 1.0) {
                  var14 = var16;
               } else if (3.0 * var24 < 2.0) {
                  var14 = 6.0 * (0.6666666666666666 - var24) * (var16 - var18) + var18;
               } else {
                  var14 = var18;
               }
            }

            var10 = Math.pow(var10, var1);
            var12 = Math.pow(var12, var1);
            var14 = Math.pow(var14, var1);
            int var26 = (int)(256.0 * var10);
            int var17 = (int)(var12 * 256.0);
            int var27 = (int)(var14 * 256.0);
            int var19 = (var26 << 16) + (var17 << 8) + var27;
            qh.an[var3] = var19 & 16777215;
         }

      }
   }

   static ec aq_renamed(int var0) {
      ec var2 = (ec)StructType.findEnumerated(em.au_renamed(), var0);
      if (null == var2) {
         var2 = ec.af;
      }

      return var2;
   }
}
