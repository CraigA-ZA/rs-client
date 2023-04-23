import java.util.Comparator;

public class ty implements Comparator {
   final boolean af;

   public ty(boolean var1) {
      this.af = var1;
   }

   int af(User var1, User var2) {
      return this.af ? var1.username().compareTo0(var2.username()) : var2.username().compareTo0(var1.username());
   }

   public int compare(Object var1, Object var2) {
      return this.af((User)var1, (User)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
