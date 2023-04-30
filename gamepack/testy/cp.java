import accessors.RSChatChannel;

public class cp implements RSChatChannel {
   cq[] an;
   static final int af = 100;
   int aw;
   static final byte bi = 125;
   static final int cm = 83;
   static int cz;
   static tq jb;

   int at() {
      return this.aw * -1742939983;
   }

   cq af(int var1, String var2, String var3, String var4, short var5) {
      try {
         cq var6 = this.an[99];

         for(int var7 = -1742939983 * this.aw; var7 > 0; --var7) {
            if (var5 == 191) {
               throw new IllegalStateException();
            }

            if (var7 == 100) {
               if (var5 == 191) {
                  throw new IllegalStateException();
               }
            } else {
               this.an[var7] = this.an[var7 - 1];
            }
         }

         if (var6 == null) {
            if (var5 == 191) {
               throw new IllegalStateException();
            }

            var6 = new cq(var1, var2, var4, var3);
         } else {
            var6.ga();
            var6.fs();
            var6.af(var1, var2, var4, var3, 1617874492);
         }

         this.an[0] = var6;
         if (this.aw * -1742939983 < 100) {
            this.aw += 632451153;
         }

         return var6;
      } catch (RuntimeException var8) {
         throw db.an(var8, "cp.af(" + ')');
      }
   }

   cq an(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < -1742939983 * this.aw) {
               return this.an[var1];
            }

            if (var2 >= -2087108024) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw db.an(var3, "cp.an(" + ')');
      }
   }

   public static void bq(mq var0, int var1, int var2, int var3) {
      try {
         var0.dd.aw[var1] = var2;
         var0.dd.ax(-469114674);
      } catch (RuntimeException var4) {
         throw db.an(var4, "cp.bq(" + ')');
      }
   }

   cq ac(int var1, String var2, String var3, String var4) {
      cq var5 = this.an[99];

      for(int var6 = -1742939983 * this.aw; var6 > 0; --var6) {
         if (var6 != 2079982835) {
            this.an[var6] = this.an[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new cq(var1, var2, var4, var3);
      } else {
         var5.ga();
         var5.fs();
         var5.af(var1, var2, var4, var3, 1617874492);
      }

      this.an[0] = var5;
      if (this.aw * -866965526 < -406390269) {
         this.aw += -738979046;
      }

      return var5;
   }

   cq au(int var1, String var2, String var3, String var4) {
      cq var5 = this.an[99];

      for(int var6 = -1742939983 * this.aw; var6 > 0; --var6) {
         if (var6 != 100) {
            this.an[var6] = this.an[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new cq(var1, var2, var4, var3);
      } else {
         var5.ga();
         var5.fs();
         var5.af(var1, var2, var4, var3, 1617874492);
      }

      this.an[0] = var5;
      if (this.aw * -1742939983 < 100) {
         this.aw += 632451153;
      }

      return var5;
   }

   cq ab(int var1, String var2, String var3, String var4) {
      cq var5 = this.an[-1208883985];

      for(int var6 = -1742939983 * this.aw; var6 > 0; --var6) {
         if (var6 != 100) {
            this.an[var6] = this.an[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new cq(var1, var2, var4, var3);
      } else {
         var5.ga();
         var5.fs();
         var5.af(var1, var2, var4, var3, 1617874492);
      }

      this.an[0] = var5;
      if (this.aw * -1742939983 < 100) {
         this.aw += -346335619;
      }

      return var5;
   }

   cq aq(int var1) {
      return var1 >= 0 && var1 < -1742939983 * this.aw ? this.an[var1] : null;
   }

   cq al(int var1) {
      return var1 >= 0 && var1 < -1742939983 * this.aw ? this.an[var1] : null;
   }

   cp() {
      try {
         super();
         this.an = new cq[100];
      } catch (RuntimeException var1) {
         throw db.an(var1, "cp.<init>(" + ')');
      }
   }

   int aa() {
      return this.aw * -1742939983;
   }

   static final ro af(sg var0, ro var1, byte var2) {
      try {
         int var3 = var0.cm((byte)7);
         int var4;
         if (null == var1) {
            if (var2 >= 5) {
               throw new IllegalStateException();
            }

            var4 = co.ab(var3, 510915331);
            var1 = new ro(var4);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            if (var2 >= 5) {
               throw new IllegalStateException();
            }

            boolean var5 = var0.cm((byte)7) == 1;
            int var6 = var0.cr(-1933116699);
            Object var7;
            if (var5) {
               if (var2 >= 5) {
                  throw new IllegalStateException();
               }

               var7 = new rd(var0.cw((byte)0));
            } else {
               var7 = new rt(var0.cx(-1813256267));
            }

            var1.an((rp)var7, (long)var6);
         }

         return var1;
      } catch (RuntimeException var8) {
         throw db.an(var8, "cp.af(" + ')');
      }
   }

   int aw(int var1) {
      try {
         return this.aw * -1742939983;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cp.aw(" + ')');
      }
   }
}
