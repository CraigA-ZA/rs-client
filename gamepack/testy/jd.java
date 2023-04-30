import accessors.RSWorldMapLabelSize;

public class jd implements RSWorldMapLabelSize {
   final int au;
   public static final jd af = new jd(0, 0, 4);
   public static final jd aw = new jd(1, 2, 0);
   final int ac;
   static final int dg = 9;
   final int ab;
   public static final jd an = new jd(2, 1, 2);
   static final int bu = 1004;
   public static final int cg = 86;
   public static final int at = 11;
   static nd fq;

   boolean af(float var1, byte var2) {
      try {
         return var1 >= (float)(2106192169 * this.ab);
      } catch (RuntimeException var3) {
         throw db.an(var3, "jd.af(" + ')');
      }
   }

   static jd an(int var0, int var1) {
      try {
         jd[] var2 = new jd[]{af, an, aw};
         jd[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            jd var5 = var3[var4];
            if (513003821 * var5.au == var0) {
               if (var1 >= 1659861187) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw db.an(var6, "jd.an(" + ')');
      }
   }

   static jd ab(int var0) {
      jd[] var1 = new jd[]{af, an, aw};
      jd[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         jd var4 = var2[var3];
         if (513003821 * var4.au == var0) {
            return var4;
         }
      }

      return null;
   }

   static jd aw(int var0) {
      jd[] var1 = new jd[]{af, an, aw};
      jd[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         jd var4 = var2[var3];
         if (-1090963937 * var4.au == var0) {
            return var4;
         }
      }

      return null;
   }

   static jd ac(int var0) {
      jd[] var1 = new jd[]{af, an, aw};
      jd[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         jd var4 = var2[var3];
         if (513003821 * var4.au == var0) {
            return var4;
         }
      }

      return null;
   }

   static jd au(int var0) {
      jd[] var1 = new jd[]{af, an, aw};
      jd[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         jd var4 = var2[var3];
         if (513003821 * var4.au == var0) {
            return var4;
         }
      }

      return null;
   }

   jd(int var1, int var2, int var3) {
      try {
         super();
         this.ac = var1 * -1440612219;
         this.au = -841767259 * var2;
         this.ab = -1162134759 * var3;
      } catch (RuntimeException var4) {
         throw db.an(var4, "jd.<init>(" + ')');
      }
   }

   static nd hn(int var0, boolean var1, boolean var2, boolean var3, boolean var4, int var5) {
      try {
         qk var6 = null;
         if (null != gc.ax) {
            if (var5 <= 2022123154) {
               throw new IllegalStateException();
            }

            var6 = new qk(var0, gc.ax, ol.ag[var0], 1000000);
         }

         return new nd(var6, kb.wh, var0, var1, var2, var3, var4);
      } catch (RuntimeException var7) {
         throw db.an(var7, "jd.hn(" + ')');
      }
   }

   static final void ab(sq var0, byte var1) {
      try {
         for(int var2 = 0; var2 < ds.ax * 1474255643; ++var2) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            int var3 = ds.ai[var2];
            dv var4 = client.mc[var3];
            int var5 = var0.cm((byte)7);
            if (0 != (var5 & 8)) {
               var5 += var0.cm((byte)7) << 8;
            }

            if (0 != (var5 & 16384)) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               var5 += var0.cm((byte)7) << 16;
            }

            du.aq(var0, var3, var4, var5, (byte)-111);
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "jd.ab(" + ')');
      }
   }
}
