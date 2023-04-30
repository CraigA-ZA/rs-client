import accessors.RSMusicTrack;

public class ld extends rp implements RSMusicTrack {
   byte[] an;
   rc af;

   ld(sg var1) {
      var1.at = (var1.al.length - 3) * -1516355947;
      int var2 = var1.cm((byte)7);
      int var3 = var1.cl(-427177130);
      int var4 = 14 + var2 * 10;
      var1.at = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      int var13;
      int var14;
      int var15;
      for(var13 = 0; var13 < var2; ++var13) {
         var14 = -1;

         while(true) {
            var15 = var1.cm((byte)7);
            if (var15 != var14) {
               ++var4;
            }

            var14 = var15 & 15;
            if (var15 == 7) {
               break;
            }

            if (var15 == 23) {
               ++var5;
            } else if (var14 == 0) {
               ++var7;
            } else if (var14 == 1) {
               ++var8;
            } else if (var14 == 2) {
               ++var6;
            } else if (var14 == 3) {
               ++var9;
            } else if (var14 == 4) {
               ++var10;
            } else if (var14 == 5) {
               ++var11;
            } else {
               if (var14 != 6) {
                  throw new RuntimeException();
               }

               ++var12;
            }
         }
      }

      var4 += 5 * var5;
      var4 += 2 * (var7 + var8 + var6 + var9 + var11);
      var4 += var10 + var12;
      var13 = var1.at * -1633313603;
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         var1.di(-1171795391);
      }

      var4 += var1.at * -1633313603 - var13;
      var15 = var1.at * -1633313603;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;

