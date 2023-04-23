import java.io.EOFException;
import java.io.IOException;

public final class ArchiveDisk {
   static byte[] af = new byte[520];
   int ac;
   int au = 390060472;
   BufferedFile an = null;
   BufferedFile aw = null;

   public ArchiveDisk(int var1, BufferedFile var2, BufferedFile var3, int var4) {
      this.ac = var1 * -2028882017;
      this.an = var2;
      this.aw = var3;
      this.au = var4 * -10367997;
   }

   public byte[] read(int var1) {
      synchronized(this.an) {
         try {
            Object var10000;
            if (this.aw.length() < (long)(6 + 6 * var1)) {
               var10000 = null;
               return (byte[])var10000;
            } else {
               this.aw.seek((long)(var1 * 6));
               this.aw.read(af, 0, 6);
               int var4 = (af[2] & 255) + ((af[0] & 255) << 16) + ((af[1] & 255) << 8);
               int var5 = ((af[4] & 255) << 8) + ((af[3] & 255) << 16) + (af[5] & 255);
               if (var4 < 0 || var4 > -479445333 * this.au) {
                  var10000 = null;
                  return (byte[])var10000;
               } else if (var5 <= 0 || (long)var5 > this.an.length() / 520L) {
                  var10000 = null;
                  return (byte[])var10000;
               } else {
                  byte[] var6 = new byte[var4];
                  int var7 = 0;

                  for(int var8 = 0; var7 < var4; ++var8) {
                     if (var5 == 0) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     this.an.seek((long)var5 * 520L);
                     int var9 = var4 - var7;
                     int var10;
                     int var11;
                     int var12;
                     int var13;
                     byte var14;
                     if (var1 > 65535) {
                        if (var9 > 510) {
                           var9 = 510;
                        }

                        var14 = 10;
                        this.an.read(af, 0, var9 + var14);
                        var10 = (af[3] & 255) + ((af[2] & 255) << 8) + ((af[1] & 255) << 16) + ((af[0] & 255) << 24);
                        var11 = (af[5] & 255) + ((af[4] & 255) << 8);
                        var12 = (af[8] & 255) + ((af[6] & 255) << 16) + ((af[7] & 255) << 8);
                        var13 = af[9] & 255;
                     } else {
                        if (var9 > 512) {
                           var9 = 512;
                        }

                        var14 = 8;
                        this.an.read(af, 0, var14 + var9);
                        var10 = ((af[0] & 255) << 8) + (af[1] & 255);
                        var11 = ((af[2] & 255) << 8) + (af[3] & 255);
                        var12 = ((af[5] & 255) << 8) + ((af[4] & 255) << 16) + (af[6] & 255);
                        var13 = af[7] & 255;
                     }

                     if (var10 != var1 || var8 != var11 || var13 != 290825311 * this.ac) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     if (var12 < 0 || (long)var12 > this.an.length() / 520L) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     int var15 = var9 + var14;

                     for(int var16 = var14; var16 < var15; ++var16) {
                        var6[var7++] = af[var16];
                     }

                     var5 = var12;
                  }

                  byte[] var20 = var6;
                  return var20;
               }
            }
         } catch (IOException var18) {
            return null;
         }
      }
   }

   public boolean write(int var1, byte[] var2, int var3) {
      synchronized(this.an) {
         if (var3 >= 0 && var3 <= -479445333 * this.au) {
            boolean var6 = this.write0(var1, var2, var3, true);
            if (!var6) {
               var6 = this.write0(var1, var2, var3, false);
            }

            return var6;
         } else {
            throw new IllegalArgumentException("" + this.ac * 290825311 + ',' + var1 + ',' + var3);
         }
      }
   }

