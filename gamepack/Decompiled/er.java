public class er extends AbstractUserComparator {
   final boolean af;

   public er(boolean var1) {
      this.af = var1;
   }

   int af(Buddy var1, Buddy var2) {
      if (var1.rank * 1922414955 != 1922414955 * var2.rank) {
         return this.af ? var1.rank * 1922414955 - 1922414955 * var2.rank : var2.rank * 1922414955 - var1.rank * 1922414955;
      } else {
         return this.ao(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.af((Buddy)var1, (Buddy)var2);
   }

   public static void af_renamed(AbstractArchive var0, AbstractArchive var1) {
      SpotType.SpotType_archive = var0;
      SpotType.an = var1;
   }

   static long af_renamed(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   static int aa_renamed(int var0) {
      Message var2 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return Messages.Messages_queue.sentinel == var2.nextDual ? -1 : -1117255211 * ((Message)var2.nextDual).count;
      }
   }

   public static String ao_renamed(String var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];
      byte var4 = 2;

      for(int var5 = 0; var5 < var2; ++var5) {
         char var6 = var0.charAt(var5);
         if (0 == var4) {
            var6 = Character.toLowerCase(var6);
         } else if (var4 == 2 || Character.isUpperCase(var6)) {
            var6 = WorldMapSectionType.aw_renamed(var6);
         }

         if (Character.isLetter(var6)) {
            var4 = 0;
         } else if (var6 != '.' && '?' != var6 && var6 != '!') {
            if (Character.isSpaceChar(var6)) {
               if (var4 != 2) {
                  var4 = 1;
               }
            } else {
               var4 = 1;
            }
         } else {
            var4 = 2;
         }

         var3[var5] = var6;
      }

      return new String(var3);
   }

   public static int ah_renamed(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }
}
