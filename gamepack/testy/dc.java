import accessors.RSInventory;

public class dc extends rp implements RSInventory {
   static rc af = new rc(32);
   int[] an;
   static int gf;
   static boolean sv;
   static final int ap = 0;
   int[] aw;
   public static final int ah = 91;

   static void ag(int var0) {
      dc var1 = (dc)af.af((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.an.length; ++var2) {
            var1.an[var2] = -1;
            var1.aw[var2] = 0;
         }

      }
   }

   static int aq(int var0, int var1) {
      dc var2 = (dc)af.af((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var2.an.length ? var2.an[var1] : -1;
      }
   }

   static int al(int var0, int var1) {
      dc var2 = (dc)af.af((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.aw.length ? var2.aw[var1] : 0;
      }
   }

   static int at(int var0, int var1) {
      dc var2 = (dc)af.af((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.aw.length ? var2.aw[var1] : 0;
      }
   }

   public static hh an(int var0, int var1) {
      try {
         hh var2 = (hh)hh.aw.af((long)var0);
         if (var2 != null) {
            if (var1 <= -1390356452) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hh.af.bh(13, var0, (byte)-82);
            var2 = new hh();
            var2.au = var0 * 903573465;
            if (var3 != null) {
               var2.aw(new sg(var3), (byte)2);
            }

            hh.aw.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "dc.an(" + ')');
      }
   }

   static void ah(int var0) {
      dc var1 = (dc)af.af((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.an.length; ++var2) {
            var1.an[var2] = -1;
            var1.aw[var2] = 0;
         }

      }
   }

   dc() {
      try {
         super();
         this.an = new int[]{-1};
         this.aw = new int[]{0};
      } catch (RuntimeException var1) {
         throw db.an(var1, "dc.<init>(" + ')');
      }
   }

   static void ax(int var0, int var1, int var2, int var3) {
      dc var4 = (dc)af.af((long)var0);
      if (var4 == null) {
         var4 = new dc();
         af.an(var4, (long)var0);
      }

      if (var4.an.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[1 + var1];

         int var7;
         for(var7 = 0; var7 < var4.an.length; ++var7) {
            var5[var7] = var4.an[var7];
            var6[var7] = var4.aw[var7];
         }

         for(var7 = var4.an.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.an = var5;
         var4.aw = var6;
      }

      var4.an[var1] = var2;
      var4.aw[var1] = var3;
   }

   static void ai(int var0, int var1, int var2, int var3) {
      dc var4 = (dc)af.af((long)var0);
      if (var4 == null) {
         var4 = new dc();
         af.an(var4, (long)var0);
      }

      if (var4.an.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[1 + var1];

         int var7;
         for(var7 = 0; var7 < var4.an.length; ++var7) {
            var5[var7] = var4.an[var7];
            var6[var7] = var4.aw[var7];
         }

         for(var7 = var4.an.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.an = var5;
         var4.aw = var6;
      }

      var4.an[var1] = var2;
      var4.aw[var1] = var3;
   }

   static int ay(int var0, int var1) {
      dc var2 = (dc)af.af((long)var0);
      if (null == var2) {
         return 0;
      } else if (-1 == var1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.aw.length; ++var4) {
            if (var1 == var2.an[var4]) {
               var3 += var2.aw[var4];
            }
         }

         return var3;
      }
   }

   static int aa(int var0, int var1) {
      dc var2 = (dc)af.af((long)var0);
      if (null == var2) {
         return 0;
      } else if (-1 == var1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.aw.length; ++var4) {
            if (var1 == var2.an[var4]) {
               var3 += var2.aw[var4];
            }
         }

         return var3;
      }
   }

   static void av(int var0) {
      dc var1 = (dc)af.af((long)var0);
      if (null != var1) {
         var1.ga();
      }
   }

   static final String lu(int var0, int var1, byte var2) {
      try {
         int var3 = var1 - var0;
         if (var3 < -9) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            } else {
               return oa.an(16711680, 327193286);
            }
         } else if (var3 < -6) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            } else {
               return oa.an(16723968, -746561383);
            }
         } else if (var3 < -3) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            } else {
               return oa.an(16740352, -1933224405);
            }
         } else if (var3 < 0) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            } else {
               return oa.an(16756736, -2006135327);
            }
         } else if (var3 > 9) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            } else {
               return oa.an(65280, -1361344670);
            }
         } else if (var3 > 6) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            } else {
               return oa.an(4259584, -1613667929);
            }
         } else if (var3 > 3) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            } else {
               return oa.an(8453888, -1208659774);
            }
         } else if (var3 > 0) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            } else {
               return oa.an(12648192, 579262578);
            }
         } else {
            return oa.an(16776960, 1025722806);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "dc.lu(" + ')');
      }
   }

   static void ao(int var0, int var1, int var2, int var3) {
      dc var4 = (dc)af.af((long)var0);
      if (var4 == null) {
         var4 = new dc();
         af.an(var4, (long)var0);
      }

      if (var4.an.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[1 + var1];

         int var7;
         for(var7 = 0; var7 < var4.an.length; ++var7) {
            var5[var7] = var4.an[var7];
            var6[var7] = var4.aw[var7];
         }

         for(var7 = var4.an.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.an = var5;
         var4.aw = var6;
      }

      var4.an[var1] = var2;
      var4.aw[var1] = var3;
   }

   public static ha an(int var0, byte var1) {
      try {
         ha var2 = (ha)ha.al.af((long)var0);
         if (null != var2) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = ha.au.bh(12, var0, (byte)-5);
            var2 = new ha();
            if (var3 != null) {
               if (var1 <= -1) {
                  throw new IllegalStateException();
               }

               var2.aw(new sg(var3), 1877633819);
            }

            var2.au(-1974157576);
            ha.al.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "dc.an(" + ')');
      }
   }
}
