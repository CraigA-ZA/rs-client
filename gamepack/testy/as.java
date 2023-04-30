import java.io.IOException;
import java.util.concurrent.Callable;

public class as implements Callable {
   static final int ab = Integer.MAX_VALUE;
   static qu bw;
   static final int ae = 27;
   static final int ct = 40;
   // $FF: synthetic field
   final ag this$0;
   final ay af;

   as(ag var1, ay var2) {
      try {
         this.this$0 = var1;
         super();
         this.af = var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "as.<init>(" + ')');
      }
   }

   public Object call() throws Exception {
      try {
         try {
            while(this.af.ac((byte)41)) {
               mw.af(10L);
            }
         } catch (IOException var2) {
            return new aj("Error servicing REST query: " + var2.getMessage());
         }

         return this.af.au((byte)-27);
      } catch (RuntimeException var3) {
         throw db.an(var3, "as.call(" + ')');
      }
   }

   public Object an() throws Exception {
      try {
         while(this.af.ac((byte)122)) {
            mw.af(10L);
         }
      } catch (IOException var2) {
         return new aj("Error servicing REST query: " + var2.getMessage());
      }

      return this.af.au((byte)-95);
   }

   public Object af() throws Exception {
      try {
         while(this.af.ac((byte)95)) {
            mw.af(10L);
         }
      } catch (IOException var2) {
         return new aj("Error servicing REST query: " + var2.getMessage());
      }

      return this.af.au((byte)-15);
   }

   public Object aw() throws Exception {
      try {
         while(this.af.ac((byte)112)) {
            mw.af(10L);
         }
      } catch (IOException var2) {
         return new aj("Error servicing REST query: " + var2.getMessage());
      }

      return this.af.au((byte)-48);
   }

   static final void au(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, if[] var10, int var11) {
      try {
         int var13;
         for(int var12 = 0; var12 < 8; ++var12) {
            if (var11 <= -1086759664) {
               return;
            }

            for(var13 = 0; var13 < 8; ++var13) {
               if (var11 <= -1086759664) {
                  throw new IllegalStateException();
               }

               if (var2 + var12 > 0 && var12 + var2 < 103) {
                  if (var11 <= -1086759664) {
                     return;
                  }

                  if (var3 + var13 > 0) {
                     if (var11 <= -1086759664) {
                        return;
                     }

                     if (var3 + var13 < 103) {
                        if (var11 <= -1086759664) {
                           throw new IllegalStateException();
                        }

                        int[] var10000 = var10[var1].bj[var12 + var2];
                        var10000[var13 + var3] &= -16777217;
                     }
                  }
               }
            }
         }

         sg var26 = new sg(var0);

         for(var13 = 0; var13 < 4; ++var13) {
            if (var11 <= -1086759664) {
               throw new IllegalStateException();
            }

            for(int var14 = 0; var14 < 64; ++var14) {
               if (var11 <= -1086759664) {
                  throw new IllegalStateException();
               }

               for(int var15 = 0; var15 < 64; ++var15) {
                  if (var4 == var13) {
                     if (var11 <= -1086759664) {
                        throw new IllegalStateException();
                     }

                     if (var14 >= var5) {
                        if (var11 <= -1086759664) {
                           throw new IllegalStateException();
                        }

                        if (var14 < 8 + var5) {
                           if (var11 <= -1086759664) {
                              return;
                           }

                           if (var15 >= var6) {
                              if (var11 <= -1086759664) {
                                 throw new IllegalStateException();
                              }

                              if (var15 < var6 + 8) {
                                 if (var11 <= -1086759664) {
                                    throw new IllegalStateException();
                                 }

                                 int var16 = var2 + ll.af(var14 & 7, var15 & 7, var7, 575322475);
                                 int var19 = var14 & 7;
                                 int var20 = var15 & 7;
                                 int var21 = var7 & 3;
                                 int var18;
                                 if (0 == var21) {
                                    if (var11 <= -1086759664) {
                                       throw new IllegalStateException();
                                    }

                                    var18 = var20;
                                 } else if (var21 == 1) {
                                    if (var11 <= -1086759664) {
                                       return;
                                    }

                                    var18 = 7 - var19;
                                 } else if (2 == var21) {
                                    if (var11 <= -1086759664) {
                                       throw new IllegalStateException();
                                    }

                                    var18 = 7 - var20;
                                 } else {
                                    var18 = var19;
                                 }

                                 int var22 = var3 + var18;
                                 int var23 = (var14 & 7) + var8 + var2;
                                 int var24 = (var15 & 7) + var9 + var3;
                                 of.aq(var26, var1, var16, var22, var23, var24, var7, (byte)-96);
                                 continue;
                              }
                           }
                        }
                     }
                  }

                  of.aq(var26, 0, -1, -1, 0, 0, 0, (byte)-107);
               }
            }
         }

      } catch (RuntimeException var25) {
         throw db.an(var25, "as.au(" + ')');
      }
   }
}
