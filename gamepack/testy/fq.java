public class fq extends fu {
   static int nv;
   int af;
   static gj av;
   static final int co = 10;
   // $FF: synthetic field
   final gr this$0;

   fq(gr var1) {
      try {
         this.this$0 = var1;
         super();
         this.af = 1937399629;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fq.<init>(" + ')');
      }
   }

   void af(sg var1, int var2) {
      try {
         this.af = var1.cl(-418477728) * -1937399629;
         var1.cm((byte)7);
         if (var1.cm((byte)7) != 255) {
            if (var2 != -1949352075) {
               throw new IllegalStateException();
            }

            var1.at -= -1516355947;
            var1.cv((byte)1);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "fq.af(" + ')');
      }
   }

   void an(gj var1, byte var2) {
      try {
         var1.aw(-1141502341 * this.af, (byte)-27);
      } catch (RuntimeException var3) {
         throw db.an(var3, "fq.an(" + ')');
      }
   }

   void aw(sg var1) {
      this.af = var1.cl(-1941828411) * -1937399629;
      var1.cm((byte)7);
      if (var1.cm((byte)7) != 255) {
         var1.at -= -1516355947;
         var1.cv((byte)1);
      }

   }

   static final void at(byte[] var0, int var1, int var2, ie var3, if[] var4, int var5) {
      try {
         sg var6 = new sg(var0);
         int var7 = -1;

         while(true) {
            int var8 = var6.dw((byte)-44);
            if (var8 == 0) {
               if (var5 <= 1034837602) {
                  throw new IllegalStateException();
               }

               return;
            }

            var7 += var8;
            int var9 = 0;

            while(true) {
               int var10 = var6.cd(-1555573512);
               if (var10 == 0) {
                  break;
               }

               var9 += var10 - 1;
               int var11 = var9 & 63;
               int var12 = var9 >> 6 & 63;
               int var13 = var9 >> 12;
               int var14 = var6.cm((byte)7);
               int var15 = var14 >> 2;
               int var16 = var14 & 3;
               int var17 = var12 + var1;
               int var18 = var11 + var2;
               if (var17 > 0) {
                  if (var5 <= 1034837602) {
                     throw new IllegalStateException();
                  }

                  if (var18 > 0) {
                     if (var5 <= 1034837602) {
                        throw new IllegalStateException();
                     }

                     if (var17 < 103) {
                        if (var5 <= 1034837602) {
                           throw new IllegalStateException();
                        }

                        if (var18 < 103) {
                           if (var5 <= 1034837602) {
                              return;
                           }

                           int var19 = var13;
                           if (2 == (cd.an[1][var17][var18] & 2)) {
                              if (var5 <= 1034837602) {
                                 throw new IllegalStateException();
                              }

                              var19 = var13 - 1;
                           }

                           if var20 = null;
                           if (var19 >= 0) {
                              var20 = var4[var19];
                           }

                           hy.ay(var13, var17, var18, var7, var16, var15, var3, var20, -1625886951);
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var21) {
         throw db.an(var21, "fq.at(" + ')');
      }
   }

   void au(sg var1) {
      this.af = var1.cl(99167194) * -1937399629;
      var1.cm((byte)7);
      if (var1.cm((byte)7) != 255) {
         var1.at -= -1516355947;
         var1.cv((byte)1);
      }

   }

   static final int jw(int var0, int var1, int var2, byte var3) {
      try {
         int var4 = var0 >> 7;
         int var5 = var1 >> 7;
         if (var4 >= 0) {
            if (var3 >= 15) {
               throw new IllegalStateException();
            }

            if (var5 >= 0) {
               if (var3 >= 15) {
                  throw new IllegalStateException();
               }

               if (var4 <= 103 && var5 <= 103) {
                  int var6 = var2;
                  if (var2 < 3) {
                     if (var3 >= 15) {
                        throw new IllegalStateException();
                     }

                     if (2 == (cd.an[1][var4][var5] & 2)) {
                        if (var3 >= 15) {
                           throw new IllegalStateException();
                        }

                        var6 = var2 + 1;
                     }
                  }

                  int var7 = var0 & 127;
                  int var8 = var1 & 127;
                  int var9 = var7 * cd.af[var6][1 + var4][var5] + cd.af[var6][var4][var5] * (128 - var7) >> 7;
                  int var10 = var7 * cd.af[var6][var4 + 1][var5 + 1] + cd.af[var6][var4][1 + var5] * (128 - var7) >> 7;
                  return var8 * var10 + var9 * (128 - var8) >> 7;
               }
            }
         }

         return 0;
      } catch (RuntimeException var11) {
         throw db.an(var11, "fq.jw(" + ')');
      }
   }

   void ab(gj var1) {
      var1.aw(-372360065 * this.af, (byte)36);
   }

   void ac(sg var1) {
      this.af = var1.cl(-976324830) * -1937399629;
      var1.cm((byte)7);
      if (var1.cm((byte)7) != 255) {
         var1.at -= -1516355947;
         var1.cv((byte)1);
      }

   }

   void aq(gj var1) {
      var1.aw(-1141502341 * this.af, (byte)6);
   }
}
