import accessors.RSAccessFile;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class sy implements RSAccessFile {
   long aw;
   final long an;
   RandomAccessFile af;

   public final void aw(byte var1) throws IOException {
      try {
         this.ac(false, (byte)10);
      } catch (RuntimeException var2) {
         throw db.an(var2, "sy.aw(" + ')');
      }
   }

   final void af(long var1) throws IOException {
      try {
         this.af.seek(var1);
         this.aw = 1783873278372083011L * var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "sy.af(" + ')');
      }
   }

   public final void ag(boolean var1) throws IOException {
      if (this.af != null) {
         if (var1) {
            try {
               this.af.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.af.close();
         this.af = null;
      }

   }

   final void aq(long var1) throws IOException {
      this.af.seek(var1);
      this.aw = 1783873278372083011L * var1;
   }

   public final void ac(boolean var1, byte var2) throws IOException {
      try {
         if (this.af != null) {
            if (var2 != 10) {
               throw new IllegalStateException();
            }

            if (var1) {
               if (var2 != 10) {
                  throw new IllegalStateException();
               }

               try {
                  this.af.getFD().sync();
               } catch (SyncFailedException var4) {
               }
            }

            this.af.close();
            this.af = null;
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "sy.ac(" + ')');
      }
   }

   public final long au(int var1) throws IOException {
      try {
         return this.af.length();
      } catch (RuntimeException var2) {
         throw db.an(var2, "sy.au(" + ')');
      }
   }

   public final int ab(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         int var5 = this.af.read(var1, var2, var3);
         if (var5 > 0) {
            if (var4 == -863394549) {
               throw new IllegalStateException();
            }

            this.aw += 1783873278372083011L * (long)var5;
         }

         return var5;
      } catch (RuntimeException var6) {
         throw db.an(var6, "sy.ab(" + ')');
      }
   }

   protected void finalize() throws Throwable {
      try {
         if (this.af != null) {
            System.out.println("");
            this.aw((byte)-85);
         }

      } catch (RuntimeException var1) {
         throw db.an(var1, "sy.finalize(" + ')');
      }
   }

   protected void aha() throws Throwable {
      if (this.af != null) {
         System.out.println("");
         this.aw((byte)-28);
      }

   }

   protected void ahc() throws Throwable {
      if (this.af != null) {
         System.out.println("");
         this.aw((byte)-9);
      }

   }

   public final int ar(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.af.read(var1, var2, var3);
      if (var4 > 0) {
         this.aw += 1783873278372083011L * (long)var4;
      }

      return var4;
   }

   final void al(long var1) throws IOException {
      this.af.seek(var1);
      this.aw = 1783873278372083011L * var1;
   }

   public final void at(byte[] var1, int var2, int var3) throws IOException {
      if (this.aw * 8269603235961323371L + (long)var3 > -5454619620217714299L * this.an) {
         this.af.seek(this.an * -5454619620217714299L);
         this.af.write(1);
         throw new EOFException();
      } else {
         this.af.write(var1, var2, var3);
         this.aw += (long)var3 * 1783873278372083011L;
      }
   }

   public final void aa(byte[] var1, int var2, int var3) throws IOException {
      if (this.aw * 8269603235961323371L + (long)var3 > -5454619620217714299L * this.an) {
         this.af.seek(this.an * -5454619620217714299L);
         this.af.write(1);
         throw new EOFException();
      } else {
         this.af.write(var1, var2, var3);
         this.aw += (long)var3 * 1783873278372083011L;
      }
   }

   public final void ay(byte[] var1, int var2, int var3) throws IOException {
      if (this.aw * 8269603235961323371L + (long)var3 > -5454619620217714299L * this.an) {
         this.af.seek(this.an * -5454619620217714299L);
         this.af.write(1);
         throw new EOFException();
      } else {
         this.af.write(var1, var2, var3);
         this.aw += (long)var3 * 1783873278372083011L;
      }
   }

   public final void ao() throws IOException {
      this.ac(false, (byte)10);
   }

   public final long ah() throws IOException {
      return this.af.length();
   }

   public final void ai(boolean var1) throws IOException {
      if (this.af != null) {
         if (var1) {
            try {
               this.af.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.af.close();
         this.af = null;
      }

   }

   public final void ax(boolean var1) throws IOException {
      if (this.af != null) {
         if (var1) {
            try {
               this.af.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.af.close();
         this.af = null;
      }

   }

   public final void an(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (this.aw * 8269603235961323371L + (long)var3 > -5454619620217714299L * this.an) {
            this.af.seek(this.an * -5454619620217714299L);
            this.af.write(1);
            throw new EOFException();
         } else {
            this.af.write(var1, var2, var3);
            this.aw += (long)var3 * 1783873278372083011L;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "sy.an(" + ')');
      }
   }

   public final int av(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.af.read(var1, var2, var3);
      if (var4 > 0) {
         this.aw += 1783873278372083011L * (long)var4;
      }

      return var4;
   }

   public sy(File var1, String var2, long var3) throws IOException {
      try {
         super();
         if (var3 == -1L) {
            var3 = Long.MAX_VALUE;
         }

         if (var1.length() > var3) {
            var1.delete();
         }

         this.af = new RandomAccessFile(var1, var2);
         this.an = var3 * 689358929283286861L;
         this.aw = 0L;
         int var5 = this.af.read();
         if (-1 != var5 && !var2.equals("r")) {
            this.af.seek(0L);
            this.af.write(var5);
         }

         this.af.seek(0L);
      } catch (RuntimeException var6) {
         throw db.an(var6, "sy.<init>(" + ')');
      }
   }
}
