public class HeadbarType extends DualNode {
   public static EvictingDualNodeHashTable HeadbarType_cached = new EvictingDualNodeHashTable(64);
   public static AbstractArchive af;
   public static AbstractArchive an;
   static EvictingDualNodeHashTable HeadbarType_cachedSprites = new EvictingDualNodeHashTable(64);
   int spriteback = 1313667643;
   int spritefront = 1336792697;
   public int int3 = 667293181;
   public int width = 661914546;
   public int widthPadding = 0;
   public int int1 = -1617551845;
   public int int5 = -1716509418;
   public int int2 = -987608785;
   public int au;
   public int int4 = -361126927;

   public static byte[] byteArrayFromObject(Object var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var8 = (byte[])((byte[])var0);
         if (var1) {
            int var5 = var8.length;
            byte[] var6 = new byte[var5];
            System.arraycopy(var8, 0, var6, 0, var5);
            return var6;
         } else {
            return var8;
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
         this.int1 = var1.g1() * -1859074331;
      } else if (3 == var2) {
         this.int2 = var1.g1() * -1603958831;
      } else if (4 == var2) {
         this.int3 = 0;
      } else if (var2 == 5) {
         this.int5 = var1.cl() * -760801671;
      } else if (6 == var2) {
         var1.g1();
      } else if (7 == var2) {
         this.spritefront = var1.gSmart2or4() * -1336792697;
      } else if (8 == var2) {
         this.spriteback = var1.gSmart2or4() * -1313667643;
      } else if (var2 == 11) {
         this.int3 = var1.cl() * -667293181;
      } else if (14 == var2) {
         this.width = var1.g1() * -836929641;
      } else if (var2 == 15) {
         this.widthPadding = var1.g1() * 1666074567;
      }

   }

   public Sprite getFrontSprite() {
      if (1930644535 * this.spritefront < 0) {
         return null;
      } else {
         Sprite var2 = (Sprite)HeadbarType_cachedSprites.get((long)(1930644535 * this.spritefront));
         if (var2 != null) {
            return var2;
         } else {
            var2 = sc.readSprite(an, 1930644535 * this.spritefront, 0);
            if (null != var2) {
               HeadbarType_cachedSprites.put(var2, (long)(1930644535 * this.spritefront));
            }

            return var2;
         }
      }
   }

   public Sprite getBackSprite() {
      if (-1451871987 * this.spriteback < 0) {
         return null;
      } else {
         Sprite var2 = (Sprite)HeadbarType_cachedSprites.get((long)(this.spriteback * -1451871987));
         if (null != var2) {
            return var2;
         } else {
            var2 = sc.readSprite(an, this.spriteback * -1451871987, 0);
            if (null != var2) {
               HeadbarType_cachedSprites.put(var2, (long)(-1451871987 * this.spriteback));
            }

            return var2;
         }
      }
   }
}
