public abstract class rm extends rw {
   public abstract int al();

   public abstract int au();

   public abstract int an(int var1);

   public abstract int aw(byte var1);

   public abstract int ac();

   rm(int var1, int var2) {
      try {
         super(var1, var2);
      } catch (RuntimeException var3) {
         throw db.an(var3, "rm.<init>(" + ')');
      }
   }

   public abstract int ab();

   public abstract int aq();

   public abstract int af(int var1);

   public abstract int at();
}
