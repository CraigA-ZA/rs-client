import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@lj
public final class lu {
   static final int aq = 4;
   static final int ah = 13;
   static final HashMap aw = new HashMap();
   public static final int af = 11745;
   public static final long an = 86400000L;
   static tc ab;

   static {
      Calendar.getInstance(af("Europe/London", -1017888567));
   }

   static TimeZone af(String var0, int var1) {
      try {
         synchronized(aw) {
            TimeZone var3 = (TimeZone)aw.get(var0);
            if (null == var3) {
               if (var1 == -1848743379) {
                  throw new IllegalStateException();
               }

               var3 = TimeZone.getTimeZone(var0);
               aw.put(var0, var3);
            }

            return var3;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "lu.af(" + ')');
      }
   }

   lu() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "lu.<init>(" + ')');
      }
   }

   public static boolean af(int var0, int var1) {
      try {
         boolean var10000;
         if (10 != var0) {
            if (var1 != -964267539) {
               throw new IllegalStateException();
            }

            if (var0 != 11) {
               if (var1 != -964267539) {
                  throw new IllegalStateException();
               }

               if (var0 != 12) {
                  if (var1 != -964267539) {
                     throw new IllegalStateException();
                  }

                  if (13 != var0) {
                     if (var1 != -964267539) {
                        throw new IllegalStateException();
                     }

                     if (var0 != 14) {
                        if (var1 != -964267539) {
                           throw new IllegalStateException();
                        }

                        if (15 != var0) {
                           if (var1 != -964267539) {
                              throw new IllegalStateException();
                           }

                           if (16 != var0) {
                              if (17 != var0) {
                                 var10000 = false;
                                 return var10000;
                              }

                              if (var1 != -964267539) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "lu.af(" + ')');
      }
   }

   static TimeZone aw(String var0) {
      synchronized(aw) {
         TimeZone var2 = (TimeZone)aw.get(var0);
         if (null == var2) {
            var2 = TimeZone.getTimeZone(var0);
            aw.put(var0, var2);
         }

         return var2;
      }
   }

   static TimeZone an(String var0) {
      synchronized(aw) {
         TimeZone var2 = (TimeZone)aw.get(var0);
         if (null == var2) {
            var2 = TimeZone.getTimeZone(var0);
            aw.put(var0, var2);
         }

         return var2;
      }
   }
}
