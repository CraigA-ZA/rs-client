import java.util.Comparator;

final class np implements Comparator {
   int af(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.an * -2107275097961185091L < -2107275097961185091L * var2.an ? -1 : (-2107275097961185091L * var1.an == -2107275097961185091L * var2.an ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.af((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static NodeDeque jk_renamed() {
      return Client.clientScriptEvents;
   }
}
