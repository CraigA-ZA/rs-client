import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class ay {
   final pc an;
   int aq;
   boolean ab;
   final HttpsURLConnection af;
   boolean au;
   qq ac;
   final aa aw;
   static final int cz = 11;
   public static final int ai = 12;

   public void aa(qq var1) {
      if (!this.au) {
         if (var1 == null) {
            this.an.ac("Content-Type", (short)-29095);
            this.ac = null;
         } else {
            this.ac = var1;
            if (this.ac.af(-1948643577) != null) {
               this.an.al(this.ac.af(-2136403957), 1037521942);
            } else {
               this.an.at(1686836713);
            }

         }
      }
   }

   aj ag() {
      try {
         if (!this.au || this.af.getResponseCode() == -1) {
            return new aj("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.af.disconnect();
         return new aj("Error decoding REST response code: " + var10.getMessage());
      }

      aj var3;
      try {
         aj var1 = new aj(this.af);
         return var1;
      } catch (IOException var8) {
         var3 = new aj("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.af.disconnect();
      }

      return var3;
   }

   public pc af(int var1) {
      try {
         return this.an;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ay.af(" + ')');
      }
   }

   public ay(URL var1, aa var2, pc var3, boolean var4) throws IOException {
      try {
         super();
         this.au = false;
         this.ab = false;
         this.aq = -1718145824;
         if (!var2.au((byte)74)) {
            throw new UnsupportedEncodingException("Unsupported request method used " + var2.ab((byte)-21));
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
      } catch (RuntimeException var7) {
         throw db.an(var7, "ay.<init>(" + ')');
      }
   }

   public void at(qq var1) {
      if (!this.au) {
         if (var1 == null) {
            this.an.ac("Content-Type", (short)-9095);
            this.ac = null;
         } else {
            this.ac = var1;
            if (this.ac.af(-1705702615) != null) {
               this.an.al(this.ac.af(-950933299), 1037521942);
            } else {
               this.an.at(1445356467);
            }

         }
      }
   }

   aj ah() {
      try {
         if (!this.au || this.af.getResponseCode() == -1) {
            return new aj("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.af.disconnect();
         return new aj("Error decoding REST response code: " + var10.getMessage());
      }

      aj var3;
      try {
         aj var1 = new aj(this.af);
         return var1;
      } catch (IOException var8) {
         var3 = new aj("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.af.disconnect();
      }

      return var3;
   }

   aj au(byte var1) {
      try {
         try {
            label79: {
               if (this.au) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (this.af.getResponseCode() != -1) {
                     break label79;
                  }

                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }
               }

               return new aj("No REST response has been received yet.");
            }
         } catch (IOException var12) {
            this.af.disconnect();
            return new aj("Error decoding REST response code: " + var12.getMessage());
         }

         aj var4;
         try {
            aj var2 = new aj(this.af);
            return var2;
         } catch (IOException var10) {
            var4 = new aj("Error decoding REST response: " + var10.getMessage());
         } finally {
            this.af.disconnect();
         }

         return var4;
      } catch (RuntimeException var13) {
         throw db.an(var13, "ay.au(" + ')');
      }
   }

   public ay(URL var1, aa var2, boolean var3) throws IOException {
      try {
         this(var1, var2, new pc(), var3);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ay.<init>(" + ')');
      }
   }

   public pc aq() {
      return this.an;
   }

   public pc ab() {
      return this.an;
   }

   void aw(byte var1) throws ProtocolException {
      try {
         if (this.au) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }
         } else {
            this.af.setRequestMethod(this.aw.ab((byte)-57));
            this.an.af(this.af, 1759614769);
            if (this.aw.aq(142097256) && null != this.ac) {
               if (var1 <= -1) {
                  throw new IllegalStateException();
               }

               this.af.setDoOutput(true);
               ByteArrayOutputStream var2 = new ByteArrayOutputStream();

               try {
                  var2.write(this.ac.an(888549065));
                  var2.writeTo(this.af.getOutputStream());
               } catch (IOException var13) {
                  var13.printStackTrace();
               } finally {
                  try {
                     var2.close();
                  } catch (IOException var12) {
                     var12.printStackTrace();
                  }

               }
            }

            this.af.setConnectTimeout(-283025399 * this.aq);
            this.af.setInstanceFollowRedirects(this.ab);
            this.au = true;
         }
      } catch (RuntimeException var15) {
         throw db.an(var15, "ay.aw(" + ')');
      }
   }

   boolean ac(byte var1) throws IOException {
      try {
         if (!this.au) {
            this.aw((byte)4);
         }

         this.af.connect();
         return this.af.getResponseCode() == -1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ay.ac(" + ')');
      }
   }

   void ay() throws ProtocolException {
      if (!this.au) {
         this.af.setRequestMethod(this.aw.ab((byte)-41));
         this.an.af(this.af, 2009863432);
         if (this.aw.aq(161880080) && null != this.ac) {
            this.af.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.ac.an(888549065));
               var1.writeTo(this.af.getOutputStream());
            } catch (IOException var11) {
               var11.printStackTrace();
            } finally {
               try {
                  var1.close();
               } catch (IOException var10) {
                  var10.printStackTrace();
               }

            }
         }

         this.af.setConnectTimeout(-283025399 * this.aq);
         this.af.setInstanceFollowRedirects(this.ab);
         this.au = true;
      }
   }

   void ao() throws ProtocolException {
      if (!this.au) {
         this.af.setRequestMethod(this.aw.ab((byte)-29));
         this.an.af(this.af, 1696684066);
         if (this.aw.aq(-1978695127) && null != this.ac) {
            this.af.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.ac.an(888549065));
               var1.writeTo(this.af.getOutputStream());
            } catch (IOException var11) {
               var11.printStackTrace();
            } finally {
               try {
                  var1.close();
               } catch (IOException var10) {
                  var10.printStackTrace();
               }

            }
         }

         this.af.setConnectTimeout(-283025399 * this.aq);
         this.af.setInstanceFollowRedirects(this.ab);
         this.au = true;
      }
   }

   boolean ax() throws IOException {
      if (!this.au) {
         this.aw((byte)69);
      }

      this.af.connect();
      return this.af.getResponseCode() == -1;
   }

   boolean ai() throws IOException {
      if (!this.au) {
         this.aw((byte)106);
      }

      this.af.connect();
      return this.af.getResponseCode() == -1;
   }

   public void al(qq var1) {
      if (!this.au) {
         if (var1 == null) {
            this.an.ac("Content-Type", (short)-30074);
            this.ac = null;
         } else {
            this.ac = var1;
            if (this.ac.af(-1279812530) != null) {
               this.an.al(this.ac.af(-132900521), 1037521942);
            } else {
               this.an.at(1510877154);
            }

         }
      }
   }

   public void an(qq var1, byte var2) {
      try {
         if (!this.au) {
            if (var1 == null) {
               if (var2 == 1) {
                  this.an.ac("Content-Type", (short)-14811);
                  this.ac = null;
               }
            } else {
               this.ac = var1;
               if (this.ac.af(-1368831969) != null) {
                  this.an.al(this.ac.af(-1423914981), 1037521942);
               } else {
                  this.an.at(1055361805);
               }

            }
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "ay.an(" + ')');
      }
   }

   static final void ao(ie var0, if[] var1, int var2) {
      try {
         int var3;
         int var4;
         int var5;
         int var6;
         for(var3 = 0; var3 < 4; ++var3) {
            if (var2 != 1670427112) {
               return;
            }

            for(var4 = 0; var4 < 104; ++var4) {
               if (var2 != 1670427112) {
                  throw new IllegalStateException();
               }

               for(var5 = 0; var5 < 104; ++var5) {
                  if (var2 != 1670427112) {
                     throw new IllegalStateException();
                  }

                  if ((cd.an[var3][var4][var5] & 1) == 1) {
                     if (var2 != 1670427112) {
                        throw new IllegalStateException();
                     }

                     var6 = var3;
                     if (2 == (cd.an[1][var4][var5] & 2)) {
                        var6 = var3 - 1;
                     }

                     if (var6 >= 0) {
                        if (var2 != 1670427112) {
                           throw new IllegalStateException();
                        }

                        var1[var6].ac(var4, var5, (byte)90);
                     }
                  }
               }
            }
         }

         cd.ae += ((int)(Math.random() * 5.0) - 2) * 1514061769;
         if (-372405639 * cd.ae < -8) {
            if (var2 != 1670427112) {
               throw new IllegalStateException();
            }

            cd.ae = 772407736;
         }

         if (-372405639 * cd.ae > 8) {
            cd.ae = -772407736;
         }

         cd.ap += ((int)(Math.random() * 5.0) - 2) * 1193325609;
         if (cd.ap * -647485415 < -16) {
            if (var2 != 1670427112) {
               return;
            }

            cd.ap = -1913340560;
         }

         if (cd.ap * -647485415 > 16) {
            cd.ap = 1913340560;
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
            if (var2 != 1670427112) {
               return;
            }

            byte[][] var47 = cd.al[var3];
            boolean var48 = true;
            boolean var49 = true;
            boolean var7 = true;
            boolean var8 = true;
            boolean var9 = true;
            var10 = (int)Math.sqrt(5100.0);
            var11 = 768 * var10 >> 8;

            int var20;
            int var21;
            for(var12 = 1; var12 < 103; ++var12) {
               if (var2 != 1670427112) {
                  return;
               }

               for(var13 = 1; var13 < 103; ++var13) {
                  if (var2 != 1670427112) {
                     throw new IllegalStateException();
                  }

                  var14 = cd.af[var3][1 + var13][var12] - cd.af[var3][var13 - 1][var12];
                  var15 = cd.af[var3][var13][var12 + 1] - cd.af[var3][var13][var12 - 1];
                  var16 = (int)Math.sqrt((double)(var15 * var15 + 65536 + var14 * var14));
                  var17 = (var14 << 8) / var16;
                  var18 = 65536 / var16;
                  var19 = (var15 << 8) / var16;
                  var20 = 96 + (var19 * -50 + -10 * var18 + -50 * var17) / var11;
                  var21 = (var47[var13][1 + var12] >> 3) + (var47[var13][var12 - 1] >> 2) + (var47[1 + var13][var12] >> 3) + (var47[var13 - 1][var12] >> 2) + (var47[var13][var12] >> 1);
                  cd.at[var13][var12] = var20 - var21;
               }
            }

            for(var12 = 0; var12 < 104; ++var12) {
               if (var2 != 1670427112) {
                  throw new IllegalStateException();
               }

               gm.aa[var12] = 0;
               cd.ay[var12] = 0;
               kn.ao[var12] = 0;
               ej.ax[var12] = 0;
               bx.ai[var12] = 0;
            }

            for(var12 = -5; var12 < 109; ++var12) {
               if (var2 != 1670427112) {
                  throw new IllegalStateException();
               }

               for(var13 = 0; var13 < 104; ++var13) {
                  if (var2 != 1670427112) {
                     return;
                  }

                  var14 = 5 + var12;
                  int var10002;
                  if (var14 >= 0) {
                     if (var2 != 1670427112) {
                        throw new IllegalStateException();
                     }

                     if (var14 < 104) {
                        if (var2 != 1670427112) {
                           throw new IllegalStateException();
                        }

                        var15 = (int)ct.al(15, 1855948571);
                        var16 = hu.ac[var3][var14][var13] & var15;
                        if (var16 > 0) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           var18 = var16 - 1;
                           hr var56 = (hr)hr.an.af((long)var18);
                           hr var53;
                           if (null != var56) {
                              var53 = var56;
                           } else {
                              byte[] var57 = hr.af.bh(1, var18, (byte)-111);
                              var56 = new hr();
                              if (null != var57) {
                                 var56.aw(new sg(var57), var18, -2029421932);
                              }

                              var56.an(875414437);
                              hr.an.aw(var56, (long)var18);
                              var53 = var56;
                           }

                           var10000 = gm.aa;
                           var10000[var13] += var53.ac * 372444635;
                           var10000 = cd.ay;
                           var10000[var13] += 1058265139 * var53.au;
                           var10000 = kn.ao;
                           var10000[var13] += -1527986335 * var53.ab;
                           var10000 = ej.ax;
                           var10000[var13] += var53.aq * -2012234183;
                           var10002 = bx.ai[var13]++;
                        }
                     }
                  }

                  var15 = var12 - 5;
                  if (var15 >= 0) {
                     if (var2 != 1670427112) {
                        return;
                     }

                     if (var15 < 104) {
                        var16 = (int)ct.al(15, 928667674);
                        var17 = hu.ac[var3][var15][var13] & var16;
                        if (var17 > 0) {
                           var19 = var17 - 1;
                           hr var58 = (hr)hr.an.af((long)var19);
                           hr var55;
                           if (var58 != null) {
                              if (var2 != 1670427112) {
                                 return;
                              }

                              var55 = var58;
                           } else {
                              byte[] var59 = hr.af.bh(1, var19, (byte)-27);
                              var58 = new hr();
                              if (var59 != null) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }

                                 var58.aw(new sg(var59), var19, -1727054977);
                              }

                              var58.an(875414437);
                              hr.an.aw(var58, (long)var19);
                              var55 = var58;
                           }

                           var10000 = gm.aa;
                           var10000[var13] -= 372444635 * var55.ac;
                           var10000 = cd.ay;
                           var10000[var13] -= var55.au * 1058265139;
                           var10000 = kn.ao;
                           var10000[var13] -= -1527986335 * var55.ab;
                           var10000 = ej.ax;
                           var10000[var13] -= -2012234183 * var55.aq;
                           var10002 = bx.ai[var13]--;
                        }
                     }
                  }
               }

               if (var12 >= 1) {
                  if (var2 != 1670427112) {
                     throw new IllegalStateException();
                  }

                  if (var12 < 103) {
                     if (var2 != 1670427112) {
                        throw new IllegalStateException();
                     }

                     var13 = 0;
                     var14 = 0;
                     var15 = 0;
                     var16 = 0;
                     var17 = 0;

                     for(var18 = -5; var18 < 109; ++var18) {
                        if (var2 != 1670427112) {
                           throw new IllegalStateException();
                        }

                        var19 = var18 + 5;
                        if (var19 >= 0) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           if (var19 < 104) {
                              if (var2 != 1670427112) {
                                 throw new IllegalStateException();
                              }

                              var13 += gm.aa[var19];
                              var14 += cd.ay[var19];
                              var15 += kn.ao[var19];
                              var16 += ej.ax[var19];
                              var17 += bx.ai[var19];
                           }
                        }

                        var20 = var18 - 5;
                        if (var20 >= 0) {
                           if (var2 != 1670427112) {
                              return;
                           }

                           if (var20 < 104) {
                              if (var2 != 1670427112) {
                                 throw new IllegalStateException();
                              }

                              var13 -= gm.aa[var20];
                              var14 -= cd.ay[var20];
                              var15 -= kn.ao[var20];
                              var16 -= ej.ax[var20];
                              var17 -= bx.ai[var20];
                           }
                        }

                        if (var18 >= 1 && var18 < 103) {
                           if (client.cu) {
                              if (var2 != 1670427112) {
                                 return;
                              }

                              if ((cd.an[0][var12][var18] & 2) == 0) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 != (cd.an[var3][var12][var18] & 16)) {
                                    if (var2 != 1670427112) {
                                       throw new IllegalStateException();
                                    }
                                    continue;
                                 }
                              }
                           }

                           if (var3 < cd.aw * 1401144457) {
                              cd.aw = var3 * -1087180359;
                           }

                           var21 = (int)ct.al(15, 1408849564);
                           int var22 = hu.ac[var3][var12][var18] & var21;
                           int var23 = cd.au[var3][var12][var18] & var21;
                           if (var22 <= 0) {
                              if (var2 != 1670427112) {
                                 throw new IllegalStateException();
                              }

                              if (var23 <= 0) {
                                 continue;
                              }
                           }

                           int var24 = cd.af[var3][var12][var18];
                           int var25 = cd.af[var3][var12 + 1][var18];
                           int var26 = cd.af[var3][var12 + 1][1 + var18];
                           int var27 = cd.af[var3][var12][var18 + 1];
                           int var28 = cd.at[var12][var18];
                           int var29 = cd.at[1 + var12][var18];
                           int var30 = cd.at[var12 + 1][var18 + 1];
                           int var31 = cd.at[var12][var18 + 1];
                           int var32 = -1;
                           int var33 = -1;
                           int var34;
                           int var35;
                           int var36;
                           if (var22 > 0) {
                              var34 = var13 * 256 / var16;
                              var35 = var14 / var17;
                              var36 = var15 / var17;
                              var32 = md.as(var34, var35, var36, -347521940);
                              var34 = var34 + cd.ae * -372405639 & 255;
                              var36 += cd.ap * -647485415;
                              if (var36 < 0) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }

                                 var36 = 0;
                              } else if (var36 > 255) {
                                 var36 = 255;
                              }

                              var33 = md.as(var34, var35, var36, 441613106);
                           }

                           hk var37;
                           if (var3 > 0) {
                              if (var2 != 1670427112) {
                                 return;
                              }

                              boolean var60 = true;
                              if (var22 == 0) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 != cd.ab[var3][var12][var18]) {
                                    if (var2 != 1670427112) {
                                       throw new IllegalStateException();
                                    }

                                    var60 = false;
                                 }
                              }

                              if (var23 > 0) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }

                                 var36 = var23 - 1;
                                 var37 = (hk)hk.an.af((long)var36);
                                 hk var61;
                                 if (var37 != null) {
                                    if (var2 != 1670427112) {
                                       return;
                                    }

                                    var61 = var37;
                                 } else {
                                    byte[] var38 = hk.af.bh(4, var36, (byte)-94);
                                    var37 = new hk();
                                    if (var38 != null) {
                                       if (var2 != 1670427112) {
                                          throw new IllegalStateException();
                                       }

                                       var37.aw(new sg(var38), var36, (short)128);
                                    }

                                    var37.an(-1436922747);
                                    hk.an.aw(var37, (long)var36);
                                    var61 = var37;
                                 }

                                 if (!var61.au) {
                                    if (var2 != 1670427112) {
                                       throw new IllegalStateException();
                                    }

                                    var60 = false;
                                 }
                              }

                              if (var60) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }

                                 if (var24 == var25) {
                                    if (var2 != 1670427112) {
                                       throw new IllegalStateException();
                                    }

                                    if (var24 == var26) {
                                       if (var2 != 1670427112) {
                                          throw new IllegalStateException();
                                       }

                                       if (var27 == var24) {
                                          if (var2 != 1670427112) {
                                             throw new IllegalStateException();
                                          }

                                          var10000 = ge.ag[var3][var12];
                                          var10000[var18] |= 2340;
                                       }
                                    }
                                 }
                              }
                           }

                           var34 = 0;
                           if (var33 != -1) {
                              if (var2 != 1670427112) {
                                 return;
                              }

                              var34 = in.af[ar(var33, 96, -42895178)];
                           }

                           if (0 == var23) {
                              if (var2 != 1670427112) {
                                 return;
                              }

                              var0.ab(var3, var12, var18, 0, 0, -1, var24, var25, var26, var27, ar(var32, var28, -2133305210), ar(var32, var29, 1536691398), ar(var32, var30, -968775430), ar(var32, var31, -490721327), 0, 0, 0, 0, var34, 0);
                           } else {
                              var35 = cd.ab[var3][var12][var18] + 1;
                              byte var62 = cd.aq[var3][var12][var18];
                              int var63 = var23 - 1;
                              hk var39 = (hk)hk.an.af((long)var63);
                              if (var39 != null) {
                                 var37 = var39;
                              } else {
                                 byte[] var40 = hk.af.bh(4, var63, (byte)-118);
                                 var39 = new hk();
                                 if (var40 != null) {
                                    if (var2 != 1670427112) {
                                       throw new IllegalStateException();
                                    }

                                    var39.aw(new sg(var40), var63, (short)128);
                                 }

                                 var39.an(7091513);
                                 hk.an.aw(var39, (long)var63);
                                 var37 = var39;
                              }

                              int var64 = var37.ac * -202963991;
                              int var41;
                              int var42;
                              int var43;
                              int var44;
                              if (var64 >= 0) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }

                                 var42 = in.ab.aq.ac(var64, -570572153);
                                 var41 = -1;
                              } else if (16711935 == 1889574527 * var37.aw) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }

                                 var41 = -2;
                                 var64 = -1;
                                 var42 = -2;
                              } else {
                                 var41 = md.as(var37.aq * 174415927, var37.al * 470803713, var37.at * 532980473, -1858517383);
                                 var43 = -372405639 * cd.ae + var37.aq * 174415927 & 255;
                                 var44 = var37.at * 532980473 + cd.ap * -647485415;
                                 if (var44 < 0) {
                                    if (var2 != 1670427112) {
                                       throw new IllegalStateException();
                                    }

                                    var44 = 0;
                                 } else if (var44 > 255) {
                                    var44 = 255;
                                 }

                                 var42 = md.as(var43, var37.al * 470803713, var44, 38730890);
                              }

                              var43 = 0;
                              if (var42 != -2) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }

                                 var43 = in.af[sh.am(var42, 96, (byte)0)];
                              }

                              if (-1 != var37.ab * -2085280195) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }

                                 var44 = var37.aa * -187777599 + -372405639 * cd.ae & 255;
                                 int var45 = cd.ap * -647485415 + var37.ao * -1379609783;
                                 if (var45 < 0) {
                                    if (var2 != 1670427112) {
                                       throw new IllegalStateException();
                                    }

                                    var45 = 0;
                                 } else if (var45 > 255) {
                                    if (var2 != 1670427112) {
                                       throw new IllegalStateException();
                                    }

                                    var45 = 255;
                                 }

                                 var42 = md.as(var44, var37.ay * 1797179473, var45, 675538998);
                                 var43 = in.af[sh.am(var42, 96, (byte)0)];
                              }

                              var0.ab(var3, var12, var18, var35, var62, var64, var24, var25, var26, var27, ar(var32, var28, -1641725112), ar(var32, var29, 1192236720), ar(var32, var30, -85022442), ar(var32, var31, -1404869279), sh.am(var41, var28, (byte)0), sh.am(var41, var29, (byte)0), sh.am(var41, var30, (byte)0), sh.am(var41, var31, (byte)0), var34, var43);
                           }
                        }
                     }
                  }
               }
            }

            for(var12 = 1; var12 < 103; ++var12) {
               if (var2 != 1670427112) {
                  throw new IllegalStateException();
               }

               for(var13 = 1; var13 < 103; ++var13) {
                  if (var2 != 1670427112) {
                     throw new IllegalStateException();
                  }

                  var0.au(var3, var13, var12, bu.ax(var3, var13, var12, 1817276364));
               }
            }

            hu.ac[var3] = (short[][])null;
            cd.au[var3] = (short[][])null;
            cd.ab[var3] = (byte[][])null;
            cd.aq[var3] = (byte[][])null;
            cd.al[var3] = (byte[][])null;
         }

         var0.bx(-50, -10, -50);

         for(var3 = 0; var3 < 104; ++var3) {
            if (var2 != 1670427112) {
               throw new IllegalStateException();
            }

            for(var4 = 0; var4 < 104; ++var4) {
               if (var2 != 1670427112) {
                  throw new IllegalStateException();
               }

               if (2 == (cd.an[1][var3][var4] & 2)) {
                  if (var2 != 1670427112) {
                     throw new IllegalStateException();
                  }

                  var0.aw(var3, var4);
               }
            }
         }

         var3 = 1;
         var4 = 2;
         var5 = 4;

         for(var6 = 0; var6 < 4; ++var6) {
            if (var6 > 0) {
               if (var2 != 1670427112) {
                  throw new IllegalStateException();
               }

               var3 <<= 3;
               var4 <<= 3;
               var5 <<= 3;
            }

            for(int var50 = 0; var50 <= var6; ++var50) {
               if (var2 != 1670427112) {
                  throw new IllegalStateException();
               }

               for(int var51 = 0; var51 <= 104; ++var51) {
                  if (var2 != 1670427112) {
                     return;
                  }

                  for(int var52 = 0; var52 <= 104; ++var52) {
                     if (var2 != 1670427112) {
                        return;
                     }

                     short var54;
                     if (0 != (ge.ag[var50][var52][var51] & var3)) {
                        if (var2 != 1670427112) {
                           return;
                        }

                        var10 = var51;
                        var11 = var51;
                        var12 = var50;

                        for(var13 = var50; var10 > 0; --var10) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           if ((ge.ag[var50][var52][var10 - 1] & var3) == 0) {
                              break;
                           }
                        }

                        while(var11 < 104) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           if ((ge.ag[var50][var52][1 + var11] & var3) == 0) {
                              break;
                           }

                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           ++var11;
                        }

                        label839:
                        while(var12 > 0) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           for(var14 = var10; var14 <= var11; ++var14) {
                              if (var2 != 1670427112) {
                                 throw new IllegalStateException();
                              }

                              if (0 == (ge.ag[var12 - 1][var52][var14] & var3)) {
                                 if (var2 != 1670427112) {
                                    return;
                                 }
                                 break label839;
                              }
                           }

                           --var12;
                        }

                        label825:
                        while(var13 < var6) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           for(var14 = var10; var14 <= var11; ++var14) {
                              if (var2 != 1670427112) {
                                 throw new IllegalStateException();
                              }

                              if (0 == (ge.ag[var13 + 1][var52][var14] & var3)) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }
                                 break label825;
                              }
                           }

                           ++var13;
                        }

                        var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
                        if (var14 >= 8) {
                           if (var2 != 1670427112) {
                              return;
                           }

                           var54 = 240;
                           var16 = cd.af[var13][var52][var10] - var54;
                           var17 = cd.af[var12][var52][var10];
                           ie.ac(var6, 1, var52 * 128, 128 * var52, 128 * var10, var11 * 128 + 128, var16, var17);

                           for(var18 = var12; var18 <= var13; ++var18) {
                              if (var2 != 1670427112) {
                                 return;
                              }

                              for(var19 = var10; var19 <= var11; ++var19) {
                                 if (var2 != 1670427112) {
                                    return;
                                 }

                                 var10000 = ge.ag[var18][var52];
                                 var10000[var19] &= ~var3;
                              }
                           }
                        }
                     }

                     if ((ge.ag[var50][var52][var51] & var4) != 0) {
                        if (var2 != 1670427112) {
                           throw new IllegalStateException();
                        }

                        var10 = var52;
                        var11 = var52;
                        var12 = var50;

                        for(var13 = var50; var10 > 0 && (ge.ag[var50][var10 - 1][var51] & var4) != 0; --var10) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }
                        }

                        while(var11 < 104) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           if (0 == (ge.ag[var50][1 + var11][var51] & var4)) {
                              break;
                           }

                           ++var11;
                        }

                        label897:
                        while(var12 > 0) {
                           for(var14 = var10; var14 <= var11; ++var14) {
                              if (0 == (ge.ag[var12 - 1][var14][var51] & var4)) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }
                                 break label897;
                              }
                           }

                           --var12;
                        }

                        label886:
                        while(var13 < var6) {
                           for(var14 = var10; var14 <= var11; ++var14) {
                              if (var2 != 1670427112) {
                                 throw new IllegalStateException();
                              }

                              if (0 == (ge.ag[var13 + 1][var14][var51] & var4)) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }
                                 break label886;
                              }
                           }

                           ++var13;
                        }

                        var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
                        if (var14 >= 8) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           var54 = 240;
                           var16 = cd.af[var13][var10][var51] - var54;
                           var17 = cd.af[var12][var10][var51];
                           ie.ac(var6, 2, var10 * 128, var11 * 128 + 128, 128 * var51, 128 * var51, var16, var17);

                           for(var18 = var12; var18 <= var13; ++var18) {
                              for(var19 = var10; var19 <= var11; ++var19) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = ge.ag[var18][var19];
                                 var10000[var51] &= ~var4;
                              }
                           }
                        }
                     }

                     if ((ge.ag[var50][var52][var51] & var5) != 0) {
                        var10 = var52;
                        var11 = var52;
                        var12 = var51;

                        for(var13 = var51; var12 > 0; --var12) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           if ((ge.ag[var50][var52][var12 - 1] & var5) == 0) {
                              break;
                           }

                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }
                        }

                        while(var13 < 104) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           if (0 == (ge.ag[var50][var52][var13 + 1] & var5)) {
                              break;
                           }

                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           ++var13;
                        }

                        label957:
                        while(var10 > 0) {
                           if (var2 != 1670427112) {
                              throw new IllegalStateException();
                           }

                           for(var14 = var12; var14 <= var13; ++var14) {
                              if (var2 != 1670427112) {
                                 throw new IllegalStateException();
                              }

                              if ((ge.ag[var50][var10 - 1][var14] & var5) == 0) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }
                                 break label957;
                              }
                           }

                           --var10;
                        }

                        label943:
                        while(var11 < 104) {
                           for(var14 = var12; var14 <= var13; ++var14) {
                              if (var2 != 1670427112) {
                                 return;
                              }

                              if ((ge.ag[var50][1 + var11][var14] & var5) == 0) {
                                 if (var2 != 1670427112) {
                                    throw new IllegalStateException();
                                 }
                                 break label943;
                              }
                           }

                           ++var11;
                        }

                        if ((var13 - var12 + 1) * (1 + (var11 - var10)) >= 4) {
                           var14 = cd.af[var50][var10][var12];
                           ie.ac(var6, 4, var10 * 128, 128 + var11 * 128, 128 * var12, 128 + var13 * 128, var14, var14);

                           for(var15 = var10; var15 <= var11; ++var15) {
                              for(var16 = var12; var16 <= var13; ++var16) {
                                 if (var2 != 1670427112) {
                                    return;
                                 }

                                 var10000 = ge.ag[var50][var15];
                                 var10000[var16] &= ~var5;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var46) {
         throw db.an(var46, "ay.ao(" + ')');
      }
   }

   static sk od(int var0, int var1) {
      try {
         sk var2 = (sk)client.ww.af((long)var0);
         if (null == var2) {
            if (var1 >= 1719617706) {
               throw new IllegalStateException();
            }

            var2 = new sk(bu.gs, var0);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ay.od(" + ')');
      }
   }

   static final int ar(int var0, int var1, int var2) {
      try {
         if (var0 == -1) {
            return 12345678;
         } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
               if (var2 >= 1540039981) {
                  throw new IllegalStateException();
               }

               var1 = 2;
            } else if (var1 > 126) {
               var1 = 126;
            }

            return (var0 & 'ﾀ') + var1;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "ay.ar(" + ')');
      }
   }
}
