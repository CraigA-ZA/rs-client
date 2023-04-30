import java.awt.Font;

public class jn {
   static final int ac = 4;
   static final int an = 1;
   static final int aw = 2;
   static final int af = 0;
   static final int au = 3;
   public static final int ar = 16;
   static Font bb;

   static int ax(int var0, ch var1, boolean var2, int var3) {
      try {
         mq var4 = var2 ? bq.ag : an.ai;
         if (1500 == var0) {
            if (var3 != 6390717) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.ce * 262951665;
               return 1;
            }
         } else if (1501 == var0) {
            if (var3 != 6390717) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = -747355095 * var4.ci;
               return 1;
            }
         } else if (var0 == 1502) {
            if (var3 != 6390717) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.cs * -794961409;
               return 1;
            }
         } else if (var0 == 1503) {
            if (var3 != 6390717) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.cc * 1473950221;
               return 1;
            }
         } else if (var0 == 1504) {
            if (var3 != 6390717) {
               throw new IllegalStateException();
            } else {
               int[] var10000 = cy.al;
               int var10001 = (cy.at += 427135973) * -964267539 - 1;
               byte var10002;
               if (var4.ck) {
                  if (var3 != 6390717) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (1505 == var0) {
            if (var3 != 6390717) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = 913615679 * var4.cu;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "jn.ax(" + ')');
      }
   }

   static void nx(int var0, int var1) {
      try {
         client.lv = -1041341417 * var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jn.nx(" + ')');
      }
   }

   jn() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "jn.<init>(" + ')');
      }
   }

   public static String an(long var0) {
      try {
         if (var0 > 0L && var0 < 6582952005840035281L) {
            if (0L == var0 % 37L) {
               return null;
            } else {
               int var2 = 0;

               for(long var3 = var0; var3 != 0L; var3 /= 37L) {
                  ++var2;
               }

               StringBuilder var5 = new StringBuilder(var2);

               while(var0 != 0L) {
                  long var6 = var0;
                  var0 /= 37L;
                  var5.append(oy.af[(int)(var6 - 37L * var0)]);
               }

               return var5.reverse().toString();
            }
         } else {
            return null;
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "jn.an(" + ')');
      }
   }
}
