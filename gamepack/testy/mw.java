import accessors.RSPlayerAppearance;
import java.util.Arrays;

public class mw implements RSPlayerAppearance {
   public static short[][] ao;
   static kh ar;
   int[] aw;
   static final int sw = 7680;
   public int ac;
   public int ab;
   long aq;
   long al;
   gx[] at;
   boolean aa;
   public static short[] ay;
   int[] an;
   static final int[] ag;
   public static final int dr = 105;
   public int au;
   int[] af;

   public void au(int var1, boolean var2, int var3) {
      try {
         if (var1 == 1) {
            if (var3 >= 1720825291) {
               throw new IllegalStateException();
            }

            if (1 == this.au * 1693987821) {
               if (var3 >= 1720825291) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         int var4 = this.an[ag[var1]];
         if (0 == var4) {
            if (var3 >= 1720825291) {
               throw new IllegalStateException();
            }
         } else {
            var4 -= 256;

            while(true) {
               if (!var2) {
                  if (var3 >= 1720825291) {
                     throw new IllegalStateException();
                  }

                  --var4;
                  if (var4 < 0) {
                     if (var3 >= 1720825291) {
                        return;
                     }

                     var4 = hj.aw * 743589639 - 1;
                  }
               } else {
                  ++var4;
                  if (var4 >= 743589639 * hj.aw) {
                     var4 = 0;
                  }
               }

               hj var5 = dn.an(var4, 607363354);
               if (null != var5 && !var5.ao) {
                  if (var3 >= 1720825291) {
                     throw new IllegalStateException();
                  }

                  int var10000 = var5.au * 1015855167;
                  byte var10002;
                  if (1 == this.au * 1693987821) {
                     if (var3 >= 1720825291) {
                        throw new IllegalStateException();
                     }

                     var10002 = 7;
                  } else {
                     var10002 = 0;
                  }

                  if (var10000 == var1 + var10002) {
                     if (var3 >= 1720825291) {
                        return;
                     }

                     this.an[ag[var1]] = 256 + var4;
                     this.at(1418315210);
                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "mw.au(" + ')');
      }
   }

   public void be(int var1, boolean var2) {
      if (var1 != 1 || 1 != this.au * 1693987821) {
         int var3 = this.an[ag[var1]];
         if (0 != var3) {
            var3 -= 256;

            hj var4;
            do {
               if (!var2) {
                  --var3;
                  if (var3 < 0) {
                     var3 = hj.aw * 743589639 - 1;
                  }
               } else {
                  ++var3;
                  if (var3 >= 743589639 * hj.aw) {
                     var3 = 0;
                  }
               }

               var4 = dn.an(var3, -1668342574);
            } while(null == var4 || var4.ao || var4.au * 1015855167 != var1 + (1 == this.au * 1693987821 ? 7 : 0));

            this.an[ag[var1]] = 256 + var3;
            this.at(1418315210);
         }
      }
   }

   public void af(int[] var1, int[] var2, gx[] var3, boolean var4, int[] var5, int var6, int var7, int var8, byte var9) {
      try {
         this.at = var3;
         this.aa = var4;
         this.ac = var8 * 1029929221;
         this.an(var1, var2, var5, var6, var7, -84427173);
      } catch (RuntimeException var10) {
         throw db.an(var10, "mw.af(" + ')');
      }
   }

   public void an(int[] var1, int[] var2, int[] var3, int var4, int var5, int var6) {
      try {
         if (null == var1) {
            if (var6 <= -397694263) {
               return;
            }

            var1 = this.aw(var4, -1826313610);
         }

         if (null == var2) {
            if (var6 <= -397694263) {
               throw new IllegalStateException();
            }

            var2 = this.aw(var4, 1564505092);
         }

         this.af = var1;
         this.an = var2;
         this.aw = var3;
         this.au = 325591525 * var4;
         this.ab = -11568601 * var5;
         this.at(1418315210);
      } catch (RuntimeException var7) {
         throw db.an(var7, "mw.an(" + ')');
      }
   }

   public void ag(int[] var1, int[] var2, gx[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.at = var3;
      this.aa = var4;
      this.ac = var8 * 1029929221;
      this.an(var1, var2, var5, var6, var7, 8277253);
   }

   static void bb(int var0, int[] var1, int var2) {
      for(int var3 = 0; var3 < 743589639 * hj.aw; ++var3) {
         hj var4 = dn.an(var3, 857953210);
         if (var4 != null && !var4.ao && (1 == var0 ? 7 : 0) + var2 == 1015855167 * var4.au) {
            var1[ag[var2]] = 256 + var3;
            break;
         }
      }

   }

   public static void bl() {
      ar.ac();
   }

   public void aq(int var1, int var2) {
      try {
         if (1693987821 * this.au != var1) {
            this.an((int[])null, (int[])null, this.aw, var1, -1, 1968160037);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "mw.aq(" + ')');
      }
   }

   public void al(sg var1, byte var2) {
      try {
         var1.bu(1693987821 * this.au, (byte)8);

         int var3;
         for(var3 = 0; var3 < 7; ++var3) {
            int var4 = this.an[ag[var3]];
            if (var4 == 0) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               var1.bu(-1, (byte)63);
            } else {
               var1.bu(var4 - 256, (byte)91);
            }
         }

         for(var3 = 0; var3 < 5; ++var3) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var1.bu(this.aw[var3], (byte)117);
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "mw.al(" + ')');
      }
   }

   public void av(int[] var1, int[] var2, gx[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.at = var3;
      this.aa = var4;
      this.ac = var8 * 1029929221;
      this.an(var1, var2, var5, var6, var7, -8556081);
   }

   public it aa(ha var1, int var2, ha var3, int var4, byte var5) {
      try {
         if (-1 != -2131733097 * this.ab) {
            if (var5 <= 4) {
               throw new IllegalStateException();
            } else {
               return nm.an(this.ab * -2131733097, (byte)-24).ab(var1, var2, var3, var4, (hv)null, (byte)49);
            }
         } else {
            long var6 = this.aq * 800274196296009541L;
            int[] var8 = this.an;
            if (var1 != null) {
               label339: {
                  if (var5 <= 4) {
                     throw new IllegalStateException();
                  }

                  if (var1.ad * -932726919 < 0) {
                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }

                     if (var1.ae * -170018527 < 0) {
                        break label339;
                     }

                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }
                  }

                  var8 = new int[12];

                  for(int var9 = 0; var9 < 12; ++var9) {
                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }

                     var8[var9] = this.an[var9];
                  }

                  if (-932726919 * var1.ad >= 0) {
                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }

                     var6 += (long)(-932726919 * var1.ad - this.an[5] << 40);
                     var8[5] = var1.ad * -932726919;
                  }

                  if (-170018527 * var1.ae >= 0) {
                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }

                     var6 += (long)(var1.ae * -170018527 - this.an[3] << 48);
                     var8[3] = var1.ae * -170018527;
                  }
               }
            }

            it var20 = (it)ar.af(var6);
            if (null == var20) {
               boolean var10 = false;

               int var12;
               for(int var11 = 0; var11 < 12; ++var11) {
                  if (var5 <= 4) {
                     throw new IllegalStateException();
                  }

                  var12 = var8[var11];
                  if (var12 >= 256) {
                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }

                     if (var12 < 512 && !dn.an(var12 - 256, -398203160).au(1647976754)) {
                        if (var5 <= 4) {
                           throw new IllegalStateException();
                        }

                        var10 = true;
                     }
                  }

                  if (var12 >= 512) {
                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }

                     if (!dh.af(var12 - 512, (byte)104).ax(this.au * 1693987821, 1487793992)) {
                        if (var5 <= 4) {
                           throw new IllegalStateException();
                        }

                        var10 = true;
                     }
                  }
               }

               if (var10) {
                  if (var5 <= 4) {
                     throw new IllegalStateException();
                  }

                  if (-1L != 1976929687773021041L * this.al) {
                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }

                     var20 = (it)ar.af(1976929687773021041L * this.al);
                  }

                  if (null == var20) {
                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }
               }

               if (var20 == null) {
                  iz[] var22 = new iz[12];
                  var12 = 0;
                  int var13 = 0;

                  while(true) {
                     int var14;
                     if (var13 >= 12) {
                        iz var23 = new iz(var22, var12);

                        for(var14 = 0; var14 < 5; ++var14) {
                           if (var5 <= 4) {
                              throw new IllegalStateException();
                           }

                           if (this.aw[var14] < ao[var14].length) {
                              if (var5 <= 4) {
                                 throw new IllegalStateException();
                              }

                              var23.as(ay[var14], ao[var14][this.aw[var14]]);
                           }

                           if (this.aw[var14] < qv.ai[var14].length) {
                              var23.as(jt.ax[var14], qv.ai[var14][this.aw[var14]]);
                           }
                        }

                        var20 = var23.bb(64, 850, -30, -50, -30);
                        ar.aw(var20, var6);
                        this.al = var6 * 3107045911833599377L;
                        break;
                     }

                     if (var5 <= 4) {
                        throw new IllegalStateException();
                     }

                     var14 = var8[var13];
                     if (var14 >= 256) {
                        if (var5 <= 4) {
                           throw new IllegalStateException();
                        }

                        if (var14 < 512) {
                           if (var5 <= 4) {
                              throw new IllegalStateException();
                           }

                           iz var15 = dn.an(var14 - 256, 1653303319).ab(-240292107);
                           if (var15 != null) {
                              if (var5 <= 4) {
                                 throw new IllegalStateException();
                              }

                              var22[var12++] = var15;
                           }
                        }
                     }

                     if (var14 >= 512) {
                        hz var24 = dh.af(var14 - 512, (byte)31);
                        iz var16 = var24.ai(1693987821 * this.au, 1938506301);
                        if (var16 != null) {
                           if (var5 <= 4) {
                              throw new IllegalStateException();
                           }

                           if (null != this.at) {
                              if (var5 <= 4) {
                                 throw new IllegalStateException();
                              }

                              gx var17 = this.at[var13];
                              if (var17 != null) {
                                 if (var5 <= 4) {
                                    throw new IllegalStateException();
                                 }

                                 int var18;
                                 if (var17.aw != null && var24.av != null) {
                                    if (var5 <= 4) {
                                       throw new IllegalStateException();
                                    }

                                    if (var24.ar.length == var17.aw.length) {
                                       if (var5 <= 4) {
                                          throw new IllegalStateException();
                                       }

                                       for(var18 = 0; var18 < var24.av.length; ++var18) {
                                          if (var5 <= 4) {
                                             throw new IllegalStateException();
                                          }

                                          var16.as(var24.ar[var18], var17.aw[var18]);
                                       }
                                    }
                                 }

                                 if (null != var17.ac) {
                                    if (var5 <= 4) {
                                       throw new IllegalStateException();
                                    }

                                    if (var24.am != null && var17.ac.length == var24.as.length) {
                                       if (var5 <= 4) {
                                          throw new IllegalStateException();
                                       }

                                       for(var18 = 0; var18 < var24.am.length; ++var18) {
                                          if (var5 <= 4) {
                                             throw new IllegalStateException();
                                          }

                                          var16.aj(var24.as[var18], var17.ac[var18]);
                                       }
                                    }
                                 }
                              }
                           }

                           var22[var12++] = var16;
                        }
                     }

                     ++var13;
                  }
               }
            }

