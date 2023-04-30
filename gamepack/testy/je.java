import accessors.RSWallDecoration;

public final class je implements RSWallDecoration {
   int an;
   public long aa;
   int ac;
   int aw;
   int ab;
   public iv at;
   int aq;
   public iv al;
   int au;
   int af;
   int ay;
   static on io;
   public static final int bx = 256;

   static final void ac(byte[] var0, int var1, int var2, int var3, int var4, if[] var5, int var6) {
      try {
         int var8;
         int var9;
         for(int var7 = 0; var7 < 4; ++var7) {
            if (var6 != 960745047) {
               throw new IllegalStateException();
            }

            for(var8 = 0; var8 < 64; ++var8) {
               if (var6 != 960745047) {
                  throw new IllegalStateException();
               }

               for(var9 = 0; var9 < 64; ++var9) {
                  if (var6 != 960745047) {
                     return;
                  }

                  if (var1 + var8 > 0) {
                     if (var6 != 960745047) {
                        throw new IllegalStateException();
                     }

                     if (var1 + var8 < 103) {
                        if (var6 != 960745047) {
                           throw new IllegalStateException();
                        }

                        if (var9 + var2 > 0) {
                           if (var6 != 960745047) {
                              return;
                           }

                           if (var9 + var2 < 103) {
                              int[] var10000 = var5[var7].bj[var1 + var8];
                              var10000[var2 + var9] &= -16777217;
                           }
                        }
                     }
                  }
               }
            }
         }

         sg var14 = new sg(var0);

         for(var8 = 0; var8 < 4; ++var8) {
            if (var6 != 960745047) {
               return;
            }

            for(var9 = 0; var9 < 64; ++var9) {
               for(int var10 = 0; var10 < 64; ++var10) {
                  if (var6 != 960745047) {
                     throw new IllegalStateException();
                  }

                  int var11 = var1 + var9;
                  int var12 = var2 + var10;
                  of.aq(var14, var8, var11, var12, var3 + var11, var4 + var12, 0, (byte)-110);
               }
            }
         }

      } catch (RuntimeException var13) {
         throw db.an(var13, "je.ac(" + ')');
      }
   }

   static void ac(int var0) {
      try {
         if (null != cz.ca) {
            if (var0 != 285951283) {
               throw new IllegalStateException();
            }

            if (cz.ca.length() > 0) {
               if (var0 != 285951283) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         if (aj.vb.ae(-103132583) != null) {
            if (var0 != 285951283) {
               throw new IllegalStateException();
            }

            cz.ca = aj.vb.ae(-68966768);
            client.hb = true;
         } else {
            client.hb = false;
         }

      } catch (RuntimeException var1) {
         throw db.an(var1, "je.ac(" + ')');
      }
   }

   static void lz(mq[] var0, mq var1, boolean var2, byte var3) {
      try {
         int var10000;
         if (var1.cf * -773060713 != 0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            var10000 = var1.cf * -773060713;
         } else {
            var10000 = -794961409 * var1.cs;
         }

         int var4 = var10000;
         if (0 != var1.cl * -1273374131) {
            if (var3 <= 1) {
               return;
            }

            var10000 = -1273374131 * var1.cl;
         } else {
            var10000 = var1.cc * 1473950221;
         }

         int var5 = var10000;
         fp.ld(var0, 1713081171 * var1.bs, var4, var5, var2, 1809081725);
         if (var1.gz != null) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            fp.ld(var1.gz, 1713081171 * var1.bs, var4, var5, var2, 1809081725);
         }

         di var6 = (di)client.oc.af((long)(var1.bs * 1713081171));
         if (null != var6) {
            ha.lc(var6.af * 944864121, var4, var5, var2, -726165376);
         }

         if (1337 == var1.bf * 1021339961 && var3 <= 1) {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "je.lz(" + ')');
      }
   }

   je() {
      try {
         super();
         this.aa = 0L;
         this.ay = 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "je.<init>(" + ')');
      }
   }
}
