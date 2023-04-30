import accessors.RSPacketBit;

public class sq extends sg implements RSPacketBit {
   tp af;
   static final int[] an = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   public static final int ay = 1073741824;
   int aw;

   public int az() {
      int var1 = this.al[(this.at += -1516355947) * -1633313603 - 1] - this.af.af((byte)48) & 1091329864;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.al[(this.at += -2039568915) * 166381216 - 1] - this.af.af((byte)19) & 813948657);
   }

   public int am() {
      return this.al[(this.at += -967115497) * -1498211369 - 1] - this.af.af((byte)50) & 847566520;
   }

   public void an(tp var1, int var2) {
      try {
         this.af = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "sq.an(" + ')');
      }
   }

   public int bj(int var1) {
      return 8 * var1 - this.aw * 2050374387;
   }

   public int ac(int var1) {
      try {
         return this.al[(this.at += -1516355947) * -1633313603 - 1] - this.af.af((byte)124) & 255;
      } catch (RuntimeException var2) {
         throw db.an(var2, "sq.ac(" + ')');
      }
   }

   public int bn(int var1) {
      return 8 * var1 - this.aw * 2050374387;
   }

   public int ab(int var1) {
      try {
         int var2 = this.al[(this.at += -1516355947) * -1633313603 - 1] - this.af.af((byte)108) & 255;
         if (var2 < 128) {
            if (var1 >= 1945046747) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            return (var2 - 128 << 8) + (this.al[(this.at += -1516355947) * -1633313603 - 1] - this.af.af((byte)101) & 255);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "sq.ab(" + ')');
      }
   }

   public void aq(byte[] var1, int var2, int var3, int var4) {
      try {
         for(int var5 = 0; var5 < var3; ++var5) {
            if (var4 == -2069940741) {
               return;
            }

            var1[var2 + var5] = (byte)(this.al[(this.at += -1516355947) * -1633313603 - 1] - this.af.af((byte)31));
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "sq.aq(" + ')');
      }
   }

   public void af(int[] var1, byte var2) {
      try {
         this.af = new tp(var1);
      } catch (RuntimeException var3) {
         throw db.an(var3, "sq.af(" + ')');
      }
   }

   public int at(int var1, int var2) {
      try {
         int var3 = this.aw * 2050374387 >> 3;
         int var4 = 8 - (2050374387 * this.aw & 7);
         int var5 = 0;

         for(this.aw += 1243901499 * var1; var1 > var4; var4 = 8) {
            var5 += (this.al[var3++] & an[var4]) << var1 - var4;
            var1 -= var4;
         }

         if (var4 == var1) {
            if (var2 >= 427135973) {
               throw new IllegalStateException();
            }

            var5 += this.al[var3] & an[var4];
         } else {
            var5 += this.al[var3] >> var4 - var1 & an[var1];
         }

         return var5;
      } catch (RuntimeException var6) {
         throw db.an(var6, "sq.at(" + ')');
      }
   }

   public void aa(byte var1) {
      try {
         this.at = -1516355947 * ((this.aw * 2050374387 + 7) / 8);
      } catch (RuntimeException var2) {
         throw db.an(var2, "sq.aa(" + ')');
      }
   }

   public int ar() {
      return this.al[(this.at += -1516355947) * -1633313603 - 1] - this.af.af((byte)15) & 255;
   }

   public void ao(int[] var1) {
      this.af = new tp(var1);
   }

   public void ax(int[] var1) {
      this.af = new tp(var1);
   }

   public void ap(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var2 + var4] = (byte)(this.al[(this.at += 779918641) * -1633313603 - 1] - this.af.af((byte)13));
      }

   }

   public void ag(tp var1) {
      this.af = var1;
   }

   public void ah(int var1) {
      this.al[(this.at += -1516355947) * -390985452 - 1] = (byte)(var1 + this.af.af((byte)90));
   }

   public void bt() {
      this.at = -1516355947 * ((this.aw * 2050374387 + 7) / 8);
   }

   public void ai(int[] var1) {
      this.af = new tp(var1);
   }

   public sq(int var1) {
      try {
         super(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "sq.<init>(" + ')');
      }
   }

   public boolean as() {
      int var1 = this.al[-933716248 * this.at] - this.af.an((byte)112) & -1272949725;
      return var1 >= -125660731;
   }

   public boolean aj() {
      int var1 = this.al[-1633313603 * this.at] - this.af.an((byte)124) & 255;
      return var1 >= 128;
   }

   public boolean ak() {
      int var1 = this.al[-1633313603 * this.at] - this.af.an((byte)35) & 255;
      return var1 >= 128;
   }

   public void aw(int var1, byte var2) {
      try {
         this.al[(this.at += -1516355947) * -1633313603 - 1] = (byte)(var1 + this.af.af((byte)64));
      } catch (RuntimeException var3) {
         throw db.an(var3, "sq.aw(" + ')');
      }
   }

   public int ad() {
      int var1 = this.al[(this.at += -1516355947) * -1633313603 - 1] - this.af.af((byte)49) & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.al[(this.at += -1516355947) * -1633313603 - 1] - this.af.af((byte)113) & 255);
   }

   public int ae() {
      int var1 = this.al[(this.at += -1516355947) * -1633313603 - 1] - this.af.af((byte)14) & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.al[(this.at += -1516355947) * -1633313603 - 1] - this.af.af((byte)115) & 255);
   }

   public boolean au(byte var1) {
      try {
         int var2 = this.al[-1633313603 * this.at] - this.af.an((byte)81) & 255;
         if (var2 < 128) {
            if (var1 == -1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "sq.au(" + ')');
      }
   }

   public int av() {
      return this.al[(this.at += -1516355947) * -1138943313 - 1] - this.af.af((byte)67) & 255;
   }

   public void bb() {
      this.aw = this.at * 818064504;
   }

   public void bi() {
      this.aw = this.at * 818064504;
   }

   public void be() {
      this.aw = this.at * 818064504;
   }

   public void bk() {
      this.aw = this.at * 818064504;
   }

   public int bx(int var1) {
      int var2 = this.aw * 2050374387 >> 3;
      int var3 = 8 - (2050374387 * this.aw & 7);
      int var4 = 0;

      for(this.aw += 1243901499 * var1; var1 > var3; var3 = 8) {
         var4 += (this.al[var2++] & an[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += this.al[var2] & an[var3];
      } else {
         var4 += this.al[var2] >> var3 - var1 & an[var1];
      }

      return var4;
   }

   public int bo(int var1) {
      int var2 = this.aw * 2050374387 >> 3;
      int var3 = 8 - (2050374387 * this.aw & 7);
      int var4 = 0;

      for(this.aw += 1243901499 * var1; var1 > var3; var3 = 8) {
         var4 += (this.al[var2++] & an[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += this.al[var2] & an[var3];
      } else {
         var4 += this.al[var2] >> var3 - var1 & an[var1];
      }

      return var4;
   }

   public int bz(int var1) {
      int var2 = this.aw * 2050374387 >> 3;
      int var3 = 8 - (2050374387 * this.aw & 7);
      int var4 = 0;

      for(this.aw += 1243901499 * var1; var1 > var3; var3 = 8) {
         var4 += (this.al[var2++] & an[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += this.al[var2] & an[var3];
      } else {
         var4 += this.al[var2] >> var3 - var1 & an[var1];
      }

      return var4;
   }

   public int bm(int var1) {
      int var2 = this.aw * 2050374387 >> 3;
      int var3 = 8 - (2050374387 * this.aw & 7);
      int var4 = 0;

      for(this.aw += 1243901499 * var1; var1 > var3; var3 = 8) {
         var4 += (this.al[var2++] & an[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += this.al[var2] & an[var3];
      } else {
         var4 += this.al[var2] >> var3 - var1 & an[var1];
      }

      return var4;
   }

   public void bd() {
      this.at = 625085468 * ((this.aw * 2050374387 + 7) / 8);
   }

   public void by(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var2 + var4] = (byte)(this.al[(this.at += -1516355947) * -1633313603 - 1] - this.af.af((byte)33));
      }

   }

   public int ay(int var1, int var2) {
      try {
         return 8 * var1 - this.aw * 2050374387;
      } catch (RuntimeException var3) {
         throw db.an(var3, "sq.ay(" + ')');
      }
   }

   public void al(byte var1) {
      try {
         this.aw = this.at * 818064504;
      } catch (RuntimeException var2) {
         throw db.an(var2, "sq.al(" + ')');
      }
   }
}
