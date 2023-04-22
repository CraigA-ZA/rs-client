import java.util.Comparator;

public class tw implements Comparator {
   final boolean af;

   public tw(boolean var1) {
      this.af = var1;
   }

   int af(User var1, User var2) {
      return this.af ? var1.compareTo0(var2) : var2.compareTo0(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.af((User)var1, (User)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
