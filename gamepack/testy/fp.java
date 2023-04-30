public class fp implements nj {
   static final int av = 11;
   public static final fp an = new fp(1, 1);
   final int aq;
   public static final fp ac = new fp(3, 3);
   public static final fp af = new fp(2, 0);
   public static final fp au = new fp(4, 4);
   public final int ab;
   public static final fp aw = new fp(0, 2);
   public static final String kb = "Please enter your date of birth (DD/MM/YYYY)";

   static final void mi(int var0, byte var1) {
      try {
         var0 = Math.min(Math.max(var0, 0), 127);
         aj.vb.ak(var0, 745434039);
      } catch (RuntimeException var2) {
         throw db.an(var2, "fp.mi(" + ')');
      }
   }

   static void ld(mq[] var0, int var1, int var2, int var3, boolean var4, int var5) {
      try {
         for(int var6 = 0; var6 < var0.length; ++var6) {
            mq var7 = var0[var6];
            if (null == var7) {
               if (var5 != 1809081725) {
                  return;
               }
            } else if (var7.cu * 913615679 != var1) {
               if (var5 != 1809081725) {
                  throw new IllegalStateException();
               }
            } else {
               gs.lq(var7, var2, var3, var4, -2107960553);
               hl.lj(var7, var2, var3, (byte)-89);
               if (-1469632775 * var7.cq > var7.cf * -773060713 - var7.cs * -794961409) {
                  var7.cq = var7.cf * 18431759 - var7.cs * 460912311;
               }

               if (var7.cq * -1469632775 < 0) {
                  if (var5 != 1809081725) {
                     throw new IllegalStateException();
                  }

                  var7.cq = 0;
               }

               if (var7.cm * 1223232735 > var7.cl * -1273374131 - var7.cc * 1473950221) {
                  var7.cm = var7.cl * 1941770835 - 978547347 * var7.cc;
               }

               if (var7.cm * 1223232735 < 0) {
                  if (var5 != 1809081725) {
                     throw new IllegalStateException();
                  }

                  var7.cm = 0;
               }

               if (0 == 883712245 * var7.bg) {
                  if (var5 != 1809081725) {
                     throw new IllegalStateException();
                  }

                  je.lz(var0, var7, var4, (byte)79);
               }
            }
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "fp.ld(" + ')');
      }
   }

   public int an() {
      return -601050455 * this.aq;
   }

   public int aw() {
      return -601050455 * this.aq;
   }

   fp(int var1, int var2) {
      try {
         super();
         this.ab = -1807848051 * var1;
         this.aq = -175369831 * var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "fp.<init>(" + ')');
      }
   }

   public int ac() {
      return -601050455 * this.aq;
   }

   public int af(int var1) {
      try {
         return -601050455 * this.aq;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fp.af(" + ')');
      }
   }
}
