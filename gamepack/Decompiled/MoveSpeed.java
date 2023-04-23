import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class MoveSpeed implements Enumerated {
   public static final MoveSpeed run = new MoveSpeed((byte)2);
   public static final MoveSpeed stationary = new MoveSpeed((byte)-1);
   public static final MoveSpeed crawl = new MoveSpeed((byte)0);
   public static final MoveSpeed walk = new MoveSpeed((byte)1);
   public byte speed;

   MoveSpeed(byte var1) {
      this.speed = var1;
   }

   public int ordinal() {
      return this.speed;
   }

   static String aw_renamed(Throwable var0) throws IOException {
      String var2;
      if (var0 instanceof ClientError) {
         ClientError var3 = (ClientError)var0;
         var2 = var3.message + " | ";
         var0 = var3.cause;
      } else {
         var2 = "";
      }

      StringWriter var13 = new StringWriter();
      PrintWriter var4 = new PrintWriter(var13);
      var0.printStackTrace(var4);
      var4.close();
      String var5 = var13.toString();
      BufferedReader var6 = new BufferedReader(new StringReader(var5));
      String var7 = var6.readLine();

      while(true) {
         while(true) {
            String var8 = var6.readLine();
            if (null == var8) {
               var2 = var2 + "| " + var7;
               return var2;
            }

            int var9 = var8.indexOf(40);
            int var10 = var8.indexOf(41, var9 + 1);
            if (var9 >= 0 && var10 >= 0) {
               String var11 = var8.substring(1 + var9, var10);
               int var12 = var11.indexOf(".java:");
               if (var12 >= 0) {
                  var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
                  var2 = var2 + var11 + ' ';
                  continue;
               }

               var8 = var8.substring(0, var9);
            }

            var8 = var8.trim();
            var8 = var8.substring(var8.lastIndexOf(32) + 1);
            var8 = var8.substring(var8.lastIndexOf(9) + 1);
            var2 = var2 + var8 + ' ';
         }
      }
   }
}
