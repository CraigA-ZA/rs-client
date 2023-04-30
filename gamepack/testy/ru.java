public class ru {
   ru() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ru.<init>(" + ')');
      }
   }
}
