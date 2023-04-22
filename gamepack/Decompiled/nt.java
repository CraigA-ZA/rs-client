import java.util.Comparator;

final class nt implements Comparator {
   static Archive archive11;

   int af(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.currentPrice * -1994102707 < var2.grandExchangeOffer.currentPrice * -1994102707 ? -1 : (var2.grandExchangeOffer.currentPrice * -1994102707 == var1.grandExchangeOffer.currentPrice * -1994102707 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.af((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public static int af_renamed(int var0) {
      return 0 != var0 && var0 != 1 ? -1 : 0;
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
