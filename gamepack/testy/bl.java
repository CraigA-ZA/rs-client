import accessors.RSRawPcmStream;

public class bl extends bp implements RSRawPcmStream {
   int ai;
   int an;
   int af;
   int ac;
   int au;
   int ab;
   int aq;
   int ax;
   int aw;
   int aa;
   boolean ay;
   int ao;
   int at;
   int al;
   int ag;

   synchronized void dm(int var1) {
      this.ai(var1, this.ah());
   }

   static int an(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4) + 0.5);
   }

   boolean ez() {
      int var1 = this.aw;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = af(var1, this.ac);
         var3 = an(var1, this.ac);
      }

      if (this.au == var1 && this.ab == var2 && this.aq == var3) {
         if (this.aw == -1658163659) {
            this.aw = 0;
            this.aq = 0;
            this.ab = 0;
            this.au = 0;
            this.ga();
            return true;
         } else {
            this.au();
            return false;
         }
      } else {
         if (this.au < var1) {
            this.ax = 1;
            this.ao = var1 - this.au;
         } else if (this.au > var1) {
            this.ax = -1;
            this.ao = this.au - var1;
         } else {
            this.ax = 0;
         }

         if (this.ab < var2) {
            this.ai = 1;
            if (this.ao == 0 || this.ao > var2 - this.ab) {
               this.ao = var2 - this.ab;
            }
         } else if (this.ab > var2) {
            this.ai = -1;
            if (this.ao == 0 || this.ao > this.ab - var2) {
               this.ao = this.ab - var2;
            }
         } else {
            this.ai = 0;
         }

         if (this.aq < var3) {
            this.ag = 1;
            if (this.ao == 0 || this.ao > var3 - this.aq) {
               this.ao = var3 - this.aq;
            }
         } else if (this.aq > var3) {
            this.ag = -1;
            if (this.ao == 0 || this.ao > this.aq - var3) {
               this.ao = this.aq - var3;
            }
         } else {
            this.ag = 0;
         }

         return false;
      }
   }

   int ba() {
      int var1 = this.au * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.al == 0) {
         var1 -= var1 * this.af / (((br)this.ar).an.length << 8);
      } else if (this.al >= 0) {
         var1 -= var1 * this.at / ((br)this.ar).an.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   bl(br var1, int var2, int var3, int var4) {
      this.ar = var1;
      this.at = var1.aw;
      this.aa = var1.ac;
      this.ay = var1.au;
      this.an = var2;
      this.aw = var3;
      this.ac = var4;
      this.af = 0;
      this.au();
   }

   public static bl aw(br var0, int var1, int var2) {
      return var0.an != null && var0.an.length != 0 ? new bl(var0, (int)((long)var0.af * 256L * (long)var1 / (long)(bu.au * 1511829972)), var2 << 6) : null;
   }

   static int cf(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4) + 0.5);
   }

   void au() {
      this.au = this.aw;
      this.ab = af(this.aw, this.ac);
      this.aq = an(this.aw, this.ac);
   }

   public synchronized void aa(int var1) {
      this.al = var1;
   }

   public static bl cx(br var0, int var1, int var2) {
      return var0.an != null && var0.an.length != 0 ? new bl(var0, (int)((long)var0.af * 256L * (long)var1 / (long)(bu.au * 1511829972)), var2 << 6) : null;
   }

   synchronized void ax(int var1) {
      this.ai(var1, this.ah());
   }

   synchronized void ai(int var1, int var2) {
      this.aw = var1;
      this.ac = var2;
      this.ao = 0;
      this.au();
   }

   public synchronized int ag() {
      return this.aw == Integer.MIN_VALUE ? 0 : this.aw;
   }

   protected int bz() {
      return this.aw == 0 && this.ao == 0 ? 0 : 1;
   }

   public synchronized void av(int var1) {
      int var2 = ((br)this.ar).an.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.af = var1;
   }

   public synchronized void ar(boolean var1) {
      this.an = (this.an ^ this.an >> 31) + (this.an >>> 31);
      if (var1) {
         this.an = -this.an;
      }

   }

   void am() {
      if (this.ao != 0) {
         if (this.aw == Integer.MIN_VALUE) {
            this.aw = 0;
         }

         this.ao = 0;
         this.au();
      }

   }

   static int cn(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      var11.ab -= var11.ai * var5;
      var11.aq -= var11.ag * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ab += var11.ai * var5;
      var11.aq += var11.ag * var5;
      var11.au = var6;
      var11.af = var4;
      return var5;
   }

   public synchronized void aj(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.ai(var2, var3);
      } else {
         int var4 = af(var2, var3);
         int var5 = an(var2, var3);
         if (this.ab == var4 && this.aq == var5) {
            this.ao = 0;
         } else {
            int var6 = var2 - this.au;
            if (this.au - var2 > var6) {
               var6 = this.au - var2;
            }

            if (var4 - this.ab > var6) {
               var6 = var4 - this.ab;
            }

            if (this.ab - var4 > var6) {
               var6 = this.ab - var4;
            }

            if (var5 - this.aq > var6) {
               var6 = var5 - this.aq;
            }

            if (this.aq - var5 > var6) {
               var6 = this.aq - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.ao = var1;
            this.aw = var2;
            this.ac = var3;
            this.ax = (var2 - this.au) / var1;
            this.ai = (var4 - this.ab) / var1;
            this.ag = (var5 - this.aq) / var1;
         }
      }
   }

   public synchronized void ak(int var1) {
      if (var1 == 0) {
         this.ax(0);
         this.ga();
      } else if (this.ab == 0 && this.aq == 0) {
         this.ao = 0;
         this.aw = 0;
         this.au = 0;
         this.ga();
      } else {
         int var2 = -this.au;
         if (this.au > var2) {
            var2 = this.au;
         }

         if (-this.ab > var2) {
            var2 = -this.ab;
         }

         if (this.ab > var2) {
            var2 = this.ab;
         }

         if (-this.aq > var2) {
            var2 = -this.aq;
         }

         if (this.aq > var2) {
            var2 = this.aq;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.ao = var1;
         this.aw = Integer.MIN_VALUE;
         this.ax = -this.au / var1;
         this.ai = -this.ab / var1;
         this.ag = -this.aq / var1;
      }
   }

   public synchronized void az(int var1) {
      if (this.an < 0) {
         this.an = -var1;
      } else {
         this.an = var1;
      }

   }

   public synchronized int ad() {
      return this.an < 0 ? -this.an : this.an;
   }

   public synchronized int dl() {
      return this.aw == Integer.MIN_VALUE ? 0 : this.aw;
   }

   public static bl cz(br var0, int var1, int var2, int var3) {
      return var0.an != null && var0.an.length != 0 ? new bl(var0, var1, var2, var3) : null;
   }

   protected bp ab() {
      return null;
   }

   protected bp aq() {
      return null;
   }

   boolean ej() {
      int var1 = this.aw;
      int var2;
      int var3;
      if (var1 == 2134917990) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = af(var1, this.ac);
         var3 = an(var1, this.ac);
      }

      if (this.au == var1 && this.ab == var2 && this.aq == var3) {
         if (this.aw == Integer.MIN_VALUE) {
            this.aw = 0;
            this.aq = 0;
            this.ab = 0;
            this.au = 0;
            this.ga();
            return true;
         } else {
            this.au();
            return false;
         }
      } else {
         if (this.au < var1) {
            this.ax = 1;
            this.ao = var1 - this.au;
         } else if (this.au > var1) {
            this.ax = -1;
            this.ao = this.au - var1;
         } else {
            this.ax = 0;
         }

         if (this.ab < var2) {
            this.ai = 1;
            if (this.ao == 0 || this.ao > var2 - this.ab) {
               this.ao = var2 - this.ab;
            }
         } else if (this.ab > var2) {
            this.ai = -1;
            if (this.ao == 0 || this.ao > this.ab - var2) {
               this.ao = this.ab - var2;
            }
         } else {
            this.ai = 0;
         }

         if (this.aq < var3) {
            this.ag = 1;
            if (this.ao == 0 || this.ao > var3 - this.aq) {
               this.ao = var3 - this.aq;
            }
         } else if (this.aq > var3) {
            this.ag = -1;
            if (this.ao == 0 || this.ao > this.aq - var3) {
               this.ao = this.aq - var3;
            }
         } else {
            this.ag = 0;
         }

         return false;
      }
   }

   public synchronized void db(int var1, int var2) {
      this.aj(var1, var2, this.ah());
   }

   public synchronized void at(int[] var1, int var2, int var3) {
      if (this.aw == 0 && this.ao == 0) {
         this.ay(var3);
      } else {
         br var4 = (br)this.ar;
         int var5 = this.at << 8;
         int var6 = this.aa << 8;
         int var7 = var4.an.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.al = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.af < 0) {
            if (this.an <= 0) {
               this.am();
               this.ga();
               return;
            }

            this.af = 0;
         }

         if (this.af >= var7) {
            if (this.an >= 0) {
               this.am();
               this.ga();
               return;
            }

            this.af = var7 - 1;
         }

         if (this.al < 0) {
            if (this.ay) {
               if (this.an < 0) {
                  var9 = this.bn(var1, var2, var5, var3, var4.an[this.at]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var5 + var5 - 1 - this.af;
                  this.an = -this.an;
               }

               while(true) {
                  var9 = this.by(var1, var9, var6, var3, var4.an[this.aa - 1]);
                  if (this.af < var6) {
                     return;
                  }

                  this.af = var6 + var6 - 1 - this.af;
                  this.an = -this.an;
                  var9 = this.bn(var1, var9, var5, var3, var4.an[this.at]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var5 + var5 - 1 - this.af;
                  this.an = -this.an;
               }
            } else if (this.an < 0) {
               while(true) {
                  var9 = this.bn(var1, var9, var5, var3, var4.an[this.aa - 1]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var6 - 1 - (var6 - 1 - this.af) % var8;
               }
            } else {
               while(true) {
                  var9 = this.by(var1, var9, var6, var3, var4.an[this.at]);
                  if (this.af < var6) {
                     return;
                  }

                  this.af = var5 + (this.af - var5) % var8;
               }
            }
         } else {
            if (this.al > 0) {
               if (this.ay) {
                  label187: {
                     if (this.an < 0) {
                        var9 = this.bn(var1, var2, var5, var3, var4.an[this.at]);
                        if (this.af >= var5) {
                           return;
                        }

                        this.af = var5 + var5 - 1 - this.af;
                        this.an = -this.an;
                        if (--this.al == 0) {
                           break label187;
                        }
                     }

                     do {
                        var9 = this.by(var1, var9, var6, var3, var4.an[this.aa - 1]);
                        if (this.af < var6) {
                           return;
                        }

                        this.af = var6 + var6 - 1 - this.af;
                        this.an = -this.an;
                        if (--this.al == 0) {
                           break;
                        }

                        var9 = this.bn(var1, var9, var5, var3, var4.an[this.at]);
                        if (this.af >= var5) {
                           return;
                        }

                        this.af = var5 + var5 - 1 - this.af;
                        this.an = -this.an;
                     } while(--this.al != 0);
                  }
               } else {
                  int var10;
                  if (this.an < 0) {
                     while(true) {
                        var9 = this.bn(var1, var9, var5, var3, var4.an[this.aa - 1]);
                        if (this.af >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.af) / var8;
                        if (var10 >= this.al) {
                           this.af += var8 * this.al;
                           this.al = 0;
                           break;
                        }

                        this.af += var8 * var10;
                        this.al -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.by(var1, var9, var6, var3, var4.an[this.at]);
                        if (this.af < var6) {
                           return;
                        }

                        var10 = (this.af - var5) / var8;
                        if (var10 >= this.al) {
                           this.af -= var8 * this.al;
                           this.al = 0;
                           break;
                        }

                        this.af -= var8 * var10;
                        this.al -= var10;
                     }
                  }
               }
            }

            if (this.an < 0) {
               this.bn(var1, var9, 0, var3, 0);
               if (this.af < 0) {
                  this.af = -1;
                  this.am();
                  this.ga();
               }
            } else {
               this.by(var1, var9, var7, var3, 0);
               if (this.af >= var7) {
                  this.af = var7;
                  this.am();
                  this.ga();
               }
            }

         }
      }
   }

   int by(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ao > 0) {
            int var6 = var2 + this.ao;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ao += var2;
            if (this.an == 256 && (this.af & 255) == 0) {
               if (bu.ab) {
                  var2 = ci(0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, this.ai, this.ag, 0, var6, var3, this);
               } else {
                  var2 = ce(((br)this.ar).an, var1, this.af, var2, this.au, this.ax, 0, var6, var3, this);
               }
            } else if (bu.ab) {
               var2 = ca(0, 0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, this.ai, this.ag, 0, var6, var3, this, this.an, var5);
            } else {
               var2 = cn(0, 0, ((br)this.ar).an, var1, this.af, var2, this.au, this.ax, 0, var6, var3, this, this.an, var5);
            }

            this.ao -= var2;
            if (this.ao != 0) {
               return var2;
            }

            if (!this.bs()) {
               continue;
            }

            return var4;
         }

         if (this.an == 256 && (this.af & 255) == 0) {
            if (bu.ab) {
               return bq(0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, 0, var4, var3, this);
            }

            return br(((br)this.ar).an, var1, this.af, var2, this.au, 0, var4, var3, this);
         }

         if (bu.ab) {
            return bc(0, 0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, 0, var4, var3, this, this.an, var5);
         }

         return bp(0, 0, ((br)this.ar).an, var1, this.af, var2, this.au, 0, var4, var3, this, this.an, var5);
      }
   }

   int bn(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ao > 0) {
            int var6 = var2 + this.ao;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ao += var2;
            if (this.an == -256 && (this.af & 255) == 0) {
               if (bu.ab) {
                  var2 = cc(0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, this.ai, this.ag, 0, var6, var3, this);
               } else {
                  var2 = cs(((br)this.ar).an, var1, this.af, var2, this.au, this.ax, 0, var6, var3, this);
               }
            } else if (bu.ab) {
               var2 = ck(0, 0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, this.ai, this.ag, 0, var6, var3, this, this.an, var5);
            } else {
               var2 = cu(0, 0, ((br)this.ar).an, var1, this.af, var2, this.au, this.ax, 0, var6, var3, this, this.an, var5);
            }

            this.ao -= var2;
            if (this.ao != 0) {
               return var2;
            }

            if (!this.bs()) {
               continue;
            }

            return var4;
         }

         if (this.an == -256 && (this.af & 255) == 0) {
            if (bu.ab) {
               return bl(0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, 0, var4, var3, this);
            }

            return bv(((br)this.ar).an, var1, this.af, var2, this.au, 0, var4, var3, this);
         }

         if (bu.ab) {
            return bw(0, 0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, 0, var4, var3, this, this.an, var5);
         }

         return bh(0, 0, ((br)this.ar).an, var1, this.af, var2, this.au, 0, var4, var3, this, this.an, var5);
      }
   }

   boolean bs() {
      int var1 = this.aw;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = af(var1, this.ac);
         var3 = an(var1, this.ac);
      }

      if (this.au == var1 && this.ab == var2 && this.aq == var3) {
         if (this.aw == Integer.MIN_VALUE) {
            this.aw = 0;
            this.aq = 0;
            this.ab = 0;
            this.au = 0;
            this.ga();
            return true;
         } else {
            this.au();
            return false;
         }
      } else {
         if (this.au < var1) {
            this.ax = 1;
            this.ao = var1 - this.au;
         } else if (this.au > var1) {
            this.ax = -1;
            this.ao = this.au - var1;
         } else {
            this.ax = 0;
         }

         if (this.ab < var2) {
            this.ai = 1;
            if (this.ao == 0 || this.ao > var2 - this.ab) {
               this.ao = var2 - this.ab;
            }
         } else if (this.ab > var2) {
            this.ai = -1;
            if (this.ao == 0 || this.ao > this.ab - var2) {
               this.ao = this.ab - var2;
            }
         } else {
            this.ai = 0;
         }

         if (this.aq < var3) {
            this.ag = 1;
            if (this.ao == 0 || this.ao > var3 - this.aq) {
               this.ao = var3 - this.aq;
            }
         } else if (this.aq > var3) {
            this.ag = -1;
            if (this.ao == 0 || this.ao > this.aq - var3) {
               this.ao = this.aq - var3;
            }
         } else {
            this.ag = 0;
         }

         return false;
      }
   }

   static int br(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bl var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.af = var2 << 8;
      return var3;
   }

   static int bq(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bl var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.af = var3 << 8;
      return var4 >> 1;
   }

   static int bv(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bl var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.af = var2 << 8;
      return var3;
   }

   static int ec(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bl var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.au += var12.ax * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.ab = var5 >> 2;
      var12.aq = var6 >> 2;
      var12.af = var3 << 8;
      return var4 >> 1;
   }

   static int bp(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bl var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.af = var4;
      return var5;
   }

   static int bc(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.af = var4;
      return var5 >> 1;
   }

   static int bh(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bl var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.af = var4;
      return var5;
   }

   static int bw(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.af = var4;
      return var5 >> 1;
   }

   protected bp bx() {
      return null;
   }

   static int eg(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bl var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.af = var3 << 8;
      return var4 >> 1;
   }

   static int cs(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bl var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.ab += var9.ai * (var6 - var3);
      var9.aq += var9.ag * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.au = var4 >> 2;
      var9.af = var2 << 8;
      return var3;
   }

   static int cl(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4) + 0.5);
   }

   public synchronized int ah() {
      return this.ac < 0 ? -1 : this.ac;
   }

   protected int al() {
      return this.aw == 0 && this.ao == 0 ? 0 : 1;
   }

   static int cu(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      var11.ab -= var11.ai * var5;
      var11.aq -= var11.ag * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ab += var11.ai * var5;
      var11.aq += var11.ag * var5;
      var11.au = var6;
      var11.af = var4;
      return var5;
   }

   static int ck(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bl var13, int var14, int var15) {
      var13.au -= var13.ax * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.au += var13.ax * var5;
      var13.ab = var6;
      var13.aq = var7;
      var13.af = var4;
      return var5;
   }

   protected bp bb() {
      return null;
   }

   protected bp bi() {
      return null;
   }

   protected bp be() {
      return null;
   }

   static int eu(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bl var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.af = var2 << 8;
      return var3;
   }

   static int bl(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bl var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.af = var3 << 8;
      return var4 >> 1;
   }

   static int cm(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4) + 0.5);
   }

   static int fl(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bl var13, int var14, int var15) {
      var13.au -= var13.ax * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.au += var13.ax * var5;
      var13.ab = var6;
      var13.aq = var7;
      var13.af = var4;
      return var5;
   }

   public synchronized void bm(int[] var1, int var2, int var3) {
      if (this.aw == 0 && this.ao == 0) {
         this.ay(var3);
      } else {
         br var4 = (br)this.ar;
         int var5 = this.at << 8;
         int var6 = this.aa << 8;
         int var7 = var4.an.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.al = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.af < 0) {
            if (this.an <= 0) {
               this.am();
               this.ga();
               return;
            }

            this.af = 0;
         }

         if (this.af >= var7) {
            if (this.an >= 0) {
               this.am();
               this.ga();
               return;
            }

            this.af = var7 - 1;
         }

         if (this.al < 0) {
            if (this.ay) {
               if (this.an < 0) {
                  var9 = this.bn(var1, var2, var5, var3, var4.an[this.at]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var5 + var5 - 1 - this.af;
                  this.an = -this.an;
               }

               while(true) {
                  var9 = this.by(var1, var9, var6, var3, var4.an[this.aa - 1]);
                  if (this.af < var6) {
                     return;
                  }

                  this.af = var6 + var6 - 1 - this.af;
                  this.an = -this.an;
                  var9 = this.bn(var1, var9, var5, var3, var4.an[this.at]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var5 + var5 - 1 - this.af;
                  this.an = -this.an;
               }
            } else if (this.an < 0) {
               while(true) {
                  var9 = this.bn(var1, var9, var5, var3, var4.an[this.aa - 1]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var6 - 1 - (var6 - 1 - this.af) % var8;
               }
            } else {
               while(true) {
                  var9 = this.by(var1, var9, var6, var3, var4.an[this.at]);
                  if (this.af < var6) {
                     return;
                  }

                  this.af = var5 + (this.af - var5) % var8;
               }
            }
         } else {
            if (this.al > 0) {
               if (this.ay) {
                  label182: {
                     if (this.an < 0) {
                        var9 = this.bn(var1, var2, var5, var3, var4.an[this.at]);
                        if (this.af >= var5) {
                           return;
                        }

                        this.af = var5 + var5 - 1 - this.af;
                        this.an = -this.an;
                        if (--this.al == 0) {
                           break label182;
                        }
                     }

                     do {
                        var9 = this.by(var1, var9, var6, var3, var4.an[this.aa - 1]);
                        if (this.af < var6) {
                           return;
                        }

                        this.af = var6 + var6 - 1 - this.af;
                        this.an = -this.an;
                        if (--this.al == 0) {
                           break;
                        }

                        var9 = this.bn(var1, var9, var5, var3, var4.an[this.at]);
                        if (this.af >= var5) {
                           return;
                        }

                        this.af = var5 + var5 - 1 - this.af;
                        this.an = -this.an;
                     } while(--this.al != 0);
                  }
               } else {
                  int var10;
                  if (this.an < 0) {
                     while(true) {
                        var9 = this.bn(var1, var9, var5, var3, var4.an[this.aa - 1]);
                        if (this.af >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.af) / var8;
                        if (var10 >= this.al) {
                           this.af += var8 * this.al;
                           this.al = 0;
                           break;
                        }

                        this.af += var8 * var10;
                        this.al -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.by(var1, var9, var6, var3, var4.an[this.at]);
                        if (this.af < var6) {
                           return;
                        }

                        var10 = (this.af - var5) / var8;
                        if (var10 >= this.al) {
                           this.af -= var8 * this.al;
                           this.al = 0;
                           break;
                        }

                        this.af -= var8 * var10;
                        this.al -= var10;
                     }
                  }
               }
            }

            if (this.an < 0) {
               this.bn(var1, var9, 0, var3, 0);
               if (this.af < 0) {
                  this.af = -1;
                  this.am();
                  this.ga();
               }
            } else {
               this.by(var1, var9, var7, var3, 0);
               if (this.af >= var7) {
                  this.af = var7;
                  this.am();
                  this.ga();
               }
            }

         }
      }
   }

   static int ce(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bl var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.ab += var9.ai * (var6 - var3);
      var9.aq += var9.ag * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.au = var4 >> 2;
      var9.af = var2 << 8;
      return var3;
   }

   public synchronized void bt(int[] var1, int var2, int var3) {
      if (this.aw == 0 && this.ao == 0) {
         this.ay(var3);
      } else {
         br var4 = (br)this.ar;
         int var5 = this.at << 8;
         int var6 = this.aa << 8;
         int var7 = var4.an.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.al = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.af < 0) {
            if (this.an <= 0) {
               this.am();
               this.ga();
               return;
            }

            this.af = 0;
         }

         if (this.af >= var7) {
            if (this.an >= 0) {
               this.am();
               this.ga();
               return;
            }

            this.af = var7 - 1;
         }

         if (this.al < 0) {
            if (this.ay) {
               if (this.an < 0) {
                  var9 = this.bn(var1, var2, var5, var3, var4.an[this.at]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var5 + var5 - 1 - this.af;
                  this.an = -this.an;
               }

               while(true) {
                  var9 = this.by(var1, var9, var6, var3, var4.an[this.aa - 1]);
                  if (this.af < var6) {
                     return;
                  }

                  this.af = var6 + var6 - 1 - this.af;
                  this.an = -this.an;
                  var9 = this.bn(var1, var9, var5, var3, var4.an[this.at]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var5 + var5 - 1 - this.af;
                  this.an = -this.an;
               }
            } else if (this.an < 0) {
               while(true) {
                  var9 = this.bn(var1, var9, var5, var3, var4.an[this.aa - 1]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var6 - 1 - (var6 - 1 - this.af) % var8;
               }
            } else {
               while(true) {
                  var9 = this.by(var1, var9, var6, var3, var4.an[this.at]);
                  if (this.af < var6) {
                     return;
                  }

                  this.af = var5 + (this.af - var5) % var8;
               }
            }
         } else {
            if (this.al > 0) {
               if (this.ay) {
                  label187: {
                     if (this.an < 0) {
                        var9 = this.bn(var1, var2, var5, var3, var4.an[this.at]);
                        if (this.af >= var5) {
                           return;
                        }

                        this.af = var5 + var5 - 1 - this.af;
                        this.an = -this.an;
                        if (--this.al == 0) {
                           break label187;
                        }
                     }

                     do {
                        var9 = this.by(var1, var9, var6, var3, var4.an[this.aa - 1]);
                        if (this.af < var6) {
                           return;
                        }

                        this.af = var6 + var6 - 1 - this.af;
                        this.an = -this.an;
                        if (--this.al == 0) {
                           break;
                        }

                        var9 = this.bn(var1, var9, var5, var3, var4.an[this.at]);
                        if (this.af >= var5) {
                           return;
                        }

                        this.af = var5 + var5 - 1 - this.af;
                        this.an = -this.an;
                     } while(--this.al != 0);
                  }
               } else {
                  int var10;
                  if (this.an < 0) {
                     while(true) {
                        var9 = this.bn(var1, var9, var5, var3, var4.an[this.aa - 1]);
                        if (this.af >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.af) / var8;
                        if (var10 >= this.al) {
                           this.af += var8 * this.al;
                           this.al = 0;
                           break;
                        }

                        this.af += var8 * var10;
                        this.al -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.by(var1, var9, var6, var3, var4.an[this.at]);
                        if (this.af < var6) {
                           return;
                        }

                        var10 = (this.af - var5) / var8;
                        if (var10 >= this.al) {
                           this.af -= var8 * this.al;
                           this.al = 0;
                           break;
                        }

                        this.af -= var8 * var10;
                        this.al -= var10;
                     }
                  }
               }
            }

            if (this.an < 0) {
               this.bn(var1, var9, 0, var3, 0);
               if (this.af < 0) {
                  this.af = -1;
                  this.am();
                  this.ga();
               }
            } else {
               this.by(var1, var9, var7, var3, 0);
               if (this.af >= var7) {
                  this.af = var7;
                  this.am();
                  this.ga();
               }
            }

         }
      }
   }

   public synchronized void bj(int[] var1, int var2, int var3) {
      if (this.aw == 0 && this.ao == 0) {
         this.ay(var3);
      } else {
         br var4 = (br)this.ar;
         int var5 = this.at << 8;
         int var6 = this.aa << 8;
         int var7 = var4.an.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.al = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.af < 0) {
            if (this.an <= 0) {
               this.am();
               this.ga();
               return;
            }

            this.af = 0;
         }

         if (this.af >= var7) {
            if (this.an >= 0) {
               this.am();
               this.ga();
               return;
            }

            this.af = var7 - 1;
         }

         if (this.al < 0) {
            if (this.ay) {
               if (this.an < 0) {
                  var9 = this.bn(var1, var2, var5, var3, var4.an[this.at]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var5 + var5 - 1 - this.af;
                  this.an = -this.an;
               }

               while(true) {
                  var9 = this.by(var1, var9, var6, var3, var4.an[this.aa - 1]);
                  if (this.af < var6) {
                     return;
                  }

                  this.af = var6 + var6 - 1 - this.af;
                  this.an = -this.an;
                  var9 = this.bn(var1, var9, var5, var3, var4.an[this.at]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var5 + var5 - 1 - this.af;
                  this.an = -this.an;
               }
            } else if (this.an < 0) {
               while(true) {
                  var9 = this.bn(var1, var9, var5, var3, var4.an[this.aa - 1]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var6 - 1 - (var6 - 1 - this.af) % var8;
               }
            } else {
               while(true) {
                  var9 = this.by(var1, var9, var6, var3, var4.an[this.at]);
                  if (this.af < var6) {
                     return;
                  }

                  this.af = var5 + (this.af - var5) % var8;
               }
            }
         } else {
            if (this.al > 0) {
               if (this.ay) {
                  label171: {
                     if (this.an < 0) {
                        var9 = this.bn(var1, var2, var5, var3, var4.an[this.at]);
                        if (this.af >= var5) {
                           return;
                        }

                        this.af = var5 + var5 - 1 - this.af;
                        this.an = -this.an;
                        if (--this.al == 0) {
                           break label171;
                        }
                     }

                     do {
                        var9 = this.by(var1, var9, var6, var3, var4.an[this.aa - 1]);
                        if (this.af < var6) {
                           return;
                        }

                        this.af = var6 + var6 - 1 - this.af;
                        this.an = -this.an;
                        if (--this.al == 0) {
                           break;
                        }

                        var9 = this.bn(var1, var9, var5, var3, var4.an[this.at]);
                        if (this.af >= var5) {
                           return;
                        }

                        this.af = var5 + var5 - 1 - this.af;
                        this.an = -this.an;
                     } while(--this.al != 0);
                  }
               } else {
                  int var10;
                  if (this.an < 0) {
                     while(true) {
                        var9 = this.bn(var1, var9, var5, var3, var4.an[this.aa - 1]);
                        if (this.af >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.af) / var8;
                        if (var10 >= this.al) {
                           this.af += var8 * this.al;
                           this.al = 0;
                           break;
                        }

                        this.af += var8 * var10;
                        this.al -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.by(var1, var9, var6, var3, var4.an[this.at]);
                        if (this.af < var6) {
                           return;
                        }

                        var10 = (this.af - var5) / var8;
                        if (var10 >= this.al) {
                           this.af -= var8 * this.al;
                           this.al = 0;
                           break;
                        }

                        this.af -= var8 * var10;
                        this.al -= var10;
                     }
                  }
               }
            }

            if (this.an < 0) {
               this.bn(var1, var9, 0, var3, 0);
               if (this.af < 0) {
                  this.af = -1;
                  this.am();
                  this.ga();
               }
            } else {
               this.by(var1, var9, var7, var3, 0);
               if (this.af >= var7) {
                  this.af = var7;
                  this.am();
                  this.ga();
               }
            }

         }
      }
   }

   public synchronized void bg(int var1) {
      if (this.ao > 0) {
         if (var1 >= this.ao) {
            if (this.aw == Integer.MIN_VALUE) {
               this.aw = 0;
               this.aq = 0;
               this.ab = 0;
               this.au = 0;
               this.ga();
               var1 = this.ao;
            }

            this.ao = 0;
            this.au();
         } else {
            this.au += this.ax * var1;
            this.ab += this.ai * var1;
            this.aq += this.ag * var1;
            this.ao -= var1;
         }
      }

      br var2 = (br)this.ar;
      int var3 = this.at << 8;
      int var4 = this.aa << 8;
      int var5 = var2.an.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.al = 0;
      }

      if (this.af < 0) {
         if (this.an <= 0) {
            this.am();
            this.ga();
            return;
         }

         this.af = 0;
      }

      if (this.af >= var5) {
         if (this.an >= 0) {
            this.am();
            this.ga();
            return;
         }

         this.af = var5 - 1;
      }

      this.af += this.an * var1;
      if (this.al < 0) {
         if (!this.ay) {
            if (this.an < 0) {
               if (this.af >= var3) {
                  return;
               }

               this.af = var4 - 1 - (var4 - 1 - this.af) % var6;
            } else {
               if (this.af < var4) {
                  return;
               }

               this.af = var3 + (this.af - var3) % var6;
            }

         } else {
            if (this.an < 0) {
               if (this.af >= var3) {
                  return;
               }

               this.af = var3 + var3 - 1 - this.af;
               this.an = -this.an;
            }

            while(this.af >= var4) {
               this.af = var4 + var4 - 1 - this.af;
               this.an = -this.an;
               if (this.af >= var3) {
                  return;
               }

               this.af = var3 + var3 - 1 - this.af;
               this.an = -this.an;
            }

         }
      } else {
         if (this.al > 0) {
            if (this.ay) {
               label161: {
                  if (this.an < 0) {
                     if (this.af >= var3) {
                        return;
                     }

                     this.af = var3 + var3 - 1 - this.af;
                     this.an = -this.an;
                     if (--this.al == 0) {
                        break label161;
                     }
                  }

                  do {
                     if (this.af < var4) {
                        return;
                     }

                     this.af = var4 + var4 - 1 - this.af;
                     this.an = -this.an;
                     if (--this.al == 0) {
                        break;
                     }

                     if (this.af >= var3) {
                        return;
                     }

                     this.af = var3 + var3 - 1 - this.af;
                     this.an = -this.an;
                  } while(--this.al != 0);
               }
            } else {
               label193: {
                  int var7;
                  if (this.an < 0) {
                     if (this.af >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.af) / var6;
                     if (var7 >= this.al) {
                        this.af += var6 * this.al;
                        this.al = 0;
                        break label193;
                     }

                     this.af += var6 * var7;
                     this.al -= var7;
                  } else {
                     if (this.af < var4) {
                        return;
                     }

                     var7 = (this.af - var3) / var6;
                     if (var7 >= this.al) {
                        this.af -= var6 * this.al;
                        this.al = 0;
                        break label193;
                     }

                     this.af -= var6 * var7;
                     this.al -= var7;
                  }

                  return;
               }
            }
         }

         if (this.an < 0) {
            if (this.af < 0) {
               this.af = -1;
               this.am();
               this.ga();
            }
         } else if (this.af >= var5) {
            this.af = var5;
            this.am();
            this.ga();
         }

      }
   }

   public synchronized void bu(int var1) {
      if (this.ao > 0) {
         if (var1 >= this.ao) {
            if (this.aw == Integer.MIN_VALUE) {
               this.aw = 0;
               this.aq = 0;
               this.ab = 0;
               this.au = 0;
               this.ga();
               var1 = this.ao;
            }

            this.ao = 0;
            this.au();
         } else {
            this.au += this.ax * var1;
            this.ab += this.ai * var1;
            this.aq += this.ag * var1;
            this.ao -= var1;
         }
      }

      br var2 = (br)this.ar;
      int var3 = this.at << 8;
      int var4 = this.aa << 8;
      int var5 = var2.an.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.al = 0;
      }

      if (this.af < 0) {
         if (this.an <= 0) {
            this.am();
            this.ga();
            return;
         }

         this.af = 0;
      }

      if (this.af >= var5) {
         if (this.an >= 0) {
            this.am();
            this.ga();
            return;
         }

         this.af = var5 - 1;
      }

      this.af += this.an * var1;
      if (this.al < 0) {
         if (!this.ay) {
            if (this.an < 0) {
               if (this.af >= var3) {
                  return;
               }

               this.af = var4 - 1 - (var4 - 1 - this.af) % var6;
            } else {
               if (this.af < var4) {
                  return;
               }

               this.af = var3 + (this.af - var3) % var6;
            }

         } else {
            if (this.an < 0) {
               if (this.af >= var3) {
                  return;
               }

               this.af = var3 + var3 - 1 - this.af;
               this.an = -this.an;
            }

            while(this.af >= var4) {
               this.af = var4 + var4 - 1 - this.af;
               this.an = -this.an;
               if (this.af >= var3) {
                  return;
               }

               this.af = var3 + var3 - 1 - this.af;
               this.an = -this.an;
            }

         }
      } else {
         if (this.al > 0) {
            if (this.ay) {
               label174: {
                  if (this.an < 0) {
                     if (this.af >= var3) {
                        return;
                     }

                     this.af = var3 + var3 - 1 - this.af;
                     this.an = -this.an;
                     if (--this.al == 0) {
                        break label174;
                     }
                  }

                  do {
                     if (this.af < var4) {
                        return;
                     }

                     this.af = var4 + var4 - 1 - this.af;
                     this.an = -this.an;
                     if (--this.al == 0) {
                        break;
                     }

                     if (this.af >= var3) {
                        return;
                     }

                     this.af = var3 + var3 - 1 - this.af;
                     this.an = -this.an;
                  } while(--this.al != 0);
               }
            } else {
               int var7;
               if (this.an < 0) {
                  if (this.af >= var3) {
                     return;
                  }

                  var7 = (var4 - 1 - this.af) / var6;
                  if (var7 < this.al) {
                     this.af += var6 * var7;
                     this.al -= var7;
                     return;
                  }

                  this.af += var6 * this.al;
                  this.al = 0;
               } else {
                  if (this.af < var4) {
                     return;
                  }

                  var7 = (this.af - var3) / var6;
                  if (var7 < this.al) {
                     this.af -= var6 * var7;
                     this.al -= var7;
                     return;
                  }

                  this.af -= var6 * this.al;
                  this.al = 0;
               }
            }
         }

         if (this.an < 0) {
            if (this.af < 0) {
               this.af = -1;
               this.am();
               this.ga();
            }
         } else if (this.af >= var5) {
            this.af = var5;
            this.am();
            this.ga();
         }

      }
   }

   static int fp(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bl var13, int var14, int var15) {
      var13.au -= var13.ax * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 981456011) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 1795215936);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.au += var13.ax * var5;
      var13.ab = var6;
      var13.aq = var7;
      var13.af = var4;
      return var5;
   }

   public synchronized void ay(int var1) {
      if (this.ao > 0) {
         if (var1 >= this.ao) {
            if (this.aw == Integer.MIN_VALUE) {
               this.aw = 0;
               this.aq = 0;
               this.ab = 0;
               this.au = 0;
               this.ga();
               var1 = this.ao;
            }

            this.ao = 0;
            this.au();
         } else {
            this.au += this.ax * var1;
            this.ab += this.ai * var1;
            this.aq += this.ag * var1;
            this.ao -= var1;
         }
      }

      br var2 = (br)this.ar;
      int var3 = this.at << 8;
      int var4 = this.aa << 8;
      int var5 = var2.an.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.al = 0;
      }

      if (this.af < 0) {
         if (this.an <= 0) {
            this.am();
            this.ga();
            return;
         }

         this.af = 0;
      }

      if (this.af >= var5) {
         if (this.an >= 0) {
            this.am();
            this.ga();
            return;
         }

         this.af = var5 - 1;
      }

      this.af += this.an * var1;
      if (this.al < 0) {
         if (!this.ay) {
            if (this.an < 0) {
               if (this.af >= var3) {
                  return;
               }

               this.af = var4 - 1 - (var4 - 1 - this.af) % var6;
            } else {
               if (this.af < var4) {
                  return;
               }

               this.af = var3 + (this.af - var3) % var6;
            }

         } else {
            if (this.an < 0) {
               if (this.af >= var3) {
                  return;
               }

               this.af = var3 + var3 - 1 - this.af;
               this.an = -this.an;
            }

            while(this.af >= var4) {
               this.af = var4 + var4 - 1 - this.af;
               this.an = -this.an;
               if (this.af >= var3) {
                  return;
               }

               this.af = var3 + var3 - 1 - this.af;
               this.an = -this.an;
            }

         }
      } else {
         if (this.al > 0) {
            if (this.ay) {
               label172: {
                  if (this.an < 0) {
                     if (this.af >= var3) {
                        return;
                     }

                     this.af = var3 + var3 - 1 - this.af;
                     this.an = -this.an;
                     if (--this.al == 0) {
                        break label172;
                     }
                  }

                  do {
                     if (this.af < var4) {
                        return;
                     }

                     this.af = var4 + var4 - 1 - this.af;
                     this.an = -this.an;
                     if (--this.al == 0) {
                        break;
                     }

                     if (this.af >= var3) {
                        return;
                     }

                     this.af = var3 + var3 - 1 - this.af;
                     this.an = -this.an;
                  } while(--this.al != 0);
               }
            } else {
               int var7;
               if (this.an < 0) {
                  if (this.af >= var3) {
                     return;
                  }

                  var7 = (var4 - 1 - this.af) / var6;
                  if (var7 < this.al) {
                     this.af += var6 * var7;
                     this.al -= var7;
                     return;
                  }

                  this.af += var6 * this.al;
                  this.al = 0;
               } else {
                  if (this.af < var4) {
                     return;
                  }

                  var7 = (this.af - var3) / var6;
                  if (var7 < this.al) {
                     this.af -= var6 * var7;
                     this.al -= var7;
                     return;
                  }

                  this.af -= var6 * this.al;
                  this.al = 0;
               }
            }
         }

         if (this.an < 0) {
            if (this.af < 0) {
               this.af = -1;
               this.am();
               this.ga();
            }
         } else if (this.af >= var5) {
            this.af = var5;
            this.am();
            this.ga();
         }

      }
   }

   synchronized void dc(int var1, int var2) {
      this.aw = var1;
      this.ac = var2;
      this.ao = 0;
      this.au();
   }

   static int es(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bl var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.af = var2 << 8;
      return var3;
   }

   int cy() {
      int var1 = this.au * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.al == 0) {
         var1 -= var1 * this.af / (((br)this.ar).an.length << 8);
      } else if (this.al >= 0) {
         var1 -= var1 * this.at / ((br)this.ar).an.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   public synchronized void dg(int var1) {
      int var2 = ((br)this.ar).an.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.af = var1;
   }

   static int ex(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + -1853811354 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.af = var4;
      return var5 >> 1;
   }

   static int ci(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bl var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.au += var12.ax * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.ab = var5 >> 2;
      var12.aq = var6 >> 2;
      var12.af = var3 << 8;
      return var4 >> 1;
   }

   static int fe(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bl var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.au += var12.ax * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.ab = var5 >> 2;
      var12.aq = var6 >> 2;
      var12.af = var3 << 8;
      return var4 >> 1;
   }

   public static bl cv(br var0, int var1, int var2) {
      return var0.an != null && var0.an.length != 0 ? new bl(var0, (int)((long)var0.af * 256L * (long)var1 / (long)(bu.au * 1511829972)), var2 << 6) : null;
   }

   public static bl cb(br var0, int var1, int var2) {
      return var0.an != null && var0.an.length != 0 ? new bl(var0, (int)((long)var0.af * 256L * (long)var1 / (long)(bu.au * 1511829972)), var2 << 6) : null;
   }

   public static bl co(br var0, int var1, int var2) {
      return var0.an != null && var0.an.length != 0 ? new bl(var0, (int)((long)var0.af * 256L * (long)var1 / (long)(bu.au * 1511829972)), var2 << 6) : null;
   }

   static int ew(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bl var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.af = var4;
      return var5;
   }

   public static bl cw(br var0, int var1, int var2, int var3) {
      return var0.an != null && var0.an.length != 0 ? new bl(var0, var1, var2, var3) : null;
   }

   static int cc(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bl var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.au += var12.ax * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.ab = var5 >> 2;
      var12.aq = var6 >> 2;
      var12.af = var3 << 8;
      return var4 >> 1;
   }

   void ch() {
      this.au = this.aw;
      this.ab = af(this.aw, this.ac);
      this.aq = an(this.aw, this.ac);
   }

   int cr() {
      int var1 = this.au * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.al == 0) {
         var1 -= var1 * this.af / (((br)this.ar).an.length << 8);
      } else if (this.al >= 0) {
         var1 -= var1 * this.at / ((br)this.ar).an.length;
      }

      return var1 > 255 ? -516096724 : var1;
   }

   void cp() {
      this.au = this.aw;
      this.ab = af(this.aw, this.ac);
      this.aq = an(this.aw, this.ac);
   }

   public synchronized void cd(int var1) {
      this.al = var1;
   }

   public static bl cj(br var0, int var1, int var2, int var3) {
      return var0.an != null && var0.an.length != 0 ? new bl(var0, var1, var2, var3) : null;
   }

   public static bl ac(br var0, int var1, int var2, int var3) {
      return var0.an != null && var0.an.length != 0 ? new bl(var0, var1, var2, var3) : null;
   }

   public synchronized void ao(int var1) {
      this.ai(var1 << 6, this.ah());
   }

   protected int bo() {
      return this.aw == 0 && this.ao == 0 ? 0 : 1;
   }

   synchronized void di(int var1, int var2) {
      this.aw = var1;
      this.ac = var2;
      this.ao = 0;
      this.au();
   }

   synchronized void dr(int var1, int var2) {
      this.aw = var1;
      this.ac = var2;
      this.ao = 0;
      this.au();
   }

   void dp() {
      if (this.ao != 0) {
         if (this.aw == Integer.MIN_VALUE) {
            this.aw = 0;
         }

         this.ao = 0;
         this.au();
      }

   }

   public synchronized int dk() {
      return this.aw == Integer.MIN_VALUE ? 0 : this.aw;
   }

   public synchronized int dt() {
      return this.ac < 0 ? -1 : this.ac;
   }

   public synchronized int dv() {
      return this.ac < 0 ? -1 : this.ac;
   }

   public synchronized void dz(int var1) {
      int var2 = ((br)this.ar).an.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.af = var1;
   }

   public boolean ae() {
      return this.af < 0 || this.af >= ((br)this.ar).an.length << 8;
   }

   public synchronized void de(boolean var1) {
      this.an = (this.an ^ this.an >> 1601131267) + (this.an >>> -884329064);
      if (var1) {
         this.an = -this.an;
      }

   }

   public synchronized void dh(boolean var1) {
      this.an = (this.an ^ this.an >> 31) + (this.an >>> 31);
      if (var1) {
         this.an = -this.an;
      }

   }

   bl(br var1, int var2, int var3) {
      this.ar = var1;
      this.at = var1.aw;
      this.aa = var1.ac;
      this.ay = var1.au;
      this.an = var2;
      this.aw = var3;
      this.ac = 8192;
      this.af = 0;
      this.au();
   }

   void du() {
      if (this.ao != 0) {
         if (this.aw == Integer.MIN_VALUE) {
            this.aw = 0;
         }

         this.ao = 0;
         this.au();
      }

   }

   static int af(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4) + 0.5);
   }

   int cg() {
      int var1 = this.au * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.al == 0) {
         var1 -= var1 * this.af / (((br)this.ar).an.length << 8);
      } else if (this.al >= 0) {
         var1 -= var1 * this.at / ((br)this.ar).an.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   public synchronized void dq(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.ai(var2, var3);
      } else {
         int var4 = af(var2, var3);
         int var5 = an(var2, var3);
         if (this.ab == var4 && this.aq == var5) {
            this.ao = 0;
         } else {
            int var6 = var2 - this.au;
            if (this.au - var2 > var6) {
               var6 = this.au - var2;
            }

            if (var4 - this.ab > var6) {
               var6 = var4 - this.ab;
            }

            if (this.ab - var4 > var6) {
               var6 = this.ab - var4;
            }

            if (var5 - this.aq > var6) {
               var6 = var5 - this.aq;
            }

            if (this.aq - var5 > var6) {
               var6 = this.aq - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.ao = var1;
            this.aw = var2;
            this.ac = var3;
            this.ax = (var2 - this.au) / var1;
            this.ai = (var4 - this.ab) / var1;
            this.ag = (var5 - this.aq) / var1;
         }
      }
   }

   public synchronized void dd(int var1) {
      if (var1 == 0) {
         this.ax(0);
         this.ga();
      } else if (this.ab == 0 && this.aq == 0) {
         this.ao = 0;
         this.aw = 0;
         this.au = 0;
         this.ga();
      } else {
         int var2 = -this.au;
         if (this.au > var2) {
            var2 = this.au;
         }

         if (-this.ab > var2) {
            var2 = -this.ab;
         }

         if (this.ab > var2) {
            var2 = this.ab;
         }

         if (-this.aq > var2) {
            var2 = -this.aq;
         }

         if (this.aq > var2) {
            var2 = this.aq;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.ao = var1;
         this.aw = Integer.MIN_VALUE;
         this.ax = -this.au / var1;
         this.ai = -this.ab / var1;
         this.ag = -this.aq / var1;
      }
   }

   public synchronized void dj(int var1) {
      if (var1 == 0) {
         this.ax(0);
         this.ga();
      } else if (this.ab == 0 && this.aq == 0) {
         this.ao = 0;
         this.aw = 0;
         this.au = 0;
         this.ga();
      } else {
         int var2 = -this.au;
         if (this.au > var2) {
            var2 = this.au;
         }

         if (-this.ab > var2) {
            var2 = -this.ab;
         }

         if (this.ab > var2) {
            var2 = this.ab;
         }

         if (-this.aq > var2) {
            var2 = -this.aq;
         }

         if (this.aq > var2) {
            var2 = this.aq;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.ao = var1;
         this.aw = Integer.MIN_VALUE;
         this.ax = -this.au / var1;
         this.ai = -this.ab / var1;
         this.ag = -this.aq / var1;
      }
   }

   public synchronized void dx(int var1) {
      if (var1 == 0) {
         this.ax(0);
         this.ga();
      } else if (this.ab == 0 && this.aq == 0) {
         this.ao = 0;
         this.aw = 0;
         this.au = 0;
         this.ga();
      } else {
         int var2 = -this.au;
         if (this.au > var2) {
            var2 = this.au;
         }

         if (-this.ab > var2) {
            var2 = -this.ab;
         }

         if (this.ab > var2) {
            var2 = this.ab;
         }

         if (-this.aq > var2) {
            var2 = -this.aq;
         }

         if (this.aq > var2) {
            var2 = this.aq;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.ao = var1;
         this.aw = Integer.MIN_VALUE;
         this.ax = -this.au / var1;
         this.ai = -this.ab / var1;
         this.ag = -this.aq / var1;
      }
   }

   public synchronized void dn(int var1) {
      if (this.an < 0) {
         this.an = -var1;
      } else {
         this.an = var1;
      }

   }

   public synchronized void dy(int var1) {
      if (this.an < 0) {
         this.an = -var1;
      } else {
         this.an = var1;
      }

   }

   public synchronized int ds() {
      return this.an < 0 ? -this.an : this.an;
   }

   public synchronized void df(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.ai(var2, var3);
      } else {
         int var4 = af(var2, var3);
         int var5 = an(var2, var3);
         if (this.ab == var4 && this.aq == var5) {
            this.ao = 0;
         } else {
            int var6 = var2 - this.au;
            if (this.au - var2 > var6) {
               var6 = this.au - var2;
            }

            if (var4 - this.ab > var6) {
               var6 = var4 - this.ab;
            }

            if (this.ab - var4 > var6) {
               var6 = this.ab - var4;
            }

            if (var5 - this.aq > var6) {
               var6 = var5 - this.aq;
            }

            if (this.aq - var5 > var6) {
               var6 = this.aq - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.ao = var1;
            this.aw = var2;
            this.ac = var3;
            this.ax = (var2 - this.au) / var1;
            this.ai = (var4 - this.ab) / var1;
            this.ag = (var5 - this.aq) / var1;
         }
      }
   }

   public boolean ep() {
      return this.af < 0 || this.af >= ((br)this.ar).an.length << 8;
   }

   public boolean eo() {
      return this.ao != 0;
   }

   public boolean eq() {
      return this.ao != 0;
   }

   int et(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ao > 0) {
            int var6 = var2 + this.ao;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ao += var2;
            if (this.an == 256 && (this.af & -260722617) == 0) {
               if (bu.ab) {
                  var2 = ci(0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, this.ai, this.ag, 0, var6, var3, this);
               } else {
                  var2 = ce(((br)this.ar).an, var1, this.af, var2, this.au, this.ax, 0, var6, var3, this);
               }
            } else if (bu.ab) {
               var2 = ca(0, 0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, this.ai, this.ag, 0, var6, var3, this, this.an, var5);
            } else {
               var2 = cn(0, 0, ((br)this.ar).an, var1, this.af, var2, this.au, this.ax, 0, var6, var3, this, this.an, var5);
            }

            this.ao -= var2;
            if (this.ao != 0) {
               return var2;
            }

            if (!this.bs()) {
               continue;
            }

            return var4;
         }

         if (this.an == 256 && (this.af & 255) == 0) {
            if (bu.ab) {
               return bq(0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, 0, var4, var3, this);
            }

            return br(((br)this.ar).an, var1, this.af, var2, this.au, 0, var4, var3, this);
         }

         if (bu.ab) {
            return bc(0, 0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, 0, var4, var3, this, this.an, var5);
         }

         return bp(0, 0, ((br)this.ar).an, var1, this.af, var2, this.au, 0, var4, var3, this, this.an, var5);
      }
   }

   int ef(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ao > 0) {
            int var6 = var2 + this.ao;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ao += var2;
            if (this.an == -256 && (this.af & 255) == 0) {
               if (bu.ab) {
                  var2 = cc(0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, this.ai, this.ag, 0, var6, var3, this);
               } else {
                  var2 = cs(((br)this.ar).an, var1, this.af, var2, this.au, this.ax, 0, var6, var3, this);
               }
            } else if (bu.ab) {
               var2 = ck(0, 0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, this.ai, this.ag, 0, var6, var3, this, this.an, var5);
            } else {
               var2 = cu(0, 0, ((br)this.ar).an, var1, this.af, var2, this.au, this.ax, 0, var6, var3, this, this.an, var5);
            }

            this.ao -= var2;
            if (this.ao != 0) {
               return var2;
            }

            if (!this.bs()) {
               continue;
            }

            return var4;
         }

         if (this.an == -256 && (this.af & 255) == 0) {
            if (bu.ab) {
               return bl(0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, 0, var4, var3, this);
            }

            return bv(((br)this.ar).an, var1, this.af, var2, this.au, 0, var4, var3, this);
         }

         if (bu.ab) {
            return bw(0, 0, ((br)this.ar).an, var1, this.af, var2, this.ab, this.aq, 0, var4, var3, this, this.an, var5);
         }

         return bh(0, 0, ((br)this.ar).an, var1, this.af, var2, this.au, 0, var4, var3, this, this.an, var5);
      }
   }

   public synchronized int da() {
      return this.an < 0 ? -this.an : this.an;
   }

   static int ei(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bl var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.ab += var9.ai * (var6 - var3);
      var9.aq += var9.ag * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.au = var4 >> 2;
      var9.af = var2 << 8;
      return var3;
   }

   boolean ea() {
      int var1 = this.aw;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = af(var1, this.ac);
         var3 = an(var1, this.ac);
      }

      if (this.au == var1 && this.ab == var2 && this.aq == var3) {
         if (this.aw == Integer.MIN_VALUE) {
            this.aw = 0;
            this.aq = 0;
            this.ab = 0;
            this.au = 0;
            this.ga();
            return true;
         } else {
            this.au();
            return false;
         }
      } else {
         if (this.au < var1) {
            this.ax = 1;
            this.ao = var1 - this.au;
         } else if (this.au > var1) {
            this.ax = -1;
            this.ao = this.au - var1;
         } else {
            this.ax = 0;
         }

         if (this.ab < var2) {
            this.ai = 1;
            if (this.ao == 0 || this.ao > var2 - this.ab) {
               this.ao = var2 - this.ab;
            }
         } else if (this.ab > var2) {
            this.ai = -1;
            if (this.ao == 0 || this.ao > this.ab - var2) {
               this.ao = this.ab - var2;
            }
         } else {
            this.ai = 0;
         }

         if (this.aq < var3) {
            this.ag = 1;
            if (this.ao == 0 || this.ao > var3 - this.aq) {
               this.ao = var3 - this.aq;
            }
         } else if (this.aq > var3) {
            this.ag = -1;
            if (this.ao == 0 || this.ao > this.aq - var3) {
               this.ao = this.aq - var3;
            }
         } else {
            this.ag = 0;
         }

         return false;
      }
   }

   public synchronized void bd(int[] var1, int var2, int var3) {
      if (this.aw == 0 && this.ao == 0) {
         this.ay(var3);
      } else {
         br var4 = (br)this.ar;
         int var5 = this.at << 8;
         int var6 = this.aa << 8;
         int var7 = var4.an.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.al = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.af < 0) {
            if (this.an <= 0) {
               this.am();
               this.ga();
               return;
            }

            this.af = 0;
         }

         if (this.af >= var7) {
            if (this.an >= 0) {
               this.am();
               this.ga();
               return;
            }

            this.af = var7 - 1;
         }

         if (this.al < 0) {
            if (this.ay) {
               if (this.an < 0) {
                  var9 = this.bn(var1, var2, var5, var3, var4.an[this.at]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var5 + var5 - 1 - this.af;
                  this.an = -this.an;
               }

               while(true) {
                  var9 = this.by(var1, var9, var6, var3, var4.an[this.aa - 1]);
                  if (this.af < var6) {
                     return;
                  }

                  this.af = var6 + var6 - 1 - this.af;
                  this.an = -this.an;
                  var9 = this.bn(var1, var9, var5, var3, var4.an[this.at]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var5 + var5 - 1 - this.af;
                  this.an = -this.an;
               }
            } else if (this.an < 0) {
               while(true) {
                  var9 = this.bn(var1, var9, var5, var3, var4.an[this.aa - 1]);
                  if (this.af >= var5) {
                     return;
                  }

                  this.af = var6 - 1 - (var6 - 1 - this.af) % var8;
               }
            } else {
               while(true) {
                  var9 = this.by(var1, var9, var6, var3, var4.an[this.at]);
                  if (this.af < var6) {
                     return;
                  }

                  this.af = var5 + (this.af - var5) % var8;
               }
            }
         } else {
            if (this.al > 0) {
               if (this.ay) {
                  label180: {
                     if (this.an < 0) {
                        var9 = this.bn(var1, var2, var5, var3, var4.an[this.at]);
                        if (this.af >= var5) {
                           return;
                        }

                        this.af = var5 + var5 - 1 - this.af;
                        this.an = -this.an;
                        if (--this.al == 0) {
                           break label180;
                        }
                     }

                     do {
                        var9 = this.by(var1, var9, var6, var3, var4.an[this.aa - 1]);
                        if (this.af < var6) {
                           return;
                        }

                        this.af = var6 + var6 - 1 - this.af;
                        this.an = -this.an;
                        if (--this.al == 0) {
                           break;
                        }

                        var9 = this.bn(var1, var9, var5, var3, var4.an[this.at]);
                        if (this.af >= var5) {
                           return;
                        }

                        this.af = var5 + var5 - 1 - this.af;
                        this.an = -this.an;
                     } while(--this.al != 0);
                  }
               } else {
                  int var10;
                  if (this.an < 0) {
                     while(true) {
                        var9 = this.bn(var1, var9, var5, var3, var4.an[this.aa - 1]);
                        if (this.af >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.af) / var8;
                        if (var10 >= this.al) {
                           this.af += var8 * this.al;
                           this.al = 0;
                           break;
                        }

                        this.af += var8 * var10;
                        this.al -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.by(var1, var9, var6, var3, var4.an[this.at]);
                        if (this.af < var6) {
                           return;
                        }

                        var10 = (this.af - var5) / var8;
                        if (var10 >= this.al) {
                           this.af -= var8 * this.al;
                           this.al = 0;
                           break;
                        }

                        this.af -= var8 * var10;
                        this.al -= var10;
                     }
                  }
               }
            }

            if (this.an < 0) {
               this.bn(var1, var9, 0, var3, 0);
               if (this.af < 0) {
                  this.af = -1;
                  this.am();
                  this.ga();
               }
            } else {
               this.by(var1, var9, var7, var3, 0);
               if (this.af >= var7) {
                  this.af = var7;
                  this.am();
                  this.ga();
               }
            }

         }
      }
   }

   static int cq(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4) + 0.5);
   }

   static int eb(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bl var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.af = var2 << 8;
      return var3;
   }

   static int el(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bl var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.af = var3 << 8;
      return var4 >> 1;
   }

   public synchronized void as(int var1, int var2) {
      this.aj(var1, var2, this.ah());
   }

   static int er(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bl var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.af = var3 << 8;
      return var4 >> 1;
   }

   synchronized void do(int var1, int var2) {
      this.aw = var1;
      this.ac = var2;
      this.ao = 0;
      this.au();
   }

   static int ed(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - -206029878) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.af = var4;
      return var5 >> 1;
   }

   static int ev(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.af = var4;
      return var5 >> 1;
   }

   static int em(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - -941768931) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & -487516446);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 2084420931);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.af = var4;
      return var5 >> 1;
   }

   public synchronized void bf(int var1) {
      if (this.ao > 0) {
         if (var1 >= this.ao) {
            if (this.aw == Integer.MIN_VALUE) {
               this.aw = 0;
               this.aq = 0;
               this.ab = 0;
               this.au = 0;
               this.ga();
               var1 = this.ao;
            }

            this.ao = 0;
            this.au();
         } else {
            this.au += this.ax * var1;
            this.ab += this.ai * var1;
            this.aq += this.ag * var1;
            this.ao -= var1;
         }
      }

      br var2 = (br)this.ar;
      int var3 = this.at << 8;
      int var4 = this.aa << 8;
      int var5 = var2.an.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.al = 0;
      }

      if (this.af < 0) {
         if (this.an <= 0) {
            this.am();
            this.ga();
            return;
         }

         this.af = 0;
      }

      if (this.af >= var5) {
         if (this.an >= 0) {
            this.am();
            this.ga();
            return;
         }

         this.af = var5 - 1;
      }

      this.af += this.an * var1;
      if (this.al < 0) {
         if (!this.ay) {
            if (this.an < 0) {
               if (this.af >= var3) {
                  return;
               }

               this.af = var4 - 1 - (var4 - 1 - this.af) % var6;
            } else {
               if (this.af < var4) {
                  return;
               }

               this.af = var3 + (this.af - var3) % var6;
            }

         } else {
            if (this.an < 0) {
               if (this.af >= var3) {
                  return;
               }

               this.af = var3 + var3 - 1 - this.af;
               this.an = -this.an;
            }

            while(this.af >= var4) {
               this.af = var4 + var4 - 1 - this.af;
               this.an = -this.an;
               if (this.af >= var3) {
                  return;
               }

               this.af = var3 + var3 - 1 - this.af;
               this.an = -this.an;
            }

         }
      } else {
         if (this.al > 0) {
            if (this.ay) {
               label164: {
                  if (this.an < 0) {
                     if (this.af >= var3) {
                        return;
                     }

                     this.af = var3 + var3 - 1 - this.af;
                     this.an = -this.an;
                     if (--this.al == 0) {
                        break label164;
                     }
                  }

                  do {
                     if (this.af < var4) {
                        return;
                     }

                     this.af = var4 + var4 - 1 - this.af;
                     this.an = -this.an;
                     if (--this.al == 0) {
                        break;
                     }

                     if (this.af >= var3) {
                        return;
                     }

                     this.af = var3 + var3 - 1 - this.af;
                     this.an = -this.an;
                  } while(--this.al != 0);
               }
            } else {
               label196: {
                  int var7;
                  if (this.an < 0) {
                     if (this.af >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.af) / var6;
                     if (var7 >= this.al) {
                        this.af += var6 * this.al;
                        this.al = 0;
                        break label196;
                     }

                     this.af += var6 * var7;
                     this.al -= var7;
                  } else {
                     if (this.af < var4) {
                        return;
                     }

                     var7 = (this.af - var3) / var6;
                     if (var7 >= this.al) {
                        this.af -= var6 * this.al;
                        this.al = 0;
                        break label196;
                     }

                     this.af -= var6 * var7;
                     this.al -= var7;
                  }

                  return;
               }
            }
         }

         if (this.an < 0) {
            if (this.af < 0) {
               this.af = -1;
               this.am();
               this.ga();
            }
         } else if (this.af >= var5) {
            this.af = var5;
            this.am();
            this.ga();
         }

      }
   }

   public boolean ap() {
      return this.ao != 0;
   }

   static int eh(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bl var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.ab += var9.ai * (var6 - var3);
      var9.aq += var9.ag * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.au = var4 >> 2;
      var9.af = var2 << 8;
      return var3;
   }

   static int ek(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bl var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.ab += var9.ai * (var6 - var3);
      var9.aq += var9.ag * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.au = var4 >> 2;
      var9.af = var2 << 8;
      return var3;
   }

   static int ey(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bl var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.au += var12.ax * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.ab = var5 >> 2;
      var12.aq = var6 >> 2;
      var12.af = var3 << 8;
      return var4 >> 1;
   }

   protected bp bk() {
      return null;
   }

   static int en(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bl var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.af = var3 << 8;
      return var4 >> 1;
   }

   static int ee(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bl var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.ab += var9.ai * (var6 - var3);
      var9.aq += var9.ag * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.au = var4 >> 2;
      var9.af = var2 << 8;
      return var3;
   }

   synchronized void dw(int var1) {
      this.ai(var1, this.ah());
   }

   static int fs(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      var11.ab -= var11.ai * var5;
      var11.aq -= var11.ag * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ab += var11.ai * var5;
      var11.aq += var11.ag * var5;
      var11.au = var6;
      var11.af = var4;
      return var5;
   }

   static int fi(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      var11.ab -= var11.ai * var5;
      var11.aq -= var11.ag * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 1342354361)) * var6 >> 6;
         var6 += var7;
      }

      var11.ab += var11.ai * var5;
      var11.aq += var11.ag * var5;
      var11.au = var6;
      var11.af = var4;
      return var5;
   }

   static int fh(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      var11.ab -= var11.ai * var5;
      var11.aq -= var11.ag * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ab += var11.ai * var5;
      var11.aq += var11.ag * var5;
      var11.au = var6;
      var11.af = var4;
      return var5;
   }

   static int ca(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bl var13, int var14, int var15) {
      var13.au -= var13.ax * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.au += var13.ax * var5;
      var13.ab = var6;
      var13.aq = var7;
      var13.af = var4;
      return var5;
   }

   void ct() {
      this.au = this.aw;
      this.ab = af(this.aw, this.ac);
      this.aq = an(this.aw, this.ac);
   }

   static int fo(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      var11.ab -= var11.ai * var5;
      var11.aq -= var11.ag * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ab += var11.ai * var5;
      var11.aq += var11.ag * var5;
      var11.au = var6;
      var11.af = var4;
      return var5;
   }

   static int fx(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bl var11, int var12, int var13) {
      var11.ab -= var11.ai * var5;
      var11.aq -= var11.ag * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + -1724659388 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & -224839561)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ab += var11.ai * var5;
      var11.aq += var11.ag * var5;
      var11.au = var6;
      var11.af = var4;
      return var5;
   }

   static int fd(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bl var13, int var14, int var15) {
      var13.au -= var13.ax * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.au += var13.ax * var5;
      var13.ab = var6;
      var13.aq = var7;
      var13.af = var4;
      return var5;
   }

   static int fb(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bl var13, int var14, int var15) {
      var13.au -= var13.ax * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 267909205 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & -1290347361);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.au += var13.ax * var5;
      var13.ab = var6;
      var13.aq = var7;
      var13.af = var4;
      return var5;
   }

   static int fn(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bl var13, int var14, int var15) {
      var13.au -= var13.ax * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.au += var13.ax * var5;
      var13.ab = var6;
      var13.aq = var7;
      var13.af = var4;
      return var5;
   }
}
