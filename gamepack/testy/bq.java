import accessors.RSSoundSystem;
import java.util.concurrent.ScheduledExecutorService;

public class bq implements Runnable, RSSoundSystem {
   static mq ag;
   static ScheduledExecutorService al;
   static final int uy = 5;
   volatile bu[] af;
   static final int dx = 19;

   public void gy() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            bu var2 = this.af[var1];
            if (null != var2) {
               var2.ak(336870901);
            }
         }
      } catch (Exception var3) {
         ob.af((String)null, var3, (byte)8);
      }

   }

   public void run() {
      try {
         try {
            for(int var1 = 0; var1 < 2; ++var1) {
               bu var2 = this.af[var1];
               if (null != var2) {
                  var2.ak(336870901);
               }
            }
         } catch (Exception var3) {
            ob.af((String)null, var3, (byte)8);
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "bq.run(" + ')');
      }
   }

   bq() {
      try {
         super();
         this.af = new bu[2];
      } catch (RuntimeException var1) {
         throw db.an(var1, "bq.<init>(" + ')');
      }
   }

   public void gd() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            bu var2 = this.af[var1];
            if (null != var2) {
               var2.ak(336870901);
            }
         }
      } catch (Exception var3) {
         ob.af((String)null, var3, (byte)8);
      }

   }

   static int br(int var0, int var1) {
      try {
         return (int)((Math.log((double)var0) / cy.bi - 7.0) * 256.0);
      } catch (RuntimeException var2) {
         throw db.an(var2, "bq.br(" + ')');
      }
   }

   static int bl(int var0, ch var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "bq.bl(" + ')');
      }
   }

   public static mq aw(int var0, int var1, int var2) {
      try {
         mq var3 = gh.an(var0, (byte)5);
         if (var1 == -1) {
            if (var2 == -1273201221) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            if (var3 != null) {
               if (var2 == -1273201221) {
                  throw new IllegalStateException();
               }

               if (null != var3.gz) {
                  if (var1 < var3.gz.length) {
                     return var3.gz[var1];
                  }

                  if (var2 == -1273201221) {
                     throw new IllegalStateException();
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "bq.aw(" + ')');
      }
   }

   public static boolean ac(int var0, int var1) {
      try {
         if (kt.by[var0]) {
            if (var1 != 1376777516) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (!eb.bb.cs(var0, 1172505784)) {
            if (var1 != 1376777516) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var2 = eb.bb.cq(var0, (byte)119);
            if (0 == var2) {
               if (var1 != 1376777516) {
                  throw new IllegalStateException();
               } else {
                  kt.by[var0] = true;
                  return true;
               }
            } else {
               if (hn.ap[var0] == null) {
                  if (var1 != 1376777516) {
                     throw new IllegalStateException();
                  }

                  hn.ap[var0] = new mq[var2];
               }

               for(int var3 = 0; var3 < var2; ++var3) {
                  if (var1 != 1376777516) {
                     throw new IllegalStateException();
                  }

                  if (hn.ap[var0][var3] == null) {
                     if (var1 != 1376777516) {
                        throw new IllegalStateException();
                     }

                     byte[] var4 = eb.bb.bh(var0, var3, (byte)-46);
                     if (var4 != null) {
                        if (var1 != 1376777516) {
                           throw new IllegalStateException();
                        }

                        hn.ap[var0][var3] = new mq();
                        hn.ap[var0][var3].bs = (var3 + (var0 << 16)) * 346484955;
                        if (var4[0] == -1) {
                           if (var1 != 1376777516) {
                              throw new IllegalStateException();
                           }

                           hn.ap[var0][var3].ab(new sg(var4), 604095410);
                        } else {
                           hn.ap[var0][var3].au(new sg(var4), -1896942489);
                        }
                     }
                  }
               }

               kt.by[var0] = true;
               return true;
            }
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "bq.ac(" + ')');
      }
   }
}
