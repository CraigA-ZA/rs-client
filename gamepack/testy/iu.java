import accessors.RSMoveSpeed;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class iu implements nj, RSMoveSpeed {
   public static final iu ac = new iu((byte)2);
   public static final iu an = new iu((byte)0);
   public static final iu aw = new iu((byte)1);
   public static final iu af = new iu((byte)-1);
   public byte au;
   public static final int ch = 96;

   public int af(int var1) {
      try {
         return this.au;
      } catch (RuntimeException var2) {
         throw db.an(var2, "iu.af(" + ')');
      }
   }

   public int an() {
      return this.au;
   }

   public int aw() {
      return this.au;
   }

   static String aw(Throwable var0, int var1) throws IOException {
      try {
         String var2;
         if (var0 instanceof tr) {
            if (var1 != -1633313603) {
               throw new IllegalStateException();
            }

            tr var3 = (tr)var0;
            var2 = var3.ab + " | ";
            var0 = var3.aq;
         } else {
            var2 = "";
         }

         StringWriter var14 = new StringWriter();
         PrintWriter var4 = new PrintWriter(var14);
         var0.printStackTrace(var4);
         var4.close();
         String var5 = var14.toString();
         BufferedReader var6 = new BufferedReader(new StringReader(var5));
         String var7 = var6.readLine();

         while(true) {
            while(true) {
               String var8 = var6.readLine();
               if (null == var8) {
                  if (var1 != -1633313603) {
                     throw new IllegalStateException();
                  }

                  var2 = var2 + "| " + var7;
                  return var2;
               }

               int var9 = var8.indexOf(40);
               int var10 = var8.indexOf(41, var9 + 1);
               if (var9 >= 0) {
                  if (var1 != -1633313603) {
                     throw new IllegalStateException();
                  }

                  if (var10 >= 0) {
                     if (var1 != -1633313603) {
                        throw new IllegalStateException();
                     }

                     String var11 = var8.substring(1 + var9, var10);
                     int var12 = var11.indexOf(".java:");
                     if (var12 >= 0) {
                        if (var1 != -1633313603) {
                           throw new IllegalStateException();
                        }

                        var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
                        var2 = var2 + var11 + ' ';
                        continue;
                     }

                     var8 = var8.substring(0, var9);
                  }
               }

               var8 = var8.trim();
               var8 = var8.substring(var8.lastIndexOf(32) + 1);
               var8 = var8.substring(var8.lastIndexOf(9) + 1);
               var2 = var2 + var8 + ' ';
            }
         }
      } catch (RuntimeException var13) {
         throw db.an(var13, "iu.aw(" + ')');
      }
   }

   public int ac() {
      return this.au;
   }

   iu(byte var1) {
      try {
         super();
         this.au = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "iu.<init>(" + ')');
      }
   }
}
