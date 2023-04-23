import java.util.zip.Inflater;

public class GzipDecompressor {
   Inflater af;

   public GzipDecompressor() {
      this(-1, 1000000);
   }

   GzipDecompressor(int var1, int var2) {
   }

   public void decompress(Packet var1, byte[] var2) {
      if (31 == var1.al[-1633313603 * var1.at] && -117 == var1.al[var1.at * -1633313603 + 1]) {
         if (this.af == null) {
            this.af = new Inflater(true);
         }

         try {
            this.af.setInput(var1.al, -1633313603 * var1.at + 10, var1.al.length - (-1633313603 * var1.at + 10 + 8));
            this.af.inflate(var2);
         } catch (Exception var5) {
            this.af.reset();
            throw new RuntimeException("");
         }

         this.af.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
