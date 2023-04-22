import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@lj
public final class lu {
   static final HashMap aw = new HashMap();
   static IndexedSprite ab;

   static {
      Calendar.getInstance(af_renamed("Europe/London"));
   }

   static TimeZone af_renamed(String var0) {
      synchronized(aw) {
         TimeZone var3 = (TimeZone)aw.get(var0);
         if (null == var3) {
            var3 = TimeZone.getTimeZone(var0);
            aw.put(var0, var3);
         }

         return var3;
      }
   }

   lu() throws Throwable {
      throw new Error();
   }

   public static boolean af_renamed(int var0) {
      return 10 == var0 || var0 == 11 || var0 == 12 || 13 == var0 || var0 == 14 || 15 == var0 || 16 == var0 || 17 == var0;
   }
}
