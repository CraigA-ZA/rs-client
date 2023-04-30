import accessors.RSIDKType;

public class hj extends rk implements RSIDKType {
   short[] at;
   short[] aa;
   public static int aw;
   static kh ac = new kh(64);
   static nm an;
   int[] ay;
   short[] aq;
   short[] al;
   static final long bi = 4294967295L;
   static nm af;
   public int au;
   public boolean ao;
   public static final int ax = 0;
   static final int ak = 22;
   int[] ab;
   static ph fl;
   static int ur;
   static tq[] ku;

   hj() {
      try {
         super();
         this.au = -1699952575;
         this.ay = new int[]{-1, -1, -1, -1, -1};
         this.ao = false;
      } catch (RuntimeException var1) {
         throw db.an(var1, "hj.<init>(" + ')');
      }
   }

   static final boolean al(byte[] var0, int var1, int var2, int var3) {
      try {
         boolean var4 = true;
         sg var5 = new sg(var0);
         int var6 = -1;

         label113:
         while(true) {
            int var7 = var5.dw((byte)-53);
            if (0 == var7) {
               if (var3 == 120701575) {
                  throw new IllegalStateException();
               }

               return var4;
            }

            var6 += var7;
            int var8 = 0;
            boolean var9 = false;

            while(true) {
               int var10;
               while(!var9) {
                  var10 = var5.cd(-1743893621);
                  if (var10 == 0) {
                     continue label113;
                  }

                  var8 += var10 - 1;
                  int var11 = var8 & 63;
                  int var12 = var8 >> 6 & 63;
                  int var13 = var5.cm((byte)7) >> 2;
                  int var14 = var12 + var1;
                  int var15 = var2 + var11;
                  if (var14 > 0) {
                     if (var3 == 120701575) {
                        throw new IllegalStateException();
                     }

                     if (var15 > 0) {
                        if (var3 == 120701575) {
                           throw new IllegalStateException();
                        }

                        if (var14 < 103 && var15 < 103) {
                           hq var16 = fw.an(var6, (short)13730);
                           if (var13 == 22) {
                              if (var3 == 120701575) {
                                 throw new IllegalStateException();
                              }

                              if (client.cu) {
                                 if (var3 == 120701575) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == var16.aj * 415653149 && -973955889 * var16.am != 1) {
                                    if (var3 == 120701575) {
                                       throw new IllegalStateException();
                                    }

                                    if (!var16.bs) {
                                       continue;
                                    }
                                 }
                              }
                           }

                           if (!var16.aq(-681431683)) {
                              if (var3 == 120701575) {
                                 throw new IllegalStateException();
                              }

                              client.jk += 1441978033;
                              var4 = false;
                           }

                           var9 = true;
                        }
                     }
                  }
               }

               if (var3 == 120701575) {
                  throw new IllegalStateException();
               }

               var10 = var5.cd(-1023890936);
               if (0 == var10) {
                  break;
               }

               var5.cm((byte)7);
            }
         }
      } catch (RuntimeException var17) {
         throw db.an(var17, "hj.al(" + ')');
      }
   }

   public iz am() {
      if (this.ab == null) {
         return null;
      } else {
         iz[] var1 = new iz[this.ab.length];

         for(int var2 = 0; var2 < this.ab.length; ++var2) {
            var1[var2] = iz.af(an, this.ab[var2], 0);
         }

         iz var4;
         if (var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new iz(var1, var1.length);
         }

         int var3;
         if (this.aq != null) {
            for(var3 = 0; var3 < this.aq.length; ++var3) {
               var4.as(this.aq[var3], this.al[var3]);
            }
         }

         if (this.at != null) {
            for(var3 = 0; var3 < this.at.length; ++var3) {
               var4.aj(this.at[var3], this.aa[var3]);
            }
         }

         return var4;
      }
   }

   void ac(sg var1, int var2, byte var3) {
      try {
         if (var2 == 1) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            }

            this.au = var1.cm((byte)7) * 1699952575;
         } else {
            int var4;
            int var5;
            if (var2 == 2) {
               if (var3 <= -1) {
                  return;
               }

               var4 = var1.cm((byte)7);
               this.ab = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  this.ab[var5] = var1.cl(342664370);
               }
            } else if (var2 == 3) {
               this.ao = true;
            } else if (var2 == 40) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               }

               var4 = var1.cm((byte)7);
               this.aq = new short[var4];
               this.al = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  this.aq[var5] = (short)var1.cl(-1762777460);
                  this.al[var5] = (short)var1.cl(663264812);
               }
            } else if (var2 == 41) {
               if (var3 <= -1) {
                  return;
               }

               var4 = var1.cm((byte)7);
               this.at = new short[var4];
               this.aa = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  this.at[var5] = (short)var1.cl(-1008154488);
                  this.aa[var5] = (short)var1.cl(-574953802);
               }
            } else if (var2 >= 60) {
               if (var3 <= -1) {
                  return;
               }

               if (var2 < 70) {
                  this.ay[var2 - 60] = var1.cl(-1149933476);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "hj.ac(" + ')');
      }
   }

   public iz ab(int var1) {
      try {
         if (this.ab == null) {
            if (var1 == -1159667627) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            iz[] var2 = new iz[this.ab.length];

            for(int var3 = 0; var3 < this.ab.length; ++var3) {
               if (var1 == -1159667627) {
                  throw new IllegalStateException();
               }

               var2[var3] = iz.af(an, this.ab[var3], 0);
            }

            iz var6;
            if (var2.length == 1) {
               if (var1 == -1159667627) {
                  throw new IllegalStateException();
               }

               var6 = var2[0];
            } else {
               var6 = new iz(var2, var2.length);
            }

            int var4;
            if (this.aq != null) {
               if (var1 == -1159667627) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.aq.length; ++var4) {
                  if (var1 == -1159667627) {
                     throw new IllegalStateException();
                  }

                  var6.as(this.aq[var4], this.al[var4]);
               }
            }

            if (this.at != null) {
               if (var1 == -1159667627) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.at.length; ++var4) {
                  if (var1 == -1159667627) {
                     throw new IllegalStateException();
                  }

                  var6.aj(this.at[var4], this.aa[var4]);
               }
            }

            return var6;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "hj.ab(" + ')');
      }
   }

   public boolean aq(byte var1) {
      try {
         boolean var2 = true;

         for(int var3 = 0; var3 < 5; ++var3) {
            if (this.ay[var3] != -1 && !an.ce(this.ay[var3], 0, (byte)-12)) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               var2 = false;
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "hj.aq(" + ')');
      }
   }

   public iz al(byte var1) {
      try {
         iz[] var2 = new iz[5];
         int var3 = 0;

         for(int var4 = 0; var4 < 5; ++var4) {
            if (var1 >= 115) {
               throw new IllegalStateException();
            }

            if (this.ay[var4] != -1) {
               if (var1 >= 115) {
                  throw new IllegalStateException();
               }

               var2[var3++] = iz.af(an, this.ay[var4], 0);
            }
         }

         iz var7 = new iz(var2, var3);
         int var5;
         if (null != this.aq) {
            if (var1 >= 115) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.aq.length; ++var5) {
               if (var1 >= 115) {
                  throw new IllegalStateException();
               }

               var7.as(this.aq[var5], this.al[var5]);
            }
         }

         if (null != this.at) {
            if (var1 >= 115) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.at.length; ++var5) {
               if (var1 >= 115) {
                  throw new IllegalStateException();
               }

               var7.aj(this.at[var5], this.aa[var5]);
            }
         }

         return var7;
      } catch (RuntimeException var6) {
         throw db.an(var6, "hj.al(" + ')');
      }
   }

   public static void aa(nm var0, nm var1) {
      af = var0;
      an = var1;
      aw = af.cq(3, (byte)95) * 1501460151;
   }

   public static hj ay(int var0) {
      hj var1 = (hj)ac.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(3, var0, (byte)-90);
         var1 = new hj();
         if (null != var2) {
            var1.aw(new sg(var2), -630446731);
         }

         ac.aw(var1, (long)var0);
         return var1;
      }
   }

   public boolean av() {
      if (this.ab == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.ab.length; ++var2) {
            if (!an.ce(this.ab[var2], 0, (byte)46)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public boolean au(int var1) {
      try {
         if (this.ab == null) {
            if (var1 >= 1976370728) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for(int var3 = 0; var3 < this.ab.length; ++var3) {
               if (var1 >= 1976370728) {
                  throw new IllegalStateException();
               }

               if (!an.ce(this.ab[var3], 0, (byte)-30)) {
                  var2 = false;
               }
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hj.au(" + ')');
      }
   }

   void ai(sg var1, int var2) {
      if (var2 == 1) {
         this.au = var1.cm((byte)7) * 1699952575;
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.cm((byte)7);
            this.ab = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.ab[var4] = var1.cl(-127169966);
            }
         } else if (var2 == 3) {
            this.ao = true;
         } else if (var2 == 40) {
            var3 = var1.cm((byte)7);
            this.aq = new short[var3];
            this.al = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aq[var4] = (short)var1.cl(460766745);
               this.al[var4] = (short)var1.cl(-1569056835);
            }
         } else if (var2 == -616218918) {
            var3 = var1.cm((byte)7);
            this.at = new short[var3];
            this.aa = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.at[var4] = (short)var1.cl(-1320297546);
               this.aa[var4] = (short)var1.cl(-1106815049);
            }
         } else if (var2 >= 2136078398 && var2 < 627755932) {
            this.ay[var2 - 1572583679] = var1.cl(-1657907532);
         }
      }

   }

   void ag(sg var1, int var2) {
      if (var2 == 1) {
         this.au = var1.cm((byte)7) * 1699952575;
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.cm((byte)7);
            this.ab = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.ab[var4] = var1.cl(-626171385);
            }
         } else if (var2 == 3) {
            this.ao = true;
         } else if (var2 == 1028325905) {
            var3 = var1.cm((byte)7);
            this.aq = new short[var3];
            this.al = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aq[var4] = (short)var1.cl(503553635);
               this.al[var4] = (short)var1.cl(-683875252);
            }
         } else if (var2 == 41) {
            var3 = var1.cm((byte)7);
            this.at = new short[var3];
            this.aa = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.at[var4] = (short)var1.cl(800859678);
               this.aa[var4] = (short)var1.cl(-2010900054);
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.ay[var2 - 60] = var1.cl(-1751550381);
         }
      }

   }

   void ax(sg var1, int var2) {
      if (var2 == 1) {
         this.au = var1.cm((byte)7) * 478515482;
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.cm((byte)7);
            this.ab = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.ab[var4] = var1.cl(-1689289703);
            }
         } else if (var2 == 3) {
            this.ao = true;
         } else if (var2 == 40) {
            var3 = var1.cm((byte)7);
            this.aq = new short[var3];
            this.al = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aq[var4] = (short)var1.cl(330764202);
               this.al[var4] = (short)var1.cl(-588687138);
            }
         } else if (var2 == 41) {
            var3 = var1.cm((byte)7);
            this.at = new short[var3];
            this.aa = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.at[var4] = (short)var1.cl(7128736);
               this.aa[var4] = (short)var1.cl(-2067158488);
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.ay[var2 - 1584709301] = var1.cl(698863903);
         }
      }

   }

   static final boolean aw(int var0, int var1, int var2, ia var3, if var4, int var5) {
      try {
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
         int[][] var14 = var4.bj;

         do {
            label481:
            while(true) {
               int var15;
               int var16;
               int var17;
               int var18;
               do {
                  label457:
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
                     if (var3.af(var2, var6, var7, var4, -981590728)) {
                        if (var5 == -964267539) {
                           throw new IllegalStateException();
                        }

                        am.au = var6 * -617213805;
                        pg.ab = 1169106949 * var7;
                        return true;
                     }

                     var17 = 1 + iw.ac[var8][var9];
                     if (var8 > 0) {
                        if (var5 == -964267539) {
                           throw new IllegalStateException();
                        }

                        if (0 != iw.aw[var8 - 1][var9]) {
                           if (var5 == -964267539) {
                              throw new IllegalStateException();
                           }
                        } else if (0 != (var14[var15 - 1][var16] & 19136782)) {
                           if (var5 == -964267539) {
                              throw new IllegalStateException();
                           }
                        } else if (0 != (var14[var15 - 1][var16 + var2 - 1] & 19136824)) {
                           if (var5 == -964267539) {
                              throw new IllegalStateException();
                           }
                        } else {
                           label506: {
                              for(var18 = 1; var18 < var2 - 1; ++var18) {
                                 if (var5 == -964267539) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 != (var14[var15 - 1][var18 + var16] & 19136830)) {
                                    if (var5 == -964267539) {
                                       throw new IllegalStateException();
                                    }
                                    break label506;
                                 }
                              }

                              iw.al[var12] = var6 - 1;
                              iw.at[var12] = var7;
                              var12 = var12 + 1 & 4095;
                              iw.aw[var8 - 1][var9] = 2;
                              iw.ac[var8 - 1][var9] = var17;
                           }
                        }
                     }

                     if (var8 < 128 - var2 && 0 == iw.aw[1 + var8][var9]) {
                        if ((var14[var15 + var2][var16] & 19136899) != 0) {
                           if (var5 == -964267539) {
                              throw new IllegalStateException();
                           }
                        } else if (0 == (var14[var2 + var15][var2 + var16 - 1] & 19136992)) {
                           label510: {
                              for(var18 = 1; var18 < var2 - 1; ++var18) {
                                 if (var5 == -964267539) {
                                    throw new IllegalStateException();
                                 }

                                 if ((var14[var2 + var15][var18 + var16] & 19136995) != 0) {
                                    if (var5 == -964267539) {
                                       throw new IllegalStateException();
                                    }
                                    break label510;
                                 }
                              }

                              iw.al[var12] = 1 + var6;
                              iw.at[var12] = var7;
                              var12 = var12 + 1 & 4095;
                              iw.aw[1 + var8][var9] = 8;
                              iw.ac[1 + var8][var9] = var17;
                           }
                        }
                     }

                     if (var9 > 0) {
                        if (iw.aw[var8][var9 - 1] != 0) {
                           if (var5 == -964267539) {
                              throw new IllegalStateException();
                           }
                        } else if (0 != (var14[var15][var16 - 1] & 19136782)) {
                           if (var5 == -964267539) {
                              throw new IllegalStateException();
                           }
                        } else if (0 != (var14[var2 + var15 - 1][var16 - 1] & 19136899)) {
                           if (var5 == -964267539) {
                              throw new IllegalStateException();
                           }
                        } else {
                           label514: {
                              for(var18 = 1; var18 < var2 - 1; ++var18) {
                                 if (var5 == -964267539) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 != (var14[var15 + var18][var16 - 1] & 19136911)) {
                                    if (var5 == -964267539) {
                                       throw new IllegalStateException();
                                    }
                                    break label514;
                                 }
                              }

                              iw.al[var12] = var6;
                              iw.at[var12] = var7 - 1;
                              var12 = var12 + 1 & 4095;
                              iw.aw[var8][var9 - 1] = 1;
                              iw.ac[var8][var9 - 1] = var17;
                           }
                        }
                     }

                     if (var9 < 128 - var2) {
                        if (var5 == -964267539) {
                           throw new IllegalStateException();
                        }

                        if (iw.aw[var8][var9 + 1] == 0) {
                           if ((var14[var15][var16 + var2] & 19136824) != 0) {
                              if (var5 == -964267539) {
                                 throw new IllegalStateException();
                              }
                           } else if ((var14[var2 + var15 - 1][var2 + var16] & 19136992) != 0) {
                              if (var5 == -964267539) {
                                 throw new IllegalStateException();
                              }
                           } else {
                              label518: {
                                 for(var18 = 1; var18 < var2 - 1; ++var18) {
                                    if (var5 == -964267539) {
                                       throw new IllegalStateException();
                                    }

                                    if ((var14[var18 + var15][var2 + var16] & 19137016) != 0) {
                                       break label518;
                                    }
                                 }

                                 iw.al[var12] = var6;
                                 iw.at[var12] = 1 + var7;
                                 var12 = 1 + var12 & 4095;
                                 iw.aw[var8][var9 + 1] = 4;
                                 iw.ac[var8][var9 + 1] = var17;
                              }
                           }
                        }
                     }

                     if (var8 > 0) {
                        if (var5 == -964267539) {
                           throw new IllegalStateException();
                        }

                        if (var9 > 0) {
                           if (var5 == -964267539) {
                              throw new IllegalStateException();
                           }

                           if (iw.aw[var8 - 1][var9 - 1] != 0) {
                              if (var5 == -964267539) {
                                 throw new IllegalStateException();
                              }
                           } else if (0 != (var14[var15 - 1][var16 - 1] & 19136782)) {
                              if (var5 == -964267539) {
                                 throw new IllegalStateException();
                              }
                           } else {
                              label522: {
                                 for(var18 = 1; var18 < var2; ++var18) {
                                    if (var5 == -964267539) {
                                       throw new IllegalStateException();
                                    }

                                    if (0 != (var14[var15 - 1][var16 - 1 + var18] & 19136830)) {
                                       if (var5 == -964267539) {
                                          throw new IllegalStateException();
                                       }
                                       break label522;
                                    }

                                    if (0 != (var14[var18 + (var15 - 1)][var16 - 1] & 19136911)) {
                                       if (var5 == -964267539) {
                                          throw new IllegalStateException();
                                       }
                                       break label522;
                                    }
                                 }

                                 iw.al[var12] = var6 - 1;
                                 iw.at[var12] = var7 - 1;
                                 var12 = var12 + 1 & 4095;
                                 iw.aw[var8 - 1][var9 - 1] = 3;
                                 iw.ac[var8 - 1][var9 - 1] = var17;
                              }
                           }
                        }
                     }

                     if (var8 < 128 - var2) {
                        if (var5 == -964267539) {
                           throw new IllegalStateException();
                        }

                        if (var9 > 0) {
                           if (var5 == -964267539) {
                              throw new IllegalStateException();
                           }

                           if (0 != iw.aw[var8 + 1][var9 - 1]) {
                              if (var5 == -964267539) {
                                 throw new IllegalStateException();
                              }
                           } else if ((var14[var2 + var15][var16 - 1] & 19136899) != 0) {
                              if (var5 == -964267539) {
                                 throw new IllegalStateException();
                              }
                           } else {
                              label526: {
                                 for(var18 = 1; var18 < var2; ++var18) {
                                    if (var5 == -964267539) {
                                       throw new IllegalStateException();
                                    }

                                    if ((var14[var15 + var2][var18 + (var16 - 1)] & 19136995) != 0) {
                                       if (var5 == -964267539) {
                                          throw new IllegalStateException();
                                       }
                                       break label526;
                                    }

                                    if ((var14[var18 + var15][var16 - 1] & 19136911) != 0) {
                                       if (var5 == -964267539) {
                                          throw new IllegalStateException();
                                       }
                                       break label526;
                                    }
                                 }

                                 iw.al[var12] = 1 + var6;
                                 iw.at[var12] = var7 - 1;
                                 var12 = 1 + var12 & 4095;
                                 iw.aw[1 + var8][var9 - 1] = 9;
                                 iw.ac[var8 + 1][var9 - 1] = var17;
                              }
                           }
                        }
                     }

                     if (var8 > 0) {
                        if (var5 == -964267539) {
                           throw new IllegalStateException();
                        }

                        if (var9 < 128 - var2) {
                           if (var5 == -964267539) {
                              throw new IllegalStateException();
                           }

                           if (0 != iw.aw[var8 - 1][var9 + 1]) {
                              if (var5 == -964267539) {
                                 throw new IllegalStateException();
                              }
                           } else if (0 != (var14[var15 - 1][var16 + var2] & 19136824)) {
                              if (var5 == -964267539) {
                                 throw new IllegalStateException();
                              }
                           } else {
                              for(var18 = 1; var18 < var2; ++var18) {
                                 if (var5 == -964267539) {
                                    throw new IllegalStateException();
                                 }

                                 if ((var14[var15 - 1][var18 + var16] & 19136830) != 0) {
                                    if (var5 == -964267539) {
                                       throw new IllegalStateException();
                                    }
                                    continue label457;
                                 }

                                 if ((var14[var18 + (var15 - 1)][var2 + var16] & 19137016) != 0) {
                                    if (var5 == -964267539) {
                                       throw new IllegalStateException();
                                    }
                                    continue label457;
                                 }
                              }

                              iw.al[var12] = var6 - 1;
                              iw.at[var12] = 1 + var7;
                              var12 = 1 + var12 & 4095;
                              iw.aw[var8 - 1][1 + var9] = 6;
                              iw.ac[var8 - 1][1 + var9] = var17;
                           }
                        }
                     }
                  } while(var8 >= 128 - var2);

                  if (var5 == -964267539) {
                     throw new IllegalStateException();
                  }
               } while(var9 >= 128 - var2);

               if (var5 == -964267539) {
                  throw new IllegalStateException();
               }

               if (iw.aw[var8 + 1][var9 + 1] != 0) {
                  break;
               }

               if (0 != (var14[var15 + var2][var2 + var16] & 19136992)) {
                  if (var5 == -964267539) {
                     throw new IllegalStateException();
                  }
               } else {
                  for(var18 = 1; var18 < var2; ++var18) {
                     if (var5 == -964267539) {
                        throw new IllegalStateException();
                     }

                     if ((var14[var15 + var18][var16 + var2] & 19137016) != 0) {
                        if (var5 == -964267539) {
                           throw new IllegalStateException();
                        }
                        continue label481;
                     }

                     if ((var14[var15 + var2][var16 + var18] & 19136995) != 0) {
                        if (var5 == -964267539) {
                           throw new IllegalStateException();
                        }
                        continue label481;
                     }
                  }

                  iw.al[var12] = 1 + var6;
                  iw.at[var12] = 1 + var7;
                  var12 = 1 + var12 & 4095;
                  iw.aw[1 + var8][1 + var9] = 12;
                  iw.ac[1 + var8][var9 + 1] = var17;
               }
            }
         } while(var5 != -964267539);

         throw new IllegalStateException();
      } catch (RuntimeException var19) {
         throw db.an(var19, "hj.aw(" + ')');
      }
   }

   public boolean ar() {
      if (this.ab == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.ab.length; ++var2) {
            if (!an.ce(this.ab[var2], 0, (byte)-31)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public boolean ah() {
      if (this.ab == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.ab.length; ++var2) {
            if (!an.ce(this.ab[var2], 0, (byte)-8)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public boolean as() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.ay[var2] != -1 && !an.ce(this.ay[var2], 0, (byte)35)) {
            var1 = false;
         }
      }

      return var1;
   }

   public boolean aj() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.ay[var2] != -1 && !an.ce(this.ay[var2], 0, (byte)72)) {
            var1 = false;
         }
      }

      return var1;
   }

   void ao(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.ac(var1, var2, (byte)64);
      }
   }

   public static void az() {
      ac.ac();
   }

   public static void ad() {
      ac.ac();
   }

   void aw(sg var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (0 == var3) {
               if (var2 >= -413880100) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ac(var1, var3, (byte)33);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hj.aw(" + ')');
      }
   }

   public static String ab(int var0, boolean var1, byte var2) {
      try {
         if (var1) {
            if (var0 >= 0) {
               int var4 = var0;
               String var3;
               if (var1) {
                  if (var0 >= 0) {
                     int var5 = 2;

                     for(int var6 = var0 / 10; var6 != 0; ++var5) {
                        if (var2 != 16) {
                           throw new IllegalStateException();
                        }

                        var6 /= 10;
                     }

                     char[] var7 = new char[var5];
                     var7[0] = '+';

                     for(int var8 = var5 - 1; var8 > 0; --var8) {
                        if (var2 != 16) {
                           throw new IllegalStateException();
                        }

                        int var9 = var4;
                        var4 /= 10;
                        int var10 = var9 - var4 * 10;
                        if (var10 >= 10) {
                           if (var2 != 16) {
                              throw new IllegalStateException();
                           }

                           var7[var8] = (char)(var10 + 87);
                        } else {
                           var7[var8] = (char)(48 + var10);
                        }
                     }

                     var3 = new String(var7);
                     return var3;
                  }

                  if (var2 != 16) {
                     throw new IllegalStateException();
                  }
               }

               var3 = Integer.toString(var0, 10);
               return var3;
            }

            if (var2 != 16) {
               throw new IllegalStateException();
            }
         }

         return Integer.toString(var0);
      } catch (RuntimeException var11) {
         throw db.an(var11, "hj.ab(" + ')');
      }
   }

   public iz ak() {
      iz[] var1 = new iz[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.ay[var3] != -1) {
            var1[var2++] = iz.af(an, this.ay[var3], 0);
         }
      }

      iz var5 = new iz(var1, var2);
      int var4;
      if (null != this.aq) {
         for(var4 = 0; var4 < this.aq.length; ++var4) {
            var5.as(this.aq[var4], this.al[var4]);
         }
      }

      if (null != this.at) {
         for(var4 = 0; var4 < this.at.length; ++var4) {
            var5.aj(this.at[var4], this.aa[var4]);
         }
      }

      return var5;
   }
}
