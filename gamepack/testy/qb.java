public class qb extends qg {
   static final int ac = 0;
   static final int bf = 1;

   public qb(int var1) {
      try {
         super(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "qb.<init>(" + ')');
      }
   }

   static void kx(int var0, int var1, byte var2) {
      try {
         int var3 = fx.ip.ao(mk.gd);

         int var4;
         int var5;
         for(var4 = 0; var4 < client.ne * 730065501; ++var4) {
            var5 = fx.ip.ao(pr.lg(var4, (short)-12883));
            if (var5 > var3) {
               if (var2 == 1) {
                  return;
               }

               var3 = var5;
            }
         }

         var3 += 8;
         var4 = client.ne * -1933919373 + 22;
         var5 = var0 - var3 / 2;
         if (var3 + var5 > client.aj * -1687260435) {
            if (var2 == 1) {
               return;
            }

            var5 = -1687260435 * client.aj - var3;
         }

         if (var5 < 0) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var5 = 0;
         }

         int var6 = var1;
         if (var4 + var1 > 1658005443 * kd.ak) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var6 = kd.ak * 1658005443 - var4;
         }

         if (var6 < 0) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var6 = 0;
         }

         hl.nf = var5 * -945723825;
         dw.nc = 232216885 * var6;
         re.nj = -760159457 * var3;
         fq.nv = 1585038229 * client.ne + 167124602;
      } catch (RuntimeException var7) {
         throw db.an(var7, "qb.kx(" + ')');
      }
   }

   void an(sg var1, int var2) {
   }

   void af(sg var1, int var2, int var3) {
      try {
         ;
      } catch (RuntimeException var4) {
         throw db.an(var4, "qb.af(" + ')');
      }
   }

   static int an(int var0, int var1, int var2) {
      try {
         dc var3 = (dc)dc.af.af((long)var0);
         if (var3 == null) {
            if (var2 != 2098730562) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (var1 >= 0) {
               if (var2 != 2098730562) {
                  throw new IllegalStateException();
               }

               if (var1 < var3.aw.length) {
                  return var3.aw[var1];
               }

               if (var2 != 2098730562) {
                  throw new IllegalStateException();
               }
            }

            return 0;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "qb.an(" + ')');
      }
   }
}
