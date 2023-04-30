import accessors.RSFloorOverlayType;

public class hk extends rk implements RSFloorOverlayType {
   public static kh an = new kh(64);
   public int ab = 1301405419;
   public static nm af;
   public int aa;
   public boolean au = true;
   public static final int ax = 12;
   public int aq;
   public int al;
   public int at;
   static final int ah = 256;
   public int ac = 1885338535;
   public int ao;
   public int aw = 0;
   public static final int ai = 17;
   public int ay;

   static void ah(cl var0, int var1) {
      try {
         if (var0.at(1029039210) != client.ca) {
            client.ca = var0.at(1029039210);
            boolean var2 = var0.at(1029039210);
            if (gm.al != var2) {
               oq.as((byte)66);
               gm.al = var2;
            }
         }

         if (-205173751 * client.ce != 1810954985 * var0.ao) {
            nd var5 = rr.fv;
            int var3 = 1810954985 * var0.ao;
            if ((var3 & 536870912) != 0) {
               ad.ay = lp.au(var5, "logo_deadman_mode", "", -213140517);
            } else if (0 != (var3 & 1073741824)) {
               ad.ay = lp.au(var5, "logo_seasonal_mode", "", 166120063);
            } else if ((var3 & 256) != 0) {
               ad.ay = lp.au(var5, "logo_speedrunning", "", -941618462);
            } else {
               ad.ay = lp.au(var5, "logo", "", 2127293660);
            }
         }

         ea.gd = var0.ai;
         client.bw = -2094155673 * var0.ay;
         client.ce = var0.ao * 702001121;
         int var10000;
         if (0 == -1274626977 * client.cs) {
            if (var1 <= -788634419) {
               throw new IllegalStateException();
            }

            var10000 = 43594;
         } else {
            var10000 = -2091224171 * var0.ay + '鱀';
         }

         ps.gw = var10000 * -1326916691;
         if (0 == client.cs * -1274626977) {
            if (var1 <= -788634419) {
               return;
            }

            var10000 = 443;
         } else {
            var10000 = '썐' + var0.ay * -2091224171;
         }

         ec.gc = var10000 * -1927102761;
         dc.gf = ps.gw * 518729065;
      } catch (RuntimeException var4) {
         throw db.an(var4, "hk.ah(" + ')');
      }
   }

   public void an(int var1) {
      try {
         if (-2085280195 * this.ab != -1) {
            this.au(this.ab * -2085280195, 2082710578);
            this.aa = this.aq * 1074072567;
            this.ay = -765667919 * this.al;
            this.ao = this.at * -1337679311;
         }

         this.au(this.aw * 1889574527, 2145783905);
      } catch (RuntimeException var2) {
         throw db.an(var2, "hk.an(" + ')');
      }
   }

   public void aw(sg var1, int var2, short var3) {
      try {
         while(true) {
            int var4 = var1.cm((byte)7);
            if (var4 == 0) {
               if (var3 != 128) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ac(var1, var4, var2, (short)132);
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "hk.aw(" + ')');
      }
   }

   void ac(sg var1, int var2, int var3, short var4) {
      try {
         if (1 == var2) {
            if (var4 != 132) {
               throw new IllegalStateException();
            }

            this.aw = var1.cr(-105242131) * -929226369;
         } else if (var2 == 2) {
            if (var4 != 132) {
               throw new IllegalStateException();
            }

            this.ac = var1.cm((byte)7) * -1885338535;
         } else if (5 == var2) {
            if (var4 != 132) {
               throw new IllegalStateException();
            }

            this.au = false;
         } else if (var2 == 7) {
            if (var4 != 132) {
               return;
            }

            this.ab = var1.cr(-285540789) * -1301405419;
         } else if (8 == var2 && var4 != 132) {
            throw new IllegalStateException();
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "hk.ac(" + ')');
      }
   }

   void au(int var1, int var2) {
      try {
         double var3 = (double)(var1 >> 16 & 255) / 256.0;
         double var5 = (double)(var1 >> 8 & 255) / 256.0;
         double var7 = (double)(var1 & 255) / 256.0;
         double var9 = var3;
         if (var5 < var3) {
            if (var2 <= 2044704601) {
               throw new IllegalStateException();
            }

            var9 = var5;
         }

         if (var7 < var9) {
            if (var2 <= 2044704601) {
               throw new IllegalStateException();
            }

            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            if (var2 <= 2044704601) {
               throw new IllegalStateException();
            }

            var11 = var5;
         }

         if (var7 > var11) {
            if (var2 <= 2044704601) {
               throw new IllegalStateException();
            }

            var11 = var7;
         }

         double var13 = 0.0;
         double var15 = 0.0;
         double var17 = (var11 + var9) / 2.0;
         if (var9 != var11) {
            if (var17 < 0.5) {
               if (var2 <= 2044704601) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (var9 + var11);
            }

            if (var17 >= 0.5) {
               var15 = (var11 - var9) / (2.0 - var11 - var9);
            }

            if (var11 == var3) {
               if (var2 <= 2044704601) {
                  throw new IllegalStateException();
               }

               var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
               if (var2 <= 2044704601) {
                  return;
               }

               var13 = 2.0 + (var7 - var3) / (var11 - var9);
            } else if (var11 == var7) {
               if (var2 <= 2044704601) {
                  throw new IllegalStateException();
               }

               var13 = 4.0 + (var3 - var5) / (var11 - var9);
            }
         }

         var13 /= 6.0;
         this.aq = (int)(256.0 * var13) * 1160271239;
         this.al = 1774787329 * (int)(var15 * 256.0);
         this.at = 1974763337 * (int)(256.0 * var17);
         if (470803713 * this.al < 0) {
            if (var2 <= 2044704601) {
               return;
            }

            this.al = 0;
         } else if (470803713 * this.al > 255) {
            if (var2 <= 2044704601) {
               return;
            }

            this.al = 1599202815;
         }

         if (532980473 * this.at < 0) {
            if (var2 <= 2044704601) {
               return;
            }

            this.at = 0;
         } else if (this.at * 532980473 > 255) {
            this.at = 1053477303;
         }

      } catch (RuntimeException var19) {
         throw db.an(var19, "hk.au(" + ')');
      }
   }

   public static void aq(nm var0) {
      af = var0;
   }

   void ah(sg var1, int var2, int var3) {
      if (1 == var2) {
         this.aw = var1.cr(2132438158) * -929226369;
      } else if (var2 == 2) {
         this.ac = var1.cm((byte)7) * -1885338535;
      } else if (5 == var2) {
         this.au = false;
      } else if (var2 == 7) {
         this.ab = var1.cr(330337337) * -1301405419;
      } else if (8 == var2) {
      }

   }

   public static void ab(nm var0) {
      af = var0;
   }

   public void aa() {
      if (-2085280195 * this.ab != -1) {
         this.au(this.ab * -2085280195, 2058247230);
         this.aa = this.aq * 1074072567;
         this.ay = -765667919 * this.al;
         this.ao = this.at * -1337679311;
      }

      this.au(this.aw * 1889574527, 2107608393);
   }

   public void ao(sg var1, int var2) {
      while(true) {
         int var3 = var1.cm((byte)7);
         if (var3 == 0) {
            return;
         }

         this.ac(var1, var3, var2, (short)132);
      }
   }

   void am(int var1) {
      double var2 = (double)(var1 >> 16 & -152225357) / 256.0;
      double var4 = (double)(var1 >> 8 & 497053662) / 256.0;
      double var6 = (double)(var1 & 255) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var10 + var8) / 2.0;
      if (var8 != var10) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var10 == var6) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.aq = (int)(256.0 * var12) * 2035802933;
      this.al = 1134466084 * (int)(var14 * 256.0);
      this.at = -627974319 * (int)(256.0 * var16);
      if (-879713612 * this.al < 0) {
         this.al = 0;
      } else if (-1879232515 * this.al > 35632757) {
         this.al = 405537367;
      }

