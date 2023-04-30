import java.util.LinkedList;
import java.util.List;

public class fw extends fb {
   static int iz;
   static int lf;
   int ac;
   int af;
   int an;
   int aw;
   // $FF: synthetic field
   final fa this$0;

   public static int af_renamed(int var0, int var1, int var2, ia var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
      int var10;
      for(int var9 = 0; var9 < 128; ++var9) {
         for(var10 = 0; var10 < 128; ++var10) {
            iw.aw[var9][var10] = 0;
            iw.ac[var9][var10] = 99999999;
         }
      }

      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      int var20;
      int var21;
      int var22;
      boolean var29;
      if (var2 == 1) {
         var29 = dz.an_renamed(var0, var1, var3, var4);
      } else if (var2 == 2) {
         var11 = var0;
         var12 = var1;
         var13 = 64;
         var14 = 64;
         var15 = var0 - var13;
         var16 = var1 - var14;
         iw.aw[var13][var14] = 99;
         iw.ac[var13][var14] = 0;
         var17 = 0;
         var18 = 0;
         iw.al[var17] = var0;
         iw.at[var17++] = var1;
         int[][] var19 = var4.flags;

         boolean var30;
         while(true) {
            if (var18 == var17) {
               am.au = -617213805 * var11;
               pg.ab = 1169106949 * var12;
               var30 = false;
               break;
            }

            var11 = iw.al[var18];
            var12 = iw.at[var18];
            var18 = var18 + 1 & 4095;
            var13 = var11 - var15;
            var14 = var12 - var16;
            var20 = var11 - var4.xInset * 1724654229;
            var21 = var12 - var4.yInset * -216630539;
            if (var3.af(2, var11, var12, var4)) {
               am.au = -617213805 * var11;
               pg.ab = var12 * 1169106949;
               var30 = true;
               break;
            }

            var22 = 1 + iw.ac[var13][var14];
            if (var13 > 0 && 0 == iw.aw[var13 - 1][var14] && 0 == (var19[var20 - 1][var21] & 19136782) && 0 == (var19[var20 - 1][1 + var21] & 19136824)) {
               iw.al[var17] = var11 - 1;
               iw.at[var17] = var12;
               var17 = 1 + var17 & 4095;
               iw.aw[var13 - 1][var14] = 2;
               iw.ac[var13 - 1][var14] = var22;
            }

            if (var13 < 126 && iw.aw[1 + var13][var14] == 0 && 0 == (var19[var20 + 2][var21] & 19136899) && (var19[2 + var20][var21 + 1] & 19136992) == 0) {
               iw.al[var17] = 1 + var11;
               iw.at[var17] = var12;
               var17 = 1 + var17 & 4095;
               iw.aw[1 + var13][var14] = 8;
               iw.ac[var13 + 1][var14] = var22;
            }

            if (var14 > 0 && 0 == iw.aw[var13][var14 - 1] && 0 == (var19[var20][var21 - 1] & 19136782) && 0 == (var19[var20 + 1][var21 - 1] & 19136899)) {
               iw.al[var17] = var11;
               iw.at[var17] = var12 - 1;
               var17 = var17 + 1 & 4095;
               iw.aw[var13][var14 - 1] = 1;
               iw.ac[var13][var14 - 1] = var22;
            }

            if (var14 < 126 && 0 == iw.aw[var13][1 + var14] && (var19[var20][2 + var21] & 19136824) == 0 && 0 == (var19[var20 + 1][2 + var21] & 19136992)) {
               iw.al[var17] = var11;
               iw.at[var17] = var12 + 1;
               var17 = var17 + 1 & 4095;
               iw.aw[var13][1 + var14] = 4;
               iw.ac[var13][var14 + 1] = var22;
            }

            if (var13 > 0 && var14 > 0 && iw.aw[var13 - 1][var14 - 1] == 0 && 0 == (var19[var20 - 1][var21] & 19136830) && 0 == (var19[var20 - 1][var21 - 1] & 19136782) && (var19[var20][var21 - 1] & 19136911) == 0) {
               iw.al[var17] = var11 - 1;
               iw.at[var17] = var12 - 1;
               var17 = var17 + 1 & 4095;
               iw.aw[var13 - 1][var14 - 1] = 3;
               iw.ac[var13 - 1][var14 - 1] = var22;
            }

            if (var13 < 126 && var14 > 0 && 0 == iw.aw[1 + var13][var14 - 1] && (var19[1 + var20][var21 - 1] & 19136911) == 0 && (var19[2 + var20][var21 - 1] & 19136899) == 0 && 0 == (var19[2 + var20][var21] & 19136995)) {
               iw.al[var17] = 1 + var11;
               iw.at[var17] = var12 - 1;
               var17 = var17 + 1 & 4095;
               iw.aw[1 + var13][var14 - 1] = 9;
               iw.ac[1 + var13][var14 - 1] = var22;
            }

            if (var13 > 0 && var14 < 126 && iw.aw[var13 - 1][1 + var14] == 0 && (var19[var20 - 1][1 + var21] & 19136830) == 0 && 0 == (var19[var20 - 1][2 + var21] & 19136824) && (var19[var20][var21 + 2] & 19137016) == 0) {
               iw.al[var17] = var11 - 1;
               iw.at[var17] = var12 + 1;
               var17 = var17 + 1 & 4095;
               iw.aw[var13 - 1][var14 + 1] = 6;
               iw.ac[var13 - 1][1 + var14] = var22;
            }

            if (var13 < 126 && var14 < 126 && iw.aw[1 + var13][var14 + 1] == 0 && (var19[1 + var20][2 + var21] & 19137016) == 0 && (var19[var20 + 2][2 + var21] & 19136992) == 0 && 0 == (var19[var20 + 2][var21 + 1] & 19136995)) {
               iw.al[var17] = 1 + var11;
               iw.at[var17] = var12 + 1;
               var17 = var17 + 1 & 4095;
               iw.aw[var13 + 1][1 + var14] = 12;
               iw.ac[1 + var13][1 + var14] = var22;
            }
         }

         var29 = var30;
      } else {
         var29 = IDKType.aw_renamed(var0, var1, var2, var3, var4);
      }

      var10 = var0 - 64;
      var11 = var1 - 64;
      var12 = 1093766555 * am.au;
      var13 = -56662835 * pg.ab;
      if (!var29) {
         if (!var5) {
            return -1;
         }

         var14 = Integer.MAX_VALUE;
         var15 = Integer.MAX_VALUE;
         byte var32 = 10;
         var17 = 689701217 * var3.af;
         var18 = -407280601 * var3.an;
         int var33 = 372776577 * var3.aw;
         var20 = -333607875 * var3.ac;

         for(var21 = var17 - var32; var21 <= var17 + var32; ++var21) {
            for(var22 = var18 - var32; var22 <= var18 + var32; ++var22) {
               int var23 = var21 - var10;
               int var24 = var22 - var11;
               if (var23 >= 0 && var24 >= 0 && var23 < 128 && var24 < 128 && iw.ac[var23][var24] < 100) {
                  int var25 = 0;
                  if (var21 < var17) {
                     var25 = var17 - var21;
                  } else if (var21 > var33 + var17 - 1) {
                     var25 = var21 - (var33 + var17 - 1);
                  }

                  int var26 = 0;
                  if (var22 < var18) {
                     var26 = var18 - var22;
                  } else if (var22 > var20 + var18 - 1) {
                     var26 = var22 - (var20 + var18 - 1);
                  }

                  int var27 = var26 * var26 + var25 * var25;
                  if (var27 < var14 || var14 == var27 && iw.ac[var23][var24] < var15) {
                     var14 = var27;
                     var15 = iw.ac[var23][var24];
                     var12 = var21;
                     var13 = var22;
                  }
               }
            }
         }

         if (var14 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var0 == var12 && var1 == var13) {
         var6[0] = var12;
         var7[0] = var13;
         return 0;
      } else {
         byte var31 = 0;
         iw.al[var31] = var12;
         var14 = var31 + 1;
         iw.at[var31] = var13;

         for(var15 = var16 = iw.aw[var12 - var10][var13 - var11]; var0 != var12 || var13 != var1; var15 = iw.aw[var12 - var10][var13 - var11]) {
            if (var15 != var16) {
               var16 = var15;
               iw.al[var14] = var12;
               iw.at[var14++] = var13;
            }

            if ((var15 & 2) != 0) {
               ++var12;
            } else if ((var15 & 8) != 0) {
               --var12;
            }

            if (0 != (var15 & 1)) {
               ++var13;
            } else if ((var15 & 4) != 0) {
               --var13;
            }
         }

         var17 = 0;

         while(var14-- > 0) {
            var6[var17] = iw.al[var14];
            var7[var17++] = iw.at[var14];
            if (var17 >= var6.length) {
               break;
            }
         }

         return var17;
      }
   }

   static String an_renamed(byte[] var0, int var1, int var2) {
      StringBuilder var4 = new StringBuilder();

      for(int var5 = var1; var5 < var2 + var1; var5 += 3) {
         int var6 = var0[var5] & 255;
         var4.append(ol.af[var6 >>> 2]);
         if (var5 < var2 - 1) {
            int var7 = var0[1 + var5] & 255;
            var4.append(ol.af[(var6 & 3) << 4 | var7 >>> 4]);
            if (var5 < var2 - 2) {
               int var8 = var0[var5 + 2] & 255;
               var4.append(ol.af[(var7 & 15) << 2 | var8 >>> 6]).append(ol.af[var8 & 63]);
            } else {
               var4.append(ol.af[(var7 & 15) << 2]).append("=");
            }
         } else {
            var4.append(ol.af[(var6 & 3) << 4]).append("==");
         }
      }

      return var4.toString();
   }

   public static LocType getLocType(int var0) {
      LocType var2 = (LocType)LocType.LocType_cached.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = LocType.LocType_archive.takeFile(6, var0);
         var2 = new LocType();
         var2.id = var0 * -1113054781;
         if (var3 != null) {
            var2.decode(new Packet(var3));
         }

         var2.postDecode();
         if (var2.isSolid) {
            var2.interactType = 0;
            var2.boolean1 = false;
         }

         LocType.LocType_cached.put(var2, (long)var0);
         return var2;
      }
   }

