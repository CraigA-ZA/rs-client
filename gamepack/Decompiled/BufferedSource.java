import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class BufferedSource implements Runnable {
   byte[] buffer;
   int limit = 0;
   int position = 0;
   int capacity;
   IOException exception;
   InputStream inputStream;
   Thread thread;

   BufferedSource(InputStream var1, int var2) {
      this.inputStream = var1;
      this.capacity = -1354885101 * (1 + var2);
      this.buffer = new byte[-1464241637 * this.capacity];
      this.thread = new Thread(this);
      this.thread.setDaemon(true);
      this.thread.start();
   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.exception) {
                  return;
               }

               if (this.position * 160772207 == 0) {
                  var1 = -1464241637 * this.capacity - this.limit * 1652063427 - 1;
               } else if (this.position * 160772207 <= this.limit * 1652063427) {
                  var1 = this.capacity * -1464241637 - 1652063427 * this.limit;
               } else {
                  var1 = this.position * 160772207 - 1652063427 * this.limit - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.inputStream.read(this.buffer, 1652063427 * this.limit, var1);
            if (-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.exception = var3;
               return;
            }
         }

         synchronized(this) {
            this.limit = (this.limit * 1652063427 + var2) % (this.capacity * -1464241637) * -954133525;
         }
      }
   }

   boolean isAvailable(int var1) throws IOException {
      if (0 == var1) {
         return true;
      } else if (var1 > 0 && var1 < -1464241637 * this.capacity) {
         synchronized(this) {
            int var4;
            if (this.position * 160772207 <= this.limit * 1652063427) {
               var4 = 1652063427 * this.limit - this.position * 160772207;
            } else {
               var4 = this.capacity * -1464241637 - 160772207 * this.position + this.limit * 1652063427;
            }

            if (var4 < var1) {
               if (this.exception != null) {
                  throw new IOException(this.exception.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int available() throws IOException {
      synchronized(this) {
         int var3;
         if (this.position * 160772207 <= 1652063427 * this.limit) {
            var3 = this.limit * 1652063427 - this.position * 160772207;
         } else {
            var3 = this.capacity * -1464241637 - 160772207 * this.position + 1652063427 * this.limit;
         }

         if (var3 <= 0 && null != this.exception) {
            throw new IOException(this.exception.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   int readUnsignedByte() throws IOException {
      synchronized(this) {
         if (this.limit * 1652063427 == 160772207 * this.position) {
            if (null != this.exception) {
               throw new IOException(this.exception.toString());
            } else {
               return -1;
            }
         } else {
            int var3 = this.buffer[this.position * 160772207] & 255;
            this.position = (this.position * 160772207 + 1) % (-1464241637 * this.capacity) * 1198141071;
            this.notifyAll();
            return var3;
         }
      }
   }

   int read(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var6;
            if (160772207 * this.position <= this.limit * 1652063427) {
               var6 = 1652063427 * this.limit - 160772207 * this.position;
            } else {
               var6 = this.limit * 1652063427 + (-1464241637 * this.capacity - this.position * 160772207);
            }

            if (var3 > var6) {
               var3 = var6;
            }

            if (var3 == 0 && this.exception != null) {
               throw new IOException(this.exception.toString());
            } else {
               if (this.position * 160772207 + var3 <= this.capacity * -1464241637) {
                  System.arraycopy(this.buffer, this.position * 160772207, var1, var2, var3);
               } else {
                  int var7 = -1464241637 * this.capacity - this.position * 160772207;
                  System.arraycopy(this.buffer, 160772207 * this.position, var1, var2, var7);
                  System.arraycopy(this.buffer, 0, var1, var7 + var2, var3 - var7);
               }

               this.position = 1198141071 * ((this.position * 160772207 + var3) % (-1464241637 * this.capacity));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void close() {
      synchronized(this) {
         if (this.exception == null) {
            this.exception = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var4) {
      }

   }

   static int ah_renamed(Component var0) {
      if (883712245 * var0.type != 11) {
         SecureRandomCallable.Interpreter_stringStackSize -= -1086551379;
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
         return 1;
      } else {
         String var2 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var0.bb(var2);
         return 1;
      }
   }
}
