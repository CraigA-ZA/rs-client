import java.util.zip.Inflater;

public class GzipDecompressor {
   Inflater inflater;

   public GzipDecompressor() {
      this(-1, 1000000);
   }

   GzipDecompressor(int var1, int var2) {
   }

   public void decompress(Packet var1, byte[] var2) {
      if (31 == var1.array[-1633313603 * var1.index] && -117 == var1.array[var1.index * -1633313603 + 1]) {
         if (this.inflater == null) {
            this.inflater = new Inflater(true);
         }

         try {
            this.inflater.setInput(var1.array, -1633313603 * var1.index + 10, var1.array.length - (-1633313603 * var1.index + 10 + 8));
            this.inflater.inflate(var2);
         } catch (Exception var5) {
            this.inflater.reset();
            throw new RuntimeException("");
         }

         this.inflater.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
