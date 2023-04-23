public class IDKType extends DualNode {
   public static int aw;
   static int ur;
   static EvictingDualNodeHashTable IDKType_cached = new EvictingDualNodeHashTable(64);
   static AbstractArchive IDKType_archive;
   static AbstractArchive an;
   static AbstractSocket js5Socket;
   static Rasterizer3D[] ku;
   int[] models;
   int[] head = new int[]{-1, -1, -1, -1, -1};
   short[] recol_d;
   short[] retex_d;
   short[] retex_s;
   short[] recol_s;
   public boolean ao = false;
   public int bodyPart = -1699952575;

   IDKType() {
   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (0 == var3) {
            return;
         }

         this.decode0(var1, var3, (byte)33);
      }
   }

   void decode0(Packet var1, int var2, byte var3) {
      if (var2 == 1) {
         if (var3 <= -1) {
            throw new IllegalStateException();
         }

         this.bodyPart = var1.g1() * 1699952575;
      } else {
         int var4;
         int var5;
         if (var2 == 2) {
            if (var3 <= -1) {
               return;
            }

            var4 = var1.g1();
            this.models = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               }

               this.models[var5] = var1.cl();
            }
         } else if (var2 == 3) {
            this.ao = true;
         } else if (var2 == 40) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            }

            var4 = var1.g1();
            this.retex_s = new short[var4];
            this.retex_d = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               }

               this.retex_s[var5] = (short)var1.cl();
               this.retex_d[var5] = (short)var1.cl();
            }
         } else if (var2 == 41) {
            if (var3 <= -1) {
               return;
            }

            var4 = var1.g1();
            this.recol_s = new short[var4];
            this.recol_d = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               }

               this.recol_s[var5] = (short)var1.cl();
               this.recol_d[var5] = (short)var1.cl();
            }
         } else if (var2 >= 60) {
            if (var3 <= -1) {
               return;
            }

            if (var2 < 70) {
               this.head[var2 - 60] = var1.cl();
            }
         }
      }

   }

   public boolean loadModel() {
      if (this.models == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.models.length; ++var3) {
            if (!an.tryLoadFile(this.models[var3], 0)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public UnlitModel getModel() {
      if (this.models == null) {
         return null;
      } else {
         UnlitModel[] var2 = new UnlitModel[this.models.length];

         for(int var3 = 0; var3 < this.models.length; ++var3) {
            var2[var3] = UnlitModel.af_renamed(an, this.models[var3], 0);
         }

         UnlitModel var5;
         if (var2.length == 1) {
            var5 = var2[0];
         } else {
            var5 = new UnlitModel(var2, var2.length);
         }

         int var4;
         if (this.retex_s != null) {
            for(var4 = 0; var4 < this.retex_s.length; ++var4) {
               var5.recolor(this.retex_s[var4], this.retex_d[var4]);
            }
         }

         if (this.recol_s != null) {
            for(var4 = 0; var4 < this.recol_s.length; ++var4) {
               var5.retexture(this.recol_s[var4], this.recol_d[var4]);
            }
         }

         return var5;
      }
   }

   public static String intToString(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var4 = var0;
         String var3;
         if (var1 && var0 >= 0) {
            int var5 = 2;

            for(int var6 = var0 / 10; var6 != 0; ++var5) {
               var6 /= 10;
            }

            char[] var7 = new char[var5];
            var7[0] = '+';

            for(int var8 = var5 - 1; var8 > 0; --var8) {
               int var9 = var4;
               var4 /= 10;
               int var10 = var9 - var4 * 10;
               if (var10 >= 10) {
                  var7[var8] = (char)(var10 + 87);
               } else {
                  var7[var8] = (char)(48 + var10);
               }
            }

            var3 = new String(var7);
         } else {
            var3 = Integer.toString(var0, 10);
         }

         return var3;
      } else {
         return Integer.toString(var0);
      }
   }

   public boolean loadChatHeadModel() {
      boolean var2 = true;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.head[var3] != -1 && !an.tryLoadFile(this.head[var3], 0)) {
            var2 = false;
         }
      }

      return var2;
   }

   public UnlitModel getChatHeadModel() {
      UnlitModel[] var2 = new UnlitModel[5];
      int var3 = 0;

      for(int var4 = 0; var4 < 5; ++var4) {
         if (this.head[var4] != -1) {
            var2[var3++] = UnlitModel.af_renamed(an, this.head[var4], 0);
         }
      }

      UnlitModel var6 = new UnlitModel(var2, var3);
      int var5;
      if (null != this.retex_s) {
         for(var5 = 0; var5 < this.retex_s.length; ++var5) {
            var6.recolor(this.retex_s[var5], this.retex_d[var5]);
         }
      }

      if (null != this.recol_s) {
         for(var5 = 0; var5 < this.recol_s.length; ++var5) {
            var6.retexture(this.recol_s[var5], this.recol_d[var5]);
         }
      }

      return var6;
   }

   static final boolean al_renamed(byte[] var0, int var1, int var2) {
      boolean var4 = true;
      Packet var5 = new Packet(var0);
      int var6 = -1;

      label86:
      while(true) {
         int var7 = var5.dw();
         if (0 == var7) {
            return var4;
         }

         var6 += var7;
         int var8 = 0;
         boolean var9 = false;

         while(true) {
            int var10;
            while(!var9) {
               var10 = var5.cd();
               if (var10 == 0) {
                  continue label86;
               }

               var8 += var10 - 1;
               int var11 = var8 & 63;
               int var12 = var8 >> 6 & 63;
               int var13 = var5.g1() >> 2;
               int var14 = var12 + var1;
               int var15 = var2 + var11;
               if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                  hq var16 = fw.an_renamed(var6);
                  if (var13 != 22 || !Client.cu || 0 != var16.aj * 415653149 || -973955889 * var16.am == 1 || var16.bs) {
                     if (!var16.aq()) {
                        Client.jk += 1441978033;
                        var4 = false;
                     }

                     var9 = true;
                  }
               }
            }

            var10 = var5.cd();
            if (0 == var10) {
               break;
            }

            var5.g1();
         }
      }
   }

   static final boolean aw_renamed(int var0, int var1, int var2, ia var3, CollisionMap var4) {
      int var6 = var0;
      int var7 = var1;
      int var8 = 64;
      int var9 = 64;
      int var10 = var0 - var8;
      int var11 = var1 - var9;
      iw.aw[var8][var9] = 99;
      iw.ac[var8][var9] = 0;
      int var12 = 0;
      int var13 = 0;
      iw.al[var12] = var0;
      iw.at[var12++] = var1;
      int[][] var14 = var4.flags;

      while(true) {
         label353:
         while(true) {
            int var15;
            int var16;
            int var17;
            int var18;
            do {
               do {
                  do {
                     label330:
                     do {
                        if (var12 == var13) {
                           am.au = var6 * -617213805;
                           pg.ab = 1169106949 * var7;
                           return false;
                        }

                        var6 = iw.al[var13];
                        var7 = iw.at[var13];
                        var13 = var13 + 1 & 4095;
                        var8 = var6 - var10;
                        var9 = var7 - var11;
                        var15 = var6 - 1724654229 * var4.bz;
                        var16 = var7 - var4.bm * -216630539;
                        if (var3.af(var2, var6, var7, var4)) {
                           am.au = var6 * -617213805;
                           pg.ab = 1169106949 * var7;
                           return true;
                        }

                        var17 = 1 + iw.ac[var8][var9];
                        if (var8 > 0 && 0 == iw.aw[var8 - 1][var9] && 0 == (var14[var15 - 1][var16] & 19136782) && 0 == (var14[var15 - 1][var16 + var2 - 1] & 19136824)) {
                           var18 = 1;

                           while(true) {
                              if (var18 >= var2 - 1) {
                                 iw.al[var12] = var6 - 1;
                                 iw.at[var12] = var7;
                                 var12 = var12 + 1 & 4095;
                                 iw.aw[var8 - 1][var9] = 2;
                                 iw.ac[var8 - 1][var9] = var17;
                                 break;
                              }

                              if (0 != (var14[var15 - 1][var18 + var16] & 19136830)) {
                                 break;
                              }

                              ++var18;
                           }
                        }

                        if (var8 < 128 - var2 && 0 == iw.aw[1 + var8][var9] && (var14[var15 + var2][var16] & 19136899) == 0 && 0 == (var14[var2 + var15][var2 + var16 - 1] & 19136992)) {
                           var18 = 1;

                           while(true) {
                              if (var18 >= var2 - 1) {
                                 iw.al[var12] = 1 + var6;
                                 iw.at[var12] = var7;
                                 var12 = var12 + 1 & 4095;
                                 iw.aw[1 + var8][var9] = 8;
                                 iw.ac[1 + var8][var9] = var17;
                                 break;
                              }

                              if ((var14[var2 + var15][var18 + var16] & 19136995) != 0) {
                                 break;
                              }

                              ++var18;
                           }
                        }

                        if (var9 > 0 && iw.aw[var8][var9 - 1] == 0 && 0 == (var14[var15][var16 - 1] & 19136782) && 0 == (var14[var2 + var15 - 1][var16 - 1] & 19136899)) {
                           var18 = 1;

                           while(true) {
                              if (var18 >= var2 - 1) {
                                 iw.al[var12] = var6;
                                 iw.at[var12] = var7 - 1;
                                 var12 = var12 + 1 & 4095;
                                 iw.aw[var8][var9 - 1] = 1;
                                 iw.ac[var8][var9 - 1] = var17;
                                 break;
                              }

                              if (0 != (var14[var15 + var18][var16 - 1] & 19136911)) {
                                 break;
                              }

                              ++var18;
                           }
                        }

                        if (var9 < 128 - var2 && iw.aw[var8][var9 + 1] == 0 && (var14[var15][var16 + var2] & 19136824) == 0 && (var14[var2 + var15 - 1][var2 + var16] & 19136992) == 0) {
                           var18 = 1;

                           while(true) {
                              if (var18 >= var2 - 1) {
                                 iw.al[var12] = var6;
                                 iw.at[var12] = 1 + var7;
                                 var12 = 1 + var12 & 4095;
                                 iw.aw[var8][var9 + 1] = 4;
                                 iw.ac[var8][var9 + 1] = var17;
                                 break;
                              }

                              if ((var14[var18 + var15][var2 + var16] & 19137016) != 0) {
                                 break;
                              }

                              ++var18;
                           }
                        }

                        if (var8 > 0 && var9 > 0 && iw.aw[var8 - 1][var9 - 1] == 0 && 0 == (var14[var15 - 1][var16 - 1] & 19136782)) {
                           var18 = 1;

                           while(true) {
                              if (var18 >= var2) {
                                 iw.al[var12] = var6 - 1;
                                 iw.at[var12] = var7 - 1;
                                 var12 = var12 + 1 & 4095;
                                 iw.aw[var8 - 1][var9 - 1] = 3;
                                 iw.ac[var8 - 1][var9 - 1] = var17;
                                 break;
                              }

                              if (0 != (var14[var15 - 1][var16 - 1 + var18] & 19136830) || 0 != (var14[var18 + (var15 - 1)][var16 - 1] & 19136911)) {
                                 break;
                              }

                              ++var18;
                           }
                        }

                        if (var8 < 128 - var2 && var9 > 0 && 0 == iw.aw[var8 + 1][var9 - 1] && (var14[var2 + var15][var16 - 1] & 19136899) == 0) {
                           var18 = 1;

                           while(true) {
                              if (var18 >= var2) {
                                 iw.al[var12] = 1 + var6;
                                 iw.at[var12] = var7 - 1;
                                 var12 = 1 + var12 & 4095;
                                 iw.aw[1 + var8][var9 - 1] = 9;
                                 iw.ac[var8 + 1][var9 - 1] = var17;
                                 break;
                              }

                              if ((var14[var15 + var2][var18 + (var16 - 1)] & 19136995) != 0 || (var14[var18 + var15][var16 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var18;
                           }
                        }

                        if (var8 > 0 && var9 < 128 - var2 && 0 == iw.aw[var8 - 1][var9 + 1] && 0 == (var14[var15 - 1][var16 + var2] & 19136824)) {
                           for(var18 = 1; var18 < var2; ++var18) {
                              if ((var14[var15 - 1][var18 + var16] & 19136830) != 0 || (var14[var18 + (var15 - 1)][var2 + var16] & 19137016) != 0) {
                                 continue label330;
                              }
                           }

                           iw.al[var12] = var6 - 1;
                           iw.at[var12] = 1 + var7;
                           var12 = 1 + var12 & 4095;
                           iw.aw[var8 - 1][1 + var9] = 6;
                           iw.ac[var8 - 1][1 + var9] = var17;
                        }
                     } while(var8 >= 128 - var2);
                  } while(var9 >= 128 - var2);
               } while(iw.aw[var8 + 1][var9 + 1] != 0);
            } while(0 != (var14[var15 + var2][var2 + var16] & 19136992));

            for(var18 = 1; var18 < var2; ++var18) {
               if ((var14[var15 + var18][var16 + var2] & 19137016) != 0 || (var14[var15 + var2][var16 + var18] & 19136995) != 0) {
                  continue label353;
               }
            }

            iw.al[var12] = 1 + var6;
            iw.at[var12] = 1 + var7;
            var12 = 1 + var12 & 4095;
            iw.aw[1 + var8][1 + var9] = 12;
            iw.ac[1 + var8][var9 + 1] = var17;
         }
      }
   }
}
