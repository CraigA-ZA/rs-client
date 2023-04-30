import accessors.RSUrlRequest;
import java.net.URL;

public class ez implements RSUrlRequest {
   volatile int ac;
   static int aw = 589984538;
   static int an = -1187714911;
   final URL af;
   volatile byte[] au;
   public static int at;
   public static final int cu = 80;

   public boolean af(byte var1) {
      try {
         boolean var10000;
         if (-349727197 * this.ac != 1340146847 * an) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ez.af(" + ')');
      }
   }

   static int ac(int var0, double var1) {
      try {
         double var3 = (double)(var0 >> 16) / 256.0;
         double var5 = (double)(var0 >> 8 & 255) / 256.0;
         double var7 = (double)(var0 & 255) / 256.0;
         var3 = Math.pow(var3, var1);
         var5 = Math.pow(var5, var1);
         var7 = Math.pow(var7, var1);
         int var9 = (int)(var3 * 256.0);
         int var10 = (int)(var5 * 256.0);
         int var11 = (int)(256.0 * var7);
         return var11 + (var10 << 8) + (var9 << 16);
      } catch (RuntimeException var12) {
         throw db.an(var12, "ez.ac(" + ')');
      }
   }

   public byte[] an(byte var1) {
      try {
         return this.au;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ez.an(" + ')');
      }
   }

   ez(URL var1) {
      try {
         super();
         this.ac = an * -856794795;
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ez.<init>(" + ')');
      }
   }

   public boolean ac() {
      return -349727197 * this.ac != 1340146847 * an;
   }

   public boolean au() {
      return -349727197 * this.ac != 198890910 * an;
   }

   public byte[] ab() {
      return this.au;
   }

   public byte[] aq() {
      return this.au;
   }

   public String al() {
      return this.af.toString();
   }

   public String at() {
      return this.af.toString();
   }

   public String aa() {
      return this.af.toString();
   }

   public String aw(byte var1) {
      try {
         return this.af.toString();
      } catch (RuntimeException var2) {
         throw db.an(var2, "ez.aw(" + ')');
      }
   }

   static void as(int var0) {
      try {
         ee.ak(24, (byte)127);
         he.ax(mk.jf, mk.jw, mk.js, 899172963);
      } catch (RuntimeException var1) {
         throw db.an(var1, "ez.as(" + ')');
      }
   }
}
