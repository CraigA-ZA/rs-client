import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class ef extends et {
   final boolean au;
   public static final String ki = "Date not valid.";
   static String cm;
   public static final int ao = 0;

   void aq(ez var1) throws IOException {
      URLConnection var2 = null;
      boolean var9 = false;

      label124: {
         HttpURLConnection var12;
         label125: {
            try {
               var9 = true;
               String var3 = var1.af.getProtocol();
               if (var3.equals("http")) {
                  var2 = this.ad(var1, (byte)-18);
               } else {
                  if (!var3.equals("https")) {
                     var1.ac = -1267363191 * ez.aw;
                     var9 = false;
                     break label124;
                  }

                  var2 = this.ae(var1, 2084063928);
               }

               this.ac(var2, var1, (byte)1);
               var9 = false;
               break label125;
            } catch (IOException var10) {
               var1.ac = ez.aw * -1267363191;
               var9 = false;
            } finally {
               if (var9) {
                  if (null != var2 && var2 instanceof HttpURLConnection) {
                     HttpURLConnection var6 = (HttpURLConnection)var2;
                     var6.disconnect();
                  }

               }
            }

            if (null != var2 && var2 instanceof HttpURLConnection) {
               var12 = (HttpURLConnection)var2;
               var12.disconnect();
            }

            return;
         }

         if (null != var2 && var2 instanceof HttpURLConnection) {
            var12 = (HttpURLConnection)var2;
            var12.disconnect();
         }

         return;
      }

      if (null != var2 && var2 instanceof HttpURLConnection) {
         HttpURLConnection var4 = (HttpURLConnection)var2;
         var4.disconnect();
      }

   }

   void af(ez var1, byte var2) throws IOException {
      try {
         URLConnection var3 = null;
         boolean var11 = false;

         label216: {
            HttpURLConnection var15;
            label217: {
               try {
                  var11 = true;
                  String var4 = var1.af.getProtocol();
                  if (var4.equals("http")) {
                     if (var2 != 16) {
                        throw new IllegalStateException();
                     }

                     var3 = this.ad(var1, (byte)106);
                  } else {
                     if (!var4.equals("https")) {
                        var1.ac = -1267363191 * ez.aw;
                        var11 = false;
                        break label216;
                     }

                     if (var2 != 16) {
                        throw new IllegalStateException();
                     }

                     var3 = this.ae(var1, 241059257);
                  }

                  this.ac(var3, var1, (byte)1);
                  var11 = false;
                  break label217;
               } catch (IOException var12) {
                  var1.ac = ez.aw * -1267363191;
                  var11 = false;
               } finally {
                  if (var11) {
                     if (null != var3) {
                        if (var2 != 16) {
                           throw new IllegalStateException();
                        }

                        if (var3 instanceof HttpURLConnection) {
                           if (var2 != 16) {
                              return;
                           }

                           HttpURLConnection var7 = (HttpURLConnection)var3;
                           var7.disconnect();
                        }
                     }

                  }
               }

               if (null != var3) {
                  if (var2 != 16) {
                     return;
                  }

                  if (var3 instanceof HttpURLConnection) {
                     if (var2 != 16) {
                        return;
                     }

                     var15 = (HttpURLConnection)var3;
                     var15.disconnect();
                     return;
                  }
               }

               return;
            }

            if (null != var3) {
               if (var2 != 16) {
                  throw new IllegalStateException();
               }

               if (var3 instanceof HttpURLConnection) {
                  if (var2 != 16) {
                     throw new IllegalStateException();
                  }

                  var15 = (HttpURLConnection)var3;
                  var15.disconnect();
                  return;
               }
            }

            return;
         }

         if (null != var3) {
            if (var2 != 16) {
               throw new IllegalStateException();
            }

            if (var3 instanceof HttpURLConnection) {
               if (var2 != 16) {
                  throw new IllegalStateException();
               }

               HttpURLConnection var5 = (HttpURLConnection)var3;
               var5.disconnect();
            }
         }

      } catch (RuntimeException var14) {
         throw db.an(var14, "ef.af(" + ')');
      }
   }

   URLConnection ad(ez var1, byte var2) throws IOException {
      try {
         URLConnection var3 = var1.af.openConnection();
         this.aw(var3, -218004174);
         return var3;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ef.ad(" + ')');
      }
   }

   URLConnection ae(ez var1, int var2) throws IOException {
      try {
         HttpsURLConnection var3 = (HttpsURLConnection)var1.af.openConnection();
         if (!this.au) {
            if (var2 <= 191557501) {
               throw new IllegalStateException();
            }

            if (ah.an == null) {
               if (var2 <= 191557501) {
                  throw new IllegalStateException();
               }

               ah.an = new ah();
            }

            ah var5 = ah.an;
            var3.setSSLSocketFactory(var5);
         }

         this.aw(var3, 1091477024);
         return var3;
      } catch (RuntimeException var6) {
         throw db.an(var6, "ef.ae(" + ')');
      }
   }

   void al(ez var1) throws IOException {
      URLConnection var2 = null;
      boolean var9 = false;

      label124: {
         HttpURLConnection var12;
         label125: {
            try {
               var9 = true;
               String var3 = var1.af.getProtocol();
               if (var3.equals("http")) {
                  var2 = this.ad(var1, (byte)-122);
               } else {
                  if (!var3.equals("https")) {
                     var1.ac = -1267363191 * ez.aw;
                     var9 = false;
                     break label124;
                  }

                  var2 = this.ae(var1, 1164952618);
               }

               this.ac(var2, var1, (byte)1);
               var9 = false;
               break label125;
            } catch (IOException var10) {
               var1.ac = ez.aw * -1267363191;
               var9 = false;
            } finally {
               if (var9) {
                  if (null != var2 && var2 instanceof HttpURLConnection) {
                     HttpURLConnection var6 = (HttpURLConnection)var2;
                     var6.disconnect();
                  }

               }
            }

            if (null != var2 && var2 instanceof HttpURLConnection) {
               var12 = (HttpURLConnection)var2;
               var12.disconnect();
            }

            return;
         }

         if (null != var2 && var2 instanceof HttpURLConnection) {
            var12 = (HttpURLConnection)var2;
            var12.disconnect();
         }

         return;
      }

      if (null != var2 && var2 instanceof HttpURLConnection) {
         HttpURLConnection var4 = (HttpURLConnection)var2;
         var4.disconnect();
      }

   }

   URLConnection bk(ez var1) throws IOException {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.af.openConnection();
      if (!this.au) {
         if (ah.an == null) {
            ah.an = new ah();
         }

         ah var4 = ah.an;
         var2.setSSLSocketFactory(var4);
      }

      this.aw(var2, 2045789056);
      return var2;
   }

   URLConnection ap(ez var1) throws IOException {
      URLConnection var2 = var1.af.openConnection();
      this.aw(var2, 1468655840);
      return var2;
   }

   URLConnection bi(ez var1) throws IOException {
      URLConnection var2 = var1.af.openConnection();
      this.aw(var2, 623183817);
      return var2;
   }

   URLConnection by(ez var1) throws IOException {
      URLConnection var2 = var1.af.openConnection();
      this.aw(var2, 1383463735);
      return var2;
   }

   URLConnection bb(ez var1) throws IOException {
      URLConnection var2 = var1.af.openConnection();
      this.aw(var2, 68666793);
      return var2;
   }

   void at(ez var1) throws IOException {
      URLConnection var2 = null;
      boolean var9 = false;

      label124: {
         HttpURLConnection var12;
         label125: {
            try {
               var9 = true;
               String var3 = var1.af.getProtocol();
               if (var3.equals("http")) {
                  var2 = this.ad(var1, (byte)103);
               } else {
                  if (!var3.equals("https")) {
                     var1.ac = -1267363191 * ez.aw;
                     var9 = false;
                     break label124;
                  }

                  var2 = this.ae(var1, 2136108192);
               }

               this.ac(var2, var1, (byte)1);
               var9 = false;
               break label125;
            } catch (IOException var10) {
               var1.ac = ez.aw * -1267363191;
               var9 = false;
            } finally {
               if (var9) {
                  if (null != var2 && var2 instanceof HttpURLConnection) {
                     HttpURLConnection var6 = (HttpURLConnection)var2;
                     var6.disconnect();
                  }

               }
            }

            if (null != var2 && var2 instanceof HttpURLConnection) {
               var12 = (HttpURLConnection)var2;
               var12.disconnect();
            }

            return;
         }

         if (null != var2 && var2 instanceof HttpURLConnection) {
            var12 = (HttpURLConnection)var2;
            var12.disconnect();
         }

         return;
      }

      if (null != var2 && var2 instanceof HttpURLConnection) {
         HttpURLConnection var4 = (HttpURLConnection)var2;
         var4.disconnect();
      }

   }

   URLConnection be(ez var1) throws IOException {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.af.openConnection();
      if (!this.au) {
         if (ah.an == null) {
            ah.an = new ah();
         }

         ah var4 = ah.an;
         var2.setSSLSocketFactory(var4);
      }

      this.aw(var2, 574423489);
      return var2;
   }

   public static Object af(byte[] var0, boolean var1, int var2) {
      try {
         if (null == var0) {
            if (var2 <= -68216807) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (var0.length > 136) {
            mp var3 = new mp();
            var3.au(var0, 1503790515);
            return var3;
         } else if (var1) {
            if (var2 <= -68216807) {
               throw new IllegalStateException();
            } else {
               return fy.aw(var0, (byte)12);
            }
         } else {
            return var0;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ef.af(" + ')');
      }
   }

   URLConnection bx(ez var1) throws IOException {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.af.openConnection();
      if (!this.au) {
         if (ah.an == null) {
            ah.an = new ah();
         }

         ah var4 = ah.an;
         var2.setSSLSocketFactory(var4);
      }

      this.aw(var2, 1608808350);
      return var2;
   }

   public ef(boolean var1, int var2) {
      try {
         super(var2);
         this.au = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ef.<init>(" + ')');
      }
   }

   URLConnection bo(ez var1) throws IOException {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.af.openConnection();
      if (!this.au) {
         if (ah.an == null) {
            ah.an = new ah();
         }

         ah var4 = ah.an;
         var2.setSSLSocketFactory(var4);
      }

      this.aw(var2, -23259689);
      return var2;
   }
}
