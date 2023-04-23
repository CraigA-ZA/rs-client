import java.util.Comparator;

final class WorldComparator implements Comparator {
   int af(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.world * -39392873 < var2.world * -39392873 ? -1 : (var2.world * -39392873 == -39392873 * var1.world ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.af((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
