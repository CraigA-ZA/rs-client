public class sm extends rk {
   static final int ad = 32;
   static kh an = new kh(64);
   public int[][] aw;
   public Object[][] ac;
   static nm af;

   public static sm ao(int var0) {
      sm var1 = (sm)an.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(39, var0, (byte)-79);
         var1 = new sm();
         if (var2 != null) {
            var1.aw(new sg(var2), (byte)1);
         }

         var1.au((short)-26288);
         an.aw(var1, (long)var0);
         return var1;
      }
   }

   void aw(sg var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (0 == var3) {
               if (var2 != 1) {
                  return;
               }

               return;
            }

            this.ac(var1, var3, (byte)-4);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "sm.aw(" + ')');
      }
   }

   void ac(sg var1, int var2, byte var3) {
      try {
         if (1 == var2) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            int var4 = var1.cm((byte)7);
            if (null == this.aw) {
               this.aw = new int[var4][];
            }

            for(int var5 = var1.cm((byte)7); var5 != 255; var5 = var1.cm((byte)7)) {
               int var6 = var5 & 127;
               boolean var7 = 0 != (var5 & 128);
               int[] var8 = new int[var1.cm((byte)7)];

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var8[var9] = var1.cd(-113213515);
               }

               this.aw[var6] = var8;
               if (var7) {
                  if (null == this.ac) {
                     if (var3 >= 0) {
                        return;
                     }

                     this.ac = new Object[this.aw.length][];
                  }

                  this.ac[var6] = oe.ac(var1, var8, (byte)-51);
               }
            }
         }

      } catch (RuntimeException var10) {
         throw db.an(var10, "sm.ac(" + ')');
      }
   }

   public static sm aa(int var0) {
      sm var1 = (sm)an.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(-151207198, var0, (byte)-97);
         var1 = new sm();
         if (var2 != null) {
            var1.aw(new sg(var2), (byte)1);
         }

         var1.au((short)-28654);
         an.aw(var1, (long)var0);
         return var1;
      }
   }

   sm() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "sm.<init>(" + ')');
      }
   }

   public static void al(nm var0) {
      af = var0;
   }

   public static sm at(int var0) {
      sm var1 = (sm)an.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(39, var0, (byte)-102);
         var1 = new sm();
         if (var2 != null) {
            var1.aw(new sg(var2), (byte)1);
         }

         var1.au((short)-30957);
         an.aw(var1, (long)var0);
         return var1;
      }
   }

   void au(short var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "sm.au(" + ')');
      }
   }

   public static sm ay(int var0) {
      sm var1 = (sm)an.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(39, var0, (byte)-97);
         var1 = new sm();
         if (var2 != null) {
            var1.aw(new sg(var2), (byte)1);
         }

         var1.au((short)-31588);
         an.aw(var1, (long)var0);
         return var1;
      }
   }

   public static void aq(nm var0) {
      af = var0;
   }

   public static sm ax(int var0) {
      sm var1 = (sm)an.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(2003400173, var0, (byte)-116);
         var1 = new sm();
         if (var2 != null) {
            var1.aw(new sg(var2), (byte)1);
         }

         var1.au((short)-3963);
         an.aw(var1, (long)var0);
         return var1;
      }
   }

   void ai(sg var1, int var2) {
      if (1 == var2) {
         int var3 = var1.cm((byte)7);
         if (null == this.aw) {
            this.aw = new int[var3][];
         }

         for(int var4 = var1.cm((byte)7); var4 != 255; var4 = var1.cm((byte)7)) {
            int var5 = var4 & 127;
            boolean var6 = 0 != (var4 & 128);
            int[] var7 = new int[var1.cm((byte)7)];

            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] = var1.cd(-104338978);
            }

            this.aw[var5] = var7;
            if (var6) {
               if (null == this.ac) {
                  this.ac = new Object[this.aw.length][];
               }

               this.ac[var5] = oe.ac(var1, var7, (byte)-15);
            }
         }
      }

   }

   void ag(sg var1, int var2) {
      if (1 == var2) {
         int var3 = var1.cm((byte)7);
         if (null == this.aw) {
            this.aw = new int[var3][];
         }

         for(int var4 = var1.cm((byte)7); var4 != 255; var4 = var1.cm((byte)7)) {
            int var5 = var4 & 127;
            boolean var6 = 0 != (var4 & 128);
            int[] var7 = new int[var1.cm((byte)7)];

            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] = var1.cd(-794587105);
            }

            this.aw[var5] = var7;
            if (var6) {
               if (null == this.ac) {
                  this.ac = new Object[this.aw.length][];
               }

               this.ac[var5] = oe.ac(var1, var7, (byte)-53);
            }
         }
      }

   }

   void ah(sg var1, int var2) {
      if (1 == var2) {
         int var3 = var1.cm((byte)7);
         if (null == this.aw) {
            this.aw = new int[var3][];
         }

         for(int var4 = var1.cm((byte)7); var4 != -1424664983; var4 = var1.cm((byte)7)) {
            int var5 = var4 & 1380822975;
            boolean var6 = 0 != (var4 & 128);
            int[] var7 = new int[var1.cm((byte)7)];

            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] = var1.cd(-1530678506);
            }

            this.aw[var5] = var7;
            if (var6) {
               if (null == this.ac) {
                  this.ac = new Object[this.aw.length][];
               }

               this.ac[var5] = oe.ac(var1, var7, (byte)-7);
            }
         }
      }

   }

   void av() {
   }

   void ar() {
   }

   void am() {
   }

   public static void as() {
      an.ac();
   }

   public static void aj() {
      an.ac();
   }
}
