import java.util.Comparator;

public class cf implements Comparator {
   boolean af;

   cf() {
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   int af(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      if (-39392873 * var1.world == -39392873 * var2.world) {
         return 0;
      } else {
         if (this.af) {
            if (-453810525 * Client.bw == var1.world * -39392873) {
               return -1;
            }

            if (Client.bw * -453810525 == var2.world * -39392873) {
               return 1;
            }
         }

         return -39392873 * var1.world < -39392873 * var2.world ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.af((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   static final void ai_renamed() {
      hn.at_renamed(Strings.hm);
   }

   static void ox_renamed(boolean var0) {
      Client.nb = var0;
   }

   static boolean an_renamed(String var0, int var1) {
      return ia.aw_renamed(var0, var1, "openjs");
   }

   static int af_renamed(AbstractArchive var0) {
      int var2 = cz.dd.length + cz.dq.length;
      String[] var3 = cz.dj;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         if (var0.getGroupId(var5) != -1) {
            ++var2;
         }
      }

      return var2;
   }
}
