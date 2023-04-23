import java.io.File;
import java.io.IOException;

public class Rasterizer3D {
   public static int[] ac = new int[2048];
   public static int[] af = new int[65536];
   public static int[] au = new int[2048];
   public static jg ab;
   static ii aq;
   static int ai;
   static int[] an = new int[512];
   static int[] aw = new int[2048];
   static final ii al;
   static final ii at;

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         an[var0] = '耀' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         aw[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         ac[var0] = (int)(65536.0 * Math.sin(0.0030679615 * (double)var0));
         au[var0] = (int)(65536.0 * Math.cos(0.0030679615 * (double)var0));
      }

      ab = new jg();
      al = new ji(ab);
      at = new jx(ab);
      aq = al;
   }

   Rasterizer3D() throws Throwable {
      throw new Error();
   }

   public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
      File var4 = new File(my.au, "preferences" + var0 + ".dat");
      if (var4.exists()) {
         try {
            AccessFile var11 = new AccessFile(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
         }
      }

      String var5 = "";
      if (33 == -1325133847 * gc.ah) {
         var5 = "_rc";
      } else if (34 == -1325133847 * gc.ah) {
         var5 = "_wip";
      }

      File var6 = new File(hd.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      AccessFile var7;
      if (!var2 && var6.exists()) {
         try {
            var7 = new AccessFile(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
         }
      }

      try {
         var7 = new AccessFile(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }

   static int ar_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4 = var2 ? SoundSystem.ag : an.ai;
      if (var0 == 1800) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = hc.af_renamed(KeyHandler.getComponentClickMask(var4));
         return 1;
      } else if (var0 != 1801) {
         if (1802 == var0) {
            if (null == var4.opbase) {
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4.opbase;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         --var5;
         if (null != var4.ops && var5 < var4.ops.length && var4.ops[var5] != null) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4.ops[var5];
         } else {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
         }

         return 1;
      }
   }
}
