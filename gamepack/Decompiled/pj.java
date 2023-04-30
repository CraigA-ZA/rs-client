public final class pj implements Comparable {
   static Clock clock;
   static Archive archive6;
   static short[] wm;
   Object af;
   Object an;
   long ac;
   long aw;

   pj(Object var1, Object var2) {
      this.af = var1;
      this.an = var2;
   }

   int af(pj var1) {
      if (this.ac * -8679189461794727135L < -8679189461794727135L * var1.ac) {
         return -1;
      } else {
         return -8679189461794727135L * this.ac > var1.ac * -8679189461794727135L ? 1 : 0;
      }
   }

   public static tf af_renamed(int var0) {
      tf[] var2 = new tf[]{tf.af, tf.aw, tf.an};
      tf[] var3 = var2;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         tf var5 = var3[var4];
         if (var5.ac * 1843384107 == var0) {
            return var5;
         }
      }

      return null;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof pj) {
         return this.an.equals(((pj)var1).an);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int hashCode() {
      return this.an.hashCode();
   }

   public int compareTo(Object var1) {
      return this.af((pj)var1);
   }
}
