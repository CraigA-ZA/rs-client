import java.io.IOException;

public abstract class gn {
   // $FF: synthetic field
   final gy this$0;
   static final int aw = 1;
   String ac;
   static final byte bb = 126;
   static final int ad = 26;
   public static final int an = 0;

   public abstract int ac();

   public String ao(byte var1) {
      try {
         return this.ac;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gn.ao(" + ')');
      }
   }

   public abstract int af(byte var1);

   public int al(int var1) {
      try {
         return -1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gn.al(" + ')');
      }
   }

   public int ay() {
      return -1;
   }

   public abstract int aw();

   gn(gy var1, String var2) {
      try {
         this.this$0 = var1;
         super();
         this.ac = var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "gn.<init>(" + ')');
      }
   }

   public String aq() {
      return null;
   }

   public String ab() {
      return null;
   }

   public abstract int au();

   public int at() {
      return -1;
   }

   public int aa() {
      return -1;
   }

   public String an(byte var1) {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gn.an(" + ')');
      }
   }

   public static void an(boolean var0, int var1) {
      try {
         if (null == nl.af) {
            if (var1 <= 901407888) {
               throw new IllegalStateException();
            }
         } else {
            try {
               sg var2 = new sg(4);
               byte var10001;
               if (var0) {
                  if (var1 <= 901407888) {
                     throw new IllegalStateException();
                  }

                  var10001 = 2;
               } else {
                  var10001 = 3;
               }

               var2.bu(var10001, (byte)83);
               var2.bq(0, 677397190);
               nl.af.ab(var2.al, 0, 4, -2115422184);
            } catch (IOException var5) {
               try {
                  nl.af.aq(1813299129);
               } catch (Exception var4) {
               }

               nl.ap += -161323731;
               nl.af = null;
            }

         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "gn.an(" + ')');
      }
   }
}
