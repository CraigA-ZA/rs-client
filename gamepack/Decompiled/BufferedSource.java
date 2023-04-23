import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class BufferedSource implements Runnable {
   byte[] ac;
   int ab = 0;
   int au = 0;
   int aw;
   IOException aq;
   InputStream an;
   Thread af;

   BufferedSource(InputStream var1, int var2) {
      this.an = var1;
      this.aw = -1354885101 * (1 + var2);
      this.ac = new byte[-1464241637 * this.aw];
      this.af = new Thread(this);
      this.af.setDaemon(true);
      this.af.start();
   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.aq) {
                  return;
               }

               if (this.au * 160772207 == 0) {
                  var1 = -1464241637 * this.aw - this.ab * 1652063427 - 1;
               } else if (this.au * 160772207 <= this.ab * 1652063427) {
                  var1 = this.aw * -1464241637 - 1652063427 * this.ab;
               } else {
                  var1 = this.au * 160772207 - 1652063427 * this.ab - 1;
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
            var2 = this.an.read(this.ac, 1652063427 * this.ab, var1);
            if (-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.aq = var3;
               return;
            }
         }

         synchronized(this) {
            this.ab = (this.ab * 1652063427 + var2) % (this.aw * -1464241637) * -954133525;
         }
      }
   }

   boolean isAvailable(int var1) throws IOException {
      if (0 == var1) {
         return true;
      } else if (var1 > 0 && var1 < -1464241637 * this.aw) {
         synchronized(this) {
            int var4;
            if (this.au * 160772207 <= this.ab * 1652063427) {
               var4 = 1652063427 * this.ab - this.au * 160772207;
            } else {
               var4 = this.aw * -1464241637 - 160772207 * this.au + this.ab * 1652063427;
            }

            if (var4 < var1) {
               if (this.aq != null) {
                  throw new IOException(this.aq.toString());
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
         if (this.au * 160772207 <= 1652063427 * this.ab) {
            var3 = this.ab * 1652063427 - this.au * 160772207;
         } else {
            var3 = this.aw * -1464241637 - 160772207 * this.au + 1652063427 * this.ab;
         }

         if (var3 <= 0 && null != this.aq) {
            throw new IOException(this.aq.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   int readUnsignedByte() throws IOException {
      synchronized(this) {
         if (this.ab * 1652063427 == 160772207 * this.au) {
            if (null != this.aq) {
               throw new IOException(this.aq.toString());
            } else {
               return -1;
            }
         } else {
            int var3 = this.ac[this.au * 160772207] & 255;
            this.au = (this.au * 160772207 + 1) % (-1464241637 * this.aw) * 1198141071;
            this.notifyAll();
            return var3;
         }
      }
   }

   int read(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var6;
            if (160772207 * this.au <= this.ab * 1652063427) {
               var6 = 1652063427 * this.ab - 160772207 * this.au;
            } else {
               var6 = this.ab * 1652063427 + (-1464241637 * this.aw - this.au * 160772207);
            }

            if (var3 > var6) {
               var3 = var6;
            }

            if (var3 == 0 && this.aq != null) {
               throw new IOException(this.aq.toString());
            } else {
               if (this.au * 160772207 + var3 <= this.aw * -1464241637) {
                  System.arraycopy(this.ac, this.au * 160772207, var1, var2, var3);
               } else {
                  int var7 = -1464241637 * this.aw - this.au * 160772207;
                  System.arraycopy(this.ac, 160772207 * this.au, var1, var2, var7);
                  System.arraycopy(this.ac, 0, var1, var7 + var2, var3 - var7);
               }

               this.au = 1198141071 * ((this.au * 160772207 + var3) % (-1464241637 * this.aw));
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
         if (this.aq == null) {
            this.aq = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.af.join();
      } catch (InterruptedException var4) {
      }

   }

   static int ah_renamed(Component var0) {
      if (883712245 * var0.bg != 11) {
         SecureRandomCallable.ay -= -1086551379;
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
         return 1;
      } else {
         String var2 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var0.bb(var2);
         return 1;
      }
   }
}
