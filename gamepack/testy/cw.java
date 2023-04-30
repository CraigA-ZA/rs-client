import accessors.RSProjectile;

public final class cw extends iv implements RSProjectile {
   int an;
   double am;
   int aw;
   int ac;
   int au;
   int ab;
   int aq;
   int al;
   int at;
   int af;
   int ay;
   boolean ao;
   double ax;
   double ai;
   double ag;
   double ah;
   ha az;
   double ar;
   int aa;
   double as;
   int aj;
   int ak;
   double av;
   int ad;
   int ae;
   public static final int ct = 97;

   final void ay(int var1) {
      this.ao = true;
      this.ax += this.ah * (double)var1;
      this.ai += this.av * (double)var1;
      this.ag += this.am * (double)var1 + (double)var1 * 0.5 * this.as * (double)var1;
      this.am += this.as * (double)var1;
      this.aj = ((int)(Math.atan2(this.ah, this.av) * 325.949) + -204750175 & 2047) * 1909592961;
      this.ak = ((int)(Math.atan2(this.am, this.ar) * 325.949) & 2047) * -361004777;
      if (null != this.az) {
         if (!this.az.ao(-1373957898)) {
            this.ae += -344546229 * var1;

            while(true) {
               do {
                  do {
                     if (-319809671 * this.ae <= this.az.av[this.ad * 1539955901]) {
                        return;
                     }

                     this.ae -= this.az.av[1784566072 * this.ad] * 1972244911;
                     this.ad += 1271001886;
                  } while(this.ad * -693399445 < this.az.ag.length);

                  this.ad -= this.az.am * 1545662235;
               } while(this.ad * 719318933 >= 0 && -693399445 * this.ad < this.az.ag.length);

               this.ad = 0;
            }
         } else {
            this.ad += -1253532605 * var1;
            int var2 = this.az.ax(-701596425);
            if (-693399445 * this.ad >= var2) {
               this.ad = (var2 - this.az.am * -1114607541) * 208532416;
            }
         }
      }

   }

   final void ac(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.ao) {
         var5 = (double)(var1 - -165929077 * this.aw);
         double var7 = (double)(var2 - this.ac * -650340219);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.ax = (double)(-1875865514 * this.aw) + (double)(this.aa * 1485806481) * var5 / var9;
         this.ai = (double)(-1550229134 * this.aa) * var7 / var9 + (double)(-650340219 * this.ac);
         this.ag = (double)(1797140989 * this.au);
      }

      var5 = (double)(1 + -1203783373 * this.al - var4);
      this.ah = ((double)var1 - this.ax) / var5;
      this.av = ((double)var2 - this.ai) / var5;
      this.ar = Math.sqrt(this.av * this.av + this.ah * this.ah);
      if (!this.ao) {
         this.am = -this.ar * Math.tan(0.02454369 * (double)(this.at * 1173139343));
      }

