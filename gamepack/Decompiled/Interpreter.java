import java.util.ArrayList;
import java.util.Calendar;

public class Interpreter {
   static boolean ak = false;
   static boolean az = false;
   static ClientScriptFrame[] Interpreter_frames = new ClientScriptFrame[50];
   static int ae = 0;
   static int Interpreter_frameDepth = 0;
   static int Interpreter_intStackSize;
   static int[] Interpreter_arrayLengths = new int[5];
   static int[] Interpreter_intLocals;
   static int[] Interpreter_intStack = new int[1000];
   static int[][] Interpreter_arrays = new int[5][5000];
   static String[] Interpreter_stringStack = new String[1000];
   static String[] Interpreter_stringLocals;
   static ArrayList ad = new ArrayList();
   static Calendar Interpreter_calendar = Calendar.getInstance();
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
      return 285408389 * World.aq < World.worldsCount * -734287707 ? bx.worlds[(World.aq += -1658479539) * 285408389 - 1] : null;
   }
}
