public class ly {
   public static SoundCache soundCache;
   public static int au = 0;
   public static AbstractArchive ab;
   public static AbstractArchive af;
   public static AbstractArchive an;
   public static AbstractArchive aw;
   static int cameraZ;

   ly() throws Throwable {
      throw new Error();
   }

   static int compareWorlds(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var5 = -1396846889 * var0.population;
         int var6 = -1396846889 * var1.population;
         if (!var3) {
            if (-1 == var5) {
               var5 = 2001;
            }

            if (var6 == -1) {
               var6 = 2001;
            }
         }

         return var5 - var6;
      } else if (var2 == 2) {
         return -665846519 * var0.location - -665846519 * var1.location;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (4 == var2) {
         return var0.ax() ? (var1.ax() ? 0 : 1) : (var1.ax() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.ay() ? (var1.ay() ? 0 : 1) : (var1.ay() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.ao() ? (var1.ao() ? 0 : 1) : (var1.ao() ? -1 : 0);
      } else if (7 == var2) {
         return var0.at() ? (var1.at() ? 0 : 1) : (var1.at() ? -1 : 0);
      } else {
         return -2091224171 * var0.id - var1.id * -2091224171;
      }
   }
}
