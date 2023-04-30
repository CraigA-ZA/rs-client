import java.util.HashMap;

public class nv {
   static final int aq = 1;
   static ra iv;
   public static final int ah = 32;
   static final int ac = 100;
   public static final int an = 2;

   static final void my(di var0, boolean var1, int var2) {
      try {
         int var3 = 944864121 * var0.af;
         int var4 = (int)var0.hr;
         var0.ga();
         if (var1) {
            if (var2 >= 1782994133) {
               throw new IllegalStateException();
            }

            if (-1 == var3) {
               if (var2 >= 1782994133) {
                  throw new IllegalStateException();
               }
            } else if (!kt.by[var3]) {
               if (var2 >= 1782994133) {
                  return;
               }
            } else {
               eb.bb.cl(var3, (byte)-93);
               if (hn.ap[var3] == null) {
                  if (var2 >= 1782994133) {
                     return;
                  }
               } else {
                  for(int var5 = 0; var5 < hn.ap[var3].length; ++var5) {
                     if (hn.ap[var3][var5] != null) {
                        if (var2 >= 1782994133) {
                           throw new IllegalStateException();
                        }

                        hn.ap[var3][var5] = null;
                     }
                  }

                  hn.ap[var3] = null;
                  kt.by[var3] = false;
               }
            }
         }

         for(rt var7 = (rt)client.rv.aw(); var7 != null; var7 = (rt)client.rv.ac()) {
            if (var2 >= 1782994133) {
               throw new IllegalStateException();
            }

            if ((var7.hr >> 48 & 65535L) == (long)var3) {
               if (var2 >= 1782994133) {
                  return;
               }

               var7.ga();
            }
         }

         mq var8 = gh.an(var4, (byte)5);
         if (null != var8) {
            if (var2 >= 1782994133) {
               throw new IllegalStateException();
            }

            fw.ma(var8, -2114818257);
         }

         if (-896157613 * client.or != -1) {
            if (var2 >= 1782994133) {
               return;
            }

            ec.mu(-896157613 * client.or, 1, (byte)63);
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "nv.my(" + ')');
      }
   }

   static {
      new HashMap();
   }

   nv() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "nv.<init>(" + ')');
      }
   }
}
