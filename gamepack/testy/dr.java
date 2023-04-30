import accessors.RSClientScriptEvent;

public class dr extends rp implements RSClientScriptEvent {
   boolean an;
   int at;
   static int uw;
   int ac;
   int au;
   int ab;
   mq aq;
   int al;
   mq aw;
   String aa;
   int ay;
   int ao = -1484849228;
   Object[] af;
   static nm be;

   static Object cn(int var0, int var1) {
      try {
         return nx.cc((sh)ht.af(sh.au(-2017312753), var0, (short)173), (byte)90);
      } catch (RuntimeException var2) {
         throw db.an(var2, "dr.cn(" + ')');
      }
   }

   public void af(Object[] var1, int var2) {
      try {
         this.af = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dr.af(" + ')');
      }
   }

   public void au(int var1) {
      this.ao = 941178879 * var1;
   }

   public void aw(mq var1, byte var2) {
      try {
         this.aw = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dr.aw(" + ')');
      }
   }

   public void ac(Object[] var1) {
      this.af = var1;
   }

   public static boolean ac(int var0, int var1) {
      try {
         boolean var10000;
         if (0 != (var0 >> 21 & 1)) {
            if (var1 >= 1590591885) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dr.ac(" + ')');
      }
   }

   public void ab(int var1) {
      this.ao = -1679334575 * var1;
   }

   public void aq(int var1) {
      this.ao = 941178879 * var1;
   }

   public void al(mq var1) {
      this.aw = var1;
   }

   public void at(mq var1) {
      this.aw = var1;
   }

   public void an(int var1, int var2) {
      try {
         this.ao = 941178879 * var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dr.an(" + ')');
      }
   }
}
