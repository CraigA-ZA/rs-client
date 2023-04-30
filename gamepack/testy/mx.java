import accessors.RSAbstractByteArrayCopier;

public abstract class mx implements RSAbstractByteArrayCopier {
   static final int aw = 104;
   public static final int ap = 32768;
   static final int ci = 69;
   protected static boolean bf;

   public static byte[] ao(Object var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if (var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if (var0 instanceof mx) {
         mx var2 = (mx)var0;
         return var2.ac(-302524425);
      } else {
         throw new IllegalArgumentException();
      }
   }

   mx() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "mx.<init>(" + ')');
      }
   }

   static byte[] ax(byte[] var0) {
      int var1 = var0.length;
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   static byte[] ai(byte[] var0) {
      int var1 = var0.length;
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   public static Object aq(byte[] var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0.length > -1960748921) {
         mp var2 = new mp();
         var2.au(var0, 1503790515);
         return var2;
      } else {
         return var1 ? fy.aw(var0, (byte)12) : var0;
      }
   }

   abstract void ar(byte[] var1);

   public static Object at(byte[] var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0.length > 136) {
         mp var2 = new mp();
         var2.au(var0, 1503790515);
         return var2;
      } else {
         return var1 ? fy.aw(var0, (byte)12) : var0;
      }
   }

   abstract void au(byte[] var1, int var2);

   public static byte[] ay(Object var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if (var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if (var0 instanceof mx) {
         mx var2 = (mx)var0;
         return var2.ac(-302524425);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static Object al(byte[] var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0.length > -2064516402) {
         mp var2 = new mp();
         var2.au(var0, 1503790515);
         return var2;
      } else {
         return var1 ? fy.aw(var0, (byte)12) : var0;
      }
   }

   abstract byte[] ac(int var1);

   public static byte[] aa(Object var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if (var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if (var0 instanceof mx) {
         mx var2 = (mx)var0;
         return var2.ac(-302524425);
      } else {
         throw new IllegalArgumentException();
      }
   }

   static byte[] ag(byte[] var0) {
      int var1 = var0.length;
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   static byte[] ah(byte[] var0) {
      int var1 = var0.length;
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   abstract byte[] av();

   public static Object ab(byte[] var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0.length > 136) {
         mp var2 = new mp();
         var2.au(var0, 1503790515);
         return var2;
      } else {
         return var1 ? fy.aw(var0, (byte)12) : var0;
      }
   }

   static ch af(int var0, int var1) {
      try {
         ch var2 = (ch)ch.af.af((long)var0);
         if (null != var2) {
            if (var1 <= 392700909) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = ey.fj.bh(var0, 0, (byte)-38);
            if (null == var3) {
               if (var1 <= 392700909) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var2 = bz.ac(var3, (byte)1);
               ch.af.aw(var2, (long)var0);
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "mx.af(" + ')');
      }
   }
}
