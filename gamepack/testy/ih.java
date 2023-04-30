import accessors.RSTexture;

public class ih extends rp implements RSTexture {
   int ao;
   static final int an = 1;
   static final int aw = 2;
   static final int ac = 3;
   int au;
   int[] aq;
   int[] al;
   static int[] ag;
   int[] at;
   int[] aa;
   int ay;
   boolean ab;
   int[] ax;
   static final int af = 0;
   boolean ai = false;

   boolean ab(double var1, int var3, nm var4) {
      int var5;
      for(var5 = 0; var5 < this.aq.length; ++var5) {
         if (var4.cu(this.aq[var5], -1108431995) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.ax = new int[var5];

      for(int var6 = 0; var6 < this.aq.length; ++var6) {
         tc var7 = rr.aq(var4, this.aq[var6], 1137564577);
         var7.af();
         byte[] var8 = var7.af;
         int[] var9 = var7.an;
         int var10 = this.aa[var6];
         if ((var10 & -16777216) == 16777216) {
         }

         if ((var10 & -16777216) == 33554432) {
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if ((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if ((var14 & '\uffff') == var14 >> 8) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = ez.ac(var9[var11], var1);
         }

         if (var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.al[var6 - 1];
         }

         if (var11 == 0) {
            if (var7.aw == var3) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.ax[var12] = var9[var8[var12] & 255];
               }
            } else if (var7.aw == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.ax[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.aw != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.ax[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var11 == 1) {
         }

         if (var11 == 2) {
         }

         if (var11 == 3) {
         }
      }

      return true;
   }

   boolean af(double var1, int var3, nm var4) {
      int var5;
      for(var5 = 0; var5 < this.aq.length; ++var5) {
         if (var4.cu(this.aq[var5], 1627749986) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.ax = new int[var5];

      for(int var6 = 0; var6 < this.aq.length; ++var6) {
         tc var7 = rr.aq(var4, this.aq[var6], 988192085);
         var7.af();
         byte[] var8 = var7.af;
         int[] var9 = var7.an;
         int var10 = this.aa[var6];
         if ((var10 & -16777216) == 16777216) {
         }

         if ((var10 & -16777216) == 33554432) {
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if ((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if ((var14 & '\uffff') == var14 >> 8) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = ez.ac(var9[var11], var1);
         }

         if (var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.al[var6 - 1];
         }

         if (var11 == 0) {
            if (var7.aw == var3) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.ax[var12] = var9[var8[var12] & 255];
               }
            } else if (var7.aw == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.ax[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.aw != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.ax[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var11 == 1) {
         }

         if (var11 == 2) {
         }

         if (var11 == 3) {
         }
      }

      return true;
   }

   void an() {
      this.ax = null;
   }

   void aw(int var1) {
      if (this.ax != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.ay == 1 || this.ay == 3) {
            if (ag == null || ag.length < this.ax.length) {
               ag = new int[this.ax.length];
            }

            if (this.ax.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ax.length;
            var4 = var2 * var1 * this.ao;
            var5 = var3 - 1;
            if (this.ay == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               ag[var6] = this.ax[var7];
            }

            var10 = this.ax;
            this.ax = ag;
            ag = var10;
         }

         if (this.ay == 2 || this.ay == 4) {
            if (ag == null || ag.length < this.ax.length) {
               ag = new int[this.ax.length];
            }

            if (this.ax.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ax.length;
            var4 = var1 * this.ao;
            var5 = var2 - 1;
            if (this.ay == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  ag[var8] = this.ax[var9];
               }
            }

            var10 = this.ax;
            this.ax = ag;
            ag = var10;
         }

      }
   }

   boolean ac(double var1, int var3, nm var4) {
      int var5;
      for(var5 = 0; var5 < this.aq.length; ++var5) {
         if (var4.cu(this.aq[var5], -1953085008) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.ax = new int[var5];

      for(int var6 = 0; var6 < this.aq.length; ++var6) {
         tc var7 = rr.aq(var4, this.aq[var6], -619018717);
         var7.af();
         byte[] var8 = var7.af;
         int[] var9 = var7.an;
         int var10 = this.aa[var6];
         if ((var10 & -120566971) == 1329263710) {
         }

         if ((var10 & -16777216) == 33554432) {
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if ((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if ((var14 & '\uffff') == var14 >> 8) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = ez.ac(var9[var11], var1);
         }

         if (var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.al[var6 - 1];
         }

         if (var11 == 0) {
            if (var7.aw == var3) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.ax[var12] = var9[var8[var12] & -1612854160];
               }
            } else if (var7.aw == 64 && var3 == -253132493) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.ax[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.aw != 1720830939 || var3 != -1803757517) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.ax[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 1013891407];
                  }
               }
            }
         }

         if (var11 == 1) {
         }

         if (var11 == 2) {
         }

         if (var11 == 3) {
         }
      }

      return true;
   }

   ih(sg var1) {
      this.au = var1.cl(-189866022);
      this.ab = var1.cm((byte)7) == 1;
      int var2 = var1.cm((byte)7);
      if (var2 >= 1 && var2 <= 4) {
         this.aq = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.aq[var3] = var1.cl(108475420);
         }

         if (var2 > 1) {
            this.al = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.al[var3] = var1.cm((byte)7);
            }
         }

         if (var2 > 1) {
            this.at = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.at[var3] = var1.cm((byte)7);
            }
         }

         this.aa = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.aa[var3] = var1.cx(-934550160);
         }

         this.ay = var1.cm((byte)7);
         this.ao = var1.cm((byte)7);
         this.ax = null;
      } else {
         throw new RuntimeException();
      }
   }

   boolean au(double var1, int var3, nm var4) {
      int var5;
      for(var5 = 0; var5 < this.aq.length; ++var5) {
         if (var4.cu(this.aq[var5], -973082054) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.ax = new int[var5];

      for(int var6 = 0; var6 < this.aq.length; ++var6) {
         tc var7 = rr.aq(var4, this.aq[var6], 1680653311);
         var7.af();
         byte[] var8 = var7.af;
         int[] var9 = var7.an;
         int var10 = this.aa[var6];
         if ((var10 & -16777216) == 16777216) {
         }

         if ((var10 & -16777216) == -266446483) {
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if ((var10 & -16777216) == -1913502122) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if ((var14 & -1379245638) == var14 >> 8) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & -1045260286;
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = ez.ac(var9[var11], var1);
         }

         if (var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.al[var6 - 1];
         }

         if (var11 == 0) {
            if (var7.aw == var3) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.ax[var12] = var9[var8[var12] & 255];
               }
            } else if (var7.aw == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.ax[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.aw != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.ax[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & -1516526364];
                  }
               }
            }
         }

         if (var11 == 1) {
         }

         if (var11 == 2) {
         }

         if (var11 == 3) {
         }
      }

      return true;
   }

   void aq() {
      this.ax = null;
   }

   void al() {
      this.ax = null;
   }

   void ao(int var1) {
      if (this.ax != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.ay == 1 || this.ay == 3) {
            if (ag == null || ag.length < this.ax.length) {
               ag = new int[this.ax.length];
            }

            if (this.ax.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ax.length;
            var4 = var2 * var1 * this.ao;
            var5 = var3 - 1;
            if (this.ay == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               ag[var6] = this.ax[var7];
            }

            var10 = this.ax;
            this.ax = ag;
            ag = var10;
         }

         if (this.ay == 2 || this.ay == 4) {
            if (ag == null || ag.length < this.ax.length) {
               ag = new int[this.ax.length];
            }

            if (this.ax.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ax.length;
            var4 = var1 * this.ao;
            var5 = var2 - 1;
            if (this.ay == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  ag[var8] = this.ax[var9];
               }
            }

            var10 = this.ax;
            this.ax = ag;
            ag = var10;
         }

      }
   }

   void aa(int var1) {
      if (this.ax != null) {
         int var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.ay == 1 || this.ay == 3) {
            if (ag == null || ag.length < this.ax.length) {
               ag = new int[this.ax.length];
            }

            if (this.ax.length == -1180238298) {
               var2 = 1993764226;
            } else {
               var2 = 177672750;
            }

            var3 = this.ax.length;
            var4 = var2 * var1 * this.ao;
            var5 = var3 - 1;
            if (this.ay == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               ag[var6] = this.ax[var7];
            }

            var10 = this.ax;
            this.ax = ag;
            ag = var10;
         }

         if (this.ay == 2 || this.ay == 4) {
            if (ag == null || ag.length < this.ax.length) {
               ag = new int[this.ax.length];
            }

            if (this.ax.length == 1644231099) {
               var2 = -1711034434;
            } else {
               var2 = 1838856565;
            }

            var3 = this.ax.length;
            var4 = var1 * this.ao;
            var5 = var2 - 1;
            if (this.ay == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  ag[var8] = this.ax[var9];
               }
            }

            var10 = this.ax;
            this.ax = ag;
            ag = var10;
         }

      }
   }

   void ay(int var1) {
      if (this.ax != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.ay == 1 || this.ay == 3) {
            if (ag == null || ag.length < this.ax.length) {
               ag = new int[this.ax.length];
            }

            if (this.ax.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ax.length;
            var4 = var2 * var1 * this.ao;
            var5 = var3 - 1;
            if (this.ay == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               ag[var6] = this.ax[var7];
            }

            var10 = this.ax;
            this.ax = ag;
            ag = var10;
         }

         if (this.ay == 2 || this.ay == 4) {
            if (ag == null || ag.length < this.ax.length) {
               ag = new int[this.ax.length];
            }

            if (this.ax.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.ax.length;
            var4 = var1 * this.ao;
            var5 = var2 - 1;
            if (this.ay == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  ag[var8] = this.ax[var9];
               }
            }

            var10 = this.ax;
            this.ax = ag;
            ag = var10;
         }

      }
   }

   void at() {
      this.ax = null;
   }
}
