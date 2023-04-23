public class Scene {
   public static boolean af = true;
   public static int bd = -1;
   public static int bt = -1;
   static boolean bj = false;
   static boolean bx = false;
   static boolean[][] cq;
   static boolean[][][][] ck;
   static int ad;
   static int ae;
   static int ag = 0;
   static int ah = 0;
   static int aj;
   static int ak;
   static int am;
   static int ap;
   static int ar;
   static int as;
   static int av;
   static int az;
   static int bb;
   static int be;
   static int bf;
   static int bi;
   static int bm = 0;
   static int bo = 0;
   static int br = 4;
   static int by;
   static int bz = 0;
   static int cf;
   static int cg;
   static int cl;
   static int cm;
   static int cr;
   static int cy;
   static int[] bg;
   static Occluder[] bq;
   static Occluder[][] bu;
   static Scenery[] bk = new Scenery[100];
   static NodeDeque ba;
   static final int[] bc;
   static final int[] bh;
   static final int[] bl;
   static final int[] bp;
   static final int[] bv;
   static final int[] bw;
   static final int[] ce;
   int ac;
   int al = 0;
   int an;
   int aq = 0;
   int aw;
   int[][] ca = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][] cu = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   int[][][] aa;
   int[][][] au;
   Tile[][][] ab;
   Scenery[] at = new Scenery[5000];

   static {
      bg = new int[br];
      bu = new Occluder[br][500];
      bf = 0;
      bq = new Occluder[500];
      ba = new NodeDeque();
      bv = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      bl = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      bp = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      bc = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      bh = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      bw = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      ce = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      ck = new boolean[8][32][51][51];
   }

   public Scene(int var1, int var2, int var3, int[][][] var4) {
      this.an = var1;
      this.aw = var2;
      this.ac = var3;
      this.ab = new Tile[var1][var2][var3];
      this.aa = new int[var1][var2 + 1][var3 + 1];
      this.au = var4;
      this.clear();
   }

   public void clear() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.an; ++var1) {
         for(var2 = 0; var2 < this.aw; ++var2) {
            for(int var3 = 0; var3 < this.ac; ++var3) {
               this.ab[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < br; ++var1) {
         for(var2 = 0; var2 < bg[var1]; ++var2) {
            bu[var1][var2] = null;
         }

         bg[var1] = 0;
      }

      for(var1 = 0; var1 < this.al; ++var1) {
         this.at[var1] = null;
      }

      this.al = 0;

      for(var1 = 0; var1 < bk.length; ++var1) {
         bk[var1] = null;
      }

   }

   public void an(int var1) {
      this.aq = var1;

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.ac; ++var3) {
            if (this.ab[var1][var2][var3] == null) {
               this.ab[var1][var2][var3] = new Tile(var1, var2, var3);
            }
         }
      }

   }

   public void aw(int var1, int var2) {
      Tile var3 = this.ab[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         Tile var5 = this.ab[var4][var1][var2] = this.ab[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.af -= -1846949283;

            for(int var6 = 0; var6 < var5.ay * -422028371; ++var6) {
               Scenery var7 = var5.ao[var6];
               if (eg.an(var7.ax * 5016412888503339625L) && var7.an * 626811319 == var1 && var7.at * 2004902003 == var2) {
                  var7.af -= -1695101227;
               }
            }
         }
      }

      if (this.ab[0][var1][var2] == null) {
         this.ab[0][var1][var2] = new Tile(0, var1, var2);
      }

      this.ab[0][var1][var2].az = var3;
      this.ab[3][var1][var2] = null;
   }

   public static void Scene_addOccluder(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Occluder var8 = new Occluder();
      var8.af = var2 / 128 * 2125806217;
      var8.an = var3 / 128 * -2141622931;
      var8.aw = var4 / 128 * -1507898379;
      var8.ac = var5 / 128 * 1022688161;
      var8.au = var1 * -1065960575;
      var8.ab = var2 * 2126671529;
      var8.aq = var3 * 385880973;
      var8.al = var4 * 582998597;
      var8.at = var5 * 495746131;
      var8.aa = var6 * 903512679;
      var8.ay = var7 * -1329473239;
      bu[var0][bg[var0]++] = var8;
   }

   public void setTileMinPlane(int var1, int var2, int var3, int var4) {
      Tile var5 = this.ab[var1][var2][var3];
      if (var5 != null) {
         this.ab[var1][var2][var3].ag = var4 * -2078731195;
      }
   }

   public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      TilePaint var21;
      int var22;
      if (var4 == 0) {
         var21 = new TilePaint(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].au = var21;
      } else if (var4 != 1) {
         TileModel var27 = new TileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].ab = var27;
      } else {
         var21 = new TilePaint(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].au = var21;
      }
   }

   public void newFloorDecoration(int var1, int var2, int var3, int var4, Entity var5, long var6, int var8) {
      if (var5 != null) {
         FloorDecoration var9 = new FloorDecoration();
         var9.ac = var5;
         var9.an = var2 * -1191266432 + -595633216;
         var9.aw = var3 * -136012928 + -68006464;
         var9.af = var4 * -317230161;
         var9.au = var6 * -4945803534983804595L;
         var9.ab = var8 * 1624352991;
         if (this.ab[var1][var2][var3] == null) {
            this.ab[var1][var2][var3] = new Tile(var1, var2, var3);
         }

         this.ab[var1][var2][var3].at = var9;
      }
   }

   public void newObjStack(int var1, int var2, int var3, int var4, Entity var5, long var6, Entity var8, Entity var9) {
      ObjStack var10 = new ObjStack();
      var10.ac = var5;
      var10.an = var2 * 1690125440 + 845062720;
      var10.aw = var3 * 2013560960 + 1006780480;
      var10.af = var4 * -1773379811;
      var10.aq = var6 * 1651765281680972561L;
      var10.au = var8;
      var10.ab = var9;
      int var11 = 0;
      Tile var12 = this.ab[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.ay * -422028371; ++var13) {
            if ((var12.ao[var13].ai * -72925475 & 256) == 256 && var12.ao[var13].ab instanceof it) {
               it var14 = (it)var12.ao[var13].ab;
               var14.ai();
               if (var14.et * 1550732737 > var11) {
                  var11 = var14.et * 1550732737;
               }
            }
         }
      }

      var10.al = var11 * -1223694975;
      if (this.ab[var1][var2][var3] == null) {
         this.ab[var1][var2][var3] = new Tile(var1, var2, var3);
      }

      this.ab[var1][var2][var3].aa = var10;
   }

   public void newWall(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         Wall var12 = new Wall();
         var12.al = var9 * -1417919518333993033L;
         var12.at = var11 * -2009432563;
         var12.an = var2 * -1436186496 + 1429390400;
         var12.aw = var3 * 430510720 + 215255360;
         var12.af = var4 * 1266004207;
         var12.ab = var5;
         var12.aq = var6;
         var12.ac = var7 * 1547196561;
         var12.au = var8 * 185156955;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.ab[var13][var2][var3] == null) {
               this.ab[var13][var2][var3] = new Tile(var13, var2, var3);
            }
         }

         this.ab[var1][var2][var3].aq = var12;
      }
   }

   public void newWallDecoration(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         WallDecoration var14 = new WallDecoration();
         var14.aa = var11 * -5837374244328004387L;
         var14.ay = var13 * -486021893;
         var14.aw = var2 * 571975552 + 285987776;
         var14.ac = var3 * 1599256960 + 799628480;
         var14.af = var4 * -33433415;
         var14.al = var5;
         var14.at = var6;
         var14.au = var7 * -1230454197;
         var14.ab = var8 * 1035196391;
         var14.an = var9 * -1372050943;
         var14.aq = var10 * -965136487;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.ab[var15][var2][var3] == null) {
               this.ab[var15][var2][var3] = new Tile(var15, var2, var3);
            }
         }

         this.ab[var1][var2][var3].al = var14;
      }
   }

   public boolean ay(int var1, int var2, int var3, int var4, int var5, int var6, Entity var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 64 * var5;
         int var13 = var3 * 128 + 64 * var6;
         return this.newScenery(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public boolean ao(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.newScenery(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean ax(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.newScenery(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean newScenery(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Entity var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.aw || var16 >= this.ac) {
               return false;
            }

            Tile var17 = this.ab[var1][var15][var16];
            if (var17 != null && var17.ay * -422028371 >= 5) {
               return false;
            }
         }
      }

      Scenery var22 = new Scenery();
      var22.ax = var12 * 8415652607842018777L;
      var22.ai = var14 * -287536779;
      var22.af = var1 * -1695101227;
      var22.ac = var6 * -299460585;
      var22.au = var7 * -521982365;
      var22.aw = var8 * 1244562195;
      var22.ab = var9;
      var22.aq = var10 * -1843325159;
      var22.an = var2 * 843140103;
      var22.at = var3 * -700889925;
      var22.al = (var2 + var4 - 1) * 1300873191;
      var22.aa = (var3 + var5 - 1) * -1083409309;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var23 = var3; var23 < var3 + var5; ++var23) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var23 > var3) {
               var18 += 8;
            }

            if (var23 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.ab[var19][var16][var23] == null) {
                  this.ab[var19][var16][var23] = new Tile(var19, var16, var23);
               }
            }

            Tile var24 = this.ab[var1][var16][var23];
            var24.ao[var24.ay * -422028371] = var22;
            var24.ax[var24.ay * -422028371] = var18;
            var24.ai = (var24.ai * -1639156513 | var18) * -1238612193;
            var24.ay += 1425915941;
         }
      }

      if (var11) {
         this.at[this.al++] = var22;
      }

      return true;
   }

   public void ag() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         Scenery var2 = this.at[var1];
         this.ah(var2);
         this.at[var1] = null;
      }

      this.al = 0;
   }

   void ah(Scenery var1) {
      for(int var2 = var1.an * 626811319; var2 <= var1.al * -1242897449; ++var2) {
         for(int var3 = var1.at * 2004902003; var3 <= var1.aa * -80616117; ++var3) {
            Tile var4 = this.ab[var1.af * -872547715][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.ay * -422028371; ++var5) {
                  if (var4.ao[var5] == var1) {
                     var4.ay -= 1425915941;

                     for(int var6 = var5; var6 < var4.ay * -422028371; ++var6) {
                        var4.ao[var6] = var4.ao[var6 + 1];
                        var4.ax[var6] = var4.ax[var6 + 1];
                     }

                     var4.ao[var4.ay * -422028371] = null;
                     break;
                  }
               }

               var4.ai = 0;

               for(var5 = 0; var5 < var4.ay * -422028371; ++var5) {
                  var4.ai = (var4.ai * -1639156513 | var4.ax[var5]) * -1238612193;
               }
            }
         }
      }

   }

   public void av(int var1, int var2, int var3, int var4) {
      Tile var5 = this.ab[var1][var2][var3];
      if (var5 != null) {
         WallDecoration var6 = var5.al;
         if (var6 != null) {
            var6.an = var6.an * 1353438721 * var4 / 16 * -1372050943;
            var6.aq = var6.aq * 1573434537 * var4 / 16 * -965136487;
         }
      }
   }

   public void ar(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.aq = null;
      }
   }

   public void am(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.al = null;
      }
   }

   public void as(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            Scenery var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * 626811319 == var2 && var6.at * 2004902003 == var3) {
               this.ah(var6);
               return;
            }
         }

      }
   }

   public void aj(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.at = null;
      }
   }

   public void ak(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.aa = null;
      }
   }

   public Wall az(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      return var4 == null ? null : var4.aq;
   }

   public WallDecoration ad(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      return var4 == null ? null : var4.al;
   }

   public Scenery ae(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            Scenery var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * 626811319 == var2 && var6.at * 2004902003 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public FloorDecoration ap(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at : null;
   }

   public long by(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.aq != null ? var4.aq.al * -4009183385476919801L : 0L;
   }

   public long bb(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.al != null ? var4.al.aa * -4691380879163567243L : 0L;
   }

   public long bi(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            Scenery var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * 626811319 == var2 && var6.at * 2004902003 == var3) {
               return var6.ax * 5016412888503339625L;
            }
         }

         return 0L;
      }
   }

   public long be(int var1, int var2, int var3) {
      Tile var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at.au * 3423223696102332293L : 0L;
   }

   public int bk(int var1, int var2, int var3, long var4) {
      Tile var6 = this.ab[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.aq != null && var6.aq.al * -4009183385476919801L == var4) {
         return var6.aq.at * 347144389 & 255;
      } else if (var6.al != null && var6.al.aa * -4691380879163567243L == var4) {
         return var6.al.ay * 35030579 & 255;
      } else if (var6.at != null && var6.at.au * 3423223696102332293L == var4) {
         return var6.at.ab * -1486089441 & 255;
      } else {
         for(int var7 = 0; var7 < var6.ay * -422028371; ++var7) {
            if (var6.ao[var7].ax * 5016412888503339625L == var4) {
               return var6.ao[var7].ai * -72925475 & 255;
            }
         }

         return -1;
      }
   }

   public void bx(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.an; ++var4) {
         for(int var5 = 0; var5 < this.aw; ++var5) {
            for(int var6 = 0; var6 < this.ac; ++var6) {
               Tile var7 = this.ab[var4][var5][var6];
               if (var7 != null) {
                  Wall var8 = var7.aq;
                  UnlitModel var10;
                  if (var8 != null && var8.ab instanceof UnlitModel) {
                     UnlitModel var9 = (UnlitModel)var8.ab;
                     this.bz(var9, var4, var5, var6, 1, 1);
                     if (var8.aq instanceof UnlitModel) {
                        var10 = (UnlitModel)var8.aq;
                        this.bz(var10, var4, var5, var6, 1, 1);
                        UnlitModel.by(var9, var10, 0, 0, 0, false);
                        var8.aq = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                     }

                     var8.ab = var9.bb(var9.bo, var9.bz, var1, var2, var3);
                  }

                  for(int var14 = 0; var14 < var7.ay * -422028371; ++var14) {
                     Scenery var16 = var7.ao[var14];
                     if (var16 != null && var16.ab instanceof UnlitModel) {
                        UnlitModel var11 = (UnlitModel)var16.ab;
                        this.bz(var11, var4, var5, var6, var16.al * -1242897449 - var16.an * 626811319 + 1, var16.aa * -80616117 - var16.at * 2004902003 + 1);
                        var16.ab = var11.bb(var11.bo, var11.bz, var1, var2, var3);
                     }
                  }

                  FloorDecoration var15 = var7.at;
                  if (var15 != null && var15.ac instanceof UnlitModel) {
                     var10 = (UnlitModel)var15.ac;
                     this.bo(var10, var4, var5, var6);
                     var15.ac = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   void bo(UnlitModel var1, int var2, int var3, int var4) {
      Tile var5;
      UnlitModel var6;
      if (var3 < this.aw) {
         var5 = this.ab[var2][var3 + 1][var4];
         if (var5 != null && var5.at != null && var5.at.ac instanceof UnlitModel) {
            var6 = (UnlitModel)var5.at.ac;
            UnlitModel.by(var1, var6, 128, 0, 0, true);
         }
      }

      if (var4 < this.aw) {
         var5 = this.ab[var2][var3][var4 + 1];
         if (var5 != null && var5.at != null && var5.at.ac instanceof UnlitModel) {
            var6 = (UnlitModel)var5.at.ac;
            UnlitModel.by(var1, var6, 0, 0, 128, true);
         }
      }

      if (var3 < this.aw && var4 < this.ac) {
         var5 = this.ab[var2][var3 + 1][var4 + 1];
         if (var5 != null && var5.at != null && var5.at.ac instanceof UnlitModel) {
            var6 = (UnlitModel)var5.at.ac;
            UnlitModel.by(var1, var6, 128, 0, 128, true);
         }
      }

      if (var3 < this.aw && var4 > 0) {
         var5 = this.ab[var2][var3 + 1][var4 - 1];
         if (var5 != null && var5.at != null && var5.at.ac instanceof UnlitModel) {
            var6 = (UnlitModel)var5.at.ac;
            UnlitModel.by(var1, var6, 128, 0, -128, true);
         }
      }

   }

   void bz(UnlitModel var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.an) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.aw) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.ac && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        Tile var15 = this.ab[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = (this.au[var12][var13][var14] + this.au[var12][var13 + 1][var14] + this.au[var12][var13][var14 + 1] + this.au[var12][var13 + 1][var14 + 1]) / 4 - (this.au[var2][var3][var4] + this.au[var2][var3 + 1][var4] + this.au[var2][var3][var4 + 1] + this.au[var2][var3 + 1][var4 + 1]) / 4;
                           Wall var17 = var15.aq;
                           if (var17 != null) {
                              UnlitModel var18;
                              if (var17.ab instanceof UnlitModel) {
                                 var18 = (UnlitModel)var17.ab;
                                 UnlitModel.by(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.aq instanceof UnlitModel) {
                                 var18 = (UnlitModel)var17.aq;
                                 UnlitModel.by(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var25 = 0; var25 < var15.ay * -422028371; ++var25) {
                              Scenery var19 = var15.ao[var25];
                              if (var19 != null && var19.ab instanceof UnlitModel) {
                                 UnlitModel var20 = (UnlitModel)var19.ab;
                                 int var21 = var19.al * -1242897449 - var19.an * 626811319 + 1;
                                 int var22 = var19.aa * -80616117 - var19.at * 2004902003 + 1;
                                 UnlitModel.by(var1, var20, (var19.an * 626811319 - var3) * 128 + (var21 - var5) * 64, var16, (var19.at * 2004902003 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   public void bm(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      Tile var7 = this.ab[var4][var5][var6];
      if (var7 != null) {
         TilePaint var8 = var7.au;
         int var10;
         if (var8 != null) {
            int var18 = var8.aq * -2143818661;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            TileModel var9 = var7.ab;
            if (var9 != null) {
               var10 = var9.ao;
               int var11 = var9.ax;
               int var12 = var9.ai;
               int var13 = var9.ag;
               int[] var14 = this.ca[var10];
               int[] var15 = this.cu[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
      cl = 0;
      cg = 0;
      cr = var3;
      cy = var4;
      cm = var3 / 2;
      cf = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            by = in.ac[var6];
            bb = in.au[var6];
            bi = in.ac[var7];
            be = in.au[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (bt_renamed(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var22 = false;

                  label103:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var22 = true;
                           break label103;
                        }

                        if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var22 = true;
                           break label103;
                        }

                        if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var22 = true;
                           break label103;
                        }

                        if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var22 = true;
                           break label103;
                        }
                     }
                  }

                  ck[var6][var7][var8 + 25][var9 + 25] = var22;
               }
            }
         }
      }

   }

   static boolean bt_renamed(int var0, int var1, int var2) {
      int var3 = var2 * bi + var0 * be >> 16;
      int var4 = var2 * be - var0 * bi >> 16;
      int var5 = var1 * by + var4 * bb >> 16;
      int var6 = var1 * bb - var4 * by >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = cm + var3 * 128 / var5;
         int var8 = cf + var6 * 128 / var5;
         return var7 >= cl && var7 <= cr && var8 >= cg && var8 <= cy;
      } else {
         return false;
      }
   }

   public void menuOpen(int var1, int var2, int var3, boolean var4) {
      if (!bs() || var4) {
         bx = true;
         bj = var4;
         bo = var1;
         bz = var2;
         bm = var3;
         bd = -1;
         bt = -1;
      }
   }

   public void bn() {
      bj = true;
   }

   public static boolean bs() {
      return bj && bd != -1;
   }

   public static void br() {
      bd = -1;
      bj = false;
   }

   public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.aw * 128) {
         var1 = this.aw * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ac * 128) {
         var3 = this.ac * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++av;
      by = in.ac[var4];
      bb = in.au[var4];
      bi = in.ac[var5];
      be = in.au[var5];
      cq = ck[(var4 - 128) / 32][var5 / 64];
      ad = var1;
      ae = var2;
      ap = var3;
      ak = var1 / 128;
      az = var3 / 128;
      ah = var6;
      ar = ak - 25;
      if (ar < 0) {
         ar = 0;
      }

      as = az - 25;
      if (as < 0) {
         as = 0;
      }

      am = ak + 25;
      if (am > this.aw) {
         am = this.aw;
      }

      aj = az + 25;
      if (aj > this.ac) {
         aj = this.ac;
      }

      this.bl();
      ag = 0;

      int var7;
      Tile[][] var8;
      int var9;
      int var10;
      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = ar; var9 < am; ++var9) {
            for(var10 = as; var10 < aj; ++var10) {
               Tile var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.ag * 65855117 <= var6 && (cq[var9 - ak + 25][var10 - az + 25] || this.au[var7][var9][var10] - var2 >= 2000)) {
                     var11.ah = true;
                     var11.av = true;
                     if (var11.ay * -422028371 > 0) {
                        var11.ar = true;
                     } else {
                        var11.ar = false;
                     }

                     ++ag;
                  } else {
                     var11.ah = false;
                     var11.av = false;
                     var11.am = 0;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      Tile var15;
      int var18;
      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = ak + var9;
            var18 = ak - var9;
            if (var10 >= ar || var18 < am) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = az + var12;
                  var14 = az - var12;
                  if (var10 >= ar) {
                     if (var13 >= as) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.ah) {
                           this.drawTile(var15, true);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.ah) {
                           this.drawTile(var15, true);
                        }
                     }
                  }

                  if (var18 < am) {
                     if (var13 >= as) {
                        var15 = var8[var18][var13];
                        if (var15 != null && var15.ah) {
                           this.drawTile(var15, true);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var18][var14];
                        if (var15 != null && var15.ah) {
                           this.drawTile(var15, true);
                        }
                     }
                  }

                  if (ag == 0) {
                     bx = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = ak + var9;
            var18 = ak - var9;
            if (var10 >= ar || var18 < am) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = az + var12;
                  var14 = az - var12;
                  if (var10 >= ar) {
                     if (var13 >= as) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.ah) {
                           this.drawTile(var15, false);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.ah) {
                           this.drawTile(var15, false);
                        }
                     }
                  }

                  if (var18 < am) {
                     if (var13 >= as) {
                        var15 = var8[var18][var13];
                        if (var15 != null && var15.ah) {
                           this.drawTile(var15, false);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var18][var14];
                        if (var15 != null && var15.ah) {
                           this.drawTile(var15, false);
                        }
                     }
                  }

                  if (ag == 0) {
                     bx = false;
                     return;
                  }
               }
            }
         }
      }

      bx = false;
   }

   void drawTile(Tile var1, boolean var2) {
      ba.addFirst(var1);

      while(true) {
         Tile var3;
         int var4;
         int var5;
         int var6;
         int var7;
         Tile[][] var8;
         Tile var9;
         int var11;
         int var14;
         int var15;
         int var16;
         int var24;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              Wall var10;
                              Scenery var12;
                              int var17;
                              int var18;
                              int var21;
                              boolean var22;
                              Tile var33;
                              while(true) {
                                 do {
                                    var3 = (Tile)ba.removeLast();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.av);

                                 var4 = var3.an * -464760837;
                                 var5 = var3.aw * -1812849043;
                                 var6 = var3.af * 1527994869;
                                 var7 = var3.ac * 1520539719;
                                 var8 = this.ab[var6];
                                 if (!var3.ah) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.ab[var6 - 1][var4][var5];
                                       if (var9 != null && var9.av) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= ak && var4 > ar) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= ak && var4 < am - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= az && var5 > as) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= az && var5 < aj - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.ah = false;
                                 if (var3.az != null) {
                                    var9 = var3.az;
                                    if (var9.au != null) {
                                       if (!this.bp(0, var4, var5)) {
                                          this.bf(var9.au, 0, by, bb, bi, be, var4, var5);
                                       }
                                    } else if (var9.ab != null && !this.bp(0, var4, var5)) {
                                       this.bq(var9.ab, by, bb, bi, be, var4, var5);
                                    }

                                    var10 = var9.aq;
                                    if (var10 != null) {
                                       var10.ab.draw(0, by, bb, bi, be, var10.an * -1998748175 - ad, var10.af * 1061912079 - ae, var10.aw * -1171883603 - ap, var10.al * -4009183385476919801L);
                                    }

                                    for(var11 = 0; var11 < var9.ay * -422028371; ++var11) {
                                       var12 = var9.ao[var11];
                                       if (var12 != null) {
                                          var12.ab.draw(var12.aq * -1521986263, by, bb, bi, be, var12.ac * -1546117209 - ad, var12.aw * 1042267931 - ae, var12.au * 1463075659 - ap, var12.ax * 5016412888503339625L);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var3.au != null) {
                                    if (!this.bp(var7, var4, var5)) {
                                       var22 = true;
                                       if (var3.au.aw * -1667175185 != 12345678 || bx && var6 <= bo) {
                                          this.bf(var3.au, var7, by, bb, bi, be, var4, var5);
                                       }
                                    }
                                 } else if (var3.ab != null && !this.bp(var7, var4, var5)) {
                                    var22 = true;
                                    this.bq(var3.ab, by, bb, bi, be, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 Wall var23 = var3.aq;
                                 WallDecoration var13 = var3.al;
                                 if (var23 != null || var13 != null) {
                                    if (ak == var4) {
                                       ++var21;
                                    } else if (ak < var4) {
                                       var21 += 2;
                                    }

                                    if (az == var5) {
                                       var21 += 3;
                                    } else if (az > var5) {
                                       var21 += 6;
                                    }

                                    var11 = bv[var21];
                                    var3.ak = bp[var21] * 1933576483;
                                 }

                                 if (var23 != null) {
                                    if ((var23.ac * -137992079 & bl[var21]) != 0) {
                                       if (var23.ac * -137992079 == 16) {
                                          var3.am = -875132571;
                                          var3.as = bc[var21] * 1761397621;
                                          var3.aj = 520035649 - var3.as * 1049420895;
                                       } else if (var23.ac * -137992079 == 32) {
                                          var3.am = -1750265142;
                                          var3.as = bh[var21] * 1761397621;
                                          var3.aj = 1040071298 - var3.as * 1049420895;
                                       } else if (var23.ac * -137992079 == 64) {
                                          var3.am = 794437012;
                                          var3.as = bw[var21] * 1761397621;
                                          var3.aj = 2080142596 - var3.as * 1049420895;
                                       } else {
                                          var3.am = 1669569583;
                                          var3.as = ce[var21] * 1761397621;
                                          var3.aj = 1560106947 - var3.as * 1049420895;
                                       }
                                    } else {
                                       var3.am = 0;
                                    }

                                    if ((var23.ac * -137992079 & var11) != 0 && !this.bc(var7, var4, var5, var23.ac * -137992079)) {
                                       var23.ab.draw(0, by, bb, bi, be, var23.an * -1998748175 - ad, var23.af * 1061912079 - ae, var23.aw * -1171883603 - ap, var23.al * -4009183385476919801L);
                                    }

                                    if ((var23.au * 379413203 & var11) != 0 && !this.bc(var7, var4, var5, var23.au * 379413203)) {
                                       var23.aq.draw(0, by, bb, bi, be, var23.an * -1998748175 - ad, var23.af * 1061912079 - ae, var23.aw * -1171883603 - ap, var23.al * -4009183385476919801L);
                                    }
                                 }

                                 if (var13 != null && !this.bh(var7, var4, var5, var13.al.et * 1550732737)) {
                                    if ((var13.au * -607881373 & var11) != 0) {
                                       var13.al.draw(0, by, bb, bi, be, var13.aw * 1346340783 - ad + var13.an * 1353438721, var13.af * 452898185 - ae, var13.ac * 1328351163 - ap + var13.aq * 1573434537, var13.aa * -4691380879163567243L);
                                    } else if (var13.au * -607881373 == 256) {
                                       var14 = var13.aw * 1346340783 - ad;
                                       var15 = var13.af * 452898185 - ae;
                                       var16 = var13.ac * 1328351163 - ap;
                                       var17 = var13.ab * -1711060009;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var14;
                                       } else {
                                          var18 = -var14;
                                       }

                                       int var19;
                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var13.al.draw(0, by, bb, bi, be, var14 + var13.an * 1353438721, var15, var16 + var13.aq * 1573434537, var13.aa * -4691380879163567243L);
                                       } else if (var13.at != null) {
                                          var13.at.draw(0, by, bb, bi, be, var14, var15, var16, var13.aa * -4691380879163567243L);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    FloorDecoration var27 = var3.at;
                                    if (var27 != null) {
                                       var27.ac.draw(0, by, bb, bi, be, var27.an * 487195023 - ad, var27.af * 1777058639 - ae, var27.aw * -1480835961 - ap, var27.au * 3423223696102332293L);
                                    }

                                    ObjStack var31 = var3.aa;
                                    if (var31 != null && var31.al * -1118938495 == 0) {
                                       if (var31.au != null) {
                                          var31.au.draw(0, by, bb, bi, be, var31.an * -1473635399 - ad, var31.af * 2064997173 - ae, var31.aw * -1839139071 - ap, var31.aq * -8562400470617197071L);
                                       }

                                       if (var31.ab != null) {
                                          var31.ab.draw(0, by, bb, bi, be, var31.an * -1473635399 - ad, var31.af * 2064997173 - ae, var31.aw * -1839139071 - ap, var31.aq * -8562400470617197071L);
                                       }

                                       if (var31.ac != null) {
                                          var31.ac.draw(0, by, bb, bi, be, var31.an * -1473635399 - ad, var31.af * 2064997173 - ae, var31.aw * -1839139071 - ap, var31.aq * -8562400470617197071L);
                                       }
                                    }
                                 }

                                 var14 = var3.ai * -1639156513;
                                 if (var14 != 0) {
                                    if (var4 < ak && (var14 & 4) != 0) {
                                       var33 = var8[var4 + 1][var5];
                                       if (var33 != null && var33.av) {
                                          ba.addFirst(var33);
                                       }
                                    }

                                    if (var5 < az && (var14 & 2) != 0) {
                                       var33 = var8[var4][var5 + 1];
                                       if (var33 != null && var33.av) {
                                          ba.addFirst(var33);
                                       }
                                    }

                                    if (var4 > ak && (var14 & 1) != 0) {
                                       var33 = var8[var4 - 1][var5];
                                       if (var33 != null && var33.av) {
                                          ba.addFirst(var33);
                                       }
                                    }

                                    if (var5 > az && (var14 & 8) != 0) {
                                       var33 = var8[var4][var5 - 1];
                                       if (var33 != null && var33.av) {
                                          ba.addFirst(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.am * 1223983431 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var3.ay * -422028371; ++var21) {
                                    if (var3.ao[var21].ao * -1033646519 != av && (var3.ax[var21] & var3.am * 1223983431) == var3.as * -1655477027) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var10 = var3.aq;
                                    if (!this.bc(var7, var4, var5, var10.ac * -137992079)) {
                                       var10.ab.draw(0, by, bb, bi, be, var10.an * -1998748175 - ad, var10.af * 1061912079 - ae, var10.aw * -1171883603 - ap, var10.al * -4009183385476919801L);
                                    }

                                    var3.am = 0;
                                 }
                              }

                              if (!var3.ar) {
                                 break;
                              }

                              try {
                                 int var25 = var3.ay * -422028371;
                                 var3.ar = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var25; ++var11) {
                                    var12 = var3.ao[var11];
                                    if (var12.ao * -1033646519 != av) {
                                       for(var26 = var12.an * 626811319; var26 <= var12.al * -1242897449; ++var26) {
                                          for(var14 = var12.at * 2004902003; var14 <= var12.aa * -80616117; ++var14) {
                                             var33 = var8[var26][var14];
                                             if (var33.ah) {
                                                var3.ar = true;
                                                continue label563;
                                             }

                                             if (var33.am * 1223983431 != 0) {
                                                var16 = 0;
                                                if (var26 > var12.an * 626811319) {
                                                   ++var16;
                                                }

                                                if (var26 < var12.al * -1242897449) {
                                                   var16 += 4;
                                                }

                                                if (var14 > var12.at * 2004902003) {
                                                   var16 += 8;
                                                }

                                                if (var14 < var12.aa * -80616117) {
                                                   var16 += 2;
                                                }

                                                if ((var16 & var33.am * 1223983431) == var3.aj * 485316675) {
                                                   var3.ar = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       bk[var21++] = var12;
                                       var26 = ak - var12.an * 626811319;
                                       var14 = var12.al * -1242897449 - ak;
                                       if (var14 > var26) {
                                          var26 = var14;
                                       }

                                       var15 = az - var12.at * 2004902003;
                                       var16 = var12.aa * -80616117 - az;
                                       if (var16 > var15) {
                                          var12.ay = (var26 + var16) * -1266251803;
                                       } else {
                                          var12.ay = (var26 + var15) * -1266251803;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       Scenery var34 = bk[var26];
                                       if (var34.ao * -1033646519 != av) {
                                          if (var34.ay * 308174317 > var11) {
                                             var11 = var34.ay * 308174317;
                                             var24 = var26;
                                          } else if (var34.ay * 308174317 == var11) {
                                             var15 = var34.ac * -1546117209 - ad;
                                             var16 = var34.au * 1463075659 - ap;
                                             var17 = bk[var24].ac * -1546117209 - ad;
                                             var18 = bk[var24].au * 1463075659 - ap;
                                             if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    Scenery var35 = bk[var24];
                                    var35.ao = av * -76184583;
                                    if (!this.bw(var7, var35.an * 626811319, var35.al * -1242897449, var35.at * 2004902003, var35.aa * -80616117, var35.ab.et * 1550732737)) {
                                       var35.ab.draw(var35.aq * -1521986263, by, bb, bi, be, var35.ac * -1546117209 - ad, var35.aw * 1042267931 - ae, var35.au * 1463075659 - ap, var35.ax * 5016412888503339625L);
                                    }

                                    for(var14 = var35.an * 626811319; var14 <= var35.al * -1242897449; ++var14) {
                                       for(var15 = var35.at * 2004902003; var15 <= var35.aa * -80616117; ++var15) {
                                          Tile var36 = var8[var14][var15];
                                          if (var36.am * 1223983431 != 0) {
                                             ba.addFirst(var36);
                                          } else if ((var14 != var4 || var15 != var5) && var36.av) {
                                             ba.addFirst(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.ar) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var3.ar = false;
                                 break;
                              }
                           }
                        } while(!var3.av);
                     } while(var3.am * 1223983431 != 0);

                     if (var4 > ak || var4 <= ar) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.av);

                  if (var4 < ak || var4 >= am - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.av);

               if (var5 > az || var5 <= as) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.av);

            if (var5 < az || var5 >= aj - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.av);

         var3.av = false;
         --ag;
         ObjStack var29 = var3.aa;
         if (var29 != null && var29.al * -1118938495 != 0) {
            if (var29.au != null) {
               var29.au.draw(0, by, bb, bi, be, var29.an * -1473635399 - ad, var29.af * 2064997173 - ae - var29.al * -1118938495, var29.aw * -1839139071 - ap, var29.aq * -8562400470617197071L);
            }

            if (var29.ab != null) {
               var29.ab.draw(0, by, bb, bi, be, var29.an * -1473635399 - ad, var29.af * 2064997173 - ae - var29.al * -1118938495, var29.aw * -1839139071 - ap, var29.aq * -8562400470617197071L);
            }

            if (var29.ac != null) {
               var29.ac.draw(0, by, bb, bi, be, var29.an * -1473635399 - ad, var29.af * 2064997173 - ae - var29.al * -1118938495, var29.aw * -1839139071 - ap, var29.aq * -8562400470617197071L);
            }
         }

         if (var3.ak * -1504022901 != 0) {
            WallDecoration var30 = var3.al;
            if (var30 != null && !this.bh(var7, var4, var5, var30.al.et * 1550732737)) {
               if ((var30.au * -607881373 & var3.ak * -1504022901) != 0) {
                  var30.al.draw(0, by, bb, bi, be, var30.aw * 1346340783 - ad + var30.an * 1353438721, var30.af * 452898185 - ae, var30.ac * 1328351163 - ap + var30.aq * 1573434537, var30.aa * -4691380879163567243L);
               } else if (var30.au * -607881373 == 256) {
                  var11 = var30.aw * 1346340783 - ad;
                  var24 = var30.af * 452898185 - ae;
                  var26 = var30.ac * 1328351163 - ap;
                  var14 = var30.ab * -1711060009;
                  if (var14 != 1 && var14 != 2) {
                     var15 = var11;
                  } else {
                     var15 = -var11;
                  }

                  if (var14 != 2 && var14 != 3) {
                     var16 = var26;
                  } else {
                     var16 = -var26;
                  }

                  if (var16 >= var15) {
                     var30.al.draw(0, by, bb, bi, be, var11 + var30.an * 1353438721, var24, var26 + var30.aq * 1573434537, var30.aa * -4691380879163567243L);
                  } else if (var30.at != null) {
                     var30.at.draw(0, by, bb, bi, be, var11, var24, var26, var30.aa * -4691380879163567243L);
                  }
               }
            }

            Wall var28 = var3.aq;
            if (var28 != null) {
               if ((var28.au * 379413203 & var3.ak * -1504022901) != 0 && !this.bc(var7, var4, var5, var28.au * 379413203)) {
                  var28.aq.draw(0, by, bb, bi, be, var28.an * -1998748175 - ad, var28.af * 1061912079 - ae, var28.aw * -1171883603 - ap, var28.al * -4009183385476919801L);
               }

               if ((var28.ac * -137992079 & var3.ak * -1504022901) != 0 && !this.bc(var7, var4, var5, var28.ac * -137992079)) {
                  var28.ab.draw(0, by, bb, bi, be, var28.an * -1998748175 - ad, var28.af * 1061912079 - ae, var28.aw * -1171883603 - ap, var28.al * -4009183385476919801L);
               }
            }
         }

         Tile var32;
         if (var6 < this.an - 1) {
            var32 = this.ab[var6 + 1][var4][var5];
            if (var32 != null && var32.av) {
               ba.addFirst(var32);
            }
         }

         if (var4 < ak) {
            var32 = var8[var4 + 1][var5];
            if (var32 != null && var32.av) {
               ba.addFirst(var32);
            }
         }

         if (var5 < az) {
            var32 = var8[var4][var5 + 1];
            if (var32 != null && var32.av) {
               ba.addFirst(var32);
            }
         }

         if (var4 > ak) {
            var32 = var8[var4 - 1][var5];
            if (var32 != null && var32.av) {
               ba.addFirst(var32);
            }
         }

         if (var5 > az) {
            var32 = var8[var4][var5 - 1];
            if (var32 != null && var32.av) {
               ba.addFirst(var32);
            }
         }
      }
   }

   void bf(TilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - ad;
      int var11;
      int var12 = var11 = (var8 << 7) - ap;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.au[var2][var7][var8] - ae;
      int var18 = this.au[var2][var7 + 1][var8] - ae;
      int var19 = this.au[var2][var7 + 1][var8 + 1] - ae;
      int var20 = this.au[var2][var7][var8 + 1] - ae;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = TaskHandler.au_renamed() + var10 * eu.at_renamed() / var12;
                  int var23 = ax.ab_renamed() + var17 * eu.at_renamed() / var12;
                  int var24 = TaskHandler.au_renamed() + var14 * eu.at_renamed() / var11;
                  int var25 = ax.ab_renamed() + var18 * eu.at_renamed() / var11;
                  int var26 = TaskHandler.au_renamed() + var13 * eu.at_renamed() / var16;
                  int var27 = ax.ab_renamed() + var19 * eu.at_renamed() / var16;
                  int var28 = TaskHandler.au_renamed() + var9 * eu.at_renamed() / var15;
                  int var29 = ax.ab_renamed() + var21 * eu.at_renamed() / var15;
                  float var30 = Npc.au_renamed(var12);
                  float var31 = Npc.au_renamed(var11);
                  float var32 = Npc.au_renamed(var16);
                  float var33 = Npc.au_renamed(var15);
                  in.ab.aw = 0;
                  int var34;
                  int var35;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     in.ab.af = false;
                     var34 = aq.aa_renamed();
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
                        in.ab.af = true;
                     }

                     if (bx && bv_renamed(bz, bm, var27, var29, var25, var26, var28, var24)) {
                        bd = var7;
                        bt = var8;
                     }

                     if (var1.au * 412494011 == -1) {
                        if (var1.aw * -1667175185 != 12345678) {
                           Wall.ah_renamed(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399);
                        }
                     } else if (!af) {
                        if (var1.ab) {
                           FloorDecoration.am_renamed(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.au * 412494011);
                        } else {
                           FloorDecoration.am_renamed(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.au * 412494011);
                        }
                     } else {
                        var35 = in.ab.aq.ac(var1.au * 412494011);
                        Wall.ah_renamed(var27, var29, var25, var26, var28, var24, var32, var33, var31, ba_renamed(var35, var1.aw * -1667175185), ba_renamed(var35, var1.ac * 890568309), ba_renamed(var35, var1.an * 40257399));
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     in.ab.af = false;
                     var34 = aq.aa_renamed();
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
                        in.ab.af = true;
                     }

                     if (bx && bv_renamed(bz, bm, var23, var25, var29, var22, var24, var28)) {
                        bd = var7;
                        bt = var8;
                     }

                     if (var1.au * 412494011 == -1) {
                        if (var1.af * 1860851959 != 12345678) {
                           Wall.ah_renamed(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.af * 1860851959, var1.an * 40257399, var1.ac * 890568309);
                        }
                     } else if (!af) {
                        FloorDecoration.am_renamed(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.af * 1860851959, var1.an * 40257399, var1.ac * 890568309, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.au * 412494011);
                     } else {
                        var35 = in.ab.aq.ac(var1.au * 412494011);
                        Wall.ah_renamed(var23, var25, var29, var22, var24, var28, var30, var31, var33, ba_renamed(var35, var1.af * 1860851959), ba_renamed(var35, var1.an * 40257399), ba_renamed(var35, var1.ac * 890568309));
                     }
                  }

               }
            }
         }
      }
   }

   void bq(TileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.af.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.af[var9] - ad;
         var11 = var1.an[var9] - ae;
         var12 = var1.aw[var9] - ap;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.aa != null) {
            TileModel.am[var9] = var10;
            TileModel.as[var9] = var13;
            TileModel.aj[var9] = var12;
         }

         TileModel.ah[var9] = TaskHandler.au_renamed() + var10 * eu.at_renamed() / var12;
         TileModel.av[var9] = ax.ab_renamed() + var13 * eu.at_renamed() / var12;
         TileModel.ar[var9] = Npc.au_renamed(var12);
      }

      in.ab.aw = 0;
      var8 = var1.aq.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.aq[var9];
         var11 = var1.al[var9];
         var12 = var1.at[var9];
         var13 = TileModel.ah[var10];
         int var14 = TileModel.ah[var11];
         int var15 = TileModel.ah[var12];
         int var16 = TileModel.av[var10];
         int var17 = TileModel.av[var11];
         int var18 = TileModel.av[var12];
         float var19 = TileModel.ar[var10];
         float var20 = TileModel.ar[var11];
         float var21 = TileModel.ar[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            in.ab.af = false;
            int var22 = aq.aa_renamed();
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
               in.ab.af = true;
            }

            if (bx && bv_renamed(bz, bm, var16, var17, var18, var13, var14, var15)) {
               bd = var6;
               bt = var7;
            }

            if (var1.aa != null && var1.aa[var9] != -1) {
               if (!af) {
                  if (var1.ay) {
                     FloorDecoration.am_renamed(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9], TileModel.am[0], TileModel.am[1], TileModel.am[3], TileModel.as[0], TileModel.as[1], TileModel.as[3], TileModel.aj[0], TileModel.aj[1], TileModel.aj[3], var1.aa[var9]);
                  } else {
                     FloorDecoration.am_renamed(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9], TileModel.am[var10], TileModel.am[var11], TileModel.am[var12], TileModel.as[var10], TileModel.as[var11], TileModel.as[var12], TileModel.aj[var10], TileModel.aj[var11], TileModel.aj[var12], var1.aa[var9]);
                  }
               } else {
                  int var23 = in.ab.aq.ac(var1.aa[var9]);
                  Wall.ah_renamed(var16, var17, var18, var13, var14, var15, var19, var20, var21, ba_renamed(var23, var1.ac[var9]), ba_renamed(var23, var1.au[var9]), ba_renamed(var23, var1.ab[var9]));
               }
            } else if (var1.ac[var9] != 12345678) {
               Wall.ah_renamed(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9]);
            }
         }
      }

   }

   static final int ba_renamed(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static boolean bv_renamed(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   void bl() {
      int var1 = bg[ah];
      Occluder[] var2 = bu[ah];
      bf = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         Occluder var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var18;
         if (var4.au * -33717119 == 1) {
            var5 = var4.af * -219522119 - ak + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.aw * 1910687837 - az + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.ac * 506177633 - az + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var18 = false;

               while(var6 <= var7) {
                  if (cq[var5][var6++]) {
                     var18 = true;
                     break;
                  }
               }

               if (var18) {
                  var9 = ad - var4.ab * -1074260583;
                  if (var9 > 32) {
                     var4.ao = 455574555;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.ao = 911149110;
                     var9 = -var9;
                  }

                  var4.ag = (var4.al * -1443747699 - ap << 8) / var9 * -220034745;
                  var4.ah = (var4.at * 1383802843 - ap << 8) / var9 * -1665480987;
                  var4.av = (var4.aa * 690846039 - ae << 8) / var9 * -1186198099;
                  var4.ar = (var4.ay * 1879954201 - ae << 8) / var9 * 628709121;
                  bq[bf++] = var4;
               }
            }
         } else if (var4.au * -33717119 == 2) {
            var5 = var4.aw * 1910687837 - az + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.af * -219522119 - ak + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.an * -1873370011 - ak + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var18 = false;

               while(var6 <= var7) {
                  if (cq[var6++][var5]) {
                     var18 = true;
                     break;
                  }
               }

               if (var18) {
                  var9 = ap - var4.al * -1443747699;
                  if (var9 > 32) {
                     var4.ao = 1366723665;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.ao = 1822298220;
                     var9 = -var9;
                  }

                  var4.ax = (var4.ab * -1074260583 - ad << 8) / var9 * -1619986937;
                  var4.ai = (var4.aq * -875468987 - ad << 8) / var9 * 528722083;
                  var4.av = (var4.aa * 690846039 - ae << 8) / var9 * -1186198099;
                  var4.ar = (var4.ay * 1879954201 - ae << 8) / var9 * 628709121;
                  bq[bf++] = var4;
               }
            }
         } else if (var4.au * -33717119 == 4) {
            var5 = var4.aa * 690846039 - ae;
            if (var5 > 128) {
               var6 = var4.aw * 1910687837 - az + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.ac * 506177633 - az + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var8 = var4.af * -219522119 - ak + 25;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.an * -1873370011 - ak + 25;
                  if (var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label194:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (cq[var11][var12]) {
                           var10 = true;
                           break label194;
                        }
                     }
                  }

                  if (var10) {
                     var4.ao = -2017094521;
                     var4.ax = (var4.ab * -1074260583 - ad << 8) / var5 * -1619986937;
                     var4.ai = (var4.aq * -875468987 - ad << 8) / var5 * 528722083;
                     var4.ag = (var4.al * -1443747699 - ap << 8) / var5 * -220034745;
                     var4.ah = (var4.at * 1383802843 - ap << 8) / var5 * -1665480987;
                     bq[bf++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean bp(int var1, int var2, int var3) {
      int var4 = this.aa[var1][var2][var3];
      if (var4 == -av) {
         return false;
      } else if (var4 == av) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.ce(var5 + 1, this.au[var1][var2][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.ce(var5 + 1, this.au[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.aa[var1][var2][var3] = av;
            return true;
         } else {
            this.aa[var1][var2][var3] = -av;
            return false;
         }
      }
   }

   boolean bc(int var1, int var2, int var3, int var4) {
      if (!this.bp(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.au[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > ad) {
                  if (!this.ce(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < ap) {
                  if (!this.ce(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.ce(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < ad) {
                  if (!this.ce(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > ap) {
                  if (!this.ce(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.ce(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.ce(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.ce(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.ce(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.ce(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean bh(int var1, int var2, int var3, int var4) {
      if (!this.bp(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.ce(var5 + 1, this.au[var1][var2][var3] - var4, var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3] - var4, var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.ce(var5 + 1, this.au[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean bw(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.bp(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.ce(var7 + 1, this.au[var1][var2][var4] - var6, var8 + 1) && this.ce(var7 + 128 - 1, this.au[var1][var2 + 1][var4] - var6, var8 + 1) && this.ce(var7 + 128 - 1, this.au[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.ce(var7 + 1, this.au[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.aa[var1][var7][var8] == -av) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.au[var1][var2][var4] - var6;
         if (!this.ce(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.ce(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.ce(var7, var9, var11)) {
                  return false;
               } else if (!this.ce(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean ce(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < bf; ++var4) {
         Occluder var5 = bq[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.ao * -221071853 == 1) {
            var6 = var5.ab * -1074260583 - var1;
            if (var6 > 0) {
               var7 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var8 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 2) {
            var6 = var1 - var5.ab * -1074260583;
            if (var6 > 0) {
               var7 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var8 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 3) {
            var6 = var5.al * -1443747699 - var3;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 4) {
            var6 = var3 - var5.al * -1443747699;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 5) {
            var6 = var2 - var5.aa * 690846039;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var10 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }
}
