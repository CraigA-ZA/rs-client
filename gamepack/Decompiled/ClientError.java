public class ClientError extends RuntimeException {
   public static int au;
   public static int aw;
   public static String localPlayerName;
   String message;
   Throwable cause;

   ClientError(Throwable var1, String var2) {
      this.message = var2;
      this.cause = var1;
   }
}
