public class fp implements Enumerated {
   public static final fp ac = new fp(3, 3);
   public static final fp af = new fp(2, 0);
   public static final fp an = new fp(1, 1);
   public static final fp au = new fp(4, 4);
   public static final fp aw = new fp(0, 2);
   final int aq;
   public final int ab;

   fp(int var1, int var2) {
      this.ab = -1807848051 * var1;
      this.aq = -175369831 * var2;
   }

   public int ordinal() {
      return -601050455 * this.aq;
   }

   static void ld_renamed(Component[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         Component var7 = var0[var6];
         if (null != var7 && var7.cu * 913615679 == var1) {
            gs.alignComponentSize(var7, var2, var3, var4);
            hl.alignComponentPosition(var7, var2, var3);
            if (-1469632775 * var7.cq > var7.cf * -773060713 - var7.cs * -794961409) {
               var7.cq = var7.cf * 18431759 - var7.cs * 460912311;
            }

            if (var7.cq * -1469632775 < 0) {
               var7.cq = 0;
            }

            if (var7.cm * 1223232735 > var7.cl * -1273374131 - var7.cc * 1473950221) {
               var7.cm = var7.cl * 1941770835 - 978547347 * var7.cc;
            }

            if (var7.cm * 1223232735 < 0) {
               var7.cm = 0;
            }

            if (0 == 883712245 * var7.bg) {
               WallDecoration.lz_renamed(var0, var7, var4);
            }
         }
      }

   }

   static final void mi_renamed(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      aj.vb.ak(var0);
   }
}
