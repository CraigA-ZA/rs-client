public class User implements Comparable {
   Username previousUsername;
   Username username0;

   User() {
   }

   public Username username() {
      return this.username0;
   }

   public String name() {
      return null == this.username0 ? "" : this.username0.af();
   }

   public String previousName() {
      return null == this.previousUsername ? "" : this.previousUsername.af();
   }

   void set(Username var1, Username var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.username0 = var1;
         this.previousUsername = var2;
      }
   }

   public int compareTo0(User var1) {
      return this.username0.compareTo0(var1.username0);
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
