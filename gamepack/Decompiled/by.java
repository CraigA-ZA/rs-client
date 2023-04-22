import java.applet.Applet;
import netscape.javascript.JSObject;

public class by {
   public static void af_renamed(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   public static Object an_renamed(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   public static Object aw_renamed(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   by() throws Throwable {
      throw new Error();
   }
}
