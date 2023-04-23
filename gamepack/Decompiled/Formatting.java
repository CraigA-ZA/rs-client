public class Formatting {
   public static String[] ar;
   static int ls;
   static int qe;
   static String Formatting_rightArrow = "->";
   static String Formatting_spaceLeftParenthesis = " (";
   static String Formatting_true = "true";
   static String Formatting_colorEndTag = "</col>";
   static String Formatting_comma = ",";
   static String Formatting_lineBreakTag = "<br>";
   static String Formatting_rightParenthesis = ")";
   static String Formatting_pipe = "|";
   static Bounds bh;

   Formatting() throws Throwable {
      throw new Error();
   }

   public static final synchronized long af_renamed() {
      long var1 = System.currentTimeMillis();
      if (var1 < lk.af * 1436109859624790083L) {
         lk.an += 4531959532299302581L * (lk.af * 1436109859624790083L - var1);
      }

      lk.af = -820153132959898517L * var1;
      return var1 + 5764352098133378973L * lk.an;
   }
}
