import accessors.RSVarBitType;

public class hg extends rk implements RSVarBitType {
   public int au;
   static nm af;
   public static kh an = new kh(64);
   public int ac;
   public int aw;
   static final int[] ab = new int[32];
   static final int ak = 19136899;
   static final int if = 65536;
   public static final int ag = 19;
   public static final int ax = 15;
   public static byte[][] at;

   void aw(sg var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (var3 == 0) {
               if (var2 == -1975223962) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ac(var1, var3, 2050323828);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hg.aw(" + ')');
      }
   }

   public static void ab(nm var0) {
      af = var0;
   }

   hg() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "hg.<init>(" + ')');
      }
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         ab[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public static void au(nm var0) {
      af = var0;
   }

   public static hg al(int var0) {
      hg var1 = (hg)an.af((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = af.bh(14, var0, (byte)-82);
         var1 = new hg();
         if (var2 != null) {
            var1.aw(new sg(var2), -1240631703);
         }

         an.aw(var1, (long)var0);
         return var1;
      }
   }

   public static void aq(nm var0) {
      af = var0;
   }

   void aa(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.ac(var1, var2, 1719013354);
      }
   }

   public static hg at(int var0) {
      hg var1 = (hg)an.af((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = af.bh(14, var0, (byte)-33);
         var1 = new hg();
         if (var2 != null) {
            var1.aw(new sg(var2), -2075712490);
         }

         an.aw(var1, (long)var0);
         return var1;
      }
   }

   void ac(sg var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            if (var3 <= 1119051334) {
               return;
            }

            this.aw = var1.cl(-1693677876) * -893309655;
            this.ac = var1.cm((byte)7) * -1466027509;
            this.au = var1.cm((byte)7) * 909304255;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "hg.ac(" + ')');
      }
   }

   void ay(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.ac(var1, var2, 1907961877);
      }
   }

   void ax(sg var1, int var2) {
      if (var2 == 1) {
         this.aw = var1.cl(-1582055364) * -893309655;
         this.ac = var1.cm((byte)7) * -1466027509;
         this.au = var1.cm((byte)7) * 909304255;
      }

   }

   void av(sg var1, int var2) {
      if (var2 == 1) {
         this.aw = var1.cl(494943276) * -893309655;
         this.ac = var1.cm((byte)7) * 831281458;
         this.au = var1.cm((byte)7) * -285596520;
      }

   }

   void ai(sg var1, int var2) {
      if (var2 == 1) {
         this.aw = var1.cl(-738152601) * -893309655;
         this.ac = var1.cm((byte)7) * -1466027509;
         this.au = var1.cm((byte)7) * 909304255;
      }

   }

   void ag(sg var1, int var2) {
      if (var2 == 1) {
         this.aw = var1.cl(403959128) * -893309655;
         this.ac = var1.cm((byte)7) * -1772347024;
         this.au = var1.cm((byte)7) * 745088788;
      }

   }

   void ah(sg var1, int var2) {
      if (var2 == 1) {
         this.aw = var1.cl(576013569) * -893309655;
         this.ac = var1.cm((byte)7) * -1466027509;
         this.au = var1.cm((byte)7) * 909304255;
      }

   }

   void ao(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.ac(var1, var2, 2008839740);
      }
   }
}
