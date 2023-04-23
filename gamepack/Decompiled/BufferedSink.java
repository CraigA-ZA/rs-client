import java.io.IOException;
import java.io.OutputStream;

public class BufferedSink implements Runnable {
   boolean al;
   byte[] ac;
   int ab = 0;
   int au = 0;
   int aw;
   IOException aq;
   OutputStream an;
   Thread af;

   public static int an_renamed(int var0) {
      return var0 >>> 4 & -858518957 * sc.ac;
   }

   BufferedSink(OutputStream var1, int var2) {
      this.an = var1;
      this.aw = -1984591447 * (1 + var2);
      this.ac = new byte[this.aw * 1534274201];
      this.af = new Thread(this);
      this.af.setDaemon(true);
      this.af.start();
   }

   boolean isClosed() {
      if (this.al) {
         try {
            this.an.close();
            if (this.aq == null) {
               this.aq = new IOException("");
            }
         } catch (IOException var3) {
            if (this.aq == null) {
               this.aq = new IOException(var3);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.aq) {
                  return;
               }

               if (this.au * -836587695 <= this.ab * -989370023) {
                  var1 = -989370023 * this.ab - this.au * -836587695;
               } else {
                  var1 = this.ab * -989370023 + (this.aw * 1534274201 - -836587695 * this.au);
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.an.flush();
               } catch (IOException var10) {
                  this.aq = var10;
                  return;
               }

               if (this.isClosed()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (-836587695 * this.au + var1 <= this.aw * 1534274201) {
               this.an.write(this.ac, -836587695 * this.au, var1);
            } else {
               int var13 = 1534274201 * this.aw - this.au * -836587695;
               this.an.write(this.ac, this.au * -836587695, var13);
               this.an.write(this.ac, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.aq = var2;
               return;
            }
         }

         synchronized(this) {
            this.au = (this.au * -836587695 + var1) % (1534274201 * this.aw) * -1949304399;
         }
      } while(!this.isClosed());

   }

   void write(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if (null != this.aq) {
               throw new IOException(this.aq.toString());
            } else {
               int var6;
               if (-836587695 * this.au <= -989370023 * this.ab) {
                  var6 = -836587695 * this.au + (1534274201 * this.aw - this.ab * -989370023) - 1;
               } else {
                  var6 = this.au * -836587695 - this.ab * -989370023 - 1;
               }

               if (var6 < var3) {
                  throw new IOException("");
               } else {
                  if (this.ab * -989370023 + var3 <= this.aw * 1534274201) {
                     System.arraycopy(var1, var2, this.ac, this.ab * -989370023, var3);
                  } else {
                     int var7 = 1534274201 * this.aw - this.ab * -989370023;
                     System.arraycopy(var1, var2, this.ac, -989370023 * this.ab, var7);
                     System.arraycopy(var1, var7 + var2, this.ac, 0, var3 - var7);
                  }

                  this.ab = -832024855 * ((-989370023 * this.ab + var3) % (this.aw * 1534274201));
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void close() {
      synchronized(this) {
         this.al = true;
         this.notifyAll();
      }

      try {
         this.af.join();
      } catch (InterruptedException var4) {
      }

   }
}
