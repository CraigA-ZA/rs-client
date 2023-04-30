import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ma {
   static final int au = 4;
   static final String[] an = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   static Calendar aw;
   static final String[][] af = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};

   static {
      Calendar.getInstance();
      aw = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

   ma() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ma.<init>(" + ')');
      }
   }

   public static String an(long var0) {
      aw.setTime(new Date(var0));
      int var2 = aw.get(7);
      int var3 = aw.get(5);
      int var4 = aw.get(2);
      int var5 = aw.get(1);
      int var6 = aw.get(11);
      int var7 = aw.get(12);
      int var8 = aw.get(13);
      return an[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + af[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }
}
