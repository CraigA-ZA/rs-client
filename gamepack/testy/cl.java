import accessors.RSWorld;

public class cl implements RSWorld {
   public static final int di = 104;
   static final int an = 2;
   static int ab = 0;
   static int[] al = new int[]{1, 1, 1, 1};
   static int[] at = new int[]{0, 1, 2, 3};
   public static final float aa = 9925.0F;
   static final int au = 100;
   int ao;
   int ax;
   String ai;
   String ag;
   int ah;
   int ay;
   static tc[] dt;
   public static cg vt;
   int av;
   static int aq = 0;
   static final int af = 3;

   boolean bu() {
      return (-1536767308 & this.ao * 1810954985) != 0;
   }

   boolean at(int var1) {
      try {
         boolean var10000;
         if (0 != (1 & 1810954985 * this.ao)) {
            if (var1 != 1029039210) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cl.at(" + ')');
      }
   }

   boolean aa(int var1) {
      try {
         boolean var10000;
         if ((65536 & this.ao * 1810954985) != 0) {
            if (var1 == 1213720291) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cl.aa(" + ')');
      }
   }

   boolean cq() {
      return 0 != (1073741824 & 1810954985 * this.ao);
   }

   boolean ao(int var1) {
      try {
         boolean var10000;
         if (0 != (4 & 1810954985 * this.ao)) {
            if (var1 <= -62347789) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cl.ao(" + ')');
      }
   }

   boolean ax(byte var1) {
      try {
         boolean var10000;
         if (0 != (8 & this.ao * 1810954985)) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cl.ax(" + ')');
      }
   }

   static cl bt() {
      return 285408389 * aq < ab * -734287707 ? bx.au[(aq += -1658479539) * 285408389 - 1] : null;
   }

   boolean ag(int var1) {
      try {
         return 0 != (33554432 & this.ao * 1810954985);
      } catch (RuntimeException var2) {
         throw db.an(var2, "cl.ag(" + ')');
      }
   }

   boolean ah(byte var1) {
      try {
         return 0 != (1073741824 & 1810954985 * this.ao);
      } catch (RuntimeException var2) {
         throw db.an(var2, "cl.ah(" + ')');
      }
   }

   boolean av(int var1) {
      try {
         return (256 & 1810954985 * this.ao) != 0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cl.av(" + ')');
      }
   }

   boolean ar(byte var1) {
      try {
         boolean var10000;
         if (0 != (134217728 & 1810954985 * this.ao)) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cl.ar(" + ')');
      }
   }

   static void am(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if (var0 != at[var5]) {
            var2[var4] = at[var5];
            var3[var4] = al[var5];
            ++var4;
         }
      }

      at = var2;
      al = var3;
      ex.aw(bx.au, 0, bx.au.length - 1, at, al, -139825594);
   }

   static void as(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if (var0 != at[var5]) {
            var2[var4] = at[var5];
            var3[var4] = al[var5];
            ++var4;
         }
      }

      at = var2;
      al = var3;
      ex.aw(bx.au, 0, bx.au.length - 1, at, al, -139825594);
   }

   static void aj(cl[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = 1 + var2;
         int var7 = (var2 + var1) / 2;
         cl var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var6].av * 1692771375;
                     var12 = 1692771375 * var8.av;
                  } else if (1 == var3[var10]) {
                     var11 = var0[var6].ax * -1396846889;
                     var12 = var8.ax * -1396846889;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && 1 == var4[var10]) {
                        var12 = 2001;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var6].at(1029039210) ? 1 : 0;
                     var12 = var8.at(1029039210) ? 1 : 0;
                  } else {
                     var11 = var0[var6].ay * -2091224171;
                     var12 = -2091224171 * var8.ay;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (2 == var3[var10]) {
                     var11 = 1692771375 * var0[var5].av;
                     var12 = 1692771375 * var8.av;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var5].ax * -1396846889;
                     var12 = -1396846889 * var8.ax;
                     if (-1 == var11 && 1 == var4[var10]) {
                        var11 = 2001;
                     }

                     if (-1 == var12 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var5].at(1029039210) ? 1 : 0;
                     var12 = var8.at(1029039210) ? 1 : 0;
                  } else {
                     var11 = var0[var5].ay * -2091224171;
                     var12 = var8.ay * -2091224171;
                  }

                  if (var11 != var12) {
                     if ((1 != var4[var10] || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (3 == var10) {
                     var9 = false;
                  }
               }
            } while(var9);

            if (var5 < var6) {
               cl var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         ex.aw(var0, var1, var6, var3, var4, -139825594);
         ex.aw(var0, 1 + var6, var2, var3, var4, -139825594);
      }

   }

   static void ak(cl[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = 1 + var2;
         int var7 = (var2 + var1) / 2;
         cl var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var6].av * -428090983;
                     var12 = -978000198 * var8.av;
                  } else if (1 == var3[var10]) {
                     var11 = var0[var6].ax * 1404938505;
                     var12 = var8.ax * -463886526;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && 1 == var4[var10]) {
                        var12 = 518748187;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var6].at(1029039210) ? 1 : 0;
                     var12 = var8.at(1029039210) ? 1 : 0;
                  } else {
                     var11 = var0[var6].ay * -320619759;
                     var12 = 350882821 * var8.ay;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (2 == var3[var10]) {
                     var11 = 1692771375 * var0[var5].av;
                     var12 = 1554852401 * var8.av;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var5].ax * -1396846889;
                     var12 = -1396846889 * var8.ax;
                     if (-1 == var11 && 1 == var4[var10]) {
                        var11 = 2001;
                     }

                     if (-1 == var12 && var4[var10] == 1) {
                        var12 = -1670228147;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var5].at(1029039210) ? 1 : 0;
                     var12 = var8.at(1029039210) ? 1 : 0;
                  } else {
                     var11 = var0[var5].ay * -2091224171;
                     var12 = var8.ay * -2091224171;
                  }

                  if (var11 != var12) {
                     if ((1 != var4[var10] || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (3 == var10) {
                     var9 = false;
                  }
               }
            } while(var9);

            if (var5 < var6) {
               cl var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         ex.aw(var0, var1, var6, var3, var4, -139825594);
         ex.aw(var0, 1 + var6, var2, var3, var4, -139825594);
      }

   }

   static void az(cl[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = 1 + var2;
         int var7 = (var2 + var1) / 2;
         cl var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var6].av * 1692771375;
                     var12 = 1692771375 * var8.av;
                  } else if (1 == var3[var10]) {
                     var11 = var0[var6].ax * -1396846889;
                     var12 = var8.ax * -1396846889;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && 1 == var4[var10]) {
                        var12 = 2001;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var6].at(1029039210) ? 1 : 0;
                     var12 = var8.at(1029039210) ? 1 : 0;
                  } else {
                     var11 = var0[var6].ay * -2091224171;
                     var12 = -2091224171 * var8.ay;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (2 == var3[var10]) {
                     var11 = 1692771375 * var0[var5].av;
                     var12 = 1692771375 * var8.av;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var5].ax * -1396846889;
                     var12 = -1396846889 * var8.ax;
                     if (-1 == var11 && 1 == var4[var10]) {
                        var11 = 2001;
                     }

                     if (-1 == var12 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var5].at(1029039210) ? 1 : 0;
                     var12 = var8.at(1029039210) ? 1 : 0;
                  } else {
                     var11 = var0[var5].ay * -2091224171;
                     var12 = var8.ay * -2091224171;
                  }

                  if (var11 != var12) {
                     if ((1 != var4[var10] || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (3 == var10) {
                     var9 = false;
                  }
               }
            } while(var9);

            if (var5 < var6) {
               cl var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         ex.aw(var0, var1, var6, var3, var4, -139825594);
         ex.aw(var0, 1 + var6, var2, var3, var4, -139825594);
      }

   }

   static void ad(cl[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = 1 + var2;
         int var7 = (var2 + var1) / 2;
         cl var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var6].av * 1692771375;
                     var12 = 1692771375 * var8.av;
                  } else if (1 == var3[var10]) {
                     var11 = var0[var6].ax * -1285044437;
                     var12 = var8.ax * -1396846889;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = -1380474621;
                     }

                     if (var12 == -1 && 1 == var4[var10]) {
                        var12 = -37290568;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var6].at(1029039210) ? 1 : 0;
                     var12 = var8.at(1029039210) ? 1 : 0;
                  } else {
                     var11 = var0[var6].ay * 701051639;
                     var12 = -28182129 * var8.ay;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (2 == var3[var10]) {
                     var11 = -2012355743 * var0[var5].av;
                     var12 = 1955999118 * var8.av;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var5].ax * 522318529;
                     var12 = -1541536788 * var8.ax;
                     if (-1 == var11 && 1 == var4[var10]) {
                        var11 = 2001;
                     }

                     if (-1 == var12 && var4[var10] == 1) {
                        var12 = -1013650735;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var5].at(1029039210) ? 1 : 0;
                     var12 = var8.at(1029039210) ? 1 : 0;
                  } else {
                     var11 = var0[var5].ay * -2091224171;
                     var12 = var8.ay * -2091224171;
                  }

                  if (var11 != var12) {
                     if ((1 != var4[var10] || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (3 == var10) {
                     var9 = false;
                  }
               }
            } while(var9);

            if (var5 < var6) {
               cl var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         ex.aw(var0, var1, var6, var3, var4, -139825594);
         ex.aw(var0, 1 + var6, var2, var3, var4, -139825594);
      }

   }

   static void ae(cl[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = 1 + var2;
         int var7 = (var2 + var1) / 2;
         cl var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var6].av * 1692771375;
                     var12 = -2048476021 * var8.av;
                  } else if (1 == var3[var10]) {
                     var11 = var0[var6].ax * 785052224;
                     var12 = var8.ax * -1731199206;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = -1435081503;
                     }

                     if (var12 == -1 && 1 == var4[var10]) {
                        var12 = -48183078;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var6].at(1029039210) ? 1 : 0;
                     var12 = var8.at(1029039210) ? 1 : 0;
                  } else {
                     var11 = var0[var6].ay * 1038837104;
                     var12 = -2091224171 * var8.ay;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (2 == var3[var10]) {
                     var11 = 1692771375 * var0[var5].av;
                     var12 = 1692771375 * var8.av;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var5].ax * 2083371297;
                     var12 = -1396846889 * var8.ax;
                     if (-1 == var11 && 1 == var4[var10]) {
                        var11 = -951055042;
                     }

                     if (-1 == var12 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var5].at(1029039210) ? 1 : 0;
                     var12 = var8.at(1029039210) ? 1 : 0;
                  } else {
                     var11 = var0[var5].ay * 795001401;
                     var12 = var8.ay * -1352194602;
                  }

                  if (var11 != var12) {
                     if ((1 != var4[var10] || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (3 == var10) {
                     var9 = false;
                  }
               }
            } while(var9);

            if (var5 < var6) {
               cl var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         ex.aw(var0, var1, var6, var3, var4, -139825594);
         ex.aw(var0, 1 + var6, var2, var3, var4, -139825594);
      }

   }

   static void ap(int var0, boolean var1, int var2, boolean var3) {
      if (bx.au != null) {
         ai.au(0, bx.au.length - 1, var0, var1, var2, var3, 1840943622);
      }

   }

   boolean bs() {
      return (790147241 & this.ao * 1810954985) != 0;
   }

   static void bb(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         cl var8 = bx.au[var6];
         bx.au[var6] = bx.au[var1];
         bx.au[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            cl var11 = bx.au[var9];
            int var12 = ly.ab(var11, var8, var2, var3, (byte)46);
            int var10;
            if (0 != var12) {
               if (var3) {
                  var10 = -var12;
               } else {
                  var10 = var12;
               }
            } else if (var4 == -1) {
               var10 = 0;
            } else {
               int var13 = ly.ab(var11, var8, var4, var5, (byte)124);
               if (var5) {
                  var10 = -var13;
               } else {
                  var10 = var13;
               }
            }

            if (var10 <= 0) {
               cl var14 = bx.au[var9];
               bx.au[var9] = bx.au[var7];
               bx.au[var7++] = var14;
            }
         }

         bx.au[var1] = bx.au[var7];
         bx.au[var7] = var8;
         ai.au(var0, var7 - 1, var2, var3, var4, var5, 1605754871);
         ai.au(var7 + 1, var1, var2, var3, var4, var5, 1802510642);
      }

   }

   static void bi(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         cl var8 = bx.au[var6];
         bx.au[var6] = bx.au[var1];
         bx.au[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            cl var11 = bx.au[var9];
            int var12 = ly.ab(var11, var8, var2, var3, (byte)72);
            int var10;
            if (0 != var12) {
               if (var3) {
                  var10 = -var12;
               } else {
                  var10 = var12;
               }
            } else if (var4 == -1) {
               var10 = 0;
            } else {
               int var13 = ly.ab(var11, var8, var4, var5, (byte)3);
               if (var5) {
                  var10 = -var13;
               } else {
                  var10 = var13;
               }
            }

            if (var10 <= 0) {
               cl var14 = bx.au[var9];
               bx.au[var9] = bx.au[var7];
               bx.au[var7++] = var14;
            }
         }

         bx.au[var1] = bx.au[var7];
         bx.au[var7] = var8;
         ai.au(var0, var7 - 1, var2, var3, var4, var5, 1456170259);
         ai.au(var7 + 1, var1, var2, var3, var4, var5, 2135289087);
      }

   }

