import accessors.RSWorldMapSectionType;

public class jb implements nj, RSWorldMapSectionType {
   static int ky;
   static final jb an = new jb(0, (byte)1);
   static final jb aw = new jb(3, (byte)2);
   static final jb ac = new jb(2, (byte)3);
   final int au;
   static final jb af = new jb(1, (byte)0);
   static cc tj;
   public static String aj;
   final byte ab;
   static boolean ds;
   static int ow;

   jb(int var1, byte var2) {
      try {
         super();
         this.au = var1 * 1161531339;
         this.ab = var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "jb.<init>(" + ')');
      }
   }

   public int an() {
      return this.ab;
   }

   static char aw(char var0, int var1) {
      try {
         if (var0 != 181) {
            if (var1 == -113524299) {
               throw new IllegalStateException();
            }

            if (var0 != 402) {
               return Character.toTitleCase(var0);
            }
         }

         return var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jb.aw(" + ')');
      }
   }

   static jb[] au(int var0) {
      try {
         return new jb[]{an, aw, ac, af};
      } catch (RuntimeException var1) {
         throw db.an(var1, "jb.au(" + ')');
      }
   }

   public int aw() {
      return this.ab;
   }

   public int ac() {
      return this.ab;
   }

   static jb[] ab() {
      return new jb[]{an, aw, ac, af};
   }

   static jb[] aq() {
      return new jb[]{an, aw, ac, af};
   }

   public int af(int var1) {
      try {
         return this.ab;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jb.af(" + ')');
      }
   }

   public static String af(byte[] var0, int var1) {
      try {
         return fw.an(var0, 0, var0.length, -253703196);
      } catch (RuntimeException var2) {
         throw db.an(var2, "jb.af(" + ')');
      }
   }

   public static boolean an(CharSequence var0, int var1) {
      try {
         return et.aw(var0, 10, true, (byte)46);
      } catch (RuntimeException var2) {
         throw db.an(var2, "jb.an(" + ')');
      }
   }
}
