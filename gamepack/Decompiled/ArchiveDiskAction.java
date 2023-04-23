public class ArchiveDiskAction extends Node {
   int type;
   public byte[] data;
   public Archive archive;
   public ArchiveDisk archiveDisk;

   ArchiveDiskAction() {
   }

   static dt[] au_renamed() {
      return new dt[]{dt.an, dt.ab, dt.aw, dt.af, dt.au, dt.ac};
   }

   static final String ly_renamed(int var0) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + Formatting.Formatting_comma + var2.substring(var3);
      }

      if (var2.length() > 9) {
         return " " + oa.colorStartTag(65408) + var2.substring(0, var2.length() - 8) + Strings.gb + " " + Formatting.Formatting_spaceLeftParenthesis + var2 + Formatting.Formatting_rightParenthesis + Formatting.Formatting_colorEndTag;
      } else {
         return var2.length() > 6 ? " " + oa.colorStartTag(16777215) + var2.substring(0, var2.length() - 4) + Strings.gn + " " + Formatting.Formatting_spaceLeftParenthesis + var2 + Formatting.Formatting_rightParenthesis + Formatting.Formatting_colorEndTag : " " + oa.colorStartTag(16776960) + var2 + Formatting.Formatting_colorEndTag;
      }
   }
}
