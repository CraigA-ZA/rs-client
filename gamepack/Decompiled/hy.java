import java.util.Arrays;

public class hy implements be {
   boolean[] aa = new boolean[112];
   boolean[] ao = new boolean[112];
   boolean[] ay = new boolean[112];
   char[] af = new char[128];
   int ab = 0;
   int al = 0;
   int aq = 0;
   int at = 0;
   int[] an = new int[128];
   int[] au = new int[128];
   public char ax;
   public int ac = 0;
   public int ai;
   public int[] aw = new int[128];

   public boolean af(int var1) {
      this.ax(var1);
      this.aa[var1] = true;
      this.ay[var1] = true;
      this.ao[var1] = false;
      this.aw[(this.ac += -1818927653) * 1888573011 - 1] = var1;
      return true;
   }

   public boolean an(int var1) {
      this.aa[var1] = false;
      this.ay[var1] = false;
      this.ao[var1] = true;
      this.au[(this.ab += -971798147) * 2082731989 - 1] = var1;
      return true;
   }

   public boolean aw(char var1) {
      int var3 = 1 + this.al * -1384260729 & 127;
      if (var3 != this.aq * 73809669) {
         this.an[-1384260729 * this.al] = -1;
         this.af[-1384260729 * this.al] = var1;
         this.al = -1899169225 * var3;
      }

      return false;
   }

   void ax(int var1) {
      int var3 = -1384260729 * this.al + 1 & 127;
      if (var3 != 73809669 * this.aq) {
         this.an[this.al * -1384260729] = var1;
         this.af[-1384260729 * this.al] = 0;
         this.al = var3 * -1899169225;
      }

   }

   public boolean ac(boolean var1) {
      return false;
   }

   public void ai() {
      this.aq = this.at * -1092387907;
      this.at = this.al * -206073161;
      this.ac = 0;
      this.ab = 0;
      Arrays.fill(this.ay, false);
      Arrays.fill(this.ao, false);
   }

   public final boolean ag() {
      if (-147657295 * this.at == this.aq * 73809669) {
         return false;
      } else {
         this.ai = -2050262723 * this.an[73809669 * this.aq];
         this.ax = this.af[73809669 * this.aq];
         this.aq = -1675774515 * (1 + 73809669 * this.aq & 127);
         return true;
      }
   }

   public boolean ah(int var1) {
      return var1 >= 0 && var1 < 112 ? this.ay[var1] : false;
   }

   public boolean av(int var1) {
      return var1 >= 0 && var1 < 112 ? this.aa[var1] : false;
   }

   public boolean ar(int var1) {
      return var1 >= 0 && var1 < 112 ? this.ao[var1] : false;
   }

   public int[] am() {
      int[] var2 = new int[this.ac * 1888573011];

      for(int var3 = 0; var3 < 1888573011 * this.ac; ++var3) {
         var2[var3] = this.aw[var3];
      }

      return var2;
   }

   public int[] as() {
      int[] var2 = new int[2082731989 * this.ab];

      for(int var3 = 0; var3 < this.ab * 2082731989; ++var3) {
         var2[var3] = this.au[var3];
      }

      return var2;
   }

   static final void PcmStream_disable(PcmStream var0) {
      var0.active = false;
      if (null != var0.sound) {
         var0.sound.position = 0;
      }

      for(PcmStream var2 = var0.firstSubStream(); var2 != null; var2 = var0.nextSubStream()) {
         PcmStream_disable(var2);
      }

   }