      int var29;
      for(var29 = 0; var29 < var6; ++var29) {
         var28 = var28 + var1.cm((byte)7) & 127;
         if (var28 != 0 && var28 != 32) {
            if (var28 == 1) {
               ++var16;
            } else if (var28 == 33) {
               ++var17;
            } else if (var28 == 7) {
               ++var18;
            } else if (var28 == 39) {
               ++var19;
            } else if (var28 == 10) {
               ++var20;
            } else if (var28 == 42) {
               ++var21;
            } else if (var28 == 99) {
               ++var22;
            } else if (var28 == 98) {
               ++var23;
            } else if (var28 == 101) {
               ++var24;
            } else if (var28 == 100) {
               ++var25;
            } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
               ++var27;
            } else {
               ++var26;
            }
         } else {
            ++var12;
         }
      }

      var29 = 0;
      int var30 = var1.at * -1633313603;
      var1.at += var26 * -1516355947;
      int var31 = var1.at * -1633313603;
      var1.at += var11 * -1516355947;
      int var32 = var1.at * -1633313603;
      var1.at += var10 * -1516355947;
      int var33 = var1.at * -1633313603;
      var1.at += var9 * -1516355947;
      int var34 = var1.at * -1633313603;
      var1.at += var16 * -1516355947;
      int var35 = var1.at * -1633313603;
      var1.at += var18 * -1516355947;
      int var36 = var1.at * -1633313603;
      var1.at += var20 * -1516355947;
      int var37 = var1.at * -1633313603;
      var1.at += (var7 + var8 + var11) * -1516355947;
      int var38 = var1.at * -1633313603;
      var1.at += var7 * -1516355947;
      int var39 = var1.at * -1633313603;
      var1.at += var27 * -1516355947;
      int var40 = var1.at * -1633313603;
      var1.at += var8 * -1516355947;
      int var41 = var1.at * -1633313603;
      var1.at += var17 * -1516355947;
      int var42 = var1.at * -1633313603;
      var1.at += var19 * -1516355947;
      int var43 = var1.at * -1633313603;
      var1.at += var21 * -1516355947;
      int var44 = var1.at * -1633313603;
      var1.at += var12 * -1516355947;
      int var45 = var1.at * -1633313603;
      var1.at += var9 * -1516355947;
      int var46 = var1.at * -1633313603;
      var1.at += var22 * -1516355947;
      int var47 = var1.at * -1633313603;
      var1.at += var23 * -1516355947;
      int var48 = var1.at * -1633313603;
      var1.at += var24 * -1516355947;
      int var49 = var1.at * -1633313603;
      var1.at += var25 * -1516355947;
      int var50 = var1.at * -1633313603;
      var1.at += var5 * -254100545;
      this.an = new byte[var4];
      sg var51 = new sg(this.an);
      var51.ba(1297377380, -2081835031);
      var51.ba(6, -2081835031);
      var51.bf(var2 > 1 ? 1 : 0, (byte)-63);
      var51.bf(var2, (byte)22);
      var51.bf(var3, (byte)85);
      var1.at = var13 * -1516355947;
      int var52 = 0;
      int var53 = 0;
      int var54 = 0;
      int var55 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;

      label376:
      for(int var60 = 0; var60 < var2; ++var60) {
         var51.ba(1297379947, -2081835031);
         var51.at += -1770456492;
         int var61 = var51.at * -1633313603;
         int var62 = -1;

         while(true) {
            while(true) {
               int var63 = var1.di(-1171795391);
               var51.cq(var63, (byte)101);
               int var64 = var1.al[var29++] & 255;
               boolean var65 = var64 != var62;
               var62 = var64 & 15;
               if (var64 == 7) {
                  if (var65) {
                     var51.bu(255, (byte)9);
                  }

                  var51.bu(47, (byte)102);
                  var51.bu(0, (byte)2);
                  var51.cn(var51.at * -1633313603 - var61, 1718879396);
                  continue label376;
               }

               if (var64 == 23) {
                  if (var65) {
                     var51.bu(255, (byte)105);
                  }

                  var51.bu(81, (byte)50);
                  var51.bu(3, (byte)53);
                  var51.bu(var1.al[var50++], (byte)119);
                  var51.bu(var1.al[var50++], (byte)83);
                  var51.bu(var1.al[var50++], (byte)98);
               } else {
                  var52 ^= var64 >> 4;
                  if (var62 == 0) {
                     if (var65) {
                        var51.bu(144 + var52, (byte)27);
                     }

                     var53 += var1.al[var37++];
                     var54 += var1.al[var38++];
                     var51.bu(var53 & 127, (byte)111);
                     var51.bu(var54 & 127, (byte)18);
                  } else if (var62 == 1) {
                     if (var65) {
                        var51.bu(128 + var52, (byte)87);
                     }

                     var53 += var1.al[var37++];
                     var55 += var1.al[var40++];
                     var51.bu(var53 & 127, (byte)65);
                     var51.bu(var55 & 127, (byte)112);
                  } else if (var62 == 2) {
                     if (var65) {
                        var51.bu(176 + var52, (byte)118);
                     }

                     var28 = var28 + var1.al[var15++] & 127;
                     var51.bu(var28, (byte)39);
                     int var66;
                     if (var28 != 0 && var28 != 32) {
                        if (var28 == 1) {
                           var66 = var1.al[var34++];
                        } else if (var28 == 33) {
                           var66 = var1.al[var41++];
                        } else if (var28 == 7) {
                           var66 = var1.al[var35++];
                        } else if (var28 == 39) {
                           var66 = var1.al[var42++];
                        } else if (var28 == 10) {
                           var66 = var1.al[var36++];
                        } else if (var28 == 42) {
                           var66 = var1.al[var43++];
                        } else if (var28 == 99) {
                           var66 = var1.al[var46++];
                        } else if (var28 == 98) {
                           var66 = var1.al[var47++];
                        } else if (var28 == 101) {
                           var66 = var1.al[var48++];
                        } else if (var28 == 100) {
                           var66 = var1.al[var49++];
                        } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                           var66 = var1.al[var39++];
                        } else {
                           var66 = var1.al[var30++];
                        }
                     } else {
                        var66 = var1.al[var44++];
                     }

                     var66 += var59[var28];
                     var59[var28] = var66;
                     var51.bu(var66 & 127, (byte)29);
                  } else if (var62 == 3) {
                     if (var65) {
                        var51.bu(224 + var52, (byte)23);
                     }

                     var56 += var1.al[var45++];
                     var56 += var1.al[var33++] << 7;
                     var51.bu(var56 & 127, (byte)47);
                     var51.bu(var56 >> 7 & 127, (byte)54);
                  } else if (var62 == 4) {
                     if (var65) {
                        var51.bu(208 + var52, (byte)86);
                     }

                     var57 += var1.al[var32++];
                     var51.bu(var57 & 127, (byte)91);
                  } else if (var62 == 5) {
                     if (var65) {
                        var51.bu(160 + var52, (byte)114);
                     }

                     var53 += var1.al[var37++];
                     var58 += var1.al[var31++];
                     var51.bu(var53 & 127, (byte)83);
                     var51.bu(var58 & 127, (byte)20);
                  } else {
                     if (var62 != 6) {
                        throw new RuntimeException();
                     }

                     if (var65) {
                        var51.bu(192 + var52, (byte)14);
                     }

                     var51.bu(var1.al[var44++], (byte)63);
                  }
               }
            }
         }
      }

   }

   void aq() {
      if (this.af == null) {
         this.af = new rc(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         lt var4 = new lt(this.an);
         int var5 = var4.ac();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.au(var6);
            var4.al(var6);
            var4.ab(var6);
         }

         label79:
         do {
            while(true) {
               var6 = var4.ax();
               int var7 = var4.au[var6];

               while(var4.au[var6] == var7) {
                  var4.au(var6);
                  int var8 = var4.at(var6);
                  if (var8 == 1) {
                     var4.aq();
                     var4.ab(var6);
                     continue label79;
                  }

                  int var9 = var8 & 240;
                  int var10;
                  int var11;
                  int var12;
                  if (var9 == 176) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var12 = var8 >> 16 & 127;
                     if (var11 == 0) {
                        var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                     }

                     if (var11 == 32) {
                        var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                     }
                  }

                  if (var9 == 192) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var2[var10] = var1[var10] + var11;
                  }

                  if (var9 == 144) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var12 = var8 >> 16 & 127;
                     if (var12 > 0) {
                        int var13 = var2[var10];
                        rl var14 = (rl)this.af.af((long)var13);
                        if (var14 == null) {
                           var14 = new rl(new byte[128]);
                           this.af.an(var14, (long)var13);
                        }

                        var14.af[var11] = 1;
                     }
                  }

                  var4.al(var6);
                  var4.ab(var6);
               }
            }
         } while(!var4.ai());

      }
   }

   void an() {
      if (this.af == null) {
         this.af = new rc(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         lt var4 = new lt(this.an);
         int var5 = var4.ac();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.au(var6);
            var4.al(var6);
            var4.ab(var6);
         }

         label80:
         do {
            while(true) {
               var6 = var4.ax();
               int var7 = var4.au[var6];

               while(var4.au[var6] == var7) {
                  var4.au(var6);
                  int var8 = var4.at(var6);
                  if (var8 == 1) {
                     var4.aq();
                     var4.ab(var6);
                     continue label80;
                  }

                  int var9 = var8 & 240;
                  int var10;
                  int var11;
                  int var12;
                  if (var9 == 176) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var12 = var8 >> 16 & 127;
                     if (var11 == 0) {
                        var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                     }

                     if (var11 == 32) {
                        var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                     }
                  }

                  if (var9 == 192) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var2[var10] = var1[var10] + var11;
                  }

                  if (var9 == 144) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var12 = var8 >> 16 & 127;
                     if (var12 > 0) {
                        int var13 = var2[var10];
                        rl var14 = (rl)this.af.af((long)var13);
                        if (var14 == null) {
                           var14 = new rl(new byte[128]);
                           this.af.an(var14, (long)var13);
                        }

                        var14.af[var11] = 1;
                     }
                  }

                  var4.al(var6);
                  var4.ab(var6);
               }
            }
         } while(!var4.ai());

      }
   }

   void aw() {
      this.af = null;
   }

   public static ld ac(nm var0, int var1, int var2) {
      byte[] var3 = var0.bh(var1, var2, (byte)-77);
      return var3 == null ? null : new ld(new sg(var3));
   }

   void ao() {
      this.af = null;
   }

   public static ld ab(nm var0, int var1, int var2) {
      byte[] var3 = var0.bh(var1, var2, (byte)-93);
      return var3 == null ? null : new ld(new sg(var3));
   }

   public static ld au(nm var0, int var1, int var2) {
      byte[] var3 = var0.bh(var1, var2, (byte)-91);
      return var3 == null ? null : new ld(new sg(var3));
   }

   void al() {
      if (this.af == null) {
         this.af = new rc(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         lt var4 = new lt(this.an);
         int var5 = var4.ac();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.au(var6);
            var4.al(var6);
            var4.ab(var6);
         }

         label80:
         do {
            while(true) {
               var6 = var4.ax();
               int var7 = var4.au[var6];

               while(var4.au[var6] == var7) {
                  var4.au(var6);
                  int var8 = var4.at(var6);
                  if (var8 == 1) {
                     var4.aq();
                     var4.ab(var6);
                     continue label80;
                  }

                  int var9 = var8 & 240;
                  int var10;
                  int var11;
                  int var12;
                  if (var9 == 176) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var12 = var8 >> 16 & 127;
                     if (var11 == 0) {
                        var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                     }

                     if (var11 == 32) {
                        var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                     }
                  }

                  if (var9 == 192) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var2[var10] = var1[var10] + var11;
                  }

                  if (var9 == 144) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var12 = var8 >> 16 & 127;
                     if (var12 > 0) {
                        int var13 = var2[var10];
                        rl var14 = (rl)this.af.af((long)var13);
                        if (var14 == null) {
                           var14 = new rl(new byte[128]);
                           this.af.an(var14, (long)var13);
                        }

                        var14.af[var11] = 1;
                     }
                  }

                  var4.al(var6);
                  var4.ab(var6);
               }
            }
         } while(!var4.ai());

      }
   }

   void aa() {
      this.af = null;
   }

   void at() {
      if (this.af == null) {
         this.af = new rc(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         lt var4 = new lt(this.an);
         int var5 = var4.ac();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.au(var6);
            var4.al(var6);
            var4.ab(var6);
         }

         label79:
         do {
            while(true) {
               var6 = var4.ax();
               int var7 = var4.au[var6];

               while(var4.au[var6] == var7) {
                  var4.au(var6);
                  int var8 = var4.at(var6);
                  if (var8 == 1) {
                     var4.aq();
                     var4.ab(var6);
                     continue label79;
                  }

                  int var9 = var8 & 240;
                  int var10;
                  int var11;
                  int var12;
                  if (var9 == 176) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var12 = var8 >> 16 & 127;
                     if (var11 == 0) {
                        var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                     }

                     if (var11 == 32) {
                        var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                     }
                  }

                  if (var9 == 192) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var2[var10] = var1[var10] + var11;
                  }

                  if (var9 == 144) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var12 = var8 >> 16 & 127;
                     if (var12 > 0) {
                        int var13 = var2[var10];
                        rl var14 = (rl)this.af.af((long)var13);
                        if (var14 == null) {
                           var14 = new rl(new byte[128]);
                           this.af.an(var14, (long)var13);
                        }

                        var14.af[var11] = 1;
                     }
                  }

                  var4.al(var6);
                  var4.ab(var6);
               }
            }
         } while(!var4.ai());

      }
   }

   void ay() {
      this.af = null;
   }

   public static ld af(nm var0, int var1, int var2) {
      byte[] var3 = var0.bh(var1, var2, (byte)-112);
      return var3 == null ? null : new ld(new sg(var3));
   }
}
