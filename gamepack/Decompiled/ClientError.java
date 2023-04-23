public class ClientError extends RuntimeException {
   public static int au;
   public static int aw;
   public static String an;
   String ab;
   Throwable aq;

   ClientError(Throwable var1, String var2) {
      this.ab = var2;
      this.aq = var1;
   }
}
