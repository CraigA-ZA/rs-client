public class User implements Comparable {
   Username ac;
   Username aw;

   User() {
   }

   public Username username() {
      return this.aw;
   }

   public String previousName() {
      return null == this.aw ? "" : this.aw.af();
   }

   public String name() {
      return null == this.ac ? "" : this.ac.af();
   }

   void set(Username var1, Username var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.aw = var1;
         this.ac = var2;
      }
   }

   public int compareTo0(User var1) {
      return this.aw.compareTo0(var1.aw);
   }

   public int compareTo(Object var1) {
      return this.compareTo0((User)var1);
   }

   static void ab_renamed(int var0) {
      Inventory var2 = (Inventory)Inventory.af.get((long)var0);
      if (null != var2) {
         var2.remove();
      }
   }
}