            it var21;
            if (var1 == null) {
               if (var5 <= 4) {
                  throw new IllegalStateException();
               }

               if (var3 == null) {
                  if (var5 <= 4) {
                     throw new IllegalStateException();
                  }

                  var21 = var20.aa(true);
                  return var21;
               }
            }

            if (var1 != null) {
               if (var5 <= 4) {
                  throw new IllegalStateException();
               }

               if (null != var3) {
                  if (var5 <= 4) {
                     throw new IllegalStateException();
                  }

                  var21 = var1.at(var20, var2, var3, var4, 1451879882);
                  return var21;
               }
            }

            if (null != var1) {
               if (var5 <= 4) {
                  throw new IllegalStateException();
               }

               var21 = var1.ab(var20, var2, (byte)-114);
            } else {
               var21 = var3.ab(var20, var4, (byte)-66);
            }

            return var21;
         }
      } catch (RuntimeException var19) {
         throw db.an(var19, "mw.aa(" + ')');
      }
   }

   int[] aw(int var1, int var2) {
      try {
         int[] var3 = new int[12];

         for(int var4 = 0; var4 < 7; ++var4) {
            gt.ac(var1, var3, var4, 1266886036);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw db.an(var5, "mw.aw(" + ')');
      }
   }

   public int ao(short var1) {
      try {
         if (this.ab * -2131733097 == -1) {
            if (var1 == 198) {
               throw new IllegalStateException();
            } else {
               return (this.an[11] << 5) + (this.an[8] << 10) + (this.aw[0] << 25) + (this.aw[4] << 20) + (this.an[0] << 15) + this.an[1];
            }
         } else {
            return 305419896 + nm.an(this.ab * -2131733097, (byte)-107).ab * -1115372301;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "mw.ao(" + ')');
      }
   }

   public mw() {
      try {
         super();
         this.ac = -1029929221;
         this.au = 0;
         this.aa = false;
      } catch (RuntimeException var1) {
         throw db.an(var1, "mw.<init>(" + ')');
      }
   }

   static {
      ag = new int[]{622494345 * hp.at.ag, hp.ao.ag * 622494345, 622494345 * hp.au.ag, 622494345 * hp.aq.ag, hp.aa.ag * 622494345, 622494345 * hp.al.ag, 622494345 * hp.ay.ag};
      ar = new kh(260);
   }

   public void bz(int var1, boolean var2) {
      int var3 = this.aw[var1];
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = ao[var1].length - 1;
            }
         } while(!fj.af(var1, var3, (byte)41));
      } else {
         do {
            ++var3;
            if (var3 >= ao[var1].length) {
               var3 = 0;
            }
         } while(!fj.af(var1, var3, (byte)49));
      }

      this.aw[var1] = var3;
      this.at(1418315210);
   }

   public void ah(int[] var1, int[] var2, gx[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.at = var3;
      this.aa = var4;
      this.ac = var8 * 1029929221;
      this.an(var1, var2, var5, var6, var7, 109475088);
   }

   public void bd(int var1) {
      if (-1066907287 * this.au != var1) {
         this.an((int[])null, (int[])null, this.aw, var1, -1, 603346218);
      }
   }

   public void ar(int[] var1, int[] var2, gx[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.at = var3;
      this.aa = var4;
      this.ac = var8 * -888834712;
      this.an(var1, var2, var5, var6, var7, 1119652293);
   }

   public void am(int[] var1, int[] var2, gx[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.at = var3;
      this.aa = var4;
      this.ac = var8 * 1029929221;
      this.an(var1, var2, var5, var6, var7, 827291885);
   }

   public void as(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (null == var1) {
         var1 = this.aw(var4, -2127206555);
      }

      if (null == var2) {
         var2 = this.aw(var4, -4562284);
      }

      this.af = var1;
      this.an = var2;
      this.aw = var3;
      this.au = -1832857176 * var4;
      this.ab = -537896132 * var5;
      this.at(1418315210);
   }

   int[] ad(int var1) {
      int[] var2 = new int[12];

      for(int var3 = 0; var3 < 7; ++var3) {
         gt.ac(var1, var2, var3, 1195401916);
      }

      return var2;
   }

   public void ak(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (null == var1) {
         var1 = this.aw(var4, 545819497);
      }

      if (null == var2) {
         var2 = this.aw(var4, 94020386);
      }

      this.af = var1;
      this.an = var2;
      this.aw = var3;
      this.au = 325591525 * var4;
      this.ab = -11568601 * var5;
      this.at(1418315210);
   }

   int[] az(int var1) {
      int[] var2 = new int[12];

      for(int var3 = 0; var3 < 7; ++var3) {
         gt.ac(var1, var2, var3, 2058313722);
      }

      return var2;
   }

   public void ab(int var1, boolean var2, int var3) {
      try {
         int var4 = this.aw[var1];
         if (!var2) {
            if (var3 >= -1151481052) {
               throw new IllegalStateException();
            }

            do {
               --var4;
               if (var4 < 0) {
                  if (var3 >= -1151481052) {
                     return;
                  }

                  var4 = ao[var1].length - 1;
               }
            } while(!fj.af(var1, var4, (byte)68));

            if (var3 >= -1151481052) {
               throw new IllegalStateException();
            }
         } else {
            do {
               ++var4;
               if (var4 >= ao[var1].length) {
                  if (var3 >= -1151481052) {
                     return;
                  }

                  var4 = 0;
               }
            } while(!fj.af(var1, var4, (byte)63));

            if (var3 >= -1151481052) {
               return;
            }
         }

         this.aw[var1] = var4;
         this.at(1418315210);
      } catch (RuntimeException var5) {
         throw db.an(var5, "mw.ab(" + ')');
      }
   }

   void at(int var1) {
      try {
         long var2 = 800274196296009541L * this.aq;
         int var4 = this.an[5];
         int var5 = this.an[9];
         this.an[5] = var5;
         this.an[9] = var4;
         this.aq = 0L;

         int var6;
         for(var6 = 0; var6 < 12; ++var6) {
            if (var1 != 1418315210) {
               return;
            }

            this.aq = (this.aq * 800274196296009541L << 4) * 4410892792882131853L;
            if (this.an[var6] >= 256) {
               if (var1 != 1418315210) {
                  throw new IllegalStateException();
               }

               this.aq += 4410892792882131853L * (long)(this.an[var6] - 256);
            }
         }

         if (this.an[0] >= 256) {
            if (var1 != 1418315210) {
               throw new IllegalStateException();
            }

            this.aq += (long)(this.an[0] - 256 >> 4) * 4410892792882131853L;
         }

         if (this.an[1] >= 256) {
            this.aq += (long)(this.an[1] - 256 >> 8) * 4410892792882131853L;
         }

         for(var6 = 0; var6 < 5; ++var6) {
            if (var1 != 1418315210) {
               throw new IllegalStateException();
            }

            this.aq = 4410892792882131853L * (800274196296009541L * this.aq << 3);
            this.aq += (long)this.aw[var6] * 4410892792882131853L;
         }

         label89: {
            this.aq = 4410892792882131853L * (800274196296009541L * this.aq << 1);
            this.aq += (long)this.au * -7585466391638339447L;
            this.an[5] = var4;
            this.an[9] = var5;
            if (var2 != 0L) {
               if (var1 != 1418315210) {
                  throw new IllegalStateException();
               }

               if (this.aq * 800274196296009541L != var2) {
                  break label89;
               }

               if (var1 != 1418315210) {
                  throw new IllegalStateException();
               }
            }

            if (!this.aa) {
               return;
            }

            if (var1 != 1418315210) {
               throw new IllegalStateException();
            }
         }

         ar.an(var2);
      } catch (RuntimeException var7) {
         throw db.an(var7, "mw.at(" + ')');
      }
   }

   int[] ap(int var1) {
      int[] var2 = new int[12];

      for(int var3 = 0; var3 < 7; ++var3) {
         gt.ac(var1, var2, var3, 1338646046);
      }

      return var2;
   }

   static void by(int var0, int[] var1, int var2) {
      for(int var3 = 0; var3 < 743589639 * hj.aw; ++var3) {
         hj var4 = dn.an(var3, 2024528013);
         if (var4 != null && !var4.ao && (1 == var0 ? 7 : 0) + var2 == 882478061 * var4.au) {
            var1[ag[var2]] = 256 + var3;
            break;
         }
      }

   }

   void bn() {
      long var1 = 800274196296009541L * this.aq;
      int var3 = this.an[5];
      int var4 = this.an[9];
      this.an[5] = var4;
      this.an[9] = var3;
      this.aq = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.aq = (this.aq * 800274196296009541L << 4) * 4410892792882131853L;
         if (this.an[var5] >= -1592521168) {
            this.aq += 4410892792882131853L * (long)(this.an[var5] - 256);
         }
      }

      if (this.an[0] >= 1284192560) {
         this.aq += (long)(this.an[0] - 256 >> 4) * 4410892792882131853L;
      }

      if (this.an[1] >= -963100452) {
         this.aq += (long)(this.an[1] - 640750922 >> 8) * 4410892792882131853L;
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.aq = 4410892792882131853L * (800274196296009541L * this.aq << 3);
         this.aq += (long)this.aw[var5] * 4410892792882131853L;
      }

      this.aq = 4410892792882131853L * (800274196296009541L * this.aq << 1);
      this.aq += (long)this.au * -7585466391638339447L;
      this.an[5] = var3;
      this.an[9] = var4;
      if (var1 != 0L && this.aq * 800274196296009541L != var1 || this.aa) {
         ar.an(var1);
      }

   }

   static void bi(int var0, int[] var1, int var2) {
      for(int var3 = 0; var3 < -251548014 * hj.aw; ++var3) {
         hj var4 = dn.an(var3, 1155219908);
         if (var4 != null && !var4.ao && (1 == var0 ? 7 : 0) + var2 == 1015855167 * var4.au) {
            var1[ag[var2]] = 256 + var3;
            break;
         }
      }

   }

   iz ay(byte var1) {
      try {
         if (-1 != this.ab * -2131733097) {
            if (var1 <= 92) {
               throw new IllegalStateException();
            } else {
               return nm.an(this.ab * -2131733097, (byte)-15).aq((hv)null, (byte)64);
            }
         } else {
            boolean var2 = false;

            int var4;
            for(int var3 = 0; var3 < 12; ++var3) {
               if (var1 <= 92) {
                  throw new IllegalStateException();
               }

               var4 = this.an[var3];
               if (var4 >= 256) {
                  if (var1 <= 92) {
                     throw new IllegalStateException();
                  }

                  if (var4 < 512) {
                     if (var1 <= 92) {
                        throw new IllegalStateException();
                     }

                     if (!dn.an(var4 - 256, -452164983).aq((byte)10)) {
                        var2 = true;
                     }
                  }
               }

               if (var4 >= 512) {
                  if (var1 <= 92) {
                     throw new IllegalStateException();
                  }

                  if (!dh.af(var4 - 512, (byte)47).ag(this.au * 1693987821, -1902431331)) {
                     if (var1 <= 92) {
                        throw new IllegalStateException();
                     }

                     var2 = true;
                  }
               }
            }

            if (var2) {
               if (var1 <= 92) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               iz[] var9 = new iz[12];
               var4 = 0;

               int var6;
               for(int var5 = 0; var5 < 12; ++var5) {
                  if (var1 <= 92) {
                     throw new IllegalStateException();
                  }

                  var6 = this.an[var5];
                  iz var7;
                  if (var6 >= 256 && var6 < 512) {
                     if (var1 <= 92) {
                        throw new IllegalStateException();
                     }

                     var7 = dn.an(var6 - 256, 21709876).al((byte)-37);
                     if (var7 != null) {
                        if (var1 <= 92) {
                           throw new IllegalStateException();
                        }

                        var9[var4++] = var7;
                     }
                  }

                  if (var6 >= 512) {
                     if (var1 <= 92) {
                        throw new IllegalStateException();
                     }

                     var7 = dh.af(var6 - 512, (byte)83).ah(this.au * 1693987821, -1738550121);
                     if (null != var7) {
                        if (var1 <= 92) {
                           throw new IllegalStateException();
                        }

                        var9[var4++] = var7;
                     }
                  }
               }

               iz var10 = new iz(var9, var4);

               for(var6 = 0; var6 < 5; ++var6) {
                  if (var1 <= 92) {
                     throw new IllegalStateException();
                  }

                  if (this.aw[var6] < ao[var6].length) {
                     var10.as(ay[var6], ao[var6][this.aw[var6]]);
                  }

                  if (this.aw[var6] < qv.ai[var6].length) {
                     if (var1 <= 92) {
                        throw new IllegalStateException();
                     }

                     var10.as(jt.ax[var6], qv.ai[var6][this.aw[var6]]);
                  }
               }

               return var10;
            }
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "mw.ay(" + ')');
      }
   }

   public void bk(int var1, boolean var2) {
      if (var1 != 1 || 1 != this.au * 1693987821) {
         int var3 = this.an[ag[var1]];
         if (0 != var3) {
            var3 -= 256;

            hj var4;
            do {
               if (!var2) {
                  --var3;
                  if (var3 < 0) {
                     var3 = hj.aw * 743589639 - 1;
                  }
               } else {
                  ++var3;
                  if (var3 >= 743589639 * hj.aw) {
                     var3 = 0;
                  }
               }

               var4 = dn.an(var3, -525315422);
            } while(null == var4 || var4.ao || var4.au * 1015855167 != var1 + (1 == this.au * 1693987821 ? 7 : 0));

            this.an[ag[var1]] = 256 + var3;
            this.at(1418315210);
         }
      }
   }

   public void bx(int var1, boolean var2) {
      int var3 = this.aw[var1];
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = ao[var1].length - 1;
            }
         } while(!fj.af(var1, var3, (byte)81));
      } else {
         do {
            ++var3;
            if (var3 >= ao[var1].length) {
               var3 = 0;
            }
         } while(!fj.af(var1, var3, (byte)59));
      }

      this.aw[var1] = var3;
      this.at(1418315210);
   }

   public void bo(int var1, boolean var2) {
      int var3 = this.aw[var1];
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = ao[var1].length - 1;
            }
         } while(!fj.af(var1, var3, (byte)22));
      } else {
         do {
            ++var3;
            if (var3 >= ao[var1].length) {
               var3 = 0;
            }
         } while(!fj.af(var1, var3, (byte)13));
      }

      this.aw[var1] = var3;
      this.at(1418315210);
   }

   public int bf() {
      return this.ab * 326101195 == -1 ? (this.an[11] << 5) + (this.an[8] << 10) + (this.aw[0] << 25) + (this.aw[4] << 20) + (this.an[0] << 15) + this.an[1] : 1169259612 + nm.an(this.ab * 609322779, (byte)-92).ab * -1115372301;
   }

   void ax(int var1) {
      try {
         this.an(this.af, this.an, this.aw, 1693987821 * this.au, -2131733097 * this.ab, -122282478);
      } catch (RuntimeException var2) {
         throw db.an(var2, "mw.ax(" + ')');
      }
   }

   public void bj(sg var1) {
      var1.bu(1693987821 * this.au, (byte)106);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.an[ag[var2]];
         if (var3 == 0) {
            var1.bu(-1, (byte)68);
         } else {
            var1.bu(var3 - -46987117, (byte)71);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.bu(this.aw[var2], (byte)94);
      }

   }

   public void bt(sg var1) {
      var1.bu(1693987821 * this.au, (byte)92);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.an[ag[var2]];
         if (var3 == 0) {
            var1.bu(-1, (byte)53);
         } else {
            var1.bu(var3 - 256, (byte)14);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.bu(this.aw[var2], (byte)63);
      }

   }

   void ba() {
      this.an(this.af, this.an, this.aw, 1693987821 * this.au, -2131733097 * this.ab, 676142866);
   }

   int[] ae(int var1) {
      int[] var2 = new int[12];

      for(int var3 = 0; var3 < 7; ++var3) {
         gt.ac(var1, var2, var3, 1659888460);
      }

      return var2;
   }

   void bs() {
      long var1 = 800274196296009541L * this.aq;
      int var3 = this.an[5];
      int var4 = this.an[9];
      this.an[5] = var4;
      this.an[9] = var3;
      this.aq = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.aq = (this.aq * 800274196296009541L << 4) * 4410892792882131853L;
         if (this.an[var5] >= 256) {
            this.aq += 4410892792882131853L * (long)(this.an[var5] - 256);
         }
      }

      if (this.an[0] >= 256) {
         this.aq += (long)(this.an[0] - 1669183895 >> 4) * 4410892792882131853L;
      }

      if (this.an[1] >= 256) {
         this.aq += (long)(this.an[1] - 256 >> 8) * 4410892792882131853L;
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.aq = 4410892792882131853L * (800274196296009541L * this.aq << 3);
         this.aq += (long)this.aw[var5] * 4410892792882131853L;
      }

      this.aq = 4410892792882131853L * (800274196296009541L * this.aq << 1);
      this.aq += (long)this.au * -7585466391638339447L;
      this.an[5] = var3;
      this.an[9] = var4;
      if (var1 != 0L && this.aq * 800274196296009541L != var1 || this.aa) {
         ar.an(var1);
      }

   }

   public it br(ha var1, int var2, ha var3, int var4) {
      if (-1 != -2131733097 * this.ab) {
         return nm.an(this.ab * -2131733097, (byte)-41).ab(var1, var2, var3, var4, (hv)null, (byte)10);
      } else {
         long var5 = this.aq * 800274196296009541L;
         int[] var7 = this.an;
         if (var1 != null && (var1.ad * -932726919 >= 0 || var1.ae * -170018527 >= 0)) {
            var7 = new int[12];

            for(int var8 = 0; var8 < 12; ++var8) {
               var7[var8] = this.an[var8];
            }

            if (-932726919 * var1.ad >= 0) {
               var5 += (long)(-932726919 * var1.ad - this.an[5] << 40);
               var7[5] = var1.ad * -932726919;
            }

            if (-170018527 * var1.ae >= 0) {
               var5 += (long)(var1.ae * -170018527 - this.an[3] << 48);
               var7[3] = var1.ae * -170018527;
            }
         }

         it var18 = (it)ar.af(var5);
         if (null == var18) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if (var11 >= 256 && var11 < 512 && !dn.an(var11 - 256, -2129457586).au(-1660928785)) {
                  var9 = true;
               }

               if (var11 >= 512 && !dh.af(var11 - 512, (byte)113).ax(this.au * 1693987821, -1686902783)) {
                  var9 = true;
               }
            }

            if (var9) {
               if (-1L != 1976929687773021041L * this.al) {
                  var18 = (it)ar.af(1976929687773021041L * this.al);
               }

               if (null == var18) {
                  return null;
               }
            }

            if (var18 == null) {
               iz[] var20 = new iz[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  if (var13 >= 256 && var13 < 512) {
                     iz var14 = dn.an(var13 - 256, 1541329039).ab(1165205501);
                     if (var14 != null) {
                        var20[var11++] = var14;
                     }
                  }

                  if (var13 >= 512) {
                     hz var22 = dh.af(var13 - 512, (byte)104);
                     iz var15 = var22.ai(1693987821 * this.au, 2025448517);
                     if (var15 != null) {
                        if (null != this.at) {
                           gx var16 = this.at[var12];
                           if (var16 != null) {
                              int var17;
                              if (var16.aw != null && var22.av != null && var22.ar.length == var16.aw.length) {
                                 for(var17 = 0; var17 < var22.av.length; ++var17) {
                                    var15.as(var22.ar[var17], var16.aw[var17]);
                                 }
                              }

                              if (null != var16.ac && var22.am != null && var16.ac.length == var22.as.length) {
                                 for(var17 = 0; var17 < var22.am.length; ++var17) {
                                    var15.aj(var22.as[var17], var16.ac[var17]);
                                 }
                              }
                           }
                        }

                        var20[var11++] = var15;
                     }
                  }
               }

               iz var21 = new iz(var20, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if (this.aw[var13] < ao[var13].length) {
                     var21.as(ay[var13], ao[var13][this.aw[var13]]);
                  }

                  if (this.aw[var13] < qv.ai[var13].length) {
                     var21.as(jt.ax[var13], qv.ai[var13][this.aw[var13]]);
                  }
               }

               var18 = var21.bb(64, 850, -30, -50, -30);
               ar.aw(var18, var5);
               this.al = var5 * 3107045911833599377L;
            }
         }

         it var19;
         if (var1 == null && var3 == null) {
            var19 = var18.aa(true);
         } else if (var1 != null && null != var3) {
            var19 = var1.at(var18, var2, var3, var4, 1555486161);
         } else if (null != var1) {
            var19 = var1.ab(var18, var2, (byte)-99);
         } else {
            var19 = var3.ab(var18, var4, (byte)-8);
         }

         return var19;
      }
   }

   iz bg() {
      if (-1 != this.ab * -2131733097) {
         return nm.an(this.ab * -2131733097, (byte)-72).aq((hv)null, (byte)64);
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.an[var2];
            if (var3 >= 256 && var3 < -2054696259 && !dn.an(var3 - 256, 1793015172).aq((byte)54)) {
               var1 = true;
            }

            if (var3 >= 512 && !dh.af(var3 - 512, (byte)14).ag(this.au * 1693987821, -711110051)) {
               var1 = true;
            }
         }

         if (var1) {
            return null;
         } else {
            iz[] var7 = new iz[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.an[var4];
               iz var6;
               if (var5 >= 256 && var5 < 512) {
                  var6 = dn.an(var5 - 256, -907891653).al((byte)-49);
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if (var5 >= 512) {
                  var6 = dh.af(var5 - 512, (byte)25).ah(this.au * 7469784, -1065310064);
                  if (null != var6) {
                     var7[var3++] = var6;
                  }
               }
            }

            iz var8 = new iz(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.aw[var5] < ao[var5].length) {
                  var8.as(ay[var5], ao[var5][this.aw[var5]]);
               }

               if (this.aw[var5] < qv.ai[var5].length) {
                  var8.as(jt.ax[var5], qv.ai[var5][this.aw[var5]]);
               }
            }

            return var8;
         }
      }
   }

   public int bu() {
      return this.ab * -2131733097 == -1 ? (this.an[11] << 5) + (this.an[8] << 10) + (this.aw[0] << 25) + (this.aw[4] << 20) + (this.an[0] << 15) + this.an[1] : 305419896 + nm.an(this.ab * -2131733097, (byte)-99).ab * -1115372301;
   }

   mw(mw var1) {
      try {
         super();
         this.ac = -1029929221;
         this.au = 0;
         this.aa = false;
         int[] var2 = Arrays.copyOf(var1.an, var1.an.length);
         int[] var3 = Arrays.copyOf(var1.af, var1.af.length);
         gx[] var4 = (gx[])(var1.at != null ? (gx[])Arrays.copyOf(var1.at, var1.at.length) : null);
         int[] var5 = Arrays.copyOf(var1.aw, var1.aw.length);
         this.af(var3, var2, var4, false, var5, 1693987821 * var1.au, var1.ab * -2131733097, var1.ac * -1004049459, (byte)88);
      } catch (RuntimeException var6) {
         throw db.an(var6, "mw.<init>(" + ')');
      }
   }

   public int bq() {
      return this.ab * -2131733097 == -1 ? (this.an[11] << 5) + (this.an[8] << 10) + (this.aw[0] << 25) + (this.aw[4] << 20) + (this.an[0] << 15) + this.an[1] : 305419896 + nm.an(this.ab * -2131733097, (byte)-48).ab * -1115372301;
   }

   public void aj(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (null == var1) {
         var1 = this.aw(var4, -710808975);
      }

      if (null == var2) {
         var2 = this.aw(var4, 1282480463);
      }

      this.af = var1;
      this.an = var2;
      this.aw = var3;
      this.au = 325591525 * var4;
      this.ab = -11568601 * var5;
      this.at(1418315210);
   }

   void bv() {
      this.an(this.af, this.an, this.aw, 1195789184 * this.au, -2131733097 * this.ab, 518626700);
   }

   public void bm(int var1, boolean var2) {
      int var3 = this.aw[var1];
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = ao[var1].length - 1;
            }
         } while(!fj.af(var1, var3, (byte)49));
      } else {
         do {
            ++var3;
            if (var3 >= ao[var1].length) {
               var3 = 0;
            }
         } while(!fj.af(var1, var3, (byte)77));
      }

      this.aw[var1] = var3;
      this.at(1418315210);
   }

   public static void bp() {
      ar.ac();
   }

   public static void bc() {
      ar.ac();
   }

   public static byte[] af(CharSequence var0, byte var1) {
      try {
         int var2 = var0.length();
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            if (var1 >= -1) {
               throw new IllegalStateException();
            }

            char var5 = var0.charAt(var4);
            if (var5 > 127) {
               var3[var4] = 63;
            } else {
               var3[var4] = (byte)var5;
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw db.an(var6, "mw.af(" + ')');
      }
   }

   public static final void af(long var0) {
      try {
         if (var0 > 0L) {
            if (0L == var0 % 10L) {
               long var2 = var0 - 1L;

               try {
                  Thread.sleep(var2);
               } catch (InterruptedException var7) {
               }

               try {
                  Thread.sleep(1L);
               } catch (InterruptedException var6) {
               }
            } else {
               try {
                  Thread.sleep(var0);
               } catch (InterruptedException var5) {
               }
            }

         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "mw.af(" + ')');
      }
   }
}