      this.as = 2.0 * ((double)var3 - this.ag - this.am * var5) / (var5 * var5);
   }

   final void aw(int var1, int var2) {
      try {
         this.ao = true;
         this.ax += this.ah * (double)var1;
         this.ai += this.av * (double)var1;
         this.ag += this.am * (double)var1 + (double)var1 * 0.5 * this.as * (double)var1;
         this.am += this.as * (double)var1;
         this.aj = ((int)(Math.atan2(this.ah, this.av) * 325.949) + 1024 & 2047) * 1909592961;
         this.ak = ((int)(Math.atan2(this.am, this.ar) * 325.949) & 2047) * -361004777;
         if (null != this.az) {
            if (var2 <= 1647038350) {
               throw new IllegalStateException();
            }

            if (!this.az.ao(-917399932)) {
               if (var2 <= 1647038350) {
                  throw new IllegalStateException();
               }

               this.ae += 1634469153 * var1;

               while(true) {
                  while(true) {
                     do {
                        if (723631841 * this.ae <= this.az.av[this.ad * -693399445]) {
                           return;
                        }

                        if (var2 <= 1647038350) {
                           throw new IllegalStateException();
                        }

                        this.ae -= this.az.av[-693399445 * this.ad] * 1634469153;
                        this.ad += -1253532605;
                     } while(this.ad * -693399445 < this.az.ag.length);

                     this.ad -= this.az.am * 1545662235;
                     if (this.ad * -693399445 < 0) {
                        break;
                     }

                     if (var2 <= 1647038350) {
                        throw new IllegalStateException();
                     }

                     if (-693399445 * this.ad >= this.az.ag.length) {
                        if (var2 <= 1647038350) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }

                  this.ad = 0;
               }
            } else {
               this.ad += -1253532605 * var1;
               int var3 = this.az.ax(1548522435);
               if (-693399445 * this.ad >= var3) {
                  if (var2 <= 1647038350) {
                     throw new IllegalStateException();
                  }

                  this.ad = (var3 - this.az.am * 1363943497) * -1253532605;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "cw.aw(" + ')');
      }
   }

   protected final it an(byte var1) {
      try {
         hh var2 = dc.an(19084173 * this.af, 1516910839);
         it var3 = var2.au(-693399445 * this.ad, 525076133);
         if (var3 == null) {
            if (var1 >= 14) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            var3.bi(-1585330521 * this.ak);
            return var3;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "cw.an(" + ')');
      }
   }

   protected final it au() {
      hh var1 = dc.an(-340176114 * this.af, 588603344);
      it var2 = var1.au(-290273859 * this.ad, -625282350);
      if (var2 == null) {
         return null;
      } else {
         var2.bi(-1585330521 * this.ak);
         return var2;
      }
   }

   final void af(int var1, int var2, int var3, int var4, int var5) {
      try {
         double var6;
         if (!this.ao) {
            if (var5 != -335674854) {
               throw new IllegalStateException();
            }

            var6 = (double)(var1 - -1024822263 * this.aw);
            double var8 = (double)(var2 - this.ac * -650340219);
            double var10 = Math.sqrt(var8 * var8 + var6 * var6);
            this.ax = (double)(-1024822263 * this.aw) + (double)(this.aa * 1485806481) * var6 / var10;
            this.ai = (double)(1485806481 * this.aa) * var8 / var10 + (double)(-650340219 * this.ac);
            this.ag = (double)(1797140989 * this.au);
         }

         var6 = (double)(1 + -1203783373 * this.al - var4);
         this.ah = ((double)var1 - this.ax) / var6;
         this.av = ((double)var2 - this.ai) / var6;
         this.ar = Math.sqrt(this.av * this.av + this.ah * this.ah);
         if (!this.ao) {
            if (var5 != -335674854) {
               throw new IllegalStateException();
            }

            this.am = -this.ar * Math.tan(0.02454369 * (double)(this.at * 1173139343));
         }

         this.as = 2.0 * ((double)var3 - this.ag - this.am * var6) / (var6 * var6);
      } catch (RuntimeException var12) {
         throw db.an(var12, "cw.af(" + ')');
      }
   }

   protected final it aq() {
      hh var1 = dc.an(19084173 * this.af, 40122179);
      it var2 = var1.au(254256612 * this.ad, -26206872);
      if (var2 == null) {
         return null;
      } else {
         var2.bi(-1585330521 * this.ak);
         return var2;
      }
   }

   protected final it ab() {
      hh var1 = dc.an(19084173 * this.af, 650533629);
      it var2 = var1.au(-888433126 * this.ad, 1403978369);
      if (var2 == null) {
         return null;
      } else {
         var2.bi(-1585330521 * this.ak);
         return var2;
      }
   }

   static long ho(int var0) {
      try {
         return client.mn * -1749026863537138247L;
      } catch (RuntimeException var1) {
         throw db.an(var1, "cw.ho(" + ')');
      }
   }

   final void at(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.ao) {
         var5 = (double)(var1 - -160305700 * this.aw);
         double var7 = (double)(var2 - this.ac * -220442501);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.ax = (double)(-1415676410 * this.aw) + (double)(this.aa * -2131519134) * var5 / var9;
         this.ai = (double)(545336605 * this.aa) * var7 / var9 + (double)(-650340219 * this.ac);
         this.ag = (double)(1797140989 * this.au);
      }

      var5 = (double)(1 + 524228782 * this.al - var4);
      this.ah = ((double)var1 - this.ax) / var5;
      this.av = ((double)var2 - this.ai) / var5;
      this.ar = Math.sqrt(this.av * this.av + this.ah * this.ah);
      if (!this.ao) {
         this.am = -this.ar * Math.tan(0.02454369 * (double)(this.at * 1173139343));
      }

      this.as = 2.0 * ((double)var3 - this.ag - this.am * var5) / (var5 * var5);
   }

   final void aa(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.ao) {
         var5 = (double)(var1 - -550018594 * this.aw);
         double var7 = (double)(var2 - this.ac * -650340219);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.ax = (double)(-1024822263 * this.aw) + (double)(this.aa * 1485806481) * var5 / var9;
         this.ai = (double)(1485806481 * this.aa) * var7 / var9 + (double)(-650340219 * this.ac);
         this.ag = (double)(1797140989 * this.au);
      }

      var5 = (double)(1 + 1111730983 * this.al - var4);
      this.ah = ((double)var1 - this.ax) / var5;
      this.av = ((double)var2 - this.ai) / var5;
      this.ar = Math.sqrt(this.av * this.av + this.ah * this.ah);
      if (!this.ao) {
         this.am = -this.ar * Math.tan(0.02454369 * (double)(this.at * 1173139343));
      }

      this.as = 2.0 * ((double)var3 - this.ag - this.am * var5) / (var5 * var5);
   }

   protected final it al() {
      hh var1 = dc.an(19084173 * this.af, 2132893648);
      it var2 = var1.au(-693399445 * this.ad, -1899164430);
      if (var2 == null) {
         return null;
      } else {
         var2.bi(-1585330521 * this.ak);
         return var2;
      }
   }

   final void ao(int var1) {
      this.ao = true;
      this.ax += this.ah * (double)var1;
      this.ai += this.av * (double)var1;
      this.ag += this.am * (double)var1 + (double)var1 * 0.5 * this.as * (double)var1;
      this.am += this.as * (double)var1;
      this.aj = ((int)(Math.atan2(this.ah, this.av) * 325.949) + 1024 & 2047) * 2065704566;
      this.ak = ((int)(Math.atan2(this.am, this.ar) * 325.949) & 2047) * -361004777;
      if (null != this.az) {
         if (!this.az.ao(-1648260054)) {
            this.ae += 1634469153 * var1;

            while(true) {
               do {
                  do {
                     if (-772112412 * this.ae <= this.az.av[this.ad * 972449621]) {
                        return;
                     }

                     this.ae -= this.az.av[-237483890 * this.ad] * 1634469153;
                     this.ad += 955400358;
                  } while(this.ad * -693399445 < this.az.ag.length);

                  this.ad -= this.az.am * -1585440188;
               } while(this.ad * 509600076 >= 0 && -693399445 * this.ad < this.az.ag.length);

               this.ad = 0;
            }
         } else {
            this.ad += -1253532605 * var1;
            int var2 = this.az.ax(-982734428);
            if (1013362407 * this.ad >= var2) {
               this.ad = (var2 - this.az.am * 922080744) * -1253532605;
            }
         }
      }

   }

   public static gx af(int var0, sg var1, int var2) {
      try {
         int var3 = var1.cm((byte)7);
         boolean var10000;
         if (0 != (var3 & 1)) {
            if (var2 == -269387201) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var4 = var10000;
         if ((var3 & 2) != 0) {
            if (var2 == -269387201) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var5 = var10000;
         gx var6 = new gx(var0);
         int var7;
         int[] var8;
         boolean var9;
         int var10;
         short var11;
         if (var4) {
            if (var2 == -269387201) {
               throw new IllegalStateException();
            }

            label126: {
               var7 = var1.cm((byte)7);
               var8 = new int[]{var7 & 15, var7 >> 4 & 15};
               if (var6.aw != null) {
                  if (var2 == -269387201) {
                     throw new IllegalStateException();
                  }

                  if (var8.length == var6.aw.length) {
                     var10000 = true;
                     break label126;
                  }
               }

               var10000 = false;
            }

            var9 = var10000;

            for(var10 = 0; var10 < 2; ++var10) {
               if (var2 == -269387201) {
                  throw new IllegalStateException();
               }

               if (var8[var10] != 15) {
                  if (var2 == -269387201) {
                     throw new IllegalStateException();
                  }

                  var11 = (short)var1.cl(31582516);
                  if (var9) {
                     if (var2 == -269387201) {
                        throw new IllegalStateException();
                     }

                     var6.aw[var8[var10]] = var11;
                  }
               }
            }
         }

         if (var5) {
            if (var2 == -269387201) {
               throw new IllegalStateException();
            }

            label112: {
               var7 = var1.cm((byte)7);
               var8 = new int[]{var7 & 15, var7 >> 4 & 15};
               if (var6.ac != null) {
                  if (var2 == -269387201) {
                     throw new IllegalStateException();
                  }

                  if (var8.length == var6.ac.length) {
                     if (var2 == -269387201) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                     break label112;
                  }
               }

               var10000 = false;
            }

            var9 = var10000;

            for(var10 = 0; var10 < 2; ++var10) {
               if (var2 == -269387201) {
                  throw new IllegalStateException();
               }

               if (15 != var8[var10]) {
                  if (var2 == -269387201) {
                     throw new IllegalStateException();
                  }

                  var11 = (short)var1.cl(-1578765633);
                  if (var9) {
                     if (var2 == -269387201) {
                        throw new IllegalStateException();
                     }

                     var6.ac[var8[var10]] = var11;
                  }
               }
            }
         }

         return var6;
      } catch (RuntimeException var12) {
         throw db.an(var12, "cw.af(" + ')');
      }
   }

   static final int ax(int var0) {
      try {
         return ix.an * 2139535413;
      } catch (RuntimeException var1) {
         throw db.an(var1, "cw.ax(" + ')');
      }
   }

   cw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         super();
         this.ao = false;
         this.ad = 0;
         this.ae = 0;
         this.af = var1 * 1976780613;
         this.an = -285111439 * var2;
         this.aw = var3 * 1597594169;
         this.ac = var4 * 2006425677;
         this.au = 1414804309 * var5;
         this.aq = 1059692065 * var6;
         this.al = 439544315 * var7;
         this.at = var8 * 1262587759;
         this.aa = -685079183 * var9;
         this.ay = -1186625123 * var10;
         this.ab = var11 * 528720955;
         this.ao = false;
         int var12 = dc.an(this.af * 19084173, -707697126).aq * 374130911;
         if (-1 != var12) {
            this.az = dc.an(var12, (byte)109);
         } else {
            this.az = null;
         }

      } catch (RuntimeException var13) {
         throw db.an(var13, "cw.<init>(" + ')');
      }
   }
}
