import accessors.RSAbstractFont;
import java.util.Random;

public abstract class ou extends th implements RSAbstractFont {
   static int as = 0;
   byte[][] an = new byte[256][];
   int[] aw;
   int[] ac;
   byte[] ao;
   static int am = 256;
   int[] aq;
   public int al = 0;
   public int at;
   public int aa;
   public static tc[] ay;
   int[] ab;
   static int ag = -1;
   static int ai = -1;
   int[] au;
   static int ah = -1;
   static int av = 0;
   static int ar = 0;
   static final int af = 256;
   static int aj = 0;
   static int ax = -1;
   static Random ak = new Random();
   static String[] az = new String[100];

   public void am(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         am = var6;
         this.bx(var1, var2, var3);
      }
   }

   ou(byte[] var1) {
      this.at(var1);
   }

   void at(byte[] var1) {
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

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var7;
         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = (byte)var7;
            }
         }

         byte[][] var12 = new byte[256][];

         for(var7 = 0; var7 < 256; ++var7) {
            var12[var7] = new byte[var10[var7]];
            byte var13 = 0;

            for(int var9 = 0; var9 < var12[var7].length; ++var9) {
               var13 += var1[var2++];
               var12[var7][var9] = var13;
            }
         }

         this.ao = new byte[65536];

         for(var7 = 0; var7 < 256; ++var7) {
            if (var7 != 32 && var7 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.ao[(var7 << 8) + var8] = (byte)aa(var11, var12, var4, this.aw, var10, var7, var8);
                  }
               }
            }
         }

         this.al = var4[32] + var10[32];
      }

   }

   public static String ci(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < var1; ++var3) {
         var4 = var0.charAt(var3);
         if (var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   public int ay(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.aw[dn.af(var1, (byte)0) & 255];
   }

   public int ao(String var1) {
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
                              int var8 = lg.ac(var7.substring(4), (byte)-126);
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
                  var4 += this.aw[(char)(dn.af(var6, (byte)51) & 255)];
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

   void dp(String var1, int var2, int var3) {
      var3 -= this.al;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(dn.af(var1.charAt(var6), (byte)72) & 255);
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
                              var9 = lg.ac(var8.substring(4), (byte)-104);
                              tc var13 = ay[var9];
                              var13.aw(var2, var3 + this.al - var13.al);
                              var2 += var13.aq;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.be(var8);
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
                           bz(this.an[var7], var2 + this.ab[var7] + 1, var3 + this.aq[var7] + 1, var12, var9, ah);
                        }

                        this.af(this.an[var7], var2 + this.ab[var7], var3 + this.aq[var7], var12, var9, ar);
                     } else {
                        if (ah != -1) {
                           bd(this.an[var7], var2 + this.ab[var7] + 1, var3 + this.aq[var7] + 1, var12, var9, ah, am);
                        }

                        this.an(this.an[var7], var2 + this.ab[var7], var3 + this.aq[var7], var12, var9, ar, am);
                     }
                  } else if (as > 0) {
                     aj += as;
                     var2 += aj >> 8;
                     aj &= 255;
                  }

                  int var10 = this.aw[var7];
                  if (ax != -1) {
                     ec(var2, var3 + (int)((double)this.al * 0.7), var10, ax);
                  }

                  if (ai != -1) {
                     ec(var2, var3 + this.al + 1, var10, ai);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   void bi(int var1, int var2) {
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

   public rg ct(oa var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.aw(-2143219860)) {
         this.bi(var4, var5);
         var3 -= this.al;

         for(int var7 = 0; var7 < var1.ac((byte)37); ++var7) {
            om var8 = var1.al(var7, -1037292745);
            if (var6 != -1 && var8.aw * -727185157 > var6) {
               return new rg(var8.an * 1620071571, var8.aw * -727185157);
            }

            char var9 = var8.af;
            if (var9 != '\n') {
               if (var1.an(var7, 931166090)) {
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
                     this.af(this.an[var9], var10 + this.ab[var9] + 1, var11 + this.aq[var9] + 1, var12, var13, ah);
                  }

                  this.af(this.an[var9], var10 + this.ab[var9], var11 + this.aq[var9], var12, var13, ar);
               }
            }
         }
      }

      return var1.aq((byte)42);
   }

   void dg(String var1, int var2) {
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
         as = (var2 - this.ao(var1) << 8) / var3;
      }

   }

   public qu av(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.ao(var3) / 2;
         var6 += this.ao(var3.substring(0, var1));
         int var7 = var5 - this.at;
         int var8 = this.ao(var3.substring(var1, var1 + var2));
         int var9 = this.at + this.aa;
         return new qu(var6, var7, var8, var9);
      } else {
         return new qu(var4, var5, 0, 0);
      }
   }

   static void dn(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   void de(String var1, int var2, int var3) {
      var3 -= this.al;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            int var7 = (char)(dn.af(var1.charAt(var6), (byte)84) & 255);
            if (var7 == -1751077658) {
               var4 = var6;
            } else {
               int var9;
               if (var7 == -154667502 && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = 858159000;
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              var9 = lg.ac(var8.substring(4), (byte)74);
                              tc var13 = ay[var9];
                              var13.aw(var2, var3 + this.al - var13.al);
                              var2 += var13.aq;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.be(var8);
                        }
                        continue;
                     }

                     var7 = -1372310679;
                  }
               }

               if (var7 == -103104416) {
                  var7 = 32;
               }

               if (var4 == -1) {
                  if (this.ao != null && var5 != -1) {
                     var2 += this.ao[(var5 << 8) + var7];
                  }

                  int var12 = this.ac[var7];
                  var9 = this.au[var7];
                  if (var7 != 32) {
                     if (am == -27295072) {
                        if (ah != -1) {
                           bz(this.an[var7], var2 + this.ab[var7] + 1, var3 + this.aq[var7] + 1, var12, var9, ah);
                        }

                        this.af(this.an[var7], var2 + this.ab[var7], var3 + this.aq[var7], var12, var9, ar);
                     } else {
                        if (ah != -1) {
                           bd(this.an[var7], var2 + this.ab[var7] + 1, var3 + this.aq[var7] + 1, var12, var9, ah, am);
                        }

                        this.an(this.an[var7], var2 + this.ab[var7], var3 + this.aq[var7], var12, var9, ar, am);
                     }
                  } else if (as > 0) {
                     aj += as;
                     var2 += aj >> 8;
                     aj &= -364047776;
                  }

                  int var10 = this.aw[var7];
                  if (ax != -1) {
                     ec(var2, var3 + (int)((double)this.al * 0.7), var10, ax);
                  }

                  if (ai != -1) {
                     ec(var2, var3 + this.al + 1, var10, ai);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   public void as(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bi(var4, var5);
         this.bx(var1, var2 - this.ao(var1), var3);
      }
   }

   public void aj(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bi(var4, var5);
         this.bx(var1, var2 - this.ao(var1) / 2, var3);
      }
   }

   public int ak(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.az(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   public int az(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         this.bi(var6, var7);
         am = var8;
         if (var11 == 0) {
            var11 = this.al;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.at + this.aa + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.ax(var1, var12, az);
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
               this.bx(az[var15], var2, var14);
            } else if (var9 == 1) {
               this.bx(az[var15], var2 + (var4 - this.ao(az[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.bx(az[var15], var2 + var4 - this.ao(az[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.bx(az[var15], var2, var14);
            } else {
               this.bk(az[var15], var4);
               this.bx(az[var15], var2, var14);
               as = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public rg ad(oa var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.aw(-1740357709)) {
         this.bi(var4, var5);
         var3 -= this.al;

         for(int var7 = 0; var7 < var1.ac((byte)99); ++var7) {
            om var8 = var1.al(var7, -1037292745);
            if (var6 != -1 && var8.aw * -727185157 > var6) {
               return new rg(var8.an * 1620071571, var8.aw * -727185157);
            }

            char var9 = var8.af;
            if (var9 != '\n') {
               if (var1.an(var7, 1783943189)) {
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
                     this.af(this.an[var9], var10 + this.ab[var9] + 1, var11 + this.aq[var9] + 1, var12, var13, ah);
                  }

                  this.af(this.an[var9], var10 + this.ab[var9], var11 + this.aq[var9], var12, var13, ar);
               }
            }
         }
      }

      return var1.aq((byte)55);
   }

   public void ae(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0 + (double)var6 / 5.0) * 5.0);
         }

         this.bo(var1, var2 - this.ao(var1) / 2, var3, (int[])null, var7);
      }
   }

   public void ap(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0 + (double)var6 / 5.0) * 5.0);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0 + (double)var6 / 5.0) * 5.0);
         }

         this.bo(var1, var2 - this.ao(var1) / 2, var3, var7, var8);
      }
   }

   public void by(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 != null) {
         this.bi(var4, var5);
         double var8 = 7.0 - (double)var7 / 8.0;
         if (var8 < 0.0) {
            var8 = 0.0;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5 + (double)var6 / 1.0) * var8);
         }

         this.bo(var1, var2 - this.ao(var1) / 2, var3, (int[])null, var10);
      }
   }

   public int bh(String var1, int var2) {
      int var3 = this.ax(var1, new int[]{var2}, az);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.ao(az[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public int cb(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.az(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   void dh(String var1, int var2, int var3) {
      var3 -= this.al;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(dn.af(var1.charAt(var6), (byte)42) & 255);
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
                              var9 = lg.ac(var8.substring(4), (byte)48);
                              tc var13 = ay[var9];
                              var13.aw(var2, var3 + this.al - var13.al);
                              var2 += var13.aq;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.be(var8);
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
                           bz(this.an[var7], var2 + this.ab[var7] + 1, var3 + this.aq[var7] + 1, var12, var9, ah);
                        }

                        this.af(this.an[var7], var2 + this.ab[var7], var3 + this.aq[var7], var12, var9, ar);
                     } else {
                        if (ah != -1) {
                           bd(this.an[var7], var2 + this.ab[var7] + 1, var3 + this.aq[var7] + 1, var12, var9, ah, am);
                        }

                        this.an(this.an[var7], var2 + this.ab[var7], var3 + this.aq[var7], var12, var9, ar, am);
                     }
                  } else if (as > 0) {
                     aj += as;
                     var2 += aj >> 8;
                     aj &= 255;
                  }

                  int var10 = this.aw[var7];
                  if (ax != -1) {
                     ec(var2, var3 + (int)((double)this.al * 0.7), var10, ax);
                  }

                  if (ai != -1) {
                     ec(var2, var3 + this.al + 1, var10, ai);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   void dv(int var1, int var2) {
      ax = -1;
      ai = -1;
      ag = var2;
      ah = var2;
      av = var1;
      ar = var1;
      am = 1633806546;
      as = 0;
      aj = 0;
   }

   void bx(String var1, int var2, int var3) {
      var3 -= this.al;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(dn.af(var1.charAt(var6), (byte)-63) & 255);
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
                              var9 = lg.ac(var8.substring(4), (byte)-15);
                              tc var13 = ay[var9];
                              var13.aw(var2, var3 + this.al - var13.al);
                              var2 += var13.aq;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.be(var8);
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
                           bz(this.an[var7], var2 + this.ab[var7] + 1, var3 + this.aq[var7] + 1, var12, var9, ah);
                        }

                        this.af(this.an[var7], var2 + this.ab[var7], var3 + this.aq[var7], var12, var9, ar);
                     } else {
                        if (ah != -1) {
                           bd(this.an[var7], var2 + this.ab[var7] + 1, var3 + this.aq[var7] + 1, var12, var9, ah, am);
                        }

                        this.an(this.an[var7], var2 + this.ab[var7], var3 + this.aq[var7], var12, var9, ar, am);
                     }
                  } else if (as > 0) {
                     aj += as;
                     var2 += aj >> 8;
                     aj &= 255;
                  }

                  int var10 = this.aw[var7];
                  if (ax != -1) {
                     ec(var2, var3 + (int)((double)this.al * 0.7), var10, ax);
                  }

                  if (ai != -1) {
                     ec(var2, var3 + this.al + 1, var10, ai);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   static void dj(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
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
         bm(ad, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   abstract void af(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   public void cr(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bi(var4, var5);
         this.bx(var1, var2 - this.ao(var1), var3);
      }
   }

   static void bz(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
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
         bm(ad, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   static void bm(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   static void bd(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
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
         bt(ad, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   static void bt(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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

   abstract void aw(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void ac(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   void bo(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.al;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if (var1.charAt(var9) != 0) {
            char var10 = (char)(dn.af(var1.charAt(var9), (byte)-18) & 255);
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
                              var14 = lg.ac(var11.substring(4), (byte)-101);
                              tc var18 = ay[var14];
                              var18.aw(var2 + var12, var3 + this.al - var18.al + var13);
                              var2 += var18.aq;
                              var7 = -1;
                           } catch (Exception var16) {
                           }
                        } else {
                           this.be(var11);
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
                           bz(this.an[var10], var2 + this.ab[var10] + 1 + var13, var3 + this.aq[var10] + 1 + var14, var17, var12, ah);
                        }

                        this.af(this.an[var10], var2 + this.ab[var10] + var13, var3 + this.aq[var10] + var14, var17, var12, ar);
                     } else {
                        if (ah != -1) {
                           bd(this.an[var10], var2 + this.ab[var10] + 1 + var13, var3 + this.aq[var10] + 1 + var14, var17, var12, ah, am);
                        }

                        this.an(this.an[var10], var2 + this.ab[var10] + var13, var3 + this.aq[var10] + var14, var17, var12, ar, am);
                     }
                  } else if (as > 0) {
                     aj += as;
                     var2 += aj >> 8;
                     aj &= 255;
                  }

                  int var15 = this.aw[var10];
                  if (ax != -1) {
                     ec(var2, var3 + (int)((double)this.al * 0.7), var15, ax);
                  }

                  if (ai != -1) {
                     ec(var2, var3 + this.al, var15, ai);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   abstract void ab(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   abstract void aq(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   abstract void al(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   void bj(byte[] var1) {
      this.aw = new int[292672682];
      int var2;
      if (var1.length == -2111897478) {
         for(var2 = 0; var2 < this.aw.length; ++var2) {
            this.aw[var2] = var1[var2] & 255;
         }

         this.al = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.aw[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[-1509605744];
         int[] var4 = new int[929995407];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < -47305467; ++var5) {
            var4[var5] = var1[var2++] & -735978377;
         }

         byte[][] var11 = new byte[256][];

         int var7;
         int var8;
         for(int var6 = 0; var6 < -1732073128; ++var6) {
            var11[var6] = new byte[var10[var6]];
            var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = (byte)var7;
            }
         }

         byte[][] var12 = new byte[256][];

         for(var7 = 0; var7 < 256; ++var7) {
            var12[var7] = new byte[var10[var7]];
            byte var13 = 0;

            for(int var9 = 0; var9 < var12[var7].length; ++var9) {
               var13 += var1[var2++];
               var12[var7][var9] = var13;
            }
         }

         this.ao = new byte[1135027598];

         for(var7 = 0; var7 < 256; ++var7) {
            if (var7 != 1803693006 && var7 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != -1792232037 && var8 != -2125471068) {
                     this.ao[(var7 << 8) + var8] = (byte)aa(var11, var12, var4, this.aw, var10, var7, var8);
                  }
               }
            }
         }

         this.al = var4[2042363698] + var10[32];
      }

   }

   ou(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.ab = var2;
      this.aq = var3;
      this.ac = var4;
      this.au = var5;
      this.at(var1);
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

   void bn(byte[] var1) {
      this.aw = new int[-483165060];
      int var2;
      if (var1.length == 1078308783) {
         for(var2 = 0; var2 < this.aw.length; ++var2) {
            this.aw[var2] = var1[var2] & -888933708;
         }

         this.al = var1[256] & -598454091;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.aw[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[-813363991];
         int[] var4 = new int[1747570401];

         int var5;
         for(var5 = 0; var5 < -1380619550; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 185261692;
         }

         byte[][] var11 = new byte[-501254771][];

         int var7;
         int var8;
         for(int var6 = 0; var6 < -1640220850; ++var6) {
            var11[var6] = new byte[var10[var6]];
            var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = (byte)var7;
            }
         }

         byte[][] var12 = new byte[1711382623][];

         for(var7 = 0; var7 < 256; ++var7) {
            var12[var7] = new byte[var10[var7]];
            byte var13 = 0;

            for(int var9 = 0; var9 < var12[var7].length; ++var9) {
               var13 += var1[var2++];
               var12[var7][var9] = var13;
            }
         }

         this.ao = new byte[65536];

         for(var7 = 0; var7 < 1330409265; ++var7) {
            if (var7 != 1932036313 && var7 != 550329023) {
               for(var8 = 0; var8 < -862331201; ++var8) {
                  if (var8 != 1857453766 && var8 != -1741950554) {
                     this.ao[(var7 << 8) + var8] = (byte)aa(var11, var12, var4, this.aw, var10, var7, var8);
                  }
               }
            }
         }

         this.al = var4[-1542046197] + var10[32];
      }

   }

   public int br(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.aw[dn.af(var1, (byte)82) & -1592891882];
   }

   static void dq(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
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
         bm(ad, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   public int bp(String var1, int var2) {
      int var3 = this.ax(var1, new int[]{var2}, az);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.ao(az[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   static void dx(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
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
         bm(ad, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   public void dw(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0 + (double)var6 / 5.0) * 5.0);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0 + (double)var6 / 5.0) * 5.0);
         }

         this.bo(var1, var2 - this.ao(var1) / 2, var3, var7, var8);
      }
   }

   public int ba(String var1, int[] var2, String[] var3) {
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
         int var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == 536368456 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append((char)1681099101);
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.ay((char)-1066952973);
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + 508126706];
                     }

                     var11 = -1800207734;
                  } else if (var16.equals("gt")) {
                     var4 += this.ay((char)-280705284);
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + -1705716054];
                     }

                     var11 = 1469165597;
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = lg.ac(var16.substring(4), (byte)86);
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
                     var4 += this.ay(var15);
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == 1569653186) {
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

                  if (var15 == -1873327973) {
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

   public int bv(String var1, int[] var2, String[] var3) {
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
                     var4 += this.ay('<');
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.ay('>');
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = lg.ac(var16.substring(4), (byte)-34);
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
                     var4 += this.ay(var15);
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

   public int bl(String var1, int[] var2, String[] var3) {
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
                     var4 += this.ay('<');
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.ay('>');
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = lg.ac(var16.substring(4), (byte)-5);
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
                     var4 += this.ay(var15);
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

   public int bg(char var1) {
      if (var1 == 554384171) {
         var1 = -1930259009;
      }

      return this.aw[dn.af((char)var1, (byte)-7) & 2013454711];
   }

   public int bc(String var1, int var2) {
      int var3 = this.ax(var1, new int[]{var2}, az);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.ao(az[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public int ax(String var1, int[] var2, String[] var3) {
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
                     var4 += this.ay('<');
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.ay('>');
                     if (this.ao != null && var11 != -1) {
                        var4 += this.ao[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = lg.ac(var16.substring(4), (byte)-80);
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
                     var4 += this.ay(var15);
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

   public int bw(String var1, int var2) {
      int var3 = this.ax(var1, new int[]{var2}, az);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.ao(az[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public static String ce(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < var1; ++var3) {
         var4 = var0.charAt(var3);
         if (var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   public void bb(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
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

         this.bo(var1, var2, var3, var7, (int[])null);
      }
   }

   void bk(String var1, int var2) {
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
         as = (var2 - this.ao(var1) << 8) / var3;
      }

   }

   public qu cc(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.ao(var3) / 2;
         var6 += this.ao(var3.substring(0, var1));
         int var7 = var5 - this.at;
         int var8 = this.ao(var3.substring(var1, var1 + var2));
         int var9 = this.at + this.aa;
         return new qu(var6, var7, var8, var9);
      } else {
         return new qu(var4, var5, 0, 0);
      }
   }

   public void cy(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bi(var4, var5);
         this.bx(var1, var2 - this.ao(var1), var3);
      }
   }

   public int ag(String var1, int var2) {
      return this.ax(var1, new int[]{var2}, az);
   }

   public void cu(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bi(var4, var5);
         this.bx(var1, var2, var3);
      }
   }

   public void ck(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bi(var4, var5);
         this.bx(var1, var2, var3);
      }
   }

   public void cq(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bi(var4, var5);
         this.bx(var1, var2, var3);
      }
   }

   public void cm(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bi(var4, var5);
         this.bx(var1, var2, var3);
      }
   }

   public void cf(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         am = var6;
         this.bx(var1, var2, var3);
      }
   }

   public void cl(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         am = var6;
         this.bx(var1, var2, var3);
      }
   }

   public void cg(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         am = var6;
         this.bx(var1, var2, var3);
      }
   }

   public qu cs(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.ao(var3) / 2;
         var6 += this.ao(var3.substring(0, var1));
         int var7 = var5 - this.at;
         int var8 = this.ao(var3.substring(var1, var1 + var2));
         int var9 = this.at + this.aa;
         return new qu(var6, var7, var8, var9);
      } else {
         return new qu(var4, var5, 0, 0);
      }
   }

   public int bu(String var1) {
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
                              int var8 = lg.ac(var7.substring(4), (byte)-2);
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
                  var4 += this.aw[(char)(dn.af(var6, (byte)-76) & 255)];
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

   public void cx(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bi(var4, var5);
         this.bx(var1, var2 - this.ao(var1) / 2, var3);
      }
   }

   public void cv(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bi(var4, var5);
         this.bx(var1, var2 - this.ao(var1) / 2, var3);
      }
   }

   static void ep(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   public int co(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.az(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   public int cz(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.az(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   public int cw(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         this.bi(var6, var7);
         am = var8;
         if (var11 == 0) {
            var11 = this.al;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.at + this.aa + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.ax(var1, var12, az);
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
               this.bx(az[var15], var2, var14);
            } else if (var9 == 1) {
               this.bx(az[var15], var2 + (var4 - this.ao(az[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.bx(az[var15], var2 + var4 - this.ao(az[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.bx(az[var15], var2, var14);
            } else {
               this.bk(az[var15], var4);
               this.bx(az[var15], var2, var14);
               as = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public int cj(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 511853322;
         }

         this.bi(var6, var7);
         am = var8;
         if (var11 == 0) {
            var11 = this.al;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.at + this.aa + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.ax(var1, var12, az);
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
               this.bx(az[var15], var2, var14);
            } else if (var9 == 1) {
               this.bx(az[var15], var2 + (var4 - this.ao(az[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.bx(az[var15], var2 + var4 - this.ao(az[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.bx(az[var15], var2, var14);
            } else {
               this.bk(az[var15], var4);
               this.bx(az[var15], var2, var14);
               as = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public int ch(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         this.bi(var6, var7);
         am = var8;
         if (var11 == 0) {
            var11 = this.al;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.at + this.aa + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.ax(var1, var12, az);
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
               this.bx(az[var15], var2, var14);
            } else if (var9 == 1) {
               this.bx(az[var15], var2 + (var4 - this.ao(az[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.bx(az[var15], var2 + var4 - this.ao(az[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.bx(az[var15], var2, var14);
            } else {
               this.bk(az[var15], var4);
               this.bx(az[var15], var2, var14);
               as = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public qu cn(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.ao(var3) / 2;
         var6 += this.ao(var3.substring(0, var1));
         int var7 = var5 - this.at;
         int var8 = this.ao(var3.substring(var1, var1 + var2));
         int var9 = this.at + this.aa;
         return new qu(var6, var7, var8, var9);
      } else {
         return new qu(var4, var5, 0, 0);
      }
   }

   public rg cp(oa var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.aw(1581984877)) {
         this.bi(var4, var5);
         var3 -= this.al;

         for(int var7 = 0; var7 < var1.ac((byte)27); ++var7) {
            om var8 = var1.al(var7, -1037292745);
            if (var6 != -1 && var8.aw * -727185157 > var6) {
               return new rg(var8.an * 1620071571, var8.aw * -727185157);
            }

            int var9 = var8.af;
            if (var9 != 10) {
               if (var1.an(var7, 1404469435)) {
                  var9 = -1171105219;
               }

               if (var9 != 9) {
                  if (var9 == 160) {
                     var9 = 425177749;
                  }

                  int var10 = var2 + var8.an * 1620071571;
                  int var11 = var3 + var8.aw * -9508372;
                  int var12 = this.ac[var9];
                  int var13 = this.au[var9];
                  if (ah != -1) {
                     this.af(this.an[var9], var10 + this.ab[var9] + 1, var11 + this.aq[var9] + 1, var12, var13, ah);
                  }

                  this.af(this.an[var9], var10 + this.ab[var9], var11 + this.aq[var9], var12, var13, ar);
               }
            }
         }
      }

      return var1.aq((byte)33);
   }

   public rg cd(oa var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.aw(305604555)) {
         this.bi(var4, var5);
         var3 -= this.al;

         for(int var7 = 0; var7 < var1.ac((byte)63); ++var7) {
            om var8 = var1.al(var7, -1037292745);
            if (var6 != -1 && var8.aw * 1198403325 > var6) {
               return new rg(var8.an * -1327658589, var8.aw * -396091070);
            }

            int var9 = var8.af;
            if (var9 != 10) {
               if (var1.an(var7, 2049054764)) {
                  var9 = 1058589023;
               }

               if (var9 != 9) {
                  if (var9 == 1988804832) {
                     var9 = -1502161211;
                  }

                  int var10 = var2 + var8.an * -474322663;
                  int var11 = var3 + var8.aw * -727185157;
                  int var12 = this.ac[var9];
                  int var13 = this.au[var9];
                  if (ah != -1) {
                     this.af(this.an[var9], var10 + this.ab[var9] + 1, var11 + this.aq[var9] + 1, var12, var13, ah);
                  }

                  this.af(this.an[var9], var10 + this.ab[var9], var11 + this.aq[var9], var12, var13, ar);
               }
            }
         }
      }

      return var1.aq((byte)105);
   }

   public void dm(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0 + (double)var6 / 5.0) * 5.0);
         }

         this.bo(var1, var2 - this.ao(var1) / 2, var3, (int[])null, var7);
      }
   }

   static void eo(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
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
         bt(ad, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   abstract void au(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   public void do(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0 + (double)var6 / 5.0) * 5.0);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0 + (double)var6 / 5.0) * 5.0);
         }

         this.bo(var1, var2 - this.ao(var1) / 2, var3, var7, var8);
      }
   }

   public void di(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0 + (double)var6 / 5.0) * 5.0);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0 + (double)var6 / 5.0) * 5.0);
         }

         this.bo(var1, var2 - this.ao(var1) / 2, var3, var7, var8);
      }
   }

   public void dr(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         ak.setSeed((long)var6);
         am = 192 + (ak.nextInt() & -1822514361);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((ak.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.bo(var1, var2, var3, var7, (int[])null);
      }
   }

   public void dl(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
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

         this.bo(var1, var2, var3, var7, (int[])null);
      }
   }

   void dk(int var1, int var2) {
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

   void dt(int var1, int var2) {
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

   public void ar(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bi(var4, var5);
         this.bx(var1, var2, var3);
      }
   }

   void dz(int var1, int var2) {
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

   public int bq(String var1) {
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
                              int var8 = lg.ac(var7.substring(4), (byte)-44);
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
                  var4 += this.aw[(char)(dn.af(var6, (byte)-14) & 255)];
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

   static void dy(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   static void ds(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   public qu ca(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.ao(var3) / 2;
         var6 += this.ao(var3.substring(0, var1));
         int var7 = var5 - this.at;
         int var8 = this.ao(var3.substring(var1, var1 + var2));
         int var9 = this.at + this.aa;
         return new qu(var6, var7, var8, var9);
      } else {
         return new qu(var4, var5, 0, 0);
      }
   }

   void du(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.al;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if (var1.charAt(var9) != 0) {
            int var10 = (char)(dn.af(var1.charAt(var9), (byte)0) & 255);
            if (var10 == 60) {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if (var10 == 62 && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if (var11.equals("lt")) {
                     var10 = 1693351857;
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
                              var14 = lg.ac(var11.substring(4), (byte)-77);
                              tc var18 = ay[var14];
                              var18.aw(var2 + var12, var3 + this.al - var18.al + var13);
                              var2 += var18.aq;
                              var7 = -1;
                           } catch (Exception var16) {
                           }
                        } else {
                           this.be(var11);
                        }
                        continue;
                     }

                     var10 = 62;
                  }
               }

               if (var10 == 160) {
                  var10 = 32;
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
                  if (var10 != 32) {
                     if (am == 256) {
                        if (ah != -1) {
                           bz(this.an[var10], var2 + this.ab[var10] + 1 + var13, var3 + this.aq[var10] + 1 + var14, var17, var12, ah);
                        }

                        this.af(this.an[var10], var2 + this.ab[var10] + var13, var3 + this.aq[var10] + var14, var17, var12, ar);
                     } else {
                        if (ah != -1) {
                           bd(this.an[var10], var2 + this.ab[var10] + 1 + var13, var3 + this.aq[var10] + 1 + var14, var17, var12, ah, am);
                        }

                        this.an(this.an[var10], var2 + this.ab[var10] + var13, var3 + this.aq[var10] + var14, var17, var12, ar, am);
                     }
                  } else if (as > 0) {
                     aj += as;
                     var2 += aj >> 8;
                     aj &= 255;
                  }

                  int var15 = this.aw[var10];
                  if (ax != -1) {
                     ec(var2, var3 + (int)((double)this.al * 0.7), var15, ax);
                  }

                  if (ai != -1) {
                     ec(var2, var3 + this.al, var15, ai);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   void db(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.al;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if (var1.charAt(var9) != 0) {
            char var10 = (char)(dn.af(var1.charAt(var9), (byte)-60) & 255);
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
                              var14 = lg.ac(var11.substring(4), (byte)-49);
                              tc var18 = ay[var14];
                              var18.aw(var2 + var12, var3 + this.al - var18.al + var13);
                              var2 += var18.aq;
                              var7 = -1;
                           } catch (Exception var16) {
                           }
                        } else {
                           this.be(var11);
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
                           bz(this.an[var10], var2 + this.ab[var10] + 1 + var13, var3 + this.aq[var10] + 1 + var14, var17, var12, ah);
                        }

                        this.af(this.an[var10], var2 + this.ab[var10] + var13, var3 + this.aq[var10] + var14, var17, var12, ar);
                     } else {
                        if (ah != -1) {
                           bd(this.an[var10], var2 + this.ab[var10] + 1 + var13, var3 + this.aq[var10] + 1 + var14, var17, var12, ah, am);
                        }

                        this.an(this.an[var10], var2 + this.ab[var10] + var13, var3 + this.aq[var10] + var14, var17, var12, ar, am);
                     }
                  } else if (as > 0) {
                     aj += as;
                     var2 += aj >> 8;
                     aj &= 255;
                  }

                  int var15 = this.aw[var10];
                  if (ax != -1) {
                     ec(var2, var3 + (int)((double)this.al * 0.7), var15, ax);
                  }

                  if (ai != -1) {
                     ec(var2, var3 + this.al, var15, ai);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   abstract void an(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   void df(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.al;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if (var1.charAt(var9) != 0) {
            int var10 = (char)(dn.af(var1.charAt(var9), (byte)-88) & 255);
            if (var10 == 1749083189) {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if (var10 == -694075184 && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if (var11.equals("lt")) {
                     var10 = -395741129;
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
                              var14 = lg.ac(var11.substring(4), (byte)-38);
                              tc var18 = ay[var14];
                              var18.aw(var2 + var12, var3 + this.al - var18.al + var13);
                              var2 += var18.aq;
                              var7 = -1;
                           } catch (Exception var16) {
                           }
                        } else {
                           this.be(var11);
                        }
                        continue;
                     }

                     var10 = 1088666303;
                  }
               }

               if (var10 == 1483463158) {
                  var10 = 32;
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
                  if (var10 != 32) {
                     if (am == 256) {
                        if (ah != -1) {
                           bz(this.an[var10], var2 + this.ab[var10] + 1 + var13, var3 + this.aq[var10] + 1 + var14, var17, var12, ah);
                        }

                        this.af(this.an[var10], var2 + this.ab[var10] + var13, var3 + this.aq[var10] + var14, var17, var12, ar);
                     } else {
                        if (ah != -1) {
                           bd(this.an[var10], var2 + this.ab[var10] + 1 + var13, var3 + this.aq[var10] + 1 + var14, var17, var12, ah, am);
                        }

                        this.an(this.an[var10], var2 + this.ab[var10] + var13, var3 + this.aq[var10] + var14, var17, var12, ar, am);
                     }
                  } else if (as > 0) {
                     aj += as;
                     var2 += aj >> 8;
                     aj &= -428809226;
                  }

                  int var15 = this.aw[var10];
                  if (ax != -1) {
                     ec(var2, var3 + (int)((double)this.al * 0.7), var15, ax);
                  }

                  if (ai != -1) {
                     ec(var2, var3 + this.al, var15, ai);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   void be(String var1) {
      try {
         int var2;
         String var3;
         if (var1.startsWith("col=")) {
            var3 = var1.substring(4);
            var2 = cj.au(var3, 16, true, (byte)-102);
            ar = var2;
         } else if (var1.equals("/col")) {
            ar = av;
         } else if (var1.startsWith("str=")) {
            var3 = var1.substring(4);
            var2 = cj.au(var3, 16, true, (byte)-39);
            ax = var2;
         } else if (var1.equals("str")) {
            ax = 8388608;
         } else if (var1.equals("/str")) {
            ax = -1;
         } else if (var1.startsWith("u=")) {
            var3 = var1.substring(2);
            var2 = cj.au(var3, 16, true, (byte)-57);
            ai = var2;
         } else if (var1.equals("u")) {
            ai = 0;
         } else if (var1.equals("/u")) {
            ai = -1;
         } else if (var1.startsWith("shad=")) {
            var3 = var1.substring(5);
            var2 = cj.au(var3, 16, true, (byte)-48);
            ah = var2;
         } else if (var1.equals("shad")) {
            ah = 0;
         } else if (var1.equals("/shad")) {
            ah = ag;
         } else if (var1.equals("br")) {
            this.bi(av, ag);
         }
      } catch (Exception var4) {
      }

   }

   static int aa(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
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

   public int ai(String var1, int var2) {
      int var3 = this.ax(var1, new int[]{var2}, az);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.ao(az[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public void dc(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bi(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0 + (double)var6 / 5.0) * 5.0);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0 + (double)var6 / 5.0) * 5.0);
         }

         this.bo(var1, var2 - this.ao(var1) / 2, var3, var7, var8);
      }
   }

   public int bf(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            int var6 = var1.charAt(var5);
            if (var6 == 60) {
               var2 = var5;
            } else {
               if (var6 == 443792420 && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = 1497553537;
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = lg.ac(var7.substring(4), (byte)-121);
                              var4 += ay[var8].aq;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = -856498976;
                  }
               }

               if (var6 == -1986767004) {
                  var6 = 32;
               }

               if (var2 == -1) {
                  var4 += this.aw[(char)(dn.af((char)var6, (byte)60) & 255)];
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

   static void dd(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
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
         bm(ad, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   static void da(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   static int bs(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
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

   public static String ah(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < var1; ++var3) {
         var4 = var0.charAt(var3);
         if (var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   static void eq(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
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
         bt(ad, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   static void et(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
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
         bt(ad, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   static void ef(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 533412627) * var9 & -2051963048) + ((var2 & 1179982733) * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & -258069812) * var9 & 1886511653) + ((var12 & -1541320031) * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void ez(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & -1301725007) * var9 & -16711936) + ((var2 & 921211912) * var9 & -779966002) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 1897710529) * var9 & 568520154) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void ej(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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
}
