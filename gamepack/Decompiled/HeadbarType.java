public class HeadbarType extends DualNode {
   public static EvictingDualNodeHashTable aw = new EvictingDualNodeHashTable(64);
   public static AbstractArchive af;
   public static AbstractArchive an;
   static EvictingDualNodeHashTable ac = new EvictingDualNodeHashTable(64);
   int ai = 1313667643;
   int ax = 1336792697;
   public int aa = 667293181;
   public int ag = 661914546;
   public int ah = 0;
   public int al = -1617551845;
   public int ao = -1716509418;
   public int at = -987608785;
   public int au;
   public int ay = -361126927;

   public static byte[] byteArrayFromObject(Object var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var7 = (byte[])((byte[])var0);
         if (var1) {
            int var5 = var7.length;
            byte[] var6 = new byte[var5];
            System.arraycopy(var7, 0, var6, 0, var5);
            return var6;
         } else {
            return var7;
         }
      } else if (var0 instanceof AbstractByteArrayCopier) {
         AbstractByteArrayCopier var3 = (AbstractByteArrayCopier)var0;
         return var3.get();
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (0 == var3) {
            return;
         }

         this.decode0(var1, var3);
      }
   }

   void decode0(Packet var1, int var2) {
      if (var2 == 1) {
         var1.cl();
      } else if (var2 == 2) {
         this.al = var1.g1() * -1859074331;
      } else if (3 == var2) {
         this.at = var1.g1() * -1603958831;
      } else if (4 == var2) {
         this.aa = 0;
      } else if (var2 == 5) {
         this.ao = var1.cl() * -760801671;
      } else if (6 == var2) {
         var1.g1();
      } else if (7 == var2) {
         this.ax = var1.gSmart2or4() * -1336792697;
      } else if (8 == var2) {
         this.ai = var1.gSmart2or4() * -1313667643;
      } else if (var2 == 11) {
         this.aa = var1.cl() * -667293181;
      } else if (14 == var2) {
         this.ag = var1.g1() * -836929641;
      } else if (var2 == 15) {
         this.ah = var1.g1() * 1666074567;
      }

   }

   public Rasterizer3D aw() {
      if (1930644535 * this.ax < 0) {
         return null;
      } else {
         Rasterizer3D var2 = (Rasterizer3D)ac.get((long)(1930644535 * this.ax));
         if (var2 != null) {
            return var2;
         } else {
            var2 = sc.aw_renamed(an, 1930644535 * this.ax, 0);
            if (null != var2) {
               ac.put(var2, (long)(1930644535 * this.ax));
            }

            return var2;
         }
      }
   }

   public Rasterizer3D ac() {
      if (-1451871987 * this.ai < 0) {
         return null;
      } else {
         Rasterizer3D var2 = (Rasterizer3D)ac.get((long)(this.ai * -1451871987));
         if (null != var2) {
            return var2;
         } else {
            var2 = sc.aw_renamed(an, this.ai * -1451871987, 0);
            if (null != var2) {
               ac.put(var2, (long)(-1451871987 * this.ai));
            }

            return var2;
         }
      }
   }
}
