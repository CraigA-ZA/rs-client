import java.util.HashMap;

public class nv {
   static Fonts fonts;

   static final void closeInterface(InterfaceParent var0, boolean var1) {
      int var3 = 944864121 * var0.af;
      int var4 = (int)var0.hr;
      var0.ga();
      if (var1 && -1 != var3 && kt.loadedInterfaces[var3]) {
         eb.Component_archive.cl(var3);
         if (hn.interfaceComponents[var3] != null) {
            for(int var5 = 0; var5 < hn.interfaceComponents[var3].length; ++var5) {
               if (hn.interfaceComponents[var3][var5] != null) {
                  hn.interfaceComponents[var3][var5] = null;
               }
            }

            hn.interfaceComponents[var3] = null;
            kt.loadedInterfaces[var3] = false;
         }
      }

      for(IntegerNode var6 = (IntegerNode)Client.componentClickMasks.first(); var6 != null; var6 = (IntegerNode)Client.componentClickMasks.next()) {
         if ((var6.hr >> 48 & 65535L) == (long)var3) {
            var6.ga();
         }
      }

      Component var7 = gh.an_renamed(var4);
      if (null != var7) {
         fw.ma_renamed(var7);
      }

      if (-896157613 * Client.or != -1) {
         ec.mu_renamed(-896157613 * Client.or, 1);
      }

   }

   static {
      new HashMap();
   }

   nv() throws Throwable {
      throw new Error();
   }
}
