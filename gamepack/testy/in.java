import accessors.RSRasterizer3D;
import java.io.File;
import java.io.IOException;

public class in implements RSRasterizer3D {
   public static int[] ac = new int[2048];
   static final ii at;
   static int[] aw = new int[2048];
   public static jg ab;
   public static int[] au = new int[2048];
   public static int[] af = new int[65536];
   static int[] an = new int[512];
   static final ii al;
   static ii aq;
   static int ai;
   public static final int av = 15;

   public static void aj(double var0) {
      al.aw(var0, 0, 512, -2031414897);
   }

   static void cc(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      aq.at(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   public static void as(boolean var0) {
      if (var0 && null != th.by) {
         aq = at;
      } else {
         aq = al;
      }

   }

   static void bc(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      aq.ab(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public static void ak(double var0) {
      al.aw(var0, 0, 512, -2143756614);
   }

   public static int bd() {
      return ab.ab * 17491276;
   }

   static void ad(double var0, int var2, int var3) {
      int var4 = 128 * var2;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0 + 0.0078125;
         double var8 = 0.0625 + (double)(var5 & 7) / 8.0;

         for(int var10 = 0; var10 < 128; ++var10) {
            double var11 = (double)var10 / 128.0;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0) {
               double var19;
               if (var11 < 0.5) {
                  var19 = var11 * (1.0 + var8);
               } else {
                  var19 = var8 + var11 - var8 * var11;
               }

               double var21 = var11 * 2.0 - var19;
               double var23 = var6 + 0.3333333333333333;
               if (var23 > 1.0) {
                  --var23;
               }

               double var27 = var6 - 0.3333333333333333;
               if (var27 < 0.0) {
                  ++var27;
               }

               if (var23 * 6.0 < 1.0) {
                  var13 = var23 * 6.0 * (var19 - var21) + var21;
               } else if (2.0 * var23 < 1.0) {
                  var13 = var19;
               } else if (var23 * 3.0 < 2.0) {
                  var13 = var21 + 6.0 * (0.6666666666666666 - var23) * (var19 - var21);
               } else {
                  var13 = var21;
               }

               if (var6 * 6.0 < 1.0) {
                  var15 = var21 + (var19 - var21) * 6.0 * var6;
               } else if (var6 * 2.0 < 1.0) {
                  var15 = var19;
               } else if (var6 * 3.0 < 2.0) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
               } else {
                  var15 = var21;
               }

               if (6.0 * var27 < 1.0) {
                  var17 = var27 * (var19 - var21) * 6.0 + var21;
               } else if (var27 * 2.0 < 1.0) {
                  var17 = var19;
               } else if (3.0 * var27 < 2.0) {
                  var17 = 6.0 * (var19 - var21) * (0.6666666666666666 - var27) + var21;
               } else {
                  var17 = var21;
               }
            }

            int var30 = (int)(256.0 * var13);
            int var20 = (int)(256.0 * var15);
            int var29 = (int)(256.0 * var17);
            int var22 = (var30 << 16) + (var20 << 8) + var29;
            var22 = ez.ac(var22, var0);
            if (0 == var22) {
               var22 = 1;
            }

            af[var4++] = var22;
         }
      }

   }

   static void ae(double var0, int var2, int var3) {
      int var4 = 128 * var2;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0 + 0.0078125;
         double var8 = 0.0625 + (double)(var5 & 7) / 8.0;

         for(int var10 = 0; var10 < 128; ++var10) {
            double var11 = (double)var10 / 128.0;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0) {
               double var19;
               if (var11 < 0.5) {
                  var19 = var11 * (1.0 + var8);
               } else {
                  var19 = var8 + var11 - var8 * var11;
               }

               double var21 = var11 * 2.0 - var19;
               double var23 = var6 + 0.3333333333333333;
               if (var23 > 1.0) {
                  --var23;
               }

               double var27 = var6 - 0.3333333333333333;
               if (var27 < 0.0) {
                  ++var27;
               }

               if (var23 * 6.0 < 1.0) {
                  var13 = var23 * 6.0 * (var19 - var21) + var21;
               } else if (2.0 * var23 < 1.0) {
                  var13 = var19;
               } else if (var23 * 3.0 < 2.0) {
                  var13 = var21 + 6.0 * (0.6666666666666666 - var23) * (var19 - var21);
               } else {
                  var13 = var21;
               }

               if (var6 * 6.0 < 1.0) {
                  var15 = var21 + (var19 - var21) * 6.0 * var6;
               } else if (var6 * 2.0 < 1.0) {
                  var15 = var19;
               } else if (var6 * 3.0 < 2.0) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
               } else {
                  var15 = var21;
               }

               if (6.0 * var27 < 1.0) {
                  var17 = var27 * (var19 - var21) * 6.0 + var21;
               } else if (var27 * 2.0 < 1.0) {
                  var17 = var19;
               } else if (3.0 * var27 < 2.0) {
                  var17 = 6.0 * (var19 - var21) * (0.6666666666666666 - var27) + var21;
               } else {
                  var17 = var21;
               }
            }

            int var30 = (int)(256.0 * var13);
            int var20 = (int)(256.0 * var15);
            int var29 = (int)(256.0 * var17);
            int var22 = (var30 << 16) + (var20 << 8) + var29;
            var22 = ez.ac(var22, var0);
            if (0 == var22) {
               var22 = 1;
            }

            af[var4++] = var22;
         }
      }

   }

   public static void bf() {
      int var0 = th.bk;
      int var1 = th.bi;
      int var2 = th.bx;
      int var3 = th.be;
      ab.ag = (var2 - var0) * -1224418538;
      ab.ah = -508492839 * (var3 - var1);
      cd.ax(1441948024);
      if (ab.aj.length < ab.ah * 601539701) {
         ab.aj = new int[co.ab(ab.ah * -427719351, 142206558)];
      }

      int var4 = var0 + th.ae * var1;

      for(int var5 = 0; var5 < ab.ah * -1448710788; ++var5) {
         ab.aj[var5] = var4;
         var4 += th.ae;
      }

   }

   static int by(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0;
      double var5 = (double)(var0 >> 8 & -456562511) / 256.0;
      double var7 = (double)(var0 & 255) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(256.0 * var7);
      return var11 + (var10 << 8) + (var9 << 16);
   }

   static int bb(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0;
      double var5 = (double)(var0 >> 8 & 255) / 256.0;
      double var7 = (double)(var0 & 255) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(256.0 * var7);
      return var11 + (var10 << 8) + (var9 << 16);
   }

   static int be() {
      return 93675259 * ab.ax;
   }

   static int ap(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0;
      double var5 = (double)(var0 >> 8 & 255) / 256.0;
      double var7 = (double)(var0 & 255) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(256.0 * var7);
      return var11 + (var10 << 8) + (var9 << 16);
   }

   in() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "in.<init>(" + ')');
      }
   }

   static int bx() {
      return -1623049222 * ab.ai;
   }

   static int bo() {
      return ab.ar * 137577184;
   }

   static int bz() {
      return 1145780727 * ab.as;
   }

   static int bm() {
      return 1145780727 * ab.as;
   }

   static int bk() {
      return 93675259 * ab.ax;
   }

   public static int bt() {
      return ab.ab * 1936152916;
   }

   public static int bj() {
      return ab.ab * -1734758735;
   }

   static int bn() {
      return 2073525409 * ab.ag;
   }

   static int bs() {
      return -988034230 * ab.ag;
   }

   public static void ce(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      aq.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void az(double var0) {
      al.aw(var0, 0, 512, -2043785855);
   }

   public static void ci(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      aq.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void bl() {
      ab.af((byte)68);
   }

   public static void bq() {
      int var0 = th.bk;
      int var1 = th.bi;
      int var2 = th.bx;
      int var3 = th.be;
      ab.ag = (var2 - var0) * 1163083059;
      ab.ah = -508492839 * (var3 - var1);
      cd.ax(1441948024);
      if (ab.aj.length < ab.ah * -1347859351) {
         ab.aj = new int[co.ab(ab.ah * -1347859351, 553394611)];
      }

      int var4 = var0 + th.ae * var1;

      for(int var5 = 0; var5 < ab.ah * -1347859351; ++var5) {
         ab.aj[var5] = var4;
         var4 += th.ae;
      }

   }

   public static void bu(int[] var0, int var1, int var2, float[] var3) {
      if (null == var3 && at == aq) {
         aq = al;
      }

      aq.af(var0, var1, var2, var3, 313803650);
   }

   public static void bv() {
      ab.af((byte)10);
   }

   public static void ba() {
      ab.af((byte)9);
   }

   public static void bp(int var0, int var1, int var2) {
      ab.aw(var0, var1, var2, -612474676);
   }

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         an[var0] = '耀' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         aw[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         ac[var0] = (int)(65536.0 * Math.sin(0.0030679615 * (double)var0));
         au[var0] = (int)(65536.0 * Math.cos(0.0030679615 * (double)var0));
      }

      ab = new jg();
      al = new ji(ab);
      at = new jx(ab);
      aq = al;
   }

   public static void bh(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      aq.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void bw(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      aq.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   static int bi() {
      return 911941044 * ab.ax;
   }

   public static void bg(int[] var0, int var1, int var2, float[] var3) {
      if (null == var3 && at == aq) {
         aq = al;
      }

      aq.af(var0, var1, var2, var3, 378616780);
   }

   public static void cs(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      aq.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void br(int[] var0, int var1, int var2, float[] var3) {
      if (null == var3 && at == aq) {
         aq = al;
      }

      aq.af(var0, var1, var2, var3, -874616581);
   }

   public static sy an(String var0, String var1, boolean var2, byte var3) {
      try {
         File var4 = new File(my.au, "preferences" + var0 + ".dat");
         if (var4.exists()) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            try {
               sy var12 = new sy(var4, "rw", 10000L);
               return var12;
            } catch (IOException var10) {
            }
         }

         String var5 = "";
         if (33 == -1325133847 * gc.ah) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var5 = "_rc";
         } else if (34 == -1325133847 * gc.ah) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var5 = "_wip";
         }

         File var6 = new File(hd.az, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
         sy var7;
         if (!var2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            if (var6.exists()) {
               try {
                  var7 = new sy(var6, "rw", 10000L);
                  return var7;
               } catch (IOException var9) {
               }
            }
         }

         try {
            var7 = new sy(var4, "rw", 10000L);
            return var7;
         } catch (IOException var8) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw db.an(var11, "in.an(" + ')');
      }
   }

   static int ar(int var0, ch var1, boolean var2, int var3) {
      try {
         mq var10000;
         if (var2) {
            if (var3 <= -1807661547) {
               throw new IllegalStateException();
            }

            var10000 = bq.ag;
         } else {
            var10000 = an.ai;
         }

         mq var4 = var10000;
         if (var0 == 1800) {
            if (var3 <= -1807661547) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = hc.af(ap.ng(var4, 597832321), 1600588840);
               return 1;
            }
         } else if (var0 == 1801) {
            if (var3 <= -1807661547) {
               throw new IllegalStateException();
            } else {
               int var5 = cy.al[(cy.at -= 427135973) * -964267539];
               --var5;
               if (null != var4.ek) {
                  if (var3 <= -1807661547) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var4.ek.length) {
                     if (var3 <= -1807661547) {
                        throw new IllegalStateException();
                     }

                     if (var4.ek[var5] != null) {
                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4.ek[var5];
                        return 1;
                     }

                     if (var3 <= -1807661547) {
                        throw new IllegalStateException();
                     }
                  }
               }

               cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
               return 1;
            }
         } else if (1802 == var0) {
            if (null == var4.eh) {
               if (var3 <= -1807661547) {
                  throw new IllegalStateException();
               }

               cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
            } else {
               cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4.eh;
            }

            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "in.ar(" + ')');
      }
   }
}