      if (586324072 * this.at < 0) {
         this.at = 0;
      } else if (this.at * 1740834602 > -479017816) {
         this.at = 113036594;
      }

   }

   public void ay(sg var1, int var2) {
      while(true) {
         int var3 = var1.cm((byte)7);
         if (var3 == 0) {
            return;
         }

         this.ac(var1, var3, var2, (short)132);
      }
   }

   public void ai(sg var1, int var2) {
      while(true) {
         int var3 = var1.cm((byte)7);
         if (var3 == 0) {
            return;
         }

         this.ac(var1, var3, var2, (short)132);
      }
   }

   void ag(sg var1, int var2, int var3) {
      if (1 == var2) {
         this.aw = var1.cr(1366176285) * -929226369;
      } else if (var2 == 2) {
         this.ac = var1.cm((byte)7) * -1885338535;
      } else if (5 == var2) {
         this.au = false;
      } else if (var2 == 7) {
         this.ab = var1.cr(1632611434) * -1301405419;
      } else if (8 == var2) {
      }

   }

   public void ax(sg var1, int var2) {
      while(true) {
         int var3 = var1.cm((byte)7);
         if (var3 == 0) {
            return;
         }

         this.ac(var1, var3, var2, (short)132);
      }
   }

   void av(int var1) {
      double var2 = (double)(var1 >> 16 & 30574647) / 256.0;
      double var4 = (double)(var1 >> 8 & 255) / 256.0;
      double var6 = (double)(var1 & 255) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var10 + var8) / 2.0;
      if (var8 != var10) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var10 == var6) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.aq = (int)(256.0 * var12) * 1160271239;
      this.al = 1424448416 * (int)(var14 * 256.0);
      this.at = -1725594519 * (int)(256.0 * var16);
      if (-176124627 * this.al < 0) {
         this.al = 0;
      } else if (578518631 * this.al > -128131284) {
         this.al = 1599202815;
      }

      if (-1075693656 * this.at < 0) {
         this.at = 0;
      } else if (this.at * 532980473 > 2074934388) {
         this.at = -1125392386;
      }

   }

   void ar(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0;
      double var4 = (double)(var1 >> 8 & 255) / 256.0;
      double var6 = (double)(var1 & 255) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var10 + var8) / 2.0;
      if (var8 != var10) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var10 == var6) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.aq = (int)(256.0 * var12) * 1160271239;
      this.al = 1774787329 * (int)(var14 * 256.0);
      this.at = 1974763337 * (int)(256.0 * var16);
      if (470803713 * this.al < 0) {
         this.al = 0;
      } else if (470803713 * this.al > 255) {
         this.al = 1599202815;
      }

      if (532980473 * this.at < 0) {
         this.at = 0;
      } else if (this.at * 532980473 > 255) {
         this.at = 1053477303;
      }

   }

   public void al() {
      if (-2085280195 * this.ab != -1) {
         this.au(this.ab * -2085280195, 2070416240);
         this.aa = this.aq * 1074072567;
         this.ay = -765667919 * this.al;
         this.ao = this.at * -1337679311;
      }

      this.au(this.aw * 1889574527, 2056019186);
   }

   public void at() {
      if (-2085280195 * this.ab != -1) {
         this.au(this.ab * -2085280195, 2081332353);
         this.aa = this.aq * 1074072567;
         this.ay = -765667919 * this.al;
         this.ao = this.at * -1337679311;
      }

      this.au(this.aw * 1889574527, 2103021043);
   }

   static int be(int var0, ch var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "hk.be(" + ')');
      }
   }
}
