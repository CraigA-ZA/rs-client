public class WorldMapSection1 implements WorldMapSection {
   int aa;
   int ab;
   int ac;
   int af;
   int al;
   int an;
   int aq;
   int at;
   int au;
   int aw;

   WorldMapSection1() {
   }

   public void expandBounds(WorldMapArea var1) {
      if (var1.aq * 77939951 > 646918937 * this.au) {
         var1.aq = -694790025 * this.au;
      }

      if (1854846129 * var1.al < 646918937 * this.au) {
         var1.al = this.au * 92282601;
      }

      if (var1.at * 2059655157 > -2085428027 * this.ab) {
         var1.at = this.ab * 1075472273;
      }

      if (var1.aa * -1086956513 < -2085428027 * this.ab) {
         var1.aa = this.ab * 1758667419;
      }

   }

   public static int af_renamed(int var0) {
      VarBitType var2 = gs.an_renamed(var0);
      int var3 = var2.aw * 470400793;
      int var4 = 1050888611 * var2.ac;
      int var5 = var2.au * 1130237503;
      int var6 = Varps.af[var5 - var4];
      return Varps.aw[var3] >> var4 & var6;
   }

   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= -1060807941 * this.af && var1 < this.an * -1519014345 + this.af * -1060807941) {
         return var2 >= (this.aw * 268581205 << 6) + (this.aq * 605272271 << 3) && var2 <= 7 + (this.aq * 605272271 << 3) + (this.aw * 268581205 << 6) && var3 >= (362794351 * this.ac << 6) + (-2012178411 * this.al << 3) && var3 <= (this.al * -2012178411 << 3) + (362794351 * this.ac << 6) + 7;
      } else {
         return false;
      }
   }

   public boolean containsPosition(int var1, int var2) {
      return var1 >= (-562033999 * this.at << 3) + (this.au * 646918937 << 6) && var1 <= 7 + (this.au * 646918937 << 6) + (-562033999 * this.at << 3) && var2 >= (this.ab * -2085428027 << 6) + (this.aa * 1104824061 << 3) && var2 <= (1104824061 * this.aa << 3) + (this.ab * -2085428027 << 6) + 7;
   }

   public int[] position(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.au * -1546860992 - 9327936 * this.aw + var2 + (this.at * -201304696 - this.aq * 547210872), var3 + (this.ab * -323407552 - 1744001984 * this.ac) + (this.aa * 248657896 - 1082441896 * this.al)};
         return var5;
      }
   }

   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var4 = 547210872 * this.aq - -201304696 * this.at + 9327936 * this.aw - -1546860992 * this.au + var1;
         int var5 = 1082441896 * this.al - this.aa * 248657896 + var2 + (this.ac * 1744001984 - -323407552 * this.ab);
         return new Coord(-1060807941 * this.af, var4, var5);
      }
   }

   public void read(Packet var1) {
      this.af = var1.g1() * -153706445;
      this.an = var1.g1() * 74409863;
      this.aw = var1.cl() * -1522795523;
      this.aq = var1.g1() * -1051832785;
      this.ac = var1.cl() * 3551631;
      this.al = var1.g1() * -1804437699;
      this.au = var1.cl() * 1517975849;
      this.at = var1.g1() * 1932656209;
      this.ab = var1.cl() * -426051059;
      this.aa = var1.g1() * 137791061;
      this.aq();
   }

   void aq() {
   }

   public static final Rasterizer3D ay_renamed(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (2 == var4 && var1 != 1) {
         var4 = 1;
      }

      long var7 = ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var4 << 40) + ((long)var3 << 42);
      Rasterizer3D var9;
      if (!var5) {
         var9 = (Rasterizer3D)ObjType.ao.get(var7);
         if (var9 != null) {
            return var9;
         }
      }

      ObjType var10 = HeadbarUpdate.getObjType(var0);
      if (var1 > 1 && null != var10.bh) {
         int var11 = -1;

         for(int var12 = 0; var12 < 10; ++var12) {
            if (var1 >= var10.bw[var12] && 0 != var10.bw[var12]) {
               var11 = var10.bh[var12];
            }
         }

         if (var11 != -1) {
            var10 = HeadbarUpdate.getObjType(var11);
         }
      }

      it var21 = var10.at(1);
      if (var21 == null) {
         return null;
      } else {
         Rasterizer3D var22 = null;
         if (-1 != var10.ci * -1375068187) {
            var22 = ay_renamed(var10.ce * 1399852547, 10, 1, 0, 0, true);
            if (null == var22) {
               return null;
            }
         } else if (-1276549997 * var10.cg != -1) {
            var22 = ay_renamed(var10.cl * -1273418661, var1, var2, var3, 0, false);
            if (null == var22) {
               return null;
            }
         } else if (var10.cy * 119859889 != -1) {
            var22 = ay_renamed(-172219939 * var10.cr, var1, 0, 0, 0, false);
            if (null == var22) {
               return null;
            }
         }

         int[] var13 = Rasterizer2D.ad;
         int var14 = Rasterizer2D.ae;
         int var15 = Rasterizer2D.ap;
         float[] var16 = Rasterizer2D.by;
         int[] var17 = new int[4];
         Rasterizer2D.Rasterizer2D_getClipArray(var17);
         var9 = new Rasterizer3D(36, 32);
         an.ay_renamed(var9.af, 36, 32, (float[])null);
         Rasterizer2D.er();
         am.ao_renamed();
         WorldMapArea.ai_renamed(16, 16);
         in.ab.an = false;
         if (-1 != var10.cy * 119859889) {
            var22.ax(0, 0);
         }

         int var18 = var10.aj * 1014971553;
         if (var5) {
            var18 = (int)(1.5 * (double)var18);
         } else if (2 == var2) {
            var18 = (int)((double)var18 * 1.04);
         }

         int var19 = var18 * in.ac[415331477 * var10.ak] >> 16;
         int var20 = var18 * in.au[415331477 * var10.ak] >> 16;
         var21.ai();
         var21.bx(0, -2044433177 * var10.az, var10.ad * 450595207, var10.ak * 415331477, var10.ae * 151912273, 1550732737 * var21.et / 2 + var19 + -271411709 * var10.ap, var20 + var10.ap * -271411709);
         if (-1276549997 * var10.cg != -1) {
            var22.ax(0, 0);
         }

         if (var2 >= 1) {
            var9.at(1);
         }

         if (var2 >= 2) {
            var9.at(16777215);
         }

         if (0 != var3) {
            var9.aa(var3);
         }

         an.ay_renamed(var9.af, 36, 32, (float[])null);
         if (var10.ci * -1375068187 != -1) {
            var22.ax(0, 0);
         }

         if (var4 == 1 || var4 == 2 && 1 == var10.bi * 1552863327) {
            eh.ax.draw(dy.ao_renamed(var1), 0, 9, 16776960, 1);
         }

         if (!var5) {
            ObjType.ao.put(var9, var7);
         }

         an.ay_renamed(var13, var14, var15, var16);
         Rasterizer2D.Rasterizer2D_setClipArray(var17);
         am.ao_renamed();
         in.ab.an = true;
         return var9;
      }
   }
}
