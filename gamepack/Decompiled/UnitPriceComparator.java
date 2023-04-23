import java.util.Comparator;

final class UnitPriceComparator implements Comparator {
   static Archive fu;

   public static int af_renamed(int var0) {
      return 0 != var0 && var0 != 1 ? -1 : 0;
   }

   int af(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.unitPrice * -1994102707 < var2.grandExchangeOffer.unitPrice * -1994102707 ? -1 : (var2.grandExchangeOffer.unitPrice * -1994102707 == var1.grandExchangeOffer.unitPrice * -1994102707 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.af((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
