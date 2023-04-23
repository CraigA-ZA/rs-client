import java.io.EOFException;
import java.io.IOException;

public class BufferedFile {
   byte[] ab;
   byte[] aw;
   int al = 0;
   int au;
   long aa;
   long ac = 3718207757638450433L;
   long ao;
   long aq = -699769937149266301L;
   long at;
   long ay;
   AccessFile an;

   public BufferedFile(AccessFile var1, int var2, int var3) throws IOException {
      this.an = var1;
      this.ay = (this.aa = var1.length() * 5255811969167658705L) * 6082200808648199633L;
      this.aw = new byte[var2];
      this.ab = new byte[var3];
      this.at = 0L;
   }

   public void close() throws IOException {
      this.flush();
      this.an.close();
   }

   public void seek(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.at = var1 * -6181027881899576669L;
      }
   }

   public long length() {
      return this.ay * -1243507284389482911L;
   }

   public void readFill(byte[] var1) throws IOException {
      this.read(var1, 0, var1.length);
   }

   public void read(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (-8462239109085136939L * this.aq != -1L && this.at * 8429326271465132299L >= -8462239109085136939L * this.aq && 8429326271465132299L * this.at + (long)var3 <= this.aq * -8462239109085136939L + (long)(this.al * -654786411)) {
            System.arraycopy(this.ab, (int)(this.at * 8429326271465132299L - -8462239109085136939L * this.aq), var1, var2, var3);
            this.at += -6181027881899576669L * (long)var3;
            return;
         }

         long var5 = 8429326271465132299L * this.at;
         int var8 = var3;
         int var9;
         if (this.at * 8429326271465132299L >= this.ac * 8734338143670189311L && 8429326271465132299L * this.at < 8734338143670189311L * this.ac + (long)(-1691135521 * this.au)) {
            var9 = (int)((long)(-1691135521 * this.au) - (this.at * 8429326271465132299L - this.ac * 8734338143670189311L));
            if (var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.aw, (int)(8429326271465132299L * this.at - 8734338143670189311L * this.ac), var1, var2, var9);
            this.at += -6181027881899576669L * (long)var9;
            var2 += var9;
            var3 -= var9;
         }

         if (var3 > this.aw.length) {
            this.an.seek(this.at * 8429326271465132299L);

            for(this.ao = -140630493748753059L * this.at; var3 > 0; var3 -= var9) {
               var9 = this.an.read(var1, var2, var3);
               if (-1 == var9) {
                  break;
               }

               this.ao += -9042087461339190217L * (long)var9;
               this.at += (long)var9 * -6181027881899576669L;
               var2 += var9;
            }
         } else if (var3 > 0) {
            this.load();
            var9 = var3;
            if (var3 > this.au * -1691135521) {
               var9 = -1691135521 * this.au;
            }

            System.arraycopy(this.aw, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.at += (long)var9 * -6181027881899576669L;
         }

         if (this.aq * -8462239109085136939L != -1L) {
            if (-8462239109085136939L * this.aq > this.at * 8429326271465132299L && var3 > 0) {
               var9 = (int)(-8462239109085136939L * this.aq - this.at * 8429326271465132299L) + var2;
               if (var9 > var3 + var2) {
                  var9 = var3 + var2;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  this.at += -6181027881899576669L;
               }
            }

            long var15 = -1L;
            long var11 = -1L;
            if (this.aq * -8462239109085136939L >= var5 && -8462239109085136939L * this.aq < var5 + (long)var8) {
               var15 = this.aq * -8462239109085136939L;
            } else if (var5 >= -8462239109085136939L * this.aq && var5 < this.aq * -8462239109085136939L + (long)(this.al * -654786411)) {
               var15 = var5;
            }

            if (-8462239109085136939L * this.aq + (long)(this.al * -654786411) > var5 && (long)(-654786411 * this.al) + -8462239109085136939L * this.aq <= (long)var8 + var5) {
               var11 = this.aq * -8462239109085136939L + (long)(this.al * -654786411);
            } else if (var5 + (long)var8 > this.aq * -8462239109085136939L && var5 + (long)var8 <= (long)(this.al * -654786411) + this.aq * -8462239109085136939L) {
               var11 = var5 + (long)var8;
            }

            if (var15 > -1L && var11 > var15) {
               int var13 = (int)(var11 - var15);
               System.arraycopy(this.ab, (int)(var15 - -8462239109085136939L * this.aq), var1, (int)(var15 - var5) + var2, var13);
               if (var11 > this.at * 8429326271465132299L) {
                  var3 = (int)((long)var3 - (var11 - this.at * 8429326271465132299L));
                  this.at = var11 * -6181027881899576669L;
               }
            }
         }
      } catch (IOException var14) {
         this.ao = 9042087461339190217L;
         throw var14;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   void load() throws IOException {
      this.au = 0;
      if (this.at * 8429326271465132299L != 31144933894015367L * this.ao) {
         this.an.seek(8429326271465132299L * this.at);
         this.ao = -140630493748753059L * this.at;
      }

      int var3;
      for(this.ac = 2440797830623285237L * this.at; this.au * -1691135521 < this.aw.length; this.au += var3 * -84563425) {
         int var2 = this.aw.length - -1691135521 * this.au;
         if (var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = this.an.read(this.aw, -1691135521 * this.au, var2);
         if (var3 == -1) {
            break;
         }

         this.ao += (long)var3 * -9042087461339190217L;
      }

   }

   public void write(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (8429326271465132299L * this.at + (long)var3 > this.ay * -1243507284389482911L) {
            this.ay = -8298185492872661599L * ((long)var3 + this.at * 8429326271465132299L);
         }

         if (this.aq * -8462239109085136939L != -1L && (8429326271465132299L * this.at < this.aq * -8462239109085136939L || 8429326271465132299L * this.at > this.aq * -8462239109085136939L + (long)(-654786411 * this.al))) {
            this.flush();
         }

         if (-8462239109085136939L * this.aq != -1L && (long)var3 + 8429326271465132299L * this.at > -8462239109085136939L * this.aq + (long)this.ab.length) {
            int var5 = (int)((long)this.ab.length - (8429326271465132299L * this.at - this.aq * -8462239109085136939L));
            System.arraycopy(var1, var2, this.ab, (int)(this.at * 8429326271465132299L - this.aq * -8462239109085136939L), var5);
            this.at += (long)var5 * -6181027881899576669L;
            var2 += var5;
            var3 -= var5;
            this.al = -1669068099 * this.ab.length;
            this.flush();
         }

         if (var3 <= this.ab.length) {
            if (var3 > 0) {
               if (-1L == this.aq * -8462239109085136939L) {
                  this.aq = 2422695430762542431L * this.at;
               }

               System.arraycopy(var1, var2, this.ab, (int)(8429326271465132299L * this.at - -8462239109085136939L * this.aq), var3);
               this.at += (long)var3 * -6181027881899576669L;
               if (this.at * 8429326271465132299L - this.aq * -8462239109085136939L > (long)(this.al * -654786411)) {
                  this.al = (int)(this.at * 8429326271465132299L - -8462239109085136939L * this.aq) * -1669068099;
               }

            }
         } else {
            if (31144933894015367L * this.ao != 8429326271465132299L * this.at) {
               this.an.seek(8429326271465132299L * this.at);
               this.ao = -140630493748753059L * this.at;
            }

            this.an.write(var1, var2, var3);
            this.ao += (long)var3 * -9042087461339190217L;
            if (this.ao * 31144933894015367L > 3127984517526915633L * this.aa) {
               this.aa = this.ao * 5080559548865145143L;
            }

            long var11 = -1L;
            long var7 = -1L;
            if (8429326271465132299L * this.at >= this.ac * 8734338143670189311L && 8429326271465132299L * this.at < (long)(this.au * -1691135521) + this.ac * 8734338143670189311L) {
               var11 = this.at * 8429326271465132299L;
            } else if (8734338143670189311L * this.ac >= this.at * 8429326271465132299L && 8734338143670189311L * this.ac < (long)var3 + 8429326271465132299L * this.at) {
               var11 = this.ac * 8734338143670189311L;
            }

            if (this.at * 8429326271465132299L + (long)var3 > 8734338143670189311L * this.ac && (long)var3 + 8429326271465132299L * this.at <= (long)(-1691135521 * this.au) + this.ac * 8734338143670189311L) {
               var7 = this.at * 8429326271465132299L + (long)var3;
            } else if ((long)(-1691135521 * this.au) + this.ac * 8734338143670189311L > 8429326271465132299L * this.at && this.ac * 8734338143670189311L + (long)(this.au * -1691135521) <= 8429326271465132299L * this.at + (long)var3) {
               var7 = this.ac * 8734338143670189311L + (long)(this.au * -1691135521);
            }

            if (var11 > -1L && var7 > var11) {
               int var9 = (int)(var7 - var11);
               System.arraycopy(var1, (int)((long)var2 + var11 - 8429326271465132299L * this.at), this.aw, (int)(var11 - 8734338143670189311L * this.ac), var9);
            }

            this.at += (long)var3 * -6181027881899576669L;
         }
      } catch (IOException var10) {
         this.ao = 9042087461339190217L;
         throw var10;
      }
   }

   void flush() throws IOException {
      if (-8462239109085136939L * this.aq != -1L) {
         if (this.ao * 31144933894015367L != this.aq * -8462239109085136939L) {
            this.an.seek(this.aq * -8462239109085136939L);
            this.ao = 7312697603599620803L * this.aq;
         }

         this.an.write(this.ab, 0, this.al * -654786411);
         this.ao += -9056128312498455549L * (long)this.al;
         if (this.ao * 31144933894015367L > 3127984517526915633L * this.aa) {
            this.aa = this.ao * 5080559548865145143L;
         }

         long var2 = -1L;
         long var4 = -1L;
         if (this.aq * -8462239109085136939L >= this.ac * 8734338143670189311L && -8462239109085136939L * this.aq < (long)(-1691135521 * this.au) + 8734338143670189311L * this.ac) {
            var2 = -8462239109085136939L * this.aq;
         } else if (8734338143670189311L * this.ac >= this.aq * -8462239109085136939L && 8734338143670189311L * this.ac < (long)(-654786411 * this.al) + this.aq * -8462239109085136939L) {
            var2 = 8734338143670189311L * this.ac;
         }

         if (this.aq * -8462239109085136939L + (long)(-654786411 * this.al) > 8734338143670189311L * this.ac && (long)(-654786411 * this.al) + this.aq * -8462239109085136939L <= (long)(-1691135521 * this.au) + this.ac * 8734338143670189311L) {
            var4 = this.aq * -8462239109085136939L + (long)(this.al * -654786411);
         } else if (8734338143670189311L * this.ac + (long)(-1691135521 * this.au) > this.aq * -8462239109085136939L && (long)(-1691135521 * this.au) + 8734338143670189311L * this.ac <= -8462239109085136939L * this.aq + (long)(-654786411 * this.al)) {
            var4 = (long)(this.au * -1691135521) + this.ac * 8734338143670189311L;
         }

         if (var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.ab, (int)(var2 - this.aq * -8462239109085136939L), this.aw, (int)(var2 - this.ac * 8734338143670189311L), var6);
         }

         this.aq = -699769937149266301L;
         this.al = 0;
      }

   }
}
