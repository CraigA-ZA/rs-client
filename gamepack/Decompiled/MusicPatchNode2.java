public class MusicPatchNode2 {
   byte[] af;
   byte[] an;
   int ab;
   int ac;
   int al;
   int aq;
   int at;
   int au;
   int aw;

   MusicPatchNode2() {
   }

   public static IndexedSprite au_renamed(AbstractArchive var0, String var1, String var2) {
      if (!var0.cv(var1, var2)) {
         return null;
      } else {
         int var4 = var0.getGroupId(var1);
         int var5 = var0.getFileId(var4, var2);
         byte[] var8 = var0.takeFile(var4, var5);
         boolean var7;
         if (var8 == null) {
            var7 = false;
         } else {
            sb.aa_renamed(var8);
            var7 = true;
         }

         IndexedSprite var6;
         if (!var7) {
            var6 = null;
         } else {
            var6 = Strings.al_renamed();
         }

         return var6;
      }
   }
}
