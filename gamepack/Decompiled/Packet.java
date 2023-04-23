import java.math.BigInteger;

public class Packet extends Node {
   static int[] aa = new int[256];
   static long[] ao;
   public byte[] array;
   public int index;

   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if (1 == (var0 & 1)) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         aa[var1] = var0;
      }

      ao = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var9 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if (1L == (var9 & 1L)) {
               var9 = var9 >>> 1 ^ -3932672073523589310L;
            } else {
               var9 >>>= 1;
            }
         }

         ao[var2] = var9;
      }

   }

   public Packet(int var1) {
      this.array = jz.ac_renamed(var1);
      this.index = 0;
   }

   public Packet(int var1, boolean var2) {
      this.array = ByteArrayPool.ByteArrayPool_get(var1, var2);
   }

   public Packet(byte[] var1) {
      this.array = var1;
      this.index = 0;
   }

   public void bg() {
      if (null != this.array) {
         InterfaceParent.ByteArrayPool_release(this.array);
      }

      this.array = null;
   }

   public void bu(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)var1;
   }

   public void p2(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 8);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)var1;
   }

   public void bq(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 16);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 8);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)var1;
   }

   public void ba(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 24);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 16);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 8);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)var1;
   }

   public void p6(long var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 40));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 32));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 24));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 16));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 8));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)var1);
   }

   public void p8s(long var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 56));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 48));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 40));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 32));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 24));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 16));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)(var1 >> 8));
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)((int)var1);
   }

   public void pbool(boolean var1) {
      this.bu(var1 ? 1 : 0);
   }

   public void bh(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.index += kc.encodeStringCp1252(var1, 0, var1.length(), this.array, this.index * -1633313603) * -1516355947;
         this.array[(this.index += -1516355947) * -1633313603 - 1] = 0;
      }
   }

   public void pjstr(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.array[(this.index += -1516355947) * -1633313603 - 1] = 0;
         this.index += kc.encodeStringCp1252(var1, 0, var1.length(), this.array, -1633313603 * this.index) * -1516355947;
         this.array[(this.index += -1516355947) * -1633313603 - 1] = 0;
      }
   }

   public static String ab_renamed(byte[] var0, int var1, int var2) {
      char[] var4 = new char[var2];
      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var0[var1 + var6] & 255;
         if (var7 != 0) {
            if (var7 >= 128 && var7 < 160) {
               char var8 = od.af[var7 - 128];
               if (0 == var8) {
                  var8 = '?';
               }

               var7 = var8;
            }

            var4[var5++] = (char)var7;
         }
      }

      return new String(var4, 0, var5);
   }

   public void ci(CharSequence var1) {
      int var3 = gq.af_renamed(var1);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = 0;
      this.cq(var3);
      this.index += GrandExchangeOffer.an_renamed(this.array, -1633313603 * this.index, var1) * -1516355947;
   }

   public void cs(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         this.array[(this.index += -1516355947) * -1633313603 - 1] = var1[var5];
      }

   }

   public void cc(Packet var1) {
      this.cs(var1.array, 0, var1.index * -1633313603);
   }

   public void cn(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.array[-1633313603 * this.index - var1 - 4] = (byte)(var1 >> 24);
         this.array[-1633313603 * this.index - var1 - 3] = (byte)(var1 >> 16);
         this.array[-1633313603 * this.index - var1 - 2] = (byte)(var1 >> 8);
         this.array[this.index * -1633313603 - var1 - 1] = (byte)var1;
      }
   }

   public void ca(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.array[-1633313603 * this.index - var1 - 2] = (byte)(var1 >> 8);
         this.array[-1633313603 * this.index - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void cu(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.array[-1633313603 * this.index - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void pSmart1or2(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.bu(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.p2('耀' + var1);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void cq(int var1) {
      if (0 != (var1 & -128)) {
         if ((var1 & -16384) != 0) {
            if (0 != (var1 & -2097152)) {
               if ((var1 & -268435456) != 0) {
                  this.bu(var1 >>> 28 | 128);
               }

               this.bu(var1 >>> 21 | 128);
            }

            this.bu(var1 >>> 14 | 128);
         }

         this.bu(var1 >>> 7 | 128);
      }

      this.bu(var1 & 127);
   }

   public int g1() {
      return this.array[(this.index += -1516355947) * -1633313603 - 1] & 255;
   }

   public byte g1s() {
      return this.array[(this.index += -1516355947) * -1633313603 - 1];
   }

   public int cl() {
      this.index += 1262255402;
      return (this.array[this.index * -1633313603 - 1] & 255) + ((this.array[-1633313603 * this.index - 2] & 255) << 8);
   }

   public int cg() {
      this.index += 1262255402;
      int var2 = (this.array[this.index * -1633313603 - 1] & 255) + ((this.array[this.index * -1633313603 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int cr() {
      this.index += -254100545;
      return ((this.array[-1633313603 * this.index - 2] & 255) << 8) + ((this.array[this.index * -1633313603 - 3] & 255) << 16) + (this.array[this.index * -1633313603 - 1] & 255);
   }

   public int cy() {
      this.index += -254100545;
      int var2 = (this.array[this.index * -1633313603 - 1] & 255) + ((this.array[this.index * -1633313603 - 2] & 255) << 8) + ((this.array[this.index * -1633313603 - 3] & 255) << 16);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public int g4s() {
      this.index += -1770456492;
      return ((this.array[this.index * -1633313603 - 3] & 255) << 16) + ((this.array[-1633313603 * this.index - 4] & 255) << 24) + ((this.array[-1633313603 * this.index - 2] & 255) << 8) + (this.array[-1633313603 * this.index - 1] & 255);
   }

   public long g8s() {
      long var2 = (long)this.g4s() & 4294967295L;
      long var4 = (long)this.g4s() & 4294967295L;
      return (var2 << 32) + var4;
   }

   public float cb() {
      return Float.intBitsToFloat(this.g4s());
   }

   public boolean gbool() {
      return (this.g1() & 1) == 1;
   }

   public String cz() {
      if (0 == this.array[this.index * -1633313603]) {
         this.index += -1516355947;
         return null;
      } else {
         return this.cw();
      }
   }

   public String cw() {
      int var2 = this.index * -1633313603;

      while(this.array[(this.index += -1516355947) * -1633313603 - 1] != 0) {
      }

      int var3 = -1633313603 * this.index - var2 - 1;
      return 0 == var3 ? "" : ab_renamed(this.array, var2, var3);
   }

   public String gjstr() {
      byte var2 = this.array[(this.index += -1516355947) * -1633313603 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = -1633313603 * this.index;

         while(this.array[(this.index += -1516355947) * -1633313603 - 1] != 0) {
         }

         int var4 = this.index * -1633313603 - var3 - 1;
         return var4 == 0 ? "" : ab_renamed(this.array, var3, var4);
      }
   }

   public String ch() {
      byte var2 = this.array[(this.index += -1516355947) * -1633313603 - 1];
      if (0 != var2) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.di();
         if (var3 + this.index * -1633313603 > this.array.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var5 = this.array;
            int var6 = this.index * -1633313603;
            char[] var7 = new char[var3];
            int var8 = 0;
            int var9 = var6;

            int var12;
            for(int var10 = var6 + var3; var9 < var10; var7[var8++] = (char)var12) {
               int var11 = var5[var9++] & 255;
               if (var11 < 128) {
                  if (var11 == 0) {
                     var12 = 65533;
                  } else {
                     var12 = var11;
                  }
               } else if (var11 < 192) {
                  var12 = 65533;
               } else if (var11 < 224) {
                  if (var9 < var10 && 128 == (var5[var9] & 192)) {
                     var12 = (var11 & 31) << 6 | var5[var9++] & 63;
                     if (var12 < 128) {
                        var12 = 65533;
                     }
                  } else {
                     var12 = 65533;
                  }
               } else if (var11 < 240) {
                  if (1 + var9 < var10 && (var5[var9] & 192) == 128 && 128 == (var5[var9 + 1] & 192)) {
                     var12 = (var11 & 15) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                     if (var12 < 2048) {
                        var12 = 65533;
                     }
                  } else {
                     var12 = 65533;
                  }
               } else if (var11 < 248) {
                  if (2 + var9 < var10 && (var5[var9] & 192) == 128 && 128 == (var5[var9 + 1] & 192) && 128 == (var5[var9 + 2] & 192)) {
                     var12 = (var11 & 7) << 18 | (var5[var9++] & 63) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                     if (var12 >= 65536 && var12 <= 1114111) {
                        var12 = 65533;
                     } else {
                        var12 = 65533;
                     }
                  } else {
                     var12 = 65533;
                  }
               } else {
                  var12 = 65533;
               }
            }

            String var4 = new String(var7, 0, var8);
            this.index += -1516355947 * var3;
            return var4;
         }
      }
   }

   public void ct(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var2 + var3; ++var5) {
         var1[var5] = this.array[(this.index += -1516355947) * -1633313603 - 1];
      }

   }

   public int gSmart1or2s() {
      int var2 = this.array[this.index * -1633313603] & 255;
      return var2 < 128 ? this.g1() - 64 : this.cl() - '쀀';
   }

   public int cd() {
      int var2 = this.array[this.index * -1633313603] & 255;
      return var2 < 128 ? this.g1() : this.cl() - '耀';
   }

   public int dm() {
      int var2 = this.array[-1633313603 * this.index] & 255;
      return var2 < 128 ? this.g1() - 1 : this.cl() - '老';
   }

   public int dw() {
      int var2 = 0;

      int var3;
      for(var3 = this.cd(); 32767 == var3; var3 = this.cd()) {
         var2 += 32767;
      }

      var2 += var3;
      return var2;
   }

   public int dc() {
      return this.array[-1633313603 * this.index] < 0 ? this.g4s() & Integer.MAX_VALUE : this.cl();
   }

   public int gSmart2or4() {
      if (this.array[this.index * -1633313603] < 0) {
         return this.g4s() & Integer.MAX_VALUE;
      } else {
         int var2 = this.cl();
         return 32767 == var2 ? -1 : var2;
      }
   }

   public int di() {
      byte var2 = this.array[(this.index += -1516355947) * -1633313603 - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.array[(this.index += -1516355947) * -1633313603 - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public int dr(byte var1) {
      int var3 = 0;
      int var4 = 0;

      int var2;
      do {
         var2 = this.g1();
         var3 |= (var2 & 127) << var4;
         var4 += 7;
      } while(var2 > 127);

      if (var1 == -1) {
         throw new IllegalStateException();
      } else {
         return var3;
      }
   }

   public void tinyKeyEncryptAll(int[] var1) {
      int var3 = this.index * -1633313603 / 8;
      this.index = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.g4s();
         int var6 = this.g4s();
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
            var5 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3];
            var7 += var8;
         }

         this.index -= 754054312;
         this.ba(var5);
         this.ba(var6);
      }

   }

   public void tinyKeyDecryptAll(int[] var1) {
      int var3 = -1633313603 * this.index / 8;
      this.index = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.g4s();
         int var6 = this.g4s();
         int var7 = -957401312;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3]) {
            var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3];
            var7 -= var8;
         }

         this.index -= 754054312;
         this.ba(var5);
         this.ba(var6);
      }

   }

   public void tinyKeyEncrypt(int[] var1, int var2, int var3) {
      int var5 = -1633313603 * this.index;
      this.index = var2 * -1516355947;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.g4s();
         int var9 = this.g4s();
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10) {
            var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3];
            var10 += var11;
         }

         this.index -= 754054312;
         this.ba(var8);
         this.ba(var9);
      }

      this.index = -1516355947 * var5;
   }

   public void tinyKeyDecrypt(int[] var1, int var2, int var3) {
      int var5 = -1633313603 * this.index;
      this.index = -1516355947 * var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.g4s();
         int var9 = this.g4s();
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10) {
            var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + var1[var10 >>> 11 & 3];
            var10 -= var11;
         }

         this.index -= 754054312;
         this.ba(var8);
         this.ba(var9);
      }

      this.index = -1516355947 * var5;
   }

   public void rsaEncrypt(BigInteger var1, BigInteger var2) {
      int var4 = -1633313603 * this.index;
      this.index = 0;
      byte[] var5 = new byte[var4];
      this.ct(var5, 0, var4);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(var1, var2);
      byte[] var8 = var7.toByteArray();
      this.index = 0;
      this.p2(var8.length);
      this.cs(var8, 0, var8.length);
   }

   public int dg(int var1) {
      int var3 = SeqType.bs_renamed(this.array, var1, -1633313603 * this.index);
      this.ba(var3);
      return var3;
   }

   public boolean de() {
      this.index -= -1770456492;
      int var2 = SeqType.bs_renamed(this.array, 0, this.index * -1633313603);
      int var3 = this.g4s();
      return var2 == var3;
   }

   public void dh(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 + 128);
   }

   public void dp(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(0 - var1);
   }

   public void du(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(128 - var1);
   }

   public int db() {
      return this.array[(this.index += -1516355947) * -1633313603 - 1] - 128 & 255;
   }

   public int g1n() {
      return 0 - this.array[(this.index += -1516355947) * -1633313603 - 1] & 255;
   }

   public int dq() {
      return 128 - this.array[(this.index += -1516355947) * -1633313603 - 1] & 255;
   }

   public byte dd() {
      return (byte)(this.array[(this.index += -1516355947) * -1633313603 - 1] - 128);
   }

   public byte dj() {
      return (byte)(0 - this.array[(this.index += -1516355947) * -1633313603 - 1]);
   }

   public byte dx() {
      return (byte)(128 - this.array[(this.index += -1516355947) * -1633313603 - 1]);
   }

   public void p2LE(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)var1;
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 8);
   }

   public void dy(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 8);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 + 128);
   }

   public void ds(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 + 128);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 8);
   }

   public int da() {
      this.index += 1262255402;
      return ((this.array[-1633313603 * this.index - 1] & 255) << 8) + (this.array[-1633313603 * this.index - 2] & 255);
   }

   public int ep() {
      this.index += 1262255402;
      return ((this.array[-1633313603 * this.index - 2] & 255) << 8) + (this.array[this.index * -1633313603 - 1] - 128 & 255);
   }

   public int eo() {
      this.index += 1262255402;
      return ((this.array[this.index * -1633313603 - 1] & 255) << 8) + (this.array[-1633313603 * this.index - 2] - 128 & 255);
   }

   public int eq() {
      this.index += 1262255402;
      int var2 = (this.array[-1633313603 * this.index - 2] & 255) + ((this.array[-1633313603 * this.index - 1] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int et() {
      this.index += 1262255402;
      int var2 = (this.array[-1633313603 * this.index - 1] - 128 & 255) + ((this.array[this.index * -1633313603 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int ef() {
      this.index += 1262255402;
      int var2 = ((this.array[-1633313603 * this.index - 1] & 255) << 8) + (this.array[-1633313603 * this.index - 2] - 128 & 255);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public void ez(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 8);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 16);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)var1;
   }

   public int ej() {
      this.index += -254100545;
      return ((this.array[-1633313603 * this.index - 2] & 255) << 8) + ((this.array[-1633313603 * this.index - 1] & 255) << 16) + (this.array[-1633313603 * this.index - 3] & 255);
   }

   public int ea() {
      this.index += -254100545;
      return ((this.array[this.index * -1633313603 - 2] & 255) << 16) + ((this.array[-1633313603 * this.index - 3] & 255) << 8) + (this.array[this.index * -1633313603 - 1] & 255);
   }

   public int eu() {
      this.index += -254100545;
      int var2 = ((this.array[-1633313603 * this.index - 1] & 255) << 16) + ((this.array[this.index * -1633313603 - 2] & 255) << 8) + (this.array[-1633313603 * this.index - 3] & 255);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public void p4LE16(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)var1;
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 8);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 16);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 24);
   }

   public void p4ME(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 8);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)var1;
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 24);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 16);
   }

   public void el(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 16);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 24);
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)var1;
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 >> 8);
   }

   public int en() {
      this.index += -1770456492;
      return ((this.array[this.index * -1633313603 - 2] & 255) << 16) + ((this.array[-1633313603 * this.index - 1] & 255) << 24) + ((this.array[this.index * -1633313603 - 3] & 255) << 8) + (this.array[this.index * -1633313603 - 4] & 255);
   }

   public int er() {
      this.index += -1770456492;
      return ((this.array[this.index * -1633313603 - 2] & 255) << 24) + ((this.array[-1633313603 * this.index - 1] & 255) << 16) + ((this.array[this.index * -1633313603 - 4] & 255) << 8) + (this.array[this.index * -1633313603 - 3] & 255);
   }

   public int eg() {
      this.index += -1770456492;
      return (this.array[-1633313603 * this.index - 2] & 255) + ((this.array[this.index * -1633313603 - 4] & 255) << 16) + ((this.array[this.index * -1633313603 - 3] & 255) << 24) + ((this.array[this.index * -1633313603 - 1] & 255) << 8);
   }
}
