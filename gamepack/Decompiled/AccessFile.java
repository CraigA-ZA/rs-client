import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class AccessFile {
   RandomAccessFile file;
   long index;
   final long capacity;

   public AccessFile(File var1, String var2, long var3) throws IOException {
      if (var3 == -1L) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() > var3) {
         var1.delete();
      }

      this.file = new RandomAccessFile(var1, var2);
      this.capacity = var3 * 689358929283286861L;
      this.index = 0L;
      int var5 = this.file.read();
      if (-1 != var5 && !var2.equals("r")) {
         this.file.seek(0L);
         this.file.write(var5);
      }

      this.file.seek(0L);
   }

   final void seek(long var1) throws IOException {
      this.file.seek(var1);
      this.index = 1783873278372083011L * var1;
   }

   public final void write(byte[] var1, int var2, int var3) throws IOException {
      if (this.index * 8269603235961323371L + (long)var3 > -5454619620217714299L * this.capacity) {
         this.file.seek(this.capacity * -5454619620217714299L);
         this.file.write(1);
         throw new EOFException();
      } else {
         this.file.write(var1, var2, var3);
         this.index += (long)var3 * 1783873278372083011L;
      }
   }

   public final void close() throws IOException {
      this.closeSync(false);
   }

   public final void closeSync(boolean var1) throws IOException {
      if (this.file != null) {
         if (var1) {
            try {
               this.file.getFD().sync();
            } catch (SyncFailedException var4) {
            }
         }

         this.file.close();
         this.file = null;
      }

   }

   public final long length() throws IOException {
      return this.file.length();
   }

   public final int read(byte[] var1, int var2, int var3) throws IOException {
      int var5 = this.file.read(var1, var2, var3);
      if (var5 > 0) {
         this.index += 1783873278372083011L * (long)var5;
      }

      return var5;
   }

   protected void finalize() throws Throwable {
      if (this.file != null) {
         System.out.println("");
         this.close();
      }

   }
}
