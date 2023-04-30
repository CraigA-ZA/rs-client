import accessors.RSGrandExchangeOffer;

public class nb implements RSGrandExchangeOffer {
   public int au;
   public int an;
   public int aw;
   public static final int av = 25;
   public int ac;
   public int ab;
   static String cq;
   byte af;
   public static final int al = 1024;
   static final int cw = 20;

   public int aw(int var1) {
      try {
         return this.af & 7;
      } catch (RuntimeException var2) {
         throw db.an(var2, "nb.aw(" + ')');
      }
   }

   public nb(sg var1, boolean var2) {
      try {
         super();
         this.af = var1.cf(435772489);
         this.an = var1.cl(-1390345714) * -2000800301;
         this.aw = var1.cx(-1226492666) * 945098885;
         this.ac = var1.cx(-1343401036) * 275172041;
         this.au = var1.cx(-967787223) * 832101099;
         this.ab = var1.cx(-1718644383) * 2084457045;
         if (var2) {
            this.an(ns.af(var1, (byte)-20), 1482046738);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "nb.<init>(" + ')');
      }
   }

   public int ao() {
      return (this.af & 8) == 8 ? 1 : 0;
   }

   void ah(int var1) {
      this.af &= -8;
      this.af = (byte)(this.af | var1 & 7);
   }

   public int ac(byte var1) {
      try {
         return (this.af & 8) == 8 ? 1 : 0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "nb.ac(" + ')');
      }
   }

   public nb() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "nb.<init>(" + ')');
      }
   }

   void an(Integer var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw db.an(var3, "nb.an(" + ')');
      }
   }

   void aq(Integer var1) {
   }

   void ab(int var1, int var2) {
      try {
         this.af &= -9;
         if (var1 == 1) {
            if (var2 <= 1786853844) {
               throw new IllegalStateException();
            }

            this.af = (byte)(this.af | 8);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "nb.ab(" + ')');
      }
   }

   public int at() {
      return this.af & 7;
   }

   public int aa() {
      return (this.af & 8) == 8 ? 1 : 0;
   }

   public int ay() {
      return (this.af & 8) == 8 ? 1 : 0;
   }

   void au(int var1, byte var2) {
      try {
         this.af &= -8;
         this.af = (byte)(this.af | var1 & 7);
      } catch (RuntimeException var3) {
         throw db.an(var3, "nb.au(" + ')');
      }
   }

   public int ax() {
      return (this.af & 8) == 8 ? 1 : 0;
   }

   void ai(int var1) {
      this.af = (byte)(this.af & -1938528902);
      this.af = (byte)(this.af | var1 & 7);
   }

   void ag(int var1) {
      this.af &= -8;
      this.af = (byte)(this.af | var1 & 7);
   }

   public static int an(byte[] var0, int var1, CharSequence var2, int var3) {
      try {
         int var4 = var2.length();
         int var5 = var1;

         for(int var6 = 0; var6 < var4; ++var6) {
            if (var3 != 2076819739) {
               throw new IllegalStateException();
            }

            char var7 = var2.charAt(var6);
            if (var7 <= 127) {
               if (var3 != 2076819739) {
                  throw new IllegalStateException();
               }

               var0[var5++] = (byte)var7;
            } else if (var7 <= 2047) {
               if (var3 != 2076819739) {
                  throw new IllegalStateException();
               }

               var0[var5++] = (byte)(192 | var7 >> 6);
               var0[var5++] = (byte)(128 | var7 & 63);
            } else {
               var0[var5++] = (byte)(224 | var7 >> 12);
               var0[var5++] = (byte)(128 | var7 >> 6 & 63);
               var0[var5++] = (byte)(128 | var7 & 63);
            }
         }

         return var5 - var1;
      } catch (RuntimeException var8) {
         throw db.an(var8, "nb.an(" + ')');
      }
   }

   void av(int var1) {
      this.af = (byte)(this.af & -1817152155);
      if (var1 == 1) {
         this.af = (byte)(this.af | 8);
      }

   }

   public int al() {
      return this.af & 7;
   }

   void am(int var1) {
      this.af &= -9;
      if (var1 == 1) {
         this.af = (byte)(this.af | 8);
      }

   }

   void ar(int var1) {
      this.af = (byte)(this.af & 1153317476);
      if (var1 == 1) {
         this.af = (byte)(this.af | 8);
      }

   }

   public static void af(String[] var0, short[] var1, int var2) {
      try {
         lo.an(var0, var1, 0, var0.length - 1, 1826563573);
      } catch (RuntimeException var3) {
         throw db.an(var3, "nb.af(" + ')');
      }
   }

   public static ta[] au(int var0) {
      try {
         return new ta[]{ta.aw, ta.af, ta.an};
      } catch (RuntimeException var1) {
         throw db.an(var1, "nb.au(" + ')');
      }
   }
}