   static void be(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         cl var8 = bx.au[var6];
         bx.au[var6] = bx.au[var1];
         bx.au[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            cl var11 = bx.au[var9];
            int var12 = ly.ab(var11, var8, var2, var3, (byte)77);
            int var10;
            if (0 != var12) {
               if (var3) {
                  var10 = -var12;
               } else {
                  var10 = var12;
               }
            } else if (var4 == -1) {
               var10 = 0;
            } else {
               int var13 = ly.ab(var11, var8, var4, var5, (byte)124);
               if (var5) {
                  var10 = -var13;
               } else {
                  var10 = var13;
               }
            }

            if (var10 <= 0) {
               cl var14 = bx.au[var9];
               bx.au[var9] = bx.au[var7];
               bx.au[var7++] = var14;
            }
         }

         bx.au[var1] = bx.au[var7];
         bx.au[var7] = var8;
         ai.au(var0, var7 - 1, var2, var3, var4, var5, 518814110);
         ai.au(var7 + 1, var1, var2, var3, var4, var5, 2027862219);
      }

   }

   static int bk(cl var0, cl var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = -1396846889 * var0.ax;
         int var5 = -1396846889 * var1.ax;
         if (!var3) {
            if (-1 == var4) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (var2 == 2) {
         return -665846519 * var0.ah - -665846519 * var1.ah;
      } else if (var2 == 3) {
         if (var0.ag.equals("-")) {
            if (var1.ag.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.ag.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.ag.compareTo(var1.ag);
         }
      } else if (4 == var2) {
         return var0.ax((byte)4) ? (var1.ax((byte)84) ? 0 : 1) : (var1.ax((byte)54) ? -1 : 0);
      } else if (var2 == 5) {
         return var0.ay(2080325785) ? (var1.ay(733648997) ? 0 : 1) : (var1.ay(-173752121) ? -1 : 0);
      } else if (var2 == 6) {
         return var0.ao(929048546) ? (var1.ao(2069096141) ? 0 : 1) : (var1.ao(36259478) ? -1 : 0);
      } else if (7 == var2) {
         return var0.at(1029039210) ? (var1.at(1029039210) ? 0 : 1) : (var1.at(1029039210) ? -1 : 0);
      } else {
         return -2091224171 * var0.ay - var1.ay * -2091224171;
      }
   }

   boolean bv() {
      return 0 != (2 & this.ao * 1810954985);
   }

   cl() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "cl.<init>(" + ')');
      }
   }

   boolean bj() {
      return 0 != (1 & 1810954985 * this.ao);
   }

   boolean bl() {
      return 0 != (2 & this.ao * 1810954985);
   }

   static cl bd() {
      return 285408389 * aq < ab * -734287707 ? bx.au[(aq += -1658479539) * 285408389 - 1] : null;
   }

   static cl bx() {
      aq = 0;
      return cy.al(1732037426);
   }

   static cl bm() {
      return 285408389 * aq < ab * -734287707 ? bx.au[(aq += 2046807651) * 1604352365 - 1] : null;
   }

   static cl bz() {
      aq = 0;
      return cy.al(1905406195);
   }

   static void by(int var0, boolean var1, int var2, boolean var3) {
      if (bx.au != null) {
         ai.au(0, bx.au.length - 1, var0, var1, var2, var3, 1518346296);
      }

   }

   boolean br() {
      return (65536 & this.ao * 1810954985) != 0;
   }

   boolean bg() {
      return (65536 & this.ao * 1215278544) != 0;
   }

   boolean ai(byte var1) {
      try {
         boolean var10000;
         if (0 != (536870912 & 1810954985 * this.ao)) {
            if (var1 <= 32) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cl.ai(" + ')');
      }
   }

   boolean bf() {
      return (65536 & this.ao * 1810954985) != 0;
   }

   boolean bp() {
      return 0 != (2 & this.ao * 1810954985);
   }

   boolean ba() {
      return 0 != (2 & this.ao * 1810954985);
   }

   boolean bq() {
      return 0 != (2 & this.ao * 1810954985);
   }

   boolean cn() {
      return 0 != (33554432 & this.ao * -1785879894);
   }

   boolean cc() {
      return 0 != (257905778 & this.ao * 647523148);
   }

   static cl bo() {
      aq = 0;
      return cy.al(1882621095);
   }

   boolean bh() {
      return 0 != (4 & 1810954985 * this.ao);
   }

   boolean bw() {
      return 0 != (536870912 & 1810954985 * this.ao);
   }

   boolean ce() {
      return 0 != (-223285350 & 2042641166 * this.ao);
   }

   boolean ci() {
      return 0 != (536870912 & 1810954985 * this.ao);
   }

   boolean cm() {
      return 0 != (134217728 & 1810954985 * this.ao);
   }

   boolean cu() {
      return 0 != (1073741824 & 1810954985 * this.ao);
   }

   boolean bn() {
      return (65536 & this.ao * 1810954985) != 0;
   }

   boolean ca() {
      return 0 != (1912162899 & this.ao * -322881781);
   }

   boolean cs() {
      return 0 != (33554432 & this.ao * 1810954985);
   }

   boolean ck() {
      return 0 != (1073741824 & 1810954985 * this.ao);
   }

   boolean ay(int var1) {
      try {
         boolean var10000;
         if (0 != (2 & this.ao * 1810954985)) {
            if (var1 <= -549033243) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cl.ay(" + ')');
      }
   }

   boolean bc() {
      return 0 != (4 & 1810954985 * this.ao);
   }

   boolean cf() {
      return 0 != (1026153482 & 1810954985 * this.ao);
   }

   boolean cl() {
      return 0 != (134217728 & 1810954985 * this.ao);
   }

   public static void af(nm var0, short var1) {
      try {
         hr.af = var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cl.af(" + ')');
      }
   }

   static int ab(int var0, byte var1) {
      try {
         cp var2 = (cp)eo.af.get(var0);
         if (var2 == null) {
            if (var1 <= 126) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return var2.aw(1727774568);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "cl.ab(" + ')');
      }
   }
}
