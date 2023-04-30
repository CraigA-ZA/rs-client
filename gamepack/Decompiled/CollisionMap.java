public class CollisionMap {
   int xSize;
   int yInset = 0;
   int ySize;
   int xInset = 0;
   public int[][] flags;

   public CollisionMap(int var1, int var2) {
      this.xSize = var1 * 1684986745;
      this.ySize = -2120741623 * var2;
      this.flags = new int[this.xSize * 1145675465][this.ySize * -1150578375];
      this.clear();
   }

   public void clear() {
      for(int var2 = 0; var2 < 1145675465 * this.xSize; ++var2) {
         for(int var3 = 0; var3 < this.ySize * -1150578375; ++var3) {
            if (var2 != 0 && 0 != var3 && var2 < this.xSize * 1145675465 - 5 && var3 < this.ySize * -1150578375 - 5) {
               this.flags[var2][var3] = 16777216;
            } else {
               this.flags[var2][var3] = 16777215;
            }
         }
      }

   }

   public void an(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 1724654229 * this.xInset;
      var2 -= -216630539 * this.yInset;
      if (0 == var3) {
         if (var4 == 0) {
            this.ab(var1, var2, 128);
            this.ab(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 2);
            this.ab(var1, 1 + var2, 32);
         }

         if (2 == var4) {
            this.ab(var1, var2, 8);
            this.ab(1 + var1, var2, 128);
         }

         if (3 == var4) {
            this.ab(var1, var2, 32);
            this.ab(var1, var2 - 1, 2);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (0 == var4) {
            this.ab(var1, var2, 1);
            this.ab(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 4);
            this.ab(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.ab(var1, var2, 16);
            this.ab(1 + var1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.ab(var1, var2, 64);
            this.ab(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.ab(var1, var2, 130);
            this.ab(var1 - 1, var2, 8);
            this.ab(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 10);
            this.ab(var1, 1 + var2, 32);
            this.ab(1 + var1, var2, 128);
         }

         if (2 == var4) {
            this.ab(var1, var2, 40);
            this.ab(var1 + 1, var2, 128);
            this.ab(var1, var2 - 1, 2);
         }

         if (3 == var4) {
            this.ab(var1, var2, 160);
            this.ab(var1, var2 - 1, 2);
            this.ab(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.ab(var1, var2, 65536);
               this.ab(var1 - 1, var2, 4096);
            }

            if (1 == var4) {
               this.ab(var1, var2, 1024);
               this.ab(var1, 1 + var2, 16384);
            }

            if (2 == var4) {
               this.ab(var1, var2, 4096);
               this.ab(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.ab(var1, var2, 16384);
               this.ab(var1, var2 - 1, 1024);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (0 == var4) {
               this.ab(var1, var2, 512);
               this.ab(var1 - 1, 1 + var2, 8192);
            }

            if (var4 == 1) {
               this.ab(var1, var2, 2048);
               this.ab(var1 + 1, 1 + var2, 32768);
            }

            if (var4 == 2) {
               this.ab(var1, var2, 8192);
               this.ab(var1 + 1, var2 - 1, 512);
            }

            if (3 == var4) {
               this.ab(var1, var2, 32768);
               this.ab(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.ab(var1, var2, 66560);
               this.ab(var1 - 1, var2, 4096);
               this.ab(var1, 1 + var2, 16384);
            }

            if (var4 == 1) {
               this.ab(var1, var2, 5120);
               this.ab(var1, 1 + var2, 16384);
               this.ab(1 + var1, var2, 65536);
            }

            if (var4 == 2) {
               this.ab(var1, var2, 20480);
               this.ab(var1 + 1, var2, 65536);
               this.ab(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.ab(var1, var2, 81920);
               this.ab(var1, var2 - 1, 1024);
               this.ab(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void aw(int var1, int var2, int var3, int var4, boolean var5) {
      int var7 = 256;
      if (var5) {
         var7 += 131072;
      }

      var1 -= this.xInset * 1724654229;
      var2 -= -216630539 * this.yInset;

      for(int var8 = var1; var8 < var1 + var3; ++var8) {
         if (var8 >= 0 && var8 < 1145675465 * this.xSize) {
            for(int var9 = var2; var9 < var4 + var2; ++var9) {
               if (var9 >= 0 && var9 < -1150578375 * this.ySize) {
                  this.ab(var8, var9, var7);
               }
            }
         }
      }

   }

   public void ac(int var1, int var2) {
      var1 -= this.xInset * 1724654229;
      var2 -= -216630539 * this.yInset;
      int[] var10000 = this.flags[var1];
      var10000[var2] |= 2097152;
   }

   public void au(int var1, int var2) {
      var1 -= 1724654229 * this.xInset;
      var2 -= this.yInset * -216630539;
      int[] var10000 = this.flags[var1];
      var10000[var2] |= 262144;
   }

   void ab(int var1, int var2, int var3) {
      int[] var10000 = this.flags[var1];
      var10000[var2] |= var3;
   }

   public void aq(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.xInset * 1724654229;
      var2 -= -216630539 * this.yInset;
      if (var3 == 0) {
         if (var4 == 0) {
            this.at(var1, var2, 128);
            this.at(var1 - 1, var2, 8);
         }

         if (1 == var4) {
            this.at(var1, var2, 2);
            this.at(var1, 1 + var2, 32);
         }

         if (var4 == 2) {
            this.at(var1, var2, 8);
            this.at(1 + var1, var2, 128);
         }

         if (var4 == 3) {
            this.at(var1, var2, 32);
            this.at(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (0 == var4) {
            this.at(var1, var2, 1);
            this.at(var1 - 1, var2 + 1, 16);
         }

         if (1 == var4) {
            this.at(var1, var2, 4);
            this.at(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.at(var1, var2, 16);
            this.at(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.at(var1, var2, 64);
            this.at(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (0 == var4) {
            this.at(var1, var2, 130);
            this.at(var1 - 1, var2, 8);
            this.at(var1, 1 + var2, 32);
         }

         if (var4 == 1) {
            this.at(var1, var2, 10);
            this.at(var1, var2 + 1, 32);
            this.at(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.at(var1, var2, 40);
            this.at(var1 + 1, var2, 128);
            this.at(var1, var2 - 1, 2);
         }

         if (3 == var4) {
            this.at(var1, var2, 160);
            this.at(var1, var2 - 1, 2);
            this.at(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.at(var1, var2, 65536);
               this.at(var1 - 1, var2, 4096);
            }

            if (1 == var4) {
               this.at(var1, var2, 1024);
               this.at(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.at(var1, var2, 4096);
               this.at(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.at(var1, var2, 16384);
               this.at(var1, var2 - 1, 1024);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (var4 == 0) {
               this.at(var1, var2, 512);
               this.at(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.at(var1, var2, 2048);
               this.at(var1 + 1, var2 + 1, 32768);
            }

            if (2 == var4) {
               this.at(var1, var2, 8192);
               this.at(var1 + 1, var2 - 1, 512);
            }

            if (3 == var4) {
               this.at(var1, var2, 32768);
               this.at(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.at(var1, var2, 66560);
               this.at(var1 - 1, var2, 4096);
               this.at(var1, 1 + var2, 16384);
            }

            if (1 == var4) {
               this.at(var1, var2, 5120);
               this.at(var1, var2 + 1, 16384);
               this.at(var1 + 1, var2, 65536);
            }

            if (2 == var4) {
               this.at(var1, var2, 20480);
               this.at(1 + var1, var2, 65536);
               this.at(var1, var2 - 1, 1024);
            }

            if (3 == var4) {
               this.at(var1, var2, 81920);
               this.at(var1, var2 - 1, 1024);
               this.at(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void al(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var8 = 256;
      if (var6) {
         var8 += 131072;
      }

      var1 -= this.xInset * 1724654229;
      var2 -= this.yInset * -216630539;
      int var9;
      if (1 == var5 || var5 == 3) {
         var9 = var3;
         var3 = var4;
         var4 = var9;
      }

      for(var9 = var1; var9 < var3 + var1; ++var9) {
         if (var9 >= 0 && var9 < this.xSize * 1145675465) {
            for(int var10 = var2; var10 < var4 + var2; ++var10) {
               if (var10 >= 0 && var10 < -1150578375 * this.ySize) {
                  this.at(var9, var10, var8);
               }
            }
         }
      }

   }

   void at(int var1, int var2, int var3) {
      int[] var10000 = this.flags[var1];
      var10000[var2] &= ~var3;
   }

   public void aa(int var1, int var2) {
      var1 -= 1724654229 * this.xInset;
      var2 -= -216630539 * this.yInset;
      int[] var10000 = this.flags[var1];
      var10000[var2] &= -262145;
   }

   static void hy_renamed(int var0, int var1) {
      if (aj.clientPreferences.am() != 0 && -1 != var0) {
         Message.aw_renamed(hc.archive11, var0, 0, aj.clientPreferences.am(), false);
         Client.tf = true;
      }

   }
}
