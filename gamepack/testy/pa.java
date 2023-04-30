public class pa {
   public static final int af = 40000;
   public static final int an = 5000;

   pa() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "pa.<init>(" + ')');
      }
   }
}
