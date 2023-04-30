import accessors.RSAbstractArchive;

public abstract class nm implements RSAbstractArchive {
   static int bz = 0;
   int[][] ae;
   int[] as;
   td aj;
   int[] ak;
   public int bk;
   int[] ad;
   int[] az;
   int[][] ap;
   td[] by;
   Object[] bb;
   int[] am;
   static tv be = new tv();
   Object[][] bi;
   boolean bx;
   boolean bo;
   int ar;
   static final String hs = "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play";

   public int cj(String var1, int var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.aj.af(hn.aq(var1, 1707483541), -1894150109);
         return this.aa(var3, -2021657849);
      } catch (RuntimeException var4) {
         throw db.an(var4, "nm.cj(" + ')');
      }
   }

   void bc(byte[] var1, byte var2) {
      try {
         this.bk = ii.br(var1, var1.length, (byte)-5) * -175856763;
         sg var3 = new sg(ai.ch(var1, -1117233973));
         int var4 = var3.cm((byte)7);
         if (var4 >= 5) {
            if (var2 != 104) {
               throw new IllegalStateException();
            }

            if (var4 <= 7) {
               if (var4 >= 6) {
                  if (var2 != 104) {
                     throw new IllegalStateException();
                  }

                  var3.cx(-1255336140);
               }

               int var5 = var3.cm((byte)7);
               if (var4 >= 7) {
                  if (var2 != 104) {
                     return;
                  }

                  this.ar = var3.dc(714180890) * 1692969259;
               } else {
                  this.ar = var3.cl(-675267339) * 1692969259;
               }

               int var6 = 0;
               int var7 = -1;
               this.am = new int[this.ar * -1754346109];
               int var8;
               if (var4 >= 7) {
                  if (var2 != 104) {
                     return;
                  }

                  for(var8 = 0; var8 < -1754346109 * this.ar; ++var8) {
                     if (var2 != 104) {
                        throw new IllegalStateException();
                     }

                     this.am[var8] = var6 += var3.dc(436410285);
                     if (this.am[var8] > var7) {
                        if (var2 != 104) {
                           throw new IllegalStateException();
                        }

                        var7 = this.am[var8];
                     }
                  }
               } else {
                  for(var8 = 0; var8 < this.ar * -1754346109; ++var8) {
                     if (var2 != 104) {
                        return;
                     }

                     this.am[var8] = var6 += var3.cl(-969585391);
                     if (this.am[var8] > var7) {
                        var7 = this.am[var8];
                     }
                  }
               }

               this.ak = new int[1 + var7];
               this.az = new int[1 + var7];
               this.ad = new int[var7 + 1];
               this.ae = new int[var7 + 1][];
               this.bb = new Object[1 + var7];
               this.bi = new Object[1 + var7][];
               if (0 != var5) {
                  if (var2 != 104) {
                     throw new IllegalStateException();
                  }

                  this.as = new int[var7 + 1];

                  for(var8 = 0; var8 < -1754346109 * this.ar; ++var8) {
                     if (var2 != 104) {
                        throw new IllegalStateException();
                     }

                     this.as[this.am[var8]] = var3.cx(-1309175100);
                  }

                  this.aj = new td(this.as);
               }

               for(var8 = 0; var8 < this.ar * -1754346109; ++var8) {
                  if (var2 != 104) {
                     throw new IllegalStateException();
                  }

                  this.ak[this.am[var8]] = var3.cx(-2087180508);
               }

               for(var8 = 0; var8 < this.ar * -1754346109; ++var8) {
                  if (var2 != 104) {
                     throw new IllegalStateException();
                  }

                  this.az[this.am[var8]] = var3.cx(-1463194794);
               }

               for(var8 = 0; var8 < this.ar * -1754346109; ++var8) {
                  if (var2 != 104) {
                     throw new IllegalStateException();
                  }

                  this.ad[this.am[var8]] = var3.cl(-1288330663);
               }

               int var9;
               int var10;
               int var11;
               int var12;
               int var13;
               if (var4 >= 7) {
                  if (var2 != 104) {
                     return;
                  }

                  for(var8 = 0; var8 < -1754346109 * this.ar; ++var8) {
                     if (var2 != 104) {
                        throw new IllegalStateException();
                     }

                     var9 = this.am[var8];
                     var10 = this.ad[var9];
                     var6 = 0;
                     var11 = -1;
                     this.ae[var9] = new int[var10];

                     for(var12 = 0; var12 < var10; ++var12) {
                        var13 = this.ae[var9][var12] = var6 += var3.dc(835405681);
                        if (var13 > var11) {
                           if (var2 != 104) {
                              return;
                           }

                           var11 = var13;
                        }
                     }

                     this.bi[var9] = new Object[1 + var11];
                  }
               } else {
                  for(var8 = 0; var8 < -1754346109 * this.ar; ++var8) {
                     if (var2 != 104) {
                        throw new IllegalStateException();
                     }

                     var9 = this.am[var8];
                     var10 = this.ad[var9];
                     var6 = 0;
                     var11 = -1;
                     this.ae[var9] = new int[var10];

                     for(var12 = 0; var12 < var10; ++var12) {
                        if (var2 != 104) {
                           throw new IllegalStateException();
                        }

                        var13 = this.ae[var9][var12] = var6 += var3.cl(-1578757249);
                        if (var13 > var11) {
                           if (var2 != 104) {
                              return;
                           }

                           var11 = var13;
                        }
                     }

                     this.bi[var9] = new Object[var11 + 1];
                  }
               }

               if (var5 != 0) {
                  this.ap = new int[1 + var7][];
                  this.by = new td[1 + var7];

                  for(var8 = 0; var8 < this.ar * -1754346109; ++var8) {
                     if (var2 != 104) {
                        throw new IllegalStateException();
                     }

                     var9 = this.am[var8];
                     var10 = this.ad[var9];
                     this.ap[var9] = new int[this.bi[var9].length];

                     for(var11 = 0; var11 < var10; ++var11) {
                        this.ap[var9][this.ae[var9][var11]] = var3.cx(-1705050856);
                     }

                     this.by[var9] = new td(this.ap[var9]);
                  }
               }

               return;
            }

            if (var2 != 104) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var14) {
         throw db.an(var14, "nm.bc(" + ')');
      }
   }

   public byte[] dw(int var1, int var2) {
      return this.bw(var1, var2, (int[])null, 2078518098);
   }

   public boolean dl(int var1) {
      if (this.bi.length == 1) {
         return this.ce(0, var1, (byte)5);
      } else if (1 == this.bi[var1].length) {
         return this.ce(var1, 0, (byte)-98);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] bw(int var1, int var2, int[] var3, int var4) {
      try {
         if (var1 >= 0) {
            if (var4 == -1279187589) {
               throw new IllegalStateException();
            }

            if (var1 < this.bi.length && this.bi[var1] != null) {
               if (var4 == -1279187589) {
                  throw new IllegalStateException();
               }

               if (var2 >= 0) {
                  if (var4 == -1279187589) {
                     throw new IllegalStateException();
                  }

                  if (var2 < this.bi[var1].length) {
                     if (null == this.bi[var1][var2]) {
                        if (var4 == -1279187589) {
                           throw new IllegalStateException();
                        }

                        boolean var5 = this.cr(var1, var3, -2109762247);
                        if (!var5) {
                           if (var4 == -1279187589) {
                              throw new IllegalStateException();
                           }

                           this.ac(var1, -1884547323);
                           var5 = this.cr(var1, var3, -2109762247);
                           if (!var5) {
                              if (var4 == -1279187589) {
                                 throw new IllegalStateException();
                              }

                              return null;
                           }
                        }
                     }

                     byte[] var7 = hm.an(this.bi[var1][var2], false, 2040236777);
                     if (this.bo) {
                        if (var4 == -1279187589) {
                           throw new IllegalStateException();
                        }

                        this.bi[var1][var2] = null;
                     }

                     return var7;
                  }

                  if (var4 == -1279187589) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw db.an(var6, "nm.bw(" + ')');
      }
   }

   public boolean ce(int var1, int var2, byte var3) {
      try {
         if (var1 >= 0) {
            if (var3 == 3) {
               throw new IllegalStateException();
            }

            if (var1 < this.bi.length) {
               if (var3 == 3) {
                  throw new IllegalStateException();
               }

               if (null != this.bi[var1] && var2 >= 0) {
                  if (var3 == 3) {
                     throw new IllegalStateException();
                  }

                  if (var2 < this.bi[var1].length) {
                     if (null != this.bi[var1][var2]) {
                        if (var3 == 3) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     if (null != this.bb[var1]) {
                        if (var3 == 3) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     this.ac(var1, -2127386977);
                     if (null != this.bb[var1]) {
                        if (var3 == 3) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     return false;
                  }

                  if (var3 == 3) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw db.an(var4, "nm.ce(" + ')');
      }
   }

   public int[] ck(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 100789159) {
               throw new IllegalStateException();
            }

            if (var1 < this.ae.length) {
               return this.ae[var1];
            }

            if (var2 <= 100789159) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.ck(" + ')');
      }
   }

   public int cx(int var1, String var2, short var3) {
      try {
         var2 = var2.toLowerCase();
         return this.by[var1].af(hn.aq(var2, 1358651763), -11499816);
      } catch (RuntimeException var4) {
         throw db.an(var4, "nm.cx(" + ')');
      }
   }

   public int ej(String var1) {
      var1 = var1.toLowerCase();
      return this.aj.af(hn.aq(var1, 1021048531), -281959148);
   }

   int aa(int var1, int var2) {
      try {
         if (null != this.bb[var1]) {
            if (var2 >= -1633313603) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.aa(" + ')');
      }
   }

   public void ew(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.aj.af(hn.aq(var1, 651074567), 890316911);
      if (var2 >= 0) {
         this.aw(var2, -1438945382);
      }
   }

   public byte[] ca(int var1, int var2, int var3) {
      try {
         if (var1 >= 0) {
            if (var3 != -606351717) {
               throw new IllegalStateException();
            }

            if (var1 < this.bi.length) {
               if (var3 != -606351717) {
                  throw new IllegalStateException();
               }

               if (null != this.bi[var1]) {
                  if (var3 != -606351717) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= 0) {
                     if (var3 != -606351717) {
                        throw new IllegalStateException();
                     }

                     if (var2 < this.bi[var1].length) {
                        if (this.bi[var1][var2] == null) {
                           if (var3 != -606351717) {
                              throw new IllegalStateException();
                           }

                           boolean var4 = this.cr(var1, (int[])null, -2109762247);
                           if (!var4) {
                              this.ac(var1, -1906942007);
                              var4 = this.cr(var1, (int[])null, -2109762247);
                              if (!var4) {
                                 if (var3 != -606351717) {
                                    throw new IllegalStateException();
                                 }

                                 return null;
                              }
                           }
                        }

                        byte[] var6 = hm.an(this.bi[var1][var2], false, 1237531482);
                        return var6;
                     }

                     if (var3 != -606351717) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw db.an(var5, "nm.ca(" + ')');
      }
   }

   public byte[] cu(int var1, int var2) {
      try {
         if (1 == this.bi.length) {
            if (var2 == 1086265912) {
               throw new IllegalStateException();
            } else {
               return this.ca(0, var1, -606351717);
            }
         } else if (1 == this.bi[var1].length) {
            if (var2 == 1086265912) {
               throw new IllegalStateException();
            } else {
               return this.ca(var1, 0, -606351717);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.cu(" + ')');
      }
   }

   void ac(int var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.ac(" + ')');
      }
   }

   public boolean ci(int var1, int var2) {
      try {
         if (this.bi.length == 1) {
            if (var2 != 953853219) {
               throw new IllegalStateException();
            } else {
               return this.ce(0, var1, (byte)-21);
            }
         } else if (1 == this.bi[var1].length) {
            if (var2 != 953853219) {
               throw new IllegalStateException();
            } else {
               return this.ce(var1, 0, (byte)-8);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.ci(" + ')');
      }
   }

   public int cq(int var1, byte var2) {
      try {
         if (this.bi != null && var1 < this.bi.length) {
            if (null != this.bi[var1]) {
               return this.bi[var1].length;
            }

            if (var2 <= 0) {
               throw new IllegalStateException();
            }
         }

         return 0;
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.cq(" + ')');
      }
   }

   public int cm(int var1) {
      try {
         return this.bi.length;
      } catch (RuntimeException var2) {
         throw db.an(var2, "nm.cm(" + ')');
      }
   }

   public void cf(int var1) {
      try {
         for(int var2 = 0; var2 < this.bb.length; ++var2) {
            if (var1 <= 2144946680) {
               throw new IllegalStateException();
            }

            this.bb[var2] = null;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.cf(" + ')');
      }
   }

   public void cl(int var1, byte var2) {
      try {
         for(int var3 = 0; var3 < this.bi[var1].length; ++var3) {
            this.bi[var1][var3] = null;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "nm.cl(" + ')');
      }
   }

   void ak(int var1) {
   }

   boolean cr(int var1, int[] var2, int var3) {
      try {
         if (this.bb[var1] == null) {
            return false;
         } else {
            int var4 = this.ad[var1];
            int[] var5 = this.ae[var1];
            Object[] var6 = this.bi[var1];
            boolean var7 = true;

            for(int var8 = 0; var8 < var4; ++var8) {
               if (var3 != -2109762247) {
                  throw new IllegalStateException();
               }

               if (var6[var5[var8]] == null) {
                  if (var3 != -2109762247) {
                     throw new IllegalStateException();
                  }

                  var7 = false;
                  break;
               }
            }

            if (var7) {
               if (var3 != -2109762247) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               byte[] var21;
               label188: {
                  label187: {
                     if (var2 != null) {
                        if (var3 != -2109762247) {
                           throw new IllegalStateException();
                        }

                        if (0 != var2[0]) {
                           break label187;
                        }

                        if (var3 != -2109762247) {
                           throw new IllegalStateException();
                        }

                        if (0 != var2[1]) {
                           break label187;
                        }

                        if (var3 != -2109762247) {
                           throw new IllegalStateException();
                        }

                        if (0 != var2[2]) {
                           break label187;
                        }

                        if (var3 != -2109762247) {
                           throw new IllegalStateException();
                        }

                        if (var2[3] != 0) {
                           break label187;
                        }
                     }

                     var21 = hm.an(this.bb[var1], false, 1690301649);
                     break label188;
                  }

                  var21 = hm.an(this.bb[var1], true, 992395884);
                  sg var9 = new sg(var21);
                  var9.dv(var2, 5, var9.al.length, -1350839672);
               }

               byte[] var22;
               try {
                  var22 = ai.ch(var21, -1117233973);
               } catch (RuntimeException var19) {
                  StringBuilder var10001 = (new StringBuilder()).append("");
                  boolean var10002;
                  if (null != var2) {
                     if (var3 != -2109762247) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  throw db.an(var19, var10001.append(var10002).append(",").append(var1).append(",").append(var21.length).append(",").append(ii.br(var21, var21.length, (byte)-125)).append(",").append(ii.br(var21, var21.length - 2, (byte)-115)).append(",").append(this.ak[var1]).append(",").append(this.bk * -159523507).toString());
               }

               if (this.bx) {
                  if (var3 != -2109762247) {
                     throw new IllegalStateException();
                  }

                  this.bb[var1] = null;
               }

               if (var4 > 1) {
                  if (var3 != -2109762247) {
                     throw new IllegalStateException();
                  }

                  int var10 = var22.length;
                  --var10;
                  int var11 = var22[var10] & 255;
                  var10 -= 4 * var4 * var11;
                  sg var12 = new sg(var22);
                  int[] var13 = new int[var4];
                  var12.at = -1516355947 * var10;

                  int var15;
                  int var16;
                  for(int var14 = 0; var14 < var11; ++var14) {
                     if (var3 != -2109762247) {
                        throw new IllegalStateException();
                     }

                     var15 = 0;

                     for(var16 = 0; var16 < var4; ++var16) {
                        if (var3 != -2109762247) {
                           throw new IllegalStateException();
                        }

                        var15 += var12.cx(-1317867063);
                        var13[var16] += var15;
                     }
                  }

                  byte[][] var23 = new byte[var4][];

                  for(var15 = 0; var15 < var4; ++var15) {
                     if (var3 != -2109762247) {
                        throw new IllegalStateException();
                     }

                     var23[var15] = new byte[var13[var15]];
                     var13[var15] = 0;
                  }

                  var12.at = var10 * -1516355947;
                  var15 = 0;

                  for(var16 = 0; var16 < var11; ++var16) {
                     if (var3 != -2109762247) {
                        throw new IllegalStateException();
                     }

                     int var17 = 0;

                     for(int var18 = 0; var18 < var4; ++var18) {
                        if (var3 != -2109762247) {
                           throw new IllegalStateException();
                        }

                        var17 += var12.cx(-1475434261);
                        System.arraycopy(var22, var15, var23[var18], var13[var18], var17);
                        var13[var18] += var17;
                        var15 += var17;
                     }
                  }

                  for(var16 = 0; var16 < var4; ++var16) {
                     if (!this.bo) {
                        if (var3 != -2109762247) {
                           throw new IllegalStateException();
                        }

                        var6[var5[var16]] = ef.af(var23[var16], false, 898576795);
                     } else {
                        var6[var5[var16]] = var23[var16];
                     }
                  }
               } else if (!this.bo) {
                  if (var3 != -2109762247) {
                     throw new IllegalStateException();
                  }

                  var6[var5[0]] = ef.af(var22, false, 753943277);
               } else {
                  var6[var5[0]] = var22;
               }

               return true;
            }
         }
      } catch (RuntimeException var20) {
         throw db.an(var20, "nm.cr(" + ')');
      }
   }

   public int cy(String var1, int var2) {
      try {
         var1 = var1.toLowerCase();
         return this.aj.af(hn.aq(var1, 827030154), -924326194);
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.cy(" + ')');
      }
   }

   public void cg(int var1) {
      try {
         for(int var2 = 0; var2 < this.bi.length; ++var2) {
            if (var1 != 1903798827) {
               return;
            }

            if (this.bi[var2] != null) {
               if (var1 != 1903798827) {
                  throw new IllegalStateException();
               }

               for(int var3 = 0; var3 < this.bi[var2].length; ++var3) {
                  this.bi[var2][var3] = null;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "nm.cg(" + ')');
      }
   }

   public boolean cv(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aj.af(hn.aq(var1, 130372673), 694114618);
         if (var4 < 0) {
            if (var3 != -1313069490) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var5 = this.by[var4].af(hn.aq(var2, 1207681018), -48402496);
            if (var5 < 0) {
               if (var3 != -1313069490) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "nm.cv(" + ')');
      }
   }

   public byte[] cb(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aj.af(hn.aq(var1, 1484453065), -1669080518);
         int var5 = this.by[var4].af(hn.aq(var2, 1599141995), 1684338933);
         return this.bh(var4, var5, (byte)-113);
      } catch (RuntimeException var6) {
         throw db.an(var6, "nm.cb(" + ')');
      }
   }

   public byte[] bh(int var1, int var2, byte var3) {
      try {
         return this.bw(var1, var2, (int[])null, 1331353922);
      } catch (RuntimeException var4) {
         throw db.an(var4, "nm.bh(" + ')');
      }
   }

   public boolean cz(String var1, int var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.aj.af(hn.aq(var1, 1459523498), -1348513416);
         return this.cs(var3, 1653429081);
      } catch (RuntimeException var4) {
         throw db.an(var4, "nm.cz(" + ')');
      }
   }

   public void cw(String var1, int var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.aj.af(hn.aq(var1, 1837625827), -310630090);
         if (var3 < 0) {
            if (var2 != -1348062367) {
               ;
            }
         } else {
            this.aw(var3, -2103539915);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "nm.cw(" + ')');
      }
   }

   public byte[] eb(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aj.af(hn.aq(var1, -18779808), -775866076);
      int var4 = this.by[var3].af(hn.aq(var2, 704861010), -901362933);
      return this.bh(var3, var4, (byte)-26);
   }

   public int dq(int var1) {
      return this.bi != null && var1 < this.bi.length && null != this.bi[var1] ? this.bi[var1].length : 0;
   }

   void as(int var1) {
   }

   void aj(int var1) {
   }

   public boolean dz() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.am.length; ++var2) {
         int var3 = this.am[var2];
         if (null == this.bb[var3]) {
            this.ac(var3, -1840369660);
            if (null == this.bb[var3]) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   void az(int var1) {
   }

   int bn(int var1) {
      return null != this.bb[var1] ? 100 : 0;
   }

   int bt(int var1) {
      return null != this.bb[var1] ? 100 : 0;
   }

   int bj(int var1) {
      return null != this.bb[var1] ? 100 : 0;
   }

   public void dy(int var1) {
      for(int var2 = 0; var2 < this.bi[var1].length; ++var2) {
         this.bi[var1][var2] = null;
      }

   }

   void cp(byte[] var1) {
      this.bk = ii.br(var1, var1.length, (byte)-46) * -175856763;
      sg var2 = new sg(ai.ch(var1, -1117233973));
      int var3 = var2.cm((byte)7);
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            var2.cx(-961816597);
         }

         int var4 = var2.cm((byte)7);
         if (var3 >= 7) {
            this.ar = var2.dc(1949486244) * 1692969259;
         } else {
            this.ar = var2.cl(-292108770) * 1692969259;
         }

         int var5 = 0;
         int var6 = -1;
         this.am = new int[this.ar * -1754346109];
         int var7;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               this.am[var7] = var5 += var2.dc(619852198);
               if (this.am[var7] > var6) {
                  var6 = this.am[var7];
               }
            }
         } else {
            for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
               this.am[var7] = var5 += var2.cl(-118000344);
               if (this.am[var7] > var6) {
                  var6 = this.am[var7];
               }
            }
         }

         this.ak = new int[1 + var6];
         this.az = new int[1 + var6];
         this.ad = new int[var6 + 1];
         this.ae = new int[var6 + 1][];
         this.bb = new Object[1 + var6];
         this.bi = new Object[1 + var6][];
         if (0 != var4) {
            this.as = new int[var6 + 1];

            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               this.as[this.am[var7]] = var2.cx(-1673257423);
            }

            this.aj = new td(this.as);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.ak[this.am[var7]] = var2.cx(-1988960964);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.az[this.am[var7]] = var2.cx(-1804561683);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.ad[this.am[var7]] = var2.cl(392027868);
         }

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               var5 = 0;
               var10 = -1;
               this.ae[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.ae[var8][var11] = var5 += var2.dc(1813801302);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bi[var8] = new Object[1 + var10];
            }
         } else {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               var5 = 0;
               var10 = -1;
               this.ae[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.ae[var8][var11] = var5 += var2.cl(202165640);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bi[var8] = new Object[var10 + 1];
            }
         }

         if (var4 != 0) {
            this.ap = new int[1 + var6][];
            this.by = new td[1 + var6];

            for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               this.ap[var8] = new int[this.bi[var8].length];

               for(var10 = 0; var10 < var9; ++var10) {
                  this.ap[var8][this.ae[var8][var10]] = var2.cx(-1599538646);
               }

               this.by[var8] = new td(this.ap[var8]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   public static hs an(int var0, byte var1) {
      try {
         hs var2 = (hs)hs.ac.af((long)var0);
         if (null != var2) {
            if (var1 >= 16) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hs.an.bh(9, var0, (byte)-94);
            var2 = new hs();
            var2.ab = -1772751813 * var0;
            if (null != var3) {
               if (var1 >= 16) {
                  throw new IllegalStateException();
               }

               var2.ac(new sg(var3), -247932803);
            }

            var2.aw(835833293);
            hs.ac.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "nm.an(" + ')');
      }
   }

   void dm(byte[] var1) {
      this.bk = ii.br(var1, var1.length, (byte)-69) * -175856763;
      sg var2 = new sg(ai.ch(var1, -1117233973));
      int var3 = var2.cm((byte)7);
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            var2.cx(-1970055211);
         }

         int var4 = var2.cm((byte)7);
         if (var3 >= 7) {
            this.ar = var2.dc(1641433900) * 1692969259;
         } else {
            this.ar = var2.cl(-1177475638) * 1692969259;
         }

         int var5 = 0;
         int var6 = -1;
         this.am = new int[this.ar * -1754346109];
         int var7;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               this.am[var7] = var5 += var2.dc(731079159);
               if (this.am[var7] > var6) {
                  var6 = this.am[var7];
               }
            }
         } else {
            for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
               this.am[var7] = var5 += var2.cl(-1868853025);
               if (this.am[var7] > var6) {
                  var6 = this.am[var7];
               }
            }
         }

         this.ak = new int[1 + var6];
         this.az = new int[1 + var6];
         this.ad = new int[var6 + 1];
         this.ae = new int[var6 + 1][];
         this.bb = new Object[1 + var6];
         this.bi = new Object[1 + var6][];
         if (0 != var4) {
            this.as = new int[var6 + 1];

            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               this.as[this.am[var7]] = var2.cx(-1610152830);
            }

            this.aj = new td(this.as);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.ak[this.am[var7]] = var2.cx(-878130813);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.az[this.am[var7]] = var2.cx(-1686542259);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.ad[this.am[var7]] = var2.cl(-1152237756);
         }

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               var5 = 0;
               var10 = -1;
               this.ae[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.ae[var8][var11] = var5 += var2.dc(2005214459);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bi[var8] = new Object[1 + var10];
            }
         } else {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               var5 = 0;
               var10 = -1;
               this.ae[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.ae[var8][var11] = var5 += var2.cl(803984307);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bi[var8] = new Object[var10 + 1];
            }
         }

         if (var4 != 0) {
            this.ap = new int[1 + var6][];
            this.by = new td[1 + var6];

            for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               this.ap[var8] = new int[this.bi[var8].length];

               for(var10 = 0; var10 < var9; ++var10) {
                  this.ap[var8][this.ae[var8][var10]] = var2.cx(-1583125500);
               }

               this.by[var8] = new td(this.ap[var8]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   public boolean ed(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.aj.af(hn.aq(var1, 750946693), -1697667403);
      return this.cs(var2, 309462809);
   }

   public byte[] dc(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.bi.length && this.bi[var1] != null && var2 >= 0 && var2 < this.bi[var1].length) {
         if (null == this.bi[var1][var2]) {
            boolean var4 = this.cr(var1, var3, -2109762247);
            if (!var4) {
               this.ac(var1, -2085061684);
               var4 = this.cr(var1, var3, -2109762247);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = hm.an(this.bi[var1][var2], false, 1740444942);
         if (this.bo) {
            this.bi[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   public boolean do(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bi.length && null != this.bi[var1] && var2 >= 0 && var2 < this.bi[var1].length) {
         if (null != this.bi[var1][var2]) {
            return true;
         } else if (null != this.bb[var1]) {
            return true;
         } else {
            this.ac(var1, -2097873384);
            return null != this.bb[var1];
         }
      } else {
         return false;
      }
   }

   public boolean di(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bi.length && null != this.bi[var1] && var2 >= 0 && var2 < this.bi[var1].length) {
         if (null != this.bi[var1][var2]) {
            return true;
         } else if (null != this.bb[var1]) {
            return true;
         } else {
            this.ac(var1, -2062113138);
            return null != this.bb[var1];
         }
      } else {
         return false;
      }
   }

   public boolean dr(int var1) {
      if (this.bi.length == 1) {
         return this.ce(0, var1, (byte)-50);
      } else if (1 == this.bi[var1].length) {
         return this.ce(var1, 0, (byte)-10);
      } else {
         throw new RuntimeException();
      }
   }

   public boolean dv(int var1) {
      if (this.bb[var1] != null) {
         return true;
      } else {
         this.ac(var1, -2132778146);
         return null != this.bb[var1];
      }
   }

   public boolean dk(int var1) {
      if (this.bb[var1] != null) {
         return true;
      } else {
         this.ac(var1, -1889742080);
         return null != this.bb[var1];
      }
   }

   public boolean dt(int var1) {
      if (this.bb[var1] != null) {
         return true;
      } else {
         this.ac(var1, -1723895676);
         return null != this.bb[var1];
      }
   }

   void ct(byte[] var1) {
      this.bk = ii.br(var1, var1.length, (byte)-36) * -175856763;
      sg var2 = new sg(ai.ch(var1, -1117233973));
      int var3 = var2.cm((byte)7);
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            var2.cx(-1719929798);
         }

         int var4 = var2.cm((byte)7);
         if (var3 >= 7) {
            this.ar = var2.dc(460541294) * 1692969259;
         } else {
            this.ar = var2.cl(634653042) * 1692969259;
         }

         int var5 = 0;
         int var6 = -1;
         this.am = new int[this.ar * -1754346109];
         int var7;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               this.am[var7] = var5 += var2.dc(357759643);
               if (this.am[var7] > var6) {
                  var6 = this.am[var7];
               }
            }
         } else {
            for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
               this.am[var7] = var5 += var2.cl(238078309);
               if (this.am[var7] > var6) {
                  var6 = this.am[var7];
               }
            }
         }

         this.ak = new int[1 + var6];
         this.az = new int[1 + var6];
         this.ad = new int[var6 + 1];
         this.ae = new int[var6 + 1][];
         this.bb = new Object[1 + var6];
         this.bi = new Object[1 + var6][];
         if (0 != var4) {
            this.as = new int[var6 + 1];

            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               this.as[this.am[var7]] = var2.cx(-949258250);
            }

            this.aj = new td(this.as);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.ak[this.am[var7]] = var2.cx(-1875338228);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.az[this.am[var7]] = var2.cx(-903723973);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.ad[this.am[var7]] = var2.cl(-869365980);
         }

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               var5 = 0;
               var10 = -1;
               this.ae[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.ae[var8][var11] = var5 += var2.dc(1535037708);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bi[var8] = new Object[1 + var10];
            }
         } else {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               var5 = 0;
               var10 = -1;
               this.ae[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.ae[var8][var11] = var5 += var2.cl(-755376672);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bi[var8] = new Object[var10 + 1];
            }
         }

         if (var4 != 0) {
            this.ap = new int[1 + var6][];
            this.by = new td[1 + var6];

            for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               this.ap[var8] = new int[this.bi[var8].length];

               for(var10 = 0; var10 < var9; ++var10) {
                  this.ap[var8][this.ae[var8][var10]] = var2.cx(-2134813579);
               }

               this.by[var8] = new td(this.ap[var8]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   public void ex(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.aj.af(hn.aq(var1, 1087184917), 1862161893);
      if (var2 >= 0) {
         this.aw(var2, 1912049854);
      }
   }

   public boolean dg() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.am.length; ++var2) {
         int var3 = this.am[var2];
         if (null == this.bb[var3]) {
            this.ac(var3, -2078385595);
            if (null == this.bb[var3]) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   public byte[] de(int var1) {
      if (this.bi.length == 1) {
         return this.bh(0, var1, (byte)-115);
      } else if (this.bi[var1].length == 1) {
         return this.bh(var1, 0, (byte)-120);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] dh(int var1) {
      if (this.bi.length == 1) {
         return this.bh(0, var1, (byte)-16);
      } else if (this.bi[var1].length == 1) {
         return this.bh(var1, 0, (byte)-38);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] dp(int var1) {
      if (this.bi.length == 1) {
         return this.bh(0, var1, (byte)-75);
      } else if (this.bi[var1].length == 1) {
         return this.bh(var1, 0, (byte)-102);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] du(int var1) {
      if (this.bi.length == 1) {
         return this.bh(0, var1, (byte)-54);
      } else if (this.bi[var1].length == 1) {
         return this.bh(var1, 0, (byte)-123);
      } else {
         throw new RuntimeException();
      }
   }

   public int ea(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.by[var1].af(hn.aq(var2, 117404481), 576178803);
   }

   public byte[] df(int var1) {
      if (1 == this.bi.length) {
         return this.ca(0, var1, -606351717);
      } else if (1 == this.bi[var1].length) {
         return this.ca(var1, 0, -606351717);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] cn(int var1, byte var2) {
      try {
         if (this.bi.length == 1) {
            if (var2 == 2) {
               throw new IllegalStateException();
            } else {
               return this.bh(0, var1, (byte)-123);
            }
         } else if (this.bi[var1].length == 1) {
            return this.bh(var1, 0, (byte)-48);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.cn(" + ')');
      }
   }

   public byte[] db(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bi.length && null != this.bi[var1] && var2 >= 0 && var2 < this.bi[var1].length) {
         if (this.bi[var1][var2] == null) {
            boolean var3 = this.cr(var1, (int[])null, -2109762247);
            if (!var3) {
               this.ac(var1, -2116330151);
               var3 = this.cr(var1, (int[])null, -2109762247);
               if (!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = hm.an(this.bi[var1][var2], false, 996130584);
         return var4;
      } else {
         return null;
      }
   }

   void aw(int var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.aw(" + ')');
      }
   }

   public void dx() {
      for(int var1 = 0; var1 < this.bb.length; ++var1) {
         this.bb[var1] = null;
      }

   }

   public void dn() {
      for(int var1 = 0; var1 < this.bb.length; ++var1) {
         this.bb[var1] = null;
      }

   }

   public boolean eu(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aj.af(hn.aq(var1, 604112997), -397022320);
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.by[var3].af(hn.aq(var2, 876935485), -66013933);
         return var4 >= 0;
      }
   }

   static final byte[] ey(byte[] var0) {
      sg var1 = new sg(var0);
      int var2 = var1.cm((byte)7);
      int var3 = var1.cx(-871574246);
      if (var3 < 0 || 0 != bz * 1366958206 && var3 > bz * 401859175) {
         throw new RuntimeException();
      } else if (var2 == 0) {
         byte[] var6 = new byte[var3];
         var1.ct(var6, 0, var3, -1570744551);
         return var6;
      } else {
         int var4 = var1.cx(-1688548225);
         if (var4 >= 0 && (0 == bz * 401859175 || var4 <= bz * 401859175)) {
            byte[] var5 = new byte[var4];
            if (var2 == 1) {
               sv.af(var5, var4, var0, var3, 9);
            } else {
               be.af(var1, var5, 1293232912);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }

   public void da() {
      for(int var1 = 0; var1 < this.bi.length; ++var1) {
         if (this.bi[var1] != null) {
            for(int var2 = 0; var2 < this.bi[var1].length; ++var2) {
               this.bi[var1][var2] = null;
            }
         }
      }

   }

   boolean ep(int var1, int[] var2) {
      if (this.bb[var1] == null) {
         return false;
      } else {
         int var3 = this.ad[var1];
         int[] var4 = this.ae[var1];
         Object[] var5 = this.bi[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (var2 != null && (0 != var2[0] || 0 != var2[1] || 0 != var2[2] || var2[3] != 0)) {
               var19 = hm.an(this.bb[var1], true, 1950443721);
               sg var8 = new sg(var19);
               var8.dv(var2, 5, var8.al.length, -1350839672);
            } else {
               var19 = hm.an(this.bb[var1], false, 1575785694);
            }

            byte[] var20;
            try {
               var20 = ai.ch(var19, -1117233973);
            } catch (RuntimeException var18) {
               throw db.an(var18, "" + (null != var2) + "," + var1 + "," + var19.length + "," + ii.br(var19, var19.length, (byte)-82) + "," + ii.br(var19, var19.length - 2, (byte)-2) + "," + this.ak[var1] + "," + this.bk * -159523507);
            }

            if (this.bx) {
               this.bb[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= 4 * var3 * var10;
               sg var11 = new sg(var20);
               int[] var12 = new int[var3];
               var11.at = -1516355947 * var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.cx(-1925251970);
                     var12[var15] += var14;
                  }
               }

               byte[][] var21 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var21[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.at = var9 * -1516355947;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.cx(-1889991658);
                     System.arraycopy(var20, var14, var21[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if (!this.bo) {
                     var5[var4[var15]] = ef.af(var21[var15], false, 857379635);
                  } else {
                     var5[var4[var15]] = var21[var15];
                  }
               }
            } else if (!this.bo) {
               var5[var4[0]] = ef.af(var20, false, 1748077415);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   public boolean cs(int var1, int var2) {
      try {
         if (this.bb[var1] != null) {
            if (var2 == 12434877) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            this.ac(var1, -2013494015);
            if (null != this.bb[var1]) {
               if (var2 == 12434877) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.cs(" + ')');
      }
   }

   boolean eq(int var1, int[] var2) {
      if (this.bb[var1] == null) {
         return false;
      } else {
         int var3 = this.ad[var1];
         int[] var4 = this.ae[var1];
         Object[] var5 = this.bi[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (var2 != null && (0 != var2[0] || 0 != var2[1] || 0 != var2[2] || var2[3] != 0)) {
               var19 = hm.an(this.bb[var1], true, 714897877);
               sg var8 = new sg(var19);
               var8.dv(var2, 5, var8.al.length, -1350839672);
            } else {
               var19 = hm.an(this.bb[var1], false, 780309641);
            }

            byte[] var20;
            try {
               var20 = ai.ch(var19, -1117233973);
            } catch (RuntimeException var18) {
               throw db.an(var18, "" + (null != var2) + "," + var1 + "," + var19.length + "," + ii.br(var19, var19.length, (byte)-66) + "," + ii.br(var19, var19.length - 2, (byte)-49) + "," + this.ak[var1] + "," + this.bk * -159523507);
            }

            if (this.bx) {
               this.bb[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= 4 * var3 * var10;
               sg var11 = new sg(var20);
               int[] var12 = new int[var3];
               var11.at = -1516355947 * var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.cx(-989085731);
                     var12[var15] += var14;
                  }
               }

               byte[][] var21 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var21[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.at = var9 * -1516355947;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.cx(-1415682342);
                     System.arraycopy(var20, var14, var21[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if (!this.bo) {
                     var5[var4[var15]] = ef.af(var21[var15], false, 1517681727);
                  } else {
                     var5[var4[var15]] = var21[var15];
                  }
               }
            } else if (!this.bo) {
               var5[var4[0]] = ef.af(var20, false, 450255419);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   boolean et(int var1, int[] var2) {
      if (this.bb[var1] == null) {
         return false;
      } else {
         int var3 = this.ad[var1];
         int[] var4 = this.ae[var1];
         Object[] var5 = this.bi[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (var2 != null && (0 != var2[0] || 0 != var2[1] || 0 != var2[2] || var2[3] != 0)) {
               var19 = hm.an(this.bb[var1], true, 1865652819);
               sg var8 = new sg(var19);
               var8.dv(var2, 5, var8.al.length, -1350839672);
            } else {
               var19 = hm.an(this.bb[var1], false, 1269108154);
            }

            byte[] var20;
            try {
               var20 = ai.ch(var19, -1117233973);
            } catch (RuntimeException var18) {
               throw db.an(var18, "" + (null != var2) + "," + var1 + "," + var19.length + "," + ii.br(var19, var19.length, (byte)-76) + "," + ii.br(var19, var19.length - 2, (byte)-95) + "," + this.ak[var1] + "," + this.bk * -612458785);
            }

            if (this.bx) {
               this.bb[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= 4 * var3 * var10;
               sg var11 = new sg(var20);
               int[] var12 = new int[var3];
               var11.at = -1516355947 * var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.cx(-1158395402);
                     var12[var15] += var14;
                  }
               }

               byte[][] var21 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var21[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.at = var9 * -1516355947;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.cx(-1800635982);
                     System.arraycopy(var20, var14, var21[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if (!this.bo) {
                     var5[var4[var15]] = ef.af(var21[var15], false, 1307185018);
                  } else {
                     var5[var4[var15]] = var21[var15];
                  }
               }
            } else if (!this.bo) {
               var5[var4[0]] = ef.af(var20, false, 1816646364);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   public int ef(String var1) {
      var1 = var1.toLowerCase();
      return this.aj.af(hn.aq(var1, 1372900989), 2056572279);
   }

   public int ez(String var1) {
      var1 = var1.toLowerCase();
      return this.aj.af(hn.aq(var1, 1012079764), -713626146);
   }

   boolean eo(int var1, int[] var2) {
      if (this.bb[var1] == null) {
         return false;
      } else {
         int var3 = this.ad[var1];
         int[] var4 = this.ae[var1];
         Object[] var5 = this.bi[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (var2 != null && (0 != var2[0] || 0 != var2[1] || 0 != var2[2] || var2[3] != 0)) {
               var19 = hm.an(this.bb[var1], true, 1443999598);
               sg var8 = new sg(var19);
               var8.dv(var2, 5, var8.al.length, -1350839672);
            } else {
               var19 = hm.an(this.bb[var1], false, 864240609);
            }

            byte[] var20;
            try {
               var20 = ai.ch(var19, -1117233973);
            } catch (RuntimeException var18) {
               throw db.an(var18, "" + (null != var2) + "," + var1 + "," + var19.length + "," + ii.br(var19, var19.length, (byte)-113) + "," + ii.br(var19, var19.length - 2, (byte)-82) + "," + this.ak[var1] + "," + this.bk * -159523507);
            }

            if (this.bx) {
               this.bb[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= 4 * var3 * var10;
               sg var11 = new sg(var20);
               int[] var12 = new int[var3];
               var11.at = -1516355947 * var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.cx(-1612232875);
                     var12[var15] += var14;
                  }
               }

               byte[][] var21 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var21[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.at = var9 * -1516355947;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.cx(-1712287418);
                     System.arraycopy(var20, var14, var21[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if (!this.bo) {
                     var5[var4[var15]] = ef.af(var21[var15], false, 1940092469);
                  } else {
                     var5[var4[var15]] = var21[var15];
                  }
               }
            } else if (!this.bo) {
               var5[var4[0]] = ef.af(var20, false, 326919875);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   public void ds() {
      for(int var1 = 0; var1 < this.bi.length; ++var1) {
         if (this.bi[var1] != null) {
            for(int var2 = 0; var2 < this.bi[var1].length; ++var2) {
               this.bi[var1][var2] = null;
            }
         }
      }

   }

   nm(boolean var1, boolean var2) {
      try {
         super();
         this.bx = var1;
         this.bo = var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.<init>(" + ')');
      }
   }

   public boolean es(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aj.af(hn.aq(var1, 1596341578), 1990606555);
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.by[var3].af(hn.aq(var2, 767426970), 819977633);
         return var4 >= 0;
      }
   }

   public boolean er(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aj.af(hn.aq(var1, 2007322860), 568093021);
      int var4 = this.by[var3].af(hn.aq(var2, 1934451311), -1558622360);
      return this.ce(var3, var4, (byte)-30);
   }

   public boolean el(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aj.af(hn.aq(var1, 1566672174), 1106630565);
      int var4 = this.by[var3].af(hn.aq(var2, 1437289196), -690215282);
      return this.ce(var3, var4, (byte)4);
   }

   public boolean en(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aj.af(hn.aq(var1, 1422091556), -1320714634);
      int var4 = this.by[var3].af(hn.aq(var2, 1592385313), -1155765232);
      return this.ce(var3, var4, (byte)-51);
   }

   public boolean cc(short var1) {
      try {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.am.length; ++var3) {
            if (var1 != 128) {
               throw new IllegalStateException();
            }

            int var4 = this.am[var3];
            if (null == this.bb[var4]) {
               if (var1 != 128) {
                  throw new IllegalStateException();
               }

               this.ac(var4, -1834872375);
               if (null == this.bb[var4]) {
                  if (var1 != 128) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw db.an(var5, "nm.cc(" + ')');
      }
   }

   public boolean eg(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.aj.af(hn.aq(var1, 235221225), -1695524455);
      return this.cs(var2, 199153288);
   }

   public int dd() {
      return this.bi.length;
   }

   public boolean ev(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.aj.af(hn.aq(var1, 959542224), -2093854532);
      return this.cs(var2, 1090627686);
   }

   public boolean co(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aj.af(hn.aq(var1, 270279938), -1903688410);
         int var5 = this.by[var4].af(hn.aq(var2, 406077475), 888685160);
         return this.ce(var4, var5, (byte)-35);
      } catch (RuntimeException var6) {
         throw db.an(var6, "nm.co(" + ')');
      }
   }

   void ad(int var1) {
   }

   public boolean em(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.aj.af(hn.aq(var1, 512528515), -1780176468);
      return this.cs(var2, 1058670335);
   }

   public int eh(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.aj.af(hn.aq(var1, 1977178380), 199743309);
      return this.aa(var2, -2142076413);
   }

   public int ek(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.aj.af(hn.aq(var1, 1850481810), 396085290);
      return this.aa(var2, -2101543574);
   }

   void cd(byte[] var1) {
      this.bk = ii.br(var1, var1.length, (byte)-36) * -175856763;
      sg var2 = new sg(ai.ch(var1, -1117233973));
      int var3 = var2.cm((byte)7);
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            var2.cx(-1462662351);
         }

         int var4 = var2.cm((byte)7);
         if (var3 >= 7) {
            this.ar = var2.dc(623051155) * 1692969259;
         } else {
            this.ar = var2.cl(530576760) * 1692969259;
         }

         int var5 = 0;
         int var6 = -1;
         this.am = new int[this.ar * -1754346109];
         int var7;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               this.am[var7] = var5 += var2.dc(239990367);
               if (this.am[var7] > var6) {
                  var6 = this.am[var7];
               }
            }
         } else {
            for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
               this.am[var7] = var5 += var2.cl(-2133130004);
               if (this.am[var7] > var6) {
                  var6 = this.am[var7];
               }
            }
         }

         this.ak = new int[1 + var6];
         this.az = new int[1 + var6];
         this.ad = new int[var6 + 1];
         this.ae = new int[var6 + 1][];
         this.bb = new Object[1 + var6];
         this.bi = new Object[1 + var6][];
         if (0 != var4) {
            this.as = new int[var6 + 1];

            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               this.as[this.am[var7]] = var2.cx(-1638061572);
            }

            this.aj = new td(this.as);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.ak[this.am[var7]] = var2.cx(-1345263796);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.az[this.am[var7]] = var2.cx(-1077636511);
         }

         for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
            this.ad[this.am[var7]] = var2.cl(-60864629);
         }

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               var5 = 0;
               var10 = -1;
               this.ae[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.ae[var8][var11] = var5 += var2.dc(1474600737);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bi[var8] = new Object[1 + var10];
            }
         } else {
            for(var7 = 0; var7 < -1754346109 * this.ar; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               var5 = 0;
               var10 = -1;
               this.ae[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.ae[var8][var11] = var5 += var2.cl(151377234);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bi[var8] = new Object[var10 + 1];
            }
         }

         if (var4 != 0) {
            this.ap = new int[1 + var6][];
            this.by = new td[1 + var6];

            for(var7 = 0; var7 < this.ar * -1754346109; ++var7) {
               var8 = this.am[var7];
               var9 = this.ad[var8];
               this.ap[var8] = new int[this.bi[var8].length];

               for(var10 = 0; var10 < var9; ++var10) {
                  this.ap[var8][this.ae[var8][var10]] = var2.cx(-910564245);
               }

               this.by[var8] = new td(this.ap[var8]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   static char an(char var0, nx var1, byte var2) {
      try {
         if (var0 >= 192 && var0 <= 255) {
            if (var2 >= 50) {
               throw new IllegalStateException();
            }

            if (var0 >= 192) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               if (var0 <= 198) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  return 'A';
               }
            }

            if (var0 == 199) {
               return 'C';
            }

            if (var0 >= 200) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               if (var0 <= 203) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  return 'E';
               }
            }

            if (var0 >= 204) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               if (var0 <= 207) {
                  return 'I';
               }
            }

            if (209 == var0) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               if (nx.ab != var1) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  return 'N';
               }
            }

            if (var0 >= 210 && var0 <= 214) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               return 'O';
            }

            if (var0 >= 217 && var0 <= 220) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               return 'U';
            }

            if (var0 == 221) {
               return 'Y';
            }

            if (var0 == 223) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               } else {
                  return 's';
               }
            }

            if (var0 >= 224 && var0 <= 230) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               return 'a';
            }

            if (231 == var0) {
               return 'c';
            }

            if (var0 >= 232) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               if (var0 <= 235) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  return 'e';
               }
            }

            if (var0 >= 236) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               if (var0 <= 239) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  return 'i';
               }
            }

            if (241 == var0) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               if (var1 != nx.ab) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  return 'n';
               }
            }

            if (var0 >= 242 && var0 <= 246) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               return 'o';
            }

            if (var0 >= 249) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               if (var0 <= 252) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  return 'u';
               }
            }

            if (var0 == 253) {
               return 'y';
            }

            if (var2 >= 50) {
               throw new IllegalStateException();
            }

            if (var0 == 255) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               return 'y';
            }
         }

         if (var0 == 338) {
            return 'O';
         } else if (339 == var0) {
            if (var2 >= 50) {
               throw new IllegalStateException();
            } else {
               return 'o';
            }
         } else if (376 == var0) {
            return 'Y';
         } else {
            return var0;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "nm.an(" + ')');
      }
   }

   public void dj() {
      for(int var1 = 0; var1 < this.bb.length; ++var1) {
         this.bb[var1] = null;
      }

   }
}
