import accessors.RSVarps;

public class le implements RSVarps {
   static final int bv = 25;
   public static int[] an;
   public static int[] aw;
   static int[] af = new int[32];
   static final int al = 1;
   public static final String kq = "";

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         af[var1] = var0 - 1;
         var0 += var0;
      }

      an = new int[4000];
      aw = new int[4000];
   }

   public static int aw(int var0) {
      hg var1 = gs.an(var0, -1252299527);
      int var2 = var1.aw * 1485566275;
      int var3 = 605529213 * var1.ac;
      int var4 = var1.au * 1496992080;
      int var5 = af[var4 - var3];
      return aw[var2] >> var3 & var5;
   }

   public static void al(int var0, int var1) {
      hg var2 = gs.an(var0, -581649418);
      int var3 = 470400793 * var2.aw;
      int var4 = var2.ac * -1787622558;
      int var5 = var2.au * 1130237503;
      int var6 = af[var5 - var4];
      if (var1 < 0 || var1 > var6) {
         var1 = 0;
      }

      var6 <<= var4;
      aw[var3] = aw[var3] & ~var6 | var1 << var4 & var6;
   }

   public static int ac(int var0) {
      hg var1 = gs.an(var0, -184695974);
      int var2 = var1.aw * 470400793;
      int var3 = 1050888611 * var1.ac;
      int var4 = var1.au * 1130237503;
      int var5 = af[var4 - var3];
      return aw[var2] >> var3 & var5;
   }

   public static int au(int var0) {
      hg var1 = gs.an(var0, -1929472797);
      int var2 = var1.aw * 470400793;
      int var3 = -1163997464 * var1.ac;
      int var4 = var1.au * 125426879;
      int var5 = af[var4 - var3];
      return aw[var2] >> var3 & var5;
   }

   public static int ab(int var0) {
      hg var1 = gs.an(var0, -584545982);
      int var2 = var1.aw * 470400793;
      int var3 = 1050888611 * var1.ac;
      int var4 = var1.au * 1130237503;
      int var5 = af[var4 - var3];
      return aw[var2] >> var3 & var5;
   }

   public static void aq(int var0, int var1) {
      hg var2 = gs.an(var0, -430244285);
      int var3 = 470400793 * var2.aw;
      int var4 = var2.ac * 1050888611;
      int var5 = var2.au * 1130237503;
      int var6 = af[var5 - var4];
      if (var1 < 0 || var1 > var6) {
         var1 = 0;
      }

      var6 <<= var4;
      aw[var3] = aw[var3] & ~var6 | var1 << var4 & var6;
   }

   le() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "le.<init>(" + ')');
      }
   }
}
