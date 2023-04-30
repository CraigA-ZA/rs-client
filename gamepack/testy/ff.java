public class ff extends fb {
   // $FF: synthetic field
   final fa this$0;
   String an;
   int af;
   static final int be = 36;
   public static final int ay = 512;

   public static boolean aa(char var0, int var1) {
      try {
         boolean var10000;
         if (var0 >= '0') {
            if (var1 == -307814037) {
               throw new IllegalStateException();
            }

            if (var0 <= '9') {
               if (var1 == -307814037) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ff.aa(" + ')');
      }
   }

   void af(sg var1, int var2) {
      try {
         this.af = var1.cx(-1868178252) * 710939539;
         this.an = var1.cw((byte)0);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ff.af(" + ')');
      }
   }

   void an(fj var1, int var2) {
      try {
         var1.am(801047195 * this.af, this.an, 1681536577);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ff.an(" + ')');
      }
   }

   ff(fa var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw db.an(var2, "ff.<init>(" + ')');
      }
   }

   void ac(sg var1) {
      this.af = var1.cx(-1898825290) * 710939539;
      this.an = var1.cw((byte)0);
   }

   void au(sg var1) {
      this.af = var1.cx(-1813017622) * 710939539;
      this.an = var1.cw((byte)0);
   }

   void aw(fj var1) {
      var1.am(801047195 * this.af, this.an, 1893134742);
   }

   static final void jy(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         long var6 = bx.js.by(var0, var1, var2);
         int var8;
         int var9;
         int var10;
         int var11;
         int var13;
         int var14;
         if (var6 != 0L) {
            if (var5 >= -596637590) {
               throw new IllegalStateException();
            }

            var8 = bx.js.bk(var0, var1, var2, var6);
            var9 = var8 >> 6 & 3;
            var10 = var8 & 31;
            var11 = var3;
            if (gq.aw(var6)) {
               if (var5 >= -596637590) {
                  throw new IllegalStateException();
               }

               var11 = var4;
            }

            int[] var12 = et.tk.af;
            var13 = (103 - var2) * 2048 + var1 * 4 + 24624;
            var14 = di.at(var6);
            hq var15 = fw.an(var14, (short)20893);
            if (-1 != var15.bk * 771086195) {
               tc var16 = ml.ju[var15.bk * 771086195];
               if (var16 != null) {
                  int var17 = (var15.av * -1064754148 - var16.aw) / 2;
                  int var18 = (var15.ar * 1952358772 - var16.ac) / 2;
                  var16.aw(var17 + 48 + var1 * 4, var18 + (104 - var2 - -1659393955 * var15.ar) * 4 + 48);
               }
            } else {
               label225: {
                  if (0 != var10) {
                     if (var10 != 2) {
                        break label225;
                     }

                     if (var5 >= -596637590) {
                        throw new IllegalStateException();
                     }
                  }

                  if (0 == var9) {
                     if (var5 >= -596637590) {
                        throw new IllegalStateException();
                     }

                     var12[var13] = var11;
                     var12[512 + var13] = var11;
                     var12[var13 + 1024] = var11;
                     var12[1536 + var13] = var11;
                  } else if (var9 == 1) {
                     if (var5 >= -596637590) {
                        throw new IllegalStateException();
                     }

                     var12[var13] = var11;
                     var12[1 + var13] = var11;
                     var12[var13 + 2] = var11;
                     var12[3 + var13] = var11;
                  } else if (2 == var9) {
                     var12[var13 + 3] = var11;
                     var12[512 + var13 + 3] = var11;
                     var12[3 + var13 + 1024] = var11;
                     var12[1536 + 3 + var13] = var11;
                  } else if (var9 == 3) {
                     var12[var13 + 1536] = var11;
                     var12[1 + var13 + 1536] = var11;
                     var12[1536 + var13 + 2] = var11;
                     var12[1536 + var13 + 3] = var11;
                  }
               }

               if (3 == var10) {
                  if (var5 >= -596637590) {
                     throw new IllegalStateException();
                  }

                  if (var9 == 0) {
                     var12[var13] = var11;
                  } else if (var9 == 1) {
                     if (var5 >= -596637590) {
                        throw new IllegalStateException();
                     }

                     var12[3 + var13] = var11;
                  } else if (2 == var9) {
                     if (var5 >= -596637590) {
                        throw new IllegalStateException();
                     }

                     var12[var13 + 3 + 1536] = var11;
                  } else if (3 == var9) {
                     if (var5 >= -596637590) {
                        return;
                     }

                     var12[1536 + var13] = var11;
                  }
               }

               if (var10 == 2) {
                  if (var5 >= -596637590) {
                     throw new IllegalStateException();
                  }

                  if (3 == var9) {
                     if (var5 >= -596637590) {
                        return;
                     }

                     var12[var13] = var11;
                     var12[var13 + 512] = var11;
                     var12[var13 + 1024] = var11;
                     var12[1536 + var13] = var11;
                  } else if (var9 == 0) {
                     if (var5 >= -596637590) {
                        return;
                     }

                     var12[var13] = var11;
                     var12[var13 + 1] = var11;
                     var12[var13 + 2] = var11;
                     var12[var13 + 3] = var11;
                  } else if (var9 == 1) {
                     if (var5 >= -596637590) {
                        throw new IllegalStateException();
                     }

                     var12[3 + var13] = var11;
                     var12[512 + 3 + var13] = var11;
                     var12[var13 + 3 + 1024] = var11;
                     var12[var13 + 3 + 1536] = var11;
                  } else if (2 == var9) {
                     if (var5 >= -596637590) {
                        return;
                     }

                     var12[var13 + 1536] = var11;
                     var12[1 + 1536 + var13] = var11;
                     var12[2 + 1536 + var13] = var11;
                     var12[1536 + var13 + 3] = var11;
                  }
               }
            }
         }

         var6 = bx.js.bi(var0, var1, var2);
         if (var6 != 0L) {
            if (var5 >= -596637590) {
               throw new IllegalStateException();
            }

            var8 = bx.js.bk(var0, var1, var2, var6);
            var9 = var8 >> 6 & 3;
            var10 = var8 & 31;
            var11 = di.at(var6);
            hq var22 = fw.an(var11, (short)7370);
            int var26;
            if (-1 != var22.bk * 771086195) {
               if (var5 >= -596637590) {
                  throw new IllegalStateException();
               }

               tc var24 = ml.ju[771086195 * var22.bk];
               if (var24 != null) {
                  var14 = (-1064754148 * var22.av - var24.aw) / 2;
                  var26 = (1952358772 * var22.ar - var24.ac) / 2;
                  var24.aw(48 + var1 * 4 + var14, var26 + 4 * (104 - var2 - var22.ar * -1659393955) + 48);
               }
            } else if (var10 == 9) {
               label237: {
                  if (var5 >= -596637590) {
                     throw new IllegalStateException();
                  }

                  var13 = 15658734;
                  if (gq.aw(var6)) {
                     var13 = 15597568;
                  }

                  int[] var25 = et.tk.af;
                  var26 = 24624 + var1 * 4 + (103 - var2) * 2048;
                  if (0 != var9) {
                     if (var9 != 2) {
                        var25[var26] = var13;
                        var25[1 + 512 + var26] = var13;
                        var25[2 + var26 + 1024] = var13;
                        var25[var26 + 1536 + 3] = var13;
                        break label237;
                     }

                     if (var5 >= -596637590) {
                        throw new IllegalStateException();
                     }
                  }

                  var25[1536 + var26] = var13;
                  var25[1 + var26 + 1024] = var13;
                  var25[2 + var26 + 512] = var13;
                  var25[3 + var26] = var13;
               }
            }
         }

         var6 = bx.js.be(var0, var1, var2);
         if (0L != var6) {
            if (var5 >= -596637590) {
               return;
            }

            var8 = di.at(var6);
            hq var20 = fw.an(var8, (short)13389);
            if (var20.bk * 771086195 != -1) {
               if (var5 >= -596637590) {
                  throw new IllegalStateException();
               }

               tc var21 = ml.ju[771086195 * var20.bk];
               if (null != var21) {
                  if (var5 >= -596637590) {
                     throw new IllegalStateException();
                  }

                  var11 = (var20.av * -1064754148 - var21.aw) / 2;
                  int var23 = (var20.ar * 1952358772 - var21.ac) / 2;
                  var21.aw(var1 * 4 + 48 + var11, 48 + (104 - var2 - -1659393955 * var20.ar) * 4 + var23);
               }
            }
         }

      } catch (RuntimeException var19) {
         throw db.an(var19, "ff.jy(" + ')');
      }
   }
}
