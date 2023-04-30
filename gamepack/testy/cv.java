import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class cv {
   static final int ac = 1000;
   static final String an = "services";
   public static final int cq = 82;
   static final String af = "m=accountappeal/login.ws";
   static final String aw = "passwordchoice.ws";
   static final BigInteger ab = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   static final int at = 4;
   static final int aa = 5;
   static final BigInteger au = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

   static boolean al(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   static boolean aa(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   static long aw() {
      try {
         URL var0 = new URL(gl.nb("services", false, -854917675) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(-648470571);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         sg var4 = new sg(new byte[1000]);

         do {
            int var5 = var3.read(var4.al, 1680524610 * var4.at, -1200940649 - -1633313603 * var4.at);
            if (-1 == var5) {
               var4.at = 0;
               long var8 = var4.cv((byte)1);
               return var8;
            }

            var4.at += -1516355947 * var5;
         } while(578814497 * var4.at < 1000);

         return 0L;
      } catch (Exception var7) {
         return 0L;
      }
   }

   cv() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "cv.<init>(" + ')');
      }
   }

   public static tc[] af(nm var0, int var1, int var2, int var3) {
      try {
         byte[] var5 = var0.bh(var1, var2, (byte)-69);
         boolean var4;
         if (null == var5) {
            if (var3 >= 1679393935) {
               throw new IllegalStateException();
            }

            var4 = false;
         } else {
            sb.aa(var5, 1145263442);
            var4 = true;
         }

         if (!var4) {
            if (var3 >= 1679393935) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            tc[] var6 = new tc[1606065339 * tx.af];

            for(int var7 = 0; var7 < 1606065339 * tx.af; ++var7) {
               tc var8 = var6[var7] = new tc();
               var8.aq = tx.an * -822007097;
               var8.al = 378525975 * tx.aw;
               var8.au = tx.ac[var7];
               var8.ab = ar.au[var7];
               var8.aw = dd.ab[var7];
               var8.ac = fd.aq[var7];
               var8.an = pc.al;
               var8.af = hg.at[var7];
            }

            pk.ay(-262861184);
            return var6;
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "cv.af(" + ')');
      }
   }

   static long ab() {
      try {
         URL var0 = new URL(gl.nb("services", false, -703414801) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         sg var4 = new sg(new byte[-588025164]);

         do {
            int var5 = var3.read(var4.al, -1633313603 * var4.at, 1000 - -1633313603 * var4.at);
            if (-1 == var5) {
               var4.at = 0;
               long var8 = var4.cv((byte)1);
               return var8;
            }

            var4.at += -225579219 * var5;
         } while(-1633313603 * var4.at < 1304107812);

         return 0L;
      } catch (Exception var7) {
         return 0L;
      }
   }

   static long au() {
      try {
         URL var0 = new URL(gl.nb("services", false, -28050475) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         sg var4 = new sg(new byte[-411792358]);

         do {
            int var5 = var3.read(var4.al, 1960572173 * var4.at, 1000 - 537621587 * var4.at);
            if (-1 == var5) {
               var4.at = 0;
               long var8 = var4.cv((byte)1);
               return var8;
            }

            var4.at += -1516355947 * var5;
         } while(-1633313603 * var4.at < 511344869);

         return 0L;
      } catch (Exception var7) {
         return 0L;
      }
   }

   static boolean aq(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   static boolean at(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   static long ac() {
      try {
         URL var0 = new URL(gl.nb("services", false, -843357213) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         sg var4 = new sg(new byte[1000]);

         do {
            int var5 = var3.read(var4.al, -1633313603 * var4.at, 1000 - -1633313603 * var4.at);
            if (-1 == var5) {
               var4.at = 0;
               long var8 = var4.cv((byte)1);
               return var8;
            }

            var4.at += -1516355947 * var5;
         } while(-1633313603 * var4.at < 1000);

         return 0L;
      } catch (Exception var7) {
         return 0L;
      }
   }

   static boolean ay(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   static void nf(String var0, boolean var1, short var2) {
      try {
         var0 = var0.toLowerCase();
         short[] var3 = new short[16];
         int var4 = 0;

         for(int var5 = 0; var5 < -1485716275 * dl.at; ++var5) {
            if (var2 != 255) {
               throw new IllegalStateException();
            }

            hz var6 = dh.af(var5, (byte)115);
            if (var1) {
               if (var2 != 255) {
                  throw new IllegalStateException();
               }

               if (!var6.cf) {
                  continue;
               }
            }

            if (var6.ci * -1375068187 == -1) {
               if (var6.ah.toLowerCase().indexOf(var0) == -1) {
                  if (var2 != 255) {
                     throw new IllegalStateException();
                  }
               } else {
                  if (var4 >= 250) {
                     if (var2 != 255) {
                        throw new IllegalStateException();
                     }

                     kt.wu = 316033701;
                     pj.wm = null;
                     return;
                  }

                  if (var4 >= var3.length) {
                     if (var2 != 255) {
                        throw new IllegalStateException();
                     }

                     short[] var7 = new short[var3.length * 2];

                     for(int var8 = 0; var8 < var4; ++var8) {
                        if (var2 != 255) {
                           throw new IllegalStateException();
                        }

                        var7[var8] = var3[var8];
                     }

                     var3 = var7;
                  }

                  var3[var4++] = (short)var5;
               }
            }
         }

         pj.wm = var3;
         ri.wj = 0;
         kt.wu = -316033701 * var4;
         String[] var10 = new String[kt.wu * 1764192979];

         for(int var11 = 0; var11 < kt.wu * 1764192979; ++var11) {
            if (var2 != 255) {
               throw new IllegalStateException();
            }

            var10[var11] = dh.af(var3[var11], (byte)105).ah;
         }

         nb.af(var10, pj.wm, -680765702);
      } catch (RuntimeException var9) {
         throw db.an(var9, "cv.nf(" + ')');
      }
   }

   static final void aa(mq var0, int var1, int var2, int var3, int var4) {
      try {
         if (var0.eg == null) {
            if (var4 >= 80155403) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            var0.eg[var1] = var2;
            var0.ed[var1] = var3;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "cv.aa(" + ')');
      }
   }
}
