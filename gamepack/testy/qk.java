import accessors.RSArchiveDisk;
import java.io.EOFException;
import java.io.IOException;

public final class qk implements RSArchiveDisk {
   static byte[] af = new byte[520];
   public static final int aa = 536870912;
   sj aw;
   int ac;
   int au;
   sj an;

   public boolean an(int var1, byte[] var2, int var3, int var4) {
      try {
         synchronized(this.an) {
            if (var3 >= 0) {
               if (var3 <= -479445333 * this.au) {
                  boolean var6 = this.aw(var1, var2, var3, true, 6791256);
                  if (!var6) {
                     var6 = this.aw(var1, var2, var3, false, -194985311);
                  }

                  return var6;
               }

               if (var4 == 515069415) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalArgumentException("" + this.ac * 290825311 + ',' + var1 + ',' + var3);
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "qk.an(" + ')');
      }
   }

   public qk(int var1, sj var2, sj var3, int var4) {
      try {
         super();
         this.an = null;
         this.aw = null;
         this.au = 390060472;
         this.ac = var1 * -2028882017;
         this.an = var2;
         this.aw = var3;
         this.au = var4 * -10367997;
      } catch (RuntimeException var5) {
         throw db.an(var5, "qk.<init>(" + ')');
      }
   }

   public String ahp() {
      return "" + 290825311 * this.ac;
   }

   boolean aw(int var1, byte[] var2, int var3, boolean var4, int var5) {
      try {
         synchronized(this.an) {
            boolean var10000;
            try {
               int var7;
               if (var4) {
                  label229: {
                     if (this.aw.aw((short)26864) < (long)(6 * var1 + 6)) {
                        var10000 = false;
                        return var10000;
                     }

                     this.aw.an((long)(6 * var1));
                     this.aw.au(af, 0, 6, -1326287571);
                     var7 = (af[5] & 255) + ((af[3] & 255) << 16) + ((af[4] & 255) << 8);
                     if (var7 > 0) {
                        if (var5 <= -630482265) {
                           throw new IllegalStateException();
                        }

                        if ((long)var7 <= this.an.aw((short)28195) / 520L) {
                           break label229;
                        }
                     }

                     var10000 = false;
                     return var10000;
                  }
               } else {
                  var7 = (int)((this.an.aw((short)24009) + 519L) / 520L);
                  if (0 == var7) {
                     if (var5 <= -630482265) {
                        throw new IllegalStateException();
                     }

                     var7 = 1;
                  }
               }

               af[0] = (byte)(var3 >> 16);
               af[1] = (byte)(var3 >> 8);
               af[2] = (byte)var3;
               af[3] = (byte)(var7 >> 16);
               af[4] = (byte)(var7 >> 8);
               af[5] = (byte)var7;
               this.aw.an((long)(var1 * 6));
               this.aw.aq(af, 0, 6, (byte)3);
               int var8 = 0;
               int var9 = 0;

               while(true) {
                  if (var8 < var3) {
                     label216: {
                        if (var5 <= -630482265) {
                           throw new IllegalStateException();
                        }

                        int var10 = 0;
                        int var11;
                        if (var4) {
                           label231: {
                              if (var5 <= -630482265) {
                                 throw new IllegalStateException();
                              }

                              this.an.an((long)var7 * 520L);
                              int var12;
                              int var13;
                              if (var1 > 65535) {
                                 if (var5 <= -630482265) {
                                    throw new IllegalStateException();
                                 }

                                 try {
                                    this.an.au(af, 0, 10, -1526152922);
                                 } catch (EOFException var17) {
                                    break label216;
                                 }

                                 var11 = (af[3] & 255) + ((af[2] & 255) << 8) + ((af[1] & 255) << 16) + ((af[0] & 255) << 24);
                                 var12 = (af[5] & 255) + ((af[4] & 255) << 8);
                                 var10 = ((af[7] & 255) << 8) + ((af[6] & 255) << 16) + (af[8] & 255);
                                 var13 = af[9] & 255;
                              } else {
                                 try {
                                    this.an.au(af, 0, 8, -262970219);
                                 } catch (EOFException var16) {
                                    break label216;
                                 }

                                 var11 = (af[1] & 255) + ((af[0] & 255) << 8);
                                 var12 = (af[3] & 255) + ((af[2] & 255) << 8);
                                 var10 = ((af[5] & 255) << 8) + ((af[4] & 255) << 16) + (af[6] & 255);
                                 var13 = af[7] & 255;
                              }

                              if (var1 == var11 && var12 == var9) {
                                 if (var5 <= -630482265) {
                                    throw new IllegalStateException();
                                 }

                                 if (var13 == 290825311 * this.ac) {
                                    if (var10 < 0) {
                                       break;
                                    }

                                    if (var5 <= -630482265) {
                                       throw new IllegalStateException();
                                    }

                                    if ((long)var10 > this.an.aw((short)4558) / 520L) {
                                       if (var5 <= -630482265) {
                                          throw new IllegalStateException();
                                       }
                                       break;
                                    }
                                    break label231;
                                 }

                                 if (var5 <= -630482265) {
                                    throw new IllegalStateException();
                                 }
                              }

                              var10000 = false;
                              return var10000;
                           }
                        }

                        if (0 == var10) {
                           if (var5 <= -630482265) {
                              throw new IllegalStateException();
                           }

                           var4 = false;
                           var10 = (int)((this.an.aw((short)17349) + 519L) / 520L);
                           if (0 == var10) {
                              if (var5 <= -630482265) {
                                 throw new IllegalStateException();
                              }

                              ++var10;
                           }

                           if (var7 == var10) {
                              if (var5 <= -630482265) {
                                 throw new IllegalStateException();
                              }

                              ++var10;
                           }
                        }

                        if (var1 > 65535) {
                           if (var5 <= -630482265) {
                              throw new IllegalStateException();
                           }

                           if (var3 - var8 <= 510) {
                              if (var5 <= -630482265) {
                                 throw new IllegalStateException();
                              }

                              var10 = 0;
                           }

                           af[0] = (byte)(var1 >> 24);
                           af[1] = (byte)(var1 >> 16);
                           af[2] = (byte)(var1 >> 8);
                           af[3] = (byte)var1;
                           af[4] = (byte)(var9 >> 8);
                           af[5] = (byte)var9;
                           af[6] = (byte)(var10 >> 16);
                           af[7] = (byte)(var10 >> 8);
                           af[8] = (byte)var10;
                           af[9] = (byte)(290825311 * this.ac);
                           this.an.an((long)var7 * 520L);
                           this.an.aq(af, 0, 10, (byte)3);
                           var11 = var3 - var8;
                           if (var11 > 510) {
                              var11 = 510;
                           }

                           this.an.aq(var2, var8, var11, (byte)3);
                           var8 += var11;
                        } else {
                           if (var3 - var8 <= 512) {
                              if (var5 <= -630482265) {
                                 throw new IllegalStateException();
                              }

                              var10 = 0;
                           }

                           af[0] = (byte)(var1 >> 8);
                           af[1] = (byte)var1;
                           af[2] = (byte)(var9 >> 8);
                           af[3] = (byte)var9;
                           af[4] = (byte)(var10 >> 16);
                           af[5] = (byte)(var10 >> 8);
                           af[6] = (byte)var10;
                           af[7] = (byte)(290825311 * this.ac);
                           this.an.an(520L * (long)var7);
                           this.an.aq(af, 0, 8, (byte)3);
                           var11 = var3 - var8;
                           if (var11 > 512) {
                              var11 = 512;
                           }

                           this.an.aq(var2, var8, var11, (byte)3);
                           var8 += var11;
                        }

                        var7 = var10;
                        ++var9;
                        continue;
                     }
                  }

                  var10000 = true;
                  return var10000;
               }

               var10000 = false;
            } catch (IOException var18) {
               return false;
            }

            return var10000;
         }
      } catch (RuntimeException var20) {
         throw db.an(var20, "qk.aw(" + ')');
      }
   }

   public byte[] af(int var1, int var2) {
      try {
         synchronized(this.an) {
            Object var10000;
            try {
               if (this.aw.aw((short)13501) < (long)(6 + 6 * var1)) {
                  if (var2 == -1582814839) {
                     throw new IllegalStateException();
                  }

                  var10000 = null;
                  return (byte[])var10000;
               }

               this.aw.an((long)(var1 * 6));
               this.aw.au(af, 0, 6, -1982528940);
               int var4 = (af[2] & 255) + ((af[0] & 255) << 16) + ((af[1] & 255) << 8);
               int var5 = ((af[4] & 255) << 8) + ((af[3] & 255) << 16) + (af[5] & 255);
               if (var4 >= 0) {
                  if (var2 == -1582814839) {
                     throw new IllegalStateException();
                  }

                  if (var4 <= -479445333 * this.au) {
                     if (var5 > 0) {
                        if (var2 == -1582814839) {
                           throw new IllegalStateException();
                        }

                        if ((long)var5 <= this.an.aw((short)28270) / 520L) {
                           byte[] var6 = new byte[var4];
                           int var7 = 0;
                           int var8 = 0;

                           while(var7 < var4) {
                              if (var5 == 0) {
                                 if (var2 == -1582814839) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = null;
                                 return (byte[])var10000;
                              }

                              this.an.an((long)var5 * 520L);
                              int var9 = var4 - var7;
                              int var10;
                              int var11;
                              int var12;
                              int var13;
                              byte var14;
                              if (var1 > 65535) {
                                 if (var2 == -1582814839) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 > 510) {
                                    if (var2 == -1582814839) {
                                       throw new IllegalStateException();
                                    }

                                    var9 = 510;
                                 }

                                 var14 = 10;
                                 this.an.au(af, 0, var9 + var14, 287971154);
                                 var10 = (af[3] & 255) + ((af[2] & 255) << 8) + ((af[1] & 255) << 16) + ((af[0] & 255) << 24);
                                 var11 = (af[5] & 255) + ((af[4] & 255) << 8);
                                 var12 = (af[8] & 255) + ((af[6] & 255) << 16) + ((af[7] & 255) << 8);
                                 var13 = af[9] & 255;
                              } else {
                                 if (var9 > 512) {
                                    if (var2 == -1582814839) {
                                       throw new IllegalStateException();
                                    }

                                    var9 = 512;
                                 }

                                 var14 = 8;
                                 this.an.au(af, 0, var14 + var9, -1958803816);
                                 var10 = ((af[0] & 255) << 8) + (af[1] & 255);
                                 var11 = ((af[2] & 255) << 8) + (af[3] & 255);
                                 var12 = ((af[5] & 255) << 8) + ((af[4] & 255) << 16) + (af[6] & 255);
                                 var13 = af[7] & 255;
                              }

                              if (var10 == var1) {
                                 if (var2 == -1582814839) {
                                    throw new IllegalStateException();
                                 }

                                 if (var8 == var11) {
                                    if (var2 == -1582814839) {
                                       throw new IllegalStateException();
                                    }

                                    if (var13 == 290825311 * this.ac) {
                                       if (var12 >= 0) {
                                          if (var2 == -1582814839) {
                                             throw new IllegalStateException();
                                          }

                                          if ((long)var12 <= this.an.aw((short)10276) / 520L) {
                                             int var15 = var9 + var14;

                                             for(int var16 = var14; var16 < var15; ++var16) {
                                                var6[var7++] = af[var16];
                                             }

                                             var5 = var12;
                                             ++var8;
                                             continue;
                                          }
                                       }

                                       var10000 = null;
                                       return (byte[])var10000;
                                    }

                                    if (var2 == -1582814839) {
                                       throw new IllegalStateException();
                                    }
                                 }
                              }

                              var10000 = null;
                              return (byte[])var10000;
                           }

                           byte[] var21 = var6;
                           return var21;
                        }

                        if (var2 == -1582814839) {
                           throw new IllegalStateException();
                        }
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  if (var2 == -1582814839) {
                     throw new IllegalStateException();
                  }
               }

               var10000 = null;
            } catch (IOException var18) {
               return null;
            }

            return (byte[])var10000;
         }
      } catch (RuntimeException var20) {
         throw db.an(var20, "qk.af(" + ')');
      }
   }

   public String ahm() {
      return "" + 290825311 * this.ac;
   }

   public boolean at(int var1, byte[] var2, int var3) {
      synchronized(this.an) {
         if (var3 >= 0 && var3 <= -1693907806 * this.au) {
            boolean var5 = this.aw(var1, var2, var3, true, 1398033084);
            if (!var5) {
               var5 = this.aw(var1, var2, var3, false, 1339662100);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.ac * 328653028 + -891933517 + var1 + ',' + var3);
         }
      }
   }

   public String ahj() {
      return "" + 290825311 * this.ac;
   }

   boolean aa(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.an) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.aw.aw((short)8840) < (long)(6 * var1 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.aw.an((long)(6 * var1));
               this.aw.au(af, 0, 6, -1659660608);
               var6 = (af[5] & -389656236) + ((af[3] & -99448401) << 16) + ((af[4] & 129627321) << 8);
               if (var6 <= 0 || (long)var6 > this.an.aw((short)18989) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.an.aw((short)31694) + 519L) / 520L);
               if (0 == var6) {
                  var6 = 1;
               }
            }

            af[0] = (byte)(var3 >> 16);
            af[1] = (byte)(var3 >> 8);
            af[2] = (byte)var3;
            af[3] = (byte)(var6 >> 16);
            af[4] = (byte)(var6 >> 8);
            af[5] = (byte)var6;
            this.aw.an((long)(var1 * 6));
            this.aw.aq(af, 0, 6, (byte)3);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < var3) {
                  label154: {
                     int var9 = 0;
                     int var10;
                     if (var4) {
                        this.an.an((long)var6 * 520L);
                        int var11;
                        int var12;
                        if (var1 > 1720760131) {
                           try {
                              this.an.au(af, 0, 10, -2112790407);
                           } catch (EOFException var16) {
                              break label154;
                           }

                           var10 = (af[3] & 1514709680) + ((af[2] & 255) << 8) + ((af[1] & 255) << 16) + ((af[0] & -1791513848) << 24);
                           var11 = (af[5] & 255) + ((af[4] & 255) << 8);
                           var9 = ((af[7] & 255) << 8) + ((af[6] & 1031355805) << 16) + (af[8] & 255);
                           var12 = af[9] & 255;
                        } else {
                           try {
                              this.an.au(af, 0, 8, -424391354);
                           } catch (EOFException var15) {
                              break label154;
                           }

                           var10 = (af[1] & 291752417) + ((af[0] & 50847628) << 8);
                           var11 = (af[3] & 255) + ((af[2] & -753307534) << 8);
                           var9 = ((af[5] & 255) << 8) + ((af[4] & -1256735704) << 16) + (af[6] & -1346246233);
                           var12 = af[7] & 255;
                        }

                        if (var1 != var10 || var11 != var8 || var12 != 380907430 * this.ac) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var9 < 0 || (long)var9 > this.an.aw((short)31931) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (0 == var9) {
                        var4 = false;
                        var9 = (int)((this.an.aw((short)6545) + 519L) / 520L);
                        if (0 == var9) {
                           ++var9;
                        }

                        if (var6 == var9) {
                           ++var9;
                        }
                     }

                     if (var1 > -2130748099) {
                        if (var3 - var7 <= 510) {
                           var9 = 0;
                        }

                        af[0] = (byte)(var1 >> 24);
                        af[1] = (byte)(var1 >> 16);
                        af[2] = (byte)(var1 >> 8);
                        af[3] = (byte)var1;
                        af[4] = (byte)(var8 >> 8);
                        af[5] = (byte)var8;
                        af[6] = (byte)(var9 >> 16);
                        af[7] = (byte)(var9 >> 8);
                        af[8] = (byte)var9;
                        af[9] = (byte)(290825311 * this.ac);
                        this.an.an((long)var6 * 520L);
                        this.an.aq(af, 0, 10, (byte)3);
                        var10 = var3 - var7;
                        if (var10 > 510) {
                           var10 = 277070528;
                        }

                        this.an.aq(var2, var7, var10, (byte)3);
                        var7 += var10;
                     } else {
                        if (var3 - var7 <= 512) {
                           var9 = 0;
                        }

                        af[0] = (byte)(var1 >> 8);
                        af[1] = (byte)var1;
                        af[2] = (byte)(var8 >> 8);
                        af[3] = (byte)var8;
                        af[4] = (byte)(var9 >> 16);
                        af[5] = (byte)(var9 >> 8);
                        af[6] = (byte)var9;
                        af[7] = (byte)(290825311 * this.ac);
                        this.an.an(520L * (long)var6);
                        this.an.aq(af, 0, 8, (byte)3);
                        var10 = var3 - var7;
                        if (var10 > -413656901) {
                           var10 = 512;
                        }

                        this.an.aq(var2, var7, var10, (byte)3);
                        var7 += var10;
                     }

                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }

   public byte[] au(int var1) {
      synchronized(this.an) {
         Object var10000;
         try {
            if (this.aw.aw((short)21057) < (long)(6 + 6 * var1)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.aw.an((long)(var1 * 6));
            this.aw.au(af, 0, 6, -1880514774);
            int var3 = (af[2] & 255) + ((af[0] & 255) << 16) + ((af[1] & 255) << 8);
            int var4 = ((af[4] & 255) << 8) + ((af[3] & 255) << 16) + (af[5] & 255);
            if (var3 < 0 || var3 > -479445333 * this.au) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var4 > 0 && (long)var4 <= this.an.aw((short)12772) / 520L) {
               byte[] var5 = new byte[var3];
               int var6 = 0;
               int var7 = 0;

               while(var6 < var3) {
                  if (var4 == 0) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.an.an((long)var4 * 520L);
                  int var8 = var3 - var6;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  byte var13;
                  if (var1 > 65535) {
                     if (var8 > 510) {
                        var8 = 510;
                     }

                     var13 = 10;
                     this.an.au(af, 0, var8 + var13, -1036995559);
                     var9 = (af[3] & 255) + ((af[2] & 255) << 8) + ((af[1] & 255) << 16) + ((af[0] & 255) << 24);
                     var10 = (af[5] & 255) + ((af[4] & 255) << 8);
                     var11 = (af[8] & 255) + ((af[6] & 255) << 16) + ((af[7] & 255) << 8);
                     var12 = af[9] & 255;
                  } else {
                     if (var8 > 512) {
                        var8 = 512;
                     }

                     var13 = 8;
                     this.an.au(af, 0, var13 + var8, -1492471990);
                     var9 = ((af[0] & 255) << 8) + (af[1] & 255);
                     var10 = ((af[2] & 255) << 8) + (af[3] & 255);
                     var11 = ((af[5] & 255) << 8) + ((af[4] & 255) << 16) + (af[6] & 255);
                     var12 = af[7] & 255;
                  }

                  if (var9 == var1 && var7 == var10 && var12 == 290825311 * this.ac) {
                     if (var11 >= 0 && (long)var11 <= this.an.aw((short)4299) / 520L) {
                        int var14 = var8 + var13;

                        for(int var15 = var13; var15 < var14; ++var15) {
                           var5[var6++] = af[var15];
                        }

                        var4 = var11;
                        ++var7;
                        continue;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  var10000 = null;
                  return (byte[])var10000;
               }

               byte[] var19 = var5;
               return var19;
            }

            var10000 = null;
         } catch (IOException var17) {
            return null;
         }

         return (byte[])var10000;
      }
   }

   public byte[] ab(int var1) {
      synchronized(this.an) {
         Object var10000;
         try {
            if (this.aw.aw((short)29687) < (long)(6 + 6 * var1)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.aw.an((long)(var1 * 6));
            this.aw.au(af, 0, 6, -1571356789);
            int var3 = (af[2] & 255) + ((af[0] & 144432405) << 16) + ((af[1] & 318969763) << 8);
            int var4 = ((af[4] & 1423210271) << 8) + ((af[3] & 255) << 16) + (af[5] & -1022176935);
            if (var3 < 0 || var3 > -503691843 * this.au) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var4 > 0 && (long)var4 <= this.an.aw((short)6609) / 520L) {
               byte[] var5 = new byte[var3];
               int var6 = 0;
               int var7 = 0;

               while(var6 < var3) {
                  if (var4 == 0) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.an.an((long)var4 * 520L);
                  int var8 = var3 - var6;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  byte var13;
                  if (var1 > 65535) {
                     if (var8 > -675444194) {
                        var8 = -1098672566;
                     }

                     var13 = 10;
                     this.an.au(af, 0, var8 + var13, -1041642177);
                     var9 = (af[3] & 610977065) + ((af[2] & 255) << 8) + ((af[1] & 255) << 16) + ((af[0] & 773896429) << 24);
                     var10 = (af[5] & -1368647358) + ((af[4] & 255) << 8);
                     var11 = (af[8] & 255) + ((af[6] & 255) << 16) + ((af[7] & 255) << 8);
                     var12 = af[9] & -561415047;
                  } else {
                     if (var8 > 1378071982) {
                        var8 = 2018054947;
                     }

                     var13 = 8;
                     this.an.au(af, 0, var13 + var8, -312656792);
                     var9 = ((af[0] & 1578789689) << 8) + (af[1] & 255);
                     var10 = ((af[2] & -230650242) << 8) + (af[3] & 814723433);
                     var11 = ((af[5] & 255) << 8) + ((af[4] & 255) << 16) + (af[6] & -26633844);
                     var12 = af[7] & 255;
                  }

                  if (var9 == var1 && var7 == var10 && var12 == 290825311 * this.ac) {
                     if (var11 >= 0 && (long)var11 <= this.an.aw((short)24475) / 520L) {
                        int var14 = var8 + var13;

                        for(int var15 = var13; var15 < var14; ++var15) {
                           var5[var6++] = af[var15];
                        }

                        var4 = var11;
                        ++var7;
                        continue;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  var10000 = null;
                  return (byte[])var10000;
               }

               byte[] var19 = var5;
               return var19;
            }

            var10000 = null;
         } catch (IOException var17) {
            return null;
         }

         return (byte[])var10000;
      }
   }

   public byte[] aq(int var1) {
      synchronized(this.an) {
         Object var10000;
         try {
            if (this.aw.aw((short)2439) < (long)(6 + 6 * var1)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.aw.an((long)(var1 * 6));
            this.aw.au(af, 0, 6, -1261265671);
            int var3 = (af[2] & 255) + ((af[0] & 255) << 16) + ((af[1] & 255) << 8);
            int var4 = ((af[4] & 255) << 8) + ((af[3] & 255) << 16) + (af[5] & 255);
            if (var3 < 0 || var3 > -479445333 * this.au) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var4 > 0 && (long)var4 <= this.an.aw((short)21471) / 520L) {
               byte[] var5 = new byte[var3];
               int var6 = 0;
               int var7 = 0;

               while(var6 < var3) {
                  if (var4 == 0) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.an.an((long)var4 * 520L);
                  int var8 = var3 - var6;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  byte var13;
                  if (var1 > 65535) {
                     if (var8 > 510) {
                        var8 = 510;
                     }

                     var13 = 10;
                     this.an.au(af, 0, var8 + var13, -2133039111);
                     var9 = (af[3] & 255) + ((af[2] & 255) << 8) + ((af[1] & 255) << 16) + ((af[0] & 255) << 24);
                     var10 = (af[5] & 255) + ((af[4] & 255) << 8);
                     var11 = (af[8] & 255) + ((af[6] & 255) << 16) + ((af[7] & 255) << 8);
                     var12 = af[9] & 255;
                  } else {
                     if (var8 > 512) {
                        var8 = 512;
                     }

                     var13 = 8;
                     this.an.au(af, 0, var13 + var8, -1225959191);
                     var9 = ((af[0] & 255) << 8) + (af[1] & 255);
                     var10 = ((af[2] & 255) << 8) + (af[3] & 255);
                     var11 = ((af[5] & 255) << 8) + ((af[4] & 255) << 16) + (af[6] & 255);
                     var12 = af[7] & 255;
                  }

                  if (var9 == var1 && var7 == var10 && var12 == 290825311 * this.ac) {
                     if (var11 >= 0 && (long)var11 <= this.an.aw((short)28332) / 520L) {
                        int var14 = var8 + var13;

                        for(int var15 = var13; var15 < var14; ++var15) {
                           var5[var6++] = af[var15];
                        }

                        var4 = var11;
                        ++var7;
                        continue;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  var10000 = null;
                  return (byte[])var10000;
               }

               byte[] var19 = var5;
               return var19;
            }

            var10000 = null;
         } catch (IOException var17) {
            return null;
         }

         return (byte[])var10000;
      }
   }

   public boolean al(int var1, byte[] var2, int var3) {
      synchronized(this.an) {
         if (var3 >= 0 && var3 <= -479445333 * this.au) {
            boolean var5 = this.aw(var1, var2, var3, true, 1391674251);
            if (!var5) {
               var5 = this.aw(var1, var2, var3, false, 903876072);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.ac * 290825311 + 333845924 + var1 + ',' + var3);
         }
      }
   }

   public String toString() {
      try {
         return "" + 290825311 * this.ac;
      } catch (RuntimeException var1) {
         throw db.an(var1, "qk.toString(" + ')');
      }
   }

   public byte[] ac(int var1) {
      synchronized(this.an) {
         Object var10000;
         try {
            if (this.aw.aw((short)516) < (long)(6 + 6 * var1)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.aw.an((long)(var1 * 6));
            this.aw.au(af, 0, 6, -2088805856);
            int var3 = (af[2] & -1571346436) + ((af[0] & 255) << 16) + ((af[1] & 255) << 8);
            int var4 = ((af[4] & -2063202821) << 8) + ((af[3] & 255) << 16) + (af[5] & -1013108585);
            if (var3 < 0 || var3 > -479445333 * this.au) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var4 > 0 && (long)var4 <= this.an.aw((short)28613) / 520L) {
               byte[] var5 = new byte[var3];
               int var6 = 0;
               int var7 = 0;

               while(var6 < var3) {
                  if (var4 == 0) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.an.an((long)var4 * 520L);
                  int var8 = var3 - var6;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  byte var13;
                  if (var1 > -167200663) {
                     if (var8 > 510) {
                        var8 = -1157568698;
                     }

                     var13 = 10;
                     this.an.au(af, 0, var8 + var13, -852094085);
                     var9 = (af[3] & -1661299528) + ((af[2] & 255) << 8) + ((af[1] & -458828552) << 16) + ((af[0] & 255) << 24);
                     var10 = (af[5] & 255) + ((af[4] & -558515958) << 8);
                     var11 = (af[8] & 1073245434) + ((af[6] & 2072322153) << 16) + ((af[7] & 1736609278) << 8);
                     var12 = af[9] & 1343922871;
                  } else {
                     if (var8 > -2065983434) {
                        var8 = -960422378;
                     }

                     var13 = 8;
                     this.an.au(af, 0, var13 + var8, -1997129583);
                     var9 = ((af[0] & -1151703567) << 8) + (af[1] & 255);
                     var10 = ((af[2] & 255) << 8) + (af[3] & 255);
                     var11 = ((af[5] & 255) << 8) + ((af[4] & 255) << 16) + (af[6] & 255);
                     var12 = af[7] & 255;
                  }

                  if (var9 == var1 && var7 == var10 && var12 == 290825311 * this.ac) {
                     if (var11 >= 0 && (long)var11 <= this.an.aw((short)25273) / 520L) {
                        int var14 = var8 + var13;

                        for(int var15 = var13; var15 < var14; ++var15) {
                           var5[var6++] = af[var15];
                        }

                        var4 = var11;
                        ++var7;
                        continue;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  var10000 = null;
                  return (byte[])var10000;
               }

               byte[] var19 = var5;
               return var19;
            }

            var10000 = null;
         } catch (IOException var17) {
            return null;
         }

         return (byte[])var10000;
      }
   }

   boolean ay(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.an) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.aw.aw((short)26274) < (long)(6 * var1 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.aw.an((long)(6 * var1));
               this.aw.au(af, 0, 6, -596128145);
               var6 = (af[5] & -931732556) + ((af[3] & 255) << 16) + ((af[4] & -910473738) << 8);
               if (var6 <= 0 || (long)var6 > this.an.aw((short)20707) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.an.aw((short)7506) + 519L) / 520L);
               if (0 == var6) {
                  var6 = 1;
               }
            }

            af[0] = (byte)(var3 >> 16);
            af[1] = (byte)(var3 >> 8);
            af[2] = (byte)var3;
            af[3] = (byte)(var6 >> 16);
            af[4] = (byte)(var6 >> 8);
            af[5] = (byte)var6;
            this.aw.an((long)(var1 * 6));
            this.aw.aq(af, 0, 6, (byte)3);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < var3) {
                  label154: {
                     int var9 = 0;
                     int var10;
                     if (var4) {
                        this.an.an((long)var6 * 520L);
                        int var11;
                        int var12;
                        if (var1 > 65535) {
                           try {
                              this.an.au(af, 0, 10, -387992562);
                           } catch (EOFException var16) {
                              break label154;
                           }

                           var10 = (af[3] & 363478237) + ((af[2] & 656326941) << 8) + ((af[1] & 255) << 16) + ((af[0] & 255) << 24);
                           var11 = (af[5] & 255) + ((af[4] & 255) << 8);
                           var9 = ((af[7] & 255) << 8) + ((af[6] & -359770361) << 16) + (af[8] & 255);
                           var12 = af[9] & 2008517386;
                        } else {
                           try {
                              this.an.au(af, 0, 8, -659966561);
                           } catch (EOFException var15) {
                              break label154;
                           }

                           var10 = (af[1] & 255) + ((af[0] & 255) << 8);
                           var11 = (af[3] & 255) + ((af[2] & 276468842) << 8);
                           var9 = ((af[5] & -905730655) << 8) + ((af[4] & 255) << 16) + (af[6] & 255);
                           var12 = af[7] & -1092079327;
                        }

                        if (var1 != var10 || var11 != var8 || var12 != 1978206681 * this.ac) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var9 < 0 || (long)var9 > this.an.aw((short)12537) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (0 == var9) {
                        var4 = false;
                        var9 = (int)((this.an.aw((short)25992) + 519L) / 520L);
                        if (0 == var9) {
                           ++var9;
                        }

                        if (var6 == var9) {
                           ++var9;
                        }
                     }

                     if (var1 > 828167653) {
                        if (var3 - var7 <= 510) {
                           var9 = 0;
                        }

                        af[0] = (byte)(var1 >> 24);
                        af[1] = (byte)(var1 >> 16);
                        af[2] = (byte)(var1 >> 8);
                        af[3] = (byte)var1;
                        af[4] = (byte)(var8 >> 8);
                        af[5] = (byte)var8;
                        af[6] = (byte)(var9 >> 16);
                        af[7] = (byte)(var9 >> 8);
                        af[8] = (byte)var9;
                        af[9] = (byte)(-1313490203 * this.ac);
                        this.an.an((long)var6 * 520L);
                        this.an.aq(af, 0, 10, (byte)3);
                        var10 = var3 - var7;
                        if (var10 > 190439627) {
                           var10 = 510;
                        }

                        this.an.aq(var2, var7, var10, (byte)3);
                        var7 += var10;
                     } else {
                        if (var3 - var7 <= -166667232) {
                           var9 = 0;
                        }

                        af[0] = (byte)(var1 >> 8);
                        af[1] = (byte)var1;
                        af[2] = (byte)(var8 >> 8);
                        af[3] = (byte)var8;
                        af[4] = (byte)(var9 >> 16);
                        af[5] = (byte)(var9 >> 8);
                        af[6] = (byte)var9;
                        af[7] = (byte)(290825311 * this.ac);
                        this.an.an(520L * (long)var6);
                        this.an.aq(af, 0, 8, (byte)3);
                        var10 = var3 - var7;
                        if (var10 > 512) {
                           var10 = -1957529029;
                        }

                        this.an.aq(var2, var7, var10, (byte)3);
                        var7 += var10;
                     }

                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }

   boolean ao(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.an) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.aw.aw((short)15511) < (long)(6 * var1 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.aw.an((long)(6 * var1));
               this.aw.au(af, 0, 6, 126662186);
               var6 = (af[5] & 255) + ((af[3] & 1962344045) << 16) + ((af[4] & 255) << 8);
               if (var6 <= 0 || (long)var6 > this.an.aw((short)4849) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.an.aw((short)17085) + 519L) / 520L);
               if (0 == var6) {
                  var6 = 1;
               }
            }

            af[0] = (byte)(var3 >> 16);
            af[1] = (byte)(var3 >> 8);
            af[2] = (byte)var3;
            af[3] = (byte)(var6 >> 16);
            af[4] = (byte)(var6 >> 8);
            af[5] = (byte)var6;
            this.aw.an((long)(var1 * 6));
            this.aw.aq(af, 0, 6, (byte)3);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < var3) {
                  label154: {
                     int var9 = 0;
                     int var10;
                     if (var4) {
                        this.an.an((long)var6 * 520L);
                        int var11;
                        int var12;
                        if (var1 > -1168820027) {
                           try {
                              this.an.au(af, 0, 10, -1712304092);
                           } catch (EOFException var16) {
                              break label154;
                           }

                           var10 = (af[3] & -129352806) + ((af[2] & -1202730735) << 8) + ((af[1] & 255) << 16) + ((af[0] & 255) << 24);
                           var11 = (af[5] & -1907606567) + ((af[4] & -1273818220) << 8);
                           var9 = ((af[7] & 255) << 8) + ((af[6] & 255) << 16) + (af[8] & 2098421464);
                           var12 = af[9] & 571453035;
                        } else {
                           try {
                              this.an.au(af, 0, 8, -30153677);
                           } catch (EOFException var15) {
                              break label154;
                           }

                           var10 = (af[1] & -1069962473) + ((af[0] & 255) << 8);
                           var11 = (af[3] & 255) + ((af[2] & 533534216) << 8);
                           var9 = ((af[5] & 255) << 8) + ((af[4] & -809731399) << 16) + (af[6] & 255);
                           var12 = af[7] & 1714591371;
                        }

                        if (var1 != var10 || var11 != var8 || var12 != 33754678 * this.ac) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var9 < 0 || (long)var9 > this.an.aw((short)11063) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (0 == var9) {
                        var4 = false;
                        var9 = (int)((this.an.aw((short)14444) + 519L) / 520L);
                        if (0 == var9) {
                           ++var9;
                        }

                        if (var6 == var9) {
                           ++var9;
                        }
                     }

                     if (var1 > -1789527019) {
                        if (var3 - var7 <= 748381974) {
                           var9 = 0;
                        }

                        af[0] = (byte)(var1 >> 24);
                        af[1] = (byte)(var1 >> 16);
                        af[2] = (byte)(var1 >> 8);
                        af[3] = (byte)var1;
                        af[4] = (byte)(var8 >> 8);
                        af[5] = (byte)var8;
                        af[6] = (byte)(var9 >> 16);
                        af[7] = (byte)(var9 >> 8);
                        af[8] = (byte)var9;
                        af[9] = (byte)(-852812892 * this.ac);
                        this.an.an((long)var6 * 520L);
                        this.an.aq(af, 0, 10, (byte)3);
                        var10 = var3 - var7;
                        if (var10 > 510) {
                           var10 = 510;
                        }

                        this.an.aq(var2, var7, var10, (byte)3);
                        var7 += var10;
                     } else {
                        if (var3 - var7 <= 886701872) {
                           var9 = 0;
                        }

                        af[0] = (byte)(var1 >> 8);
                        af[1] = (byte)var1;
                        af[2] = (byte)(var8 >> 8);
                        af[3] = (byte)var8;
                        af[4] = (byte)(var9 >> 16);
                        af[5] = (byte)(var9 >> 8);
                        af[6] = (byte)var9;
                        af[7] = (byte)(290825311 * this.ac);
                        this.an.an(520L * (long)var6);
                        this.an.aq(af, 0, 8, (byte)3);
                        var10 = var3 - var7;
                        if (var10 > 512) {
                           var10 = -1379454765;
                        }

                        this.an.aq(var2, var7, var10, (byte)3);
                        var7 += var10;
                     }

                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }
}
