import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class gm {
   public static boolean af = false;
   static Hashtable aw = new Hashtable(16);
   public static boolean al;
   public static final int at = 4096;
   static final int av = 65536;
   static int[] aa;

   public static File aw(String var0) {
      if (!af) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)aw.get(var0);
         if (null != var1) {
            return var1;
         } else {
            File var2 = new File(tl.an, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  aw.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if (null != var3) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var6) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   public static File ac(String var0) {
      if (!af) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)aw.get(var0);
         if (null != var1) {
            return var1;
         } else {
            File var2 = new File(tl.an, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  aw.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if (null != var3) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var6) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   public static File an(String var0) {
      if (!af) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)aw.get(var0);
         if (null != var1) {
            return var1;
         } else {
            File var2 = new File(tl.an, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  aw.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if (null != var3) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var6) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   gm() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "gm.<init>(" + ')');
      }
   }
}
