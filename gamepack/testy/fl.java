import java.util.Collections;

public class fl implements nj {
   static final fl au = new fl(4, 4);
   static final fl aq = new fl(6, 6);
   public static final int bx = 32;
   static final fl aw = new fl(2, 2);
   static final fl af = new fl(0, 0);
   static final fl ab = new fl(5, 5);
   static final fl ac = new fl(3, 3);
   static final fl al = new fl(7, 7);
   static final fl at = new fl(8, 8);
   final int aa;
   final int ay;
   static final fl an = new fl(1, 1);
   static final int bd = 1;
   public static final int bf = 68;
   public static final int bp = 1011;

   static fl ay(int var0) {
      fl var1 = (fl)ht.af(qj.au(-1759595969), var0, (short)173);
      if (var1 == null) {
         var1 = at;
      }

      return var1;
   }

   static fl aa(int var0) {
      fl var1 = (fl)ht.af(qj.au(1887149301), var0, (short)173);
      if (var1 == null) {
         var1 = at;
      }

      return var1;
   }

   public int aw() {
      return 59724017 * this.ay;
   }

   static fl ai(int var0) {
      fl var1 = (fl)ht.af(qj.au(70134726), var0, (short)173);
      if (var1 == null) {
         var1 = at;
      }

      return var1;
   }

   public int ac() {
      return 59724017 * this.ay;
   }

   public int an() {
      return 59724017 * this.ay;
   }

   static fl[] al() {
      return new fl[]{af, an, aw, ac, au, ab, aq, al, at};
   }

   fl(int var1, int var2) {
      try {
         super();
         this.aa = -225909867 * var1;
         this.ay = 1597349905 * var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "fl.<init>(" + ')');
      }
   }

   static fl[] at() {
      return new fl[]{af, an, aw, ac, au, ab, aq, al, at};
   }

   static fl[] aq() {
      return new fl[]{af, an, aw, ac, au, ab, aq, al, at};
   }

   public int af(int var1) {
      try {
         return 59724017 * this.ay;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fl.af(" + ')');
      }
   }

   static fl ax(int var0) {
      fl var1 = (fl)ht.af(qj.au(449594446), var0, (short)173);
      if (var1 == null) {
         var1 = at;
      }

      return var1;
   }

   static fl ao(int var0) {
      fl var1 = (fl)ht.af(qj.au(-237742485), var0, (short)173);
      if (var1 == null) {
         var1 = at;
      }

      return var1;
   }

   static boolean oi(byte var0) {
      try {
         boolean var10000;
         if (aj.vb.by(-964267539) >= client.cl * 976454555) {
            if (var0 <= 9) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw db.an(var1, "fl.oi(" + ')');
      }
   }

   public static int au(int var0, int var1, int var2, byte var3) {
      try {
         int var4 = fn.an(var2 - var1 + 1, (byte)86);
         var4 <<= var1;
         var0 |= var4;
         return var0;
      } catch (RuntimeException var5) {
         throw db.an(var5, "fl.au(" + ')');
      }
   }

   public static boolean at(char var0, byte var1) {
      try {
         boolean var10000;
         label46: {
            if (var0 >= 'A') {
               if (var1 != 3) {
                  throw new IllegalStateException();
               }

               if (var0 <= 'Z') {
                  break label46;
               }

               if (var1 != 3) {
                  throw new IllegalStateException();
               }
            }

            if (var0 >= 'a') {
               if (var1 != 3) {
                  throw new IllegalStateException();
               }

               if (var0 <= 'z') {
                  if (var1 != 3) {
                     throw new IllegalStateException();
                  }
                  break label46;
               }
            }

            var10000 = false;
            return var10000;
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fl.at(" + ')');
      }
   }

   public static void af(int[] var0, int[] var1, int var2) {
      try {
         if (null != var0) {
            if (var2 >= 53993777) {
               throw new IllegalStateException();
            }

            if (var1 != null) {
               gj.av = var0;
               fo.ar = new int[var0.length];
               eb.am = new byte[var0.length][][];

               for(int var3 = 0; var3 < gj.av.length; ++var3) {
                  if (var2 >= 53993777) {
                     throw new IllegalStateException();
                  }

                  eb.am[var3] = new byte[var1[var3]][];
                  oj.as.add(var0[var3]);
               }

               Collections.sort(oj.as);
               return;
            }
         }

         gj.av = null;
         fo.ar = null;
         eb.am = (byte[][][])null;
         kr.an(1372150454);
      } catch (RuntimeException var4) {
         throw db.an(var4, "fl.af(" + ')');
      }
   }
}
