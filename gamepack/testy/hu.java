import java.io.IOException;
import java.net.Socket;

public class hu {
   static final int at = 9;
   static short[][][] ac;
   public static final int bb = 512;
   static final int an = 256;

   static String aq(ro var0, int var1, String var2) {
      if (null == var0) {
         return var2;
      } else {
         rd var3 = (rd)var0.af((long)var1);
         return var3 == null ? var2 : (String)var3.af;
      }
   }

   public static ph af(Socket var0, int var1, int var2, int var3) throws IOException {
      try {
         return new pv(var0, var1, var2);
      } catch (RuntimeException var4) {
         throw db.an(var4, "hu.af(" + ')');
      }
   }

   static final ro ac(sg var0, ro var1) {
      int var2 = var0.cm((byte)7);
      int var3;
      if (null == var1) {
         var3 = co.ab(var2, 627126698);
         var1 = new ro(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.cm((byte)7) == 1;
         int var5 = var0.cr(-675188196);
         Object var6;
         if (var4) {
            var6 = new rd(var0.cw((byte)0));
         } else {
            var6 = new rt(var0.cx(-1351942262));
         }

         var1.an((rp)var6, (long)var5);
      }

      return var1;
   }

   static String au(ro var0, int var1, String var2) {
      if (null == var0) {
         return var2;
      } else {
         rd var3 = (rd)var0.af((long)var1);
         return var3 == null ? var2 : (String)var3.af;
      }
   }

   static String ab(ro var0, int var1, String var2) {
      if (null == var0) {
         return var2;
      } else {
         rd var3 = (rd)var0.af((long)var1);
         return var3 == null ? var2 : (String)var3.af;
      }
   }

   static final ro aw(sg var0, ro var1) {
      int var2 = var0.cm((byte)7);
      int var3;
      if (null == var1) {
         var3 = co.ab(var2, 150018764);
         var1 = new ro(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.cm((byte)7) == 1;
         int var5 = var0.cr(3617640);
         Object var6;
         if (var4) {
            var6 = new rd(var0.cw((byte)0));
         } else {
            var6 = new rt(var0.cx(-1988802768));
         }

         var1.an((rp)var6, (long)var5);
      }

      return var1;
   }

   static final boolean ju(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         dg var6 = null;

         for(dg var7 = (dg)client.nn.aq(); var7 != null; var7 = (dg)client.nn.at()) {
            if (var5 <= 3) {
               throw new IllegalStateException();
            }

            if (var0 == 593068225 * var7.af) {
               if (var5 <= 3) {
                  throw new IllegalStateException();
               }

               if (var1 == 68300005 * var7.aw) {
                  if (var5 <= 3) {
                     throw new IllegalStateException();
                  }

                  if (var2 == 800888185 * var7.ac) {
                     if (var5 <= 3) {
                        throw new IllegalStateException();
                     }

                     if (var7.an * -1586499579 == var3) {
                        if (var5 <= 3) {
                           throw new IllegalStateException();
                        }

                        var6 = var7;
                        break;
                     }
                  }
               }
            }
         }

         if (var6 != null) {
            var6.ay = var4 * -620279391;
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "hu.ju(" + ')');
      }
   }

   hu() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "hu.<init>(" + ')');
      }
   }
}
