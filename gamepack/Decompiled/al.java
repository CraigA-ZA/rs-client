import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class al {
   static TextureProvider textureProvider;
   static int gm;
   ExecutorService af = Executors.newSingleThreadExecutor();
   Future an;
   final ac ac;
   final Packet aw;

   public al(Packet var1, ac var2) {
      this.aw = var1;
      this.ac = var2;
      this.ac();
   }

   public boolean af() {
      return this.an.isDone();
   }

   public void an() {
      this.af.shutdown();
      this.af = null;
   }

   public Packet aw() {
      try {
         return (Packet)this.an.get();
      } catch (Exception var3) {
         return null;
      }
   }

   void ac() {
      this.an = this.af.submit(new an(this, this.aw, this.ac));
   }

   static void aw_renamed(double var0, int var2, int var3, int var4) {
      int var5 = 128 * var2;

      for(int var6 = var2; var6 < var3; ++var6) {
         if (var4 >= -1886422207) {
            throw new IllegalStateException();
         }

         double var7 = (double)(var6 >> 3) / 64.0 + 0.0078125;
         double var9 = 0.0625 + (double)(var6 & 7) / 8.0;

         for(int var11 = 0; var11 < 128; ++var11) {
            if (var4 >= -1886422207) {
               throw new IllegalStateException();
            }

            double var12 = (double)var11 / 128.0;
            double var14 = var12;
            double var16 = var12;
            double var18 = var12;
            if (var9 != 0.0) {
               if (var4 >= -1886422207) {
                  throw new IllegalStateException();
               }

               double var20;
               if (var12 < 0.5) {
                  if (var4 >= -1886422207) {
                     throw new IllegalStateException();
                  }

                  var20 = var12 * (1.0 + var9);
               } else {
                  var20 = var9 + var12 - var9 * var12;
               }

               double var22 = var12 * 2.0 - var20;
               double var24 = var7 + 0.3333333333333333;
               if (var24 > 1.0) {
                  if (var4 >= -1886422207) {
                     throw new IllegalStateException();
                  }

                  --var24;
               }

               double var28 = var7 - 0.3333333333333333;
               if (var28 < 0.0) {
                  ++var28;
               }

               if (var24 * 6.0 < 1.0) {
                  if (var4 >= -1886422207) {
                     throw new IllegalStateException();
                  }

                  var14 = var24 * 6.0 * (var20 - var22) + var22;
               } else if (2.0 * var24 < 1.0) {
                  if (var4 >= -1886422207) {
                     return;
                  }

                  var14 = var20;
               } else if (var24 * 3.0 < 2.0) {
                  if (var4 >= -1886422207) {
                     throw new IllegalStateException();
                  }

                  var14 = var22 + 6.0 * (0.6666666666666666 - var24) * (var20 - var22);
               } else {
                  var14 = var22;
               }

               if (var7 * 6.0 < 1.0) {
                  if (var4 >= -1886422207) {
                     throw new IllegalStateException();
                  }

                  var16 = var22 + (var20 - var22) * 6.0 * var7;
               } else if (var7 * 2.0 < 1.0) {
                  if (var4 >= -1886422207) {
                     throw new IllegalStateException();
                  }

                  var16 = var20;
               } else if (var7 * 3.0 < 2.0) {
                  var16 = var22 + (var20 - var22) * (0.6666666666666666 - var7) * 6.0;
               } else {
                  var16 = var22;
               }

               if (6.0 * var28 < 1.0) {
                  var18 = var28 * (var20 - var22) * 6.0 + var22;
               } else if (var28 * 2.0 < 1.0) {
                  var18 = var20;
               } else if (3.0 * var28 < 2.0) {
                  if (var4 >= -1886422207) {
                     return;
                  }

                  var18 = 6.0 * (var20 - var22) * (0.6666666666666666 - var28) + var22;
               } else {
                  var18 = var22;
               }
            }

            int var30 = (int)(256.0 * var14);
            int var21 = (int)(256.0 * var16);
            int var31 = (int)(256.0 * var18);
            int var23 = (var30 << 16) + (var21 << 8) + var31;
            var23 = UrlRequest.ac(var23, var0);
            if (0 == var23) {
               if (var4 >= -1886422207) {
                  return;
               }

               var23 = 1;
            }

            Rasterizer3D.af[var5++] = var23;
         }
      }

   }

   static final void at_renamed(Component var0, int var1, byte[] var2, byte[] var3) {
      if (var0.en == null) {
         if (null == var2) {
            return;
         }

         var0.en = new byte[11][];
         var0.er = new byte[11][];
         var0.eg = new int[11];
         var0.ed = new int[11];
      }

      var0.en[var1] = var2;
      if (null != var2) {
         var0.el = true;
      } else {
         var0.el = false;

         for(int var5 = 0; var5 < var0.en.length; ++var5) {
            if (var0.en[var5] != null) {
               var0.el = true;
               break;
            }
         }
      }

      var0.er[var1] = var3;
   }

   static final void md_renamed(int var0) {
      ClientProt.mp_renamed();
      am.an_renamed();
      int var2 = GraphicsDefaults.af_renamed(var0).ac * -1911979431;
      if (0 != var2) {
         int var3 = Varps.Varps_main[var0];
         if (1 == var2) {
            if (1 == var3) {
               ClientScriptFrame.mg(0.9);
            }

            if (2 == var3) {
               ClientScriptFrame.mg(0.8);
            }

            if (3 == var3) {
               ClientScriptFrame.mg(0.7);
            }

            if (4 == var3) {
               ClientScriptFrame.mg(0.6);
            }
         }

         if (3 == var2) {
            if (0 == var3) {
               dt.mo_renamed(255);
            }

            if (1 == var3) {
               dt.mo_renamed(192);
            }

            if (2 == var3) {
               dt.mo_renamed(128);
            }

            if (var3 == 3) {
               dt.mo_renamed(64);
            }

            if (4 == var3) {
               dt.mo_renamed(0);
            }
         }

         if (var2 == 4) {
            if (var3 == 0) {
               fe.mn_renamed(127);
            }

            if (1 == var3) {
               fe.mn_renamed(96);
            }

            if (var3 == 2) {
               fe.mn_renamed(64);
            }

            if (3 == var3) {
               fe.mn_renamed(32);
            }

            if (var3 == 4) {
               fe.mn_renamed(0);
            }
         }

         if (var2 == 5) {
            Client.nb = 1 == var3;
         }

         if (6 == var2) {
            Client.py = var3 * 1746693153;
         }

         if (var2 == 9) {
         }

         if (10 == var2) {
            if (var3 == 0) {
               fp.mi_renamed(127);
            }

            if (1 == var3) {
               fp.mi_renamed(96);
            }

            if (var3 == 2) {
               fp.mi_renamed(64);
            }

            if (var3 == 3) {
               fp.mi_renamed(32);
            }

            if (4 == var3) {
               fp.mi_renamed(0);
            }
         }

         if (17 == var2) {
            Client.pt = (var3 & '\uffff') * -1296642255;
         }

         if (var2 == 18) {
            Client.em = (dj)StructType.findEnumerated(UserComparator4.au_renamed(), var3);
            if (Client.em == null) {
               Client.em = dj.af;
            }
         }

         if (19 == var2) {
            if (-1 == var3) {
               Client.nl = -1035820595;
            } else {
               Client.nl = 1035820595 * (var3 & 2047);
            }
         }

         if (var2 == 22) {
            Client.ew = (dj)StructType.findEnumerated(UserComparator4.au_renamed(), var3);
            if (null == Client.ew) {
               Client.ew = dj.af;
            }
         }

      }
   }
}
