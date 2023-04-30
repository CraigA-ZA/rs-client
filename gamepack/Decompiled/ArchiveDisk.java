import java.io.EOFException;
import java.io.IOException;

public final class ArchiveDisk {
   static byte[] ArchiveDisk_buffer = new byte[520];
   int archive;
   int maxEntrySize = 390060472;
   BufferedFile datFile = null;
   BufferedFile idxFile = null;

   public ArchiveDisk(int var1, BufferedFile var2, BufferedFile var3, int var4) {
      this.archive = var1 * -2028882017;
      this.datFile = var2;
      this.idxFile = var3;
      this.maxEntrySize = var4 * -10367997;
   }

   public byte[] read(int var1) {
      synchronized(this.datFile) {
         try {
            Object var10000;
            if (this.idxFile.length() < (long)(6 + 6 * var1)) {
               var10000 = null;
               return (byte[])var10000;
            } else {
               this.idxFile.seek((long)(var1 * 6));
               this.idxFile.read(ArchiveDisk_buffer, 0, 6);
               int var4 = (ArchiveDisk_buffer[2] & 255) + ((ArchiveDisk_buffer[0] & 255) << 16) + ((ArchiveDisk_buffer[1] & 255) << 8);
               int var5 = ((ArchiveDisk_buffer[4] & 255) << 8) + ((ArchiveDisk_buffer[3] & 255) << 16) + (ArchiveDisk_buffer[5] & 255);
               if (var4 < 0 || var4 > -479445333 * this.maxEntrySize) {
                  var10000 = null;
                  return (byte[])var10000;
               } else if (var5 <= 0 || (long)var5 > this.datFile.length() / 520L) {
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

                     this.datFile.seek((long)var5 * 520L);
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
                        this.datFile.read(ArchiveDisk_buffer, 0, var9 + var14);
                        var10 = (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8) + ((ArchiveDisk_buffer[1] & 255) << 16) + ((ArchiveDisk_buffer[0] & 255) << 24);
                        var11 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[4] & 255) << 8);
                        var12 = (ArchiveDisk_buffer[8] & 255) + ((ArchiveDisk_buffer[6] & 255) << 16) + ((ArchiveDisk_buffer[7] & 255) << 8);
                        var13 = ArchiveDisk_buffer[9] & 255;
                     } else {
                        if (var9 > 512) {
                           var9 = 512;
                        }

                        var14 = 8;
                        this.datFile.read(ArchiveDisk_buffer, 0, var14 + var9);
                        var10 = ((ArchiveDisk_buffer[0] & 255) << 8) + (ArchiveDisk_buffer[1] & 255);
                        var11 = ((ArchiveDisk_buffer[2] & 255) << 8) + (ArchiveDisk_buffer[3] & 255);
                        var12 = ((ArchiveDisk_buffer[5] & 255) << 8) + ((ArchiveDisk_buffer[4] & 255) << 16) + (ArchiveDisk_buffer[6] & 255);
                        var13 = ArchiveDisk_buffer[7] & 255;
                     }

                     if (var10 != var1 || var8 != var11 || var13 != 290825311 * this.archive) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     if (var12 < 0 || (long)var12 > this.datFile.length() / 520L) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     int var15 = var9 + var14;

                     for(int var16 = var14; var16 < var15; ++var16) {
                        var6[var7++] = ArchiveDisk_buffer[var16];
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
      synchronized(this.datFile) {
         if (var3 >= 0 && var3 <= -479445333 * this.maxEntrySize) {
            boolean var6 = this.write0(var1, var2, var3, true);
            if (!var6) {
               var6 = this.write0(var1, var2, var3, false);
            }

            return var6;
         } else {
            throw new IllegalArgumentException("" + this.archive * 290825311 + ',' + var1 + ',' + var3);
         }
      }
   }

   boolean write0(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.datFile) {
         try {
            int var7;
            boolean var10000;
            if (var4) {
               if (this.idxFile.length() < (long)(6 * var1 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.idxFile.seek((long)(6 * var1));
               this.idxFile.read(ArchiveDisk_buffer, 0, 6);
               var7 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[3] & 255) << 16) + ((ArchiveDisk_buffer[4] & 255) << 8);
               if (var7 <= 0 || (long)var7 > this.datFile.length() / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var7 = (int)((this.datFile.length() + 519L) / 520L);
               if (0 == var7) {
                  var7 = 1;
               }
            }

            ArchiveDisk_buffer[0] = (byte)(var3 >> 16);
            ArchiveDisk_buffer[1] = (byte)(var3 >> 8);
            ArchiveDisk_buffer[2] = (byte)var3;
            ArchiveDisk_buffer[3] = (byte)(var7 >> 16);
            ArchiveDisk_buffer[4] = (byte)(var7 >> 8);
            ArchiveDisk_buffer[5] = (byte)var7;
            this.idxFile.seek((long)(var1 * 6));
            this.idxFile.write(ArchiveDisk_buffer, 0, 6);
            int var8 = 0;
            int var9 = 0;

            while(true) {
               if (var8 < var3) {
                  label169: {
                     int var10 = 0;
                     int var11;
                     if (var4) {
                        this.datFile.seek((long)var7 * 520L);
                        int var12;
                        int var13;
                        if (var1 > 65535) {
                           try {
                              this.datFile.read(ArchiveDisk_buffer, 0, 10);
                           } catch (EOFException var17) {
                              break label169;
                           }

                           var11 = (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8) + ((ArchiveDisk_buffer[1] & 255) << 16) + ((ArchiveDisk_buffer[0] & 255) << 24);
                           var12 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[4] & 255) << 8);
                           var10 = ((ArchiveDisk_buffer[7] & 255) << 8) + ((ArchiveDisk_buffer[6] & 255) << 16) + (ArchiveDisk_buffer[8] & 255);
                           var13 = ArchiveDisk_buffer[9] & 255;
                        } else {
                           try {
                              this.datFile.read(ArchiveDisk_buffer, 0, 8);
                           } catch (EOFException var16) {
                              break label169;
                           }

                           var11 = (ArchiveDisk_buffer[1] & 255) + ((ArchiveDisk_buffer[0] & 255) << 8);
                           var12 = (ArchiveDisk_buffer[3] & 255) + ((ArchiveDisk_buffer[2] & 255) << 8);
                           var10 = ((ArchiveDisk_buffer[5] & 255) << 8) + ((ArchiveDisk_buffer[4] & 255) << 16) + (ArchiveDisk_buffer[6] & 255);
                           var13 = ArchiveDisk_buffer[7] & 255;
                        }

                        if (var1 != var11 || var12 != var9 || var13 != 290825311 * this.archive) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var10 < 0 || (long)var10 > this.datFile.length() / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (0 == var10) {
                        var4 = false;
                        var10 = (int)((this.datFile.length() + 519L) / 520L);
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

                        ArchiveDisk_buffer[0] = (byte)(var1 >> 24);
                        ArchiveDisk_buffer[1] = (byte)(var1 >> 16);
                        ArchiveDisk_buffer[2] = (byte)(var1 >> 8);
                        ArchiveDisk_buffer[3] = (byte)var1;
                        ArchiveDisk_buffer[4] = (byte)(var9 >> 8);
                        ArchiveDisk_buffer[5] = (byte)var9;
                        ArchiveDisk_buffer[6] = (byte)(var10 >> 16);
                        ArchiveDisk_buffer[7] = (byte)(var10 >> 8);
                        ArchiveDisk_buffer[8] = (byte)var10;
                        ArchiveDisk_buffer[9] = (byte)(290825311 * this.archive);
                        this.datFile.seek((long)var7 * 520L);
                        this.datFile.write(ArchiveDisk_buffer, 0, 10);
                        var11 = var3 - var8;
                        if (var11 > 510) {
                           var11 = 510;
                        }

                        this.datFile.write(var2, var8, var11);
                        var8 += var11;
                     } else {
                        if (var3 - var8 <= 512) {
                           var10 = 0;
                        }

                        ArchiveDisk_buffer[0] = (byte)(var1 >> 8);
                        ArchiveDisk_buffer[1] = (byte)var1;
                        ArchiveDisk_buffer[2] = (byte)(var9 >> 8);
                        ArchiveDisk_buffer[3] = (byte)var9;
                        ArchiveDisk_buffer[4] = (byte)(var10 >> 16);
                        ArchiveDisk_buffer[5] = (byte)(var10 >> 8);
                        ArchiveDisk_buffer[6] = (byte)var10;
                        ArchiveDisk_buffer[7] = (byte)(290825311 * this.archive);
                        this.datFile.seek(520L * (long)var7);
                        this.datFile.write(ArchiveDisk_buffer, 0, 8);
                        var11 = var3 - var8;
                        if (var11 > 512) {
                           var11 = 512;
                        }

                        this.datFile.write(var2, var8, var11);
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
      return "" + 290825311 * this.archive;
   }
}
