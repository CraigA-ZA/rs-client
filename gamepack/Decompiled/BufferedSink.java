import java.io.IOException;
import java.io.OutputStream;

public class BufferedSink implements Runnable {
   boolean isClosed0;
   byte[] buffer;
   int limit = 0;
   int position = 0;
   int capacity;
   IOException exception;
   OutputStream outputStream;
   Thread thread;

   public static int an_renamed(int var0) {
      return var0 >>> 4 & -858518957 * sc.ac;
   }

   BufferedSink(OutputStream var1, int var2) {
      this.outputStream = var1;
      this.capacity = -1984591447 * (1 + var2);
      this.buffer = new byte[this.capacity * 1534274201];
      this.thread = new Thread(this);
      this.thread.setDaemon(true);
      this.thread.start();
   }

   boolean isClosed() {
      if (this.isClosed0) {
         try {
            this.outputStream.close();
            if (this.exception == null) {
               this.exception = new IOException("");
            }
         } catch (IOException var3) {
            if (this.exception == null) {
               this.exception = new IOException(var3);
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
               if (null != this.exception) {
                  return;
               }

               if (this.position * -836587695 <= this.limit * -989370023) {
                  var1 = -989370023 * this.limit - this.position * -836587695;
               } else {
                  var1 = this.limit * -989370023 + (this.capacity * 1534274201 - -836587695 * this.position);
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.outputStream.flush();
               } catch (IOException var10) {
                  this.exception = var10;
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
            if (-836587695 * this.position + var1 <= this.capacity * 1534274201) {
               this.outputStream.write(this.buffer, -836587695 * this.position, var1);
            } else {
               int var13 = 1534274201 * this.capacity - this.position * -836587695;
               this.outputStream.write(this.buffer, this.position * -836587695, var13);
               this.outputStream.write(this.buffer, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.exception = var2;
               return;
            }
         }

         synchronized(this) {
            this.position = (this.position * -836587695 + var1) % (1534274201 * this.capacity) * -1949304399;
         }
      } while(!this.isClosed());

   }

   void write(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if (null != this.exception) {
               throw new IOException(this.exception.toString());
            } else {
               int var6;
               if (-836587695 * this.position <= -989370023 * this.limit) {
                  var6 = -836587695 * this.position + (1534274201 * this.capacity - this.limit * -989370023) - 1;
               } else {
                  var6 = this.position * -836587695 - this.limit * -989370023 - 1;
               }

               if (var6 < var3) {
                  throw new IOException("");
               } else {
                  if (this.limit * -989370023 + var3 <= this.capacity * 1534274201) {
                     System.arraycopy(var1, var2, this.buffer, this.limit * -989370023, var3);
                  } else {
                     int var7 = 1534274201 * this.capacity - this.limit * -989370023;
                     System.arraycopy(var1, var2, this.buffer, -989370023 * this.limit, var7);
                     System.arraycopy(var1, var7 + var2, this.buffer, 0, var3 - var7);
                  }

                  this.limit = -832024855 * ((-989370023 * this.limit + var3) % (this.capacity * 1534274201));
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
         this.isClosed0 = true;
         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var4) {
      }

   }
}
