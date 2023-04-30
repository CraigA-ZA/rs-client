public final class dg extends rp {
   static final int dl = 4;
   int an;
   int aw;
   int ac;
   int au;
   int aq;
   int aa;
   int ai;
   int at;
   int al;
   int ab;
   int ax;
   int af;
   int ag;
   static final int bz = 40;
   static final int bo = 19137016;
   public static final int bn = 49;
   int ay;

   public static io af(nm var0, nm var1, int var2, boolean var3, int var4) {
      try {
         boolean var5 = true;
         int[] var6 = var0.ck(var2, 1778835324);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            if (var4 == 1681093452) {
               throw new IllegalStateException();
            }

            byte[] var8 = var0.ca(var2, var6[var7], -606351717);
            if (null == var8) {
               if (var4 == 1681093452) {
                  throw new IllegalStateException();
               }

               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10;
               if (var3) {
                  var10 = var1.ca(0, var9, -606351717);
               } else {
                  var10 = var1.ca(var9, 0, -606351717);
               }

               if (null == var10) {
                  if (var4 == 1681093452) {
                     throw new IllegalStateException();
                  }

                  var5 = false;
               }
            }
         }

         if (!var5) {
            if (var4 == 1681093452) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            try {
               return new io(var0, var1, var2, var3);
            } catch (Exception var11) {
               return null;
            }
         }
      } catch (RuntimeException var12) {
         throw db.an(var12, "dg.af(" + ')');
      }
   }

   void af(int var1, byte var2) {
      try {
         this.ax = -1874637045 * var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dg.af(" + ')');
      }
   }

   boolean an(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != -633273091) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 != -633273091) {
                  throw new IllegalStateException();
               }

               return 0 != (-1693875037 * this.ax & 1 << var1);
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dg.an(" + ')');
      }
   }

   dg() {
      try {
         super();
         this.ax = 2015793749;
         this.ai = 0;
         this.ag = -376812409;
      } catch (RuntimeException var1) {
         throw db.an(var1, "dg.<init>(" + ')');
      }
   }

   boolean aq(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (-1693875037 * this.ax & 1 << var1);
      } else {
         return true;
      }
   }

   void au(int var1) {
      this.ax = 1844969273 * var1;
   }

   boolean ab(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (-1693875037 * this.ax & 1 << var1);
      } else {
         return true;
      }
   }

   void aw(int var1) {
      this.ax = -1874637045 * var1;
   }

   boolean al(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (-1693875037 * this.ax & 1 << var1);
      } else {
         return true;
      }
   }

   void ac(int var1) {
      this.ax = -1874637045 * var1;
   }
}
