import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class ay {
   boolean ab;
   boolean au;
   int aq;
   qq ac;
   final aa aw;
   final HttpsURLConnection af;
   final pc an;

   public ay(URL var1, aa var2, boolean var3) throws IOException {
      this(var1, var2, new pc(), var3);
   }

   public ay(URL var1, aa var2, pc var3, boolean var4) throws IOException {
      this.au = false;
      this.ab = false;
      this.aq = -1718145824;
      if (!var2.au()) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.ab());
      } else {
         this.af = (HttpsURLConnection)var1.openConnection();
         if (!var4) {
            HttpsURLConnection var5 = this.af;
            if (ah.an == null) {
               ah.an = new ah();
            }

            ah var6 = ah.an;
            var5.setSSLSocketFactory(var6);
         }

         this.aw = var2;
         this.an = var3 != null ? var3 : new pc();
      }
   }

   public pc af() {
      return this.an;
   }

   public void an(qq var1) {
      if (!this.au) {
         if (var1 == null) {
            this.an.ac("Content-Type");
            this.ac = null;
         } else {
            this.ac = var1;
            if (this.ac.af() != null) {
               this.an.al(this.ac.af());
            } else {
               this.an.at();
            }

         }
      }
   }

   void aw(byte var1) throws ProtocolException {
      if (this.au) {
         if (var1 <= -1) {
            throw new IllegalStateException();
         }
      } else {
         this.af.setRequestMethod(this.aw.ab());
         this.an.af(this.af);
         if (this.aw.aq() && null != this.ac) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            this.af.setDoOutput(true);
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();

            try {
               var2.write(this.ac.an());
               var2.writeTo(this.af.getOutputStream());
            } catch (IOException var12) {
               var12.printStackTrace();
            } finally {
               try {
                  var2.close();
               } catch (IOException var11) {
                  var11.printStackTrace();
               }

            }
         }

         this.af.setConnectTimeout(-283025399 * this.aq);
         this.af.setInstanceFollowRedirects(this.ab);
         this.au = true;
      }
   }

   boolean ac() throws IOException {
      if (!this.au) {
         this.aw((byte)4);
      }

      this.af.connect();
      return this.af.getResponseCode() == -1;
   }

   aj au() {
      try {
         if (!this.au || this.af.getResponseCode() == -1) {
            return new aj("No REST response has been received yet.");
         }
      } catch (IOException var11) {
         this.af.disconnect();
         return new aj("Error decoding REST response code: " + var11.getMessage());
      }

      aj var4;
      try {
         aj var2 = new aj(this.af);
         return var2;
      } catch (IOException var9) {
         var4 = new aj("Error decoding REST response: " + var9.getMessage());
      } finally {
         this.af.disconnect();
      }

      return var4;
   }

   static final void ao_renamed(Scene var0, CollisionMap[] var1) {
      int var3;
      int var4;
      int var5;
      int var6;
      for(var3 = 0; var3 < 4; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            for(var5 = 0; var5 < 104; ++var5) {
               if ((Tiles.Tiles_renderFlags[var3][var4][var5] & 1) == 1) {
                  var6 = var3;
                  if (2 == (Tiles.Tiles_renderFlags[1][var4][var5] & 2)) {
                     var6 = var3 - 1;
                  }

                  if (var6 >= 0) {
                     var1[var6].ac(var4, var5);
                  }
               }
            }
         }
      }

      Tiles.ae += ((int)(Math.random() * 5.0) - 2) * 1514061769;
      if (-372405639 * Tiles.ae < -8) {
         Tiles.ae = 772407736;
      }

      if (-372405639 * Tiles.ae > 8) {
         Tiles.ae = -772407736;
      }

      Tiles.ap += ((int)(Math.random() * 5.0) - 2) * 1193325609;
      if (Tiles.ap * -647485415 < -16) {
         Tiles.ap = -1913340560;
      }

      if (Tiles.ap * -647485415 > 16) {
         Tiles.ap = 1913340560;
      }

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int[] var10000;
      int var17;
      int var18;
      int var19;
      for(var3 = 0; var3 < 4; ++var3) {
         byte[][] var46 = Tiles.al[var3];
         boolean var47 = true;
         boolean var48 = true;
         boolean var7 = true;
         boolean var8 = true;
         boolean var9 = true;
         var10 = (int)Math.sqrt(5100.0);
         var11 = 768 * var10 >> 8;

         int var20;
         int var21;
         for(var12 = 1; var12 < 103; ++var12) {
            for(var13 = 1; var13 < 103; ++var13) {
               var14 = Tiles.Tiles_heights[var3][1 + var13][var12] - Tiles.Tiles_heights[var3][var13 - 1][var12];
               var15 = Tiles.Tiles_heights[var3][var13][var12 + 1] - Tiles.Tiles_heights[var3][var13][var12 - 1];
               var16 = (int)Math.sqrt((double)(var15 * var15 + 65536 + var14 * var14));
               var17 = (var14 << 8) / var16;
               var18 = 65536 / var16;
               var19 = (var15 << 8) / var16;
               var20 = 96 + (var19 * -50 + -10 * var18 + -50 * var17) / var11;
               var21 = (var46[var13][1 + var12] >> 3) + (var46[var13][var12 - 1] >> 2) + (var46[1 + var13][var12] >> 3) + (var46[var13 - 1][var12] >> 2) + (var46[var13][var12] >> 1);
               Tiles.at[var13][var12] = var20 - var21;
            }
         }

         for(var12 = 0; var12 < 104; ++var12) {
            gm.aa[var12] = 0;
            Tiles.ay[var12] = 0;
            kn.ao[var12] = 0;
            ej.ax[var12] = 0;
            bx.ai[var12] = 0;
         }

         for(var12 = -5; var12 < 109; ++var12) {
            for(var13 = 0; var13 < 104; ++var13) {
               var14 = 5 + var12;
               int var10002;
               if (var14 >= 0 && var14 < 104) {
                  var15 = (int)DynamicObject.al_renamed(15);
                  var16 = hu.ac[var3][var14][var13] & var15;
                  if (var16 > 0) {
                     var18 = var16 - 1;
                     FloorUnderlayType var55 = (FloorUnderlayType)FloorUnderlayType.FloorUnderlayType_cached.get((long)var18);
                     FloorUnderlayType var52;
                     if (null != var55) {
                        var52 = var55;
                     } else {
                        byte[] var56 = FloorUnderlayType.FloorUnderlayType_archive.takeFile(1, var18);
                        var55 = new FloorUnderlayType();
                        if (null != var56) {
                           var55.decode(new Packet(var56), var18);
                        }

                        var55.an();
                        FloorUnderlayType.FloorUnderlayType_cached.put(var55, (long)var18);
                        var52 = var55;
                     }

                     var10000 = gm.aa;
                     var10000[var13] += var52.ac * 372444635;
                     var10000 = Tiles.ay;
                     var10000[var13] += 1058265139 * var52.au;
                     var10000 = kn.ao;
                     var10000[var13] += -1527986335 * var52.ab;
                     var10000 = ej.ax;
                     var10000[var13] += var52.aq * -2012234183;
                     var10002 = bx.ai[var13]++;
                  }
               }

               var15 = var12 - 5;
               if (var15 >= 0 && var15 < 104) {
                  var16 = (int)DynamicObject.al_renamed(15);
                  var17 = hu.ac[var3][var15][var13] & var16;
                  if (var17 > 0) {
                     var19 = var17 - 1;
                     FloorUnderlayType var57 = (FloorUnderlayType)FloorUnderlayType.FloorUnderlayType_cached.get((long)var19);
                     FloorUnderlayType var54;
                     if (var57 != null) {
                        var54 = var57;
                     } else {
                        byte[] var58 = FloorUnderlayType.FloorUnderlayType_archive.takeFile(1, var19);
                        var57 = new FloorUnderlayType();
                        if (var58 != null) {
                           var57.decode(new Packet(var58), var19);
                        }

                        var57.an();
                        FloorUnderlayType.FloorUnderlayType_cached.put(var57, (long)var19);
                        var54 = var57;
                     }

                     var10000 = gm.aa;
                     var10000[var13] -= 372444635 * var54.ac;
                     var10000 = Tiles.ay;
                     var10000[var13] -= var54.au * 1058265139;
                     var10000 = kn.ao;
                     var10000[var13] -= -1527986335 * var54.ab;
                     var10000 = ej.ax;
                     var10000[var13] -= -2012234183 * var54.aq;
                     var10002 = bx.ai[var13]--;
                  }
               }
            }

            if (var12 >= 1 && var12 < 103) {
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;
               var17 = 0;

               for(var18 = -5; var18 < 109; ++var18) {
                  var19 = var18 + 5;
                  if (var19 >= 0 && var19 < 104) {
                     var13 += gm.aa[var19];
                     var14 += Tiles.ay[var19];
                     var15 += kn.ao[var19];
                     var16 += ej.ax[var19];
                     var17 += bx.ai[var19];
                  }

                  var20 = var18 - 5;
                  if (var20 >= 0 && var20 < 104) {
                     var13 -= gm.aa[var20];
                     var14 -= Tiles.ay[var20];
                     var15 -= kn.ao[var20];
                     var16 -= ej.ax[var20];
                     var17 -= bx.ai[var20];
                  }

                  if (var18 >= 1 && var18 < 103 && (!Client.cu || (Tiles.Tiles_renderFlags[0][var12][var18] & 2) != 0 || 0 == (Tiles.Tiles_renderFlags[var3][var12][var18] & 16))) {
                     if (var3 < Tiles.aw * 1401144457) {
                        Tiles.aw = var3 * -1087180359;
                     }

                     var21 = (int)DynamicObject.al_renamed(15);
                     int var22 = hu.ac[var3][var12][var18] & var21;
                     int var23 = Tiles.au[var3][var12][var18] & var21;
                     if (var22 > 0 || var23 > 0) {
                        int var24 = Tiles.Tiles_heights[var3][var12][var18];
                        int var25 = Tiles.Tiles_heights[var3][var12 + 1][var18];
                        int var26 = Tiles.Tiles_heights[var3][var12 + 1][1 + var18];
                        int var27 = Tiles.Tiles_heights[var3][var12][var18 + 1];
                        int var28 = Tiles.at[var12][var18];
                        int var29 = Tiles.at[1 + var12][var18];
                        int var30 = Tiles.at[var12 + 1][var18 + 1];
                        int var31 = Tiles.at[var12][var18 + 1];
                        int var32 = -1;
                        int var33 = -1;
                        int var34;
                        int var35;
                        int var36;
                        if (var22 > 0) {
                           var34 = var13 * 256 / var16;
                           var35 = var14 / var17;
                           var36 = var15 / var17;
                           var32 = ServerBuild.as_renamed(var34, var35, var36);
                           var34 = var34 + Tiles.ae * -372405639 & 255;
                           var36 += Tiles.ap * -647485415;
                           if (var36 < 0) {
                              var36 = 0;
                           } else if (var36 > 255) {
                              var36 = 255;
                           }

                           var33 = ServerBuild.as_renamed(var34, var35, var36);
                        }

                        FloorOverlayType var37;
                        if (var3 > 0) {
                           boolean var59 = true;
                           if (var22 == 0 && 0 != Tiles.ab[var3][var12][var18]) {
                              var59 = false;
                           }

                           if (var23 > 0) {
                              var36 = var23 - 1;
                              var37 = (FloorOverlayType)FloorOverlayType.an.get((long)var36);
                              FloorOverlayType var60;
                              if (var37 != null) {
                                 var60 = var37;
                              } else {
                                 byte[] var38 = FloorOverlayType.af.takeFile(4, var36);
                                 var37 = new FloorOverlayType();
                                 if (var38 != null) {
                                    var37.decode(new Packet(var38), var36);
                                 }

                                 var37.an();
                                 FloorOverlayType.an.put(var37, (long)var36);
                                 var60 = var37;
                              }

                              if (!var60.au) {
                                 var59 = false;
                              }
                           }

                           if (var59 && var24 == var25 && var24 == var26 && var27 == var24) {
                              var10000 = ge.ag[var3][var12];
                              var10000[var18] |= 2340;
                           }
                        }

                        var34 = 0;
                        if (var33 != -1) {
                           var34 = in.af[ar_renamed(var33, 96)];
                        }

                        if (0 == var23) {
                           var0.addTile(var3, var12, var18, 0, 0, -1, var24, var25, var26, var27, ar_renamed(var32, var28), ar_renamed(var32, var29), ar_renamed(var32, var30), ar_renamed(var32, var31), 0, 0, 0, 0, var34, 0);
                        } else {
                           var35 = Tiles.ab[var3][var12][var18] + 1;
                           byte var61 = Tiles.aq[var3][var12][var18];
                           int var62 = var23 - 1;
                           FloorOverlayType var39 = (FloorOverlayType)FloorOverlayType.an.get((long)var62);
                           if (var39 != null) {
                              var37 = var39;
                           } else {
                              byte[] var40 = FloorOverlayType.af.takeFile(4, var62);
                              var39 = new FloorOverlayType();
                              if (var40 != null) {
                                 var39.decode(new Packet(var40), var62);
                              }

                              var39.an();
                              FloorOverlayType.an.put(var39, (long)var62);
                              var37 = var39;
                           }

                           int var63 = var37.texture * -202963991;
                           int var41;
                           int var42;
                           int var43;
                           int var44;
                           if (var63 >= 0) {
                              var42 = in.ab.aq.ac(var63);
                              var41 = -1;
                           } else if (16711935 == 1889574527 * var37.rgb) {
                              var41 = -2;
                              var63 = -1;
                              var42 = -2;
                           } else {
                              var41 = ServerBuild.as_renamed(var37.saturation * 174415927, var37.hue * 470803713, var37.lightness * 532980473);
                              var43 = -372405639 * Tiles.ae + var37.saturation * 174415927 & 255;
                              var44 = var37.lightness * 532980473 + Tiles.ap * -647485415;
                              if (var44 < 0) {
                                 var44 = 0;
                              } else if (var44 > 255) {
                                 var44 = 255;
                              }

                              var42 = ServerBuild.as_renamed(var43, var37.hue * 470803713, var44);
                           }

                           var43 = 0;
                           if (var42 != -2) {
                              var43 = in.af[sh.am_renamed(var42, 96)];
                           }

                           if (-1 != var37.rgb2 * -2085280195) {
                              var44 = var37.aa * -187777599 + -372405639 * Tiles.ae & 255;
                              int var45 = Tiles.ap * -647485415 + var37.ao * -1379609783;
                              if (var45 < 0) {
                                 var45 = 0;
                              } else if (var45 > 255) {
                                 var45 = 255;
                              }

                              var42 = ServerBuild.as_renamed(var44, var37.ay * 1797179473, var45);
                              var43 = in.af[sh.am_renamed(var42, 96)];
                           }

                           var0.addTile(var3, var12, var18, var35, var61, var63, var24, var25, var26, var27, ar_renamed(var32, var28), ar_renamed(var32, var29), ar_renamed(var32, var30), ar_renamed(var32, var31), sh.am_renamed(var41, var28), sh.am_renamed(var41, var29), sh.am_renamed(var41, var30), sh.am_renamed(var41, var31), var34, var43);
                        }
                     }
                  }
               }
            }
         }

         for(var12 = 1; var12 < 103; ++var12) {
            for(var13 = 1; var13 < 103; ++var13) {
               var0.setTileMinPlane(var3, var13, var12, PcmPlayer.ax_renamed(var3, var13, var12));
            }
         }

         hu.ac[var3] = (short[][])null;
         Tiles.au[var3] = (short[][])null;
         Tiles.ab[var3] = (byte[][])null;
         Tiles.aq[var3] = (byte[][])null;
         Tiles.al[var3] = (byte[][])null;
      }

      var0.bx(-50, -10, -50);

      for(var3 = 0; var3 < 104; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            if (2 == (Tiles.Tiles_renderFlags[1][var3][var4] & 2)) {
               var0.aw(var3, var4);
            }
         }
      }

      var3 = 1;
      var4 = 2;
      var5 = 4;

      for(var6 = 0; var6 < 4; ++var6) {
         if (var6 > 0) {
            var3 <<= 3;
            var4 <<= 3;
            var5 <<= 3;
         }

         for(int var49 = 0; var49 <= var6; ++var49) {
            for(int var50 = 0; var50 <= 104; ++var50) {
               for(int var51 = 0; var51 <= 104; ++var51) {
                  short var53;
                  if (0 != (ge.ag[var49][var51][var50] & var3)) {
                     var10 = var50;
                     var11 = var50;
                     var12 = var49;

                     for(var13 = var49; var10 > 0 && (ge.ag[var49][var51][var10 - 1] & var3) != 0; --var10) {
                     }

                     while(var11 < 104 && (ge.ag[var49][var51][1 + var11] & var3) != 0) {
                        ++var11;
                     }

                     label576:
                     while(var12 > 0) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if (0 == (ge.ag[var12 - 1][var51][var14] & var3)) {
                              break label576;
                           }
                        }

                        --var12;
                     }

                     label565:
                     while(var13 < var6) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if (0 == (ge.ag[var13 + 1][var51][var14] & var3)) {
                              break label565;
                           }
                        }

                        ++var13;
                     }

                     var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
                     if (var14 >= 8) {
                        var53 = 240;
                        var16 = Tiles.Tiles_heights[var13][var51][var10] - var53;
                        var17 = Tiles.Tiles_heights[var12][var51][var10];
                        Scene.Scene_addOccluder(var6, 1, var51 * 128, 128 * var51, 128 * var10, var11 * 128 + 128, var16, var17);

                        for(var18 = var12; var18 <= var13; ++var18) {
                           for(var19 = var10; var19 <= var11; ++var19) {
                              var10000 = ge.ag[var18][var51];
                              var10000[var19] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((ge.ag[var49][var51][var50] & var4) != 0) {
                     var10 = var51;
                     var11 = var51;
                     var12 = var49;

                     for(var13 = var49; var10 > 0 && (ge.ag[var49][var10 - 1][var50] & var4) != 0; --var10) {
                     }

                     while(var11 < 104 && 0 != (ge.ag[var49][1 + var11][var50] & var4)) {
                        ++var11;
                     }

                     label629:
                     while(var12 > 0) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if (0 == (ge.ag[var12 - 1][var14][var50] & var4)) {
                              break label629;
                           }
                        }

                        --var12;
                     }

                     label618:
                     while(var13 < var6) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if (0 == (ge.ag[var13 + 1][var14][var50] & var4)) {
                              break label618;
                           }
                        }

                        ++var13;
                     }

                     var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
                     if (var14 >= 8) {
                        var53 = 240;
                        var16 = Tiles.Tiles_heights[var13][var10][var50] - var53;
                        var17 = Tiles.Tiles_heights[var12][var10][var50];
                        Scene.Scene_addOccluder(var6, 2, var10 * 128, var11 * 128 + 128, 128 * var50, 128 * var50, var16, var17);

                        for(var18 = var12; var18 <= var13; ++var18) {
                           for(var19 = var10; var19 <= var11; ++var19) {
                              var10000 = ge.ag[var18][var19];
                              var10000[var50] &= ~var4;
                           }
                        }
                     }
                  }

                  if ((ge.ag[var49][var51][var50] & var5) != 0) {
                     var10 = var51;
                     var11 = var51;
                     var12 = var50;

                     for(var13 = var50; var12 > 0 && (ge.ag[var49][var51][var12 - 1] & var5) != 0; --var12) {
                     }

                     while(var13 < 104 && 0 != (ge.ag[var49][var51][var13 + 1] & var5)) {
                        ++var13;
                     }

                     label682:
                     while(var10 > 0) {
                        for(var14 = var12; var14 <= var13; ++var14) {
                           if ((ge.ag[var49][var10 - 1][var14] & var5) == 0) {
                              break label682;
                           }
                        }

                        --var10;
                     }

                     label671:
                     while(var11 < 104) {
                        for(var14 = var12; var14 <= var13; ++var14) {
                           if ((ge.ag[var49][1 + var11][var14] & var5) == 0) {
                              break label671;
                           }
                        }

                        ++var11;
                     }

                     if ((var13 - var12 + 1) * (1 + (var11 - var10)) >= 4) {
                        var14 = Tiles.Tiles_heights[var49][var10][var12];
                        Scene.Scene_addOccluder(var6, 4, var10 * 128, 128 + var11 * 128, 128 * var12, 128 + var13 * 128, var14, var14);

                        for(var15 = var10; var15 <= var11; ++var15) {
                           for(var16 = var12; var16 <= var13; ++var16) {
                              var10000 = ge.ag[var49][var15];
                              var10000[var16] &= ~var5;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final int ar_renamed(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static sk od_renamed(int var0) {
      sk var2 = (sk)Client.ww.get((long)var0);
      if (null == var2) {
         var2 = new sk(PcmPlayer.archive14, var0);
      }

      return var2;
   }
}
