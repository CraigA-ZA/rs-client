public class gh extends gn {
   String af;
   // $FF: synthetic field
   final gy this$0;

   public static void aq_renamed() {
      ParamType.an.clear();
   }

   public static Component an_renamed(int var0) {
      int var2 = var0 >> 16;
      int var3 = var0 & '\uffff';
      if (hn.ap[var2] == null || hn.ap[var2][var3] == null) {
         boolean var4 = SoundSystem.loadInterface(var2);
         if (!var4) {
            return null;
         }
      }

      return hn.ap[var2][var3];
   }

   gh(gy var1, String var2, String var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.af = var3;
   }

   public int af() {
      return 1;
   }

   public String an() {
      return this.af;
   }

   static final void ak_renamed(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap var9) {
      hq var11 = fw.an_renamed(var4);
      int var12 = var7 >= 0 ? var7 : 1292954189 * var11.ae;
      int var13;
      int var14;
      if (var5 != 1 && var5 != 3) {
         var13 = var11.av * -1339930361;
         var14 = var11.ar * -1659393955;
      } else {
         var13 = var11.ar * -1659393955;
         var14 = var11.av * -1339930361;
      }

      int var15;
      int var16;
      if (var2 + var13 <= 104) {
         var15 = (var13 >> 1) + var2;
         var16 = (1 + var13 >> 1) + var2;
      } else {
         var15 = var2;
         var16 = var2 + 1;
      }

      int var17;
      int var18;
      if (var3 + var14 <= 104) {
         var17 = (var14 >> 1) + var3;
         var18 = var3 + (var14 + 1 >> 1);
      } else {
         var17 = var3;
         var18 = 1 + var3;
      }

      int[][] var19 = Tiles.af[var1];
      int var20 = var19[var15][var17] + var19[var16][var17] + var19[var15][var18] + var19[var16][var18] >> 2;
      int var21 = (var2 << 7) + (var13 << 6);
      int var22 = (var14 << 6) + (var3 << 7);
      long var23 = ir.aa_renamed(var2, var3, 2, 0 == 415653149 * var11.aj, var4);
      int var25 = (var5 << 6) + var6;
      if (1 == -1850643527 * var11.bg) {
         var25 += 256;
      }

      Object var26;
      if (var6 == 22) {
         if (-1 == var12 && null == var11.bu) {
            var26 = var11.at(22, var5, var19, var21, var20, var22);
         } else {
            var26 = new DynamicObject(var4, 22, var5, var1, var2, var3, var12, var11.bh, (Entity)null);
         }

         var8.newFloorDecoration(var0, var2, var3, var20, (Entity)var26, var23, var25);
         if (var11.am * -973955889 == 1) {
            var9.au(var2, var3);
         }

      } else if (var6 != 10 && var6 != 11) {
         if (var6 >= 12) {
            if (-1 == var12 && null == var11.bu) {
               var26 = var11.at(var6, var5, var19, var21, var20, var22);
            } else {
               var26 = new DynamicObject(var4, var6, var5, var1, var2, var3, var12, var11.bh, (Entity)null);
            }

            var8.ay(var0, var2, var3, var20, 1, 1, (Entity)var26, 0, var23, var25);
            if (var11.am * -973955889 != 0) {
               var9.aw(var2, var3, var13, var14, var11.as);
            }

         } else if (var6 == 0) {
            if (-1 == var12 && var11.bu == null) {
               var26 = var11.at(0, var5, var19, var21, var20, var22);
            } else {
               var26 = new DynamicObject(var4, 0, var5, var1, var2, var3, var12, var11.bh, (Entity)null);
            }

            var8.newWall(var0, var2, var3, var20, (Entity)var26, (Entity)null, Tiles.am[var5], 0, var23, var25);
            if (-973955889 * var11.am != 0) {
               var9.an(var2, var3, var6, var5, var11.as);
            }

         } else if (1 == var6) {
            if (-1 == var12 && var11.bu == null) {
               var26 = var11.at(1, var5, var19, var21, var20, var22);
            } else {
               var26 = new DynamicObject(var4, 1, var5, var1, var2, var3, var12, var11.bh, (Entity)null);
            }

            var8.newWall(var0, var2, var3, var20, (Entity)var26, (Entity)null, Tiles.as[var5], 0, var23, var25);
            if (0 != -973955889 * var11.am) {
               var9.an(var2, var3, var6, var5, var11.as);
            }

         } else {
            int var32;
            if (2 == var6) {
               var32 = 1 + var5 & 3;
               Object var28;
               Object var34;
               if (var12 == -1 && var11.bu == null) {
                  var34 = var11.at(2, 4 + var5, var19, var21, var20, var22);
                  var28 = var11.at(2, var32, var19, var21, var20, var22);
               } else {
                  var34 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var12, var11.bh, (Entity)null);
                  var28 = new DynamicObject(var4, 2, var32, var1, var2, var3, var12, var11.bh, (Entity)null);
               }

               var8.newWall(var0, var2, var3, var20, (Entity)var34, (Entity)var28, Tiles.am[var5], Tiles.am[var32], var23, var25);
               if (-973955889 * var11.am != 0) {
                  var9.an(var2, var3, var6, var5, var11.as);
               }

            } else if (var6 == 3) {
               if (var12 == -1 && null == var11.bu) {
                  var26 = var11.at(3, var5, var19, var21, var20, var22);
               } else {
                  var26 = new DynamicObject(var4, 3, var5, var1, var2, var3, var12, var11.bh, (Entity)null);
               }

               var8.newWall(var0, var2, var3, var20, (Entity)var26, (Entity)null, Tiles.as[var5], 0, var23, var25);
               if (-973955889 * var11.am != 0) {
                  var9.an(var2, var3, var6, var5, var11.as);
               }

            } else if (var6 == 9) {
               if (var12 == -1 && var11.bu == null) {
                  var26 = var11.at(var6, var5, var19, var21, var20, var22);
               } else {
                  var26 = new DynamicObject(var4, var6, var5, var1, var2, var3, var12, var11.bh, (Entity)null);
               }

               var8.ay(var0, var2, var3, var20, 1, 1, (Entity)var26, 0, var23, var25);
               if (-973955889 * var11.am != 0) {
                  var9.aw(var2, var3, var13, var14, var11.as);
               }

            } else if (4 == var6) {
               if (-1 == var12 && null == var11.bu) {
                  var26 = var11.at(4, var5, var19, var21, var20, var22);
               } else {
                  var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var12, var11.bh, (Entity)null);
               }

               var8.newWallDecoration(var0, var2, var3, var20, (Entity)var26, (Entity)null, Tiles.am[var5], 0, 0, 0, var23, var25);
            } else {
               long var27;
               Object var29;
               if (5 == var6) {
                  var32 = 16;
                  var27 = var8.by(var0, var2, var3);
                  if (var27 != 0L) {
                     var32 = fw.an_renamed(InterfaceParent.at(var27)).ap * -89408815;
                  }

                  if (-1 == var12 && var11.bu == null) {
                     var29 = var11.at(4, var5, var19, var21, var20, var22);
                  } else {
                     var29 = new DynamicObject(var4, 4, var5, var1, var2, var3, var12, var11.bh, (Entity)null);
                  }

                  var8.newWallDecoration(var0, var2, var3, var20, (Entity)var29, (Entity)null, Tiles.am[var5], 0, Tiles.aj[var5] * var32, Tiles.ak[var5] * var32, var23, var25);
               } else if (var6 == 6) {
                  var32 = 8;
                  var27 = var8.by(var0, var2, var3);
                  if (0L != var27) {
                     var32 = fw.an_renamed(InterfaceParent.at(var27)).ap * -89408815 / 2;
                  }

                  if (var12 == -1 && var11.bu == null) {
                     var29 = var11.at(4, 4 + var5, var19, var21, var20, var22);
                  } else {
                     var29 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var12, var11.bh, (Entity)null);
                  }

                  var8.newWallDecoration(var0, var2, var3, var20, (Entity)var29, (Entity)null, 256, var5, Tiles.az[var5] * var32, var32 * Tiles.ad[var5], var23, var25);
               } else if (var6 == 7) {
                  int var33 = var5 + 2 & 3;
                  if (var12 == -1 && var11.bu == null) {
                     var26 = var11.at(4, 4 + var33, var19, var21, var20, var22);
                  } else {
                     var26 = new DynamicObject(var4, 4, 4 + var33, var1, var2, var3, var12, var11.bh, (Entity)null);
                  }

                  var8.newWallDecoration(var0, var2, var3, var20, (Entity)var26, (Entity)null, 256, var33, 0, 0, var23, var25);
               } else if (8 == var6) {
                  var32 = 8;
                  var27 = var8.by(var0, var2, var3);
                  if (0L != var27) {
                     var32 = fw.an_renamed(InterfaceParent.at(var27)).ap * -89408815 / 2;
                  }

                  int var31 = var5 + 2 & 3;
                  Object var30;
                  if (-1 == var12 && var11.bu == null) {
                     var29 = var11.at(4, 4 + var5, var19, var21, var20, var22);
                     var30 = var11.at(4, 4 + var31, var19, var21, var20, var22);
                  } else {
                     var29 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var12, var11.bh, (Entity)null);
                     var30 = new DynamicObject(var4, 4, 4 + var31, var1, var2, var3, var12, var11.bh, (Entity)null);
                  }

                  var8.newWallDecoration(var0, var2, var3, var20, (Entity)var29, (Entity)var30, 256, var5, var32 * Tiles.az[var5], var32 * Tiles.ad[var5], var23, var25);
               }
            }
         }
      } else {
         if (var12 == -1 && var11.bu == null) {
            var26 = var11.at(10, var5, var19, var21, var20, var22);
         } else {
            var26 = new DynamicObject(var4, 10, var5, var1, var2, var3, var12, var11.bh, (Entity)null);
         }

         if (null != var26) {
            var8.ay(var0, var2, var3, var20, var13, var14, (Entity)var26, 11 == var6 ? 256 : 0, var23, var25);
         }

         if (0 != var11.am * -973955889) {
            var9.aw(var2, var3, var13, var14, var11.as);
         }

      }
   }
}
