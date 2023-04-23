import java.io.File;

public class gc {
   public static int idxCount;
   public static int ah;
   public static BufferedFile idx255File = null;
   public static BufferedFile randomDat = null;
   public static BufferedFile dat2File = null;
   static File clDat;

   gc() throws Throwable {
      throw new Error();
   }

   static final int ag_renamed(int var0, int var1, int var2, int var3) {
      int var5 = 65536 - in.au[var2 * 1024 / var3] >> 1;
      return (var0 * (65536 - var5) >> 16) + (var1 * var5 >> 16);
   }
}
