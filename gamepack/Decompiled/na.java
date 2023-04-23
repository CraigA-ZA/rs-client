import java.util.Comparator;

final class na implements Comparator {
   static Thread au;

   int af(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.af().compareTo(var2.af());
   }

   public int compare(Object var1, Object var2) {
      return this.af((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static int iv_renamed() {
      return Client.ro ? 2 : 1;
   }
}
