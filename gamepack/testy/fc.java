import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class fc extends fb {
   static final int al = 8;
   // $FF: synthetic field
   final fa this$0;
   static final int as = 360;
   static final String aa = "random.dat";
   public static final int aj = 19;
   String af;
   static final int ai = 2;
   public static final int av = 99;
   static tc[] ao;

   void af(sg var1, int var2) {
      try {
         this.af = var1.cw((byte)0);
         var1.cx(-1823467188);
      } catch (RuntimeException var3) {
         throw db.an(var3, "fc.af(" + ')');
      }
   }

   fc(fa var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw db.an(var2, "fc.<init>(" + ')');
      }
   }

   public static gv al(int var0) {
      try {
         try {
            return new gu();
         } catch (Throwable var2) {
            return new gb();
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "fc.al(" + ')');
      }
   }

   void aw(fj var1) {
      var1.ab = this.af;
   }

   void ac(sg var1) {
      this.af = var1.cw((byte)0);
      var1.cx(-1368796758);
   }

   void au(sg var1) {
      this.af = var1.cw((byte)0);
      var1.cx(-1142557849);
   }

   void an(fj var1, int var2) {
      try {
         var1.ab = this.af;
      } catch (RuntimeException var3) {
         throw db.an(var3, "fc.an(" + ')');
      }
   }

   public static hx an(int var0, byte var1) {
      try {
         hx var2 = (hx)hx.an.af((long)var0);
         if (null != var2) {
            return var2;
         } else {
            byte[] var3 = hx.af.bh(8, var0, (byte)-88);
            var2 = new hx();
            if (var3 != null) {
               var2.aw(new sg(var3), (byte)1);
            }

            hx.an.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "fc.an(" + ')');
      }
   }

   public static final bu as(gd var0, int var1, int var2, int var3) {
      try {
         if (bu.au * -1359271235 == 0) {
            if (var3 != 1831095645) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException();
            }
         } else {
            if (var1 >= 0) {
               if (var3 != 1831095645) {
                  throw new IllegalStateException();
               }

               if (var1 < 2) {
                  if (var2 < 256) {
                     if (var3 != 1831095645) {
                        throw new IllegalStateException();
                     }

                     var2 = 256;
                  }

                  try {
                     bu var4 = bu.ax.af(1183188913);
                     byte var10002;
                     if (bu.ab) {
                        if (var3 != 1831095645) {
                           throw new IllegalStateException();
                        }

                        var10002 = 2;
                     } else {
                        var10002 = 1;
                     }

                     var4.ai = new int[256 * var10002];
                     var4.am = var2 * 918717953;
                     var4.af((byte)28);
                     var4.ar = -1783299003 * ((var2 & -1024) + 1024);
                     if (var4.ar * -896831859 > 16384) {
                        if (var3 != 1831095645) {
                           throw new IllegalStateException();
                        }

                        var4.ar = 1091649536;
                     }

                     var4.an(var4.ar * -896831859, 162133052);
                     if (ez.at * -808987209 > 0) {
                        if (var3 != 1831095645) {
                           throw new IllegalStateException();
                        }

                        if (nf.aa == null) {
                           if (var3 != 1831095645) {
                              throw new IllegalStateException();
                           }

                           nf.aa = new bq();
                           bq.al = Executors.newScheduledThreadPool(1);
                           bq.al.scheduleAtFixedRate(nf.aa, 0L, 10L, TimeUnit.MILLISECONDS);
                        }
                     }

                     if (null != nf.aa) {
                        if (var3 != 1831095645) {
                           throw new IllegalStateException();
                        }

                        if (null != nf.aa.af[var1]) {
                           if (var3 != 1831095645) {
                              throw new IllegalStateException();
                           }

                           throw new IllegalArgumentException();
                        }

                        nf.aa.af[var1] = var4;
                     }

                     return var4;
                  } catch (Throwable var5) {
                     return new bu();
                  }
               }
            }

            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "fc.as(" + ')');
      }
   }

   static final void ml(int var0) {
      try {
         lg var1 = mi.an(lv.cn, client.in.au, (short)-31998);
         client.in.aw(var1, 414135591);
         cy.az = true;

         for(di var2 = (di)client.oc.aw(); var2 != null; var2 = (di)client.oc.ac()) {
            if (var0 >= 1938452949) {
               throw new IllegalStateException();
            }

            if (0 != -1702664641 * var2.an) {
               if (var0 >= 1938452949) {
                  throw new IllegalStateException();
               }

               if (var2.an * -1702664641 != 3) {
                  continue;
               }

               if (var0 >= 1938452949) {
                  throw new IllegalStateException();
               }
            }

            nv.my(var2, true, -2108168630);
         }

         if (client.pg != null) {
            fw.ma(client.pg, -2105356327);
            client.pg = null;
         }

         cy.az = false;
      } catch (RuntimeException var3) {
         throw db.an(var3, "fc.ml(" + ')');
      }
   }
}
