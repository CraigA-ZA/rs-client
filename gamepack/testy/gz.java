public class gz extends rk {
   public static int an;
   public static nm af;
   public static kh aw = new kh(64);
   public int ac;
   public static int al;

   void an(sg var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (var3 == 0) {
               if (var2 <= 830013407) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.aw(var1, var3, 1359565158);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "gz.an(" + ')');
      }
   }

   void ab(sg var1, int var2) {
      if (5 == var2) {
         this.ac = var1.cl(635876341) * 1851631081;
      }

   }

   public static gz ac(int var0) {
      gz var1 = (gz)aw.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(16, var0, (byte)-101);
         var1 = new gz();
         if (var2 != null) {
            var1.an(new sg(var2), 2071709867);
         }

         aw.aw(var1, (long)var0);
         return var1;
      }
   }

   void aw(sg var1, int var2, int var3) {
      try {
         if (5 == var2) {
            this.ac = var1.cl(-1409499570) * 1851631081;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "gz.aw(" + ')');
      }
   }

   public static gz au(int var0) {
      gz var1 = (gz)aw.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(16, var0, (byte)-21);
         var1 = new gz();
         if (var2 != null) {
            var1.an(new sg(var2), 1864933656);
         }

         aw.aw(var1, (long)var0);
         return var1;
      }
   }

   gz() {
      try {
         super();
         this.ac = 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "gz.<init>(" + ')');
      }
   }

   void aq(sg var1, int var2) {
      if (5 == var2) {
         this.ac = var1.cl(-151041504) * -685874245;
      }

   }

   public static void ag(int var0, int var1, int var2, int var3) {
      try {
         in.ab.aw(var0, var1, var2, 707163939);
      } catch (RuntimeException var4) {
         throw db.an(var4, "gz.ag(" + ')');
      }
   }

   static tq an(int var0, int var1, int var2, int var3) {
      try {
         return (tq)jr.au.af(er.af(var0, var1, var2, 916697182));
      } catch (RuntimeException var4) {
         throw db.an(var4, "gz.an(" + ')');
      }
   }

   static ey[] au(int var0) {
      try {
         return new ey[]{ey.af, ey.an, ey.aw, ey.ac, ey.au, ey.ab};
      } catch (RuntimeException var1) {
         throw db.an(var1, "gz.au(" + ')');
      }
   }
}
