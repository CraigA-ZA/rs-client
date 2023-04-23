public class User implements Comparable {
   Username username0;
   Username previousUsername;

   User() {
   }

   public Username username() {
      return this.previousUsername;
   }

   public String previousName() {
      return null == this.previousUsername ? "" : this.previousUsername.af();
   }

   public String name() {
      return null == this.username0 ? "" : this.username0.af();
   }

   void set(Username var1, Username var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.previousUsername = var1;
         this.username0 = var2;
      }
   }

   public int compareTo0(User var1) {
      return this.previousUsername.compareTo0(var1.previousUsername);
   }

   public int compareTo(Object var1) {
      return this.compareTo0((User)var1);
   }

   static void ab_renamed(int var0) {
      Inventory var2 = (Inventory)Inventory.itemContainers.get((long)var0);
      if (null != var2) {
         var2.remove();
      }
   }
}
