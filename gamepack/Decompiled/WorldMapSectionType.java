public class WorldMapSectionType implements Enumerated {
   static int ky;
   static final WorldMapSectionType an = new WorldMapSectionType(0, (byte)1);
   static final WorldMapSectionType aw = new WorldMapSectionType(3, (byte)2);
   static final WorldMapSectionType ac = new WorldMapSectionType(2, (byte)3);
   final int type;
   static final WorldMapSectionType af = new WorldMapSectionType(1, (byte)0);
   static Decimator decimator;
   public static String osNameLowerCase;
   final byte id;
   static boolean ds;
   static int ow;

   WorldMapSectionType(int var1, byte var2) {
      this.type = var1 * 1161531339;
      this.id = var2;
   }

   static char aw_renamed(char var0) {
      return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }

   static WorldMapSectionType[] au_renamed() {
      return new WorldMapSectionType[]{an, aw, ac, af};
   }

   public int af() {
      return this.id;
   }

   public static String af_renamed(byte[] var0) {
      return fw.an_renamed(var0, 0, var0.length);
   }

   public static boolean an_renamed(CharSequence var0) {
      return UrlRequester.aw_renamed(var0, 10, true);
   }
}
