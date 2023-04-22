public class dp {
   int[] ao;
   IndexedSprite[] af;
   int[] aq = new int[256];
   int al = 0;
   int[] at;
   int[] ah;
   int[] ay;
   int[] ar;
   static Rasterizer3D jz;
   int ai = 0;
   int[] ag;
   int[] av;
   int aj = 0;
   int as = 0;
   int am = 0;
   int[] aa;
   int ax = 0;

   void af() {
      this.aa = new int[256];

      int var2;
      for(var2 = 0; var2 < 64; ++var2) {
         this.aa[var2] = var2 * 262144;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.aa[64 + var2] = 16711680 + var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.aa[var2 + 128] = 4 * var2 + 16776960;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.aa[var2 + 192] = 16777215;
      }

      this.ay = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.ay[var2] = var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.ay[64 + var2] = var2 * 4 + '\uff00';
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.ay[var2 + 128] = 262144 * var2 + '\uffff';
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.ay[192 + var2] = 16777215;
      }

      this.ao = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.ao[var2] = var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.ao[var2 + 64] = 262144 * var2 + 255;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.ao[128 + var2] = 16711935 + var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.ao[var2 + 192] = 16777215;
      }

      this.at = new int[256];
      this.am = 0;
      this.av = new int['耀'];
      this.ar = new int['耀'];
      this.at((IndexedSprite)null);
      this.ag = new int['耀'];
      this.ah = new int['耀'];
   }

   final int au(int var1, int var2, int var3) {
      int var5 = 256 - var3;
      return ((var2 & 16711935) * var3 + (var1 & 16711935) * var5 & -16711936) + (var3 * (var2 & '\uff00') + var5 * (var1 & '\uff00') & 16711680) >> 8;
   }

   void aw(int var1, int var2) {
      if (this.ag == null) {
         this.af();
      }

      if (0 == 72639573 * this.aj) {
         this.aj = 206403837 * var2;
      }

      int var4 = var2 - 72639573 * this.aj;
      if (var4 >= 256) {
         var4 = 0;
      }

      this.aj = var2 * 206403837;
      if (var4 > 0) {
         this.ac(var4);
      }

      this.ab(var1);
   }

   final void ab(int var1) {
      int var3 = this.at.length;
      if (-1137135943 * this.ax > 0) {
         this.aq(-1137135943 * this.ax, this.ay);
      } else if (this.ai * 564904941 > 0) {
         this.aq(this.ai * 564904941, this.ao);
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            this.at[var4] = this.aa[var4];
         }
      }

      this.al(var1);
   }

   final void ac(int var1) {
      this.am += var1 * 55892096;
      int var3;
      if (1156448081 * this.am > this.av.length) {
         this.am -= -569988687 * this.av.length;
         var3 = (int)(Math.random() * 12.0);
         this.at(this.af[var3]);
      }

      var3 = 0;
      int var4 = var1 * 128;
      int var5 = 128 * (256 - var1);

      int var7;
      for(int var6 = 0; var6 < var5; ++var6) {
         var7 = this.ag[var3 + var4] - this.av[this.am * 1156448081 + var3 & this.av.length - 1] * var1 / 6;
         if (var7 < 0) {
            var7 = 0;
         }

         this.ag[var3++] = var7;
      }

      byte var16 = 10;
      var7 = 128 - var16;

      int var8;
      int var11;
      for(var8 = 256 - var1; var8 < 256; ++var8) {
         int var9 = 128 * var8;

         for(int var10 = 0; var10 < 128; ++var10) {
            var11 = (int)(Math.random() * 100.0);
            if (var11 < 50 && var10 > var16 && var10 < var7) {
               this.ag[var10 + var9] = 255;
            } else {
               this.ag[var9 + var10] = 0;
            }
         }
      }

      if (-1137135943 * this.ax > 0) {
         this.ax -= var1 * 186375716;
      }

      if (564904941 * this.ai > 0) {
         this.ai -= 1196181396 * var1;
      }

      if (0 == -1137135943 * this.ax && 0 == 564904941 * this.ai) {
         var8 = (int)(Math.random() * (double)(2000 / var1));
         if (0 == var8) {
            this.ax = 467543040;
         }

         if (var8 == 1) {
            this.ai = 1279759360;
         }
      }

      for(var8 = 0; var8 < 256 - var1; ++var8) {
         this.aq[var8] = this.aq[var1 + var8];
      }

      for(var8 = 256 - var1; var8 < 256; ++var8) {
         this.aq[var8] = (int)(Math.sin((double)(370886257 * this.al) / 14.0) * 16.0 + Math.sin((double)(this.al * 370886257) / 15.0) * 14.0 + Math.sin((double)(370886257 * this.al) / 16.0) * 12.0);
         this.al += -187712879;
      }

      this.as += 1950933189 * var1;
      var8 = ((Client.ep * -1886224337 & 1) + var1) / 2;
      if (var8 > 0) {
         short var17 = 128;
         byte var18 = 2;
         var11 = 128 - var18 - var18;

         int var12;
         int var13;
         int var14;
         for(var12 = 0; var12 < -692470508 * this.as; ++var12) {
            var13 = (int)(Math.random() * (double)var11) + var18;
            var14 = (int)(Math.random() * (double)var17) + var17;
            this.ag[var13 + (var14 << 7)] = 192;
         }

         this.as = 0;

         int var15;
         for(var12 = 0; var12 < 256; ++var12) {
            var13 = 0;
            var14 = var12 * 128;

            for(var15 = -var8; var15 < 128; ++var15) {
               if (var8 + var15 < 128) {
                  var13 += this.ag[var14 + var15 + var8];
               }

               if (var15 - (1 + var8) >= 0) {
                  var13 -= this.ag[var15 + var14 - (var8 + 1)];
               }

               if (var15 >= 0) {
                  this.ah[var15 + var14] = var13 / (2 * var8 + 1);
               }
            }
         }

         for(var12 = 0; var12 < 128; ++var12) {
            var13 = 0;

            for(var14 = -var8; var14 < 256; ++var14) {
               var15 = 128 * var14;
               if (var8 + var14 < 256) {
                  var13 += this.ah[var15 + var12 + var8 * 128];
               }

               if (var14 - (1 + var8) >= 0) {
                  var13 -= this.ah[var15 + var12 - 128 * (1 + var8)];
               }

               if (var14 >= 0) {
                  this.ag[var12 + var15] = var13 / (var8 * 2 + 1);
               }
            }
         }
      }

   }

   final void al(int var1) {
      int var3 = 0;

      for(int var4 = 1; var4 < 255; ++var4) {
         int var5 = this.aq[var4] * (256 - var4) / 256;
         int var6 = var5 + var1;
         int var7 = 0;
         int var8 = 128;
         if (var6 < 0) {
            var7 = -var6;
            var6 = 0;
         }

         if (var6 + 128 >= ia.rasterProvider.ac * 1313069155) {
            var8 = ia.rasterProvider.ac * 1313069155 - var6;
         }

         int var9 = var6 + (var4 + 8) * ia.rasterProvider.ac * 1313069155;
         var3 += var7;

         for(int var10 = var7; var10 < var8; ++var10) {
            int var11 = this.ag[var3++];
            int var12 = var9 % Rasterizer2D.Rasterizer2D_width;
            if (0 != var11 && var12 >= Rasterizer2D.Rasterizer2D_xClipStart && var12 < Rasterizer2D.Rasterizer2D_xClipEnd) {
               int var13 = var11;
               int var14 = 256 - var11;
               var11 = this.at[var11];
               int var15 = ia.rasterProvider.pixels[var9];
               ia.rasterProvider.pixels[var9++] = -16777216 | (var13 * (var11 & 16711935) + var14 * (var15 & 16711935) & -16711936) + (var13 * (var11 & '\uff00') + var14 * (var15 & '\uff00') & 16711680) >> 8;
            } else {
               ++var9;
            }
         }

         var3 += 128 - var8;
      }

   }

   final void at(IndexedSprite var1) {
      int var3;
      for(var3 = 0; var3 < this.av.length; ++var3) {
         this.av[var3] = 0;
      }

      int var4;
      for(var3 = 0; var3 < 5000; ++var3) {
         var4 = (int)(Math.random() * 128.0 * 256.0);
         this.av[var4] = (int)(Math.random() * 256.0);
      }

      int var5;
      int var6;
      for(var3 = 0; var3 < 20; ++var3) {
         for(var4 = 1; var4 < 255; ++var4) {
            for(var5 = 1; var5 < 127; ++var5) {
               var6 = (var4 << 7) + var5;
               this.ar[var6] = (this.av[128 + var6] + this.av[var6 - 128] + this.av[var6 - 1] + this.av[1 + var6]) / 4;
            }
         }

         int[] var9 = this.av;
         this.av = this.ar;
         this.ar = var9;
      }

      if (null != var1) {
         var3 = 0;

         for(var4 = 0; var4 < var1.subHeight; ++var4) {
            for(var5 = 0; var5 < var1.subWidth; ++var5) {
               if (var1.pixels[var3++] != 0) {
                  var6 = var5 + 16 + var1.xOffset;
                  int var7 = 16 + var4 + var1.yOffset;
                  int var8 = var6 + (var7 << 7);
                  this.av[var8] = 0;
               }
            }
         }
      }

   }

   final void aq(int var1, int[] var2) {
      int var4 = this.at.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         if (var1 > 768) {
            this.at[var5] = this.au(this.aa[var5], var2[var5], 1024 - var1);
         } else if (var1 > 256) {
            this.at[var5] = var2[var5];
         } else {
            this.at[var5] = this.au(var2[var5], this.aa[var5], 256 - var1);
         }
      }

   }

   static int aw_renamed(PacketBit var0) {
      int var2 = var0.gBit(2);
      int var3;
      if (var2 == 0) {
         var3 = 0;
      } else if (var2 == 1) {
         var3 = var0.gBit(5);
      } else if (2 == var2) {
         var3 = var0.gBit(8);
      } else {
         var3 = var0.gBit(11);
      }

      return var3;
   }

   dp(IndexedSprite[] var1) {
      this.af = var1;
      this.af();
   }

   static ex ab_renamed(int var0) {
      ex var2 = (ex)StructType.findEnumerated(Messages.au_renamed(), var0);
      if (null == var2) {
         var2 = ex.af;
      }

      return var2;
   }

   static int ac_renamed(int var0, ClientScript var1, boolean var2) {
      int var4;
      int var5;
      if (100 == var0) {
         Interpreter.Interpreter_intStackSize -= 1281407919;
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
         var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
         int var12 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2];
         if (var5 == 0) {
            throw new RuntimeException();
         } else {
            Component var7 = gh.an_renamed(var4);
            if (null == var7.children) {
               var7.children = new Component[1 + var12];
            }

            if (var7.children.length <= var12) {
               Component[] var8 = new Component[1 + var12];

               for(int var9 = 0; var9 < var7.children.length; ++var9) {
                  var8[var9] = var7.children[var9];
               }

               var7.children = var8;
            }

            if (var12 > 0 && var7.children[var12 - 1] == null) {
               throw new RuntimeException("" + (var12 - 1));
            } else {
               Component var13 = new Component();
               var13.bg = var5 * -1183495331;
               var13.parentId = (var13.id = 1 * var7.id) * -1942978835;
               var13.childIndex = var12 * -1274125071;
               var13.isIf3 = true;
               if (12 == var5) {
                  var13.bt();
                  var13.bj().bp(new dn(var13));
                  var13.bj().bl(new dy(var13));
               }

               var7.children[var12] = var13;
               if (var2) {
                  SoundSystem.ag = var13;
               } else {
                  an.ai = var13;
               }

               fw.ma_renamed(var7);
               return 1;
            }
         }
      } else {
         Component var10;
         if (var0 == 101) {
            var10 = var2 ? SoundSystem.ag : an.ai;
            Component var11 = gh.an_renamed(1713081171 * var10.id);
            var11.children[55577617 * var10.childIndex] = null;
            fw.ma_renamed(var11);
            return 1;
         } else if (102 == var0) {
            var10 = gh.an_renamed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            var10.children = null;
            fw.ma_renamed(var10);
            return 1;
         } else if (200 != var0) {
            if (201 == var0) {
               var10 = gh.an_renamed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
               if (null != var10) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                  if (var2) {
                     SoundSystem.ag = var10;
                  } else {
                     an.ai = var10;
                  }
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var5 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            Component var6 = SoundSystem.getComponentChild(var4, var5);
            if (var6 != null && -1 != var5) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
               if (var2) {
                  SoundSystem.ag = var6;
               } else {
                  an.ai = var6;
               }
            } else {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }

            return 1;
         }
      }
   }

   static final void ar_renamed(String var0, int var1) {
      PacketBitNode var3 = mi.an_renamed(ClientProt.ba, Client.packetWriter.au);
      var3.bit.bu(DynamicObject.bc_renamed(var0) + 1);
      var3.bit.bh(var0);
      var3.bit.bu(var1);
      Client.packetWriter.aw(var3);
   }

   void an() {
      this.aa = null;
      this.ay = null;
      this.ao = null;
      this.at = null;
      this.av = null;
      this.ar = null;
      this.ag = null;
      this.ah = null;
      this.am = 0;
      this.as = 0;
   }
}
