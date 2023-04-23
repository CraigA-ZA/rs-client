public class Scene {
   public static boolean Scene_isLowDetail = true;
   public static int Scene_selectedX = -1;
   public static int Scene_selectedY = -1;
   static boolean bj = false;
   static boolean bx = false;
   static boolean[][] visibleTiles;
   static boolean[][][][] visibilityMap;
   static int Scene_cameraX;
   static int Scene_cameraY;
   static int ag = 0;
   static int Scene_plane = 0;
   static int Scene_cameraYTileMax;
   static int Scene_cameraXTile;
   static int Scene_cameraXTileMax;
   static int Scene_cameraZ;
   static int Scene_cameraXTileMin;
   static int Scene_cameraYTileMin;
   static int Scene_drawnCount;
   static int Scene_cameraYTile;
   static int Scene_cameraPitchCosine;
   static int Scene_cameraYawCosine;
   static int bf;
   static int Scene_cameraYawSine;
   static int Scene_selectedScreenY = 0;
   static int Scene_selectedPlane = 0;
   static int br = 4;
   static int Scene_cameraPitchSine;
   static int Scene_selectedScreenX = 0;
   static int cf;
   static int cg;
   static int cl;
   static int cm;
   static int cr;
   static int cy;
   static int[] Scene_planeOccluderCounts;
   static Occluder[] Scene_currentOccluders;
   static Occluder[][] Scene_planeOccluders;
   static Scenery[] scenery = new Scenery[100];
   static NodeDeque Scene_tilesDeque;
   static final int[] bc;
   static final int[] bh;
   static final int[] bl;
   static final int[] bp;
   static final int[] bv;
   static final int[] bw;
   static final int[] ce;
   int ySize;
   int tempSceneryCount = 0;
   int planes;
   int aq = 0;
   int xSize;
   int[][] ca = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][] cu = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   int[][][] aa;
   int[][][] tileHeights;
   Tile[][][] tiles;
   Scenery[] tempScenery = new Scenery[5000];

   static {
      Scene_planeOccluderCounts = new int[br];
      Scene_planeOccluders = new Occluder[br][500];
      bf = 0;
      Scene_currentOccluders = new Occluder[500];
      Scene_tilesDeque = new NodeDeque();
      bv = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      bl = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      bp = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      bc = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      bh = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      bw = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      ce = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      visibilityMap = new boolean[8][32][51][51];
   }

   public Scene(int var1, int var2, int var3, int[][][] var4) {
      this.planes = var1;
      this.xSize = var2;
      this.ySize = var3;
      this.tiles = new Tile[var1][var2][var3];
      this.aa = new int[var1][var2 + 1][var3 + 1];
      this.tileHeights = var4;
      this.clear();
   }

   public void clear() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.planes; ++var1) {
         for(var2 = 0; var2 < this.xSize; ++var2) {
            for(int var3 = 0; var3 < this.ySize; ++var3) {
               this.tiles[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < br; ++var1) {
         for(var2 = 0; var2 < Scene_planeOccluderCounts[var1]; ++var2) {
            Scene_planeOccluders[var1][var2] = null;
         }

         Scene_planeOccluderCounts[var1] = 0;
      }

      for(var1 = 0; var1 < this.tempSceneryCount; ++var1) {
         this.tempScenery[var1] = null;
      }

      this.tempSceneryCount = 0;

      for(var1 = 0; var1 < scenery.length; ++var1) {
         scenery[var1] = null;
      }

   }

   public void an(int var1) {
      this.aq = var1;

      for(int var2 = 0; var2 < this.xSize; ++var2) {
         for(int var3 = 0; var3 < this.ySize; ++var3) {
            if (this.tiles[var1][var2][var3] == null) {
               this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
            }
         }
      }

   }

   public void aw(int var1, int var2) {
      Tile var3 = this.tiles[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.plane -= -1846949283;

            for(int var6 = 0; var6 < var5.ay * -422028371; ++var6) {
               Scenery var7 = var5.scenery[var6];
               if (eg.an(var7.ax * 5016412888503339625L) && var7.startX * 626811319 == var1 && var7.startY * 2004902003 == var2) {
                  var7.plane -= -1695101227;
               }
            }
         }
      }

      if (this.tiles[0][var1][var2] == null) {
         this.tiles[0][var1][var2] = new Tile(0, var1, var2);
      }

      this.tiles[0][var1][var2].az = var3;
      this.tiles[3][var1][var2] = null;
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
      Scene_planeOccluders[var0][Scene_planeOccluderCounts[var0]++] = var8;
   }

   public void setTileMinPlane(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if (var5 != null) {
         this.tiles[var1][var2][var3].ag = var4 * -2078731195;
      }
   }

   public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      TilePaint var21;
      int var22;
      if (var4 == 0) {
         var21 = new TilePaint(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].au = var21;
      } else if (var4 != 1) {
         TileModel var27 = new TileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].ab = var27;
      } else {
         var21 = new TilePaint(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].au = var21;
      }
   }

   public void newFloorDecoration(int var1, int var2, int var3, int var4, Entity var5, long var6, int var8) {
      if (var5 != null) {
         FloorDecoration var9 = new FloorDecoration();
         var9.entity = var5;
         var9.x = var2 * -1191266432 + -595633216;
         var9.y = var3 * -136012928 + -68006464;
         var9.tileHeight = var4 * -317230161;
         var9.tag = var6 * -4945803534983804595L;
         var9.flags = var8 * 1624352991;
         if (this.tiles[var1][var2][var3] == null) {
            this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
         }

         this.tiles[var1][var2][var3].at = var9;
      }
   }

   public void newObjStack(int var1, int var2, int var3, int var4, Entity var5, long var6, Entity var8, Entity var9) {
      ObjStack var10 = new ObjStack();
      var10.first = var5;
      var10.x = var2 * 1690125440 + 845062720;
      var10.y = var3 * 2013560960 + 1006780480;
      var10.tileHeight = var4 * -1773379811;
      var10.tag = var6 * 1651765281680972561L;
      var10.second = var8;
      var10.third = var9;
      int var11 = 0;
      Tile var12 = this.tiles[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.ay * -422028371; ++var13) {
            if ((var12.scenery[var13].flags * -72925475 & 256) == 256 && var12.scenery[var13].entity instanceof it) {
               it var14 = (it)var12.scenery[var13].entity;
               var14.ai();
               if (var14.height * 1550732737 > var11) {
                  var11 = var14.height * 1550732737;
               }
            }
         }
      }

      var10.height = var11 * -1223694975;
      if (this.tiles[var1][var2][var3] == null) {
         this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
      }

      this.tiles[var1][var2][var3].aa = var10;
   }

   public void newWall(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         Wall var12 = new Wall();
         var12.tag = var9 * -1417919518333993033L;
         var12.flags = var11 * -2009432563;
         var12.x = var2 * -1436186496 + 1429390400;
         var12.y = var3 * 430510720 + 215255360;
         var12.tileHeight = var4 * 1266004207;
         var12.entity1 = var5;
         var12.entity2 = var6;
         var12.orientationA = var7 * 1547196561;
         var12.orientationB = var8 * 185156955;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.tiles[var13][var2][var3] == null) {
               this.tiles[var13][var2][var3] = new Tile(var13, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].aq = var12;
      }
   }

   public void newWallDecoration(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         WallDecoration var14 = new WallDecoration();
         var14.tag = var11 * -5837374244328004387L;
         var14.flags = var13 * -486021893;
         var14.x = var2 * 571975552 + 285987776;
         var14.y = var3 * 1599256960 + 799628480;
         var14.tileHeight = var4 * -33433415;
         var14.entity1 = var5;
         var14.entity2 = var6;
         var14.orientation = var7 * -1230454197;
         var14.int7 = var8 * 1035196391;
         var14.xOffset = var9 * -1372050943;
         var14.yOffset = var10 * -965136487;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.tiles[var15][var2][var3] == null) {
               this.tiles[var15][var2][var3] = new Tile(var15, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].al = var14;
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
            if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) {
               return false;
            }

            Tile var17 = this.tiles[var1][var15][var16];
            if (var17 != null && var17.ay * -422028371 >= 5) {
               return false;
            }
         }
      }

      Scenery var22 = new Scenery();
      var22.ax = var12 * 8415652607842018777L;
      var22.flags = var14 * -287536779;
      var22.plane = var1 * -1695101227;
      var22.centerX = var6 * -299460585;
      var22.centerY = var7 * -521982365;
      var22.height = var8 * 1244562195;
      var22.entity = var9;
      var22.orientation = var10 * -1843325159;
      var22.startX = var2 * 843140103;
      var22.startY = var3 * -700889925;
      var22.endX = (var2 + var4 - 1) * 1300873191;
      var22.endY = (var3 + var5 - 1) * -1083409309;

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
               if (this.tiles[var19][var16][var23] == null) {
                  this.tiles[var19][var16][var23] = new Tile(var19, var16, var23);
               }
            }

            Tile var24 = this.tiles[var1][var16][var23];
            var24.scenery[var24.ay * -422028371] = var22;
            var24.sceneryEdgeMasks[var24.ay * -422028371] = var18;
            var24.ai = (var24.ai * -1639156513 | var18) * -1238612193;
            var24.ay += 1425915941;
         }
      }

      if (var11) {
         this.tempScenery[this.tempSceneryCount++] = var22;
      }

      return true;
   }

   public void ag() {
      for(int var1 = 0; var1 < this.tempSceneryCount; ++var1) {
         Scenery var2 = this.tempScenery[var1];
         this.ah(var2);
         this.tempScenery[var1] = null;
      }

      this.tempSceneryCount = 0;
   }

   void ah(Scenery var1) {
      for(int var2 = var1.startX * 626811319; var2 <= var1.endX * -1242897449; ++var2) {
         for(int var3 = var1.startY * 2004902003; var3 <= var1.endY * -80616117; ++var3) {
            Tile var4 = this.tiles[var1.plane * -872547715][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.ay * -422028371; ++var5) {
                  if (var4.scenery[var5] == var1) {
                     var4.ay -= 1425915941;

                     for(int var6 = var5; var6 < var4.ay * -422028371; ++var6) {
                        var4.scenery[var6] = var4.scenery[var6 + 1];
                        var4.sceneryEdgeMasks[var6] = var4.sceneryEdgeMasks[var6 + 1];
                     }

                     var4.scenery[var4.ay * -422028371] = null;
                     break;
                  }
               }

               var4.ai = 0;

               for(var5 = 0; var5 < var4.ay * -422028371; ++var5) {
                  var4.ai = (var4.ai * -1639156513 | var4.sceneryEdgeMasks[var5]) * -1238612193;
               }
            }
         }
      }

   }

   public void av(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if (var5 != null) {
         WallDecoration var6 = var5.al;
         if (var6 != null) {
            var6.xOffset = var6.xOffset * 1353438721 * var4 / 16 * -1372050943;
            var6.yOffset = var6.yOffset * 1573434537 * var4 / 16 * -965136487;
         }
      }
   }

   public void ar(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.aq = null;
      }
   }

   public void am(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.al = null;
      }
   }

   public void as(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            Scenery var6 = var4.scenery[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.startX * 626811319 == var2 && var6.startY * 2004902003 == var3) {
               this.ah(var6);
               return;
            }
         }

      }
   }

   public void aj(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.at = null;
      }
   }

   public void ak(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.aa = null;
      }
   }

   public Wall az(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null ? null : var4.aq;
   }

   public WallDecoration ad(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null ? null : var4.al;
   }

   public Scenery ae(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            Scenery var6 = var4.scenery[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.startX * 626811319 == var2 && var6.startY * 2004902003 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public FloorDecoration ap(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at : null;
   }

   public long by(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.aq != null ? var4.aq.tag * -4009183385476919801L : 0L;
   }

   public long bb(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.al != null ? var4.al.tag * -4691380879163567243L : 0L;
   }

   public long bi(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            Scenery var6 = var4.scenery[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.startX * 626811319 == var2 && var6.startY * 2004902003 == var3) {
               return var6.ax * 5016412888503339625L;
            }
         }

         return 0L;
      }
   }

   public long be(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at.tag * 3423223696102332293L : 0L;
   }

   public int bk(int var1, int var2, int var3, long var4) {
      Tile var6 = this.tiles[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.aq != null && var6.aq.tag * -4009183385476919801L == var4) {
         return var6.aq.flags * 347144389 & 255;
      } else if (var6.al != null && var6.al.tag * -4691380879163567243L == var4) {
         return var6.al.flags * 35030579 & 255;
      } else if (var6.at != null && var6.at.tag * 3423223696102332293L == var4) {
         return var6.at.flags * -1486089441 & 255;
      } else {
         for(int var7 = 0; var7 < var6.ay * -422028371; ++var7) {
            if (var6.scenery[var7].ax * 5016412888503339625L == var4) {
               return var6.scenery[var7].flags * -72925475 & 255;
            }
         }

         return -1;
      }
   }

   public void bx(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.planes; ++var4) {
         for(int var5 = 0; var5 < this.xSize; ++var5) {
            for(int var6 = 0; var6 < this.ySize; ++var6) {
               Tile var7 = this.tiles[var4][var5][var6];
               if (var7 != null) {
                  Wall var8 = var7.aq;
                  UnlitModel var10;
                  if (var8 != null && var8.entity1 instanceof UnlitModel) {
                     UnlitModel var9 = (UnlitModel)var8.entity1;
                     this.bz(var9, var4, var5, var6, 1, 1);
                     if (var8.entity2 instanceof UnlitModel) {
                        var10 = (UnlitModel)var8.entity2;
                        this.bz(var10, var4, var5, var6, 1, 1);
                        UnlitModel.by(var9, var10, 0, 0, 0, false);
                        var8.entity2 = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                     }

                     var8.entity1 = var9.bb(var9.bo, var9.bz, var1, var2, var3);
                  }

                  for(int var14 = 0; var14 < var7.ay * -422028371; ++var14) {
                     Scenery var16 = var7.scenery[var14];
                     if (var16 != null && var16.entity instanceof UnlitModel) {
                        UnlitModel var11 = (UnlitModel)var16.entity;
                        this.bz(var11, var4, var5, var6, var16.endX * -1242897449 - var16.startX * 626811319 + 1, var16.endY * -80616117 - var16.startY * 2004902003 + 1);
                        var16.entity = var11.bb(var11.bo, var11.bz, var1, var2, var3);
                     }
                  }

                  FloorDecoration var15 = var7.at;
                  if (var15 != null && var15.entity instanceof UnlitModel) {
                     var10 = (UnlitModel)var15.entity;
                     this.bo(var10, var4, var5, var6);
                     var15.entity = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   void bo(UnlitModel var1, int var2, int var3, int var4) {
      Tile var5;
      UnlitModel var6;
      if (var3 < this.xSize) {
         var5 = this.tiles[var2][var3 + 1][var4];
         if (var5 != null && var5.at != null && var5.at.entity instanceof UnlitModel) {
            var6 = (UnlitModel)var5.at.entity;
            UnlitModel.by(var1, var6, 128, 0, 0, true);
         }
      }

      if (var4 < this.xSize) {
         var5 = this.tiles[var2][var3][var4 + 1];
         if (var5 != null && var5.at != null && var5.at.entity instanceof UnlitModel) {
            var6 = (UnlitModel)var5.at.entity;
            UnlitModel.by(var1, var6, 0, 0, 128, true);
         }
      }

      if (var3 < this.xSize && var4 < this.ySize) {
         var5 = this.tiles[var2][var3 + 1][var4 + 1];
         if (var5 != null && var5.at != null && var5.at.entity instanceof UnlitModel) {
            var6 = (UnlitModel)var5.at.entity;
            UnlitModel.by(var1, var6, 128, 0, 128, true);
         }
      }

      if (var3 < this.xSize && var4 > 0) {
         var5 = this.tiles[var2][var3 + 1][var4 - 1];
         if (var5 != null && var5.at != null && var5.at.entity instanceof UnlitModel) {
            var6 = (UnlitModel)var5.at.entity;
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
         if (var12 != this.planes) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.xSize) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        Tile var15 = this.tiles[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = (this.tileHeights[var12][var13][var14] + this.tileHeights[var12][var13 + 1][var14] + this.tileHeights[var12][var13][var14 + 1] + this.tileHeights[var12][var13 + 1][var14 + 1]) / 4 - (this.tileHeights[var2][var3][var4] + this.tileHeights[var2][var3 + 1][var4] + this.tileHeights[var2][var3][var4 + 1] + this.tileHeights[var2][var3 + 1][var4 + 1]) / 4;
                           Wall var17 = var15.aq;
                           if (var17 != null) {
                              UnlitModel var18;
                              if (var17.entity1 instanceof UnlitModel) {
                                 var18 = (UnlitModel)var17.entity1;
                                 UnlitModel.by(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.entity2 instanceof UnlitModel) {
                                 var18 = (UnlitModel)var17.entity2;
                                 UnlitModel.by(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var25 = 0; var25 < var15.ay * -422028371; ++var25) {
                              Scenery var19 = var15.scenery[var25];
                              if (var19 != null && var19.entity instanceof UnlitModel) {
                                 UnlitModel var20 = (UnlitModel)var19.entity;
                                 int var21 = var19.endX * -1242897449 - var19.startX * 626811319 + 1;
                                 int var22 = var19.endY * -80616117 - var19.startY * 2004902003 + 1;
                                 UnlitModel.by(var1, var20, (var19.startX * 626811319 - var3) * 128 + (var21 - var5) * 64, var16, (var19.startY * 2004902003 - var4) * 128 + (var22 - var6) * 64, var7);
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
      Tile var7 = this.tiles[var4][var5][var6];
      if (var7 != null) {
         TilePaint var8 = var7.au;
         int var10;
         if (var8 != null) {
            int var18 = var8.neColor * -2143818661;
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
               var10 = var9.shape;
               int var11 = var9.rotation;
               int var12 = var9.underlayRgb;
               int var13 = var9.overlayRgb;
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
            Scene_cameraPitchSine = in.ac[var6];
            Scene_cameraPitchCosine = in.au[var6];
            Scene_cameraYawSine = in.ac[var7];
            Scene_cameraYawCosine = in.au[var7];
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

                  visibilityMap[var6][var7][var8 + 25][var9 + 25] = var22;
               }
            }
         }
      }

   }

   static boolean bt_renamed(int var0, int var1, int var2) {
      int var3 = var2 * Scene_cameraYawSine + var0 * Scene_cameraYawCosine >> 16;
      int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16;
      int var5 = var1 * Scene_cameraPitchSine + var4 * Scene_cameraPitchCosine >> 16;
      int var6 = var1 * Scene_cameraPitchCosine - var4 * Scene_cameraPitchSine >> 16;
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
         Scene_selectedPlane = var1;
         Scene_selectedScreenX = var2;
         Scene_selectedScreenY = var3;
         Scene_selectedX = -1;
         Scene_selectedY = -1;
      }
   }

   public void bn() {
      bj = true;
   }

   public static boolean bs() {
      return bj && Scene_selectedX != -1;
   }

   public static void br() {
      Scene_selectedX = -1;
      bj = false;
   }

   public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.xSize * 128) {
         var1 = this.xSize * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ySize * 128) {
         var3 = this.ySize * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++Scene_drawnCount;
      Scene_cameraPitchSine = in.ac[var4];
      Scene_cameraPitchCosine = in.au[var4];
      Scene_cameraYawSine = in.ac[var5];
      Scene_cameraYawCosine = in.au[var5];
      visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64];
      Scene_cameraX = var1;
      Scene_cameraY = var2;
      Scene_cameraZ = var3;
      Scene_cameraXTile = var1 / 128;
      Scene_cameraYTile = var3 / 128;
      Scene_plane = var6;
      Scene_cameraXTileMin = Scene_cameraXTile - 25;
      if (Scene_cameraXTileMin < 0) {
         Scene_cameraXTileMin = 0;
      }

      Scene_cameraYTileMin = Scene_cameraYTile - 25;
      if (Scene_cameraYTileMin < 0) {
         Scene_cameraYTileMin = 0;
      }

      Scene_cameraXTileMax = Scene_cameraXTile + 25;
      if (Scene_cameraXTileMax > this.xSize) {
         Scene_cameraXTileMax = this.xSize;
      }

      Scene_cameraYTileMax = Scene_cameraYTile + 25;
      if (Scene_cameraYTileMax > this.ySize) {
         Scene_cameraYTileMax = this.ySize;
      }

      this.bl();
      ag = 0;

      int var7;
      Tile[][] var8;
      int var9;
      int var10;
      for(var7 = this.aq; var7 < this.planes; ++var7) {
         var8 = this.tiles[var7];

         for(var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) {
            for(var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) {
               Tile var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.ag * 65855117 <= var6 && (visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] || this.tileHeights[var7][var9][var10] - var2 >= 2000)) {
                     var11.drawPrimary = true;
                     var11.drawSecondary = true;
                     if (var11.ay * -422028371 > 0) {
                        var11.drawScenery = true;
                     } else {
                        var11.drawScenery = false;
                     }

                     ++ag;
                  } else {
                     var11.drawPrimary = false;
                     var11.drawSecondary = false;
                     var11.drawSceneryEdges = 0;
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
      for(var7 = this.aq; var7 < this.planes; ++var7) {
         var8 = this.tiles[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = Scene_cameraXTile + var9;
            var18 = Scene_cameraXTile - var9;
            if (var10 >= Scene_cameraXTileMin || var18 < Scene_cameraXTileMax) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = Scene_cameraYTile + var12;
                  var14 = Scene_cameraYTile - var12;
                  if (var10 >= Scene_cameraXTileMin) {
                     if (var13 >= Scene_cameraYTileMin) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.drawPrimary) {
                           this.drawTile(var15, true);
                        }
                     }

                     if (var14 < Scene_cameraYTileMax) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.drawPrimary) {
                           this.drawTile(var15, true);
                        }
                     }
                  }

                  if (var18 < Scene_cameraXTileMax) {
                     if (var13 >= Scene_cameraYTileMin) {
                        var15 = var8[var18][var13];
                        if (var15 != null && var15.drawPrimary) {
                           this.drawTile(var15, true);
                        }
                     }

                     if (var14 < Scene_cameraYTileMax) {
                        var15 = var8[var18][var14];
                        if (var15 != null && var15.drawPrimary) {
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

      for(var7 = this.aq; var7 < this.planes; ++var7) {
         var8 = this.tiles[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = Scene_cameraXTile + var9;
            var18 = Scene_cameraXTile - var9;
            if (var10 >= Scene_cameraXTileMin || var18 < Scene_cameraXTileMax) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = Scene_cameraYTile + var12;
                  var14 = Scene_cameraYTile - var12;
                  if (var10 >= Scene_cameraXTileMin) {
                     if (var13 >= Scene_cameraYTileMin) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.drawPrimary) {
                           this.drawTile(var15, false);
                        }
                     }

                     if (var14 < Scene_cameraYTileMax) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.drawPrimary) {
                           this.drawTile(var15, false);
                        }
                     }
                  }

                  if (var18 < Scene_cameraXTileMax) {
                     if (var13 >= Scene_cameraYTileMin) {
                        var15 = var8[var18][var13];
                        if (var15 != null && var15.drawPrimary) {
                           this.drawTile(var15, false);
                        }
                     }

                     if (var14 < Scene_cameraYTileMax) {
                        var15 = var8[var18][var14];
                        if (var15 != null && var15.drawPrimary) {
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
      Scene_tilesDeque.addFirst(var1);

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
                                    var3 = (Tile)Scene_tilesDeque.removeLast();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.drawSecondary);

                                 var4 = var3.x * -464760837;
                                 var5 = var3.y * -1812849043;
                                 var6 = var3.plane * 1527994869;
                                 var7 = var3.originalPlane * 1520539719;
                                 var8 = this.tiles[var6];
                                 if (!var3.drawPrimary) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.tiles[var6 - 1][var4][var5];
                                       if (var9 != null && var9.drawSecondary) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.ai * -1639156513 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.ai * -1639156513 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.ai * -1639156513 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.ai * -1639156513 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.drawPrimary = false;
                                 if (var3.az != null) {
                                    var9 = var3.az;
                                    if (var9.au != null) {
                                       if (!this.bp(0, var4, var5)) {
                                          this.bf(var9.au, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
                                       }
                                    } else if (var9.ab != null && !this.bp(0, var4, var5)) {
                                       this.bq(var9.ab, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
                                    }

                                    var10 = var9.aq;
                                    if (var10 != null) {
                                       var10.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * -1998748175 - Scene_cameraX, var10.tileHeight * 1061912079 - Scene_cameraY, var10.y * -1171883603 - Scene_cameraZ, var10.tag * -4009183385476919801L);
                                    }

                                    for(var11 = 0; var11 < var9.ay * -422028371; ++var11) {
                                       var12 = var9.scenery[var11];
                                       if (var12 != null) {
                                          var12.entity.draw(var12.orientation * -1521986263, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var12.centerX * -1546117209 - Scene_cameraX, var12.height * 1042267931 - Scene_cameraY, var12.centerY * 1463075659 - Scene_cameraZ, var12.ax * 5016412888503339625L);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var3.au != null) {
                                    if (!this.bp(var7, var4, var5)) {
                                       var22 = true;
                                       if (var3.au.seColor * -1667175185 != 12345678 || bx && var6 <= Scene_selectedPlane) {
                                          this.bf(var3.au, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
                                       }
                                    }
                                 } else if (var3.ab != null && !this.bp(var7, var4, var5)) {
                                    var22 = true;
                                    this.bq(var3.ab, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 Wall var23 = var3.aq;
                                 WallDecoration var13 = var3.al;
                                 if (var23 != null || var13 != null) {
                                    if (Scene_cameraXTile == var4) {
                                       ++var21;
                                    } else if (Scene_cameraXTile < var4) {
                                       var21 += 2;
                                    }

                                    if (Scene_cameraYTile == var5) {
                                       var21 += 3;
                                    } else if (Scene_cameraYTile > var5) {
                                       var21 += 6;
                                    }

                                    var11 = bv[var21];
                                    var3.ak = bp[var21] * 1933576483;
                                 }

                                 if (var23 != null) {
                                    if ((var23.orientationA * -137992079 & bl[var21]) != 0) {
                                       if (var23.orientationA * -137992079 == 16) {
                                          var3.drawSceneryEdges = -875132571;
                                          var3.as = bc[var21] * 1761397621;
                                          var3.aj = 520035649 - var3.as * 1049420895;
                                       } else if (var23.orientationA * -137992079 == 32) {
                                          var3.drawSceneryEdges = -1750265142;
                                          var3.as = bh[var21] * 1761397621;
                                          var3.aj = 1040071298 - var3.as * 1049420895;
                                       } else if (var23.orientationA * -137992079 == 64) {
                                          var3.drawSceneryEdges = 794437012;
                                          var3.as = bw[var21] * 1761397621;
                                          var3.aj = 2080142596 - var3.as * 1049420895;
                                       } else {
                                          var3.drawSceneryEdges = 1669569583;
                                          var3.as = ce[var21] * 1761397621;
                                          var3.aj = 1560106947 - var3.as * 1049420895;
                                       }
                                    } else {
                                       var3.drawSceneryEdges = 0;
                                    }

                                    if ((var23.orientationA * -137992079 & var11) != 0 && !this.bc(var7, var4, var5, var23.orientationA * -137992079)) {
                                       var23.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * -1998748175 - Scene_cameraX, var23.tileHeight * 1061912079 - Scene_cameraY, var23.y * -1171883603 - Scene_cameraZ, var23.tag * -4009183385476919801L);
                                    }

                                    if ((var23.orientationB * 379413203 & var11) != 0 && !this.bc(var7, var4, var5, var23.orientationB * 379413203)) {
                                       var23.entity2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * -1998748175 - Scene_cameraX, var23.tileHeight * 1061912079 - Scene_cameraY, var23.y * -1171883603 - Scene_cameraZ, var23.tag * -4009183385476919801L);
                                    }
                                 }

                                 if (var13 != null && !this.bh(var7, var4, var5, var13.entity1.height * 1550732737)) {
                                    if ((var13.orientation * -607881373 & var11) != 0) {
                                       var13.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var13.x * 1346340783 - Scene_cameraX + var13.xOffset * 1353438721, var13.tileHeight * 452898185 - Scene_cameraY, var13.y * 1328351163 - Scene_cameraZ + var13.yOffset * 1573434537, var13.tag * -4691380879163567243L);
                                    } else if (var13.orientation * -607881373 == 256) {
                                       var14 = var13.x * 1346340783 - Scene_cameraX;
                                       var15 = var13.tileHeight * 452898185 - Scene_cameraY;
                                       var16 = var13.y * 1328351163 - Scene_cameraZ;
                                       var17 = var13.int7 * -1711060009;
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
                                          var13.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14 + var13.xOffset * 1353438721, var15, var16 + var13.yOffset * 1573434537, var13.tag * -4691380879163567243L);
                                       } else if (var13.entity2 != null) {
                                          var13.entity2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14, var15, var16, var13.tag * -4691380879163567243L);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    FloorDecoration var27 = var3.at;
                                    if (var27 != null) {
                                       var27.entity.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x * 487195023 - Scene_cameraX, var27.tileHeight * 1777058639 - Scene_cameraY, var27.y * -1480835961 - Scene_cameraZ, var27.tag * 3423223696102332293L);
                                    }

                                    ObjStack var31 = var3.aa;
                                    if (var31 != null && var31.height * -1118938495 == 0) {
                                       if (var31.second != null) {
                                          var31.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * -1473635399 - Scene_cameraX, var31.tileHeight * 2064997173 - Scene_cameraY, var31.y * -1839139071 - Scene_cameraZ, var31.tag * -8562400470617197071L);
                                       }

                                       if (var31.third != null) {
                                          var31.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * -1473635399 - Scene_cameraX, var31.tileHeight * 2064997173 - Scene_cameraY, var31.y * -1839139071 - Scene_cameraZ, var31.tag * -8562400470617197071L);
                                       }

                                       if (var31.first != null) {
                                          var31.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * -1473635399 - Scene_cameraX, var31.tileHeight * 2064997173 - Scene_cameraY, var31.y * -1839139071 - Scene_cameraZ, var31.tag * -8562400470617197071L);
                                       }
                                    }
                                 }

                                 var14 = var3.ai * -1639156513;
                                 if (var14 != 0) {
                                    if (var4 < Scene_cameraXTile && (var14 & 4) != 0) {
                                       var33 = var8[var4 + 1][var5];
                                       if (var33 != null && var33.drawSecondary) {
                                          Scene_tilesDeque.addFirst(var33);
                                       }
                                    }

                                    if (var5 < Scene_cameraYTile && (var14 & 2) != 0) {
                                       var33 = var8[var4][var5 + 1];
                                       if (var33 != null && var33.drawSecondary) {
                                          Scene_tilesDeque.addFirst(var33);
                                       }
                                    }

                                    if (var4 > Scene_cameraXTile && (var14 & 1) != 0) {
                                       var33 = var8[var4 - 1][var5];
                                       if (var33 != null && var33.drawSecondary) {
                                          Scene_tilesDeque.addFirst(var33);
                                       }
                                    }

                                    if (var5 > Scene_cameraYTile && (var14 & 8) != 0) {
                                       var33 = var8[var4][var5 - 1];
                                       if (var33 != null && var33.drawSecondary) {
                                          Scene_tilesDeque.addFirst(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.drawSceneryEdges * 1223983431 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var3.ay * -422028371; ++var21) {
                                    if (var3.scenery[var21].ao * -1033646519 != Scene_drawnCount && (var3.sceneryEdgeMasks[var21] & var3.drawSceneryEdges * 1223983431) == var3.as * -1655477027) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var10 = var3.aq;
                                    if (!this.bc(var7, var4, var5, var10.orientationA * -137992079)) {
                                       var10.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * -1998748175 - Scene_cameraX, var10.tileHeight * 1061912079 - Scene_cameraY, var10.y * -1171883603 - Scene_cameraZ, var10.tag * -4009183385476919801L);
                                    }

                                    var3.drawSceneryEdges = 0;
                                 }
                              }

                              if (!var3.drawScenery) {
                                 break;
                              }

                              try {
                                 int var25 = var3.ay * -422028371;
                                 var3.drawScenery = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var25; ++var11) {
                                    var12 = var3.scenery[var11];
                                    if (var12.ao * -1033646519 != Scene_drawnCount) {
                                       for(var26 = var12.startX * 626811319; var26 <= var12.endX * -1242897449; ++var26) {
                                          for(var14 = var12.startY * 2004902003; var14 <= var12.endY * -80616117; ++var14) {
                                             var33 = var8[var26][var14];
                                             if (var33.drawPrimary) {
                                                var3.drawScenery = true;
                                                continue label563;
                                             }

                                             if (var33.drawSceneryEdges * 1223983431 != 0) {
                                                var16 = 0;
                                                if (var26 > var12.startX * 626811319) {
                                                   ++var16;
                                                }

                                                if (var26 < var12.endX * -1242897449) {
                                                   var16 += 4;
                                                }

                                                if (var14 > var12.startY * 2004902003) {
                                                   var16 += 8;
                                                }

                                                if (var14 < var12.endY * -80616117) {
                                                   var16 += 2;
                                                }

                                                if ((var16 & var33.drawSceneryEdges * 1223983431) == var3.aj * 485316675) {
                                                   var3.drawScenery = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       scenery[var21++] = var12;
                                       var26 = Scene_cameraXTile - var12.startX * 626811319;
                                       var14 = var12.endX * -1242897449 - Scene_cameraXTile;
                                       if (var14 > var26) {
                                          var26 = var14;
                                       }

                                       var15 = Scene_cameraYTile - var12.startY * 2004902003;
                                       var16 = var12.endY * -80616117 - Scene_cameraYTile;
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
                                       Scenery var34 = scenery[var26];
                                       if (var34.ao * -1033646519 != Scene_drawnCount) {
                                          if (var34.ay * 308174317 > var11) {
                                             var11 = var34.ay * 308174317;
                                             var24 = var26;
                                          } else if (var34.ay * 308174317 == var11) {
                                             var15 = var34.centerX * -1546117209 - Scene_cameraX;
                                             var16 = var34.centerY * 1463075659 - Scene_cameraZ;
                                             var17 = scenery[var24].centerX * -1546117209 - Scene_cameraX;
                                             var18 = scenery[var24].centerY * 1463075659 - Scene_cameraZ;
                                             if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    Scenery var35 = scenery[var24];
                                    var35.ao = Scene_drawnCount * -76184583;
                                    if (!this.bw(var7, var35.startX * 626811319, var35.endX * -1242897449, var35.startY * 2004902003, var35.endY * -80616117, var35.entity.height * 1550732737)) {
                                       var35.entity.draw(var35.orientation * -1521986263, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var35.centerX * -1546117209 - Scene_cameraX, var35.height * 1042267931 - Scene_cameraY, var35.centerY * 1463075659 - Scene_cameraZ, var35.ax * 5016412888503339625L);
                                    }

                                    for(var14 = var35.startX * 626811319; var14 <= var35.endX * -1242897449; ++var14) {
                                       for(var15 = var35.startY * 2004902003; var15 <= var35.endY * -80616117; ++var15) {
                                          Tile var36 = var8[var14][var15];
                                          if (var36.drawSceneryEdges * 1223983431 != 0) {
                                             Scene_tilesDeque.addFirst(var36);
                                          } else if ((var14 != var4 || var15 != var5) && var36.drawSecondary) {
                                             Scene_tilesDeque.addFirst(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.drawScenery) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var3.drawScenery = false;
                                 break;
                              }
                           }
                        } while(!var3.drawSecondary);
                     } while(var3.drawSceneryEdges * 1223983431 != 0);

                     if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.drawSecondary);

                  if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.drawSecondary);

               if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.drawSecondary);

            if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.drawSecondary);

         var3.drawSecondary = false;
         --ag;
         ObjStack var29 = var3.aa;
         if (var29 != null && var29.height * -1118938495 != 0) {
            if (var29.second != null) {
               var29.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.x * -1473635399 - Scene_cameraX, var29.tileHeight * 2064997173 - Scene_cameraY - var29.height * -1118938495, var29.y * -1839139071 - Scene_cameraZ, var29.tag * -8562400470617197071L);
            }

            if (var29.third != null) {
               var29.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.x * -1473635399 - Scene_cameraX, var29.tileHeight * 2064997173 - Scene_cameraY - var29.height * -1118938495, var29.y * -1839139071 - Scene_cameraZ, var29.tag * -8562400470617197071L);
            }

            if (var29.first != null) {
               var29.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.x * -1473635399 - Scene_cameraX, var29.tileHeight * 2064997173 - Scene_cameraY - var29.height * -1118938495, var29.y * -1839139071 - Scene_cameraZ, var29.tag * -8562400470617197071L);
            }
         }

         if (var3.ak * -1504022901 != 0) {
            WallDecoration var30 = var3.al;
            if (var30 != null && !this.bh(var7, var4, var5, var30.entity1.height * 1550732737)) {
               if ((var30.orientation * -607881373 & var3.ak * -1504022901) != 0) {
                  var30.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var30.x * 1346340783 - Scene_cameraX + var30.xOffset * 1353438721, var30.tileHeight * 452898185 - Scene_cameraY, var30.y * 1328351163 - Scene_cameraZ + var30.yOffset * 1573434537, var30.tag * -4691380879163567243L);
               } else if (var30.orientation * -607881373 == 256) {
                  var11 = var30.x * 1346340783 - Scene_cameraX;
                  var24 = var30.tileHeight * 452898185 - Scene_cameraY;
                  var26 = var30.y * 1328351163 - Scene_cameraZ;
                  var14 = var30.int7 * -1711060009;
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
                     var30.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var30.xOffset * 1353438721, var24, var26 + var30.yOffset * 1573434537, var30.tag * -4691380879163567243L);
                  } else if (var30.entity2 != null) {
                     var30.entity2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var24, var26, var30.tag * -4691380879163567243L);
                  }
               }
            }

            Wall var28 = var3.aq;
            if (var28 != null) {
               if ((var28.orientationB * 379413203 & var3.ak * -1504022901) != 0 && !this.bc(var7, var4, var5, var28.orientationB * 379413203)) {
                  var28.entity2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var28.x * -1998748175 - Scene_cameraX, var28.tileHeight * 1061912079 - Scene_cameraY, var28.y * -1171883603 - Scene_cameraZ, var28.tag * -4009183385476919801L);
               }

               if ((var28.orientationA * -137992079 & var3.ak * -1504022901) != 0 && !this.bc(var7, var4, var5, var28.orientationA * -137992079)) {
                  var28.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var28.x * -1998748175 - Scene_cameraX, var28.tileHeight * 1061912079 - Scene_cameraY, var28.y * -1171883603 - Scene_cameraZ, var28.tag * -4009183385476919801L);
               }
            }
         }

         Tile var32;
         if (var6 < this.planes - 1) {
            var32 = this.tiles[var6 + 1][var4][var5];
            if (var32 != null && var32.drawSecondary) {
               Scene_tilesDeque.addFirst(var32);
            }
         }

         if (var4 < Scene_cameraXTile) {
            var32 = var8[var4 + 1][var5];
            if (var32 != null && var32.drawSecondary) {
               Scene_tilesDeque.addFirst(var32);
            }
         }

         if (var5 < Scene_cameraYTile) {
            var32 = var8[var4][var5 + 1];
            if (var32 != null && var32.drawSecondary) {
               Scene_tilesDeque.addFirst(var32);
            }
         }

         if (var4 > Scene_cameraXTile) {
            var32 = var8[var4 - 1][var5];
            if (var32 != null && var32.drawSecondary) {
               Scene_tilesDeque.addFirst(var32);
            }
         }

         if (var5 > Scene_cameraYTile) {
            var32 = var8[var4][var5 - 1];
            if (var32 != null && var32.drawSecondary) {
               Scene_tilesDeque.addFirst(var32);
            }
         }
      }
   }

   void bf(TilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - Scene_cameraX;
      int var11;
      int var12 = var11 = (var8 << 7) - Scene_cameraZ;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY;
      int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY;
      int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY;
      int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY;
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

                     if (bx && bv_renamed(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) {
                        Scene_selectedX = var7;
                        Scene_selectedY = var8;
                     }

                     if (var1.nwColor * 412494011 == -1) {
                        if (var1.seColor * -1667175185 != 12345678) {
                           Wall.ah_renamed(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.seColor * -1667175185, var1.texture * 890568309, var1.swColor * 40257399);
                        }
                     } else if (!Scene_isLowDetail) {
                        if (var1.isFlat) {
                           FloorDecoration.am_renamed(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.seColor * -1667175185, var1.texture * 890568309, var1.swColor * 40257399, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.nwColor * 412494011);
                        } else {
                           FloorDecoration.am_renamed(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.seColor * -1667175185, var1.texture * 890568309, var1.swColor * 40257399, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.nwColor * 412494011);
                        }
                     } else {
                        var35 = in.ab.aq.ac(var1.nwColor * 412494011);
                        Wall.ah_renamed(var27, var29, var25, var26, var28, var24, var32, var33, var31, ba_renamed(var35, var1.seColor * -1667175185), ba_renamed(var35, var1.texture * 890568309), ba_renamed(var35, var1.swColor * 40257399));
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     in.ab.af = false;
                     var34 = aq.aa_renamed();
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
                        in.ab.af = true;
                     }

                     if (bx && bv_renamed(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) {
                        Scene_selectedX = var7;
                        Scene_selectedY = var8;
                     }

                     if (var1.nwColor * 412494011 == -1) {
                        if (var1.rgb * 1860851959 != 12345678) {
                           Wall.ah_renamed(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.rgb * 1860851959, var1.swColor * 40257399, var1.texture * 890568309);
                        }
                     } else if (!Scene_isLowDetail) {
                        FloorDecoration.am_renamed(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.rgb * 1860851959, var1.swColor * 40257399, var1.texture * 890568309, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.nwColor * 412494011);
                     } else {
                        var35 = in.ab.aq.ac(var1.nwColor * 412494011);
                        Wall.ah_renamed(var23, var25, var29, var22, var24, var28, var30, var31, var33, ba_renamed(var35, var1.rgb * 1860851959), ba_renamed(var35, var1.swColor * 40257399), ba_renamed(var35, var1.texture * 890568309));
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
         var10 = var1.af[var9] - Scene_cameraX;
         var11 = var1.an[var9] - Scene_cameraY;
         var12 = var1.aw[var9] - Scene_cameraZ;
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

            if (bx && bv_renamed(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) {
               Scene_selectedX = var6;
               Scene_selectedY = var7;
            }

            if (var1.aa != null && var1.aa[var9] != -1) {
               if (!Scene_isLowDetail) {
                  if (var1.isFlat) {
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
      int var1 = Scene_planeOccluderCounts[Scene_plane];
      Occluder[] var2 = Scene_planeOccluders[Scene_plane];
      bf = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         Occluder var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var18;
         if (var4.au * -33717119 == 1) {
            var5 = var4.af * -219522119 - Scene_cameraXTile + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.aw * 1910687837 - Scene_cameraYTile + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.ac * 506177633 - Scene_cameraYTile + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var18 = false;

               while(var6 <= var7) {
                  if (visibleTiles[var5][var6++]) {
                     var18 = true;
                     break;
                  }
               }

               if (var18) {
                  var9 = Scene_cameraX - var4.ab * -1074260583;
                  if (var9 > 32) {
                     var4.ao = 455574555;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.ao = 911149110;
                     var9 = -var9;
                  }

                  var4.ag = (var4.al * -1443747699 - Scene_cameraZ << 8) / var9 * -220034745;
                  var4.ah = (var4.at * 1383802843 - Scene_cameraZ << 8) / var9 * -1665480987;
                  var4.av = (var4.aa * 690846039 - Scene_cameraY << 8) / var9 * -1186198099;
                  var4.ar = (var4.ay * 1879954201 - Scene_cameraY << 8) / var9 * 628709121;
                  Scene_currentOccluders[bf++] = var4;
               }
            }
         } else if (var4.au * -33717119 == 2) {
            var5 = var4.aw * 1910687837 - Scene_cameraYTile + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.af * -219522119 - Scene_cameraXTile + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.an * -1873370011 - Scene_cameraXTile + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var18 = false;

               while(var6 <= var7) {
                  if (visibleTiles[var6++][var5]) {
                     var18 = true;
                     break;
                  }
               }

               if (var18) {
                  var9 = Scene_cameraZ - var4.al * -1443747699;
                  if (var9 > 32) {
                     var4.ao = 1366723665;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.ao = 1822298220;
                     var9 = -var9;
                  }

                  var4.ax = (var4.ab * -1074260583 - Scene_cameraX << 8) / var9 * -1619986937;
                  var4.ai = (var4.aq * -875468987 - Scene_cameraX << 8) / var9 * 528722083;
                  var4.av = (var4.aa * 690846039 - Scene_cameraY << 8) / var9 * -1186198099;
                  var4.ar = (var4.ay * 1879954201 - Scene_cameraY << 8) / var9 * 628709121;
                  Scene_currentOccluders[bf++] = var4;
               }
            }
         } else if (var4.au * -33717119 == 4) {
            var5 = var4.aa * 690846039 - Scene_cameraY;
            if (var5 > 128) {
               var6 = var4.aw * 1910687837 - Scene_cameraYTile + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.ac * 506177633 - Scene_cameraYTile + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var8 = var4.af * -219522119 - Scene_cameraXTile + 25;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.an * -1873370011 - Scene_cameraXTile + 25;
                  if (var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label194:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (visibleTiles[var11][var12]) {
                           var10 = true;
                           break label194;
                        }
                     }
                  }

                  if (var10) {
                     var4.ao = -2017094521;
                     var4.ax = (var4.ab * -1074260583 - Scene_cameraX << 8) / var5 * -1619986937;
                     var4.ai = (var4.aq * -875468987 - Scene_cameraX << 8) / var5 * 528722083;
                     var4.ag = (var4.al * -1443747699 - Scene_cameraZ << 8) / var5 * -220034745;
                     var4.ah = (var4.at * 1383802843 - Scene_cameraZ << 8) / var5 * -1665480987;
                     Scene_currentOccluders[bf++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean bp(int var1, int var2, int var3) {
      int var4 = this.aa[var1][var2][var3];
      if (var4 == -Scene_drawnCount) {
         return false;
      } else if (var4 == Scene_drawnCount) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.ce(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.ce(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.aa[var1][var2][var3] = Scene_drawnCount;
            return true;
         } else {
            this.aa[var1][var2][var3] = -Scene_drawnCount;
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
         int var7 = this.tileHeights[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > Scene_cameraX) {
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
               if (var6 < Scene_cameraZ) {
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
               if (var5 < Scene_cameraX) {
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
               if (var6 > Scene_cameraZ) {
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
         return this.ce(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.ce(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.ce(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.ce(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
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
            return this.ce(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.ce(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.ce(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.ce(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.aa[var1][var7][var8] == -Scene_drawnCount) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.tileHeights[var1][var2][var4] - var6;
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
         Occluder var5 = Scene_currentOccluders[var4];
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