   public static void ac_renamed() {
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (0 != -1248352937 * ArchiveDiskActionHandler.aw) {
            ArchiveDiskActionHandler.aw = 1527846503;

            try {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
            } catch (InterruptedException var4) {
            }
         }

      }
   }

   public static void av_renamed(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      Rasterizer3D.aq.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   fw(fa var1) {
      this.this$0 = var1;
   }

   void af(Packet var1) {
      this.af = var1.g4s() * 1125554619;
      this.ac = var1.g4s() * -1773346325;
      this.an = var1.g1() * 1126530805;
      this.aw = var1.g1() * -1791842501;
   }

   void an(fj var1) {
      var1.av(this.af * 327631731, 116080323 * this.ac, this.an * -2041660067, this.aw * 1801165299);
   }

   static int bw_renamed(int var0, ClientScript var1, boolean var2) {
      int var4;
      Object var5;
      int var6;
      sk var7;
      int var8;
      if (var0 != 7500 && var0 != 7508) {
         if (7501 != var0) {
            int var21;
            int var23;
            if (var0 == 7502) {
               Interpreter.Interpreter_intStackSize -= 1281407919;
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
               var21 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize];
               var23 = oy.af_renamed(var21);
               var8 = BufferedSink.an_renamed(var21);
               int var25 = fv.aw_renamed(var21);
               sz var26 = ek.an_renamed(var4);
               sm var27 = ServerBuild.an_renamed(var23);
               int[] var28 = var27.aw[var8];
               int var13 = 0;
               int var14 = var28.length;
               if (var25 >= 0) {
                  if (var25 >= var14) {
                     throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
                  }

                  var13 = var25;
                  var14 = 1 + var25;
               }

               Object[] var15 = var26.ac(var8);
               if (var15 == null && var27.ac != null) {
                  var15 = var27.ac[var8];
               }

               int var16;
               int var17;
               if (null == var15) {
                  for(var16 = var13; var16 < var14; ++var16) {
                     var17 = var28[var16];
                     sh var29 = da.an_renamed(var17);
                     if (sh.aw == var29) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                     } else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = UnitPriceComparator.af_renamed(var17);
                     }
                  }

                  return 1;
               } else {
                  var16 = var15.length / var28.length;
                  if (var6 >= 0 && var6 < var16) {
                     for(var17 = var13; var17 < var14; ++var17) {
                        int var18 = var17 + var6 * var28.length;
                        sh var19 = da.an_renamed(var28[var17]);
                        if (sh.aw == var19) {
                           Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = (String)var15[var18];
                        } else {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Integer)var15[var18];
                        }
                     }

                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               }
            } else if (var0 == 7503) {
               Interpreter.Interpreter_intStackSize -= 854271946;
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
               var21 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
               var6 = 0;
               var23 = oy.af_renamed(var21);
               var8 = BufferedSink.an_renamed(var21);
               sz var24 = ek.an_renamed(var4);
               sm var10 = ServerBuild.an_renamed(var23);
               int[] var11 = var10.aw[var8];
               Object[] var12 = var24.ac(var8);
               if (var12 == null && var10.ac != null) {
                  var12 = var10.ac[var8];
               }

               if (null != var12) {
                  var6 = var12.length / var11.length;
               }

               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6;
               return 1;
            } else if (7504 != var0 && 7510 != var0) {
               if (7505 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  sz var22 = ek.an_renamed(var4);
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 468764621 * var22.au;
                  return 1;
               } else if (var0 == 7506) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var21 = -1;
                  if (aa.wf != null && var4 >= 0 && var4 < aa.wf.size()) {
                     var21 = (Integer)aa.wf.get(var4);
                  }

                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var21;
                  return 1;
               } else if (7507 != var0 && 7509 != var0) {
                  return 2;
               } else {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = ClientScriptEvent.cn_renamed(var4);
                  var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var7 = hf.ov_renamed(var6);
                  if (var7 == null) {
                     throw new RuntimeException();
                  } else if (oy.af_renamed(var6) != Client.wi * -1334952277) {
                     throw new RuntimeException();
                  } else if (null == aa.wf && aa.wf.isEmpty()) {
                     throw new RuntimeException();
                  } else {
                     var8 = fv.aw_renamed(var6);
                     List var9 = var7.an(var5, var8);
                     aa.wf = new LinkedList(aa.wf);
                     if (var9 != null) {
                        aa.wf.retainAll(var9);
                     } else {
                        aa.wf.clear();
                     }

                     an.wa = aa.wf.iterator();
                     if (var0 == 7507) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = aa.wf.size();
                     }

                     return 1;
                  }
               }
            } else {
               Interpreter.Interpreter_intStackSize -= 427135973;
               var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
               sk var20 = ay.od_renamed(var4);
               if (null == var20) {
                  throw new RuntimeException();
               } else {
                  aa.wf = var20.an(0, 0);
                  var6 = 0;
                  if (null != aa.wf) {
                     Client.wi = 978308099 * var4;
                     an.wa = aa.wf.iterator();
                     var6 = aa.wf.size();
                  }

                  if (var0 == 7504) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6;
                  }

                  return 1;
               }
            }
         } else {
            if (null != an.wa && an.wa.hasNext()) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Integer)an.wa.next();
            } else {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
            }

            return 1;
         }
      } else {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         var5 = ClientScriptEvent.cn_renamed(var4);
         var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         var7 = hf.ov_renamed(var6);
         if (null == var7) {
            throw new RuntimeException();
         } else {
            var8 = fv.aw_renamed(var6);
            aa.wf = var7.an(var5, var8);
            if (null != aa.wf) {
               Client.wi = oy.af_renamed(var6) * 978308099;
               an.wa = aa.wf.iterator();
               if (7500 == var0) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = aa.wf.size();
               }
            } else {
               Client.wi = -978308099;
               an.wa = null;
               if (var0 == 7500) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               }
            }

            return 1;
         }
      }
   }

   public static void ma_renamed(Component var0) {
      if (var0 != null && 207148199 * Client.rs == -1197721959 * var0.cycle) {
         Client.rf[372799529 * var0.rootIndex] = true;
      }

   }
}
