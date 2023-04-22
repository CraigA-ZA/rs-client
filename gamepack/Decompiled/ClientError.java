public class ClientError extends RuntimeException {
   public static int aw;
   Throwable cause;
   public static int au;
   String message;
   public static String localPlayerName;

   ClientError(Throwable var1, String var2) {
      this.message = var2;
      this.cause = var1;
   }
}
