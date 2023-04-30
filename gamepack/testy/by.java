import java.applet.Applet;
import netscape.javascript.JSObject;

public class by {
   public static Object ai(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   public static void af(Applet var0, String var1, byte var2) throws Throwable {
      try {
         JSObject.getWindow(var0).eval(var1);
      } catch (RuntimeException var3) {
         throw db.an(var3, "by.af(" + ')');
      }
   }

   public static Object an(Applet var0, String var1, byte var2) throws Throwable {
      try {
         return JSObject.getWindow(var0).call(var1, (Object[])null);
      } catch (RuntimeException var3) {
         throw db.an(var3, "by.an(" + ')');
      }
   }

   public static Object aw(Applet var0, String var1, Object[] var2, int var3) throws Throwable {
      try {
         return JSObject.getWindow(var0).call(var1, var2);
      } catch (RuntimeException var4) {
         throw db.an(var4, "by.aw(" + ')');
      }
   }

   public static void ac(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   public static void al(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   by() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "by.<init>(" + ')');
      }
   }

   public static void aq(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   public static Object ao(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   public static void at(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   public static Object aa(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   public static Object ag(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   public static void ab(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   public static Object ax(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   public static Object ay(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   public static void au(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }
}
