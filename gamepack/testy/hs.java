import accessors.RSNPCType;

public class hs extends rk implements RSNPCType {
   static nm aw;
   static nm an;
   public int am;
   static kh ac = new kh(64);
   static kh au = new kh(50);
   public int ab;
   public String aq;
   public boolean bu;
   int[] at;
   public int bj;
   int bt;
   public int ao;
   public int ax;
   public int ai;
   public int ag;
   public int ah;
   public int av;
   public int ak;
   public boolean bf;
   public int as;
   public short[] by;
   public boolean bm;
   public int az;
   public int ad;
   public int ae;
   short[] ap;
   int bs;
   short[] bb;
   public short[] bi;
   public String[] be;
   public boolean bk;
   public int aj;
   int bo;
   int bz;
   ro bv;
   public int al;
   public static final int af = 8;
   int bd;
   public int[] bn;
   public int bx;
   int br;
   public boolean bg;
   public int ar;
   public int ay;
   int[] bq;
   short[] ba;
   int[] aa;

   public short[] cu() {
      return this.ba;
   }

   public short[] ca() {
      return this.ba;
   }

   void ac(sg var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (0 == var3) {
               if (var2 == -1039397390) {
                  return;
               }

               return;
            }

            this.au(var1, var3, 1239995114);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hs.ac(" + ')');
      }
   }

   public boolean bc() {
      return null != this.bq && this.ba != null;
   }

   public final it ab(ha var1, int var2, ha var3, int var4, hv var5, byte var6) {
      try {
         if (null != this.bn) {
            if (var6 == 11) {
               throw new IllegalStateException();
            } else {
               hs var12 = this.at(-1591447842);
               if (var12 == null) {
                  if (var6 == 11) {
                     throw new IllegalStateException();
                  } else {
                     return null;
                  }
               } else {
                  return var12.ab(var1, var2, var3, var4, var5, (byte)-8);
               }
            }
         } else {
            long var7 = (long)(this.ab * -1115372301);
            if (null != var5) {
               if (var6 == 11) {
                  throw new IllegalStateException();
               }

               var7 |= -1176524468931644747L * var5.af << 16;
            }

            it var9 = (it)au.af(var7);
            if (var9 == null) {
               if (var6 == 11) {
                  throw new IllegalStateException();
               }

               iz var10 = this.al(this.at, var5, -417083855);
               if (var10 == null) {
                  return null;
               }

               var9 = var10.bb(64 + this.bd * -1500709613, this.bt * -2057653211 + 850, -30, -50, -30);
               au.aw(var9, var7);
            }

            it var13;
            label88: {
               if (null != var1) {
                  if (var6 == 11) {
                     throw new IllegalStateException();
                  }

                  if (var3 != null) {
                     if (var6 == 11) {
                        throw new IllegalStateException();
                     }

                     var13 = var1.at(var9, var2, var3, var4, 1923165788);
                     break label88;
                  }
               }

               if (var1 != null) {
                  if (var6 == 11) {
                     throw new IllegalStateException();
                  }

                  var13 = var1.ab(var9, var2, (byte)-23);
               } else if (var3 != null) {
                  if (var6 == 11) {
                     throw new IllegalStateException();
                  }

                  var13 = var3.ab(var9, var4, (byte)-89);
               } else {
                  var13 = var9.aa(true);
               }
            }

            if (this.bo * 1661958697 == 128) {
               if (this.bz * 521320011 == 128) {
                  return var13;
               }

               if (var6 == 11) {
                  throw new IllegalStateException();
               }
            }

            var13.bk(this.bo * 1661958697, this.bz * 521320011, 1661958697 * this.bo);
            return var13;
         }
      } catch (RuntimeException var11) {
         throw db.an(var11, "hs.ab(" + ')');
      }
   }