   boolean write0(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.an) {
         try {
            int var7;
            boolean var10000;
            if (var4) {
               if (this.aw.length() < (long)(6 * var1 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.aw.seek((long)(6 * var1));
               this.aw.read(af, 0, 6);
               var7 = (af[5] & 255) + ((af[3] & 255) << 16) + ((af[4] & 255) << 8);
               if (var7 <= 0 || (long)var7 > this.an.length() / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var7 = (int)((this.an.length() + 519L) / 520L);
               if (0 == var7) {
                  var7 = 1;
               }
            }

            af[0] = (byte)(var3 >> 16);
            af[1] = (byte)(var3 >> 8);
            af[2] = (byte)var3;
            af[3] = (byte)(var7 >> 16);
            af[4] = (byte)(var7 >> 8);
            af[5] = (byte)var7;
            this.aw.seek((long)(var1 * 6));
            this.aw.write(af, 0, 6);
            int var8 = 0;
            int var9 = 0;

            while(true) {
               if (var8 < var3) {
                  label169: {
                     int var10 = 0;
                     int var11;
                     if (var4) {
                        this.an.seek((long)var7 * 520L);
                        int var12;
                        int var13;
                        if (var1 > 65535) {
                           try {
                              this.an.read(af, 0, 10);
                           } catch (EOFException var17) {
                              break label169;
                           }

                           var11 = (af[3] & 255) + ((af[2] & 255) << 8) + ((af[1] & 255) << 16) + ((af[0] & 255) << 24);
                           var12 = (af[5] & 255) + ((af[4] & 255) << 8);
                           var10 = ((af[7] & 255) << 8) + ((af[6] & 255) << 16) + (af[8] & 255);
                           var13 = af[9] & 255;
                        } else {
                           try {
                              this.an.read(af, 0, 8);
                           } catch (EOFException var16) {
                              break label169;
                           }

                           var11 = (af[1] & 255) + ((af[0] & 255) << 8);
                           var12 = (af[3] & 255) + ((af[2] & 255) << 8);
                           var10 = ((af[5] & 255) << 8) + ((af[4] & 255) << 16) + (af[6] & 255);
                           var13 = af[7] & 255;
                        }

                        if (var1 != var11 || var12 != var9 || var13 != 290825311 * this.ac) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var10 < 0 || (long)var10 > this.an.length() / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (0 == var10) {
                        var4 = false;
                        var10 = (int)((this.an.length() + 519L) / 520L);
                        if (0 == var10) {
                           ++var10;
                        }

                        if (var7 == var10) {
                           ++var10;
                        }
                     }

                     if (var1 > 65535) {
                        if (var3 - var8 <= 510) {
                           var10 = 0;
                        }

                        af[0] = (byte)(var1 >> 24);
                        af[1] = (byte)(var1 >> 16);
                        af[2] = (byte)(var1 >> 8);
                        af[3] = (byte)var1;
                        af[4] = (byte)(var9 >> 8);
                        af[5] = (byte)var9;
                        af[6] = (byte)(var10 >> 16);
                        af[7] = (byte)(var10 >> 8);
                        af[8] = (byte)var10;
                        af[9] = (byte)(290825311 * this.ac);
                        this.an.seek((long)var7 * 520L);
                        this.an.write(af, 0, 10);
                        var11 = var3 - var8;
                        if (var11 > 510) {
                           var11 = 510;
                        }

                        this.an.write(var2, var8, var11);
                        var8 += var11;
                     } else {
                        if (var3 - var8 <= 512) {
                           var10 = 0;
                        }

                        af[0] = (byte)(var1 >> 8);
                        af[1] = (byte)var1;
                        af[2] = (byte)(var9 >> 8);
                        af[3] = (byte)var9;
                        af[4] = (byte)(var10 >> 16);
                        af[5] = (byte)(var10 >> 8);
                        af[6] = (byte)var10;
                        af[7] = (byte)(290825311 * this.ac);
                        this.an.seek(520L * (long)var7);
                        this.an.write(af, 0, 8);
                        var11 = var3 - var8;
                        if (var11 > 512) {
                           var11 = 512;
                        }

                        this.an.write(var2, var8, var11);
                        var8 += var11;
                     }

                     var7 = var10;
                     ++var9;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var18) {
            return false;
         }
      }
   }

   public String toString() {
      return "" + 290825311 * this.ac;
   }
}
