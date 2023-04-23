public class ArchiveDiskAction extends Node {
   int af;
   public byte[] an;
   public Archive ac;
   public ArchiveDisk aw;

   ArchiveDiskAction() {
   }

   static dt[] au_renamed() {
      return new dt[]{dt.an, dt.ab, dt.aw, dt.af, dt.au, dt.ac};
   }

   static final String ly_renamed(int var0) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + Formatting.an + var2.substring(var3);
      }

      if (var2.length() > 9) {
         return " " + oa.colorStartTag(65408) + var2.substring(0, var2.length() - 8) + Strings.gb + " " + Formatting.ac + var2 + Formatting.au + Formatting.al;
      } else {
         return var2.length() > 6 ? " " + oa.colorStartTag(16777215) + var2.substring(0, var2.length() - 4) + Strings.gn + " " + Formatting.ac + var2 + Formatting.au + Formatting.al : " " + oa.colorStartTag(16776960) + var2 + Formatting.al;
      }
   }
}
