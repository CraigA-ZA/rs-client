public class WorldMapSectionType implements Enumerated {
   public static String aj;
   static boolean ds;
   static Decimator tj;
   static int ky;
   static int ow;
   static final WorldMapSectionType ac = new WorldMapSectionType(2, (byte)3);
   static final WorldMapSectionType af = new WorldMapSectionType(1, (byte)0);
   static final WorldMapSectionType an = new WorldMapSectionType(0, (byte)1);
   static final WorldMapSectionType aw = new WorldMapSectionType(3, (byte)2);
   final byte ab;
   final int au;

   static WorldMapSectionType[] au_renamed() {
      return new WorldMapSectionType[]{an, aw, ac, af};
   }

   WorldMapSectionType(int var1, byte var2) {
      this.au = var1 * 1161531339;
      this.ab = var2;
   }

   public int ordinal() {
      return this.ab;
   }

   public static boolean an_renamed(CharSequence var0) {
      return UrlRequester.aw_renamed(var0, 10, true);
   }

   public static String af_renamed(byte[] var0) {
      return fw.an_renamed(var0, 0, var0.length);
   }

   static char aw_renamed(char var0) {
      return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }
}
