import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class al {
   static final int nx = 500;
   final sg aw;
   static final int aj = 21;
   final ac ac;
   static int gm;
   Future an;
   static im mp;
   ExecutorService af;

   public sg ax() {
      try {
         return (sg)this.an.get();
      } catch (Exception var2) {
         return null;
      }
   }

   void ai() {
      this.an = this.af.submit(new an(this, this.aw, this.ac));
   }

   public void an(byte var1) {
      try {
         this.af.shutdown();
         this.af = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "al.an(" + ')');
      }
   }

   public sg aw(int var1) {
      try {
         try {
            return (sg)this.an.get();
         } catch (Exception var3) {
            return null;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "al.aw(" + ')');
      }
   }

   void ac(short var1) {
      try {
         this.an = this.af.submit(new an(this, this.aw, this.ac));
      } catch (RuntimeException var2) {
         throw db.an(var2, "al.ac(" + ')');
      }
   }

   public boolean au() {
      return this.an.isDone();
   }

   static final void md(int var0, int var1) {
      try {
         lv.mp((byte)2);
         am.an(-254097069);
         int var2 = qw.af(var0, -786931729).ac * -1911979431;
         if (0 == var2) {
            if (var1 >= 2146313614) {
               throw new IllegalStateException();
            }
         } else {
            int var3 = le.aw[var0];
            if (1 == var2) {
               if (var1 >= 2146313614) {
                  throw new IllegalStateException();
               }

               if (1 == var3) {
                  if (var1 >= 2146313614) {
                     return;
                  }

                  ck.mg(0.9);
               }

               if (2 == var3) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  ck.mg(0.8);
               }

               if (3 == var3) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  ck.mg(0.7);
               }

               if (4 == var3) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  ck.mg(0.6);
               }
            }

            if (3 == var2) {
               if (0 == var3) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  dt.mo(255, (byte)-62);
               }

               if (1 == var3) {
                  if (var1 >= 2146313614) {
                     return;
                  }

                  dt.mo(192, (byte)-55);
               }

               if (2 == var3) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  dt.mo(128, (byte)-21);
               }

               if (var3 == 3) {
                  dt.mo(64, (byte)-41);
               }

               if (4 == var3) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  dt.mo(0, (byte)-57);
               }
            }

            if (var2 == 4) {
               if (var3 == 0) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  fe.mn(127, 625679186);
               }

               if (1 == var3) {
                  if (var1 >= 2146313614) {
                     return;
                  }

                  fe.mn(96, 40756470);
               }

               if (var3 == 2) {
                  if (var1 >= 2146313614) {
                     return;
                  }

                  fe.mn(64, -404487349);
               }

               if (3 == var3) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  fe.mn(32, -740425721);
               }

               if (var3 == 4) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  fe.mn(0, 818165953);
               }
            }

            if (var2 == 5) {
               if (var1 >= 2146313614) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               if (1 == var3) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               client.nb = var10000;
            }

            if (6 == var2) {
               if (var1 >= 2146313614) {
                  throw new IllegalStateException();
               }

               client.py = var3 * 1746693153;
            }

            if (var2 == 9 && var1 >= 2146313614) {
               throw new IllegalStateException();
            } else {
               if (10 == var2) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  if (var3 == 0) {
                     if (var1 >= 2146313614) {
                        throw new IllegalStateException();
                     }

                     fp.mi(127, (byte)0);
                  }

                  if (1 == var3) {
                     if (var1 >= 2146313614) {
                        return;
                     }

                     fp.mi(96, (byte)0);
                  }

                  if (var3 == 2) {
                     if (var1 >= 2146313614) {
                        throw new IllegalStateException();
                     }

                     fp.mi(64, (byte)0);
                  }

                  if (var3 == 3) {
                     if (var1 >= 2146313614) {
                        throw new IllegalStateException();
                     }

                     fp.mi(32, (byte)0);
                  }

                  if (4 == var3) {
                     fp.mi(0, (byte)0);
                  }
               }

               if (17 == var2) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  client.pt = (var3 & '\uffff') * -1296642255;
               }

               if (var2 == 18) {
                  client.em = (dj)ht.af(ej.au((byte)32), var3, (short)173);
                  if (client.em == null) {
                     if (var1 >= 2146313614) {
                        throw new IllegalStateException();
                     }

                     client.em = dj.af;
                  }
               }

               if (19 == var2) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  if (-1 == var3) {
                     if (var1 >= 2146313614) {
                        return;
                     }

                     client.nl = -1035820595;
                  } else {
                     client.nl = 1035820595 * (var3 & 2047);
                  }
               }

               if (var2 == 22) {
                  if (var1 >= 2146313614) {
                     throw new IllegalStateException();
                  }

                  client.ew = (dj)ht.af(ej.au((byte)-29), var3, (short)173);
                  if (null == client.ew) {
                     if (var1 >= 2146313614) {
                        throw new IllegalStateException();
                     }

                     client.ew = dj.af;
                  }
               }

            }
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "al.md(" + ')');
      }
   }

   public void aq() {
      this.af.shutdown();
      this.af = null;
   }

   public void al() {
      this.af.shutdown();
      this.af = null;
   }

   public void at() {
      this.af.shutdown();
      this.af = null;
   }

   public sg aa() {
      try {
         return (sg)this.an.get();
      } catch (Exception var2) {
         return null;
      }
   }

   public boolean af(int var1) {
      try {
         return this.an.isDone();
      } catch (RuntimeException var2) {
         throw db.an(var2, "al.af(" + ')');
      }
   }

   public sg ay() {
      try {
         return (sg)this.an.get();
      } catch (Exception var2) {
         return null;
      }
   }

   public void ab() {
      this.af.shutdown();
      this.af = null;
   }

   public al(sg var1, ac var2) {
      try {
         super();
         this.af = Executors.newSingleThreadExecutor();
         this.aw = var1;
         this.ac = var2;
         this.ac((short)32199);
      } catch (RuntimeException var3) {
         throw db.an(var3, "al.<init>(" + ')');
      }
   }

   void ag() {
      this.an = this.af.submit(new an(this, this.aw, this.ac));
   }

   public sg ao() {
      try {
         return (sg)this.an.get();
      } catch (Exception var2) {
         return null;
      }
   }

   static final void at(mq var0, int var1, byte[] var2, byte[] var3, int var4) {
      try {
         if (var0.en == null) {
            if (var4 <= -400791056) {
               return;
            }

            if (null == var2) {
               return;
            }

            if (var4 <= -400791056) {
               throw new IllegalStateException();
            }

            var0.en = new byte[11][];
            var0.er = new byte[11][];
            var0.eg = new int[11];
            var0.ed = new int[11];
         }

         var0.en[var1] = var2;
         if (null != var2) {
            if (var4 <= -400791056) {
               throw new IllegalStateException();
            }

            var0.el = true;
         } else {
            var0.el = false;

            for(int var5 = 0; var5 < var0.en.length; ++var5) {
               if (var0.en[var5] != null) {
                  if (var4 <= -400791056) {
                     return;
                  }

                  var0.el = true;
                  break;
               }
            }
         }

         var0.er[var1] = var3;
      } catch (RuntimeException var6) {
         throw db.an(var6, "al.at(" + ')');
      }
   }

   static void aw(double var0, int var2, int var3, int var4) {
      try {
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

               int var31 = (int)(256.0 * var14);
               int var21 = (int)(256.0 * var16);
               int var32 = (int)(256.0 * var18);
               int var23 = (var31 << 16) + (var21 << 8) + var32;
               var23 = ez.ac(var23, var0);
               if (0 == var23) {
                  if (var4 >= -1886422207) {
                     return;
                  }

                  var23 = 1;
               }

               in.af[var5++] = var23;
            }
         }

      } catch (RuntimeException var30) {
         throw db.an(var30, "al.aw(" + ')');
      }
   }
}