   static final void ay_renamed(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
      if (!Client.cu || 0 != (Tiles.Tiles_renderFlags[0][var1][var2] & 2) || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
         if (var0 < 1401144457 * Tiles.aw) {
            Tiles.aw = -1087180359 * var0;
         }

         hq var9 = fw.an_renamed(var3);
         int var10;
         int var11;
         if (var4 != 1 && var4 != 3) {
            var10 = var9.av * -1339930361;
            var11 = -1659393955 * var9.ar;
         } else {
            var10 = -1659393955 * var9.ar;
            var11 = -1339930361 * var9.av;
         }

         int var12;
         int var13;
         if (var1 + var10 <= 104) {
            var12 = var1 + (var10 >> 1);
            var13 = (1 + var10 >> 1) + var1;
         } else {
            var12 = var1;
            var13 = 1 + var1;
         }

         int var14;
         int var15;
         if (var11 + var2 <= 104) {
            var14 = var2 + (var11 >> 1);
            var15 = (1 + var11 >> 1) + var2;
         } else {
            var14 = var2;
            var15 = 1 + var2;
         }

         int[][] var16 = Tiles.Tiles_heights[var0];
         int var17 = var16[var13][var15] + var16[var12][var15] + var16[var12][var14] + var16[var13][var14] >> 2;
         int var18 = (var10 << 6) + (var1 << 7);
         int var19 = (var2 << 7) + (var11 << 6);
         long var20 = ir.aa_renamed(var1, var2, 2, 0 == 415653149 * var9.aj, var3);
         int var22 = var5 + (var4 << 6);
         if (-1850643527 * var9.bg == 1) {
            var22 += 256;
         }

         if (var9.ah()) {
            GameShell.ac_renamed(var0, var1, var2, var9, var4);
         }

         Object var23;
         if (22 == var5) {
            if (!Client.cu || 0 != var9.aj * 415653149 || 1 == var9.am * -973955889 || var9.bs) {
               if (-1 == 1292954189 * var9.ae && null == var9.bu) {
                  var23 = var9.al(22, var4, var16, var18, var17, var19, (byte)-65);
               } else {
                  var23 = new DynamicObject(var3, 22, var4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (Entity)null);
               }

               var6.newFloorDecoration(var0, var1, var2, var17, (Entity)var23, var20, var22);
               if (var9.am * -973955889 == 1 && var7 != null) {
                  var7.au(var1, var2);
               }

            }
         } else {
            int var24;
            if (10 != var5 && var5 != 11) {
               int[] var10000;
               if (var5 >= 12) {
                  if (var9.ae * 1292954189 == -1 && null == var9.bu) {
                     var23 = var9.al(var5, var4, var16, var18, var17, var19, (byte)-110);
                  } else {
                     var23 = new DynamicObject(var3, var5, var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (Entity)null);
                  }

                  var6.ay(var0, var1, var2, var17, 1, 1, (Entity)var23, 0, var20, var22);
                  if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     var10000 = ge.ag[var0][var1];
                     var10000[var2] |= 2340;
                  }

                  if (0 != var9.am * -973955889 && null != var7) {
                     var7.aw(var1, var2, var10, var11, var9.as);
                  }

               } else if (var5 == 0) {
                  if (-1 == var9.ae * 1292954189 && var9.bu == null) {
                     var23 = var9.al(0, var4, var16, var18, var17, var19, (byte)-17);
                  } else {
                     var23 = new DynamicObject(var3, 0, var4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (Entity)null);
                  }

                  var6.newWall(var0, var1, var2, var17, (Entity)var23, (Entity)null, Tiles.am[var4], 0, var20, var22);
                  if (0 == var4) {
                     if (var9.bo) {
                        Tiles.al[var0][var1][var2] = 50;
                        Tiles.al[var0][var1][var2 + 1] = 50;
                     }

                     if (var9.ad) {
                        var10000 = ge.ag[var0][var1];
                        var10000[var2] |= 585;
                     }
                  } else if (1 == var4) {
                     if (var9.bo) {
                        Tiles.al[var0][var1][1 + var2] = 50;
                        Tiles.al[var0][var1 + 1][1 + var2] = 50;
                     }

                     if (var9.ad) {
                        var10000 = ge.ag[var0][var1];
                        var10000[1 + var2] |= 1170;
                     }
                  } else if (2 == var4) {
                     if (var9.bo) {
                        Tiles.al[var0][1 + var1][var2] = 50;
                        Tiles.al[var0][1 + var1][1 + var2] = 50;
                     }

                     if (var9.ad) {
                        var10000 = ge.ag[var0][1 + var1];
                        var10000[var2] |= 585;
                     }
                  } else if (3 == var4) {
                     if (var9.bo) {
                        Tiles.al[var0][var1][var2] = 50;
                        Tiles.al[var0][var1 + 1][var2] = 50;
                     }

                     if (var9.ad) {
                        var10000 = ge.ag[var0][var1];
                        var10000[var2] |= 1170;
                     }
                  }

                  if (var9.am * -973955889 != 0 && null != var7) {
                     var7.an(var1, var2, var5, var4, var9.as);
                  }

                  if (16 != -89408815 * var9.ap) {
                     var6.av(var0, var1, var2, -89408815 * var9.ap);
                  }

               } else if (var5 == 1) {
                  if (1292954189 * var9.ae == -1 && var9.bu == null) {
                     var23 = var9.al(1, var4, var16, var18, var17, var19, (byte)-60);
                  } else {
                     var23 = new DynamicObject(var3, 1, var4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (Entity)null);
                  }

                  var6.newWall(var0, var1, var2, var17, (Entity)var23, (Entity)null, Tiles.as[var4], 0, var20, var22);
                  if (var9.bo) {
                     if (var4 == 0) {
                        Tiles.al[var0][var1][var2 + 1] = 50;
                     } else if (1 == var4) {
                        Tiles.al[var0][var1 + 1][1 + var2] = 50;
                     } else if (2 == var4) {
                        Tiles.al[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        Tiles.al[var0][var1][var2] = 50;
                     }
                  }

                  if (-973955889 * var9.am != 0 && var7 != null) {
                     var7.an(var1, var2, var5, var4, var9.as);
                  }

               } else {
                  int var29;
                  if (var5 == 2) {
                     var29 = 1 + var4 & 3;
                     Object var31;
                     Object var32;
                     if (1292954189 * var9.ae == -1 && null == var9.bu) {
                        var32 = var9.al(2, var4 + 4, var16, var18, var17, var19, (byte)-33);
                        var31 = var9.al(2, var29, var16, var18, var17, var19, (byte)-89);
                     } else {
                        var32 = new DynamicObject(var3, 2, 4 + var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (Entity)null);
                        var31 = new DynamicObject(var3, 2, var29, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (Entity)null);
                     }

                     var6.newWall(var0, var1, var2, var17, (Entity)var32, (Entity)var31, Tiles.am[var4], Tiles.am[var29], var20, var22);
                     if (var9.ad) {
                        if (var4 == 0) {
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 585;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2 + 1] |= 1170;
                        } else if (1 == var4) {
                           var10000 = ge.ag[var0][var1];
                           var10000[1 + var2] |= 1170;
                           var10000 = ge.ag[var0][1 + var1];
                           var10000[var2] |= 585;
                        } else if (var4 == 2) {
                           var10000 = ge.ag[var0][var1 + 1];
                           var10000[var2] |= 585;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 1170;
                        } else if (var4 == 3) {
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 1170;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 585;
                        }
                     }

                     if (var9.am * -973955889 != 0 && null != var7) {
                        var7.an(var1, var2, var5, var4, var9.as);
                     }

                     if (16 != var9.ap * -89408815) {
                        var6.av(var0, var1, var2, var9.ap * -89408815);
                     }

                  } else if (var5 == 3) {
                     if (-1 == 1292954189 * var9.ae && var9.bu == null) {
                        var23 = var9.al(3, var4, var16, var18, var17, var19, (byte)-78);
                     } else {
                        var23 = new DynamicObject(var3, 3, var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (Entity)null);
                     }

                     var6.newWall(var0, var1, var2, var17, (Entity)var23, (Entity)null, Tiles.as[var4], 0, var20, var22);
                     if (var9.bo) {
                        if (0 == var4) {
                           Tiles.al[var0][var1][1 + var2] = 50;
                        } else if (1 == var4) {
                           Tiles.al[var0][var1 + 1][var2 + 1] = 50;
                        } else if (2 == var4) {
                           Tiles.al[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           Tiles.al[var0][var1][var2] = 50;
                        }
                     }

                     if (0 != var9.am * -973955889 && null != var7) {
                        var7.an(var1, var2, var5, var4, var9.as);
                     }

                  } else if (9 == var5) {
                     if (-1 == var9.ae * 1292954189 && var9.bu == null) {
                        var23 = var9.al(var5, var4, var16, var18, var17, var19, (byte)-96);
                     } else {
                        var23 = new DynamicObject(var3, var5, var4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (Entity)null);
                     }

                     var6.ay(var0, var1, var2, var17, 1, 1, (Entity)var23, 0, var20, var22);
                     if (var9.am * -973955889 != 0 && var7 != null) {
                        var7.aw(var1, var2, var10, var11, var9.as);
                     }

                     if (-89408815 * var9.ap != 16) {
                        var6.av(var0, var1, var2, -89408815 * var9.ap);
                     }

                  } else if (var5 == 4) {
                     if (1292954189 * var9.ae == -1 && null == var9.bu) {
                        var23 = var9.al(4, var4, var16, var18, var17, var19, (byte)-85);
                     } else {
                        var23 = new DynamicObject(var3, 4, var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (Entity)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var17, (Entity)var23, (Entity)null, Tiles.am[var4], 0, 0, 0, var20, var22);
                  } else {
                     long var30;
                     Object var33;
                     if (5 == var5) {
                        var29 = 16;
                        var30 = var6.by(var0, var1, var2);
                        if (0L != var30) {
                           var29 = fw.an_renamed(InterfaceParent.at(var30)).ap * -89408815;
                        }

                        if (var9.ae * 1292954189 == -1 && null == var9.bu) {
                           var33 = var9.al(4, var4, var16, var18, var17, var19, (byte)-90);
                        } else {
                           var33 = new DynamicObject(var3, 4, var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (Entity)null);
                        }

                        var6.newWallDecoration(var0, var1, var2, var17, (Entity)var33, (Entity)null, Tiles.am[var4], 0, Tiles.aj[var4] * var29, var29 * Tiles.ak[var4], var20, var22);
                     } else if (var5 == 6) {
                        var29 = 8;
                        var30 = var6.by(var0, var1, var2);
                        if (0L != var30) {
                           var29 = fw.an_renamed(InterfaceParent.at(var30)).ap * -89408815 / 2;
                        }

                        if (-1 == 1292954189 * var9.ae && null == var9.bu) {
                           var33 = var9.al(4, 4 + var4, var16, var18, var17, var19, (byte)-95);
                        } else {
                           var33 = new DynamicObject(var3, 4, 4 + var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (Entity)null);
                        }

                        var6.newWallDecoration(var0, var1, var2, var17, (Entity)var33, (Entity)null, 256, var4, Tiles.az[var4] * var29, var29 * Tiles.ad[var4], var20, var22);
                     } else if (var5 == 7) {
                        var24 = 2 + var4 & 3;
                        if (var9.ae * 1292954189 == -1 && var9.bu == null) {
                           var23 = var9.al(4, 4 + var24, var16, var18, var17, var19, (byte)-87);
                        } else {
                           var23 = new DynamicObject(var3, 4, var24 + 4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (Entity)null);
                        }

                        var6.newWallDecoration(var0, var1, var2, var17, (Entity)var23, (Entity)null, 256, var24, 0, 0, var20, var22);
                     } else if (8 == var5) {
                        var29 = 8;
                        var30 = var6.by(var0, var1, var2);
                        if (0L != var30) {
                           var29 = fw.an_renamed(InterfaceParent.at(var30)).ap * -89408815 / 2;
                        }

                        int var28 = 2 + var4 & 3;
                        Object var27;
                        if (var9.ae * 1292954189 == -1 && null == var9.bu) {
                           var33 = var9.al(4, var4 + 4, var16, var18, var17, var19, (byte)-28);
                           var27 = var9.al(4, 4 + var28, var16, var18, var17, var19, (byte)-104);
                        } else {
                           var33 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (Entity)null);
                           var27 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (Entity)null);
                        }

                        var6.newWallDecoration(var0, var1, var2, var17, (Entity)var33, (Entity)var27, 256, var4, Tiles.az[var4] * var29, var29 * Tiles.ad[var4], var20, var22);
                     }
                  }
               }
            } else {
               if (-1 == var9.ae * 1292954189 && var9.bu == null) {
                  var23 = var9.al(10, var4, var16, var18, var17, var19, (byte)-73);
               } else {
                  var23 = new DynamicObject(var3, 10, var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (Entity)null);
               }

               if (null != var23 && var6.ay(var0, var1, var2, var17, var10, var11, (Entity)var23, 11 == var5 ? 256 : 0, var20, var22) && var9.bo) {
                  var24 = 15;
                  if (var23 instanceof it) {
                     var24 = ((it)var23).transformedSize() / 4;
                     if (var24 > 30) {
                        var24 = 30;
                     }
                  }

                  for(int var25 = 0; var25 <= var10; ++var25) {
                     for(int var26 = 0; var26 <= var11; ++var26) {
                        if (var24 > Tiles.al[var0][var1 + var25][var2 + var26]) {
                           Tiles.al[var0][var1 + var25][var26 + var2] = (byte)var24;
                        }
                     }
                  }
               }

               if (0 != var9.am * -973955889 && var7 != null) {
                  var7.aw(var1, var2, var10, var11, var9.as);
               }

            }
         }
      }
   }

   static final void in_renamed() {
      int var1 = -2010934433 * ds.ab;
      int[] var2 = ds.aq;

      for(int var3 = 0; var3 < var1; ++var3) {
         Player var4 = Client.players[var2[var3]];
         if (var4 != null) {
            ReflectionCheck.ii_renamed(var4, 1);
         }
      }

   }
}
