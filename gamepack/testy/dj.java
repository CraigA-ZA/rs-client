import java.net.MalformedURLException;
import java.net.URL;

public class dj implements nj {
   static final dj aw = new dj(2);
   public static final int aa = 12;
   static final dj an = new dj(1);
   static final dj af = new dj(0);
   static final dj au = new dj(4);
   static final dj ac = new dj(3);
   static final int az = 19136770;
   final int ab;

   static dj[] ab() {
      return new dj[]{au, af, an, aw, ac};
   }

   public int af(int var1) {
      try {
         return 1074537579 * this.ab;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dj.af(" + ')');
      }
   }

   dj(int var1) {
      try {
         super();
         this.ab = 1138059331 * var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dj.<init>(" + ')');
      }
   }

   public int an() {
      return 1074537579 * this.ab;
   }

   static boolean an(String var0, byte var1) {
      try {
         if (var0 == null) {
            if (var1 == 3) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            try {
               new URL(var0);
               return true;
            } catch (MalformedURLException var3) {
               return false;
            }
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "dj.an(" + ')');
      }
   }

   public int aw() {
      return 1074537579 * this.ab;
   }

   static dj[] aq() {
      return new dj[]{au, af, an, aw, ac};
   }

   public int ac() {
      return 1074537579 * this.ab;
   }

   static final di mf(int var0, int var1, int var2, int var3) {
      try {
         di var4 = new di();
         var4.af = var1 * 111476425;
         var4.an = 100799 * var2;
         client.oc.an(var4, (long)var0);
         lm.mj(var1, 2090566862);
         mq var5 = gh.an(var0, (byte)5);
         fw.ma(var5, -630421795);
         if (client.pg != null) {
            if (var3 != -1618920051) {
               throw new IllegalStateException();
            }

            fw.ma(client.pg, -1679260608);
            client.pg = null;
         }

         je.lz(hn.ap[var0 >> 16], var5, false, (byte)94);
         ax.ci(var1, (byte)122);
         if (-1 != client.or * -896157613) {
            if (var3 != -1618920051) {
               throw new IllegalStateException();
            }

            ec.mu(-896157613 * client.or, 1, (byte)63);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw db.an(var6, "dj.mf(" + ')');
      }
   }

   public static int aw(int var0, int var1) {
      try {
         return qo.au[var0 & 16383];
      } catch (RuntimeException var2) {
         throw db.an(var2, "dj.aw(" + ')');
      }
   }
}
