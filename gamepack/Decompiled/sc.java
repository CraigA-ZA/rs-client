public class sc {
   static final int ac = (int)(Math.pow(2.0, 8.0) - 1.0) * 998296027;
   static final int aw = (int)(Math.pow(2.0, 4.0) - 1.0) * 1010976615;

   sc() throws Throwable {
      throw new Error();
   }

   public static Sprite readSprite(AbstractArchive var0, int var1, int var2) {
      byte[] var5 = var0.takeFile(var1, var2);
      boolean var4;
      if (var5 == null) {
         var4 = false;
      } else {
         sb.aa_renamed(var5);
         var4 = true;
      }

      return !var4 ? null : gx.at_renamed();
   }
}
