import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class UrlRequester implements Runnable {
   static Rasterizer3D tk;
   volatile boolean isClosed;
   Queue requests = new LinkedList();
   int ac;
   final Thread thread = new Thread(this);

   public void run() {
      while(!this.isClosed) {
         try {
            UrlRequest var1;
            synchronized(this) {
               var1 = (UrlRequest)this.requests.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.af(var1);
         } catch (Exception var7) {
            ob.af_renamed((String)null, var7);
         }
      }

   }

   abstract void af(UrlRequest var1) throws IOException;

   int an(URLConnection var1) {
      int var3 = UrlRequest.aw * -1513206085;
      if (var1 != null) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var3 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var5) {
         }
      }

      return var3;
   }

   public void ab() {
      this.isClosed = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.thread.join();
      } catch (InterruptedException var5) {
      }

   }

   public UrlRequest request(URL var1) {
      UrlRequest var3 = new UrlRequest(var1);
      synchronized(this) {
         this.requests.add(var3);
         this.notify();
         return var3;
      }
   }

   UrlRequester(int var1) {
      this.thread.setPriority(1);
      this.thread.start();
      this.ac = -502647555 * var1;
   }

   void aw(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1429112917 * this.ac);
   }

   void ac(URLConnection var1, UrlRequest var2) {
      DataInputStream var4 = null;

      try {
         int var6 = var1.getContentLength();
         var4 = new DataInputStream(var1.getInputStream());
         byte[] var5;
         if (var6 >= 0) {
            var5 = new byte[var6];
            var4.readFully(var5);
         } else {
            var5 = new byte[0];
            byte[] var7 = jz.ac_renamed(5000);

            byte[] var9;
            for(int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
               var9 = new byte[var8 + var5.length];
               System.arraycopy(var5, 0, var9, 0, var5.length);
               System.arraycopy(var7, 0, var9, var5.length, var8);
            }

            InterfaceParent.ByteArrayPool_release(var7);
         }

         var2.response0 = var5;
      } catch (IOException var15) {
         var2.response0 = null;
      } finally {
         var2.ac = this.an(var1) * -1964979829;
      }

      if (var4 != null) {
         try {
            var4.close();
         } catch (IOException var14) {
         }
      }

   }

   static void au_renamed(float[] var0) {
      if (em.ac + var0[0] < 1.3333334F) {
         float var2 = var0[0] - 2.0F;
         float var3 = var0[0] - 1.0F;
         float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * var3 * 4.0F));
         float var5 = 0.5F * (-var2 + var4);
         if (em.ac + var0[1] > var5) {
            var0[1] = var5 - em.ac;
         } else {
            var5 = 0.5F * (-var2 - var4);
            if (var0[1] < em.ac + var5) {
               var0[1] = var5 + em.ac;
            }
         }
      } else {
         var0[0] = 1.3333334F - em.ac;
         var0[1] = 0.33333334F - em.ac;
      }

   }

   static boolean aw_renamed(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            int var9 = var0.charAt(var8);
            if (0 == var8) {
               if (45 == var9) {
                  var4 = true;
                  continue;
               }

               if (var9 == 43 && var2) {
                  continue;
               }
            }

            if (var9 >= 48 && var9 <= 57) {
               var9 -= 48;
            } else if (var9 >= 65 && var9 <= 90) {
               var9 -= 55;
            } else {
               if (var9 < 97 || var9 > 122) {
                  return false;
               }

               var9 -= 87;
            }

            if (var9 >= var1) {
               return false;
            }

            if (var4) {
               var9 = -var9;
            }

            int var10 = var1 * var6 + var9;
            if (var10 / var1 != var6) {
               return false;
            }

            var6 = var10;
            var5 = true;
         }

         return var5;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }
}
