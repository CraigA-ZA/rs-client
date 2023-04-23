import java.util.ArrayList;
import java.util.Calendar;

public class Interpreter {
   static boolean ak = false;
   static boolean az = false;
   static ClientScriptFrame[] ax = new ClientScriptFrame[50];
   static int ae = 0;
   static int ao = 0;
   static int at;
   static int[] ab = new int[5];
   static int[] ac;
   static int[] al = new int[1000];
   static int[][] aq = new int[5][5000];
   static String[] aa = new String[1000];
   static String[] au;
   static ArrayList ad = new ArrayList();
   static Calendar am = Calendar.getInstance();
   static final double bi = Math.log(2.0);
   static final String[] as = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

   public static void af_renamed(AbstractArchive var0, AbstractArchive var1, boolean var2) {
      hq.an = var0;
      go.aw = var1;
      hq.af = var2;
   }

   Interpreter() throws Throwable {
      throw new Error();
   }

   static World al_renamed() {
      return 285408389 * World.aq < World.ab * -734287707 ? bx.au[(World.aq += -1658479539) * 285408389 - 1] : null;
   }
}
