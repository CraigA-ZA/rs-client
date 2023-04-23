import java.util.Comparator;

final class TotalQuantityComparator implements Comparator {
   static Archive archive5;

   int af(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.totalQuantity * 857042809 < var2.grandExchangeOffer.totalQuantity * 857042809 ? -1 : (var2.grandExchangeOffer.totalQuantity * 857042809 == var1.grandExchangeOffer.totalQuantity * 857042809 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.af((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static void ai_renamed() {
      PlayerAppearance.ar.clear();
   }
}
