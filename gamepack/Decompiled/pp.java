import java.util.Comparator;
import java.util.Map;

class pp implements Comparator {
   // $FF: synthetic field
   final pc this$0;

   pp(pc var1) {
      this.this$0 = var1;
   }

   int af(Map.Entry var1, Map.Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   public int compare(Object var1, Object var2) {
      return this.af((Map.Entry)var1, (Map.Entry)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
