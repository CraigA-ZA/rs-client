import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class AccessFile {
   RandomAccessFile af;
   long aw;
   final long an;

   public AccessFile(File var1, String var2, long var3) throws IOException {
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
   }

   final void seek(long var1) throws IOException {
      this.af.seek(var1);
      this.aw = 1783873278372083011L * var1;
   }

   public final void write(byte[] var1, int var2, int var3) throws IOException {
      if (this.aw * 8269603235961323371L + (long)var3 > -5454619620217714299L * this.an) {
         this.af.seek(this.an * -5454619620217714299L);
         this.af.write(1);
         throw new EOFException();
      } else {
         this.af.write(var1, var2, var3);
         this.aw += (long)var3 * 1783873278372083011L;
      }
   }

   public final void close() throws IOException {
      this.closeSync(false);
   }

   public final void closeSync(boolean var1) throws IOException {
      if (this.af != null) {
         if (var1) {
            try {
               this.af.getFD().sync();
            } catch (SyncFailedException var4) {
            }
         }

         this.af.close();
         this.af = null;
      }

   }

   public final long length() throws IOException {
      return this.af.length();
   }

   public final int read(byte[] var1, int var2, int var3) throws IOException {
      int var5 = this.af.read(var1, var2, var3);
      if (var5 > 0) {
         this.aw += 1783873278372083011L * (long)var5;
      }

      return var5;
   }

   protected void finalize() throws Throwable {
      if (this.af != null) {
         System.out.println("");
         this.close();
      }

   }
}
