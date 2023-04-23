import java.util.Collections;

public class fl implements Enumerated {
   static final fl ab = new fl(5, 5);
   static final fl ac = new fl(3, 3);
   static final fl af = new fl(0, 0);
   static final fl al = new fl(7, 7);
   static final fl an = new fl(1, 1);
   static final fl aq = new fl(6, 6);
   static final fl at = new fl(8, 8);
   static final fl au = new fl(4, 4);
   static final fl aw = new fl(2, 2);
   final int aa;
   final int ay;

   public static void af_renamed(int[] var0, int[] var1) {
      if (null != var0 && var1 != null) {
         gj.av = var0;
         fo.ar = new int[var0.length];
         eb.am = new byte[var0.length][][];

         for(int var3 = 0; var3 < gj.av.length; ++var3) {
            eb.am[var3] = new byte[var1[var3]][];
            ByteArrayPool.as.add(var0[var3]);
         }

         Collections.sort(ByteArrayPool.as);
      } else {
         gj.av = null;
         fo.ar = null;
         eb.am = (byte[][][])null;
         kr.an_renamed();
      }
   }

   public static int au_renamed(int var0, int var1, int var2) {
      int var4 = fn.an_renamed(var2 - var1 + 1);
      var4 <<= var1;
      var0 |= var4;
      return var0;
   }

   fl(int var1, int var2) {
      this.aa = -225909867 * var1;
      this.ay = 1597349905 * var2;
   }

   public int ordinal() {
      return 59724017 * this.ay;
   }

   public static boolean at_renamed(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   static boolean oi_renamed() {
      return aj.vb.by() >= Client.cl * 976454555;
   }
}
