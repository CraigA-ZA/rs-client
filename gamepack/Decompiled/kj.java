public class kj {
   byte[][][] an;
   int af;

   kj(int var1) {
      this.af = -1275529919 * var1;
   }

   void af(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && -28927295 * this.af != 0 && null != this.an) {
         var8 = this.an(var8, var7);
         var7 = this.aw(var7);
         Rasterizer2D.eh(var1, var2, var5, var6, var3, var4, this.an[var7 - 1][var8], -28927295 * this.af, true);
      }
   }

   int an(int var1, int var2) {
      if (9 == var2) {
         var1 = 1 + var1 & 3;
      }

      if (10 == var2) {
         var1 = var1 + 3 & 3;
      }

      if (11 == var2) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   int aw(int var1) {
      if (9 != var1 && 10 != var1) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   void ac() {
      if (null == this.an) {
         this.an = new byte[8][4][];
         this.au();
         this.ab();
         this.aq();
         this.al();
         this.at();
         this.aa();
         this.ay();
         this.ao();
      }
   }

   void au() {
      byte[] var2 = new byte[-28927295 * this.af * this.af * -28927295];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.af * -28927295; ++var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[0][0] = var2;
      var2 = new byte[this.af * -28927295 * this.af * -28927295];
      var3 = 0;

      for(var4 = this.af * -28927295 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < -28927295 * this.af; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[0][1] = var2;
      var2 = new byte[this.af * -28927295 * -28927295 * this.af];
      var3 = 0;

      for(var4 = 0; var4 < -28927295 * this.af; ++var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[0][2] = var2;
      var2 = new byte[this.af * -28927295 * this.af * -28927295];
      var3 = 0;

      for(var4 = -28927295 * this.af - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[0][3] = var2;
   }

   void ab() {
      byte[] var2 = new byte[-28927295 * this.af * this.af * -28927295];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.af * -28927295 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[1][0] = var2;
      var2 = new byte[-28927295 * this.af * this.af * -28927295];
      var3 = 0;

      for(var4 = 0; var4 < this.af * -28927295; ++var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var3 >= 0 && var3 < var2.length) {
               if (var5 >= var4 << 1) {
                  var2[var3] = -1;
               }

               ++var3;
            } else {
               ++var3;
            }
         }
      }

      this.an[1][1] = var2;
      var2 = new byte[-28927295 * this.af * this.af * -28927295];
      var3 = 0;

      for(var4 = 0; var4 < this.af * -28927295; ++var4) {
         for(var5 = -28927295 * this.af - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[1][2] = var2;
      var2 = new byte[-28927295 * this.af * this.af * -28927295];
      var3 = 0;

      for(var4 = this.af * -28927295 - 1; var4 >= 0; --var4) {
         for(var5 = -28927295 * this.af - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[1][3] = var2;
   }

   void aq() {
      byte[] var2 = new byte[-28927295 * this.af * this.af * -28927295];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = -28927295 * this.af - 1; var4 >= 0; --var4) {
         for(var5 = this.af * -28927295 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[2][0] = var2;
      var2 = new byte[this.af * -28927295 * -28927295 * this.af];
      var3 = 0;

      for(var4 = this.af * -28927295 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < -28927295 * this.af; ++var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[2][1] = var2;
      var2 = new byte[-28927295 * this.af * -28927295 * this.af];
      var3 = 0;

      for(var4 = 0; var4 < this.af * -28927295; ++var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[2][2] = var2;
      var2 = new byte[-28927295 * this.af * -28927295 * this.af];
      var3 = 0;

      for(var4 = 0; var4 < -28927295 * this.af; ++var4) {
         for(var5 = -28927295 * this.af - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[2][3] = var2;
   }

   void al() {
      byte[] var2 = new byte[-28927295 * this.af * this.af * -28927295];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.af * -28927295 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < -28927295 * this.af; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[3][0] = var2;
      var2 = new byte[this.af * -28927295 * -28927295 * this.af];
      var3 = 0;

      for(var4 = 0; var4 < -28927295 * this.af; ++var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[3][1] = var2;
      var2 = new byte[-28927295 * this.af * this.af * -28927295];
      var3 = 0;

      for(var4 = 0; var4 < this.af * -28927295; ++var4) {
         for(var5 = -28927295 * this.af - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[3][2] = var2;
      var2 = new byte[this.af * -28927295 * this.af * -28927295];
      var3 = 0;

      for(var4 = -28927295 * this.af - 1; var4 >= 0; --var4) {
         for(var5 = -28927295 * this.af - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[3][3] = var2;
   }

   void at() {
      byte[] var2 = new byte[-28927295 * this.af * this.af * -28927295];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.af * -28927295 - 1; var4 >= 0; --var4) {
         for(var5 = -28927295 * this.af - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[4][0] = var2;
      var2 = new byte[-28927295 * this.af * -28927295 * this.af];
      var3 = 0;

      for(var4 = this.af * -28927295 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[4][1] = var2;
      var2 = new byte[this.af * -28927295 * -28927295 * this.af];
      var3 = 0;

      for(var4 = 0; var4 < -28927295 * this.af; ++var4) {
         for(var5 = 0; var5 < -28927295 * this.af; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[4][2] = var2;
      var2 = new byte[-28927295 * this.af * -28927295 * this.af];
      var3 = 0;

      for(var4 = 0; var4 < this.af * -28927295; ++var4) {
         for(var5 = this.af * -28927295 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.an[4][3] = var2;
   }

   void aa() {
      byte[] var10000 = new byte[this.af * -28927295 * -28927295 * this.af];
      boolean var3 = false;
      byte[] var2 = new byte[this.af * -28927295 * this.af * -28927295];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.af * -28927295; ++var4) {
         for(var5 = 0; var5 < -28927295 * this.af; ++var5) {
            if (var5 <= -28927295 * this.af / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[5][0] = var2;
      var2 = new byte[-28927295 * this.af * -28927295 * this.af];
      var6 = 0;

      for(var4 = 0; var4 < this.af * -28927295; ++var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var4 <= this.af * -28927295 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[5][1] = var2;
      var2 = new byte[-28927295 * this.af * this.af * -28927295];
      var6 = 0;

      for(var4 = 0; var4 < -28927295 * this.af; ++var4) {
         for(var5 = 0; var5 < -28927295 * this.af; ++var5) {
            if (var5 >= -28927295 * this.af / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[5][2] = var2;
      var2 = new byte[this.af * -28927295 * -28927295 * this.af];
      var6 = 0;

      for(var4 = 0; var4 < -28927295 * this.af; ++var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var4 >= -28927295 * this.af / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[5][3] = var2;
   }

   void ay() {
      byte[] var10000 = new byte[-28927295 * this.af * -28927295 * this.af];
      boolean var3 = false;
      byte[] var2 = new byte[-28927295 * this.af * -28927295 * this.af];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.af * -28927295; ++var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var5 <= var4 - -28927295 * this.af / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[6][0] = var2;
      var2 = new byte[-28927295 * this.af * this.af * -28927295];
      var6 = 0;

      for(var4 = -28927295 * this.af - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var5 <= var4 - this.af * -28927295 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[6][1] = var2;
      var2 = new byte[this.af * -28927295 * this.af * -28927295];
      var6 = 0;

      for(var4 = this.af * -28927295 - 1; var4 >= 0; --var4) {
         for(var5 = -28927295 * this.af - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.af * -28927295 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[6][2] = var2;
      var2 = new byte[this.af * -28927295 * -28927295 * this.af];
      var6 = 0;

      for(var4 = 0; var4 < this.af * -28927295; ++var4) {
         for(var5 = this.af * -28927295 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - -28927295 * this.af / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[6][3] = var2;
   }

   void ao() {
      byte[] var10000 = new byte[-28927295 * this.af * this.af * -28927295];
      boolean var3 = false;
      byte[] var2 = new byte[this.af * -28927295 * -28927295 * this.af];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < -28927295 * this.af; ++var4) {
         for(var5 = 0; var5 < -28927295 * this.af; ++var5) {
            if (var5 >= var4 - -28927295 * this.af / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[7][0] = var2;
      var2 = new byte[this.af * -28927295 * -28927295 * this.af];
      var6 = 0;

      for(var4 = -28927295 * this.af - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.af * -28927295; ++var5) {
            if (var5 >= var4 - this.af * -28927295 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[7][1] = var2;
      var2 = new byte[this.af * -28927295 * this.af * -28927295];
      var6 = 0;

      for(var4 = -28927295 * this.af - 1; var4 >= 0; --var4) {
         for(var5 = this.af * -28927295 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - -28927295 * this.af / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[7][2] = var2;
      var2 = new byte[this.af * -28927295 * this.af * -28927295];
      var6 = 0;

      for(var4 = 0; var4 < -28927295 * this.af; ++var4) {
         for(var5 = -28927295 * this.af - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - -28927295 * this.af / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.an[7][3] = var2;
   }

   static final void na_renamed(int var0, int var1, byte var2) {
      if (Client.so[var0] == null) {
         if (var2 <= -1) {
            throw new IllegalStateException();
         }
      } else {
         if (var1 >= 0) {
            if (var2 <= -1) {
               throw new IllegalStateException();
            }

            if (var1 < Client.so[var0].gIsaac1()) {
               fz var3 = (fz)Client.so[var0].aw.get(var1);
               if (-1 != var3.af) {
                  if (var2 <= -1) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               PacketBitNode var4 = mi.an_renamed(ClientProt.bh, Client.in.au);
               var4.aw.bu(3 + DynamicObject.bc_renamed(var3.aw.af()));
               var4.aw.bu(var0);
               var4.aw.p2(var1);
               var4.aw.bh(var3.aw.af());
               Client.in.aw(var4);
               return;
            }

            if (var2 <= -1) {
               throw new IllegalStateException();
            }
         }

      }
   }
}
