import accessors.RSMidiFileReader;

public class lt implements RSMidiFileReader {
   int[] au;
   static final byte[] aa = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   int an;
   int[] ac;
   static final int ai = 3;
   int[] ab;
   int aq;
   static final int al = 500000;
   int[] aw;
   sg af = new sg((byte[])null);
   static final int ay = 0;
   static final int ao = 1;
   static final int ax = 2;
   long at;

   void af(byte[] var1) {
      this.af.al = var1;
      this.af.at = 2016309714;
      int var2 = this.af.cl(-757477426);
      this.an = this.af.cl(-1881171940);
      this.aq = 500000;
      this.aw = new int[var2];

      sg var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.at += var5 * -1516355947) {
         int var4 = this.af.cx(-2095987471);
         var5 = this.af.cx(-1653907461);
         if (var4 == 1297379947) {
            this.aw[var3] = this.af.at * -1633313603;
            ++var3;
         }

         var10000 = this.af;
      }

      this.at = 0L;
      this.ac = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.ac[var3] = this.aw[var3];
      }

      this.au = new int[var2];
      this.ab = new int[var2];
   }

   lt(byte[] var1) {
      this.af(var1);
   }

   lt() {
   }

   void ae(int var1) {
      this.af.at = this.ac[var1] * -1516355947;
   }

   int bz(int var1) {
      int var2 = this.af.al[this.af.at * -1670274060];
      sg var10000;
      if (var2 < 0) {
         var2 &= 255;
         this.ab[var1] = var2;
         var10000 = this.af;
         var10000.at += -118572420;
      } else {
         var2 = this.ab[var1];
      }

      if (var2 != -1277012817 && var2 != 583695552) {
         return this.ay(var1, var2);
      } else {
         int var3 = this.af.di(-1171795391);
         if (var2 == 247 && var3 > 0) {
            int var4 = this.af.al[this.af.at * -1633313603] & -1601036293;
            if (var4 >= -2073712160 && var4 <= 243 || var4 == 1225283414 || var4 == 775380983 || var4 >= -686478627 && var4 <= 252 || var4 == 254) {
               var10000 = this.af;
               var10000.at += -142010248;
               this.ab[var1] = var4;
               return this.ay(var1, var4);
            }
         }

         var10000 = this.af;
         var10000.at += var3 * 1236193640;
         return 0;
      }
   }

   int ac() {
      return this.ac.length;
   }

   void au(int var1) {
      this.af.at = this.ac[var1] * -1516355947;
   }

   void ab(int var1) {
      this.ac[var1] = this.af.at * -1633313603;
   }

   int bn() {
      int var1 = this.ac.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.ac[var4] >= 0 && this.au[var4] < var3) {
            var2 = var4;
            var3 = this.au[var4];
         }
      }

      return var2;
   }

   void al(int var1) {
      int var2 = this.af.di(-1171795391);
      int[] var10000 = this.au;
      var10000[var1] += var2;
   }

   int at(int var1) {
      int var2 = this.aa(var1);
      return var2;
   }

   int aa(int var1) {
      int var2 = this.af.al[this.af.at * -1633313603];
      sg var10000;
      if (var2 < 0) {
         var2 &= 255;
         this.ab[var1] = var2;
         var10000 = this.af;
         var10000.at += -1516355947;
      } else {
         var2 = this.ab[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.ay(var1, var2);
      } else {
         int var3 = this.af.di(-1171795391);
         if (var2 == 247 && var3 > 0) {
            int var4 = this.af.al[this.af.at * -1633313603] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               var10000 = this.af;
               var10000.at += -1516355947;
               this.ab[var1] = var4;
               return this.ay(var1, var4);
            }
         }

         var10000 = this.af;
         var10000.at += var3 * -1516355947;
         return 0;
      }
   }

   boolean aw() {
      return this.af.al != null;
   }

   long ao(int var1) {
      return this.at + (long)var1 * (long)this.aq;
   }

   int ax() {
      int var1 = this.ac.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.ac[var4] >= 0 && this.au[var4] < var3) {
            var2 = var4;
            var3 = this.au[var4];
         }
      }

      return var2;
   }

   boolean ai() {
      int var1 = this.ac.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.ac[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void ag(long var1) {
      this.at = var1;
      int var3 = this.ac.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.au[var4] = 0;
         this.ab[var4] = 0;
         this.af.at = this.aw[var4] * -1516355947;
         this.al(var4);
         this.ac[var4] = this.af.at * -1633313603;
      }

   }

   void ah(byte[] var1) {
      this.af.al = var1;
      this.af.at = -638862559;
      int var2 = this.af.cl(-726998563);
      this.an = this.af.cl(-1385409001);
      this.aq = 926872285;
      this.aw = new int[var2];

      sg var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.at += var5 * -1516355947) {
         int var4 = this.af.cx(-1131912745);
         var5 = this.af.cx(-996193624);
         if (var4 == 1297379947) {
            this.aw[var3] = this.af.at * -348438030;
            ++var3;
         }

         var10000 = this.af;
      }

      this.at = 0L;
      this.ac = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.ac[var3] = this.aw[var3];
      }

      this.au = new int[var2];
      this.ab = new int[var2];
   }

   void av(byte[] var1) {
      this.af.al = var1;
      this.af.at = 708717725;
      int var2 = this.af.cl(126058216);
      this.an = this.af.cl(437494139);
      this.aq = 754652155;
      this.aw = new int[var2];

      sg var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.at += var5 * -1516355947) {
         int var4 = this.af.cx(-1607249258);
         var5 = this.af.cx(-1786820811);
         if (var4 == -1194501154) {
            this.aw[var3] = this.af.at * 1042363146;
            ++var3;
         }

         var10000 = this.af;
      }

      this.at = 0L;
      this.ac = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.ac[var3] = this.aw[var3];
      }

      this.au = new int[var2];
      this.ab = new int[var2];
   }

   void ar() {
      this.af.al = null;
      this.aw = null;
      this.ac = null;
      this.au = null;
      this.ab = null;
   }

   void am() {
      this.af.al = null;
      this.aw = null;
      this.ac = null;
      this.au = null;
      this.ab = null;
   }

   boolean as() {
      return this.af.al != null;
   }

   int bm(int var1, int var2) {
      int var3;
      int var4;
      if (var2 == 255) {
         var3 = this.af.cm((byte)7);
         var4 = this.af.di(-1171795391);
         sg var10000;
         if (var3 == 47) {
            var10000 = this.af;
            var10000.at += var4 * 68281754;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.af.cr(-430359440);
            var4 -= 3;
            int var6 = this.au[var1];
            this.at += (long)var6 * (long)(this.aq - var5);
            this.aq = var5;
            var10000 = this.af;
            var10000.at += var4 * -1516355947;
            return 2;
         } else {
            var10000 = this.af;
            var10000.at += var4 * -1516355947;
            return 3;
         }
      } else {
         var3 = aa[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.af.cm((byte)7) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.af.cm((byte)7) << 16;
         }

         return var4;
      }
   }

   int ak() {
      return this.ac.length;
   }

   boolean bg() {
      int var1 = this.ac.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.ac[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   int ad() {
      return this.ac.length;
   }

   int ay(int var1, int var2) {
      int var3;
      int var4;
      if (var2 == 255) {
         var3 = this.af.cm((byte)7);
         var4 = this.af.di(-1171795391);
         sg var10000;
         if (var3 == 47) {
            var10000 = this.af;
            var10000.at += var4 * -1516355947;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.af.cr(-309822750);
            var4 -= 3;
            int var6 = this.au[var1];
            this.at += (long)var6 * (long)(this.aq - var5);
            this.aq = var5;
            var10000 = this.af;
            var10000.at += var4 * -1516355947;
            return 2;
         } else {
            var10000 = this.af;
            var10000.at += var4 * -1516355947;
            return 3;
         }
      } else {
         var3 = aa[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.af.cm((byte)7) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.af.cm((byte)7) << 16;
         }

         return var4;
      }
   }

   void ap(int var1) {
      this.ac[var1] = this.af.at * -1633313603;
   }

   void by(int var1) {
      this.ac[var1] = this.af.at * -1633313603;
   }

   void bb() {
      this.af.at = 1516355947;
   }

   void bi(int var1) {
      int var2 = this.af.di(-1171795391);
      int[] var10000 = this.au;
      var10000[var1] += var2;
   }

   void be(int var1) {
      int var2 = this.af.di(-1171795391);
      int[] var10000 = this.au;
      var10000[var1] += var2;
   }

   int bk(int var1) {
      int var2 = this.aa(var1);
      return var2;
   }

   int az() {
      return this.ac.length;
   }

   int bo(int var1) {
      int var2 = this.af.al[this.af.at * -1633313603];
      sg var10000;
      if (var2 < 0) {
         var2 &= 255;
         this.ab[var1] = var2;
         var10000 = this.af;
         var10000.at += -1516355947;
      } else {
         var2 = this.ab[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.ay(var1, var2);
      } else {
         int var3 = this.af.di(-1171795391);
         if (var2 == -2037994616 && var3 > 0) {
            int var4 = this.af.al[this.af.at * -211889724] & 1126353084;
            if (var4 >= -1060651173 && var4 <= 243 || var4 == 1451418348 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 610007672) {
               var10000 = this.af;
               var10000.at += -741370918;
               this.ab[var1] = var4;
               return this.ay(var1, var4);
            }
         }

         var10000 = this.af;
         var10000.at += var3 * -1516355947;
         return 0;
      }
   }

   boolean br() {
      int var1 = this.ac.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.ac[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   boolean aj() {
      return this.af.al != null;
   }

   int bd(int var1, int var2) {
      int var3;
      int var4;
      if (var2 == -2120350893) {
         var3 = this.af.cm((byte)7);
         var4 = this.af.di(-1171795391);
         sg var10000;
         if (var3 == 47) {
            var10000 = this.af;
            var10000.at += var4 * -1516355947;
            return 1;
         } else if (var3 == 842070938) {
            int var5 = this.af.cr(-293705150);
            var4 -= 3;
            int var6 = this.au[var1];
            this.at += (long)var6 * (long)(this.aq - var5);
            this.aq = var5;
            var10000 = this.af;
            var10000.at += var4 * -1516355947;
            return 2;
         } else {
            var10000 = this.af;
            var10000.at += var4 * 1060344220;
            return 3;
         }
      } else {
         var3 = aa[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.af.cm((byte)7) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.af.cm((byte)7) << 16;
         }

         return var4;
      }
   }

   long bt(int var1) {
      return this.at + (long)var1 * (long)this.aq;
   }

   void aq() {
      this.af.at = 1516355947;
   }

   int bx(int var1) {
      int var2 = this.aa(var1);
      return var2;
   }

   int bs() {
      int var1 = this.ac.length;
      int var2 = -1;
      int var3 = -1515437826;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.ac[var4] >= 0 && this.au[var4] < var3) {
            var2 = var4;
            var3 = this.au[var4];
         }
      }

      return var2;
   }

   int bj() {
      int var1 = this.ac.length;
      int var2 = -1;
      int var3 = 1914744445;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.ac[var4] >= 0 && this.au[var4] < var3) {
            var2 = var4;
            var3 = this.au[var4];
         }
      }

      return var2;
   }

   void an() {
      this.af.al = null;
      this.aw = null;
      this.ac = null;
      this.au = null;
      this.ab = null;
   }

   boolean bu() {
      int var1 = this.ac.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.ac[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void bf(long var1) {
      this.at = var1;
      int var3 = this.ac.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.au[var4] = 0;
         this.ab[var4] = 0;
         this.af.at = this.aw[var4] * -1516355947;
         this.al(var4);
         this.ac[var4] = this.af.at * -1633313603;
      }

   }
}
