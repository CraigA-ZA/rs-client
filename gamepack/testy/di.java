import accessors.RSInterfaceParent;

public class di extends rp implements RSInterfaceParent {
   int af;
   int an;
   boolean aw;

   public static int at(long var0) {
      try {
         return (int)(var0 >>> 17 & 4294967295L);
      } catch (RuntimeException var2) {
         throw db.an(var2, "di.at(" + ')');
      }
   }

   public static synchronized void au(byte[] var0, byte var1) {
      try {
         if (var0.length == 100) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            if (-300357261 * oj.au < oj.at * 255163693) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               oj.ax[(oj.au += -1092459589) * -300357261 - 1] = var0;
               return;
            }
         }

         if (5000 == var0.length) {
            if (var1 == 0) {
               return;
            }

            if (481846585 * oj.ab < 1720410087 * oj.aa) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               oj.ai[(oj.ab += 1267792137) * 481846585 - 1] = var0;
               return;
            }
         }

         if (10000 == var0.length) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            if (-926544205 * oj.aq < oj.ay * -1922603885) {
               if (var1 == 0) {
                  return;
               }

               oj.ag[(oj.aq += -1706733445) * -926544205 - 1] = var0;
               return;
            }
         }

         if (30000 == var0.length) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            if (oj.al * 767381159 < -1866109675 * oj.ao) {
               if (var1 == 0) {
                  return;
               }

               oj.ah[(oj.al += 1254586647) * 767381159 - 1] = var0;
               return;
            }
         }

         if (null != eb.am) {
            for(int var2 = 0; var2 < gj.av.length; ++var2) {
               if (var1 == 0) {
                  return;
               }

               if (gj.av[var2] == var0.length) {
                  if (var1 == 0) {
                     throw new IllegalStateException();
                  }

                  if (fo.ar[var2] < eb.am[var2].length) {
                     if (var1 == 0) {
                        throw new IllegalStateException();
                     }

                     eb.am[var2][fo.ar[var2]++] = var0;
                     return;
                  }
               }
            }
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "di.au(" + ')');
      }
   }

   public static void al(int var0) {
      try {
         ht.an.ac();
      } catch (RuntimeException var1) {
         throw db.an(var1, "di.al(" + ')');
      }
   }

   di() {
      try {
         super();
         this.aw = false;
      } catch (RuntimeException var1) {
         throw db.an(var1, "di.<init>(" + ')');
      }
   }
}
