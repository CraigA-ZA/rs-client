import accessors.RSIgnored;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class pi extends pw implements RSIgnored {
   static final int am = 21;
   int af;
   static final int ax = 13;

   public int au(Object var1) {
      return this.af((pi)var1, (byte)-100);
   }

   public int al(pw var1) {
      return this.af((pi)var1, (byte)-48);
   }

   public int an(pw var1, int var2) {
      try {
         return this.af((pi)var1, (byte)-26);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pi.an(" + ')');
      }
   }

   public int compareTo(Object var1) {
      try {
         return this.af((pi)var1, (byte)-21);
      } catch (RuntimeException var2) {
         throw db.an(var2, "pi.compareTo(" + ')');
      }
   }

   public int ac(Object var1) {
      return this.af((pi)var1, (byte)-20);
   }

   pi() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "pi.<init>(" + ')');
      }
   }

   public int ab(Object var1) {
      return this.af((pi)var1, (byte)-37);
   }

   public int aq(pw var1) {
      return this.af((pi)var1, (byte)-114);
   }

   int aw(pi var1) {
      return this.af * -1260376973 - var1.af * -1260376973;
   }

   public static void af(String var0, boolean var1, boolean var2, byte var3) {
      try {
         if (var1) {
            if (var3 == 16) {
               throw new IllegalStateException();
            }

            if (!var2) {
               if (var3 == 16) {
                  throw new IllegalStateException();
               }

               if (Desktop.isDesktopSupported()) {
                  if (var3 == 16) {
                     throw new IllegalStateException();
                  }

                  if (Desktop.getDesktop().isSupported(Action.BROWSE)) {
                     try {
                        Desktop.getDesktop().browse(new URI(var0));
                        return;
                     } catch (Exception var5) {
                     }
                  }
               }
            }

            if (bx.an.startsWith("win")) {
               if (var3 == 16) {
                  throw new IllegalStateException();
               }

               if (!var2) {
                  cf.an(var0, 0, -1881594254);
                  return;
               }
            }

            if (bx.an.startsWith("mac")) {
               if (var3 == 16) {
                  throw new IllegalStateException();
               }

               ia.aw(var0, 1, "openjs", -501939773);
            } else {
               ia.aw(var0, 2, "openjs", -1286411552);
            }
         } else {
            ia.aw(var0, 3, "openjs", -1501532874);
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "pi.af(" + ')');
      }
   }

   int at(pi var1) {
      return this.af * -1260376973 - var1.af * -1260376973;
   }

   int aa(pi var1) {
      return this.af * 1112765472 - var1.af * -649363884;
   }

   int af(pi var1, byte var2) {
      try {
         return this.af * -1260376973 - var1.af * -1260376973;
      } catch (RuntimeException var3) {
         throw db.an(var3, "pi.af(" + ')');
      }
   }
}