   public final iz aq(hv var1, byte var2) {
      try {
         if (null != this.bn) {
            if (var2 != 64) {
               throw new IllegalStateException();
            } else {
               hs var3 = this.at(1757138189);
               if (null == var3) {
                  if (var2 != 64) {
                     throw new IllegalStateException();
                  } else {
                     return null;
                  }
               } else {
                  return var3.aq(var1, (byte)64);
               }
            }
         } else {
            return this.al(this.aa, var1, -817052624);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hs.aq(" + ')');
      }
   }

   iz al(int[] var1, hv var2, int var3) {
      try {
         int[] var4 = var1;
         if (var2 != null) {
            if (var3 >= 232011844) {
               throw new IllegalStateException();
            }

            if (var2.an != null) {
               if (var3 >= 232011844) {
                  throw new IllegalStateException();
               }

               var4 = var2.an;
            }
         }

         if (null == var4) {
            if (var3 >= 232011844) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            boolean var5 = false;

            for(int var6 = 0; var6 < var4.length; ++var6) {
               if (var3 >= 232011844) {
                  throw new IllegalStateException();
               }

               if (var4[var6] != -1 && !aw.ce(var4[var6], 0, (byte)-42)) {
                  if (var3 >= 232011844) {
                     throw new IllegalStateException();
                  }

                  var5 = true;
               }
            }

            if (var5) {
               if (var3 >= 232011844) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               iz[] var11 = new iz[var4.length];

               for(int var7 = 0; var7 < var4.length; ++var7) {
                  if (var3 >= 232011844) {
                     throw new IllegalStateException();
                  }

                  var11[var7] = iz.af(aw, var4[var7], 0);
               }

               iz var12;
               if (var11.length == 1) {
                  if (var3 >= 232011844) {
                     throw new IllegalStateException();
                  }

                  var12 = var11[0];
                  if (null == var12) {
                     if (var3 >= 232011844) {
                        throw new IllegalStateException();
                     }

                     var12 = new iz(var11, var11.length);
                  }
               } else {
                  var12 = new iz(var11, var11.length);
               }

               short[] var8;
               int var9;
               if (null != this.ap) {
                  if (var3 >= 232011844) {
                     throw new IllegalStateException();
                  }

                  var8 = this.by;
                  if (var2 != null && null != var2.aw) {
                     if (var3 >= 232011844) {
                        throw new IllegalStateException();
                     }

                     var8 = var2.aw;
                  }

                  for(var9 = 0; var9 < this.ap.length; ++var9) {
                     if (var3 >= 232011844) {
                        throw new IllegalStateException();
                     }

                     var12.as(this.ap[var9], var8[var9]);
                  }
               }

               if (this.bb != null) {
                  if (var3 >= 232011844) {
                     throw new IllegalStateException();
                  }

                  var8 = this.bi;
                  if (null != var2 && var2.ac != null) {
                     if (var3 >= 232011844) {
                        throw new IllegalStateException();
                     }

                     var8 = var2.ac;
                  }

                  for(var9 = 0; var9 < this.bb.length; ++var9) {
                     if (var3 >= 232011844) {
                        throw new IllegalStateException();
                     }

                     var12.aj(this.bb[var9], var8[var9]);
                  }
               }

               return var12;
            }
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "hs.al(" + ')');
      }
   }

   public final hs at(int var1) {
      try {
         int var2 = -1;
         if (-1 != 1781845069 * this.bs) {
            if (var1 == -151833963) {
               throw new IllegalStateException();
            }

            var2 = jy.af(1781845069 * this.bs, 1327767157);
         } else if (2051988897 * this.br != -1) {
            if (var1 == -151833963) {
               throw new IllegalStateException();
            }

            var2 = le.aw[this.br * 2051988897];
         }

         int var3;
         if (var2 >= 0) {
            if (var1 == -151833963) {
               throw new IllegalStateException();
            }

            if (var2 < this.bn.length - 1) {
               var3 = this.bn[var2];
               return var3 != -1 ? nm.an(var3, (byte)-7) : null;
            }

            if (var1 == -151833963) {
               throw new IllegalStateException();
            }
         }

         var3 = this.bn[this.bn.length - 1];
         return var3 != -1 ? nm.an(var3, (byte)-7) : null;
      } catch (RuntimeException var4) {
         throw db.an(var4, "hs.at(" + ')');
      }
   }

   public boolean aa(int var1) {
      try {
         if (this.bn == null) {
            return true;
         } else {
            int var2 = -1;
            if (-1 != this.bs * 1781845069) {
               if (var1 != 41635170) {
                  throw new IllegalStateException();
               }

               var2 = jy.af(this.bs * 1781845069, 2042454646);
            } else if (-1 != 2051988897 * this.br) {
               if (var1 != 41635170) {
                  throw new IllegalStateException();
               }

               var2 = le.aw[2051988897 * this.br];
            }

            boolean var10000;
            if (var2 >= 0) {
               if (var1 != 41635170) {
                  throw new IllegalStateException();
               }

               if (var2 < this.bn.length) {
                  if (-1 != this.bn[var2]) {
                     if (var1 != 41635170) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  return var10000;
               }

               if (var1 != 41635170) {
                  throw new IllegalStateException();
               }
            }

            if (this.bn[this.bn.length - 1] != -1) {
               if (var1 != 41635170) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "hs.aa(" + ')');
      }
   }

   public int ay(int var1, int var2, int var3) {
      try {
         ro var5 = this.bv;
         int var4;
         if (null == var5) {
            if (var3 <= 1337101604) {
               throw new IllegalStateException();
            }

            var4 = var2;
         } else {
            rt var6 = (rt)var5.af((long)var1);
            if (null == var6) {
               if (var3 <= 1337101604) {
                  throw new IllegalStateException();
               }

               var4 = var2;
            } else {
               var4 = var6.af;
            }
         }

         return var4;
      } catch (RuntimeException var7) {
         throw db.an(var7, "hs.ay(" + ')');
      }
   }

   void aw(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hs.aw(" + ')');
      }
   }

   public boolean ai(byte var1) {
      try {
         boolean var10000;
         if (null != this.bq) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            if (this.ba != null) {
               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hs.ai(" + ')');
      }
   }

   public int[] ag(int var1) {
      try {
         return this.bq;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hs.ag(" + ')');
      }
   }

   public int ah(int var1, byte var2) {
      try {
         if (null != this.bq) {
            if (var2 <= 14) {
               throw new IllegalStateException();
            }

            if (var1 < this.bq.length) {
               return this.bq[var1];
            }

            if (var2 <= 14) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "hs.ah(" + ')');
      }
   }

   public short[] av(int var1) {
      try {
         return this.ba;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hs.av(" + ')');
      }
   }

   public short[] cn() {
      return this.ba;
   }

   iz br(int[] var1, hv var2) {
      int[] var3 = var1;
      if (var2 != null && var2.an != null) {
         var3 = var2.an;
      }

      if (null == var3) {
         return null;
      } else {
         boolean var4 = false;

         for(int var5 = 0; var5 < var3.length; ++var5) {
            if (var3[var5] != -1 && !aw.ce(var3[var5], 0, (byte)14)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            iz[] var9 = new iz[var3.length];

            for(int var6 = 0; var6 < var3.length; ++var6) {
               var9[var6] = iz.af(aw, var3[var6], 0);
            }

            iz var10;
            if (var9.length == 1) {
               var10 = var9[0];
               if (null == var10) {
                  var10 = new iz(var9, var9.length);
               }
            } else {
               var10 = new iz(var9, var9.length);
            }

            short[] var7;
            int var8;
            if (null != this.ap) {
               var7 = this.by;
               if (var2 != null && null != var2.aw) {
                  var7 = var2.aw;
               }

               for(var8 = 0; var8 < this.ap.length; ++var8) {
                  var10.as(this.ap[var8], var7[var8]);
               }
            }

            if (this.bb != null) {
               var7 = this.bi;
               if (null != var2 && var2.ac != null) {
                  var7 = var2.ac;
               }

               for(var8 = 0; var8 < this.bb.length; ++var8) {
                  var10.aj(this.bb[var8], var7[var8]);
               }
            }

            return var10;
         }
      }
   }

   public static void am(nm var0, nm var1) {
      an = var0;
      aw = var1;
   }

   public short ar(int var1, int var2) {
      try {
         if (null != this.ba) {
            if (var2 == 1939708877) {
               throw new IllegalStateException();
            }

            if (var1 < this.ba.length) {
               return this.ba[var1];
            }

            if (var2 == 1939708877) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "hs.ar(" + ')');
      }
   }

   public static hs ak(int var0) {
      hs var1 = (hs)ac.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = an.bh(9, var0, (byte)-109);
         var1 = new hs();
         var1.ab = 1690060341 * var0;
         if (null != var2) {
            var1.ac(new sg(var2), 820852104);
         }

         var1.aw(835833293);
         ac.aw(var1, (long)var0);
         return var1;
      }
   }

   public static void as(nm var0, nm var1) {
      an = var0;
      aw = var1;
   }

   public static hs az(int var0) {
      hs var1 = (hs)ac.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = an.bh(9, var0, (byte)-11);
         var1 = new hs();
         var1.ab = -1772751813 * var0;
         if (null != var2) {
            var1.ac(new sg(var2), -1554941598);
         }

         var1.aw(835833293);
         ac.aw(var1, (long)var0);
         return var1;
      }
   }

   void ad() {
   }

   void ae() {
   }

   void au(sg var1, int var2, int var3) {
      try {
         int var4;
         int var5;
         if (1 == var2) {
            var4 = var1.cm((byte)7);
            this.at = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 != 1239995114) {
                  return;
               }

               this.at[var5] = var1.cl(-2100232755);
            }
         } else if (2 == var2) {
            this.aq = var1.cw((byte)0);
         } else if (var2 == 12) {
            if (var3 != 1239995114) {
               return;
            }

            this.al = var1.cm((byte)7) * -1159021589;
         } else if (13 == var2) {
            if (var3 != 1239995114) {
               throw new IllegalStateException();
            }

            this.ay = var1.cl(-904811108) * 1304162881;
         } else if (var2 == 14) {
            if (var3 != 1239995114) {
               return;
            }

            this.ai = var1.cl(-1419288290) * 1653161499;
         } else if (var2 == 15) {
            if (var3 != 1239995114) {
               throw new IllegalStateException();
            }

            this.ao = var1.cl(-1612558063) * 1526449071;
         } else if (16 == var2) {
            if (var3 != 1239995114) {
               return;
            }

            this.ax = var1.cl(-1494231735) * 1325267127;
         } else if (var2 == 17) {
            if (var3 != 1239995114) {
               return;
            }

            this.ai = var1.cl(-445007973) * 1653161499;
            this.ag = var1.cl(-1404207838) * -820247353;
            this.ah = var1.cl(-1177976083) * 1030172671;
            this.av = var1.cl(-1533431757) * -2142663477;
         } else if (var2 == 18) {
            if (var3 != 1239995114) {
               throw new IllegalStateException();
            }

            var1.cl(-2086827712);
         } else {
            if (var2 >= 30) {
               if (var3 != 1239995114) {
                  throw new IllegalStateException();
               }

               if (var2 < 35) {
                  this.be[var2 - 30] = var1.cw((byte)0);
                  if (this.be[var2 - 30].equalsIgnoreCase(mk.ac)) {
                     if (var3 != 1239995114) {
                        throw new IllegalStateException();
                     }

                     this.be[var2 - 30] = null;
                  }

                  return;
               }
            }

            if (40 == var2) {
               if (var3 != 1239995114) {
                  throw new IllegalStateException();
               }

               var4 = var1.cm((byte)7);
               this.ap = new short[var4];
               this.by = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 != 1239995114) {
                     throw new IllegalStateException();
                  }

                  this.ap[var5] = (short)var1.cl(-1155165947);
                  this.by[var5] = (short)var1.cl(-1855735589);
               }
            } else if (41 == var2) {
               if (var3 != 1239995114) {
                  throw new IllegalStateException();
               }

               var4 = var1.cm((byte)7);
               this.bb = new short[var4];
               this.bi = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 != 1239995114) {
                     throw new IllegalStateException();
                  }

                  this.bb[var5] = (short)var1.cl(369350520);
                  this.bi[var5] = (short)var1.cl(-341444843);
               }
            } else if (60 == var2) {
               if (var3 != 1239995114) {
                  return;
               }

               var4 = var1.cm((byte)7);
               this.aa = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 != 1239995114) {
                     return;
                  }

                  this.aa[var5] = var1.cl(-1257942048);
               }
            } else if (93 == var2) {
               this.bk = false;
            } else if (95 == var2) {
               this.bx = var1.cl(-921873820) * -959716425;
            } else if (97 == var2) {
               this.bo = var1.cl(218480925) * 1121632793;
            } else if (var2 == 98) {
               if (var3 != 1239995114) {
                  throw new IllegalStateException();
               }

               this.bz = var1.cl(-664859366) * 889054051;
            } else if (var2 == 99) {
               if (var3 != 1239995114) {
                  throw new IllegalStateException();
               }

               this.bm = true;
            } else if (100 == var2) {
               if (var3 != 1239995114) {
                  throw new IllegalStateException();
               }

               this.bd = var1.cf(435772489) * 1774081307;
            } else if (var2 == 101) {
               if (var3 != 1239995114) {
                  throw new IllegalStateException();
               }

               this.bt = var1.cf(435772489) * 352282209;
            } else {
               int var6;
               if (102 == var2) {
                  if (var3 != 1239995114) {
                     throw new IllegalStateException();
                  }

                  var4 = var1.cm((byte)7);
                  var5 = 0;

                  for(var6 = var4; 0 != var6; var6 >>= 1) {
                     ++var5;
                  }

                  this.bq = new int[var5];
                  this.ba = new short[var5];

                  for(int var7 = 0; var7 < var5; ++var7) {
                     if (var3 != 1239995114) {
                        throw new IllegalStateException();
                     }

                     if ((var4 & 1 << var7) == 0) {
                        if (var3 != 1239995114) {
                           throw new IllegalStateException();
                        }

                        this.bq[var7] = -1;
                        this.ba[var7] = -1;
                     } else {
                        this.bq[var7] = var1.do(1833245645);
                        this.ba[var7] = (short)var1.dm(1556461715);
                     }
                  }
               } else if (var2 == 103) {
                  this.bj = var1.cl(-729475099) * 222409755;
               } else {
                  if (var2 != 106) {
                     if (var3 != 1239995114) {
                        throw new IllegalStateException();
                     }

                     if (var2 != 118) {
                        if (107 == var2) {
                           if (var3 != 1239995114) {
                              return;
                           }

                           this.bg = false;
                           return;
                        } else if (109 == var2) {
                           if (var3 != 1239995114) {
                              return;
                           }

                           this.bu = false;
                           return;
                        } else if (var2 == 111) {
                           if (var3 != 1239995114) {
                              throw new IllegalStateException();
                           }

                           this.bf = true;
                           return;
                        } else if (114 == var2) {
                           if (var3 != 1239995114) {
                              throw new IllegalStateException();
                           }

                           this.ar = var1.cl(-395680091) * 1104808909;
                           return;
                        } else if (var2 == 115) {
                           this.ar = var1.cl(162063926) * 1104808909;
                           this.am = var1.cl(-878004914) * -1535672631;
                           this.as = var1.cl(-1771051347) * -257868351;
                           this.aj = var1.cl(-615033747) * -1734270145;
                           return;
                        } else if (var2 == 116) {
                           if (var3 != 1239995114) {
                              throw new IllegalStateException();
                           }

                           this.ak = var1.cl(-623111045) * -237251001;
                           return;
                        } else {
                           if (117 == var2) {
                              if (var3 != 1239995114) {
                                 return;
                              }

                              this.ak = var1.cl(-1264186533) * -237251001;
                              this.az = var1.cl(-1701731002) * -1296177123;
                              this.ad = var1.cl(790398941) * -2136803683;
                              this.ae = var1.cl(-616002619) * 2044090389;
                           } else if (249 == var2) {
                              if (var3 != 1239995114) {
                                 throw new IllegalStateException();
                              }

                              this.bv = cp.af(var1, this.bv, (byte)-119);
                              return;
                           }

                           return;
                        }
                     }

                     if (var3 != 1239995114) {
                        throw new IllegalStateException();
                     }
                  }

                  this.bs = var1.cl(-806120087) * 1998015621;
                  if (65535 == this.bs * 1781845069) {
                     this.bs = -1998015621;
                  }

                  this.br = var1.cl(405222555) * 17057377;
                  if (this.br * 2051988897 == 65535) {
                     this.br = -17057377;
                  }

                  var4 = -1;
                  if (var2 == 118) {
                     if (var3 != 1239995114) {
                        throw new IllegalStateException();
                     }

                     var4 = var1.cl(-484172177);
                     if (var4 == 65535) {
                        if (var3 != 1239995114) {
                           throw new IllegalStateException();
                        }

                        var4 = -1;
                     }
                  }

                  var5 = var1.cm((byte)7);
                  this.bn = new int[var5 + 2];

                  for(var6 = 0; var6 <= var5; ++var6) {
                     if (var3 != 1239995114) {
                        throw new IllegalStateException();
                     }

                     this.bn[var6] = var1.cl(461707673);
                     if (this.bn[var6] == 65535) {
                        if (var3 != 1239995114) {
                           throw new IllegalStateException();
                        }

                        this.bn[var6] = -1;
                     }
                  }

                  this.bn[var5 + 1] = var4;
               }
            }
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "hs.au(" + ')');
      }
   }

   void by(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.au(var1, var2, 1239995114);
      }
   }

   void bb(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.au(var1, var2, 1239995114);
      }
   }

   void ap() {
   }

   void be(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.au(var1, var2, 1239995114);
      }
   }

   void bk(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.au(var1, var2, 1239995114);
      }
   }

   void bx(sg var1, int var2) {
      int var3;
      int var4;
      if (1 == var2) {
         var3 = var1.cm((byte)7);
         this.at = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.at[var4] = var1.cl(-1018158192);
         }
      } else if (2 == var2) {
         this.aq = var1.cw((byte)0);
      } else if (var2 == 12) {
         this.al = var1.cm((byte)7) * -1159021589;
      } else if (13 == var2) {
         this.ay = var1.cl(826463277) * 1304162881;
      } else if (var2 == 14) {
         this.ai = var1.cl(616105518) * 1653161499;
      } else if (var2 == 15) {
         this.ao = var1.cl(50443142) * 1526449071;
      } else if (16 == var2) {
         this.ax = var1.cl(-1434189947) * 1325267127;
      } else if (var2 == 17) {
         this.ai = var1.cl(-455008624) * 1653161499;
         this.ag = var1.cl(-36248169) * -820247353;
         this.ah = var1.cl(310594717) * 1030172671;
         this.av = var1.cl(729629386) * -2142663477;
      } else if (var2 == 18) {
         var1.cl(-1189509331);
      } else if (var2 >= 30 && var2 < 35) {
         this.be[var2 - 30] = var1.cw((byte)0);
         if (this.be[var2 - 30].equalsIgnoreCase(mk.ac)) {
            this.be[var2 - 30] = null;
         }
      } else if (40 == var2) {
         var3 = var1.cm((byte)7);
         this.ap = new short[var3];
         this.by = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ap[var4] = (short)var1.cl(727515947);
            this.by[var4] = (short)var1.cl(170037496);
         }
      } else if (41 == var2) {
         var3 = var1.cm((byte)7);
         this.bb = new short[var3];
         this.bi = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.bb[var4] = (short)var1.cl(-1419699102);
            this.bi[var4] = (short)var1.cl(-931579295);
         }
      } else if (60 == var2) {
         var3 = var1.cm((byte)7);
         this.aa = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.aa[var4] = var1.cl(-189852077);
         }
      } else if (93 == var2) {
         this.bk = false;
      } else if (95 == var2) {
         this.bx = var1.cl(366471690) * -959716425;
      } else if (97 == var2) {
         this.bo = var1.cl(828325951) * 1121632793;
      } else if (var2 == 98) {
         this.bz = var1.cl(-268916280) * 889054051;
      } else if (var2 == 99) {
         this.bm = true;
      } else if (100 == var2) {
         this.bd = var1.cf(435772489) * 1774081307;
      } else if (var2 == 101) {
         this.bt = var1.cf(435772489) * 352282209;
      } else {
         int var5;
         if (102 == var2) {
            var3 = var1.cm((byte)7);
            var4 = 0;

            for(var5 = var3; 0 != var5; var5 >>= 1) {
               ++var4;
            }

            this.bq = new int[var4];
            this.ba = new short[var4];

            for(int var6 = 0; var6 < var4; ++var6) {
               if ((var3 & 1 << var6) == 0) {
                  this.bq[var6] = -1;
                  this.ba[var6] = -1;
               } else {
                  this.bq[var6] = var1.do(48913718);
                  this.ba[var6] = (short)var1.dm(23994444);
               }
            }
         } else if (var2 == 103) {
            this.bj = var1.cl(-1154456421) * 222409755;
         } else if (var2 != 106 && var2 != 118) {
            if (107 == var2) {
               this.bg = false;
            } else if (109 == var2) {
               this.bu = false;
            } else if (var2 == 111) {
               this.bf = true;
            } else if (114 == var2) {
               this.ar = var1.cl(763936612) * 1104808909;
            } else if (var2 == 115) {
               this.ar = var1.cl(-1169885217) * 1104808909;
               this.am = var1.cl(-834728897) * -1535672631;
               this.as = var1.cl(-1684453691) * -257868351;
               this.aj = var1.cl(-153601964) * -1734270145;
            } else if (var2 == 116) {
               this.ak = var1.cl(223206250) * -237251001;
            } else if (117 == var2) {
               this.ak = var1.cl(-696610542) * -237251001;
               this.az = var1.cl(-525564982) * -1296177123;
               this.ad = var1.cl(-1649221137) * -2136803683;
               this.ae = var1.cl(630607023) * 2044090389;
            } else if (249 == var2) {
               this.bv = cp.af(var1, this.bv, (byte)-68);
            }
         } else {
            this.bs = var1.cl(-1692955011) * 1998015621;
            if (65535 == this.bs * 1781845069) {
               this.bs = -1998015621;
            }

            this.br = var1.cl(794974729) * 17057377;
            if (this.br * 2051988897 == 65535) {
               this.br = -17057377;
            }

            var3 = -1;
            if (var2 == 118) {
               var3 = var1.cl(-137085147);
               if (var3 == 65535) {
                  var3 = -1;
               }
            }

            var4 = var1.cm((byte)7);
            this.bn = new int[var4 + 2];

            for(var5 = 0; var5 <= var4; ++var5) {
               this.bn[var5] = var1.cl(-148560033);
               if (this.bn[var5] == 65535) {
                  this.bn[var5] = -1;
               }
            }

            this.bn[var4 + 1] = var3;
         }
      }

   }

   public final it bo(ha var1, int var2, ha var3, int var4, hv var5) {
      if (null != this.bn) {
         hs var10 = this.at(-78792425);
         return var10 == null ? null : var10.ab(var1, var2, var3, var4, var5, (byte)115);
      } else {
         long var6 = (long)(this.ab * -1115372301);
         if (null != var5) {
            var6 |= -1176524468931644747L * var5.af << 16;
         }

         it var8 = (it)au.af(var6);
         if (var8 == null) {
            iz var9 = this.al(this.at, var5, -474003824);
            if (var9 == null) {
               return null;
            }

            var8 = var9.bb(64 + this.bd * -1500709613, this.bt * -2057653211 + 850, -30, -50, -30);
            au.aw(var8, var6);
         }

         it var11;
         if (null != var1 && var3 != null) {
            var11 = var1.at(var8, var2, var3, var4, 1822154193);
         } else if (var1 != null) {
            var11 = var1.ab(var8, var2, (byte)-30);
         } else if (var3 != null) {
            var11 = var3.ab(var8, var4, (byte)-52);
         } else {
            var11 = var8.aa(true);
         }

         if (this.bo * 1661958697 != 128 || this.bz * 521320011 != 128) {
            var11.bk(this.bo * 1661958697, this.bz * 521320011, 1661958697 * this.bo);
         }

         return var11;
      }
   }

   public final it bz(ha var1, int var2, ha var3, int var4, hv var5) {
      if (null != this.bn) {
         hs var10 = this.at(347387552);
         return var10 == null ? null : var10.ab(var1, var2, var3, var4, var5, (byte)-35);
      } else {
         long var6 = (long)(this.ab * -1115372301);
         if (null != var5) {
            var6 |= -1176524468931644747L * var5.af << 16;
         }

         it var8 = (it)au.af(var6);
         if (var8 == null) {
            iz var9 = this.al(this.at, var5, -709454640);
            if (var9 == null) {
               return null;
            }

            var8 = var9.bb(64 + this.bd * -1500709613, this.bt * -2057653211 + 850, -30, -50, -30);
            au.aw(var8, var6);
         }

         it var11;
         if (null != var1 && var3 != null) {
            var11 = var1.at(var8, var2, var3, var4, 1459327937);
         } else if (var1 != null) {
            var11 = var1.ab(var8, var2, (byte)-37);
         } else if (var3 != null) {
            var11 = var3.ab(var8, var4, (byte)-106);
         } else {
            var11 = var8.aa(true);
         }

         if (this.bo * 1661958697 != 128 || this.bz * 521320011 != 128) {
            var11.bk(this.bo * 1661958697, this.bz * 521320011, 1661958697 * this.bo);
         }

         return var11;
      }
   }

   public final iz bm(hv var1) {
      if (null != this.bn) {
         hs var2 = this.at(548993368);
         return null == var2 ? null : var2.aq(var1, (byte)64);
      } else {
         return this.al(this.aa, var1, -1613431917);
      }
   }

   public final iz bd(hv var1) {
      if (null != this.bn) {
         hs var2 = this.at(327568817);
         return null == var2 ? null : var2.aq(var1, (byte)64);
      } else {
         return this.al(this.aa, var1, -766298677);
      }
   }

   public boolean bu() {
      if (this.bn == null) {
         return true;
      } else {
         int var1 = -1;
         if (-1 != this.bs * 687827384) {
            var1 = jy.af(this.bs * 1948515912, 1769373465);
         } else if (-1 != -1723557293 * this.br) {
            var1 = le.aw[-956688706 * this.br];
         }

         if (var1 >= 0 && var1 < this.bn.length) {
            return -1 != this.bn[var1];
         } else {
            return this.bn[this.bn.length - 1] != -1;
         }
      }
   }

   public int[] ce() {
      return this.bq;
   }

   iz bn(int[] var1, hv var2) {
      int[] var3 = var1;
      if (var2 != null && var2.an != null) {
         var3 = var2.an;
      }

      if (null == var3) {
         return null;
      } else {
         boolean var4 = false;

         for(int var5 = 0; var5 < var3.length; ++var5) {
            if (var3[var5] != -1 && !aw.ce(var3[var5], 0, (byte)6)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            iz[] var9 = new iz[var3.length];

            for(int var6 = 0; var6 < var3.length; ++var6) {
               var9[var6] = iz.af(aw, var3[var6], 0);
            }

            iz var10;
            if (var9.length == 1) {
               var10 = var9[0];
               if (null == var10) {
                  var10 = new iz(var9, var9.length);
               }
            } else {
               var10 = new iz(var9, var9.length);
            }

            short[] var7;
            int var8;
            if (null != this.ap) {
               var7 = this.by;
               if (var2 != null && null != var2.aw) {
                  var7 = var2.aw;
               }

               for(var8 = 0; var8 < this.ap.length; ++var8) {
                  var10.as(this.ap[var8], var7[var8]);
               }
            }

            if (this.bb != null) {
               var7 = this.bi;
               if (null != var2 && var2.ac != null) {
                  var7 = var2.ac;
               }

               for(var8 = 0; var8 < this.bb.length; ++var8) {
                  var10.aj(this.bb[var8], var7[var8]);
               }
            }

            return var10;
         }
      }
   }

   iz bs(int[] var1, hv var2) {
      int[] var3 = var1;
      if (var2 != null && var2.an != null) {
         var3 = var2.an;
      }

      if (null == var3) {
         return null;
      } else {
         boolean var4 = false;

         for(int var5 = 0; var5 < var3.length; ++var5) {
            if (var3[var5] != -1 && !aw.ce(var3[var5], 0, (byte)24)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            iz[] var9 = new iz[var3.length];

            for(int var6 = 0; var6 < var3.length; ++var6) {
               var9[var6] = iz.af(aw, var3[var6], 0);
            }

            iz var10;
            if (var9.length == 1) {
               var10 = var9[0];
               if (null == var10) {
                  var10 = new iz(var9, var9.length);
               }
            } else {
               var10 = new iz(var9, var9.length);
            }

            short[] var7;
            int var8;
            if (null != this.ap) {
               var7 = this.by;
               if (var2 != null && null != var2.aw) {
                  var7 = var2.aw;
               }

               for(var8 = 0; var8 < this.ap.length; ++var8) {
                  var10.as(this.ap[var8], var7[var8]);
               }
            }

            if (this.bb != null) {
               var7 = this.bi;
               if (null != var2 && var2.ac != null) {
                  var7 = var2.ac;
               }

               for(var8 = 0; var8 < this.bb.length; ++var8) {
                  var10.aj(this.bb[var8], var7[var8]);
               }
            }

            return var10;
         }
      }
   }

   public boolean bh() {
      return null != this.bq && this.ba != null;
   }

   iz bg(int[] var1, hv var2) {
      int[] var3 = var1;
      if (var2 != null && var2.an != null) {
         var3 = var2.an;
      }

      if (null == var3) {
         return null;
      } else {
         boolean var4 = false;

         for(int var5 = 0; var5 < var3.length; ++var5) {
            if (var3[var5] != -1 && !aw.ce(var3[var5], 0, (byte)63)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            iz[] var9 = new iz[var3.length];

            for(int var6 = 0; var6 < var3.length; ++var6) {
               var9[var6] = iz.af(aw, var3[var6], 0);
            }

            iz var10;
            if (var9.length == 1) {
               var10 = var9[0];
               if (null == var10) {
                  var10 = new iz(var9, var9.length);
               }
            } else {
               var10 = new iz(var9, var9.length);
            }

            short[] var7;
            int var8;
            if (null != this.ap) {
               var7 = this.by;
               if (var2 != null && null != var2.aw) {
                  var7 = var2.aw;
               }

               for(var8 = 0; var8 < this.ap.length; ++var8) {
                  var10.as(this.ap[var8], var7[var8]);
               }
            }

            if (this.bb != null) {
               var7 = this.bi;
               if (null != var2 && var2.ac != null) {
                  var7 = var2.ac;
               }

               for(var8 = 0; var8 < this.bb.length; ++var8) {
                  var10.aj(this.bb[var8], var7[var8]);
               }
            }

            return var10;
         }
      }
   }

   void bi(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.au(var1, var2, 1239995114);
      }
   }

   public int bq(int var1, int var2) {
      ro var4 = this.bv;
      int var3;
      if (null == var4) {
         var3 = var2;
      } else {
         rt var5 = (rt)var4.af((long)var1);
         if (null == var5) {
            var3 = var2;
         } else {
            var3 = var5.af;
         }
      }

      return var3;
   }

   public String ba(int var1, String var2) {
      return hx.an(this.bv, var1, var2, 1565555626);
   }

   public String bv(int var1, String var2) {
      return hx.an(this.bv, var1, var2, 2108161937);
   }

   hs() {
      try {
         super();
         this.aq = mk.at;
         this.al = -1159021589;
         this.ay = -1304162881;
         this.ao = -1526449071;
         this.ax = -1325267127;
         this.ai = -1653161499;
         this.ag = 820247353;
         this.ah = -1030172671;
         this.av = 2142663477;
         this.ar = -1104808909;
         this.am = 1535672631;
         this.as = 257868351;
         this.aj = 1734270145;
         this.ak = 237251001;
         this.az = 1296177123;
         this.ad = 2136803683;
         this.ae = -2044090389;
         this.be = new String[5];
         this.bk = true;
         this.bx = 959716425;
         this.bo = 1835076736;
         this.bz = 2129768832;
         this.bm = false;
         this.bd = 0;
         this.bt = 0;
         this.bj = -1472822432;
         this.bs = -1998015621;
         this.br = -17057377;
         this.bg = true;
         this.bu = true;
         this.bf = false;
         this.bq = null;
         this.ba = null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "hs.<init>(" + ')');
      }
   }

   public static void bl() {
      ac.ac();
      au.ac();
   }

   public short ck(int var1) {
      return null != this.ba && var1 < this.ba.length ? this.ba[var1] : -1;
   }

   public int cs(int var1) {
      return null != this.bq && var1 < this.bq.length ? this.bq[var1] : -1;
   }

   public int[] bw() {
      return this.bq;
   }

   public int bf(int var1, int var2) {
      ro var4 = this.bv;
      int var3;
      if (null == var4) {
         var3 = var2;
      } else {
         rt var5 = (rt)var4.af((long)var1);
         if (null == var5) {
            var3 = var2;
         } else {
            var3 = var5.af;
         }
      }

      return var3;
   }

   public int[] ci() {
      return this.bq;
   }

   public final iz bt(hv var1) {
      if (null != this.bn) {
         hs var2 = this.at(1670360243);
         return null == var2 ? null : var2.aq(var1, (byte)64);
      } else {
         return this.al(this.aa, var1, -1519571988);
      }
   }

   public int cc(int var1) {
      return null != this.bq && var1 < this.bq.length ? this.bq[var1] : -1;
   }

   public boolean bp() {
      return null != this.bq && this.ba != null;
   }

   public final iz bj(hv var1) {
      if (null != this.bn) {
         hs var2 = this.at(2141022628);
         return null == var2 ? null : var2.aq(var1, (byte)64);
      } else {
         return this.al(this.aa, var1, -1568808377);
      }
   }

   public static hs aj(int var0) {
      hs var1 = (hs)ac.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = an.bh(9, var0, (byte)-113);
         var1 = new hs();
         var1.ab = -1772751813 * var0;
         if (null != var2) {
            var1.ac(new sg(var2), 1131909426);
         }

         var1.aw(835833293);
         ac.aw(var1, (long)var0);
         return var1;
      }
   }

   public String ao(int var1, String var2, int var3) {
      try {
         return hx.an(this.bv, var1, var2, 2050135786);
      } catch (RuntimeException var4) {
         throw db.an(var4, "hs.ao(" + ')');
      }
   }

   public short cq(int var1) {
      return null != this.ba && var1 < this.ba.length ? this.ba[var1] : -1;
   }

   public short cm(int var1) {
      return null != this.ba && var1 < this.ba.length ? this.ba[var1] : -1;
   }

   public static int aq(long var0) {
      try {
         return (int)(var0 >>> 7 & 127L);
      } catch (RuntimeException var2) {
         throw db.an(var2, "hs.aq(" + ')');
      }
   }
}
