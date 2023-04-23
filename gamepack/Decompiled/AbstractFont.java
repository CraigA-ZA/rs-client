import java.util.Random;

public abstract class AbstractFont extends Rasterizer2D {
   public static IndexedSprite[] ay;
   static int ag = -1;
   static int ah = -1;
   static int ai = -1;
   static int aj = 0;
   static int am = 256;
   static int ar = 0;
   static int as = 0;
   static int av = 0;
   static int ax = -1;
   static String[] az = new String[100];
   static Random ak = new Random();
   byte[] ao;
   byte[][] an = new byte[256][];
   int[] ab;
   int[] ac;
   int[] aq;
   int[] au;
   int[] aw;
   public int aa;
   public int al = 0;
   public int at;

   AbstractFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.ab = var2;
      this.aq = var3;
      this.ac = var4;
      this.au = var5;
      this.readMetrics(var1);
      this.an = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if (this.aq[var10] < var8 && this.au[var10] != 0) {
            var8 = this.aq[var10];
         }

         if (this.aq[var10] + this.au[var10] > var9) {
            var9 = this.aq[var10] + this.au[var10];
         }
      }

      this.at = this.al - var8;
      this.aa = var9 - this.al;
   }

   AbstractFont(byte[] var1) {
      this.readMetrics(var1);
   }

   void readMetrics(byte[] var1) {
      this.aw = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.aw.length; ++var2) {
            this.aw[var2] = var1[var2] & 255;
         }

         this.al = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.aw[var3] = var1[var2++] & 255;
         }

         int[] var14 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var14[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var15 = new byte[256][];

         int var7;
         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var15[var6] = new byte[var14[var6]];
            var7 = 0;

            for(var8 = 0; var8 < var15[var6].length; ++var8) {
               var7 += var1[var2++];
               var15[var6][var8] = (byte)var7;
            }
         }

         byte[][] var16 = new byte[256][];

         for(var7 = 0; var7 < 256; ++var7) {
            var16[var7] = new byte[var14[var7]];
            byte var17 = 0;

            for(int var9 = 0; var9 < var16[var7].length; ++var9) {
               var17 += var1[var2++];
               var16[var7][var9] = var17;
            }
         }

         this.ao = new byte[65536];

         for(var7 = 0; var7 < 256; ++var7) {
            if (var7 != 32 && var7 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.ao[(var7 << 8) + var8] = (byte)aa_renamed(var15, var16, var4, this.aw, var14, var7, var8);
                  }
               }
            }
         }

         this.al = var4[32] + var14[32];
      }

   }

   static int aa_renamed(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   public int charWidth(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.aw[dn.af_renamed(var1) & 255];
   }

   public int stringWidth(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = PacketBitNode.ac_renamed(var7.substring(4));
                              var4 += ay[var8].aq;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.aw[(char)(dn.af_renamed(var6) & 255)];
                  if (this.ao != null && var3 != -1) {
                     var4 += this.ao[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public int breakLines(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.charWidth('<');
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.charWidth('>');
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = PacketBitNode.ac_renamed(var16.substring(4));
                        var4 += ay[var17].aq;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.charWidth(var15);
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if (var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   public int lineWidth(String var1, int var2) {
      int var3 = this.breakLines(var1, new int[]{var2}, az);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.stringWidth(az[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public int lineCount(String var1, int var2) {
      return this.breakLines(var1, new int[]{var2}, az);
   }

   public static String escapeBrackets(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < var1; ++var3) {
         var4 = var0.charAt(var3);
         if (var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      StringBuilder var9 = new StringBuilder(var1 + var2);

      for(var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 == '<') {
            var9.append("<lt>");
         } else if (var5 == '>') {
            var9.append("<gt>");
         } else {
            var9.append(var5);
         }
      }

      return var9.toString();
   }

   public Bounds av(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.stringWidth(var3) / 2;
         var6 += this.stringWidth(var3.substring(0, var1));
         int var7 = var5 - this.at;
         int var8 = this.stringWidth(var3.substring(var1, var1 + var2));
         int var9 = this.at + this.aa;
         return new Bounds(var6, var7, var8, var9);
      } else {
         return new Bounds(var4, var5, 0, 0);
      }
   }

   public void draw(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.reset(var4, var5);
         this.draw0(var1, var2, var3);
      }
   }

   public void drawAlpha(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.reset(var4, var5);
         am = var6;
         this.draw0(var1, var2, var3);
      }
   }

   public void drawRightAligned(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.reset(var4, var5);
         this.draw0(var1, var2 - this.stringWidth(var1), var3);
      }
   }

   public void drawCentered(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.reset(var4, var5);
         this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3);
      }
   }

   public int drawLines(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.az(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   public int az(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         this.reset(var6, var7);
         am = var8;
         if (var11 == 0) {
            var11 = this.al;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.at + this.aa + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.breakLines(var1, var12, az);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         int var15;
         if (var10 == 0) {
            var14 = var3 + this.at;
         } else if (var10 == 1) {
            var14 = var3 + this.at + (var5 - this.at - this.aa - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.aa - (var13 - 1) * var11;
         } else {
            var15 = (var5 - this.at - this.aa - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.at + var15;
            var11 += var15;
         }

         for(var15 = 0; var15 < var13; ++var15) {
            if (var9 == 0) {
               this.draw0(az[var15], var2, var14);
            } else if (var9 == 1) {
               this.draw0(az[var15], var2 + (var4 - this.stringWidth(az[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.draw0(az[var15], var2 + var4 - this.stringWidth(az[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.draw0(az[var15], var2, var14);
            } else {
               this.calculateLineJustification(az[var15], var4);
               this.draw0(az[var15], var2, var14);
               as = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public rg ad(oa var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.aw()) {
         this.reset(var4, var5);
         var3 -= this.al;

         for(int var7 = 0; var7 < var1.ac(); ++var7) {
            om var8 = var1.al(var7);
            if (var6 != -1 && var8.aw * -727185157 > var6) {
               return new rg(var8.an * 1620071571, var8.aw * -727185157);
            }

            char var9 = var8.af;
            if (var9 != '\n') {
               if (var1.an(var7)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.an * 1620071571;
                  int var11 = var3 + var8.aw * -727185157;
                  int var12 = this.ac[var9];
                  int var13 = this.au[var9];
                  if (ah != -1) {
                     this.drawGlyph(this.an[var9], var10 + this.ab[var9] + 1, var11 + this.aq[var9] + 1, var12, var13, ah);
                  }

                  this.drawGlyph(this.an[var9], var10 + this.ab[var9], var11 + this.aq[var9], var12, var13, ar);
               }
            }
         }
      }

      return var1.aq();
   }

   public void drawCenteredWave(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.reset(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0 + (double)var6 / 5.0) * 5.0);
         }

         this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var7);
      }
   }

   public void drawCenteredWave2(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.reset(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0 + (double)var6 / 5.0) * 5.0);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0 + (double)var6 / 5.0) * 5.0);
         }

         this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, var7, var8);
      }
   }

   public void drawCenteredShake(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 != null) {
         this.reset(var4, var5);
         double var8 = 7.0 - (double)var7 / 8.0;
         if (var8 < 0.0) {
            var8 = 0.0;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5 + (double)var6 / 1.0) * var8);
         }

         this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var10);
      }
   }

   public void drawRandomAlphaAndSpacing(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.reset(var4, var5);
         ak.setSeed((long)var6);
         am = 192 + (ak.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((ak.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.drawWithOffsets0(var1, var2, var3, var7, (int[])null);
      }
   }

   void reset(int var1, int var2) {
      ax = -1;
      ai = -1;
      ag = var2;
      ah = var2;
      av = var1;
      ar = var1;
      am = 256;
      as = 0;
      aj = 0;
   }

   void decodeTag(String var1) {
      try {
         int var2;
         String var3;
         if (var1.startsWith("col=")) {
            var3 = var1.substring(4);
            var2 = SecureRandomFuture.au_renamed(var3, 16, true);
            ar = var2;
         } else if (var1.equals("/col")) {
            ar = av;
         } else if (var1.startsWith("str=")) {
            var3 = var1.substring(4);
            var2 = SecureRandomFuture.au_renamed(var3, 16, true);
            ax = var2;
         } else if (var1.equals("str")) {
            ax = 8388608;
         } else if (var1.equals("/str")) {
            ax = -1;
         } else if (var1.startsWith("u=")) {
            var3 = var1.substring(2);
            var2 = SecureRandomFuture.au_renamed(var3, 16, true);
            ai = var2;
         } else if (var1.equals("u")) {
            ai = 0;
         } else if (var1.equals("/u")) {
            ai = -1;
         } else if (var1.startsWith("shad=")) {
            var3 = var1.substring(5);
            var2 = SecureRandomFuture.au_renamed(var3, 16, true);
            ah = var2;
         } else if (var1.equals("shad")) {
            ah = 0;
         } else if (var1.equals("/shad")) {
            ah = ag;
         } else if (var1.equals("br")) {
            this.reset(av, ag);
         }
      } catch (Exception var4) {
      }

   }

   void calculateLineJustification(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         as = (var2 - this.stringWidth(var1) << 8) / var3;
      }

   }

   void draw0(String var1, int var2, int var3) {
      var3 -= this.al;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(dn.af_renamed(var1.charAt(var6)) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               int var9;
               if (var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              var9 = PacketBitNode.ac_renamed(var8.substring(4));
                              IndexedSprite var13 = ay[var9];
                              var13.aw(var2, var3 + this.al - var13.al);
                              var2 += var13.aq;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.decodeTag(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.ao != null && var5 != -1) {
                     var2 += this.ao[(var5 << 8) + var7];
                  }

                  int var12 = this.ac[var7];
                  var9 = this.au[var7];
                  if (var7 != ' ') {
                     if (am == 256) {
                        if (ah != -1) {
                           AbstractFont_drawGlyph(this.an[var7], var2 + this.ab[var7] + 1, var3 + this.aq[var7] + 1, var12, var9, ah);
                        }

                        this.drawGlyph(this.an[var7], var2 + this.ab[var7], var3 + this.aq[var7], var12, var9, ar);
                     } else {
                        if (ah != -1) {
                           AbstractFont_drawGlyphAlpha(this.an[var7], var2 + this.ab[var7] + 1, var3 + this.aq[var7] + 1, var12, var9, ah, am);
                        }

                        this.drawGlyphAlpha(this.an[var7], var2 + this.ab[var7], var3 + this.aq[var7], var12, var9, ar, am);
                     }
                  } else if (as > 0) {
                     aj += as;
                     var2 += aj >> 8;
                     aj &= 255;
                  }

                  int var10 = this.aw[var7];
                  if (ax != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.al * 0.7), var10, ax);
                  }

                  if (ai != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + this.al + 1, var10, ai);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   void drawWithOffsets0(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.al;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if (var1.charAt(var9) != 0) {
            char var10 = (char)(dn.af_renamed(var1.charAt(var9)) & 255);
            if (var10 == '<') {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if (var10 == '>' && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if (var11.equals("lt")) {
                     var10 = '<';
                  } else {
                     if (!var11.equals("gt")) {
                        if (var11.startsWith("img=")) {
                           try {
                              if (var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if (var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = PacketBitNode.ac_renamed(var11.substring(4));
                              IndexedSprite var18 = ay[var14];
                              var18.aw(var2 + var12, var3 + this.al - var18.al + var13);
                              var2 += var18.aq;
                              var7 = -1;
                           } catch (Exception var16) {
                           }
                        } else {
                           this.decodeTag(var11);
                        }
                        continue;
                     }

                     var10 = '>';
                  }
               }

               if (var10 == 160) {
                  var10 = ' ';
               }

               if (var6 == -1) {
                  if (this.ao != null && var7 != -1) {
                     var2 += this.ao[(var7 << 8) + var10];
                  }

                  int var17 = this.ac[var10];
                  var12 = this.au[var10];
                  if (var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if (var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if (var10 != ' ') {
                     if (am == 256) {
                        if (ah != -1) {
                           AbstractFont_drawGlyph(this.an[var10], var2 + this.ab[var10] + 1 + var13, var3 + this.aq[var10] + 1 + var14, var17, var12, ah);
                        }

                        this.drawGlyph(this.an[var10], var2 + this.ab[var10] + var13, var3 + this.aq[var10] + var14, var17, var12, ar);
                     } else {
                        if (ah != -1) {
                           AbstractFont_drawGlyphAlpha(this.an[var10], var2 + this.ab[var10] + 1 + var13, var3 + this.aq[var10] + 1 + var14, var17, var12, ah, am);
                        }

                        this.drawGlyphAlpha(this.an[var10], var2 + this.ab[var10] + var13, var3 + this.aq[var10] + var14, var17, var12, ar, am);
                     }
                  } else if (as > 0) {
                     aj += as;
                     var2 += aj >> 8;
                     aj &= 255;
                  }

                  int var15 = this.aw[var10];
                  if (ax != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.al * 0.7), var15, ax);
                  }

                  if (ai != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + this.al, var15, ai);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   static void AbstractFont_drawGlyph(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * ae;
      int var7 = ae - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < bi) {
         var10 = bi - var2;
         var4 -= var10;
         var2 = bi;
         var9 += var10 * var3;
         var6 += var10 * ae;
      }

      if (var2 + var4 > be) {
         var4 -= var2 + var4 - be;
      }

      if (var1 < bk) {
         var10 = bk - var1;
         var3 -= var10;
         var1 = bk;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var1 + var3 > bx) {
         var10 = var1 + var3 - bx;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         AbstractFont_placeGlyph(ad, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   static void AbstractFont_placeGlyph(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void AbstractFont_drawGlyphAlpha(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * ae;
      int var8 = ae - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < bi) {
         var11 = bi - var2;
         var4 -= var11;
         var2 = bi;
         var10 += var11 * var3;
         var7 += var11 * ae;
      }

      if (var2 + var4 > be) {
         var4 -= var2 + var4 - be;
      }

      if (var1 < bk) {
         var11 = bk - var1;
         var3 -= var11;
         var1 = bk;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > bx) {
         var11 = var1 + var3 - bx;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         AbstractFont_placeGlyphAlpha(ad, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   static void AbstractFont_placeGlyphAlpha(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   abstract void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);
}
