import java.util.Comparator;

class pg implements Comparator {
   static int ab;
   // $FF: synthetic field
   final pk this$0;

   pg(pk var1) {
      this.this$0 = var1;
   }

   int af(pj var1, pj var2) {
      if (3457501928509627443L * var1.aw > 3457501928509627443L * var2.aw) {
         return 1;
      } else {
         return 3457501928509627443L * var1.aw < 3457501928509627443L * var2.aw ? -1 : 0;
      }
   }

   public static String af_renamed(CharSequence var0) {
      int var2 = var0.length();
      StringBuilder var3 = new StringBuilder(var2);

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && '.' != var5 && var5 != '-' && '*' != var5 && '_' != var5) {
            if (' ' == var5) {
               var3.append('+');
            } else {
               byte var6 = dn.charToByteCp1252(var5);
               var3.append('%');
               int var7 = var6 >> 4 & 15;
               if (var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(48 + var7));
               }

               var7 = var6 & 15;
               if (var7 >= 10) {
                  var3.append((char)(55 + var7));
               } else {
                  var3.append((char)(var7 + 48));
               }
            }
         } else {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   public int compare(Object var1, Object var2) {
      return this.af((pj)var1, (pj)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
