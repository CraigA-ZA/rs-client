import accessors.RSClock;

public abstract class gv implements RSClock {
   public static final int aq = -1;
   static final int ap = 32;
   static final int sa = 100;

   public static gv aa() {
      try {
         return new gu();
      } catch (Throwable var1) {
         return new gb();
      }
   }

   public abstract int an(int var1, int var2, int var3);

   public abstract void ac();

   public abstract void aw();

   public abstract void af(int var1);

   public abstract void au();

   public abstract int ab(int var1, int var2);

   gv() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "gv.<init>(" + ')');
      }
   }

   public static gv at() {
      try {
         return new gu();
      } catch (Throwable var1) {
         return new gb();
      }
   }

   public abstract int aq(int var1, int var2);

   static final void np(int var0, int var1, boolean var2, int var3) {
      try {
         if (client.so[var0] != null) {
            if (var1 >= 0) {
               if (var3 <= 775874239) {
                  return;
               }

               if (var1 < client.so[var0].ac(-468925821)) {
                  fz var4 = (fz)client.so[var0].aw.get(var1);
                  lg var5 = mi.an(lv.dg, client.in.au, (short)-2902);
                  var5.aw.bu(4 + ct.bc(var4.aw.af(-710264960), (byte)-54), (byte)61);
                  var5.aw.bu(var0, (byte)73);
                  var5.aw.bf(var1, (byte)-71);
                  var5.aw.bp(var2, 614283261);
                  var5.aw.bh(var4.aw.af(-710264960), -1690364185);
                  client.in.aw(var5, 414135591);
                  return;
               }

               if (var3 <= 775874239) {
                  throw new IllegalStateException();
               }
            }

         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "gv.np(" + ')');
      }
   }
}
